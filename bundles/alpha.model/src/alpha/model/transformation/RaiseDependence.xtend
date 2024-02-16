package alpha.model.transformation

import alpha.model.AlphaExpression
import alpha.model.AlphaExpressionVisitable
import alpha.model.AlphaInternalStateConstructor
import alpha.model.BinaryExpression
import alpha.model.BooleanExpression
import alpha.model.ConstantExpression
import alpha.model.DependenceExpression
import alpha.model.IntegerExpression
import alpha.model.MultiArgExpression
import alpha.model.RealExpression
import alpha.model.VariableExpression
import alpha.model.util.AbstractAlphaExpressionVisitor
import alpha.model.util.AffineFactorizer
import org.eclipse.emf.ecore.util.EcoreUtil

import static alpha.model.factory.AlphaUserFactory.createBinaryExpression
import static alpha.model.factory.AlphaUserFactory.createBooleanExpression
import static alpha.model.factory.AlphaUserFactory.createDependenceExpression
import static alpha.model.factory.AlphaUserFactory.createIntegerExpression
import static alpha.model.factory.AlphaUserFactory.createMultiArgExpression
import static alpha.model.factory.AlphaUserFactory.createRealExpression
import static alpha.model.factory.AlphaUserFactory.createVariableExpression

import static extension alpha.model.util.CommonExtensions.toArrayList
import static extension alpha.model.util.CommonExtensions.toHashMap
import static extension fr.irisa.cairn.jnimap.isl.ISLMultiAff.buildIdentity
import static extension fr.irisa.cairn.jnimap.isl.ISLMultiAff.buildZero
import static extension fr.irisa.cairn.jnimap.isl.ISLSpace.idMapDimFromSetDim
import alpha.model.UnaryExpression

/**
 * Raises up dependence functions through the AST of a given expression.
 * This is done by factorizing dependence functions and bringing the "common factor" terms
 * up through the AST as high as they can be.
 * Some of these rules can be thought of as the opposite of the Normalize rules.
 * 
 * One use case is to expose the maximum amount of reuse, enabling automatic reuse vector selection
 * for the Simlpifying Reductions optimization.
 * 
 * List of Rules:
 * Constant and Variable Expressions:
 *     These rules effectively just wrap constants and variables in dependence functions.
 *     Note: they only apply if the constant/variable isn't already wrapped in a dependence function.
 * 
 *     (X) goes to (f @ X) where X is a constant and f is a map from the context domain to a zero-dimensional range.
 *     (X) goes to (f @ X) where X is a variable and f is the identity function.
 * 
 * Dependence Expressions:
 *     This rule simply merges nested dependence functions.
 * 
 *     (f1 @ f2 @ E) goes to (f @ E) where f=f1 @ f2
 * 
 * Binary Expressions:
 *     This rule factorizes the dependence functions f1 and f2,
 *     wrapping the binary expression in a dependence function of the common factor.
 * 
 *     ((f1 @ E1) op (f2 @ E2)) goes to ((f')@((f1' @ E1) op (f2' @ E2))) where f1 = f' @ f1' and f2 = f' @ f2'
 * 
 * Multi-Arg Expressions:
 *     This is the same as the Binary Expressions rule, but factorizes more than one expression.
 * 
 *     op(f1@E1, f2@E2, ...) goes to (f')@ op(f1'@E1, f2'@E2, ...) where fn = f' @ fn'
 */
class RaiseDependence extends AbstractAlphaExpressionVisitor {
	/** Protected constructor to restrict access to the instance methods. */
	protected new() {}
	
	/** Applies dependence raising to the AST of the given visitable expression. */
	static def apply(AlphaExpressionVisitable visitable) {
		new RaiseDependence().accept(visitable)
	}
	
	
	////////////////////////////////////////////////////////////
	// Constant and Variable Expression Rules
	////////////////////////////////////////////////////////////
	
	/** Applies the constant expression rules. */
	override outConstantExpression(ConstantExpression ce) {
		constantExpressionRule(ce)
	}
	
