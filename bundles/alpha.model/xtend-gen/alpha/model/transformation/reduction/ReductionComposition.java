package alpha.model.transformation.reduction;

import alpha.model.AbstractReduceExpression;
import alpha.model.AlphaExpression;
import alpha.model.AlphaSystem;
import alpha.model.CalculatorExpressionEvaluator;
import alpha.model.REDUCTION_OP;
import alpha.model.SystemBody;
import alpha.model.factory.AlphaUserFactory;
import com.google.common.base.Objects;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLMultiAff;
import java.util.function.Consumer;
import org.eclipse.xtext.EcoreUtil2;

/**
 * ReductionComposition fuses two AbstractReduceExpressions.
 * 
 * The transformation takes a chain of reductions of the form:
 *   reduce(op, g, reduce(op, f, E))
 * and transforms it into:
 *   reduce(op, g o f, E)
 * 
 * Note that the operator must be the same for both of the reductions.
 */
@SuppressWarnings("all")
public class ReductionComposition {
  private ReductionComposition() {
  }
  
  /**
   * Apply the transformation to all AbstractReduceExpressions in an AlphaSystem.
   * Silently ignores any AbstractReduceExpression where composition is not applicable.
   */
  public static void apply(final AlphaSystem system) {
    final Consumer<SystemBody> _function = (SystemBody b) -> {
      ReductionComposition.apply(b);
    };
    system.getSystemBodies().forEach(_function);
  }
  
  /**
   * Apply the transformation to all AbstractReduceExpressions in a SystemBody.
   * Silently ignores any AbstractReduceExpression where composition is not applicable.
   */
  public static void apply(final SystemBody body) {
    final Consumer<AbstractReduceExpression> _function = (AbstractReduceExpression are) -> {
      ReductionComposition.transform(are);
    };
    EcoreUtil2.<AbstractReduceExpression>getAllContentsOfType(body, AbstractReduceExpression.class).forEach(_function);
  }
  
  /**
   * Composes two AbstractReduceExpressions into one.
   * This method throws an exception when composition is not applicable to the specified expression.
   */
  public static void apply(final AbstractReduceExpression are) {
    int _transform = ReductionComposition.transform(are);
    boolean _notEquals = (_transform != 1);
    if (_notEquals) {
      throw new RuntimeException("ReductionComposition is not applicable to the specified expression. It must have another reduction with the same operator as its body.");
    }
  }
  
  /**
   * Implementation of the transformation.
   */
  private static int transform(final AbstractReduceExpression are) {
    AlphaExpression _body = are.getBody();
    boolean _not = (!(_body instanceof AbstractReduceExpression));
    if (_not) {
      return 0;
    }
    AlphaExpression _body_1 = are.getBody();
    final AbstractReduceExpression innerARE = ((AbstractReduceExpression) _body_1);
    REDUCTION_OP _operator = are.getOperator();
    REDUCTION_OP _operator_1 = innerARE.getOperator();
    boolean _notEquals = (!Objects.equal(_operator, _operator_1));
    if (_notEquals) {
      return 0;
    }
    final JNIISLMultiAff composedProj = are.getProjection().pullback(innerARE.getProjection());
    are.setProjectionExpr(AlphaUserFactory.createJNIFunction(composedProj));
    are.setBody(innerARE.getBody());
    CalculatorExpressionEvaluator.calculate(are.getProjectionExpr(), null);
    return 1;
  }
}
