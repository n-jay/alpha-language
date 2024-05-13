package alpha.codegen.tests.isl;

import alpha.codegen.isl.MemoryUtils;
import alpha.model.util.ISLUtil;
import fr.irisa.cairn.jnimap.isl.ISLPWQPolynomial;
import fr.irisa.cairn.jnimap.isl.ISLSet;
import org.junit.Assert;
import org.junit.Test;

/**
 * Tests the memory utility functions.
 * 
 * Note: when testing rank, the calculations can report as being incorrect
 * if the lexicographic minimum (typically, the origin) of the provided set
 * is included as a point in the expected rank function.
 * If you encounter this, you should condition the rank polynomial's domain
 * such that it doesn't include this point.
 */
@SuppressWarnings("all")
public class MemoryUtilsTest {
  @Test
  public void rankTest_emptySet() {
    MemoryUtilsTest.assertExpectedRank("[N]->{[i]: false}", "[N,i]->{0}");
  }

  @Test
  public void rankTest_point() {
    MemoryUtilsTest.assertExpectedRank("[N]->{[i]: i=N}", "[N,i]->{0}");
  }

  @Test
  public void rankTest_lineSegment() {
    MemoryUtilsTest.assertExpectedRank("[N]->{[i]: 0<=i<N}", "[N,i]->{ i: 0<i<N }");
  }

  @Test
  public void rankTest_triangle() {
    MemoryUtilsTest.assertExpectedRank("[N]->{[i,j]: 0<=j<=i<N}", "[N,i,j]->{ (1/2 * i^2) + (1/2 * i) + j : 0<=j<=i and 0<i<N}");
  }

  @Test
  public void rankTest_square() {
    MemoryUtilsTest.assertExpectedRank("[N]->{[i,j]: 0<=i,j<N}", "[N,i,j]->{ (N*i)+j : 0<=i,j<N and (i>0 or j>0)}");
  }

  public static void assertExpectedRank(final String setDescriptor, final String rankDescriptor) {
    final ISLSet startSet = ISLUtil.toISLSet(setDescriptor);
    final ISLPWQPolynomial actualRank = MemoryUtils.rank(startSet);
    final ISLPWQPolynomial expectedRank = ISLUtil.toISLPWQPolynomial(rankDescriptor);
    final ISLPWQPolynomial difference = expectedRank.sub(actualRank);
    Assert.assertTrue(difference.isZero());
  }
}
