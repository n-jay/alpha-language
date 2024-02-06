package alpha.model.tests.transformations

import alpha.model.AlphaModelLoader
import alpha.model.BinaryExpression
import alpha.model.DependenceExpression
import alpha.model.transformation.RaiseDependence
import org.junit.Test

import static org.junit.Assert.*

import static extension alpha.commands.Utility.*
import static extension alpha.commands.UtilityBase.*

class RaiseDependenceTest {
	/** The path to the Alpha file for these unit tests. */
	static val alphaFile = "resources/src-valid/transformation-tests/raise-dependence/raiseDependence.alpha";
	
	/** Gets the desired system for these unit tests. */
	static def getSystem(String name) {
		return AlphaModelLoader.loadModel(alphaFile).GetSystem(name)
	}
	
	@Test
	def simpleBinaryExpression_01() {
		// From:  f1@A op f2@B
		// To:    (f')@(f1'@A op f2'@B)
		// Where: f1 = f' @ f1' and f2 = f' @ f2'
		
		// Get the equation for the binary expression under test,
		// extract the original f1 and f2, then apply dependence raising to the expression.
		val equation = getSystem("simpleBinaryExpression01")
			.GetSystemBody
			.GetEquation("X")

		val originalBinaryExpr = equation.expr as BinaryExpression 
		val f1 = (originalBinaryExpr.left as DependenceExpression).function
		val f2= (originalBinaryExpr.right as DependenceExpression).function

		RaiseDependence.apply(equation.expr)
		
		// The equation should now have a dependence function at the top level,
		// a binary expression in that, and dependence expressions as the left
		// and right terms of the binary expression.
		assertTrue(typeof(DependenceExpression).isInstance(equation.expr))
		val topDependence = equation.expr as DependenceExpression
		
		assertTrue(typeof(BinaryExpression).isInstance(topDependence.expr))
		val binaryExpr = topDependence.expr as BinaryExpression
		
		assertTrue(typeof(DependenceExpression).isInstance(binaryExpr.left))
		assertTrue(typeof(DependenceExpression).isInstance(binaryExpr.right))
		val left = binaryExpr.left as DependenceExpression
		val right = binaryExpr.right as DependenceExpression
		
		// Make sure that f1 = f' @ f1', and f2 = f' @ f2'.
		val fPrime = topDependence.function
		val f1Prime = left.function
		val f2Prime = right.function
		
		assertTrue(f1.isPlainEqual(f1Prime.pullback(fPrime.copy)))
		assertTrue(f2.isPlainEqual(f2Prime.pullback(fPrime)))
	}
}