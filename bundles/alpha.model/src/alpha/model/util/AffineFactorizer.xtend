package alpha.model.util

import fr.irisa.cairn.jnimap.isl.ISLDimType
import fr.irisa.cairn.jnimap.isl.ISLMultiAff
import java.util.ArrayList
import java.util.Iterator
import fr.irisa.cairn.jnimap.isl.ISLMatrix
import fr.irisa.cairn.jnimap.isl.ISLAff
import fr.irisa.cairn.jnimap.isl.ISLSpace

/**
 * Factorizes a set of multi-dimensional affine maps (i.e., <code>ISLMultiAff</code>).
 * 
 * @see <a href="https://impact-workshop.org/papers/paper3.pdf">Reuse Analysis via Affine Factorization</a>
 */
class AffineFactorizer {
	////////////////////////////////////////////////////////////
	// Merging Expressions Into One
	////////////////////////////////////////////////////////////

	/** Generates names containing the given prefix and an incrementing value, separated by an underscore. */
	def private static getNameGenerator(String prefix) {
		return (0..Integer.MAX_VALUE).map[prefix + "_" + it.toString()].iterator()
	}

	/** Gives each output of the provided expression a unique name, overwriting any existing names. */
	def private static nameSingleExpressionOutputs(ISLMultiAff expression, Iterator<String> names) {
		val outCount = expression.dim(ISLDimType.isl_dim_out)
		val setName = [ISLMultiAff expr, int outIndex | expr.setDimName(ISLDimType.isl_dim_out, outIndex, names.next)]
		return (0 ..< outCount).fold(expression.copy(), setName)
	}

	/** Gives each output of all the provided expressions a unique name, overwriting any existing names. */
	def static nameExpressionOutputs(ISLMultiAff... expressions) {
		val names = getNameGenerator("orig_out")
		val retVal = expressions.map[nameSingleExpressionOutputs(it, names)]

		// Wrapping the return value in an ArrayList this was (as opposed to using .toList)
		// ensures that the names are computed exactly once, as opposed to being lazily
		// re-generated every single time the objects are accessed.
		return new ArrayList<ISLMultiAff>(retVal)
	}

	/** Merges a set of affine expressions into a single expression via their flat product. */
	def static mergeExpressions(ISLMultiAff... expressions) {
		return expressions.reduce[left, right | left.flatRangeProduct(right)]
	}
	
	
	////////////////////////////////////////////////////////////
	// Decomposing the Merged Expression
	////////////////////////////////////////////////////////////
	
	/** Copies the coefficients from one expression in a multi-expression into a matrix. */
	def private static outputToMatrixCol(ISLAff expression, ISLMatrix matrix, int col) {
		// Copy the parameter to a variable that can be updated.
		var updatedMatrix = matrix
		
		// Copy the coefficients for the parameters.
		val paramCount = expression.dim(ISLDimType.isl_dim_param)
		for (i : 0 ..< paramCount) {
			val coefficient = expression.getCoefficientVal(ISLDimType.isl_dim_param, i)
			updatedMatrix = updatedMatrix.setElement(i, col, coefficient)
		}
		
		// Copy the coefficients for the input variables.
		val inCount = expression.dim(ISLDimType.isl_dim_in)
		for (i : 0 ..< inCount) {
			val coefficient = expression.getCoefficientVal(ISLDimType.isl_dim_in, i)
			updatedMatrix = updatedMatrix.setElement(paramCount + i, col, coefficient)
		}
		
		// Finally, copy the constant.
		val constant = expression.constantVal
		updatedMatrix = updatedMatrix.setElement(paramCount + inCount, col, constant)
		
		return updatedMatrix
	}

