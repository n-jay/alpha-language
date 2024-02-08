package alpha.model.transformation

import alpha.model.AlphaExpression
import alpha.model.AlphaExpressionVisitable
import alpha.model.AlphaInternalStateConstructor
import alpha.model.BinaryExpression
import alpha.model.BooleanExpression
import alpha.model.ConstantExpression
import alpha.model.DependenceExpression
import alpha.model.IntegerExpression
import alpha.model.RealExpression
import alpha.model.VariableExpression
import alpha.model.util.AbstractAlphaExpressionVisitor
import alpha.model.util.AffineFactorizer
import org.eclipse.emf.ecore.util.EcoreUtil

import static alpha.model.factory.AlphaUserFactory.createBinaryExpression
import static alpha.model.factory.AlphaUserFactory.createBooleanExpression
import static alpha.model.factory.AlphaUserFactory.createDependenceExpression
import static alpha.model.factory.AlphaUserFactory.createIntegerExpression
import static alpha.model.factory.AlphaUserFactory.createRealExpression
import static alpha.model.factory.AlphaUserFactory.createVariableExpression

import static extension fr.irisa.cairn.jnimap.isl.ISLMultiAff.buildIdentity
import static extension fr.irisa.cairn.jnimap.isl.ISLMultiAff.buildZero
import static extension fr.irisa.cairn.jnimap.isl.ISLSpace.idMapDimFromSetDim

/**
 * Raises up dependence functions through the AST of a given expression.
 * This is done by factorizing dependence functions and bringing the "common factor" terms
 * up through the AST as high as they can be.
 * Some of these rules can be thought of as the opposite of the Normalize rules.
 * 
 * One use case is to expose the maximum amount of reuse, enabling automatic reuse vector selection
 * for the Simlpifying Reductions optimization.
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
	
	override outConstantExpression(ConstantExpression ce) {
		constantExpressionRule(ce)
	}
	
	/**
	 * Wraps a constant expression in a dependence expression,
	 * assuming it's not already wrapped.
	 * 
	 * From:  X
	 * To:    f @ X
	 * Where: X is a constant, and f is a map with a zero-dimensional range.
	 */
	protected def constantExpressionRule(ConstantExpression expr) {
		// Only need to wrap the expression if it isn't inside a dependence function.
		if (typeof(DependenceExpression).isInstance(expr.eContainer)) {
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
		println()
	}
	
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
	 * From:  f1 @ (f2 @ X)
	 * To:    f @ X
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
	// Binary Expression Rules
	////////////////////////////////////////////////////////////
	
	/** Applies the binary expression rules. */
	override outBinaryExpression(BinaryExpression be) {
		binaryExpressionRule(be, be.left, be.right)
	}
	
	/**
	 * Pull out a common factor from dependence expressions within a binary expression
	 * 
	 * From:  f1@A op f2@B
	 * To:    (f')@(f1'@A op f2'@B)
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
}