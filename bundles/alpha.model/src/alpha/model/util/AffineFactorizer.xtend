package alpha.model.util

import fr.irisa.cairn.jnimap.isl.ISLDimType
import fr.irisa.cairn.jnimap.isl.ISLMultiAff
import java.util.ArrayList
import java.util.Iterator
import fr.irisa.cairn.jnimap.isl.ISLMatrix
import fr.irisa.cairn.jnimap.isl.ISLAff

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
		val cols = matrix.nbCols
		val emptyRowCount = (cols >.. 0).takeWhile[col | isColEmpty(matrix, col)].size
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
}