package alpha.model.tests.transformations;

import alpha.commands.Utility;
import alpha.commands.UtilityBase;
import alpha.model.AlphaExpression;
import alpha.model.AlphaModelLoader;
import alpha.model.BinaryExpression;
import alpha.model.ConstantExpression;
import alpha.model.DependenceExpression;
import alpha.model.MultiArgExpression;
import alpha.model.StandardEquation;
import alpha.model.UnaryExpression;
import alpha.model.VariableExpression;
import alpha.model.transformation.RaiseDependence;
import alpha.model.util.CommonExtensions;
import fr.irisa.cairn.jnimap.isl.ISLMultiAff;
import java.util.HashMap;
import java.util.Set;
import java.util.function.Consumer;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.MapExtensions;
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
  public void wrapConstantExpression_01() {
    final StandardEquation equation = RaiseDependenceTest.getEquation("wrapConstantExpression_01", "X");
    RaiseDependence.apply(equation.getExpr());
    Assert.assertTrue(DependenceExpression.class.isInstance(equation.getExpr()));
    AlphaExpression _expr = equation.getExpr();
    final DependenceExpression topDependence = ((DependenceExpression) _expr);
    Assert.assertTrue(ConstantExpression.class.isInstance(topDependence.getExpr()));
  }

  @Test
  public void wrapVariableExpression_01() {
    final StandardEquation equation = RaiseDependenceTest.getEquation("wrapVariableExpression_01", "X");
    RaiseDependence.apply(equation.getExpr());
    Assert.assertTrue(DependenceExpression.class.isInstance(equation.getExpr()));
    AlphaExpression _expr = equation.getExpr();
    final DependenceExpression topDependence = ((DependenceExpression) _expr);
    Assert.assertTrue(VariableExpression.class.isInstance(topDependence.getExpr()));
  }

  @Test
  public void wrapVariableExpression_02() {
    final StandardEquation equation = RaiseDependenceTest.getEquation("wrapVariableExpression_02", "X");
    RaiseDependence.apply(equation.getExpr());
    Assert.assertTrue(DependenceExpression.class.isInstance(equation.getExpr()));
    AlphaExpression _expr = equation.getExpr();
    final DependenceExpression topDependence = ((DependenceExpression) _expr);
    Assert.assertTrue(VariableExpression.class.isInstance(topDependence.getExpr()));
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
  public void unaryExpression_01() {
    final StandardEquation equation = RaiseDependenceTest.getEquation("unaryExpression_01", "X");
    AlphaExpression _expr = equation.getExpr();
    final UnaryExpression originalUnaryExpr = ((UnaryExpression) _expr);
    AlphaExpression _expr_1 = originalUnaryExpr.getExpr();
    final ISLMultiAff f = ((DependenceExpression) _expr_1).getFunction();
    RaiseDependence.apply(equation.getExpr());
    AlphaExpression _expr_2 = equation.getExpr();
    Assert.assertTrue((_expr_2 instanceof DependenceExpression));
    AlphaExpression _expr_3 = equation.getExpr();
    final DependenceExpression newDependence = ((DependenceExpression) _expr_3);
    Assert.assertTrue(f.isPlainEqual(newDependence.getFunction()));
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
    RaiseDependenceTest.assertBinaryEquationCorrect(equation, f1, f2);
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
    final ISLMultiAff firstExpected = f2.pullback(f1.copy());
    final ISLMultiAff secondExpected = f3.pullback(f1);
    RaiseDependenceTest.assertBinaryEquationCorrect(equation, firstExpected, secondExpected);
  }

  @Test
  public void binaryExpressionBecomesNested_02() {
    final StandardEquation equation = RaiseDependenceTest.getEquation("binaryExpressionBecomesNested_02", "X");
    AlphaExpression _expr = equation.getExpr();
    final DependenceExpression originalDependence = ((DependenceExpression) _expr);
    final ISLMultiAff f1 = originalDependence.getFunction();
    AlphaExpression _expr_1 = originalDependence.getExpr();
    final BinaryExpression originalBinaryExpr = ((BinaryExpression) _expr_1);
    AlphaExpression _left = originalBinaryExpr.getLeft();
    final ISLMultiAff f2 = ((DependenceExpression) _left).getFunction();
    final ISLMultiAff firstExpected = f2.pullback(f1.copy());
    final ISLMultiAff secondExpected = f1;
    RaiseDependenceTest.assertBinaryEquationCorrect(equation, firstExpected, secondExpected);
  }

  @Test
  public void binaryExpressionBecomesNested_03() {
    final StandardEquation equation = RaiseDependenceTest.getEquation("binaryExpressionBecomesNested_03", "X");
    AlphaExpression _expr = equation.getExpr();
    final DependenceExpression originalDependence = ((DependenceExpression) _expr);
    final ISLMultiAff f1 = originalDependence.getFunction();
    AlphaExpression _expr_1 = originalDependence.getExpr();
    final BinaryExpression originalBinaryExpr = ((BinaryExpression) _expr_1);
    AlphaExpression _right = originalBinaryExpr.getRight();
    final ISLMultiAff f3 = ((DependenceExpression) _right).getFunction();
    final ISLMultiAff firstExpected = f1.copy();
    final ISLMultiAff secondExpected = f3.pullback(f1);
    RaiseDependenceTest.assertBinaryEquationCorrect(equation, firstExpected, secondExpected);
  }

  @Test
  public void binaryExpressionBecomesNested_04() {
    final StandardEquation equation = RaiseDependenceTest.getEquation("binaryExpressionBecomesNested_04", "X");
    AlphaExpression _expr = equation.getExpr();
    final DependenceExpression originalDependence = ((DependenceExpression) _expr);
    final ISLMultiAff f1 = originalDependence.getFunction();
    final ISLMultiAff firstExpected = f1.copy();
    final ISLMultiAff secondExpected = f1;
    RaiseDependenceTest.assertBinaryEquationCorrect(equation, firstExpected, secondExpected);
  }

  public static void assertBinaryEquationCorrect(final StandardEquation equation, final ISLMultiAff firstExpected, final ISLMultiAff secondExpected) {
    RaiseDependence.apply(equation.getExpr());
    Assert.assertTrue(DependenceExpression.class.isInstance(equation.getExpr()));
    AlphaExpression _expr = equation.getExpr();
    final DependenceExpression topDependence = ((DependenceExpression) _expr);
    final ISLMultiAff f1Prime = topDependence.getFunction();
    Assert.assertTrue(BinaryExpression.class.isInstance(topDependence.getExpr()));
    AlphaExpression _expr_1 = topDependence.getExpr();
    final BinaryExpression binaryExpr = ((BinaryExpression) _expr_1);
    Assert.assertTrue(DependenceExpression.class.isInstance(binaryExpr.getLeft()));
    Assert.assertTrue(DependenceExpression.class.isInstance(binaryExpr.getRight()));
    AlphaExpression _left = binaryExpr.getLeft();
    final ISLMultiAff f2Prime = ((DependenceExpression) _left).getFunction();
    AlphaExpression _right = binaryExpr.getRight();
    final ISLMultiAff f3Prime = ((DependenceExpression) _right).getFunction();
    final ISLMultiAff firstActual = f2Prime.pullback(f1Prime.copy());
    Assert.assertTrue(firstExpected.isPlainEqual(firstActual));
    final ISLMultiAff secondActual = f3Prime.pullback(f1Prime);
    Assert.assertTrue(secondExpected.isPlainEqual(secondActual));
  }

  @Test
  public void multiArgTest_01() {
    final StandardEquation equation = RaiseDependenceTest.getEquation("multiArgTest_01", "X");
    AlphaExpression _expr = equation.getExpr();
    final Function1<AlphaExpression, DependenceExpression> _function = (AlphaExpression expr) -> {
      return ((DependenceExpression) expr);
    };
    final Function1<DependenceExpression, AlphaExpression> _function_1 = (DependenceExpression expr) -> {
      return expr.getExpr();
    };
    final Function1<DependenceExpression, ISLMultiAff> _function_2 = (DependenceExpression expr) -> {
      return expr.getFunction();
    };
    final HashMap<AlphaExpression, ISLMultiAff> expectedFunctions = CommonExtensions.<AlphaExpression, ISLMultiAff>toHashMap(MapExtensions.<AlphaExpression, DependenceExpression, ISLMultiAff>mapValues(IterableExtensions.<AlphaExpression, DependenceExpression>toMap(ListExtensions.<AlphaExpression, DependenceExpression>map(((MultiArgExpression) _expr).getExprs(), _function), _function_1), _function_2));
    RaiseDependence.apply(equation.getExpr());
    Assert.assertTrue(DependenceExpression.class.isInstance(equation.getExpr()));
    AlphaExpression _expr_1 = equation.getExpr();
    final DependenceExpression topDependence = ((DependenceExpression) _expr_1);
    final ISLMultiAff commonFactor = topDependence.getFunction();
    Assert.assertTrue(MultiArgExpression.class.isInstance(topDependence.getExpr()));
    AlphaExpression _expr_2 = topDependence.getExpr();
    final MultiArgExpression multiArgExpr = ((MultiArgExpression) _expr_2);
    final Consumer<AlphaExpression> _function_3 = (AlphaExpression child) -> {
      Assert.assertTrue(DependenceExpression.class.isInstance(child));
    };
    multiArgExpr.getExprs().forEach(_function_3);
    final Function1<AlphaExpression, DependenceExpression> _function_4 = (AlphaExpression child) -> {
      return ((DependenceExpression) child);
    };
    final Function1<DependenceExpression, AlphaExpression> _function_5 = (DependenceExpression child) -> {
      return child.getExpr();
    };
    final Function1<DependenceExpression, ISLMultiAff> _function_6 = (DependenceExpression child) -> {
      return child.getFunction();
    };
    final HashMap<AlphaExpression, ISLMultiAff> remainingTerms = CommonExtensions.<AlphaExpression, ISLMultiAff>toHashMap(MapExtensions.<AlphaExpression, DependenceExpression, ISLMultiAff>mapValues(IterableExtensions.<AlphaExpression, DependenceExpression>toMap(ListExtensions.<AlphaExpression, DependenceExpression>map(multiArgExpr.getExprs(), _function_4), _function_5), _function_6));
    Set<AlphaExpression> _keySet = expectedFunctions.keySet();
    for (final AlphaExpression innerExpr : _keySet) {
      {
        final ISLMultiAff expected = expectedFunctions.get(innerExpr);
        final ISLMultiAff actual = remainingTerms.get(innerExpr).pullback(commonFactor.copy());
        Assert.assertTrue(expected.isPlainEqual(actual));
      }
    }
  }
}
