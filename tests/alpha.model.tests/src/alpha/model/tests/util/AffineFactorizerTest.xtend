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
	
	
	////////////////////////////////////////////////////////////
	// Decomposing the Merged Expression
	////////////////////////////////////////////////////////////
	
	@Test
	def expressionToMatrix_01() {
		val input = stringToMultiAff("{ [i,j] -> [0, 0] }")
		val result = AffineFactorizer.expressionToMatrix(input)
		
		// The matrix should have 2 rows and 3 columns (2 inputs + 1 constant).
		assertEquals(2, result.nbRows)
		assertEquals(3, result.nbCols)
		
		// All of the coefficients should be zero.
		for (row : 0 ..< 2) {
			for (col : 0 ..< 3) {
				assertEquals(0, result.getElement(row, col).intValue)
			}
		}
	}
	
	@Test
	def expressionToMatrix_02() {
		val input = stringToMultiAff("[N] -> { [i,j] -> [2N -3j +4i +1, 7-2i+3j-4N] }")
		val result = AffineFactorizer.expressionToMatrix(input)
		
		// The matrix should have 2 rows and 4 columns (1 param + 2 inputs + 1 constant).
		assertEquals(2, result.nbRows)
		assertEquals(4, result.nbCols)
		
		// Check all the coefficients.
		assertEquals(2, result.getElement(0,0).intValue)	// Eq 1, N
		assertEquals(4, result.getElement(0,1).intValue)	// Eq 1, i
		assertEquals(-3, result.getElement(0,2).intValue)	// Eq 1, j
		assertEquals(1, result.getElement(0,3).intValue)	// Eq 1, constant
		
		assertEquals(-4, result.getElement(1,0).intValue)	// Eq 2, N
		assertEquals(-2, result.getElement(1,1).intValue)	// Eq 2, i
		assertEquals(3, result.getElement(1,2).intValue)	// Eq 2, j
		assertEquals(7, result.getElement(1,3).intValue)	// Eq 2, constant
	}
	
	@Test
	def expressionToMatrix_03() {
		val input = stringToMultiAff("{ [] -> [7] }")
		val result = AffineFactorizer.expressionToMatrix(input)
		
		// This should be a 1x1 matrix with coefficient 7.
		assertEquals(1, result.nbRows)
		assertEquals(1, result.nbCols)
		assertEquals(7, result.getElement(0,0).intValue)
	}
}