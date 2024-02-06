package alpha.model.tests.transformations;

import alpha.commands.Utility;
import alpha.commands.UtilityBase;
import alpha.model.AlphaExpression;
import alpha.model.AlphaModelLoader;
import alpha.model.BinaryExpression;
import alpha.model.DependenceExpression;
import alpha.model.StandardEquation;
import alpha.model.VariableExpression;
import alpha.model.transformation.RaiseDependence;
import fr.irisa.cairn.jnimap.isl.ISLMultiAff;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class RaiseDependenceTest {
  /**
   * The path to the Alpha file for these unit tests.
   */
  private static final String alphaFile = "resources/src-valid/transformation-tests/raise-dependence/raiseDependence.alpha";

  /**
   * Gets the desired equation for these unit tests.
   */
  public static StandardEquation getEquation(final String system, final String equation) {
    try {
      return UtilityBase.GetEquation(Utility.GetSystemBody(UtilityBase.GetSystem(AlphaModelLoader.loadModel(RaiseDependenceTest.alphaFile), system)), equation);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  @Test
  public void nestedDependenceFunction_01() {
    final StandardEquation equation = RaiseDependenceTest.getEquation("nestedDependenceFunction_01", "X");
    AlphaExpression _expr = equation.getExpr();
    final DependenceExpression originalDependence = ((DependenceExpression) _expr);
    final ISLMultiAff f1 = originalDependence.getFunction();
    AlphaExpression _expr_1 = originalDependence.getExpr();
    final ISLMultiAff f2 = ((DependenceExpression) _expr_1).getFunction();
    RaiseDependence.apply(equation.getExpr());
    Assert.assertTrue(DependenceExpression.class.isInstance(equation.getExpr()));
    AlphaExpression _expr_2 = equation.getExpr();
    final DependenceExpression topDependence = ((DependenceExpression) _expr_2);
    Assert.assertTrue(VariableExpression.class.isInstance(topDependence.getExpr()));
    final ISLMultiAff f = topDependence.getFunction();
    Assert.assertTrue(f.isPlainEqual(f2.pullback(f1)));
  }

  @Test
  public void simpleBinaryExpression_01() {
    final StandardEquation equation = RaiseDependenceTest.getEquation("simpleBinaryExpression_01", "X");
    AlphaExpression _expr = equation.getExpr();
    final BinaryExpression originalBinaryExpr = ((BinaryExpression) _expr);
    AlphaExpression _left = originalBinaryExpr.getLeft();
    final ISLMultiAff f1 = ((DependenceExpression) _left).getFunction();
    AlphaExpression _right = originalBinaryExpr.getRight();
    final ISLMultiAff f2 = ((DependenceExpression) _right).getFunction();
    RaiseDependence.apply(equation.getExpr());
    Assert.assertTrue(DependenceExpression.class.isInstance(equation.getExpr()));
    AlphaExpression _expr_1 = equation.getExpr();
    final DependenceExpression topDependence = ((DependenceExpression) _expr_1);
    Assert.assertTrue(BinaryExpression.class.isInstance(topDependence.getExpr()));
    AlphaExpression _expr_2 = topDependence.getExpr();
    final BinaryExpression binaryExpr = ((BinaryExpression) _expr_2);
    Assert.assertTrue(DependenceExpression.class.isInstance(binaryExpr.getLeft()));
    Assert.assertTrue(DependenceExpression.class.isInstance(binaryExpr.getRight()));
    AlphaExpression _left_1 = binaryExpr.getLeft();
    final DependenceExpression left = ((DependenceExpression) _left_1);
    AlphaExpression _right_1 = binaryExpr.getRight();
    final DependenceExpression right = ((DependenceExpression) _right_1);
    final ISLMultiAff fPrime = topDependence.getFunction();
    final ISLMultiAff f1Prime = left.getFunction();
    final ISLMultiAff f2Prime = right.getFunction();
    Assert.assertTrue(f1.isPlainEqual(f1Prime.pullback(fPrime.copy())));
    Assert.assertTrue(f2.isPlainEqual(f2Prime.pullback(fPrime)));
  }

  @Test
  public void binaryExpressionBecomesNested_01() {
    final StandardEquation equation = RaiseDependenceTest.getEquation("binaryExpressionBecomesNested_01", "X");
    AlphaExpression _expr = equation.getExpr();
    final DependenceExpression originalDependence = ((DependenceExpression) _expr);
    final ISLMultiAff f1 = originalDependence.getFunction();
    AlphaExpression _expr_1 = originalDependence.getExpr();
    final BinaryExpression originalBinaryExpr = ((BinaryExpression) _expr_1);
    AlphaExpression _left = originalBinaryExpr.getLeft();
    final ISLMultiAff f2 = ((DependenceExpression) _left).getFunction();
    AlphaExpression _right = originalBinaryExpr.getRight();
    final ISLMultiAff f3 = ((DependenceExpression) _right).getFunction();
    RaiseDependence.apply(equation.getExpr());
    Assert.assertTrue(DependenceExpression.class.isInstance(equation.getExpr()));
    AlphaExpression _expr_2 = equation.getExpr();
    final DependenceExpression topDependence = ((DependenceExpression) _expr_2);
    final ISLMultiAff f1Prime = topDependence.getFunction();
    Assert.assertTrue(BinaryExpression.class.isInstance(topDependence.getExpr()));
    AlphaExpression _expr_3 = topDependence.getExpr();
    final BinaryExpression binaryExpr = ((BinaryExpression) _expr_3);
    Assert.assertTrue(DependenceExpression.class.isInstance(binaryExpr.getLeft()));
    Assert.assertTrue(DependenceExpression.class.isInstance(binaryExpr.getRight()));
    AlphaExpression _left_1 = binaryExpr.getLeft();
    final ISLMultiAff f2Prime = ((DependenceExpression) _left_1).getFunction();
    AlphaExpression _right_1 = binaryExpr.getRight();
    final ISLMultiAff f3Prime = ((DependenceExpression) _right_1).getFunction();
    final ISLMultiAff firstExpected = f2.pullback(f1.copy());
    final ISLMultiAff firstActual = f2Prime.pullback(f1Prime.copy());
    Assert.assertTrue(firstExpected.isPlainEqual(firstActual));
    final ISLMultiAff secondExpected = f3.pullback(f1);
    final ISLMultiAff secondActual = f3Prime.pullback(f1Prime);
    Assert.assertTrue(secondExpected.isPlainEqual(secondActual));
  }
}
