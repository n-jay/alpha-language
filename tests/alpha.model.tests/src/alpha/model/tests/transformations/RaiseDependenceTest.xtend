package alpha.model.tests.transformations

import alpha.model.AlphaModelLoader
import alpha.model.BinaryExpression
import alpha.model.DependenceExpression
import alpha.model.VariableExpression
import alpha.model.transformation.RaiseDependence
import org.junit.Test

import static org.junit.Assert.*

import static extension alpha.commands.Utility.*
import static extension alpha.commands.UtilityBase.*

class RaiseDependenceTest {
	/** The path to the Alpha file for these unit tests. */
	static val alphaFile = "resources/src-valid/transformation-tests/raise-dependence/raiseDependence.alpha";
	
	/** Gets the desired equation for these unit tests. */
	static def getEquation(String system, String equation) {
		return AlphaModelLoader.loadModel(alphaFile)
			.GetSystem(system)
			.GetSystemBody
			.GetEquation(equation)
	}
	
	
	////////////////////////////////////////////////////////////
	// Dependence Expression Rules
	////////////////////////////////////////////////////////////
	
	@Test
	def nestedDependenceFunction_01() {
		// From:  f1 @ (f2 @ X)
		// To:    f @ X
		// Where: f = f1 @ f2
		
		// Get the equation for the top-level dependence expression under test,
		// extract the nested dependence functions, then apply dependence raising.
		val equation = getEquation("nestedDependenceFunction_01", "X")
		val originalDependence = equation.expr as DependenceExpression
		val f1 = originalDependence.function
		val f2 = (originalDependence.expr as DependenceExpression).function
		
		RaiseDependence.apply(equation.expr)
		
		// The equation should now have a dependence function at the top level
		// which contains a variable expression.
		assertTrue(typeof(DependenceExpression).isInstance(equation.expr))
		val topDependence = equation.expr as DependenceExpression
		assertTrue(typeof(VariableExpression).isInstance(topDependence.expr))
		
		// Make sure that f = f1 @ f2.
		val f = topDependence.function
		assertTrue(f.isPlainEqual(f2.pullback(f1)))
	}
	
	
	////////////////////////////////////////////////////////////
	// Binary Expression Rules
	////////////////////////////////////////////////////////////
	
	@Test
	def simpleBinaryExpression_01() {
		// From:  f1@A op f2@B
		// To:    (f')@(f1'@A op f2'@B)
		// Where: f1 = f' @ f1' and f2 = f' @ f2'
		
		// Get the equation for the binary expression under test,
		// extract the original f1 and f2, then apply dependence raising.
		val equation = getEquation("simpleBinaryExpression_01", "X")
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
	
	@Test
	def binaryExpressionBecomesNested_01() {
		// From:  f1@(f2@A op f3@B)
		// To:    f1'@(f2'@A op f3'@B)
		// Where: f1@f2 = f1'@f2' and f1@f3 = f1'@f3'
		
		// There is a dependence function around a binary expression.
		// The binary expression will have a dependence function raised,
		// resulting in nested dependence expressions.
		// These nested dependences should be merged, resulting in
		// a single dependence expression containing a binary expression,
		// which in turn contains two dependence expressions.
		
		// Get the equation for the top-level dependence expression under test,
		// extract the nested dependence functions, then apply dependence raising.
		val equation = getEquation("binaryExpressionBecomesNested_01", "X")
		val originalDependence = equation.expr as DependenceExpression
		val f1 = originalDependence.function
		
		val originalBinaryExpr = originalDependence.expr as BinaryExpression
		val f2 = (originalBinaryExpr.left as DependenceExpression).function
		val f3 = (originalBinaryExpr.right as DependenceExpression).function
		
		RaiseDependence.apply(equation.expr)
		
		// The equation should now have a dependence function at the top level,
		// a binary expression in that, and dependence expressions as the left
		// and right terms of the binary expression.
		assertTrue(typeof(DependenceExpression).isInstance(equation.expr))
		val topDependence = equation.expr as DependenceExpression
		val f1Prime = topDependence.function
		
		assertTrue(typeof(BinaryExpression).isInstance(topDependence.expr))
		val binaryExpr = topDependence.expr as BinaryExpression
		
		assertTrue(typeof(DependenceExpression).isInstance(binaryExpr.left))
		assertTrue(typeof(DependenceExpression).isInstance(binaryExpr.right))
		val f2Prime = (binaryExpr.left as DependenceExpression).function
		val f3Prime = (binaryExpr.right as DependenceExpression).function
		
		// Make sure that f1 @ f2 = f1' @ f2', and that f1 @ f3 = f1' @ f3'.
		val firstExpected = f2.pullback(f1.copy)
		val firstActual = f2Prime.pullback(f1Prime.copy)
		assertTrue(firstExpected.isPlainEqual(firstActual))

		val secondExpected = f3.pullback(f1)
		val secondActual = f3Prime.pullback(f1Prime)
		assertTrue(secondExpected.isPlainEqual(secondActual))
	}
}