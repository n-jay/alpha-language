package alpha.model.util

import java.util.ArrayList
import fr.irisa.cairn.jnimap.isl.ISLMultiAff

/**
 * Factorizes a set of multi-dimensional affine maps (i.e., <code>ISLMultiAff</code>).
 * 
 * @see <a href="https://impact-workshop.org/papers/paper3.pdf">Reuse Analysis via Affine Factorization</a>
 */
class AffineFactorizer {
	/**
	 * Merges a set of affine expressions into a single expression
	 * by performing the product 
	 */
	def static mergeExpressions(ISLMultiAff... expressions) {
		return expressions.reduce[left, right | left.flatRangeProduct(right)]
	}
}