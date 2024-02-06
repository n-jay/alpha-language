package alpha.model.tests.transformations;

import alpha.commands.Utility;
import alpha.commands.UtilityBase;
import alpha.model.AlphaExpression;
import alpha.model.AlphaModelLoader;
import alpha.model.AlphaSystem;
import alpha.model.BinaryExpression;
import alpha.model.DependenceExpression;
import alpha.model.StandardEquation;
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
   * Gets the desired system for these unit tests.
   */
  public static AlphaSystem getSystem(final String name) {
    try {
      return UtilityBase.GetSystem(AlphaModelLoader.loadModel(RaiseDependenceTest.alphaFile), name);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  @Test
  public void simpleBinaryExpression_01() {
    final StandardEquation equation = UtilityBase.GetEquation(Utility.GetSystemBody(RaiseDependenceTest.getSystem("simpleBinaryExpression01")), "X");
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
}
