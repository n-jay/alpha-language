package alpha.model.tests.util

import alpha.model.util.AffineFactorizer
import fr.irisa.cairn.jnimap.isl.ISLMultiAff
import org.junit.Test

import static org.junit.Assert.*
import fr.irisa.cairn.jnimap.isl.ISLContext

class AffineFactorizerTest {
	////////////////////////////////////////////////////////////
	// Helper Methods
	////////////////////////////////////////////////////////////
	def private static stringToMultiAff(String str) {
		return ISLMultiAff.buildFromString(ISLContext.instance, str)
	}

	def private static stringsToMultiAff(String... strs) {
		return strs.map[stringToMultiAff]
	}
	
	def private static mergeExpressionsTest(String expectedOutput, String... inputs) {
		val inputAffs = stringsToMultiAff(inputs)
		val expectedAff = stringToMultiAff(expectedOutput)
		val actualAff = AffineFactorizer.mergeExpressions(inputAffs)
		assertTrue(expectedAff.isPlainEqual(actualAff))
	}
	
	
	////////////////////////////////////////////////////////////
	// Unit Tests
	////////////////////////////////////////////////////////////
	
	@Test
	def mergeExpressions_oneInput() {
		val inputs = #["[N] -> { [x,y,z] -> [x+y,z] }"]
		val expectedOutput = inputs.get(0)
		mergeExpressionsTest(expectedOutput, inputs)
	}
	
	@Test
	def mergeExpressions_twoInputs() {
		val inputs = #[
			"[N] -> { [p,q,r] -> [p+q,q+r] }",
			"[N] -> { [p,q,r] -> [r,N-q,p+2] }"
		]
		val expectedOutput = "[N] -> { [p,q,r] -> [p+q,q+r,r,N-q,p+2] }"
		mergeExpressionsTest(expectedOutput, inputs)
	}

	@Test
	def mergeExpressions_threeInputs() {
		val inputs = #[
			"[N] -> { [i,j,k,l] -> [j,k] }",
			"[N] -> { [i,j,k,l] -> [k-j] }",
			"[N] -> { [i,j,k,l] -> [j-k, i-j-k+l] }"
		]
		val expectedOutput = "[N] -> { [i,j,k,l] -> [j,k,k-j,j-k,i-j-k+l] }"
		mergeExpressionsTest(expectedOutput, inputs)
	}
}