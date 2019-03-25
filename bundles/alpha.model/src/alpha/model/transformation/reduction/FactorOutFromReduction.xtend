package alpha.model.transformation.reduction

import alpha.model.AbstractReduceExpression
import alpha.model.AlphaExpression
import alpha.model.AlphaInternalStateConstructor
import alpha.model.BINARY_OP
import alpha.model.BinaryExpression
import alpha.model.DependenceExpression
import alpha.model.MultiArgExpression
import alpha.model.RestrictExpression
import alpha.model.factory.AlphaUserFactory
import alpha.model.transformation.Normalize
import alpha.model.util.AffineFunctionOperations
import alpha.model.util.AlphaOperatorUtil
import fr.irisa.cairn.jnimap.isl.jni.JNIISLDimType
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.util.EcoreUtil

/**
 * FactorOutFromReduction moves an expression within a reduction outwards.
 * 
 * Given a commutative semiring (+, .) an expression of the form:
 *   reduce(., f, E1 + E2)
 * is transformed into:
 *   E1 + reduce(., f, E2)
 * provided that E1 is a constant for each instance of the reduction.
 * 
 * The implementation in this class takes an expression to factor out, and
 * then traverses the AST backwards until an AbstractReduceExpression is found.
 * Then the expression is factored out from the identified reduction, after
 * testing for legality.
 */
class FactorOutFromReduction {
	
	private new(DependenceExpression expr) {
		targetExpr = expr
		enclosingOperation = null;
		targetReduce = null;
	}
	
	final DependenceExpression targetExpr;
	AbstractReduceExpression targetReduce
	//enclosingOperation should be BinaryExpression or MultiArgExpression
	AlphaExpression enclosingOperation
	int childExprID
	BINARY_OP enclosingOperationOP = null
	
	/**
	 * Applies FactorOutFromReduction to the specified expression.
	 * 
	 * Returns the resulting BinaryExpression
	 */
	static def apply(DependenceExpression expr) {
		val T = new FactorOutFromReduction(expr)
		T.transform
	}
	
	/**
	 * Tests for legality of the transformation. Throw IllegalArgumentException when
	 * the transformation is illegal.
	 * 
	 * It is exposed as a public static method to be used by {@link Distributivity}
	 */
	static def testLegality(AbstractReduceExpression targetReduce, BINARY_OP enclosingOperationOP, DependenceExpression targetExpr) {
		if (targetReduce === null || enclosingOperationOP === null || targetExpr === null)
			throw new IllegalArgumentException("[FactorOutFromReduction] One or more inputs are null.");	
		
		val bounded = {
			val ctx = targetReduce.body.contextDomain;
			val nbDims = ctx.getNbDims(JNIISLDimType.isl_dim_set);
			var bounded = true
			for (d : 0..<nbDims) {
				bounded = bounded && ctx.hasAnyLowerBound(JNIISLDimType.isl_dim_set, d)
			}
			bounded
		}
		
		if (!bounded)
			throw new IllegalArgumentException("[FactorOutFromReduction] The reduction body enclosing the target expression has unbounded context domain.");
		
		if (enclosingOperationOP === null)
			throw new IllegalArgumentException("[FactorOutFromReduction] Target expression is not enclosed in a BinaryExpression or MultiArgExpression.");
		
		if (!AlphaOperatorUtil.isDistributiveOver(enclosingOperationOP, AlphaOperatorUtil.getBinaryOP(targetReduce)))
			throw new IllegalArgumentException("[FactorOutFromReduction] Target expression cannot be distributed out of the reduction.");
		
		if (!AffineFunctionOperations.kernelInclusion(targetReduce.projection, targetExpr.function))
			throw new IllegalArgumentException("[FactorOutFromReduction] The nullspace of the target expression must include the nullspace of the projection function.");
	
	} 
	
