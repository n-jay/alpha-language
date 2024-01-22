package alpha.model.util

import fr.irisa.cairn.jnimap.isl.ISLDimType
import fr.irisa.cairn.jnimap.isl.ISLMultiAff
import java.util.ArrayList
import java.util.Iterator

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
}