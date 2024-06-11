package alpha.model.util

import fr.irisa.cairn.jnimap.isl.ISLAff
import fr.irisa.cairn.jnimap.isl.ISLContext
import fr.irisa.cairn.jnimap.isl.ISLDimType
import fr.irisa.cairn.jnimap.isl.ISLMatrix
import fr.irisa.cairn.jnimap.isl.ISLMultiAff
import fr.irisa.cairn.jnimap.isl.ISLSpace
import java.util.Collection
import java.util.Iterator

import static extension alpha.model.matrix.MatrixOperations.*
import static extension alpha.model.util.AffineFunctionOperations.*
import static extension alpha.model.util.CommonExtensions.*
import static extension alpha.model.util.ISLUtil.*
import static extension fr.irisa.cairn.jnimap.isl.ISLMatrix.buildFromLongMatrix

/**
 * Factorizes a set of multi-dimensional affine maps (i.e., <code>ISLMultiAff</code>).
 * The main way this class is expected to be used is by calling the <code>factorizeExpressions</code>
 * static method with a set of affine expressions.
 * This returns a key->value pair, where the key is the "common factor" that can be pulled out,
 * and the value is a dictionary mapping each of the original expressions
 * to the "remaining term" that is left after pulling out the common factor.
 * Each expression can be rewritten as the composition of the common factor and the remaining term
 * as follows: <code>remainingTerm.pullback(commonFactor)</code>
 * 
 * @see <a href="https://impact-workshop.org/papers/paper3.pdf">Reuse Analysis via Affine Factorization</a>
 */
class AffineFactorizer {

	/**
	 * Factors a set of affine expressions which have the same domain.
	 * 
	 * @param  expressions A list or array of affine multi-dimensional expressions to factor.
	 * @return A key->value pair where the key is the "common factor" and the value is a map
	 *         from each of the input expressions to the "remaining term" that is left after
	 *         pulling out the common factor. That is, the following would return true,
	 *         where <code>expr</code> is one of the input expressions and <code>result</code>
	 *         is the return value of this function:
	 *         <code>expr.isPlainEqual(result.value.get(expr).pullback(result.key.copy))</code>
	 */
	def static factorizeExpressions(ISLMultiAff... expressions) {
		// Name all the outputs from the expressions so we can track them.
		// Note: this is saved as a map from the original expression to the named one.
		val named = expressions.nameExpressionOutputs
		
		// Merge everything into one big expression, and decompose it.
		// Since we need them again later, copy the named expressions first.
		val decomposed = named.values
			.map[it.copy]
			.toList
			.mergeExpressions
			.hermiteExpressionDecomposition
		val hExpression = decomposed.key
		val qExpression = decomposed.value
		
		// Construct a map from each of the original expressions
		// to the projection of Q which is associated with it.
		// Wrap it in a HashMap to avoid recomputing values whenever they're accessed.
		val projectionMap = expressions
			.toInvertedMap[expr | getDecompositionProjection(named.get(expr), qExpression)]
			.toHashMap

		return hExpression -> projectionMap
	}


	////////////////////////////////////////////////////////////
	// Merging Expressions Into One
	////////////////////////////////////////////////////////////

	/** 
	 * Creates a copy of each input expression, but renames all the outputs so they can be tracked.
	 * Returns a map from the original expressions to the named ones.
	 */
	def static nameExpressionOutputs(ISLMultiAff... expressions) {
		val names = getNameGenerator("orig_out")
		return expressions
			.toInvertedMap[nameSingleExpressionOutputs(it, names)]
			.toHashMap
	}

	/** Generates names containing the given prefix and an incrementing value, separated by an underscore. */
	def private static getNameGenerator(String prefix) {
		return (0..Integer.MAX_VALUE)
			.map[prefix + "_" + it.toString()]
			.iterator()
	}

	/** Gives each output of the provided expression a unique name, overwriting any existing names. */
	def private static nameSingleExpressionOutputs(ISLMultiAff expression, Iterator<String> names) {
		val outCount = expression.nbOutputs
		val merged = (0 ..< outCount).fold(expression.copy, [expr, idx | expr.nameOutput(idx, names.next)])
		return merged
	}
	
	
	////////////////////////////////////////////////////////////
	// Expression to Matrix Conversion
	////////////////////////////////////////////////////////////