	/**
	 * Wraps a constant expression in a dependence expression,
	 * assuming it's not already wrapped.
	 * 
	 * From:  X
	 * To:    f @ X
	 * Where: X is a constant, and f is a map from the context domain to a zero-dimensional range.
	 */
	protected def constantExpressionRule(ConstantExpression expr) {
		// Only need to wrap the expression if it isn't inside a dependence function.
		if (expr.eContainer instanceof DependenceExpression) {
			return
		}
		
		// Create a function from the context domain to the empty set.
		val toEmpty = expr.contextDomain
			.space
			.buildZero
			
		// Wrap the current expression with a dependence expression of the empty function.
		// Note: the constant expression is copied, otherwise it can't be replaced in the AST.
		val replacementConstant = switch expr {
			BooleanExpression case expr : createBooleanExpression(expr.value)
			IntegerExpression case expr : createIntegerExpression(expr.value)
			RealExpression case expr : createRealExpression(expr.value)
			default: throw new IllegalArgumentException("Unrecognized constant expression type.")
		}
		val wrappingDependence = createDependenceExpression(toEmpty, replacementConstant)
		EcoreUtil.replace(expr, wrappingDependence)
		AlphaInternalStateConstructor.recomputeContextDomain(wrappingDependence)
	}
	
	/** Applies the variable expression rules. */
	override outVariableExpression(VariableExpression ve) {
		variableExpressionRule(ve)
	}
	
	/**
	 * Wraps a variable expression in a dependence expression,
	 * assuming it's not already wrapped.
	 * 
	 * From:  X
	 * To:    f @ X
	 * Where: f is the identity function
	 */
	protected def variableExpressionRule(VariableExpression expr) {
		// Only need to wrap the expression with an identity dependence function
		// if the expression isn't inside a dependence function.
		if (typeof(DependenceExpression).isInstance(expr.eContainer)) {
			return
		}
		
		// Create an appropriate identity function.
		val identity = expr.contextDomain
			.space
			.idMapDimFromSetDim
			.buildIdentity
			
		// Wrap the current expression with a dependence expression of the identity function.
		// Note: the variable expression is copied, otherwise it can't be replaced in the AST.
		val replacementVar = createVariableExpression(expr.variable)
		val wrappingDependence = createDependenceExpression(identity, replacementVar)
		EcoreUtil.replace(expr, wrappingDependence)
		AlphaInternalStateConstructor.recomputeContextDomain(wrappingDependence)
	}
	
	
	////////////////////////////////////////////////////////////
	// Dependence Expression Rules
	////////////////////////////////////////////////////////////
	
	/** Applies the binary expression rules. */
	override outDependenceExpression(DependenceExpression de) {
		dependenceExpressionRule(de, de.expr)
	}
	
	/**
	 * Merge nested dependence expressions.
	 * 
	 * From:  f1 @ (f2 @ E)
	 * To:    f @ E
	 * Where: f = f1 @ f2
	 */
	protected def dispatch dependenceExpressionRule(DependenceExpression de, DependenceExpression innerDe) {
		val f1 = de.function
		val f2 = innerDe.function
		val f = f2.pullback(f1)
		
		val newDe = createDependenceExpression(f, innerDe.expr)
		EcoreUtil.replace(de, newDe)
		AlphaInternalStateConstructor.recomputeContextDomain(newDe)
	}
	
	/** No matching dependence expression rule: do nothing. */
	protected def dispatch dependenceExpressionRule(DependenceExpression de, AlphaExpression inner) { }
	
	
	////////////////////////////////////////////////////////////
	// Unary Expression Rules
	////////////////////////////////////////////////////////////
	
	/** Applies the unary expression rules. */
	override outUnaryExpression(UnaryExpression ue) {
		unaryExpressionRule(ue, ue.expr)
	}
	
	/**
	 * Pull up the dependence expressions within a unary expression.
	 * 
	 * From:  op (f @ E)
	 * To:    f @ (op E)
	 */
	protected def dispatch unaryExpressionRule(UnaryExpression ue, DependenceExpression de) {
		// Replace the dependence expression with its child,
		// which moves the child up to be inside the unary expression. 
		EcoreUtil.replace(de, de.expr)
		
		// Replace the unary expression with the dependence expression,
		// then put the unary expression inside the dependence.
		EcoreUtil.replace(ue, de)
		de.expr = ue
		
		// Recompute the context domains.
		AlphaInternalStateConstructor.recomputeContextDomain(de)
	}
	
	/** No matching unary expression rule: do nothing. */
	protected def dispatch unaryExpressionRule(UnaryExpression ue, AlphaExpression expr) { }
	
	
	////////////////////////////////////////////////////////////
	// Binary Expression Rules
	////////////////////////////////////////////////////////////
	
	/** Applies the binary expression rules. */
	override outBinaryExpression(BinaryExpression be) {
		binaryExpressionRule(be, be.left, be.right)
	}
	
