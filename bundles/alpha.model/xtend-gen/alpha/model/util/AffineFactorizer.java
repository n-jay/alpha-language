package alpha.model.util;

import fr.irisa.cairn.jnimap.isl.ISLDimType;
import fr.irisa.cairn.jnimap.isl.ISLMultiAff;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.IntegerRange;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

/**
 * Factorizes a set of multi-dimensional affine maps (i.e., <code>ISLMultiAff</code>).
 * 
 * @see <a href="https://impact-workshop.org/papers/paper3.pdf">Reuse Analysis via Affine Factorization</a>
 */
@SuppressWarnings("all")
public class AffineFactorizer {
  /**
   * Generates names containing the given prefix and an incrementing value, separated by an underscore.
   */
  private static Iterator<String> getNameGenerator(final String prefix) {
    final Function1<Integer, String> _function = (Integer it) -> {
      String _string = it.toString();
      return ((prefix + "_") + _string);
    };
    return IterableExtensions.<Integer, String>map(new IntegerRange(0, Integer.MAX_VALUE), _function).iterator();
  }

  /**
   * Gives each output of the provided expression a unique name, overwriting any existing names.
   */
  private static ISLMultiAff nameSingleExpressionOutputs(final ISLMultiAff expression, final Iterator<String> names) {
    final int outCount = expression.dim(ISLDimType.isl_dim_out);
    final Function2<ISLMultiAff, Integer, ISLMultiAff> _function = (ISLMultiAff expr, Integer outIndex) -> {
      return expr.setDimName(ISLDimType.isl_dim_out, outIndex, names.next());
    };
    final Function2<ISLMultiAff, Integer, ISLMultiAff> setName = _function;
    return IterableExtensions.<Integer, ISLMultiAff>fold(new ExclusiveRange(0, outCount, true), expression.copy(), setName);
  }

  /**
   * Gives each output of all the provided expressions a unique name, overwriting any existing names.
   */
  public static ArrayList<ISLMultiAff> nameExpressionOutputs(final ISLMultiAff... expressions) {
    final Iterator<String> names = AffineFactorizer.getNameGenerator("orig_out");
    final Function1<ISLMultiAff, ISLMultiAff> _function = (ISLMultiAff it) -> {
      return AffineFactorizer.nameSingleExpressionOutputs(it, names);
    };
    final List<ISLMultiAff> retVal = ListExtensions.<ISLMultiAff, ISLMultiAff>map(((List<ISLMultiAff>)Conversions.doWrapArray(expressions)), _function);
    return new ArrayList<ISLMultiAff>(retVal);
  }

  /**
   * Merges a set of affine expressions into a single expression via their flat product.
   */
  public static ISLMultiAff mergeExpressions(final ISLMultiAff... expressions) {
    final Function2<ISLMultiAff, ISLMultiAff, ISLMultiAff> _function = (ISLMultiAff left, ISLMultiAff right) -> {
      return left.flatRangeProduct(right);
    };
    return IterableExtensions.<ISLMultiAff>reduce(((Iterable<? extends ISLMultiAff>)Conversions.doWrapArray(expressions)), _function);
  }
}