	private def transform() {
		targetExpr.traverse(targetExpr.eContainer);
		
		testLegality(targetReduce, enclosingOperationOP, targetExpr)
		
		val inverseProjection = AffineFunctionOperations.inverseInContext(targetReduce.projection, targetExpr.contextDomain.lexMin, null)
		
		val newBinExpr = AlphaUserFactory.createBinaryExpression(enclosingOperationOP);
		EcoreUtil.replace(targetReduce, newBinExpr)
		
		val factoredExpr = AlphaUserFactory.createRestrictExpression(targetExpr.contextDomain, targetExpr)
		val inverseDepExpr = AlphaUserFactory.createDependenceExpression(inverseProjection, factoredExpr)
		newBinExpr.left = inverseDepExpr
		newBinExpr.right = targetReduce
		
		if (enclosingOperation instanceof BinaryExpression) {
			val remainingExpr = if (childExprID==0) enclosingOperation.right else enclosingOperation.left
			EcoreUtil.replace(enclosingOperation, remainingExpr)
		} else if (enclosingOperation instanceof MultiArgExpression) {
			//the factored expression is already removed from exprs due to containment
			if (enclosingOperation.exprs.length == 1) {
				EcoreUtil.replace(enclosingOperation, enclosingOperation.exprs.get(0))
			}
		} else {
			throw new RuntimeException("[FactorOutFromReduction] Unexpected type for enclosingOperation: " + enclosingOperation);
		}
		
		AlphaInternalStateConstructor.recomputeContextDomain(newBinExpr)
		Normalize.apply(newBinExpr)
		
		return newBinExpr
	} 
	
	private def dispatch void traverse(AlphaExpression child, EObject obj) {
		throw new IllegalArgumentException("[FactorOutFromReduction] Found unexpected object type while traversing the AST: " + obj.class);		
	}
	
	private def dispatch void traverse(AlphaExpression child, AlphaExpression expr) {
		throw new IllegalArgumentException("[FactorOutFromReduction] Found unexpected expression type while traversing the AST: " + expr.class);
	}
	
	private def dispatch void traverse(AlphaExpression child, DependenceExpression de) {
		throw new IllegalArgumentException("[FactorOutFromReduction] DependenceExpression are not allowed between the specified expression and the enclosing reduction. (The target expression must be a DependenceExpression, but compositions are not allowed.)");
	}
	
	//traverse ends at reduction
	private def dispatch void traverse(AlphaExpression child, AbstractReduceExpression are) {
		targetReduce = are;
	}
	
	//nothing to do for RestrictExpression
	//its domain is already reflected in the context domain	
	private def dispatch void traverse(AlphaExpression child, RestrictExpression re) {
		re.traverse(re.eContainer)
	}
	
	private def dispatch void traverse(AlphaExpression child, BinaryExpression bexpr) {
		if (enclosingOperation === null) {
			childExprID = if(bexpr.left==child) 0 else 1
			enclosingOperation = bexpr;
			enclosingOperationOP = AlphaOperatorUtil.getBinaryOP(enclosingOperation);
		} else {
			val op = AlphaOperatorUtil.getBinaryOP(bexpr);
			if (op != enclosingOperationOP)
				throw new IllegalArgumentException("[FactorOutFromReduction] Operators in all BinaryExpressions (and MultiArgExpressions) from the target expression to the enclosing reduction must be the same.");
		}
		
		bexpr.traverse(bexpr.eContainer)
	}
	
	private def dispatch void traverse(AlphaExpression child, MultiArgExpression mae) {
		if (enclosingOperation === null) {
			childExprID = mae.exprs.indexOf(child)
			enclosingOperation = mae;
			enclosingOperationOP = AlphaOperatorUtil.getBinaryOP(enclosingOperation);
		} else {
			val op = AlphaOperatorUtil.getBinaryOP(mae);
			if (op != enclosingOperationOP)
				throw new IllegalArgumentException("[FactorOutFromReduction] Operators in all MultiArgExpressions (and BinaryExpressions) from the target expression to the enclosing reduction must be the same.");
		}
		
		mae.traverse(mae.eContainer)
	}
}