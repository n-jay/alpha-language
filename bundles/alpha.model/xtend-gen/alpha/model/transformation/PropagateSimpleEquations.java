package alpha.model.transformation;

import alpha.model.AlphaSystem;
import alpha.model.ConstantExpression;
import alpha.model.IndexExpression;
import alpha.model.StandardEquation;
import alpha.model.SystemBody;
import alpha.model.VariableExpression;
import alpha.model.transformation.RemoveUnusedEquations;
import alpha.model.transformation.SubstituteByDef;
import java.util.function.Consumer;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * This transformation implements a form of constant propagation in Alpha.
 * Equations that match the following:
 *   X = VariableExpression
 *   X = ConstantExpression
 *   X = IndexExpression
 * are all inlined into other equations.
 * 
 * Inlined VariableExpressions are wrapped by a RestrictExpression that restricts
 * the domain to the domain of the inlined Variable.
 * 
 * This transformation also calls {@link RemoveUnusedEquations} to remove the inlined equations.
 * 
 * It is recommended to call {@link Normalize} and {@link SimplifyExpressions}
 * before using this transformation to maximize effectiveness.
 */
@SuppressWarnings("all")
public class PropagateSimpleEquations {
  private PropagateSimpleEquations() {
  }
  
  public static void apply(final AlphaSystem system) {
    final Consumer<SystemBody> _function = (SystemBody body) -> {
      PropagateSimpleEquations.apply(body);
    };
    system.getSystemBodies().forEach(_function);
  }
  
  public static void apply(final SystemBody body) {
    final Function1<StandardEquation, Boolean> _function = (StandardEquation eq) -> {
      return Boolean.valueOf((((eq.getExpr() instanceof VariableExpression) || 
        (eq.getExpr() instanceof ConstantExpression)) || 
        (eq.getExpr() instanceof IndexExpression)));
    };
    final Iterable<StandardEquation> simpleEquations = IterableExtensions.<StandardEquation>filter(body.getStandardEquations(), _function);
    if ((simpleEquations != null)) {
      final Consumer<StandardEquation> _function_1 = (StandardEquation seq) -> {
        SubstituteByDef.apply(body, null, seq.getVariable());
      };
      simpleEquations.forEach(_function_1);
      RemoveUnusedEquations.apply(body.getSystem());
    }
  }
}
