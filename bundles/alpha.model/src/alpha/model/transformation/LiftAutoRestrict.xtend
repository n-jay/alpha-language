package alpha.model.transformation

import alpha.model.AlphaCompleteVisitable
import alpha.model.AutoRestrictExpression
import alpha.model.util.AbstractAlphaCompleteVisitor
import alpha.model.factory.AlphaUserFactory
import org.eclipse.xtext.EcoreUtil2
import alpha.model.AlphaVisitable
import alpha.model.AlphaExpressionVisitable

/**
 * Replaces AutoRestrictExpression with RestrictExpression 
 * containing the inferred domain. 
 */
class LiftAutoRestrict extends AbstractAlphaCompleteVisitor {
	
	
	/**
	 * Lifts the target AutoRestictExpression
	 */
	static def apply(AutoRestrictExpression are) {
		transform(are)
	}
	
	/**
	 * Lifts any AutoRestrictExpression in the sub-tree
	 * starting from the given node.
	 */
	static def apply(AlphaCompleteVisitable acv) {
		val visitor = new LiftAutoRestrict();
		
		if (acv instanceof AlphaVisitable) {
			visitor.accept(acv as AlphaVisitable);
		}
		if (acv instanceof AlphaExpressionVisitable) {
			visitor.accept(acv as AlphaExpressionVisitable);
		}
	}
	
	private static def transform(AutoRestrictExpression are) {
		val re = AlphaUserFactory.createRestrictExpression(are.inferredDomain, are.expr);
		
		//Touching the cache should be avoided when possible
		// here, it is done so that the expression/context domain does not 
		// have to be recomputed afterwards. This avoid issues due to 
		// containment, and allows LiftAutoRestrict to be applied
		// anywhere without paying much attention.
		re.z__internal_cache_exprDom = are.expressionDomain
		re.z__internal_cache_contextDom = are.contextDomain
		
		EcoreUtil2.replace(are, re)
		
		return re;
	}
	
	
	override outAutoRestrictExpression(AutoRestrictExpression are) {
		transform(are)
	}
	
}