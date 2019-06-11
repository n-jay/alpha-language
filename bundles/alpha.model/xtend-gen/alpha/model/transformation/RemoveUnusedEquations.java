package alpha.model.transformation;

import alpha.model.AlphaRoot;
import alpha.model.AlphaSystem;
import alpha.model.Equation;
import alpha.model.StandardEquation;
import alpha.model.SystemBody;
import alpha.model.Variable;
import alpha.model.VariableExpression;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.xbase.lib.CollectionExtensions;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * Removes local equations/variables that are defined
 * but are never used in a system.
 */
@SuppressWarnings("all")
public class RemoveUnusedEquations {
  private RemoveUnusedEquations() {
  }
  
  public static void apply(final AlphaRoot root) {
    final Consumer<AlphaSystem> _function = (AlphaSystem s) -> {
      RemoveUnusedEquations.apply(s);
    };
    root.getSystems().forEach(_function);
  }
  
  public static void apply(final AlphaSystem system) {
    final HashMap<Variable, Boolean> map = new HashMap<Variable, Boolean>();
    final Function1<VariableExpression, Boolean> _function = (VariableExpression ve) -> {
      return ve.getVariable().isLocal();
    };
    final Consumer<VariableExpression> _function_1 = (VariableExpression ve) -> {
      map.put(ve.getVariable(), Boolean.valueOf(true));
    };
    IterableExtensions.<VariableExpression>filter(EcoreUtil2.<VariableExpression>getAllContentsOfType(system, VariableExpression.class), _function).forEach(_function_1);
    final Predicate<Variable> _function_2 = (Variable v) -> {
      boolean _containsKey = map.containsKey(v);
      return (!_containsKey);
    };
    final Object[] unusedVars = system.getLocals().stream().filter(_function_2).toArray();
    final Function1<StandardEquation, Boolean> _function_3 = (StandardEquation eq) -> {
      return Boolean.valueOf(((List<Object>)Conversions.doWrapArray(unusedVars)).contains(eq.getVariable()));
    };
    final Iterable<StandardEquation> unusedEqs = IterableExtensions.<StandardEquation>filter(EcoreUtil2.<StandardEquation>getAllContentsOfType(system, StandardEquation.class), _function_3);
    system.getLocals().removeAll(((Collection<?>)Conversions.doWrapArray(unusedVars)));
    final Consumer<SystemBody> _function_4 = (SystemBody body) -> {
      CollectionExtensions.<Equation>removeAll(body.getEquations(), unusedEqs);
    };
    system.getSystemBodies().forEach(_function_4);
  }
}
