package alpha.model.transformation.reduction

import alpha.model.AbstractReduceExpression
import alpha.model.AlphaExpression
import alpha.model.BinaryExpression
import alpha.model.DependenceExpression
import alpha.model.MultiArgExpression
import alpha.model.RestrictExpression
import alpha.model.util.AlphaOperatorUtil
import org.eclipse.emf.ecore.EObject
import alpha.model.factory.AlphaUserFactory
import org.eclipse.emf.ecore.util.EcoreUtil
import alpha.model.AlphaInternalStateConstructor
import alpha.model.transformation.Normalize

/**
 * HoistOutOfReduction moves Binary/MultiArgExpression out of a reduction.
 * Given reduction of the form:
 *   reduce(op, f, E1 op E2)
 * it is transformed into:
 *   reduce(op, f, D : E1) op reduce(op, f, D : E2)
 * where D is the context domain of E1 op E2.
 * When the operation is a MultiArgExpression, the output
 * is a MultiArgExpression over reductions on each operand. 
 */
class HoistOutOfReduction {

	val AlphaExpression targetExpr
	AbstractReduceExpression targetReduce

	private new (AlphaExpression expr) {
		targetExpr = expr
	}	
	
	static def apply(BinaryExpression expr) {
		val T = new HoistOutOfReduction(expr)
		T.transform
	}
	
	static def apply(MultiArgExpression expr) {
		val T = new HoistOutOfReduction(expr)
		T.transform
	}
	
	private def transform() {
		val targetExprOp = AlphaOperatorUtil.getBinaryOP(targetExpr)

		//find the enclosing reduction		
		traverse(targetExpr.eContainer);
		
		if (AlphaOperatorUtil.reductionOPtoBinaryOP(targetReduce.operator) != targetExprOp) {
			throw new IllegalArgumentException("[HoistOutOfReduction] The operators of the specified expression and enclosing reduction do not match.");
		}
		
		val replacement = createReplacement(targetExpr)
		EcoreUtil.replace(targetReduce, replacement)
		AlphaInternalStateConstructor.recomputeContextDomain(replacement)
		Normalize.apply(replacement)
	}
	
	private dispatch def createReplacement(BinaryExpression binExpr) {
		val R1 = ReductionUtil.constructConcreteReduction(targetReduce, 
			targetReduce.operator, targetReduce.projection,
			AlphaUserFactory.createRestrictExpression(targetReduce.body.contextDomain, binExpr.left)
		);
		val R2 = ReductionUtil.constructConcreteReduction(targetReduce, 
			targetReduce.operator, targetReduce.projection, 
			AlphaUserFactory.createRestrictExpression(targetReduce.body.contextDomain, binExpr.right)
		);
		AlphaUserFactory.createBinaryExpression(binExpr.operator, R1, R2); 
	}
	private dispatch def createReplacement(MultiArgExpression mae) {
		val result = AlphaUserFactory.createMultiArgExpression(mae.operator);
		
		for (expr : mae.exprs) {
			val reduce = ReductionUtil.constructConcreteReduction(targetReduce, 
				targetReduce.operator, targetReduce.projection, 
				AlphaUserFactory.createRestrictExpression(targetReduce.body.contextDomain, EcoreUtil.copy(expr))
			);
			result.exprs.add(reduce)
		}
		
		result
	}	
	
	private def dispatch void traverse(EObject obj) {
		throw new IllegalArgumentException("[HoistOutOfReduction] Found unexpected object type while traversing the AST: " + obj.class);		
	}
	
	private def dispatch void traverse(AlphaExpression expr) {
		throw new IllegalArgumentException("[HoistOutOfReduction] Found unexpected expression type while traversing the AST: " + expr.class);
	}
	
	private def dispatch void traverse(DependenceExpression de) {
		throw new IllegalArgumentException("[HoistOutOfReduction] DependenceExpression are not allowed between the specified expression and the enclosing reduction.");
	}
	
	//traverse ends at reduction
	private def dispatch void traverse(AbstractReduceExpression are) {
		targetReduce = are;
	}
	
	//nothing to do for RestrictExpression
	//its domain is already reflected in the context domain	
	private def dispatch void traverse(RestrictExpression re) {
		traverse(re.eContainer)
	}
}