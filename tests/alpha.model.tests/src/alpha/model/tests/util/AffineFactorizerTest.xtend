package alpha.model.tests.util

import alpha.model.util.AffineFactorizer
import fr.irisa.cairn.jnimap.isl.ISLMultiAff
import org.junit.Test

import static org.junit.Assert.*
import fr.irisa.cairn.jnimap.isl.ISLContext
import fr.irisa.cairn.jnimap.isl.ISLDimType
import fr.irisa.cairn.jnimap.isl.ISLMatrix
import java.util.List

class AffineFactorizerTest {
	////////////////////////////////////////////////////////////
	// Helper Methods
	////////////////////////////////////////////////////////////

	def private static stringToMultiAff(String str) {
		return ISLMultiAff.buildFromString(ISLContext.instance, str)
	}

	def private static stringToMatrix(String str) {
		return AffineFactorizer.expressionToMatrix(stringToMultiAff(str))		
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
	
	def private static assertMatrixIsCorrect(List<List<Integer>> expected, ISLMatrix actual) {
		// Check that the dimensions are correct.
		val rows = expected.size
		val cols = expected.get(0).size
		assertEquals("Wrong number of rows", rows, actual.nbRows)
		assertEquals("Wrong number of cols", cols, actual.nbCols)
		
		// Check each row/column.
		for (row : 0 ..< rows) {
			for (col : 0 ..< cols) {
				val message = "Wrong value at row " + row + ", col " + col
				assertEquals(message, expected.get(row).get(col), actual.getElement(row, col))
			}
		}
	}


	////////////////////////////////////////////////////////////
	// Unit Tests - ISL Bindings
	////////////////////////////////////////////////////////////
	
	@Test
	def dropCols() {
		var mat = stringToMatrix("{ [i,j,k] -> [k,i,j] }")
		assertEquals(3, mat.nbCols)
		mat = mat.dropCols(2,1)
		assertEquals(2, mat.nbCols)
	}

	@Test
	def hermiteNormalForm() {
		// This test ensures that the HNF computation not only works,
		// but that it works correctly with the affine factorizer's
		// expression-to-matrix function.
		// Note: ISL's HNF computation is column-oriented as of writing,
		// so if this test fails, double check that this is still the case
		// and that the affine factorizer is written to expect this. 

		val input = stringToMatrix("{ [i,j,k] -> [i+k,i+k+j]}")
		val hnf_result = input.leftHermite
		val h = hnf_result.h
		val u = hnf_result.u
		val q = hnf_result.q
		
		val hExpected = #[
			#[1, 0],
			#[0, 1],
			#[1, 0],
			#[0, 0]
		]
		val uExpected = #[
			#[1, -1],
			#[0,  1]
		]
		val qExpected = #[
			#[1, 1],
			#[0, 1]
		]
		
		assertMatrixIsCorrect(hExpected, h)
		assertMatrixIsCorrect(uExpected, u)
		assertMatrixIsCorrect(qExpected, q)
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
		
		// The matrix should have 3 rows (2 inputs + 1 constant) and 2 columns.
		assertEquals(3, result.nbRows)
		assertEquals(2, result.nbCols)
		
		// All of the coefficients should be zero.
		for (row : 0 ..< 3) {
			for (col : 0 ..< 2) {
				assertEquals(0, result.getElement(row, col))
			}
		}
	}
	
	@Test
	def expressionToMatrix_02() {
		val input = stringToMultiAff("[N] -> { [i,j] -> [2N -3j +4i +1, 7-2i+3j-4N] }")
		val result = AffineFactorizer.expressionToMatrix(input)
		
		// The matrix should have 4 rows (1 param + 2 inputs + 1 constant) and 2 columns.
		assertEquals(4, result.nbRows)
		assertEquals(2, result.nbCols)
		
		// Check all the coefficients.
		assertEquals(2, result.getElement(0,0))     // Eq 1, N
		assertEquals(4, result.getElement(1,0))     // Eq 1, i
		assertEquals(-3, result.getElement(2,0))    // Eq 1, j
		assertEquals(1, result.getElement(3,0))     // Eq 1, constant
		
		assertEquals(-4, result.getElement(0,1))    // Eq 2, N
		assertEquals(-2, result.getElement(1,1))    // Eq 2, i
		assertEquals(3, result.getElement(2,1))     // Eq 2, j
		assertEquals(7, result.getElement(3,1))     // Eq 2, constant
	}
	
	@Test
	def expressionToMatrix_03() {
		val input = stringToMultiAff("{ [] -> [7] }")
		val result = AffineFactorizer.expressionToMatrix(input)
		
		// This should be a 1x1 matrix with coefficient 7.
		assertEquals(1, result.nbRows)
		assertEquals(1, result.nbCols)
		assertEquals(7, result.getElement(0,0))
	}
	
	@Test
	def reduceHermiteDimensionality_01() {
		// Expecting nothing to be dropped.
		val hOriginal = ISLMatrix.buildFromLongMatrix(#[
			#[0, 0],
			#[1, 1],
			#[2, 0]
		])
		val qOriginal = ISLMatrix.buildFromLongMatrix(#[
			#[1, 1],
			#[2, 2]
		])
		
		val result = AffineFactorizer.reduceHermiteDimensionality(hOriginal, qOriginal)
		
		val expectedH = #[ #[0, 0], #[1, 1], #[2, 0] ]
		val expectedQ = #[ #[1, 1], #[2, 2] ]
		
		assertMatrixIsCorrect(expectedH, result.key)
		assertMatrixIsCorrect(expectedQ, result.value)
	}
	
	@Test
	def reduceHermiteDimensionality_02() {
		// Expecting 1 column to be dropped from H, and 1 row from Q.
		val hOriginal = ISLMatrix.buildFromLongMatrix(#[
			#[0, 0],
			#[1, 0],
			#[2, 0]
		])
		val qOriginal = ISLMatrix.buildFromLongMatrix(#[
			#[1, 1],
			#[2, 2]
		])
		
		val result = AffineFactorizer.reduceHermiteDimensionality(hOriginal, qOriginal)
		
		val expectedH = #[ #[0], #[1], #[2] ]
		val expectedQ = #[ #[1, 1] ]
		
		assertMatrixIsCorrect(expectedH, result.key)
		assertMatrixIsCorrect(expectedQ, result.value)
	}
	
	@Test
	def reduceHermiteDimensionality_03() {
		// Expecting 2 columns to be dropped from H, and 2 rows from Q.
		val hOriginal = ISLMatrix.buildFromLongMatrix(#[
			#[0, 0, 0],
			#[1, 0, 0],
			#[2, 0, 0]
		])
		val qOriginal = ISLMatrix.buildFromLongMatrix(#[
			#[1, 1],
			#[2, 2],
			#[3, 3]
		])
		
		val result = AffineFactorizer.reduceHermiteDimensionality(hOriginal, qOriginal)
		
		val expectedH = #[ #[0], #[1], #[2] ]
		val expectedQ = #[ #[1, 1] ]
		
		assertMatrixIsCorrect(expectedH, result.key)
		assertMatrixIsCorrect(expectedQ, result.value)
	}
}