	/**
	 * Pull out a common factor from dependence expressions within a binary expression.
	 * 
	 * From:  f1 @ E1 op f2 @ E2
	 * To:    (f')@((f1' @ E1) op (f2' @ E2))
	 * Where: f1 = f' @ f1' and f2 = f' @ f2'
	 */
	protected def dispatch binaryExpressionRule(BinaryExpression be, DependenceExpression left, DependenceExpression right) {
		// f', f1', and f2' are determined by the Hermite factorization of f1 and f2,
		// where f' is the "common factor", and f1' and f2' are the "remaining terms"
		// for f1 and f2 respectively.
		val f1 = left.function
		val f2 = right.function
		
		val factorizationResult = AffineFactorizer.factorizeExpressions(f1, f2)
		val fPrime = factorizationResult.key
		val f1Prime = factorizationResult.value.get(f1)
		val f2Prime = factorizationResult.value.get(f2)

		// We want to replace the dependence functions inside this binary expression
		// with f1' and f2', then wrap the binary expression in a new dependence expression
		// which applies f' before the binary expression.
		val newLeft = createDependenceExpression(f1Prime, left.expr)
		val newRight = createDependenceExpression(f2Prime, right.expr)
		val newBinaryExpr = createBinaryExpression(be.operator, newLeft, newRight)
		val newParent = createDependenceExpression(fPrime, newBinaryExpr)
		
		EcoreUtil.replace(be, newParent)
		AlphaInternalStateConstructor.recomputeContextDomain(newParent)
	}
	
	/** No matching binary expression rule: do nothing. */
	protected def dispatch binaryExpressionRule(BinaryExpression be, AlphaExpression left, AlphaExpression right) { }
	
	
	////////////////////////////////////////////////////////////
	// Multi-Arg Expression Rules
	////////////////////////////////////////////////////////////
	
	/** Applies the multi-argument expression rules. */
	override outMultiArgExpression(MultiArgExpression me) {
		// We only try to apply the rule if all the children are dependence expressions.
		val children = me.exprs
		if (children.forall[child | typeof(DependenceExpression).isInstance(child)]) {
			multiArgExpressionRule(me, children.map[child | child as DependenceExpression])
		}
	}
	
	/**
	 * Pull out a common factor from dependence expressions within a multi-arg expression.
	 * 
	 * From:  op (f1@E1, f2@E2, ...)
	 * To:    (f')@ op(f1'@E1, f2'@E2, ...)
	 * Where: fn = f' @ fn'
	 */
	protected def multiArgExpressionRule(MultiArgExpression me, DependenceExpression... children) {
		// f' and the fn' functions are determined by the Hermite factorization of all fn,
		// where f' is the "common factor", and each fn' is the "remaining term" for fn.

		// To reliably reconstruct the new dependence expressions, we need both the dependence function
		// and the expression inside. We do this in a few steps:
		// 1) Turn the list of children into a map from the expression they contain to themselves.
		// 2) Map the AST nodes (the values) to the expression they contain.
		// 3) Convert to a HashMap to prevent lazy evaluation from recomputing everything.
		// 4) Extract the values, which are the affine functions to factorize.
		val innerExpressionAndDependence = children
			.toMap[de | de.expr]
			.mapValues[de | de.function]
			.toHashMap
		val functions = innerExpressionAndDependence.values
		
		val factorizationResult = AffineFactorizer.factorizeExpressions(functions)
		val commonFactor = factorizationResult.key
		val remainingTermsMap = factorizationResult.value
		
		// We want to replace the child dependence functions with the appropriate remaining term,
		// then wrap them all in a new multi-arg expression, then wrap that in a new dependence function
		// which applies f' before the multi-arg expression.
		// This can be done simply by mapping the functions (values) to their remaining term.
		val newChildren = innerExpressionAndDependence
			.mapValues[de | remainingTermsMap.get(de)]
			.entrySet
			.map[innerExprAndRemainder | createDependenceExpression(innerExprAndRemainder.value, innerExprAndRemainder.key)]
			.toArrayList
		val newMultiArgExpr = createMultiArgExpression(me.operator)
		newMultiArgExpr.exprs.addAll(newChildren)
		val newParent = createDependenceExpression(commonFactor, newMultiArgExpr)
		
		EcoreUtil.replace(me, newParent)
		AlphaInternalStateConstructor.recomputeContextDomain(newParent)
	}
}