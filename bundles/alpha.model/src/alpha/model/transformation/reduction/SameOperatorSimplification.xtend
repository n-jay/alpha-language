package alpha.model.transformation.reduction

import alpha.model.AbstractReduceExpression
import alpha.model.AlphaExpression
import alpha.model.BinaryExpression
import alpha.model.MultiArgExpression
import alpha.model.RestrictExpression
import alpha.model.util.ModelSwitch
import org.eclipse.emf.ecore.EObject
import alpha.model.util.AlphaOperatorUtil

/**
 * Automatically applies HoistOutOfReduction whenever it applies.
 * 
 * The transformation takes a reduction, and performs a depth-first
 * traversal to locate a candidate expression to hoist out. There can 
 * only be RestrictExpressions from the reduction to BinaryExpression 
 * or MultiArgExpression, and the traversal stops when another type
 * is encountered.
 * 
 * Once an expression is hoisted out, the same algorithm is applied
 * to the residual reductions until convergence.
 */
class SameOperatorSimplification {
	
	/**
	 * Applies SameOperatorSimplification to the specified expression.
	 * 
	 * Returns the number of times HoistOutOfReduction was applied.
	 */
	static def apply(AbstractReduceExpression targetReduce) {
		val SOS = new SameOperatorSimplification()
		return SOS.transform(targetReduce)
	}
	
	private def int transform(AbstractReduceExpression are) {
		val targetExpr = new TargetIdentifier().doSwitch(are)
		if (targetExpr === null)
			return 0;
		return applyHoisting(targetExpr);	
	}
	
	private def dispatch int applyHoisting(BinaryExpression bexpr) {
		val hoistedExpr = HoistOutOfReduction.apply(bexpr)
		
		val targetLeft  = new TargetIdentifier().doSwitch(hoistedExpr.left)
		val targetRight = new TargetIdentifier().doSwitch(hoistedExpr.right)
		
		val leftCount = if (targetLeft !== null) applyHoisting(targetLeft) else 0;
		val rightCount = if (targetRight !== null) applyHoisting(targetRight) else 0;
		
		return leftCount + rightCount
	}
	
	private def dispatch int applyHoisting(MultiArgExpression mae) {
		val hoistedExpr = HoistOutOfReduction.apply(mae)
		val exprs = hoistedExpr.exprs.toList
		
		var count = 0
		for (expr : exprs) {
			val target = new TargetIdentifier().doSwitch(expr)
			count += if (target !== null) applyHoisting(target) else 0
		}
		return count
	}
	
	private static class TargetIdentifier extends ModelSwitch<AlphaExpression> {
		AbstractReduceExpression reduction
	
		/**
		 * The Switch is used to find the BinaryExpression or MultiArgExpression
		 * immediately enclosed by the reduction, only allowing RestrictExpression 
		 * to be on the path.
		 * 
		 * Expect the enclosing reduction to be on the path (either the first 
		 * expression or after restrict). Silently ignores all expressions
		 * that cannot be verified to be a legal target for HoistOutOfReduction.
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
		/*override*/ def AlphaExpression caseRestrictExpression(RestrictExpression object) {
			object.expr.doSwitch
		}
		/*override*/ def AlphaExpression caseBinaryExpression(BinaryExpression object) {
			if (reduction === null)
				return null
			if (AlphaOperatorUtil.reductionOPtoBinaryOP(reduction.operator) != object.operator)
				return null
			return object
		}
		/*override*/ def AlphaExpression caseMultiArgExpression(MultiArgExpression object) {
			if (reduction === null)
				return null
			if (reduction.operator != object.operator)
				return null
			return object
		}
	}
	
}