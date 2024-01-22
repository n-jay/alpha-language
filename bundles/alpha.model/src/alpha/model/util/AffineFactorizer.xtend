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
	def private static outputToMatrixRow(ISLAff expression, ISLMatrix matrix, int row) {
		// Copy the parameter to a variable that can be updated.
		var updatedMatrix = matrix
		
		// Copy the coefficients for the parameters.
		val paramCount = expression.dim(ISLDimType.isl_dim_param)
		for (i : 0 ..< paramCount) {
			val coefficient = expression.getCoefficientVal(ISLDimType.isl_dim_param, i)
			updatedMatrix = updatedMatrix.setElement(row, i, coefficient)
		}
		
		// Copy the coefficients for the input variables.
		val inCount = expression.dim(ISLDimType.isl_dim_in)
		for (i : 0 ..< inCount) {
			val coefficient = expression.getCoefficientVal(ISLDimType.isl_dim_in, i)
			updatedMatrix = updatedMatrix.setElement(row, paramCount + i, coefficient)
		}
		
		// Finally, copy the constant.
		val constant = expression.constantVal
		updatedMatrix = updatedMatrix.setElement(row, paramCount + inCount, constant)
		
		return updatedMatrix
	}
	
	/**
	 * Converts an expression into a matrix of its parameters, input indexes, and constants.
	 * Throws an error if the expression uses division, as that may not work correctly.
	 */
	def static expressionToMatrix(ISLMultiAff expression) {
		if (expression.dim(ISLDimType.isl_dim_div) > 0) {
			throw new IllegalArgumentException("Affine expressions with division are not currently supported.")
		}
		
		// The matrix will have one row per output and one column per parameter or input variable,
		// plus one additional column for constants.
		val rows = expression.dim(ISLDimType.isl_dim_out)
		val cols = expression.dim(ISLDimType.isl_dim_param) + expression.dim(ISLDimType.isl_dim_in) + 1
		
		// Create a lambda that calls the function for updating a row of the matrix.
		val affs = expression.affs
		val updateRow = [ISLMatrix mat, int row | outputToMatrixRow(affs.get(row), mat, row)]
		
		// Starting with an empty matrix, update all the rows and return the final result. 
		val ctx = expression.context
		val matrix = (0 ..< rows).fold(ISLMatrix.build(ctx, rows, cols), updateRow)
		return matrix
	}
}