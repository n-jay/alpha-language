package alpha.model.tests.transformation.reduction;

import alpha.commands.Utility;
import alpha.commands.UtilityBase;
import alpha.model.AlphaExpression;
import alpha.model.AlphaModelLoader;
import alpha.model.AlphaSystem;
import alpha.model.DependenceExpression;
import alpha.model.ReduceExpression;
import alpha.model.StandardEquation;
import alpha.model.SystemBody;
import alpha.model.VariableExpression;
import alpha.model.transformation.reduction.NormalizeReductionDeep;
import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class NormalizeReductionDeepTest {
  /**
   * The path to the Alpha file for these unit tests.
   */
  private static final String alphaFile = "resources/src-valid/transformation-reduction-tests/normalize-reduction-deep/normalizeReductionDeep.alpha";

  /**
   * Gets the desired system for these unit tests.
   */
  public static AlphaSystem getSystem(final String system) {
    try {
      return UtilityBase.GetSystem(AlphaModelLoader.loadModel(NormalizeReductionDeepTest.alphaFile), system);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  /**
   * Gets the desired equation for these unit tests.
   */
  public static StandardEquation getEquation(final String system, final String equation) {
    return UtilityBase.GetEquation(Utility.GetSystemBody(NormalizeReductionDeepTest.getSystem(system)), equation);
  }

  /**
   * Tests that applying NormalizeReductionDeep to a system
   * won't move a top-level reduction into a separate equation.
   */
  @Test
  public void topLevelReduction_01() {
    final AlphaSystem system = NormalizeReductionDeepTest.getSystem("topLevelReduction");
    final StandardEquation equation = UtilityBase.GetEquation(Utility.GetSystemBody(system), "X");
    AlphaExpression _expr = equation.getExpr();
    final ReduceExpression reduction = ((ReduceExpression) _expr);
    NormalizeReductionDeep.apply(system);
    Assert.assertEquals(equation, reduction.eContainer());
  }

  /**
   * Tests that applying NormalizeReductionDeep to an equation
   * won't move a top-level reduction into a separate equation.
   */
  @Test
  public void topLevelReduction_02() {
    final StandardEquation equation = NormalizeReductionDeepTest.getEquation("topLevelReduction", "X");
    AlphaExpression _expr = equation.getExpr();
    final ReduceExpression reduction = ((ReduceExpression) _expr);
    NormalizeReductionDeep.apply(equation);
    Assert.assertEquals(equation, reduction.eContainer());
  }

  /**
   * Tests that applying NormalizeReductionDeep to a top-level reduction
   * won't move it into a separate equation.
   */
  @Test
  public void topLevelReduction_03() {
    final StandardEquation equation = NormalizeReductionDeepTest.getEquation("topLevelReduction", "X");
    AlphaExpression _expr = equation.getExpr();
    final ReduceExpression reduction = ((ReduceExpression) _expr);
    NormalizeReductionDeep.apply(reduction);
    Assert.assertEquals(equation, reduction.eContainer());
  }

  /**
   * Tests that applying NormalizeReductionDeep will move a reduction
   * that's inside a dependence expression to its own equation.
   */
  @Test
  public void reductionInsideDependence_01() {
    final SystemBody systemBody = Utility.GetSystemBody(NormalizeReductionDeepTest.getSystem("reductionInsideDependence"));
    final StandardEquation originalEquation = UtilityBase.GetEquation(systemBody, "X");
    AlphaExpression _expr = originalEquation.getExpr();
    final DependenceExpression dependence = ((DependenceExpression) _expr);
    AlphaExpression _expr_1 = dependence.getExpr();
    final ReduceExpression reduction = ((ReduceExpression) _expr_1);
    NormalizeReductionDeep.apply(reduction);
    Assert.assertEquals(dependence, originalEquation.getExpr());
    AlphaExpression _expr_2 = dependence.getExpr();
    Assert.assertTrue((_expr_2 instanceof VariableExpression));
    AlphaExpression _expr_3 = dependence.getExpr();
    final VariableExpression variable = ((VariableExpression) _expr_3);
    final String newEquationName = variable.getVariable().getName();
    final Function1<StandardEquation, Boolean> _function = (StandardEquation eq) -> {
      String _name = eq.getVariable().getName();
      return Boolean.valueOf(Objects.equal(_name, newEquationName));
    };
    final StandardEquation newEquation = IterableExtensions.<StandardEquation>head(IterableExtensions.<StandardEquation>filter(Iterables.<StandardEquation>filter(systemBody.getEquations(), StandardEquation.class), _function));
    Assert.assertNotNull(newEquation);
    Assert.assertEquals(newEquation, reduction.eContainer());
  }

  /**
   * Tests that applying NormalizeReductionDeep to a system
   * will move a nested reduction to its own equation.
   */
  @Test
  public void nestedReduction_01() {
    final AlphaSystem system = NormalizeReductionDeepTest.getSystem("nestedReduction");
    final SystemBody systemBody = Utility.GetSystemBody(system);
    final StandardEquation originalEquation = UtilityBase.GetEquation(systemBody, "X");
    AlphaExpression _expr = originalEquation.getExpr();
    final ReduceExpression outerReduction = ((ReduceExpression) _expr);
    AlphaExpression _body = outerReduction.getBody();
    final ReduceExpression innerReduction = ((ReduceExpression) _body);
    NormalizeReductionDeep.apply(system);
    Assert.assertEquals(originalEquation, outerReduction.eContainer());
    AlphaExpression _body_1 = outerReduction.getBody();
    Assert.assertTrue((_body_1 instanceof VariableExpression));
    AlphaExpression _body_2 = outerReduction.getBody();
    final VariableExpression variable = ((VariableExpression) _body_2);
    final String newEquationName = variable.getVariable().getName();
    final Function1<StandardEquation, Boolean> _function = (StandardEquation eq) -> {
      String _name = eq.getVariable().getName();
      return Boolean.valueOf(Objects.equal(_name, newEquationName));
    };
    final StandardEquation newEquation = IterableExtensions.<StandardEquation>head(IterableExtensions.<StandardEquation>filter(Iterables.<StandardEquation>filter(systemBody.getEquations(), StandardEquation.class), _function));
    Assert.assertNotNull(newEquation);
    Assert.assertEquals(newEquation, innerReduction.eContainer());
  }

  /**
   * Tests that applying NormalizeReductionDeep to an outer reduction
   * will move a nested reduction to its own equation.
   */
  @Test
  public void nestedReduction_02() {
    final SystemBody systemBody = Utility.GetSystemBody(NormalizeReductionDeepTest.getSystem("nestedReduction"));
    final StandardEquation originalEquation = UtilityBase.GetEquation(systemBody, "X");
    AlphaExpression _expr = originalEquation.getExpr();
    final ReduceExpression outerReduction = ((ReduceExpression) _expr);
    AlphaExpression _body = outerReduction.getBody();
    final ReduceExpression innerReduction = ((ReduceExpression) _body);
    NormalizeReductionDeep.apply(outerReduction);
    Assert.assertEquals(originalEquation, outerReduction.eContainer());
    AlphaExpression _body_1 = outerReduction.getBody();
    Assert.assertTrue((_body_1 instanceof VariableExpression));
    AlphaExpression _body_2 = outerReduction.getBody();
    final VariableExpression variable = ((VariableExpression) _body_2);
    final String newEquationName = variable.getVariable().getName();
    final Function1<StandardEquation, Boolean> _function = (StandardEquation eq) -> {
      String _name = eq.getVariable().getName();
      return Boolean.valueOf(Objects.equal(_name, newEquationName));
    };
    final StandardEquation newEquation = IterableExtensions.<StandardEquation>head(IterableExtensions.<StandardEquation>filter(Iterables.<StandardEquation>filter(systemBody.getEquations(), StandardEquation.class), _function));
    Assert.assertNotNull(newEquation);
    Assert.assertEquals(newEquation, innerReduction.eContainer());
  }

  /**
   * Tests that applying NormalizeReductionDeep to an inner reduction
   * will move it to its own equation.
   */
  @Test
  public void nestedReduction_03() {
    final SystemBody systemBody = Utility.GetSystemBody(NormalizeReductionDeepTest.getSystem("nestedReduction"));
    final StandardEquation originalEquation = UtilityBase.GetEquation(systemBody, "X");
    AlphaExpression _expr = originalEquation.getExpr();
    final ReduceExpression outerReduction = ((ReduceExpression) _expr);
    AlphaExpression _body = outerReduction.getBody();
    final ReduceExpression innerReduction = ((ReduceExpression) _body);
    NormalizeReductionDeep.apply(innerReduction);
    Assert.assertEquals(originalEquation, outerReduction.eContainer());
    AlphaExpression _body_1 = outerReduction.getBody();
    Assert.assertTrue((_body_1 instanceof VariableExpression));
    AlphaExpression _body_2 = outerReduction.getBody();
    final VariableExpression variable = ((VariableExpression) _body_2);
    final String newEquationName = variable.getVariable().getName();
    final Function1<StandardEquation, Boolean> _function = (StandardEquation eq) -> {
      String _name = eq.getVariable().getName();
      return Boolean.valueOf(Objects.equal(_name, newEquationName));
    };
    final StandardEquation newEquation = IterableExtensions.<StandardEquation>head(IterableExtensions.<StandardEquation>filter(Iterables.<StandardEquation>filter(systemBody.getEquations(), StandardEquation.class), _function));
    Assert.assertNotNull(newEquation);
    Assert.assertEquals(newEquation, innerReduction.eContainer());
  }
}
