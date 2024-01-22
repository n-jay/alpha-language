package alpha.model.tests.util

import alpha.model.util.AffineFactorizer
import fr.irisa.cairn.jnimap.isl.ISLMultiAff
import org.junit.Test

import static org.junit.Assert.*
import fr.irisa.cairn.jnimap.isl.ISLContext
import fr.irisa.cairn.jnimap.isl.ISLDimType

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
	// Unit Tests - Merging Expressions Into One
	////////////////////////////////////////////////////////////
	
	@Test
	def nameOutputs_01() {
		val input = stringsToMultiAff(
			"[N] -> { [i,j] -> [j,i] }",
			"[N] -> { [i,j] -> [i+j,i-j] }"
		)
		val result = AffineFactorizer.nameExpressionOutputs(input)
		
		// Ensure the names are all correct.
		assertEquals("orig_out_0", result.get(0).space.getDimName(ISLDimType.isl_dim_out, 0))
		assertEquals("orig_out_1", result.get(0).space.getDimName(ISLDimType.isl_dim_out, 1))
		assertEquals("orig_out_2", result.get(1).space.getDimName(ISLDimType.isl_dim_out, 0))
		assertEquals("orig_out_3", result.get(1).space.getDimName(ISLDimType.isl_dim_out, 1))
		
		// During development, lazy evaluation caused names to be re-generated
		// each time the objects are accessed, so double-check that this isn't an issue.
		assertEquals("orig_out_0", result.get(0).space.getDimName(ISLDimType.isl_dim_out, 0))
		assertEquals("orig_out_1", result.get(0).space.getDimName(ISLDimType.isl_dim_out, 1))
		assertEquals("orig_out_2", result.get(1).space.getDimName(ISLDimType.isl_dim_out, 0))
		assertEquals("orig_out_3", result.get(1).space.getDimName(ISLDimType.isl_dim_out, 1))
	}
	
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