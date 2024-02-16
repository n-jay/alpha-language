package alpha.model.tests.transformations

import alpha.model.AlphaModelLoader
import alpha.model.BinaryExpression
import alpha.model.ConstantExpression
import alpha.model.DependenceExpression
import alpha.model.MultiArgExpression
import alpha.model.StandardEquation
import alpha.model.VariableExpression
import alpha.model.transformation.RaiseDependence
import fr.irisa.cairn.jnimap.isl.ISLMultiAff
import org.junit.Test

import static org.junit.Assert.*

import static extension alpha.commands.Utility.*
import static extension alpha.commands.UtilityBase.*
import static extension alpha.model.util.CommonExtensions.toHashMap
import alpha.model.UnaryExpression

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
	// Constant and Variable Expression Rules
	////////////////////////////////////////////////////////////
	
	@Test
	def wrapConstantExpression_01() {
		// Wrap a variable in a dependence expression of the identity function.
		val equation = getEquation("wrapConstantExpression_01", "X")
		RaiseDependence.apply(equation.expr)
		
		// The equation should now have a dependence function at the top level
		// which contains a constant expression.
		assertTrue(typeof(DependenceExpression).isInstance(equation.expr))
		val topDependence = equation.expr as DependenceExpression
		assertTrue(typeof(ConstantExpression).isInstance(topDependence.expr))
	}
	
	@Test
	def wrapVariableExpression_01() {
		// Wrap a variable in a dependence expression of the identity function.
		val equation = getEquation("wrapVariableExpression_01", "X")
		RaiseDependence.apply(equation.expr)
		
		// The equation should now have a dependence function at the top level
		// which contains a variable expression.
		assertTrue(typeof(DependenceExpression).isInstance(equation.expr))
		val topDependence = equation.expr as DependenceExpression
		assertTrue(typeof(VariableExpression).isInstance(topDependence.expr))
	}
	
	@Test
	def wrapVariableExpression_02() {
		// Wrap a variable in a dependence expression of the identity function.
		val equation = getEquation("wrapVariableExpression_02", "X")
		RaiseDependence.apply(equation.expr)
		
		// The equation should now have a dependence function at the top level
		// which contains a variable expression.
		assertTrue(typeof(DependenceExpression).isInstance(equation.expr))
		val topDependence = equation.expr as DependenceExpression
		assertTrue(typeof(VariableExpression).isInstance(topDependence.expr))
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
	// Unary Expression Rules
	////////////////////////////////////////////////////////////
	
	@Test
	def unaryExpression_01() {
		// From:  op (f @ E)
		// To:    f @ (op E)
		
		// Get the equation for the unary expression under test,
		// extract the dependence function, and apply dependence raising.
		val equation = getEquation("unaryExpression_01", "X")
		val originalUnaryExpr = equation.expr as UnaryExpression
		val f = (originalUnaryExpr.expr as DependenceExpression).function
		
		RaiseDependence.apply(equation.expr)
		
		// Make sure the equation now has a dependence expression at the top level
		// and that its function is the same as the original one.
		assertTrue(equation.expr instanceof DependenceExpression)
		val newDependence = equation.expr as DependenceExpression
		assertTrue(f.isPlainEqual(newDependence.function))
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
		val f2 = (originalBinaryExpr.right as DependenceExpression).function
		
		assertBinaryEquationCorrect(equation, f1, f2)
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
		
		// We want f1@f2 = f1'@f2' and f1@f3 = f1'@f3'
		val firstExpected = f2.pullback(f1.copy)
		val secondExpected = f3.pullback(f1)
		assertBinaryEquationCorrect(equation, firstExpected, secondExpected)
	}
	
	@Test
	def binaryExpressionBecomesNested_02() {
		// From:  f1@(f2@A op B)
		// To:    f1'@(f2'@A op f3'@B)
		// Where: f1@f2 = f1'@f2' and f1 = f1'@f3'
		
		// This is effectively the same case as "binaryExpressionBecomesNested_01",
		// except f3 is the identity function.
		
		// Get the equation for the top-level dependence expression under test,
		// extract the nested dependence functions, then apply dependence raising.
		val equation = getEquation("binaryExpressionBecomesNested_02", "X")
		val originalDependence = equation.expr as DependenceExpression
		val f1 = originalDependence.function
		
		val originalBinaryExpr = originalDependence.expr as BinaryExpression
		val f2 = (originalBinaryExpr.left as DependenceExpression).function
		
		// We want f1@f2 = f1'@f2' and f1 = f1'@f3'
		val firstExpected = f2.pullback(f1.copy)
		val secondExpected = f1
		assertBinaryEquationCorrect(equation, firstExpected, secondExpected)
	}
	
	@Test
	def binaryExpressionBecomesNested_03() {
		// From:  f1@(A op f3@B)
		// To:    f1'@(f2'@A op f3'@B)
		// Where: f1 = f1'@f2' and f1@f3 = f1'@f3'
		
		// This is effectively the same case as "binaryExpressionBecomesNested_01",
		// except f2 is the identity function.
		
		// Get the equation for the top-level dependence expression under test,
		// extract the nested dependence functions, then apply dependence raising.
		val equation = getEquation("binaryExpressionBecomesNested_03", "X")
		val originalDependence = equation.expr as DependenceExpression
		val f1 = originalDependence.function
		
		val originalBinaryExpr = originalDependence.expr as BinaryExpression
		val f3 = (originalBinaryExpr.right as DependenceExpression).function
		
		// We want f1 = f1'@f2' and f1@f3 = f1'@f3'
		val firstExpected = f1.copy
		val secondExpected = f3.pullback(f1)
		assertBinaryEquationCorrect(equation, firstExpected, secondExpected)
	}
	
	@Test
	def binaryExpressionBecomesNested_04() {
		// From:  f1@(A op B)
		// To:    f1'@(f2'@A op f3'@B)
		// Where: f1 = f1'@f2' and f1 = f1'@f3'
		
		// This is effectively the same case as "binaryExpressionBecomesNested_01",
		// except f2 is the identity function.
		
		// Get the equation for the top-level dependence expression under test,
		// extract the nested dependence functions, then apply dependence raising.
		val equation = getEquation("binaryExpressionBecomesNested_04", "X")
		val originalDependence = equation.expr as DependenceExpression
		val f1 = originalDependence.function
		
		// We want f1 = f1'@f2' and f1 = f1'@f3'
		val firstExpected = f1.copy
		val secondExpected = f1
		assertBinaryEquationCorrect(equation, firstExpected, secondExpected)
	}
	
	static def assertBinaryEquationCorrect(StandardEquation equation, ISLMultiAff firstExpected, ISLMultiAff secondExpected) {
		// Apply dependence raising.
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
		
		// Make sure that f1' @ f2' and f1' @ f3' are the expected values.
		val firstActual = f2Prime.pullback(f1Prime.copy)
		assertTrue(firstExpected.isPlainEqual(firstActual))

		val secondActual = f3Prime.pullback(f1Prime)
		assertTrue(secondExpected.isPlainEqual(secondActual))
	}
	
	
	////////////////////////////////////////////////////////////
	// Multi-Arg Expression Rules
	////////////////////////////////////////////////////////////
	
	@Test
	def multiArgTest_01() {
		// From:  op(f1@A1, f2@A2, f3@A3)
		// To:    (f')@ op(f1'@A1, f2'@A2, f3'@A3)
		// Where: fn = f' @ fn' for n=1,2,3
		
		// Get the equation for the expression under test,
		// extract the original dependence functions (mapped by their inner expression),
		// then apply dependence raising.
		val equation = getEquation("multiArgTest_01", "X")
		val expectedFunctions = (equation.expr as MultiArgExpression).exprs
			.map[expr | expr as DependenceExpression]
			.toMap[expr | expr.expr]
			.mapValues[expr | expr.function]
			.toHashMap

		RaiseDependence.apply(equation.expr)
		
		// The equation should now have a dependence function at the top level,
		// a multi-arg expression in that, and dependence expressions as the children.
		assertTrue(typeof(DependenceExpression).isInstance(equation.expr))
		val topDependence = equation.expr as DependenceExpression
		val commonFactor = topDependence.function
		
		assertTrue(typeof(MultiArgExpression).isInstance(topDependence.expr))
		val multiArgExpr = topDependence.expr as MultiArgExpression
		
		multiArgExpr.exprs.forEach[child | assertTrue(typeof(DependenceExpression).isInstance(child))]
		val remainingTerms = multiArgExpr.exprs
			.map[child | child as DependenceExpression]
			.toMap[child | child.expr]
			.mapValues[child | child.function]
			.toHashMap
		
		// Make sure that fn = f' @ fn' for all n.
		for (innerExpr : expectedFunctions.keySet) {
			val expected = expectedFunctions.get(innerExpr)
			val actual = remainingTerms.get(innerExpr).pullback(commonFactor.copy())
			assertTrue(expected.isPlainEqual(actual))
		}
	}
}