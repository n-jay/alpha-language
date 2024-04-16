package alpha.model.tests.transformations

import alpha.model.AlphaModelLoader
import alpha.model.AutoRestrictExpression
import alpha.model.BinaryExpression
import alpha.model.CaseExpression
import alpha.model.ConstantExpression
import alpha.model.DependenceExpression
import alpha.model.IndexExpression
import alpha.model.MultiArgExpression
import alpha.model.RestrictExpression
import alpha.model.StandardEquation
import alpha.model.UnaryExpression
import alpha.model.VariableExpression
import alpha.model.transformation.RaiseDependence
import fr.irisa.cairn.jnimap.isl.ISLMultiAff
import fr.irisa.cairn.jnimap.isl.ISLSet
import org.junit.Test

import static org.junit.Assert.*

import static extension alpha.commands.Utility.*
import static extension alpha.commands.UtilityBase.*
import static extension alpha.model.util.CommonExtensions.toHashMap
import alpha.model.transformation.Normalize
import alpha.model.util.AShow
import alpha.model.transformation.LiftAutoRestrict

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
	// Constant, Variable, and Index Expression Rules
	////////////////////////////////////////////////////////////
	
	@Test
	def wrapConstantExpression_01() {
		// Wrap a variable in a dependence expression of the identity function.
		val equation = getEquation("wrapConstantExpression_01", "X")
		RaiseDependence.apply(equation.expr)
		
		// The equation should now have a dependence function at the top level
		// which contains a constant expression.
		assertTrue(equation.expr instanceof DependenceExpression)
		val topDependence = equation.expr as DependenceExpression
		assertTrue(topDependence.expr instanceof ConstantExpression)
	}
	
	@Test
	def wrapVariableExpression_01() {
		// Wrap a variable in a dependence expression of the identity function.
		val equation = getEquation("wrapVariableExpression_01", "X")
		RaiseDependence.apply(equation.expr)
		
		// The equation should now have a dependence function at the top level
		// which contains a variable expression.
		assertTrue(equation.expr instanceof DependenceExpression)
		val topDependence = equation.expr as DependenceExpression
		assertTrue(topDependence.expr instanceof VariableExpression)
	}
	
	@Test
	def wrapVariableExpression_02() {
		// Wrap a variable in a dependence expression of the identity function.
		val equation = getEquation("wrapVariableExpression_02", "X")
		RaiseDependence.apply(equation.expr)
		
		// The equation should now have a dependence function at the top level
		// which contains a variable expression.
		assertTrue(equation.expr instanceof DependenceExpression)
		val topDependence = equation.expr as DependenceExpression
		assertTrue(topDependence.expr instanceof VariableExpression)
	}
	
	@Test
	def wrapIndexExpression_01() {
		// Save the original dependence function inside the index expression,
		// then apply dependence raising.
		val equation = getEquation("wrapIndexExpression_01", "X")
		val originalFunction = (equation.expr as IndexExpression).function
		RaiseDependence.apply(equation.expr)
		
		// The equation should now be a dependence expression with the original function.
		// Inside that should be an index expression with an identity function.
		assertTrue(equation.expr instanceof DependenceExpression)
		val dependence = equation.expr as DependenceExpression
		
		assertTrue(originalFunction.isPlainEqual(dependence.function))
		
		assertTrue(dependence.expr instanceof IndexExpression)
		val index = dependence.expr as IndexExpression
		
		assertTrue(index.function.isIdentity)
	}
	
	@Test
	def wrapIndexExpression_02() {
		// The expected dependence function at the end should be the composition
		// of the wrapping dependence function and the function inside the index expression.
		val equation = getEquation("wrapIndexExpression_02", "X")
		val originalDependence = equation.expr as DependenceExpression
		val originalIndex = originalDependence.expr as IndexExpression
		val expectedFunction = originalIndex.function.pullback(originalDependence.function)
		
		RaiseDependence.apply(equation.expr)
		
		// The equation should now be a dependence expression with the original function.
		// Inside that should be an index expression with an identity function.
		assertTrue(equation.expr instanceof DependenceExpression)
		val dependence = equation.expr as DependenceExpression
		
		assertTrue(expectedFunction.isPlainEqual(dependence.function))
		
		assertTrue(dependence.expr instanceof IndexExpression)
		val index = dependence.expr as IndexExpression
		
		assertTrue(index.function.isIdentity)
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
		assertTrue(equation.expr instanceof DependenceExpression)
		val topDependence = equation.expr as DependenceExpression
		assertTrue(topDependence.expr instanceof VariableExpression)
		
		// Make sure that f = f1 @ f2.
		val f = topDependence.function
		assertTrue(f.isPlainEqual(f2.pullback(f1)))
	}
	
	
	////////////////////////////////////////////////////////////
	// Restrict Expression Rules
	////////////////////////////////////////////////////////////
	
	@Test
	def restrictExpression_01() {
		// From:  D:(f@E)
		// To:    f1@(D1: f2@E)
		// Where: D=Preimage(D1,f1) and f=f1 @ f2
		
		val equation = getEquation("restrictExpression_01", "X")
		
		
		// Capture the original AST nodes we need and extract D and f from them
		val originalRestrict = equation.expr as RestrictExpression
		val originalDependence = originalRestrict.expr as DependenceExpression

		val d = originalRestrict.restrictDomain.copy
		val f = originalDependence.function.copy

		RaiseDependence.apply(equation.expr)
		
		// The top-level node of the equation should now be the f1 dependence expression.
		assertTrue(equation.expr instanceof DependenceExpression)
		val outerDependence = equation.expr as DependenceExpression
		val f1 = outerDependence.function
		
		// Inside there is the D1 restriction expression.
		assertTrue(outerDependence.expr instanceof RestrictExpression)
		val updatedRestrict = outerDependence.expr as RestrictExpression
		val d1 = updatedRestrict.restrictDomain
		
		// Finally, there is an inner dependence function, f2, inside the restriction.
		assertTrue(updatedRestrict.expr instanceof DependenceExpression)
		val innerDependence = updatedRestrict.expr as DependenceExpression
		val f2 = innerDependence.function
		
		// We require that f = f1 @ f2.
		assertTrue(f.isPlainEqual(f2.pullback(f1.copy)))
		
		// We require that D is the preimage of D1 by f1.
		assertTrue(d.isPlainEqual(d1.preimage(f1)))
	}
	
	@Test
	def autoRestrictExpression_01() {
		// From:  case { auto: f @ E }
		// To:    f1 @ case { f2 @ (D1: f3 @ E) }
		// Where: f = f1@f2@f3 and the context domain of f is the preimage of D1 by f1@f2.
		
		val equation = getEquation("autoRestrictExpression_01", "X")
		
		// Capture the original AST nodes we need.
		val originalCase = equation.expr as CaseExpression
		val originalRestrict = originalCase.exprs.get(0) as AutoRestrictExpression
		val originalDependence = originalRestrict.expr as DependenceExpression
		
		// We will use the context domain of the original restriction (f)
		// as our original domain (D).
		val f = originalDependence.function.copy
		val d = originalDependence.contextDomain.copy 
		
		RaiseDependence.apply(equation.expr)
		
		// Since dependence raising was also applied to the case statement
		// (it's required for the auto-restrict to be correctly replaced with a standard restrict),
		// the top-level will be the f1 dependence.
		assertTrue(equation.expr instanceof DependenceExpression)
		val outerDependence = equation.expr as DependenceExpression
		val f1 = outerDependence.function
		
		// Inside f1 is our case statement.
		assertTrue(outerDependence.expr instanceof CaseExpression)
		val updatedCase = outerDependence.expr as CaseExpression
		
		// The case statement should only have one child, which is the dependence f2.
		assertEquals(1, updatedCase.exprs.size)
		assertTrue(updatedCase.exprs.get(0) instanceof DependenceExpression)
		val middleDependence = updatedCase.exprs.get(0) as DependenceExpression
		val f2 = middleDependence.function
		
		// Our updated restriction D1 (which is no longer an auto-restrict) is inside f2.
		assertTrue(middleDependence.expr instanceof RestrictExpression)
		val updatedRestriction = middleDependence.expr as RestrictExpression
		val d1 = updatedRestriction.restrictDomain
		
		// Finally, the f3 dependence is inside that restriction.
		assertTrue(updatedRestriction.expr instanceof DependenceExpression)
		val innerDependence = updatedRestriction.expr as DependenceExpression
		val f3 = innerDependence.function
		
		// We require that f = f1 @ f2 @ f3.
		assertTrue(f.isPlainEqual(f3.pullback(f2.copy.pullback(f1.copy))))
		
		// We require that D is the preimage of D1 by f1 @ f2.
		assertTrue(d.isPlainEqual(d1.preimage(f2.pullback(f1))))
	}
	
	@Test
	def autoRestrictExpression_02() {
		// From:  case { D1: f1@E1; auto: f2 @ E2 }
		// To:    f' @ case { f1' @ (D1': f1" @ E1); f2' @ (D2': f2" @ E2) }
		// Where: fn = f'@fn'@fn", D1 = Preimage(D1', f'@f1')
		//        and the context domain of f2 equals Preimage(D2', f'@f2')
		
		// Get the original equation and extract the required domains and dependences.
		val equation = getEquation("autoRestrictExpression_02", "X")
		
		val originalCase = equation.expr as CaseExpression
		
		val originalRestrict1 = originalCase.exprs.get(0) as RestrictExpression
		val originalDependence1 = originalRestrict1.expr as DependenceExpression
		
		val originalRestrict2 = originalCase.exprs.get(1) as AutoRestrictExpression
		val originalDependence2 = originalRestrict2.expr as DependenceExpression
		
		val d1 = originalRestrict1.restrictDomain.copy
		val d2 = originalDependence2.contextDomain.copy
		val f1 = originalDependence1.function.copy
		val f2 = originalDependence2.function.copy
		
		RaiseDependence.apply(equation.expr)

		// Since applied dependence raising to the entire expression (to fix the auto-restrict),
		// the top-level expression is the dependence f'.		
		assertTrue(equation.expr instanceof DependenceExpression)
		val outerDependence = equation.expr as DependenceExpression
		val fPrime = outerDependence.function
		
		// Inside there is our case expression, which must have two children.
		assertTrue(outerDependence.expr instanceof CaseExpression)
		val updatedCase = outerDependence.expr as CaseExpression
		assertEquals(2, updatedCase.exprs.size)
		
		// The first child is the dependence function f1'.
		// This contains our restriction D1' and the remaining term f1".
		assertTrue(updatedCase.exprs.get(0) instanceof DependenceExpression)
		val updatedDep1 = updatedCase.exprs.get(0) as DependenceExpression
		val f1Prime = updatedDep1.function
		
		assertTrue(updatedDep1.expr instanceof RestrictExpression)
		val updatedRestrict1 = updatedDep1.expr as RestrictExpression
		val d1Prime = updatedRestrict1.restrictDomain
		
		assertTrue(updatedRestrict1.expr instanceof DependenceExpression)
		val innermostDep1 = updatedRestrict1.expr as DependenceExpression
		val f1Prime2 = innermostDep1.function

		// The second child is the dependence function f2'.
		// This contains our restriction D2' and the remaining term f2".
		assertTrue(updatedCase.exprs.get(1) instanceof DependenceExpression)
		val updatedDep2 = updatedCase.exprs.get(1) as DependenceExpression
		val f2Prime = updatedDep2.function
		
		assertTrue(updatedDep2.expr instanceof RestrictExpression)
		val updatedRestrict2 = updatedDep2.expr as RestrictExpression
		val d2Prime = updatedRestrict2.restrictDomain
		
		assertTrue(updatedRestrict2.expr instanceof DependenceExpression)
		val innermostDep2 = updatedRestrict2.expr as DependenceExpression
		val f2Prime2 = innermostDep2.function
		
		// We require f1 = f' @ f1' @ f1"
		val fPrimeAtF1Prime = f1Prime.copy.pullback(fPrime.copy)
		assertTrue(f1.isPlainEqual(f1Prime2.pullback(fPrimeAtF1Prime.copy)))
		
		// We require f2 = f' @ f2' @ f2"
		val fPrimeAtF2Prime = f2Prime.copy.pullback(fPrime.copy)
		assertTrue(f2.isPlainEqual(f2Prime2.pullback(fPrimeAtF2Prime.copy)))
		
		// We require D1 = Preimage(D1', f' @ f1')
		assertTrue(d1.isEqual(d1Prime.preimage(fPrimeAtF1Prime)))
				
		// We require D2 = Preimage(D2', f' @ f2')
		assertTrue(d2.isEqual(d2Prime.preimage(fPrimeAtF2Prime)))
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
		assertTrue(equation.expr instanceof DependenceExpression)
		val topDependence = equation.expr as DependenceExpression
		val f1Prime = topDependence.function
		
		assertTrue(topDependence.expr instanceof BinaryExpression)
		val binaryExpr = topDependence.expr as BinaryExpression
		
		assertTrue(binaryExpr.left instanceof DependenceExpression)
		assertTrue(binaryExpr.right instanceof DependenceExpression)
		val f2Prime = (binaryExpr.left as DependenceExpression).function
		val f3Prime = (binaryExpr.right as DependenceExpression).function
		
		// Make sure that f1' @ f2' and f1' @ f3' are the expected values.
		val firstActual = f2Prime.pullback(f1Prime.copy)
		assertTrue(firstExpected.isPlainEqual(firstActual))

		val secondActual = f3Prime.pullback(f1Prime)
		assertTrue(secondExpected.isPlainEqual(secondActual))
	}
	
	
	////////////////////////////////////////////////////////////
	// Multi-Arg and Case Expression Rules
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
		
		multiArgExpr.exprs.forEach[child | assertTrue(child instanceof DependenceExpression)]
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
	
	@Test
	def caseTest_01() {
		// From:  case {f1@E1, f2@E2, ...}
		// To:    (f')@ case{f1'@E1, f2'@E2, ...}
		// Where: fn = f' @ fn'
		
		// Get the equation for the expression under test,
		// extract the original dependence functions (mapped by their inner expression),
		// then apply dependence raising.
		val equation = getEquation("caseTest_01", "X")
		val expectedFunctions = (equation.expr as CaseExpression).exprs
			.map[expr | expr as DependenceExpression]
			.toMap[expr | expr.expr]
			.mapValues[expr | expr.function]
			.toHashMap

		RaiseDependence.apply(equation.expr)
		
		// The equation should now have a dependence function at the top level,
		// a case expression in that, and dependence expressions as the children.
		assertTrue(typeof(DependenceExpression).isInstance(equation.expr))
		val topDependence = equation.expr as DependenceExpression
		val commonFactor = topDependence.function
		
		assertTrue(typeof(CaseExpression).isInstance(topDependence.expr))
		val caseExpr = topDependence.expr as CaseExpression
		
		caseExpr.exprs.forEach[child | assertTrue(child instanceof DependenceExpression)]
		val remainingTerms = caseExpr.exprs
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
	
	
	////////////////////////////////////////////////////////////
	// Normalizing Undoes Dependence Raising
	////////////////////////////////////////////////////////////

	// Note: this test does not work, as the normalized original program outputs "X = 7",
	// but the normalized program after dependence raising outputs "X = 7[]",
	// as there is a dependence function with no outputs (i.e., map to a scalar)
	// around the constant, which normalizing does not remove.
	// However, looking at the output and AST shows that this works as expected as of 16-Apr-2024.
//	@Test def normalizeUndoesRaising_Test01() { normalizeTest("wrapConstantExpression_01", "X") }
	
	@Test def normalizeUndoesRaising_Test02() { normalizeTest("wrapVariableExpression_01", "X") }
	
	@Test def normalizeUndoesRaising_Test03() { normalizeTest("wrapVariableExpression_02", "X") }
	
	@Test def normalizeUndoesRaising_Test04() { normalizeTest("wrapIndexExpression_01", "X") }
	
	@Test def normalizeUndoesRaising_Test05() { normalizeTest("wrapIndexExpression_02", "X") }
	
	@Test def normalizeUndoesRaising_Test06() { normalizeTest("nestedDependenceFunction_01", "X") }
	
	@Test def normalizeUndoesRaising_Test07() { normalizeTest("restrictExpression_01", "X") }
	
	@Test def normalizeUndoesRaising_Test08() { normalizeTest("autoRestrictExpression_01", "X") }
	
	@Test def normalizeUndoesRaising_Test09() { normalizeTest("autoRestrictExpression_02", "X") }
	
	@Test def normalizeUndoesRaising_Test10() { normalizeTest("unaryExpression_01", "X") }
	
	@Test def normalizeUndoesRaising_Test11() { normalizeTest("simpleBinaryExpression_01", "X") }
	
	@Test def normalizeUndoesRaising_Test12() { normalizeTest("binaryExpressionBecomesNested_01", "X") }
	
	@Test def normalizeUndoesRaising_Test13() { normalizeTest("binaryExpressionBecomesNested_02", "X") }
	
	@Test def normalizeUndoesRaising_Test14() { normalizeTest("binaryExpressionBecomesNested_03", "X") }
	
	@Test def normalizeUndoesRaising_Test15() { normalizeTest("binaryExpressionBecomesNested_04", "X") }
	
	@Test def normalizeUndoesRaising_Test16() { normalizeTest("multiArgTest_01", "X") }
	
	@Test def normalizeUndoesRaising_Test17() { normalizeTest("caseTest_01", "X") }
	
	@Test def normalizeUndoesRaising_Test18() { normalizeTest("prefixScan", "X") }

	/**
	 * Used by several tests to ensure that the system can be normalized,
	 * dependence raising can be applied, and then normalized again
	 * to recreate the original normalization.
	 */
	static def normalizeTest(String systemName, String equationName) {
		val equation = getEquation(systemName, equationName)
		
		LiftAutoRestrict.apply(equation)
		Normalize.apply(equation)
		val expected = AShow.print(equation)
		
		RaiseDependence.apply(equation)
		Normalize.apply(equation)
		val actual = AShow.print(equation)
		
		assertEquals(expected, actual)
	}
}