package alpha.model.transformation.reduction;

import alpha.model.AbstractReduceExpression;
import alpha.model.AlphaExpression;
import alpha.model.ArgReduceExpression;
import alpha.model.REDUCTION_OP;
import alpha.model.ReduceExpression;
import alpha.model.factory.AlphaUserFactory;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLMultiAff;
import java.util.Arrays;

@SuppressWarnings("all")
public class ReductionUtil {
  /**
   * Dispatch methods for constructing reductions with the appropriate concrete type.
   */
  protected static AbstractReduceExpression _constructConcreteReduction(final ReduceExpression base, final REDUCTION_OP op, final JNIISLMultiAff projection, final AlphaExpression body) {
    return AlphaUserFactory.createReduceExpression(op, projection, body);
  }
  
  protected static AbstractReduceExpression _constructConcreteReduction(final ArgReduceExpression base, final REDUCTION_OP op, final JNIISLMultiAff projection, final AlphaExpression body) {
    return AlphaUserFactory.createArgReduceExpression(op, projection, body);
  }
  
  public static AbstractReduceExpression constructConcreteReduction(final AbstractReduceExpression base, final REDUCTION_OP op, final JNIISLMultiAff projection, final AlphaExpression body) {
    if (base instanceof ArgReduceExpression) {
      return _constructConcreteReduction((ArgReduceExpression)base, op, projection, body);
    } else if (base instanceof ReduceExpression) {
      return _constructConcreteReduction((ReduceExpression)base, op, projection, body);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(base, op, projection, body).toString());
    }
  }
}
