package alpha.model.transformation

import alpha.model.AlphaExpression
import alpha.model.AlphaExpressionVisitable
import alpha.model.BinaryExpression
import alpha.model.DependenceExpression
import alpha.model.util.AbstractAlphaExpressionVisitor
import alpha.model.util.AffineFactorizer
import org.eclipse.emf.ecore.util.EcoreUtil

import static alpha.model.factory.AlphaUserFactory.createBinaryExpression
import static alpha.model.factory.AlphaUserFactory.createDependenceExpression

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
	// Binary Expression Rules
	////////////////////////////////////////////////////////////
	
	/** Applies the binary expression rules. */
	override outBinaryExpression(BinaryExpression be) {
		binaryExpressionRule(be, be.left, be.right)
	}
	
	/**
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
	}
	
	/** No matching binary expression rule: do nothing. */
	protected def dispatch binaryExpressionRule(BinaryExpression be, AlphaExpression left, AlphaExpression right) { }
}