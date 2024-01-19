package alpha.model.util;

import fr.irisa.cairn.jnimap.isl.ISLMultiAff;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * Factorizes a set of multi-dimensional affine maps (i.e., <code>ISLMultiAff</code>).
 * 
 * @see <a href="https://impact-workshop.org/papers/paper3.pdf">Reuse Analysis via Affine Factorization</a>
 */
@SuppressWarnings("all")
public class AffineFactorizer {
  /**
   * Merges a set of affine expressions into a single expression
   * by performing the product
   */
  public static ISLMultiAff mergeExpressions(final ISLMultiAff... expressions) {
    final Function2<ISLMultiAff, ISLMultiAff, ISLMultiAff> _function = (ISLMultiAff left, ISLMultiAff right) -> {
      return left.flatRangeProduct(right);
    };
    return IterableExtensions.<ISLMultiAff>reduce(((Iterable<? extends ISLMultiAff>)Conversions.doWrapArray(expressions)), _function);
  }
}