	/**
	 * Converts an expression into a matrix of its parameters, input indexes, and constants.
	 * The matrix is column-oriented (i.e., each affine expression is one column).
	 * Throws an error if the expression uses division, as that may not work correctly.
	 */
	def static expressionToMatrix(ISLMultiAff expression) {
		if (expression.dim(ISLDimType.isl_dim_div) > 0) {
			throw new IllegalArgumentException("Affine expressions with division are not currently supported.")
		}

		// The matrix will have one column per output and one row per parameter or input variable,
		// plus one additional row for constants.
		val cols = expression.dim(ISLDimType.isl_dim_out)
		val rows = expression.dim(ISLDimType.isl_dim_param) + expression.dim(ISLDimType.isl_dim_in) + 1

		// Create a lambda that calls the function for updating a row of the matrix.
		val affs = expression.affs
		val updateCol = [ISLMatrix mat, int col | outputToMatrixCol(affs.get(col), mat, col)]

		// Starting with an empty matrix, update all the rows and return the final result. 
		val ctx = expression.context
		val matrix = (0 ..< cols).fold(ISLMatrix.build(ctx, rows, cols), updateCol)
		return matrix
	}

	/** Checks if a column of the given matrix is empty or not. */
	def private static isColEmpty(ISLMatrix matrix, int col) {
		val rows = matrix.nbRows
		return ! (0 ..< rows).exists[row | matrix.getElement(row, col) != 0]
	}

	/**
	 * Returns the number of empty columns in the given matrix.
	 * Assumes that the empty rows appear only on the right of the matrix.
	 */
	def private static countEmptyCols(ISLMatrix matrix) {
		// Note: Don't check if column 0 is empty, as we never want a situation
		// where we've dropped every single column, as ISL doesn't like that.
		val cols = matrix.nbCols
		val emptyRowCount = (cols >.. 1).takeWhile[col | isColEmpty(matrix, col)].size
		return emptyRowCount
	}

	/**
	 * Reduces the dimensionality of the matrices constructed by the
	 * Hermite Normal Form calculation.
	 * This is done by dropping the columns of zeros from the right of H
	 * along with the same number of rows from the bottom of Q.
	 * This assumes that all columns of zeros are on the right of H,
	 * which matches ISL's implementation.
	 */
	def static reduceHermiteDimensionality(ISLMatrix h, ISLMatrix q) {
		val emptyCols = countEmptyCols(h)
		if (emptyCols == 0) {
			return h -> q
		}

		val firstToDrop = h.nbCols - emptyCols
		val hUpdated = h.dropCols(firstToDrop, emptyCols)
		val qUpdated = q.dropRows(firstToDrop, emptyCols)

		return hUpdated -> qUpdated
	}
	
	/**
	 * Performs the column-oriented Hermite decomposition of the given
	 * matrix, returning H and Q as the two outputs (as a key->value pair,
	 * in that order respectively). Any columns of 0's have been dropped
	 * from the right of H, along with the same number of rows from the
	 * bottom of Q.
	 */
	def static hermiteDecomposition(ISLMatrix matrix) {
		val hermiteResult = matrix.leftHermite
		return reduceHermiteDimensionality(hermiteResult.h, hermiteResult.q)
	}
	
	
	////////////////////////////////////////////////////////////
	// Constructing New Expressions from the Decomposition
	////////////////////////////////////////////////////////////
	
	/**
	 * Creates the new spaces for the decomposition of the original space,
	 * returned as a key->value pair. The key has the same domain as the
	 * original space, and the value has the same range as the original space.
	 * The unspecified range/domain are the same, with a number of dimensions
	 * equal to the desired amount.
	 */
	def private static createDecompositionSpaces(ISLSpace originalSpace, int innerDimensionCount) {
		// Get the names of the indexes for the inner dimension.
		// Note: we need at least one inner dimension,
		// otherwise we'll need to deal with null values.
		val namesToMake = (innerDimensionCount > 0) ? innerDimensionCount : 1
		val innerNames = getNameGenerator("mid").take(namesToMake).toList
		
		// ISLSpace.domain returns indexes as "out" indexes,
		// so the space needs to be reversed to make them "in" indexes.
		// Then, we need to add the specified number of dimensions as "out" dimensions.
		val ISLSpace firstSpace =
			originalSpace
			.copy
			.domain
			.reverse
			.addOutputs(innerNames)
		
		// Since the first space will handle all the parameters,
		// we need to drop them from this space, then add the
		// inner dimensions as the inputs to this space.
		val paramCount = originalSpace.dim(ISLDimType.isl_dim_param)
		val ISLSpace secondSpace =
			originalSpace
			.copy
			.range
			.dropDims(ISLDimType.isl_dim_param, 0, paramCount)
			.addInputs(innerNames)
			
		return firstSpace -> secondSpace
	}
	
