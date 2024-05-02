package alpha.model.tests.transformations

import alpha.model.AlphaModelLoader
import alpha.model.CaseExpression
import alpha.model.DependenceExpression
import alpha.model.RestrictExpression
import alpha.model.StandardEquation
import alpha.model.transformation.StandardizeNames
import java.util.List
import org.junit.Test

import static org.junit.Assert.*

import static extension alpha.commands.UtilityBase.*

class StandardizeNamesTest {
	/** The path to the Alpha file for these unit tests. */
	static val alphaFile = "resources/src-valid/transformation-tests/standardize-names/standardizeNames.alpha";
	
	///////////////////////////////////////////////////
	// Unit Tests
	///////////////////////////////////////////////////
	
	@Test
	def useEquationNames() {
		val equation = getEquation("useEquationNames", "Y")
		val expectedNames = equation.indexNames
		assertNamesCorrect(expectedNames, equation)
	}
	
	@Test
	def useVariableNames() {
		val equation = getEquation("useVariableNames", "Y")
		val expectedNames = equation.variable.domain.indexNames
		assertNamesCorrect(expectedNames, equation)
	}
	
	///////////////////////////////////////////////////
	// Helper Functions
	///////////////////////////////////////////////////
	
	/** Gets the desired system for these unit tests. */
	static def getEquation(String system, String equation) {
		return AlphaModelLoader.loadModel(alphaFile)
			.GetSystem(system)
			.GetSystemBody(0)
			.GetEquation(equation)
	}
	
	/**
	 * Asserts that the names are correct.
	 * The equation's expression is expected to be of the following form:
	 * 
	 * case {
	 *     D1: R1@E1;
	 *     D2: R2@E2;
	 * }
	 */
	def static assertNamesCorrect(List<String> expectedNames, StandardEquation equation) {
		StandardizeNames.apply(equation)
		
		// Capture what the AST became.
		// We expect a case statement with two cases.
		// Each case is of the form "restrict: dependence@variable".
		val caseExpr = equation.expr as CaseExpression

		val restrict1 = caseExpr.exprs.get(0) as RestrictExpression
		assertRestrictNamesCorrect(expectedNames, restrict1)
		
		val dependence1 = restrict1.expr as DependenceExpression
		assertDependenceNamesCorrect(expectedNames, dependence1)
		
		val restrict2 = caseExpr.exprs.get(1) as RestrictExpression
		assertRestrictNamesCorrect(expectedNames, restrict2)
		
		val dependence2 = restrict2.expr as DependenceExpression
		assertDependenceNamesCorrect(expectedNames, dependence2)
	}
	
	/** Checks that the names of a restrict expression were updated correctly. */
	def static assertRestrictNamesCorrect(List<String> expectedNames, RestrictExpression expr) {
		assertTrue(expectedNames.elementsEqual(expr.contextDomain.indexNames))
		assertTrue(expectedNames.elementsEqual(expr.expressionDomain.indexNames))
		assertTrue(expectedNames.elementsEqual(expr.restrictDomain.indexNames))
	}
	
	/** Checks that the names of a dependence expression were updated correctly. */
	def static assertDependenceNamesCorrect(List<String> expectedNames, DependenceExpression expr) {
		assertTrue(expectedNames.elementsEqual(expr.contextDomain.indexNames))
		assertTrue(expectedNames.elementsEqual(expr.expressionDomain.indexNames))
		assertTrue(expectedNames.elementsEqual(expr.function.space.inputNames))
		
		// We don't care what the output names are, just that they exist (i.e., not null or empty).
		val outputNames = expr.function.space.outputNames
		assertEquals(outputNames.length, expr.function.nbOutputs)
		for (name : outputNames) {
			assertNotNull(name)
			assertNotEquals("", name)
		}
	}
}