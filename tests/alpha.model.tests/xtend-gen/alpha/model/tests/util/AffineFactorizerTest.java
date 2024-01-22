package alpha.model.tests.util;

import alpha.model.util.AffineFactorizer;
import fr.irisa.cairn.jnimap.isl.ISLContext;
import fr.irisa.cairn.jnimap.isl.ISLDimType;
import fr.irisa.cairn.jnimap.isl.ISLMultiAff;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class AffineFactorizerTest {
  private static ISLMultiAff stringToMultiAff(final String str) {
    return ISLMultiAff.buildFromString(ISLContext.getInstance(), str);
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
}
