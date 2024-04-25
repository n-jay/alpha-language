package alpha.model.tests.util;

import alpha.model.util.Face;
import fr.irisa.cairn.jnimap.isl.ISLBasicSet;
import fr.irisa.cairn.jnimap.isl.ISLContext;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class FaceTest {
  /**
   * Creates a face from the desired set.
   */
  private static Face makeFace(final String setDescriptor) {
    final ISLBasicSet set = ISLBasicSet.buildFromString(ISLContext.getInstance(), setDescriptor).removeRedundancies();
    return new Face(set);
  }

  /**
   * The empty set.
   */
  public static Face emptySet() {
    return FaceTest.makeFace("{[i,j]: 0<i<j and j<0}");
  }

  /**
   * A set containing a single point.
   */
  public static Face vertex() {
    return FaceTest.makeFace("{[i,j]: i=0 and j=1}");
  }

  /**
   * A line which is infinite in both directions.
   */
  public static Face infiniteLine() {
    return FaceTest.makeFace("{[i]:}");
  }

  /**
   * A ray, or a line which has one point and extends infinitely in one direction.
   */
  public static Face ray() {
    return FaceTest.makeFace("{[i]: 0<=i}");
  }

  /**
   * A line segment which is defined between two constants.
   */
  public static Face constantLineSegment() {
    return FaceTest.makeFace("{[i]: 0<=i<=10}");
  }

  /**
   * A line segment from 0 to N.
   */
  public static Face parameterizedLineSegment() {
    return FaceTest.makeFace("[N]->{[i]: 0<=i<N}");
  }

  /**
   * Checks that the number of children of a face is correct.
   */
  public static void assertChildCount(final Face face, final int expectedChildren) {
    Assert.assertEquals(expectedChildren, face.generateChildren().size());
  }

  @Test
  public void testChildCount_01() {
    FaceTest.assertChildCount(FaceTest.emptySet(), 0);
  }

  @Test
  public void testChildCount_02() {
    FaceTest.assertChildCount(FaceTest.vertex(), 0);
  }

  @Test
  public void testChildCount_03() {
    FaceTest.assertChildCount(FaceTest.infiniteLine(), 0);
  }

  @Test
  public void testChildCount_04() {
    FaceTest.assertChildCount(FaceTest.ray(), 1);
  }

  @Test
  public void testChildCount_05() {
    FaceTest.assertChildCount(FaceTest.constantLineSegment(), 0);
  }

  @Test
  public void testChildCount_06() {
    FaceTest.assertChildCount(FaceTest.parameterizedLineSegment(), 2);
  }

  /**
   * Checks that the dimensionality of a face is correct.
   */
  public static void assertDimensionality(final Face face, final int expectedDimensionality) {
    Assert.assertEquals(expectedDimensionality, face.getDimensionality());
  }

  @Test
  public void testDimensionality_01() {
    FaceTest.assertDimensionality(FaceTest.emptySet(), 0);
  }

  @Test
  public void testDimensionality_02() {
    FaceTest.assertDimensionality(FaceTest.vertex(), 0);
  }

  @Test
  public void testDimensionality_03() {
    FaceTest.assertDimensionality(FaceTest.infiniteLine(), 1);
  }

  @Test
  public void testDimensionality_04() {
    FaceTest.assertDimensionality(FaceTest.ray(), 1);
  }

  @Test
  public void testDimensionality_05() {
    FaceTest.assertDimensionality(FaceTest.parameterizedLineSegment(), 1);
  }

  /**
   * If a line segment is bounded by two constants, the constraints are effectively saturated,
   * resulting in the face being reported as being effectively the same as a vertex.
   */
  @Test
  public void testDimensionality_06() {
    FaceTest.assertDimensionality(FaceTest.constantLineSegment(), 0);
  }
}
