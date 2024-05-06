package alpha.model.tests.transformations;

import alpha.commands.UtilityBase;
import alpha.model.AlphaExpression;
import alpha.model.AlphaModelLoader;
import alpha.model.CaseExpression;
import alpha.model.DependenceExpression;
import alpha.model.IndexExpression;
import alpha.model.ReduceExpression;
import alpha.model.RestrictExpression;
import alpha.model.StandardEquation;
import alpha.model.transformation.StandardizeNames;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class StandardizeNamesTest {
  /**
   * The path to the Alpha file for these unit tests.
   */
  private static final String alphaFile = "resources/src-valid/transformation-tests/standardize-names/standardizeNames.alpha";

  @Test
  public void useEquationNames_01() {
    final StandardEquation equation = StandardizeNamesTest.getEquation("useEquationNames_01", "Y");
    final EList<String> expectedNames = equation.getIndexNames();
    StandardizeNamesTest.assertNamesCorrect_caseRestrictDep(expectedNames, equation);
  }

  @Test
  public void useVariableNames_01() {
    final StandardEquation equation = StandardizeNamesTest.getEquation("useVariableNames_01", "Y");
    final List<String> expectedNames = equation.getVariable().getDomain().getIndexNames();
    StandardizeNamesTest.assertNamesCorrect_caseRestrictDep(expectedNames, equation);
  }

  @Test
  public void useEquationNames_02() {
    final StandardEquation equation = StandardizeNamesTest.getEquation("useEquationNames_02", "Y");
    final EList<String> expectedNames = equation.getIndexNames();
    StandardizeNames.apply(equation);
    AlphaExpression _expr = equation.getExpr();
    StandardizeNamesTest.assertIndexExprNamesCorrect(expectedNames, ((IndexExpression) _expr));
  }

  @Test
  public void useVariableNames_02() {
    final StandardEquation equation = StandardizeNamesTest.getEquation("useVariableNames_02", "Y");
    final List<String> expectedNames = equation.getVariable().getDomain().getIndexNames();
    StandardizeNames.apply(equation);
    AlphaExpression _expr = equation.getExpr();
    StandardizeNamesTest.assertIndexExprNamesCorrect(expectedNames, ((IndexExpression) _expr));
  }

  @Test
  public void useEquationNames_03() {
    final StandardEquation equation = StandardizeNamesTest.getEquation("useEquationNames_03", "Y");
    final EList<String> expectedNames = equation.getIndexNames();
    StandardizeNames.apply(equation);
    AlphaExpression _expr = equation.getExpr();
    StandardizeNamesTest.assertReduceNamesCorrect(expectedNames, ((ReduceExpression) _expr));
  }

  @Test
  public void useVariableNames_03() {
    final StandardEquation equation = StandardizeNamesTest.getEquation("useVariableNames_03", "Y");
    final List<String> expectedNames = equation.getVariable().getDomain().getIndexNames();
    StandardizeNames.apply(equation);
    AlphaExpression _expr = equation.getExpr();
    StandardizeNamesTest.assertReduceNamesCorrect(expectedNames, ((ReduceExpression) _expr));
  }

  /**
   * Gets the desired system for these unit tests.
   */
  public static StandardEquation getEquation(final String system, final String equation) {
    try {
      return UtilityBase.GetEquation(UtilityBase.GetSystemBody(UtilityBase.GetSystem(AlphaModelLoader.loadModel(StandardizeNamesTest.alphaFile), system), 0), equation);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  /**
   * Asserts that the names are correct.
   * The equation's expression is expected to be of the following form:
   * 
   * case {
   *     D1: R1@E1;
   *     D2: R2@E2;
   * }
   */
  public static void assertNamesCorrect_caseRestrictDep(final List<String> expectedNames, final StandardEquation equation) {
    StandardizeNames.apply(equation);
    AlphaExpression _expr = equation.getExpr();
    final CaseExpression caseExpr = ((CaseExpression) _expr);
    AlphaExpression _get = caseExpr.getExprs().get(0);
    final RestrictExpression restrict1 = ((RestrictExpression) _get);
    StandardizeNamesTest.assertRestrictNamesCorrect(expectedNames, restrict1);
    AlphaExpression _expr_1 = restrict1.getExpr();
    final DependenceExpression dependence1 = ((DependenceExpression) _expr_1);
    StandardizeNamesTest.assertDependenceNamesCorrect(expectedNames, dependence1);
    AlphaExpression _get_1 = caseExpr.getExprs().get(1);
    final RestrictExpression restrict2 = ((RestrictExpression) _get_1);
    StandardizeNamesTest.assertRestrictNamesCorrect(expectedNames, restrict2);
    AlphaExpression _expr_2 = restrict2.getExpr();
    final DependenceExpression dependence2 = ((DependenceExpression) _expr_2);
    StandardizeNamesTest.assertDependenceNamesCorrect(expectedNames, dependence2);
  }

  /**
   * Checks that the names of a restrict expression were updated correctly.
   */
  public static void assertRestrictNamesCorrect(final List<String> expectedNames, final RestrictExpression expr) {
    Assert.assertTrue(IterableExtensions.elementsEqual(expectedNames, expr.getContextDomain().getIndexNames()));
    Assert.assertTrue(IterableExtensions.elementsEqual(expectedNames, expr.getExpressionDomain().getIndexNames()));
    Assert.assertTrue(IterableExtensions.elementsEqual(expectedNames, expr.getRestrictDomain().getIndexNames()));
  }

  /**
   * Checks that the names of a dependence expression were updated correctly.
   */
  public static void assertDependenceNamesCorrect(final List<String> expectedNames, final DependenceExpression expr) {
    Assert.assertTrue(IterableExtensions.elementsEqual(expectedNames, expr.getContextDomain().getIndexNames()));
    Assert.assertTrue(IterableExtensions.elementsEqual(expectedNames, expr.getExpressionDomain().getIndexNames()));
    Assert.assertTrue(IterableExtensions.elementsEqual(expectedNames, expr.getFunction().getSpace().getInputNames()));
    final List<String> outputNames = expr.getFunction().getSpace().getOutputNames();
    Assert.assertEquals(((Object[])Conversions.unwrapArray(outputNames, Object.class)).length, expr.getFunction().getNbOutputs());
    for (final String name : outputNames) {
      {
        Assert.assertNotNull(name);
        Assert.assertNotEquals("", name);
      }
    }
  }

  public static void assertIndexExprNamesCorrect(final List<String> expectedNames, final IndexExpression expr) {
    Assert.assertTrue(IterableExtensions.elementsEqual(expectedNames, expr.getContextDomain().getIndexNames()));
    Assert.assertTrue(IterableExtensions.elementsEqual(expectedNames, expr.getExpressionDomain().getIndexNames()));
    Assert.assertTrue(IterableExtensions.elementsEqual(expectedNames, expr.getFunction().getSpace().getInputNames()));
  }

  public static void assertReduceNamesCorrect(final List<String> expectedNames, final ReduceExpression expr) {
    Assert.assertTrue(IterableExtensions.elementsEqual(expectedNames, expr.getContextDomain().getIndexNames()));
    Assert.assertTrue(IterableExtensions.elementsEqual(expectedNames, expr.getExpressionDomain().getIndexNames()));
    final Iterable<String> projectionNamesStart = IterableExtensions.<String>take(expr.getProjection().getSpace().getInputNames(), expectedNames.size());
    Assert.assertTrue(IterableExtensions.elementsEqual(expectedNames, projectionNamesStart));
    final List<String> expectedBodyNames = expr.getProjection().getSpace().getInputNames();
    Assert.assertTrue(IterableExtensions.elementsEqual(expectedBodyNames, expr.getBody().getContextDomain().getIndexNames()));
    Assert.assertTrue(IterableExtensions.elementsEqual(expectedBodyNames, expr.getBody().getExpressionDomain().getIndexNames()));
  }
}
