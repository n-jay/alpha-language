package alpha.model.transformation.reduction

import alpha.model.AbstractReduceExpression
import alpha.model.AlphaExpression
import alpha.model.BINARY_OP
import alpha.model.BinaryExpression
import alpha.model.DependenceExpression
import alpha.model.MultiArgExpression
import alpha.model.RestrictExpression
import alpha.model.util.AlphaOperatorUtil
import alpha.model.util.ModelSwitch
import org.eclipse.emf.ecore.EObject

/**
 * Automatically applies FactorOutFromReduction whenever it applies.
 * 
 * The transformation takes a reduction, and performs a depth-first
 * traversal to locate a candidate expression to hoist out. There can 
 * only be RestrictExpression/BinaryExpression/MultiArgExpression,
 * along the path to a DependenceExpression that would be factored out. 
 * 
 * Once an expression is factored out, the same algorithm is applied
 * to the residual reductions until convergence.
 */
class Distributivity {
	
	private new() {}
	
	/**
	 * Applies Distributivity to the specified expression.
	 * 
	 * Returns the number of times FactorOutFromReduction was applied.
	 */
	static def int apply(AbstractReduceExpression targetReduce) {
		val target = new TargetIdentifier().doSwitch(targetReduce);
		
		if (target === null)
			return 0;
			
		val binExpr = FactorOutFromReduction.apply(target as DependenceExpression)
		val nextReduce = binExpr.right as AbstractReduceExpression
		
		return 1 + apply(nextReduce);
	}
	
	private static class TargetIdentifier extends ModelSwitch<AlphaExpression> {
		AbstractReduceExpression reduction = null
		BINARY_OP enclosingOperatorOP = null
	
		/**
		 * The Switch is used to find the DependenceExpression enclosed in a compatible
		 * BinaryExpression or MultiArgExpression.
		 * 
		 * Expect the enclosing reduction to be on the path (either the first 
		 * expression or after restrict). Silently ignores all expressions
		 * that cannot be verified to be a legal target for FactorOutOfReduction.
		 */
		override defaultCase(EObject eObject) {
			null
		}
		override caseAbstractReduceExpression(AbstractReduceExpression object) {
			if (reduction === null) {
				reduction = object
				object.body.doSwitch
			} else 
				null
		}
		/*override*/ def AlphaExpression caseDependenceExpression(DependenceExpression object) {
			if (reduction === null || enclosingOperatorOP === null)
				return null
			
			try {
				FactorOutFromReduction.testLegality(reduction, enclosingOperatorOP, object);
			} catch (IllegalArgumentException iae) {
				return null
			}
			
			object 
		}
		/*override*/ def AlphaExpression caseRestrictExpression(RestrictExpression object) {
			object.expr.doSwitch
		}
		/*override*/ def AlphaExpression caseBinaryExpression(BinaryExpression object) {
			if (reduction === null)
				return null
			if (!AlphaOperatorUtil.isDistributiveOver(object.operator, reduction.operator))
				return null
			if (enclosingOperatorOP === null)
				enclosingOperatorOP = object.operator
			else if (enclosingOperatorOP != object.operator)
				return null
				
			val leftRes = object.left.doSwitch
			if (leftRes !== null) return leftRes
			return object.right.doSwitch
		}
		/*override*/ def AlphaExpression caseMultiArgExpression(MultiArgExpression object) {
			if (reduction === null)
				return null
			if (!AlphaOperatorUtil.isDistributiveOver(object.operator, reduction.operator))
				return null
			if (enclosingOperatorOP === null)
				enclosingOperatorOP = AlphaOperatorUtil.reductionOPtoBinaryOP(object.operator)
			else if (enclosingOperatorOP != AlphaOperatorUtil.reductionOPtoBinaryOP(object.operator))
				return null
				
			for (expr : object.exprs) {
				val res = expr.doSwitch
				if (res !== null) return res
			}
			return null
		}
	}
}