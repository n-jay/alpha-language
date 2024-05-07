package alpha.model.tests

import org.junit.Test

import static alpha.commands.UtilityBase.GetSystem
import static alpha.model.tests.util.AlphaTestUtil.loadValidFile
import static org.junit.Assert.*

import static extension alpha.model.ComplexityCalculator.complexity

class ComplexityCalculatorTest {
	
	@Test
	def void testComplexity_01() {
		val root = loadValidFile('transformation-tests/simplify-expressions/scalarReduction1.alpha') 
		val system = GetSystem(root, 'scalarReduction1a')
		
		assertEquals(system.complexity, 1)
	}
	
	@Test
	def void testComplexity_02() {
		val root = loadValidFile('transformation-reduction-tests/normalize-reduction-deep/normalizeReductionDeep.alpha') 
		
		assertEquals(GetSystem(root, 'topLevelReduction').complexity, 2)
		assertEquals(GetSystem(root, 'nestedReduction_01').complexity, 3)
		assertEquals(GetSystem(root, 'nestedReduction_02').complexity, 4)
		assertEquals(GetSystem(root, 'nestedReduction_03').complexity, 4)
	}
	
	@Test
	def void testComplexity_03() {
		val root = loadValidFile('transformation-tests/substitute-by-def/autoRestrict1.alpha')
		val system = GetSystem(root, 'autoRestrict1a')

		// this program has multiple parameters and should fail
		assertThrows(typeof(UnsupportedOperationException), [|system.complexity])
		
	}
}