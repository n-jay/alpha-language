package alpha.model.transformation.reduction

import alpha.model.AbstractReduceExpression
import alpha.model.AlphaSystem
import alpha.model.SystemBody
import alpha.model.factory.AlphaUserFactory
import org.eclipse.xtext.EcoreUtil2

/**
 * ReductionComposition fuses two AbstractReduceExpressions. 
 * 
 * The transformation takes a chain of reductions of the form:
 *   reduce(op, g, reduce(op, f, E))
 * and transforms it into:
 *   reduce(op, g o f, E)
 * 
 * Note that the operator must be the same for both of the reductions.
 */
class ReductionComposition {
	
	
	private new() {}
	
	/**
	 * Apply the transformation to all AbstractReduceExpressions in an AlphaSystem.
	 * Silently ignores any AbstractReduceExpression where composition is not applicable. 
	 */	
	static def apply(AlphaSystem system) {
		system.systemBodies.forEach[b|apply(b)]
	}
	
	/**
	 * Apply the transformation to all AbstractReduceExpressions in a SystemBody.
	 * Silently ignores any AbstractReduceExpression where composition is not applicable.
	 */
	static def apply(SystemBody body) {
		EcoreUtil2.getAllContentsOfType(body, AbstractReduceExpression).forEach[are|transform(are)]
	}
	
	/**
	 * Composes two AbstractReduceExpressions into one.
	 * This method throws an exception when composition is not applicable to the specified expression.
	 */
	static def apply(AbstractReduceExpression are) {
		if (transform(are) != 1) {
			throw new IllegalArgumentException("[ReductionComposition] Target AbstractReduceExpression must have another reduction with the same operator as its body.");
		}
	}
	
	/**
	 * Implementation of the transformation.
	 */
	private static def transform(AbstractReduceExpression are) {
		if (!testLegality(are)) return 0;
		
		val innerARE = are.body as AbstractReduceExpression
		
		val composedProj = are.projection.pullback(innerARE.projection)
		
		are.projectionExpr = AlphaUserFactory.createJNIFunction(composedProj)
		are.body = innerARE.body
		
		return 1;
	}
	
	/**
	 * Tests if ReductionComposition is applicable.
	 * Exposed to be used by SimplifyReductionExploration.
	 */
	static def testLegality(AbstractReduceExpression are) {
		if (!(are.body instanceof AbstractReduceExpression)) return false
		
		val innerARE = are.body as AbstractReduceExpression
		
		if (are.operator != innerARE.operator) return false
		
		return true
	}
}