package alpha.codegen.tests.isl

import alpha.codegen.isl.MemoryUtils
import alpha.model.util.ISLUtil
import org.junit.Test

import static org.junit.Assert.*

/**
 * Tests the memory utility functions.
 * 
 * Note: when testing rank, the calculations can report as being incorrect
 * if the lexicographic minimum (typically, the origin) of the provided set
 * is included as a point in the expected rank function.
 * If you encounter this, you should condition the rank polynomial's domain
 * such that it doesn't include this point.
 */
class MemoryUtilsTest {
	@Test def rankTest_lineSegment() {
		assertExpectedRank("[N]->{[i]: 0<=i<N}", "[N,i]->{ i: 0<i<N }")
	}
	
	@Test def rankTest_triangle() {
		assertExpectedRank("[N]->{[i,j]: 0<=j<=i<N}", "[N,i,j]->{ (1/2 * i^2) + (1/2 * i) + j : 0<=j<=i and 0<i<N}")
	}
	
	@Test def rankTest_square() {
		assertExpectedRank("[N]->{[i,j]: 0<=i,j<N}", "[N,i,j]->{ (N*i)+j : 0<=i,j<N and (i>0 or j>0)}")
	}
	
	def static assertExpectedRank(String setDescriptor, String rankDescriptor) {
		val startSet = ISLUtil.toISLSet(setDescriptor)
		val actualRank = MemoryUtils.rank(startSet)
		val expectedRank = ISLUtil.toISLPWQPolynomial(rankDescriptor)
		
		// Checking that the expected and actual ranks are the same doesn't work as expected.
		// Instead, take their difference and check that it equals zero.
		val difference = expectedRank.sub(actualRank)
		assertTrue(difference.isZero)
	}
}