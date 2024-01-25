package alpha.model.tests.util;

import alpha.model.util.AffineFactorizer;
import fr.irisa.cairn.jnimap.isl.ISLContext;
import fr.irisa.cairn.jnimap.isl.ISLDimType;
import fr.irisa.cairn.jnimap.isl.ISLHermiteResult;
import fr.irisa.cairn.jnimap.isl.ISLMatrix;
import fr.irisa.cairn.jnimap.isl.ISLMultiAff;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Pair;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class AffineFactorizerTest {
  private static ISLMultiAff stringToMultiAff(final String str) {
    return ISLMultiAff.buildFromString(ISLContext.getInstance(), str);
  }

  private static ISLMatrix stringToMatrix(final String str) {
    return AffineFactorizer.expressionToMatrix(AffineFactorizerTest.stringToMultiAff(str));
  }

  private static List<ISLMultiAff> stringsToMultiAff(final String... strs) {
    final Function1<String, ISLMultiAff> _function = (String it) -> {
      return AffineFactorizerTest.stringToMultiAff(it);
    };
    return ListExtensions.<String, ISLMultiAff>map(((List<String>)Conversions.doWrapArray(strs)), _function);
  }

  private static void mergeExpressionsTest(final String expectedOutput, final String... inputs) {
    final List<ISLMultiAff> inputAffs = AffineFactorizerTest.stringsToMultiAff(inputs);
    final ISLMultiAff expectedAff = AffineFactorizerTest.stringToMultiAff(expectedOutput);
    final ISLMultiAff actualAff = AffineFactorizer.mergeExpressions(((ISLMultiAff[])Conversions.unwrapArray(inputAffs, ISLMultiAff.class)));
    Assert.assertTrue(expectedAff.isPlainEqual(actualAff));
  }

  private static void assertMatrixIsCorrect(final List<List<Integer>> expected, final ISLMatrix actual) {
    final int rows = expected.size();
    final int cols = expected.get(0).size();
    Assert.assertEquals("Wrong number of rows", rows, actual.getNbRows());
    Assert.assertEquals("Wrong number of cols", cols, actual.getNbCols());
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, rows, true);
    for (final Integer row : _doubleDotLessThan) {
      ExclusiveRange _doubleDotLessThan_1 = new ExclusiveRange(0, cols, true);
      for (final Integer col : _doubleDotLessThan_1) {
        {
          final String message = ((("Wrong value at row " + row) + ", col ") + col);
          Assert.assertEquals(message, (expected.get((row).intValue()).get((col).intValue())).intValue(), actual.getElement((row).intValue(), (col).intValue()));
        }
      }
    }
  }

  @Test
  public void dropCols() {
    ISLMatrix mat = AffineFactorizerTest.stringToMatrix("{ [i,j,k] -> [k,i,j] }");
    Assert.assertEquals(3, mat.getNbCols());
    mat = mat.dropCols(2, 1);
    Assert.assertEquals(2, mat.getNbCols());
  }

  @Test
  public void hermiteNormalForm() {
    final ISLMatrix input = AffineFactorizerTest.stringToMatrix("{ [i,j,k] -> [i+k,i+k+j]}");
    final ISLHermiteResult hnf_result = input.leftHermite();
    final ISLMatrix h = hnf_result.getH();
    final ISLMatrix u = hnf_result.getU();
    final ISLMatrix q = hnf_result.getQ();
    final List<List<Integer>> hExpected = Collections.<List<Integer>>unmodifiableList(CollectionLiterals.<List<Integer>>newArrayList(Collections.<Integer>unmodifiableList(CollectionLiterals.<Integer>newArrayList(Integer.valueOf(1), Integer.valueOf(0))), Collections.<Integer>unmodifiableList(CollectionLiterals.<Integer>newArrayList(Integer.valueOf(0), Integer.valueOf(1))), Collections.<Integer>unmodifiableList(CollectionLiterals.<Integer>newArrayList(Integer.valueOf(1), Integer.valueOf(0))), Collections.<Integer>unmodifiableList(CollectionLiterals.<Integer>newArrayList(Integer.valueOf(0), Integer.valueOf(0)))));
    final List<List<Integer>> uExpected = Collections.<List<Integer>>unmodifiableList(CollectionLiterals.<List<Integer>>newArrayList(Collections.<Integer>unmodifiableList(CollectionLiterals.<Integer>newArrayList(Integer.valueOf(1), Integer.valueOf((-1)))), Collections.<Integer>unmodifiableList(CollectionLiterals.<Integer>newArrayList(Integer.valueOf(0), Integer.valueOf(1)))));
    final List<List<Integer>> qExpected = Collections.<List<Integer>>unmodifiableList(CollectionLiterals.<List<Integer>>newArrayList(Collections.<Integer>unmodifiableList(CollectionLiterals.<Integer>newArrayList(Integer.valueOf(1), Integer.valueOf(1))), Collections.<Integer>unmodifiableList(CollectionLiterals.<Integer>newArrayList(Integer.valueOf(0), Integer.valueOf(1)))));
    AffineFactorizerTest.assertMatrixIsCorrect(hExpected, h);
    AffineFactorizerTest.assertMatrixIsCorrect(uExpected, u);
    AffineFactorizerTest.assertMatrixIsCorrect(qExpected, q);
  }

  @Test
  public void nameOutputs_01() {
    final List<ISLMultiAff> input = AffineFactorizerTest.stringsToMultiAff(
      "[N] -> { [i,j] -> [j,i] }", 
      "[N] -> { [i,j] -> [i+j,i-j] }");
    final ArrayList<ISLMultiAff> result = AffineFactorizer.nameExpressionOutputs(((ISLMultiAff[])Conversions.unwrapArray(input, ISLMultiAff.class)));
    Assert.assertEquals("orig_out_0", result.get(0).getSpace().getDimName(ISLDimType.isl_dim_out, 0));
    Assert.assertEquals("orig_out_1", result.get(0).getSpace().getDimName(ISLDimType.isl_dim_out, 1));
    Assert.assertEquals("orig_out_2", result.get(1).getSpace().getDimName(ISLDimType.isl_dim_out, 0));
    Assert.assertEquals("orig_out_3", result.get(1).getSpace().getDimName(ISLDimType.isl_dim_out, 1));
    Assert.assertEquals("orig_out_0", result.get(0).getSpace().getDimName(ISLDimType.isl_dim_out, 0));
    Assert.assertEquals("orig_out_1", result.get(0).getSpace().getDimName(ISLDimType.isl_dim_out, 1));
    Assert.assertEquals("orig_out_2", result.get(1).getSpace().getDimName(ISLDimType.isl_dim_out, 0));
    Assert.assertEquals("orig_out_3", result.get(1).getSpace().getDimName(ISLDimType.isl_dim_out, 1));
  }

  @Test
  public void mergeExpressions_oneInput() {
    final List<String> inputs = Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("[N] -> { [x,y,z] -> [x+y,z] }"));
    final String expectedOutput = inputs.get(0);
    AffineFactorizerTest.mergeExpressionsTest(expectedOutput, ((String[])Conversions.unwrapArray(inputs, String.class)));
  }

  @Test
  public void mergeExpressions_twoInputs() {
    final List<String> inputs = Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("[N] -> { [p,q,r] -> [p+q,q+r] }", "[N] -> { [p,q,r] -> [r,N-q,p+2] }"));
    final String expectedOutput = "[N] -> { [p,q,r] -> [p+q,q+r,r,N-q,p+2] }";
    AffineFactorizerTest.mergeExpressionsTest(expectedOutput, ((String[])Conversions.unwrapArray(inputs, String.class)));
  }

  @Test
  public void mergeExpressions_threeInputs() {
    final List<String> inputs = Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("[N] -> { [i,j,k,l] -> [j,k] }", "[N] -> { [i,j,k,l] -> [k-j] }", "[N] -> { [i,j,k,l] -> [j-k, i-j-k+l] }"));
    final String expectedOutput = "[N] -> { [i,j,k,l] -> [j,k,k-j,j-k,i-j-k+l] }";
    AffineFactorizerTest.mergeExpressionsTest(expectedOutput, ((String[])Conversions.unwrapArray(inputs, String.class)));
  }

  @Test
  public void expressionToMatrix_01() {
    final ISLMultiAff input = AffineFactorizerTest.stringToMultiAff("{ [i,j] -> [0, 0] }");
    final ISLMatrix result = AffineFactorizer.expressionToMatrix(input);
    Assert.assertEquals(3, result.getNbRows());
    Assert.assertEquals(2, result.getNbCols());
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, 3, true);
    for (final Integer row : _doubleDotLessThan) {
      ExclusiveRange _doubleDotLessThan_1 = new ExclusiveRange(0, 2, true);
      for (final Integer col : _doubleDotLessThan_1) {
        Assert.assertEquals(0, result.getElement((row).intValue(), (col).intValue()));
      }
    }
  }

  @Test
  public void expressionToMatrix_02() {
    final ISLMultiAff input = AffineFactorizerTest.stringToMultiAff("[N] -> { [i,j] -> [2N -3j +4i +1, 7-2i+3j-4N] }");
    final ISLMatrix result = AffineFactorizer.expressionToMatrix(input);
    Assert.assertEquals(4, result.getNbRows());
    Assert.assertEquals(2, result.getNbCols());
    Assert.assertEquals(2, result.getElement(0, 0));
    Assert.assertEquals(4, result.getElement(1, 0));
    Assert.assertEquals((-3), result.getElement(2, 0));
    Assert.assertEquals(1, result.getElement(3, 0));
    Assert.assertEquals((-4), result.getElement(0, 1));
    Assert.assertEquals((-2), result.getElement(1, 1));
    Assert.assertEquals(3, result.getElement(2, 1));
    Assert.assertEquals(7, result.getElement(3, 1));
  }

  @Test
  public void expressionToMatrix_03() {
    final ISLMultiAff input = AffineFactorizerTest.stringToMultiAff("{ [] -> [7] }");
    final ISLMatrix result = AffineFactorizer.expressionToMatrix(input);
    Assert.assertEquals(1, result.getNbRows());
    Assert.assertEquals(1, result.getNbCols());
    Assert.assertEquals(7, result.getElement(0, 0));
  }

  @Test
  public void reduceHermiteDimensionality_01() {
    final ISLMatrix hOriginal = ISLMatrix.buildFromLongMatrix(
      new long[][] { new long[] { 0, 0 }, new long[] { 1, 1 }, new long[] { 2, 0 } });
    final ISLMatrix qOriginal = ISLMatrix.buildFromLongMatrix(
      new long[][] { new long[] { 1, 1 }, new long[] { 2, 2 } });
    final Pair<ISLMatrix, ISLMatrix> result = AffineFactorizer.reduceHermiteDimensionality(hOriginal, qOriginal);
    final List<List<Integer>> expectedH = Collections.<List<Integer>>unmodifiableList(CollectionLiterals.<List<Integer>>newArrayList(Collections.<Integer>unmodifiableList(CollectionLiterals.<Integer>newArrayList(Integer.valueOf(0), Integer.valueOf(0))), Collections.<Integer>unmodifiableList(CollectionLiterals.<Integer>newArrayList(Integer.valueOf(1), Integer.valueOf(1))), Collections.<Integer>unmodifiableList(CollectionLiterals.<Integer>newArrayList(Integer.valueOf(2), Integer.valueOf(0)))));
    final List<List<Integer>> expectedQ = Collections.<List<Integer>>unmodifiableList(CollectionLiterals.<List<Integer>>newArrayList(Collections.<Integer>unmodifiableList(CollectionLiterals.<Integer>newArrayList(Integer.valueOf(1), Integer.valueOf(1))), Collections.<Integer>unmodifiableList(CollectionLiterals.<Integer>newArrayList(Integer.valueOf(2), Integer.valueOf(2)))));
    AffineFactorizerTest.assertMatrixIsCorrect(expectedH, result.getKey());
    AffineFactorizerTest.assertMatrixIsCorrect(expectedQ, result.getValue());
  }

  @Test
  public void reduceHermiteDimensionality_02() {
    final ISLMatrix hOriginal = ISLMatrix.buildFromLongMatrix(
      new long[][] { new long[] { 0, 0 }, new long[] { 1, 0 }, new long[] { 2, 0 } });
    final ISLMatrix qOriginal = ISLMatrix.buildFromLongMatrix(
      new long[][] { new long[] { 1, 1 }, new long[] { 2, 2 } });
    final Pair<ISLMatrix, ISLMatrix> result = AffineFactorizer.reduceHermiteDimensionality(hOriginal, qOriginal);
    final List<List<Integer>> expectedH = Collections.<List<Integer>>unmodifiableList(CollectionLiterals.<List<Integer>>newArrayList(Collections.<Integer>unmodifiableList(CollectionLiterals.<Integer>newArrayList(Integer.valueOf(0))), Collections.<Integer>unmodifiableList(CollectionLiterals.<Integer>newArrayList(Integer.valueOf(1))), Collections.<Integer>unmodifiableList(CollectionLiterals.<Integer>newArrayList(Integer.valueOf(2)))));
    final List<List<Integer>> expectedQ = Collections.<List<Integer>>unmodifiableList(CollectionLiterals.<List<Integer>>newArrayList(Collections.<Integer>unmodifiableList(CollectionLiterals.<Integer>newArrayList(Integer.valueOf(1), Integer.valueOf(1)))));
    AffineFactorizerTest.assertMatrixIsCorrect(expectedH, result.getKey());
    AffineFactorizerTest.assertMatrixIsCorrect(expectedQ, result.getValue());
  }

  @Test
  public void reduceHermiteDimensionality_03() {
    final ISLMatrix hOriginal = ISLMatrix.buildFromLongMatrix(
      new long[][] { new long[] { 0, 0, 0 }, new long[] { 1, 0, 0 }, new long[] { 2, 0, 0 } });
    final ISLMatrix qOriginal = ISLMatrix.buildFromLongMatrix(
      new long[][] { new long[] { 1, 1 }, new long[] { 2, 2 }, new long[] { 3, 3 } });
    final Pair<ISLMatrix, ISLMatrix> result = AffineFactorizer.reduceHermiteDimensionality(hOriginal, qOriginal);
    final List<List<Integer>> expectedH = Collections.<List<Integer>>unmodifiableList(CollectionLiterals.<List<Integer>>newArrayList(Collections.<Integer>unmodifiableList(CollectionLiterals.<Integer>newArrayList(Integer.valueOf(0))), Collections.<Integer>unmodifiableList(CollectionLiterals.<Integer>newArrayList(Integer.valueOf(1))), Collections.<Integer>unmodifiableList(CollectionLiterals.<Integer>newArrayList(Integer.valueOf(2)))));
    final List<List<Integer>> expectedQ = Collections.<List<Integer>>unmodifiableList(CollectionLiterals.<List<Integer>>newArrayList(Collections.<Integer>unmodifiableList(CollectionLiterals.<Integer>newArrayList(Integer.valueOf(1), Integer.valueOf(1)))));
    AffineFactorizerTest.assertMatrixIsCorrect(expectedH, result.getKey());
    AffineFactorizerTest.assertMatrixIsCorrect(expectedQ, result.getValue());
  }

  @Test
  public void hermiteDecomposition_01() {
    final ISLMatrix original = ISLMatrix.buildFromLongMatrix(
      new long[][] { new long[] { 1, 0, 0 }, new long[] { 0, 1, 0 }, new long[] { 0, 0, 1 } });
    final Pair<ISLMatrix, ISLMatrix> decomposeResult = AffineFactorizer.hermiteDecomposition(original);
    final ISLMatrix hActual = decomposeResult.getKey();
    final ISLMatrix qActual = decomposeResult.getValue();
    final List<List<Integer>> bothExpected = Collections.<List<Integer>>unmodifiableList(CollectionLiterals.<List<Integer>>newArrayList(Collections.<Integer>unmodifiableList(CollectionLiterals.<Integer>newArrayList(Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0))), Collections.<Integer>unmodifiableList(CollectionLiterals.<Integer>newArrayList(Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(0))), Collections.<Integer>unmodifiableList(CollectionLiterals.<Integer>newArrayList(Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1)))));
    AffineFactorizerTest.assertMatrixIsCorrect(bothExpected, hActual);
    AffineFactorizerTest.assertMatrixIsCorrect(bothExpected, qActual);
  }

  @Test
  public void hermiteDecomposition_02() {
    final ISLMatrix original = ISLMatrix.buildFromLongMatrix(
      new long[][] { new long[] { 1, 1, 1 }, new long[] { 0, 1, 0 }, new long[] { 1, 1, 1 } });
    final Pair<ISLMatrix, ISLMatrix> decomposeResult = AffineFactorizer.hermiteDecomposition(original);
    final ISLMatrix hActual = decomposeResult.getKey();
    final ISLMatrix qActual = decomposeResult.getValue();
    final List<List<Integer>> hExpected = Collections.<List<Integer>>unmodifiableList(CollectionLiterals.<List<Integer>>newArrayList(Collections.<Integer>unmodifiableList(CollectionLiterals.<Integer>newArrayList(Integer.valueOf(1), Integer.valueOf(0))), Collections.<Integer>unmodifiableList(CollectionLiterals.<Integer>newArrayList(Integer.valueOf(0), Integer.valueOf(1))), Collections.<Integer>unmodifiableList(CollectionLiterals.<Integer>newArrayList(Integer.valueOf(1), Integer.valueOf(0)))));
    final List<List<Integer>> qExpected = Collections.<List<Integer>>unmodifiableList(CollectionLiterals.<List<Integer>>newArrayList(Collections.<Integer>unmodifiableList(CollectionLiterals.<Integer>newArrayList(Integer.valueOf(1), Integer.valueOf(1), Integer.valueOf(1))), Collections.<Integer>unmodifiableList(CollectionLiterals.<Integer>newArrayList(Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(0)))));
    AffineFactorizerTest.assertMatrixIsCorrect(hExpected, hActual);
    AffineFactorizerTest.assertMatrixIsCorrect(qExpected, qActual);
  }
}
