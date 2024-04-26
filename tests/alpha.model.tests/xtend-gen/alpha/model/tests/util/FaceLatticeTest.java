package alpha.model.tests.util;

import alpha.model.util.CommonExtensions;
import alpha.model.util.Face;
import alpha.model.util.FaceLattice;
import fr.irisa.cairn.jnimap.isl.ISLBasicSet;
import fr.irisa.cairn.jnimap.isl.ISLContext;
import fr.irisa.cairn.jnimap.isl.ISLVertices;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.junit.Assert;
import org.junit.Test;

/**
 * Note: all the old unit tests from the previous implementation of the face lattice
 * are still present, but commented out. This is intentional, and will be fixed
 * when GitHub Issue #29 (link below) is addressed.
 * 
 * https://github.com/CSU-CS-Melange/alpha-language/issues/29
 */
@SuppressWarnings("all")
public class FaceLatticeTest {
  /**
   * Creates a face from the desired set.
   */
  private static FaceLattice makeLattice(final String setDescriptor) {
    final ISLBasicSet set = ISLBasicSet.buildFromString(ISLContext.getInstance(), setDescriptor).removeRedundancies();
    return FaceLattice.create(set);
  }

  /**
   * The empty set.
   */
  public static FaceLattice emptySet() {
    return FaceLatticeTest.makeLattice(FaceTest.emptySetString);
  }

  /**
   * A set containing a single point.
   */
  public static FaceLattice vertex() {
    return FaceLatticeTest.makeLattice(FaceTest.vertexString);
  }

  /**
   * A line which is infinite in both directions.
   */
  public static FaceLattice infiniteLine() {
    return FaceLatticeTest.makeLattice(FaceTest.infiniteLineString);
  }

  /**
   * A ray, or a line which has one point and extends infinitely in one direction.
   */
  public static FaceLattice ray() {
    return FaceLatticeTest.makeLattice(FaceTest.rayString);
  }

  /**
   * A line segment which is defined between two constants.
   */
  public static FaceLattice constantLineSegment() {
    return FaceLatticeTest.makeLattice(FaceTest.constantLineSegmentString);
  }

  /**
   * A line segment from 0 to N.
   */
  public static FaceLattice parameterizedLineSegment() {
    return FaceLatticeTest.makeLattice(FaceTest.parameterizedLineSegmentString);
  }

  public static void assertRootMatchesInput(final String descriptor) {
    final ISLBasicSet basicSet = ISLBasicSet.buildFromString(ISLContext.getInstance(), descriptor);
    final FaceLattice lattice = FaceLatticeTest.makeLattice(descriptor);
    Assert.assertTrue(basicSet.isEqual(lattice.getRoot().toBasicSet()));
  }

  @Test
  public void testRootMatchesInput_01() {
    FaceLatticeTest.assertRootMatchesInput(FaceTest.emptySetString);
  }

  @Test
  public void testRootMatchesInput_02() {
    FaceLatticeTest.assertRootMatchesInput(FaceTest.vertexString);
  }

  @Test
  public void testRootMatchesInput_03() {
    FaceLatticeTest.assertRootMatchesInput(FaceTest.infiniteLineString);
  }

  @Test
  public void testRootMatchesInput_04() {
    FaceLatticeTest.assertRootMatchesInput(FaceTest.rayString);
  }

  @Test
  public void testRootMatchesInput_05() {
    FaceLatticeTest.assertRootMatchesInput(FaceTest.constantLineSegmentString);
  }

  @Test
  public void testRootMatchesInput_06() {
    FaceLatticeTest.assertRootMatchesInput(FaceTest.parameterizedLineSegmentString);
  }

  public static void assertVerticesMatchIsl(final FaceLattice lattice) {
    final ISLVertices islVerticesList = lattice.getRoot().toBasicSet().computeVertices();
    int _nbVertex = islVerticesList.getNbVertex();
    final Function1<Integer, ISLBasicSet> _function = (Integer it) -> {
      return islVerticesList.getVertexAt((it).intValue()).getExpr().toBasicSet();
    };
    final Function1<ISLBasicSet, ISLBasicSet> _function_1 = (ISLBasicSet it) -> {
      return it.intersect(lattice.getRoot().toBasicSet());
    };
    final ArrayList<ISLBasicSet> islVertices = CommonExtensions.<ISLBasicSet>toArrayList(IterableExtensions.<ISLBasicSet, ISLBasicSet>map(IterableExtensions.<Integer, ISLBasicSet>map(new ExclusiveRange(0, _nbVertex, true), _function), _function_1));
    final Function1<Face, ISLBasicSet> _function_2 = (Face it) -> {
      return it.toBasicSet();
    };
    final ArrayList<ISLBasicSet> latticeVertices = CommonExtensions.<ISLBasicSet>toArrayList(ListExtensions.<Face, ISLBasicSet>map(lattice.getVertices(), _function_2));
    Assert.assertEquals(islVertices.size(), latticeVertices.size());
    for (final ISLBasicSet islVertex : islVertices) {
      final Function1<ISLBasicSet, Boolean> _function_3 = (ISLBasicSet it) -> {
        return Boolean.valueOf(it.copy().isEqual(islVertex.copy()));
      };
      Assert.assertTrue(IterableExtensions.<ISLBasicSet>exists(latticeVertices, _function_3));
    }
  }

  @Test
  public void testVertices_01() {
    final FaceLattice lattice = FaceLatticeTest.emptySet();
    final List<Face> vertices = lattice.getVertices();
    Assert.assertEquals(1, vertices.size());
    Assert.assertTrue(vertices.get(0).toBasicSet().isEmpty());
  }

  @Test
  public void testVertices_02() {
    FaceLatticeTest.assertVerticesMatchIsl(FaceLatticeTest.vertex());
  }

  @Test
  public void testVertices_03() {
    FaceLatticeTest.assertVerticesMatchIsl(FaceLatticeTest.infiniteLine());
  }

  @Test
  public void testVertices_04() {
    FaceLatticeTest.assertVerticesMatchIsl(FaceLatticeTest.ray());
  }

  @Test
  public void testVertices_05() {
    final FaceLattice lattice = FaceLatticeTest.constantLineSegment();
    final List<Face> vertices = lattice.getVertices();
    Assert.assertEquals(1, vertices.size());
    Assert.assertTrue(vertices.get(0).toBasicSet().isEqual(lattice.getRoot().toBasicSet()));
  }

  @Test
  public void testVertices_06() {
    FaceLatticeTest.assertVerticesMatchIsl(FaceLatticeTest.parameterizedLineSegment());
  }
}