	/**
	 * Converts an expression into a matrix of its parameters, input indexes, and constants.
	 * The matrix is column-oriented (i.e., each affine expression is one column).
	 * Throws an error if the expression uses division, as that may not work correctly.
	 */
	def static expressionToMatrix(ISLMultiAff expression) {
		if (expression.nbDivs > 0) {
			throw new IllegalArgumentException("Affine expressions with division are not currently supported.")
		}

		// isl's HNF function expects the matrix to be column-oriented,
		// but the "toMatrix" method outputs it as row-oriented.
		// We also need to remove some columns, as the "toMatrix" method
		// adds extra rows (columns after transposing) for the parameters,
		// and we do not want these (they will cause issues).
		val matrix = expression
			.toMatrix
			.toArray
			.transpose
			.removeColumns(0 ..< expression.nbParams)
			.buildFromLongMatrix

		return matrix
	}


	////////////////////////////////////////////////////////////
	// Hermite Decomposition
	////////////////////////////////////////////////////////////
	
	/**
	 * Performs the column-oriented Hermite decomposition of the given
	 * matrix, returning H and Q as the two outputs (as a key->value pair,
	 * in that order respectively). Any columns of 0's have been dropped
	 * from the right of H, along with the same number of rows from the
	 * bottom of Q.
	 */
	def static hermiteMatrixDecomposition(ISLMatrix matrix) {
		val hermiteResult = matrix.leftHermite
		return reduceHermiteDimensionality(hermiteResult.h, hermiteResult.q)
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
	 * Returns the number of empty columns in the given matrix.
	 * Assumes that the empty rows appear only on the top of the matrix.
	 */
	def private static countEmptyCols(ISLMatrix matrix) {
		val cols = matrix.nbCols
		val emptyColCount = (cols >.. 0).takeWhile[col | isColEmpty(matrix, col)].size
		return emptyColCount
	}

	/** Checks if a column of the given matrix is empty or not. */
	def private static isColEmpty(ISLMatrix matrix, int col) {
		val rows = matrix.nbRows
		return ! (0 ..< rows).exists[row | matrix.getElement(row, col) != 0]
	}
	
	
	////////////////////////////////////////////////////////////
	// Matrix to Expression Conversion
	////////////////////////////////////////////////////////////
	
	/** Converts a matrix into an expression. Each column is for one of the output dimensions. */
	def static toExpression(ISLMatrix matrix, ISLSpace space) {
		// If there are no output dimensions, we create the expression directly,
		// as the standard approach below doesn't play nicely with isl.
		if (space.nbOutputs == 0) {
			return mapToEmptySet(space.paramNames, space.inputNames)
		}
		
		val paramNames = space.paramNames
		val inputNames = space.inputNames
		val linearOnly = matrix.nbRows == (space.nbParams + space.nbInputs)
		
		var expression =
			matrix
			.toLongMatrix
			.transpose
			.toMatrix(paramNames, inputNames, linearOnly, true)
			.toMultiAff
			
		 val outputNames = space.outputNames ?: #[]
		 for (i: 0 ..< outputNames.length) {
		 	expression = expression.nameOutput(i, outputNames.get(i))
		 }
			
		return expression
	}
	
	// Creates a map from the given parameters and inputs to the empty set.
	def private static mapToEmptySet(Collection<String> paramNames, Collection<String> inputNames) {
		return '''[«paramNames.join(",")»] -> { [«inputNames.join(",")»] -> [] }'''.toString.toISLMultiAff
	}
	
	////////////////////////////////////////////////////////////
	// Expression Decomposition
	////////////////////////////////////////////////////////////
	
	/**
	 * Decomposes an expression using the Hermite decomposition of the matrix
	 * which represents the given expression. The decomposition is returned as
	 * a key->value pair, where the key has the same domain as the original
	 * expression, and the value has the same range as the original expression.
	 * The range of the key is the same as the domain of the value.
	 */
	def static hermiteExpressionDecomposition(ISLMultiAff expression) {
		// If we don't have any outputs (which is how AlphaZ handles constants),
		// then the "decomposition" is the given expression and an empty expression.
		if (expression.nbOutputs == 0) {
			return expression -> emptyExpr(expression.context)
		}
		
		// Convert the expression into a matrix where each column is an output,
		// the first rows are for the parameters, and the last row is for constants.
		// Then, split out the parameters and constants rows
		// and factorize just the linear part.
		val fullMatrix = expression.expressionToMatrix
		val paramsRows = fullMatrix.copy.dropRows(expression.nbParams, expression.nbInputs + 1)
		val indexRows = fullMatrix.copy.dropRows(0, expression.nbParams).dropRows(expression.nbInputs, 1)
		val constantsRow = fullMatrix.dropRows(0, expression.nbParams + expression.nbInputs)
		
		val decomposed = indexRows.hermiteMatrixDecomposition
		
		// Since H is just the linear part of the common factor,
		// we need to add rows of zeros for the parameters and constants
		// so it can be reconstructed into an expression.
		val hCols = decomposed.key.nbCols
		val hMatrix = zeroMatrix(expression.nbParams, hCols)
			.concat(decomposed.key)
			.concat(zeroMatrix(1, hCols))
		
		// Since Q is just the linear part of the remaining terms,
		// we need to add in the parameters and constants from the original expression.
		val qMatrix =  paramsRows.concat(decomposed.value).concat(constantsRow)
		
		// If H has no rows (and Q has no columns), then the common factor is a map
		// from the original domain to the empty set, and the remaining term is a map
		// from the empty set to the original range.

		// Construct spaces for the decomposed expressions to reside in.
		val originalSpace = expression.space
		val spaces = originalSpace.createDecompositionSpaces(hMatrix.nbCols)
		val hSpace = spaces.key
		val qSpace = spaces.value

		// Construct and return the decomposed expressions.
		val hExpression = hMatrix.toExpression(hSpace)
		val qExpression = qMatrix.toExpression(qSpace)
		return hExpression -> qExpression
	}
	
	/** Returns an empty expression. I.e., { [] -> [] } */
	def private static emptyExpr(ISLContext context) {
		return ISLMultiAff.buildFromString(context, "{ [] -> [] }")
	}
	
	/** Returns a matrix of all zeros. */
	def private static zeroMatrix(int rows, int cols) {
		var matrix = ISLMatrix.build(ISLContext.instance, rows, cols)
		for (r : 0 ..< rows) {
			for (c : 0 ..< cols) {
				matrix = matrix.setElement(r, c, 0)
			}
		}
		return matrix
	}
	
	/**
	 * Creates the new spaces for the decomposition of the original space,
	 * returned as a key->value pair. The key has the same domain as the
	 * original space, and the value has the same range as the original space.
	 * The unspecified range/domain are the same, with a number of dimensions
	 * equal to the desired amount.
	 */
	def private static createDecompositionSpaces(ISLSpace originalSpace, int innerDimensionCount) {
		// The first space we need has the same parameters and inputs as the original
		// space, and one output per inner dimension (instead of the original outputs).
		val outputNames = AlphaUtil.defaultDimNames(innerDimensionCount)
		val ISLSpace firstSpace =
			originalSpace
			.copy
			.dropDims(ISLDimType.isl_dim_out, 0, originalSpace.nbOutputs)
			.addOutputs(outputNames)
		
		// The second space we need has the same parameters and outputs as the original
		// space, and one input per inner dimension (instead of the original inputs).
		val inputNames = AlphaUtil.defaultDimNames(innerDimensionCount)
		val ISLSpace secondSpace =
			originalSpace
			.copy
			.dropDims(ISLDimType.isl_dim_in, 0, originalSpace.nbInputs)
			.addInputs(inputNames)
			
		return firstSpace -> secondSpace
	}
	
	
	////////////////////////////////////////////////////////////
	// Reconstructing the Original Expressions
	////////////////////////////////////////////////////////////
	
	/**
	 * Returns the projection of the decomposed expression (Q)
	 * which can be used to recreate the given original expression.
	 */
	def private static getDecompositionProjection(ISLMultiAff original, ISLMultiAff q) {
		// If the range of Q is empty, then there was nothing to decompose,
		// so just return an empty expression.
		if (q.nbOutputs == 0) {
			return emptyExpr(original.context)
		}
		
		// If the range of the original is empty, then we just want
		// a map from the domain of Q to an empty set "[]".
		if (original.nbOutputs == 0) {
			val qRange = q.space.domain.toLocalSpace
			val mapToZero = ISLAff.buildZero(qRange).toMultiAff
			val outs = mapToZero.nbOutputs
			return mapToZero.dropDims(ISLDimType.isl_dim_out, 0, outs)
		}
		
		// We want to create a mapping from Q to the range of the original expression.
		// Thus, the domain of the projection is the range of Q.
		val domain = q.space.range
		
		// For each output of the original expression, get the index at which
		// that output occurs, searching by name.
		val wantedIndexes =
			original.space
			.outputNames
			.map[name | domain.findDimByName(ISLDimType.isl_dim_out, name)]

		// Construct an affine expression for each of the outputs.
		// This is done by creating a single expression for each output,
		// converting them to multi-expressions, merging them together,
		// and composing it with Q.
		val localDomain = domain.copy.toLocalSpace
		val projection = wantedIndexes
			.map[i | ISLAff.buildVarOnDomain(localDomain.copy, ISLDimType.isl_dim_out, i)]
			.map[expr | expr.toMultiAff]
			.mergeExpressions
			.pullback(q.copy)

		return projection
	}
}