	/** Converts a column of a matrix into an expression. */
	def private static columnToExpression(ISLMatrix matrix, ISLSpace space, int col) {
		// Start with a new, empty affine expression from the domain of the given space.
		// This only represents the single output being built.
		var expression = ISLAff.buildZero(space.copy.domain.toLocalSpace)

		// Populate all of the coefficients for the size parameters.
		val paramCount = space.dim(ISLDimType.isl_dim_param)
		for (i : 0 ..< paramCount) {
			val coefficient = matrix.getElementVal(i, col)
			expression = expression.setCoefficient(ISLDimType.isl_dim_param, i, coefficient)
		}
		
		// Populate all of the coefficients for the input indexes.
		val inCount = space.dim(ISLDimType.isl_dim_in)
		for (i : 0 ..< inCount) {
			val coefficient = matrix.getElementVal(paramCount + i, col)
			expression = expression.setCoefficient(ISLDimType.isl_dim_in, i, coefficient)
		}
		
		// If there is one remaining row of the matrix, then it encodes a constant.
		// In this case, populate the constant with that. Otherwise, the constant is 0.
		// Note: don't let xtend simplify expression.setConstant(constant)
		// to expression.constant = constant, as that will likely break things.
		if (matrix.nbRows > paramCount + inCount) {
			val constant = matrix.getElementVal(paramCount + inCount, col)
			expression = expression.setConstant(constant)
		} else {
			expression = expression.setConstant(0)
		}
		
		// Convert the single expression into a multi-expression,
		// and set the dimension name of this output to be the name of the output
		// from the given space associated with this column.
		val outputName = space.getDimName(ISLDimType.isl_dim_out, col)
		return expression
			.toMultiAff
			.setDimName(ISLDimType.isl_dim_out, 0, outputName ?: "None")
	}
	
	/** converts a matrix into an expression. Each column is for one of the output dimensions. */
	def private static matrixToExpression(ISLMatrix matrix, ISLSpace space) {
		return (0 ..< matrix.nbCols)
			.map[col | columnToExpression(matrix, space, col)]
			.mergeExpressions
	}
	
	/**
	 * Decomposes an expression using the Hermite decomposition of the matrix
	 * which represents the given expression. The decomposition is returned as
	 * a key->value pair, where the key has the same domain as the original
	 * expression, and the value has the same range as the original expression.
	 * The range of the key is the same as the domain of the value.
	 */
	def static decomposeExpression(ISLMultiAff expression) {
		// If we don't have any outputs (which is how AlphaZ handles constants),
		// then the "decomposition" is the given expression and an empty expression.
		if (expression.dim(ISLDimType.isl_dim_out) == 0) {
			val emptyExpr = ISLMultiAff.buildFromString(expression.context, "{ [] -> [] }")
			return expression -> emptyExpr
		}

		// Convert the expression into a matrix, then decompose that matrix.
		val decomposed = expression.expressionToMatrix.hermiteDecomposition
		val hMatrix = decomposed.key
		val qMatrix = decomposed.value

		// Construct spaces for the decomposed expressions to reside in.
		val spaces = createDecompositionSpaces(expression.space, hMatrix.nbCols)
		val hSpace = spaces.key
		val qSpace = spaces.value

		// Construct and return the decomposed expressions.
		val hExpression = matrixToExpression(hMatrix, hSpace)
		val qExpression = matrixToExpression(qMatrix, qSpace)
		return hExpression -> qExpression
	}
}