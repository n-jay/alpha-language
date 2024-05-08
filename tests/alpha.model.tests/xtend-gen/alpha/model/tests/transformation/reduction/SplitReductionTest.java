package alpha.model.tests.transformation.reduction;

import alpha.commands.UtilityBase;
import alpha.model.AlphaExpression;
import alpha.model.AlphaRoot;
import alpha.model.ReduceExpression;
import alpha.model.SystemBody;
import alpha.model.tests.util.AlphaTestUtil;
import alpha.model.transformation.reduction.SplitReduction;
import alpha.model.util.ISLUtil;
import fr.irisa.cairn.jnimap.isl.ISLAff;
import fr.irisa.cairn.jnimap.isl.ISLBasicSet;
import fr.irisa.cairn.jnimap.isl.ISLConstraint;
import fr.irisa.cairn.jnimap.isl.ISLMultiAff;
import java.util.List;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class SplitReductionTest {
  /**
   * construct1DBasis tests
   * 
   * Given a reduce expression of the form:
   *   reduce(op, fp, fd@(E))
   * 
   * where:
   *   fp is the projection function (characterizing accumulation)
   *   fd is the dependence function (characterizing reuse)
   * 
   * When the null space of fp or fd is 1D, the construct1DBasis function
   * constructs a new ISLMultiAff that points "along" this 1D null space.
   * The vector of the constant terms in each output dimension can be
   * viewed as a basis vector that spans the 1D null space.
   * 
   * For example:
   * 
   * If fp (or fd) is (i,j->i) then construct1DBasis should return
   * the following ISLMultiAff:
   *   {[i,j]->[i,j+1]}
   * because the vector of output dim's constants is <0,1> which spans
   * the null space of (i,j->i).
   * 
   * If fp (or fd) is (i,j->i+j) then it should return:
   *   {[i,j]->[i+1,j-1]}
   * and <1,-1> spans the null space of (i,j->i+j)
   * 
   * If fp (or fd) is (i,j,k->i+j) then it should return:
   *   null
   * becuase the null space of (i,j,k->i+j) is 2D and can't be represented
   * by a 1D basis.
   */
  @Test
  public void construct1DBasis_01() {
    final ISLMultiAff maff = ISLUtil.toISLMultiAff("[N]->{[i,j,k]->[i,j]}");
    final Function1<ISLAff, Long> _function = (ISLAff it) -> {
      return Long.valueOf(it.getConstant());
    };
    final List<Long> basis = ListExtensions.<ISLAff, Long>map(SplitReduction.construct1DBasis(maff).getAffs(), _function);
    Assert.assertEquals(basis.toString(), "[0, 0, 1]");
  }

  @Test
  public void construct1DBasis_02() {
    final ISLMultiAff maff = ISLUtil.toISLMultiAff("[N]->{[i,j,k]->[i,7j-k]}");
    final Function1<ISLAff, Long> _function = (ISLAff it) -> {
      return Long.valueOf(it.getConstant());
    };
    final List<Long> basis = ListExtensions.<ISLAff, Long>map(SplitReduction.construct1DBasis(maff).getAffs(), _function);
    Assert.assertEquals(basis.toString(), "[0, 1, 7]");
  }

  @Test
  public void construct1DBasis_03() {
    final ISLMultiAff maff = ISLUtil.toISLMultiAff("[N]->{[i,j,k]->[i]}");
    final ISLMultiAff basis = SplitReduction.construct1DBasis(maff);
    Assert.assertNull(basis);
  }

  /**
   * constructSplit tests
   * 
   * Given an ISLMaff and an ISLBasicSet, constructSplit "extends" the
   * basic set infinitely along the direction encoded by the maff. The
   * extension is performed by applying the transitive closure of maff
   * to the basicSet. This has the effect of increasing the dimensionality
   * of the basicSet by one, assuming that the space spanned by the
   * transitive closure is not already saturated by the set. If the set
   * saturates the transitive closure then "null" is returned.
   * 
   * Examples:
   * 
   * 1) Given the following:
   *    basicSet: [N]->{[i,j] : i=N and j=0}
   *    maff: [N]->{[i,j]->[i,j+1]}
   * 
   * Here the transitive closure of maff is {[i,j]->[i,o1]} (i.e., j is
   * unbounded). The following basicSet is returned:
   *    [N]->{[i,j] : i=N}
   * Notice the input set is 0D and the output is 1D.
   * 
   * 2) Given the following:
   *    basicSet: [N]->{[i,j,k] : i=0 and j=0}
   *    maff: [N]->{[i,j,k]->[i+1,j+1,k]}
   * 
   * Geometrically, basicSet represents the k-axis and we are extending this
   * by the vector <1,1,0>, which gives the 2D plane parallel to the k-axis
   * intesecting the line i=j in the ij-plane. The following set is returned:
   *    [N]->{[i,j,k] : i=j}
   * 
   * 3) Given the following:
   *    basicSet: [N]->{[i,j,k] : i=0 and j=0}
   *    maff: [N]->{[i,j,k]->[i,j,k+1]}
   * 
   * Here, the set saturates the transitive closure. The basicSet is same as
   * example 2. Extending this set by the vector <0,0,1> leaves the same set
   * because here we try to extend the k-axis along the k direction. The
   * following is returned:
   *    null
   */
  @Test
  public void constructSplit_00() {
    final ISLBasicSet bset = ISLUtil.toISLBasicSet("[N]->{[i,j] : i=N and j=0}");
    final ISLMultiAff maff = ISLUtil.toISLMultiAff("[N]->{[i,j]->[i,j+1]}");
    Assert.assertEquals(SplitReduction.constructSplit(bset, maff).toString(), "[N] -> { [i, j] : -N + i = 0 }");
  }

  @Test
  public void constructSplit_01() {
    final ISLBasicSet bset = ISLUtil.toISLBasicSet("[N]->{[i,j] : i=N and j=0}");
    final ISLMultiAff maff = ISLUtil.toISLMultiAff("[N]->{[i,j]->[i+1,j]}");
    Assert.assertEquals(SplitReduction.constructSplit(bset, maff).toString(), "[N] -> { [i, j] : j = 0 }");
  }

  @Test
  public void constructSplit_02() {
    final ISLBasicSet bset = ISLUtil.toISLBasicSet("[N]->{[i,j,k] : i=0 and j=0}");
    final ISLMultiAff maff = ISLUtil.toISLMultiAff("[N]->{[i,j,k]->[i+1,j+1,k]}");
    Assert.assertEquals(SplitReduction.constructSplit(bset, maff).toString(), "[N] -> { [i, j, k] : -i + j = 0 }");
  }

  @Test
  public void constructSplit_03() {
    final ISLBasicSet bset = ISLUtil.toISLBasicSet("[N]->{[i,j,k] : i=0 and j=0}");
    final ISLMultiAff maff = ISLUtil.toISLMultiAff("[N]->{[i,j,k]->[i,j,k+1]}");
    Assert.assertNull(SplitReduction.constructSplit(bset, maff));
  }

  /**
   * isUseful tests
   * 
   * Given an ISLConstraint and an ISLBasicSet this function should return
   * true if there are points in the set on both sides of the constraint
   * (i.e., the constraint actually splits the set into two non-empty pieces)
   */
  @Test
  public void isUseful_00() {
    final ISLConstraint split1 = ISLUtil.toISLConstraint("[N]->{[i,j] : i=0}");
    final ISLConstraint split2 = ISLUtil.toISLConstraint("[N]->{[i,j] : i=N}");
    final ISLConstraint split3 = ISLUtil.toISLConstraint("[N]->{[i,j] : j=0}");
    final ISLConstraint split4 = ISLUtil.toISLConstraint("[N]->{[i,j] : j=N}");
    final ISLConstraint split5 = ISLUtil.toISLConstraint("[N]->{[i,j] : j=N-i}");
    final ISLBasicSet bset = ISLUtil.toISLBasicSet("[N]->{[i,j] : 0<=j<=i<N}");
    Assert.assertFalse(SplitReduction.isUseful(split1, bset));
    Assert.assertFalse(SplitReduction.isUseful(split2, bset));
    Assert.assertFalse(SplitReduction.isUseful(split3, bset));
    Assert.assertFalse(SplitReduction.isUseful(split4, bset));
    Assert.assertTrue(SplitReduction.isUseful(split5, bset));
  }

  /**
   * enumerateCandidateSplits tests
   * 
   * Given a reduceExpression, this function reports all of the useful splits
   * that can be constructed. Each split must saturate either the null space of
   * the projection function or the dependence function (charaterizing the
   * reuse space). These tests simply assert that the number of splits matches
   * what is expected.
   */
  @Test
  public void enumerateCandidateSplits_00() {
    final AlphaRoot root = AlphaTestUtil.loadValidFile("transformation-reduction-tests/split-reduction/splitReduction.alpha");
    final SystemBody systemBody = UtilityBase.GetSystem(root, "ex_2d").getSystemBodies().get(0);
    AlphaExpression _expr = UtilityBase.GetEquation(systemBody, "Y").getExpr();
    final ReduceExpression reduceExpr = ((ReduceExpression) _expr);
    final ISLConstraint[] splits = SplitReduction.enumerateCandidateSplits(reduceExpr);
    Assert.assertEquals(((List<ISLConstraint>)Conversions.doWrapArray(splits)).size(), 1);
  }

  @Test
  public void enumerateCandidateSplits_01() {
    final AlphaRoot root = AlphaTestUtil.loadValidFile("transformation-reduction-tests/split-reduction/splitReduction.alpha");
    final SystemBody systemBody = UtilityBase.GetSystem(root, "ex_3d").getSystemBodies().get(0);
    AlphaExpression _expr = UtilityBase.GetEquation(systemBody, "Y").getExpr();
    final ReduceExpression reduceExpr = ((ReduceExpression) _expr);
    final ISLConstraint[] splits = SplitReduction.enumerateCandidateSplits(reduceExpr);
    Assert.assertEquals(((List<ISLConstraint>)Conversions.doWrapArray(splits)).size(), 3);
  }
}
