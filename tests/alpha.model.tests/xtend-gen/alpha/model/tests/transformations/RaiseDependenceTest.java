package alpha.model.tests.transformations;

import alpha.commands.Utility;
import alpha.commands.UtilityBase;
import alpha.model.AlphaExpression;
import alpha.model.AlphaModelLoader;
import alpha.model.AutoRestrictExpression;
import alpha.model.BinaryExpression;
import alpha.model.CaseExpression;
import alpha.model.ConstantExpression;
import alpha.model.DependenceExpression;
import alpha.model.ExternalMultiArgExpression;
import alpha.model.IndexExpression;
import alpha.model.MultiArgExpression;
import alpha.model.RestrictExpression;
import alpha.model.StandardEquation;
import alpha.model.UnaryExpression;
import alpha.model.VariableExpression;
import alpha.model.transformation.LiftAutoRestrict;
import alpha.model.transformation.Normalize;
import alpha.model.transformation.RaiseDependence;
import alpha.model.util.AShow;
import alpha.model.util.CommonExtensions;
import fr.irisa.cairn.jnimap.isl.ISLMultiAff;
import fr.irisa.cairn.jnimap.isl.ISLSet;
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
    AlphaExpression _expr = equation.getExpr();
    Assert.assertTrue((_expr instanceof DependenceExpression));
    AlphaExpression _expr_1 = equation.getExpr();
    final DependenceExpression topDependence = ((DependenceExpression) _expr_1);
    AlphaExpression _expr_2 = topDependence.getExpr();
    Assert.assertTrue((_expr_2 instanceof ConstantExpression));
  }

  @Test
  public void wrapVariableExpression_01() {
    final StandardEquation equation = RaiseDependenceTest.getEquation("wrapVariableExpression_01", "X");
    RaiseDependence.apply(equation.getExpr());
    AlphaExpression _expr = equation.getExpr();
    Assert.assertTrue((_expr instanceof DependenceExpression));
    AlphaExpression _expr_1 = equation.getExpr();
    final DependenceExpression topDependence = ((DependenceExpression) _expr_1);
    AlphaExpression _expr_2 = topDependence.getExpr();
    Assert.assertTrue((_expr_2 instanceof VariableExpression));
  }

  @Test
  public void wrapVariableExpression_02() {
    final StandardEquation equation = RaiseDependenceTest.getEquation("wrapVariableExpression_02", "X");
    RaiseDependence.apply(equation.getExpr());
    AlphaExpression _expr = equation.getExpr();
    Assert.assertTrue((_expr instanceof DependenceExpression));
    AlphaExpression _expr_1 = equation.getExpr();
    final DependenceExpression topDependence = ((DependenceExpression) _expr_1);
    AlphaExpression _expr_2 = topDependence.getExpr();
    Assert.assertTrue((_expr_2 instanceof VariableExpression));
  }

  @Test
  public void wrapIndexExpression_01() {
    final StandardEquation equation = RaiseDependenceTest.getEquation("wrapIndexExpression_01", "X");
    AlphaExpression _expr = equation.getExpr();
    final ISLMultiAff originalFunction = ((IndexExpression) _expr).getFunction();
    RaiseDependence.apply(equation.getExpr());
    AlphaExpression _expr_1 = equation.getExpr();
    Assert.assertTrue((_expr_1 instanceof DependenceExpression));
    AlphaExpression _expr_2 = equation.getExpr();
    final DependenceExpression dependence = ((DependenceExpression) _expr_2);
    Assert.assertTrue(originalFunction.isPlainEqual(dependence.getFunction()));
    AlphaExpression _expr_3 = dependence.getExpr();
    Assert.assertTrue((_expr_3 instanceof IndexExpression));
    AlphaExpression _expr_4 = dependence.getExpr();
    final IndexExpression index = ((IndexExpression) _expr_4);
    Assert.assertTrue(index.getFunction().isIdentity());
  }

  @Test
  public void wrapIndexExpression_02() {
    final StandardEquation equation = RaiseDependenceTest.getEquation("wrapIndexExpression_02", "X");
    AlphaExpression _expr = equation.getExpr();
    final DependenceExpression originalDependence = ((DependenceExpression) _expr);
    AlphaExpression _expr_1 = originalDependence.getExpr();
    final IndexExpression originalIndex = ((IndexExpression) _expr_1);
    final ISLMultiAff expectedFunction = originalIndex.getFunction().pullback(originalDependence.getFunction());
    RaiseDependence.apply(equation.getExpr());
    AlphaExpression _expr_2 = equation.getExpr();
    Assert.assertTrue((_expr_2 instanceof DependenceExpression));
    AlphaExpression _expr_3 = equation.getExpr();
    final DependenceExpression dependence = ((DependenceExpression) _expr_3);
    Assert.assertTrue(expectedFunction.isPlainEqual(dependence.getFunction()));
    AlphaExpression _expr_4 = dependence.getExpr();
    Assert.assertTrue((_expr_4 instanceof IndexExpression));
    AlphaExpression _expr_5 = dependence.getExpr();
    final IndexExpression index = ((IndexExpression) _expr_5);
    Assert.assertTrue(index.getFunction().isIdentity());
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
    AlphaExpression _expr_2 = equation.getExpr();
    Assert.assertTrue((_expr_2 instanceof DependenceExpression));
    AlphaExpression _expr_3 = equation.getExpr();
    final DependenceExpression topDependence = ((DependenceExpression) _expr_3);
    AlphaExpression _expr_4 = topDependence.getExpr();
    Assert.assertTrue((_expr_4 instanceof VariableExpression));
    final ISLMultiAff f = topDependence.getFunction();
    Assert.assertTrue(f.isPlainEqual(f2.pullback(f1)));
  }

  @Test
  public void restrictExpression_01() {
    final StandardEquation equation = RaiseDependenceTest.getEquation("restrictExpression_01", "X");
    AlphaExpression _expr = equation.getExpr();
    final RestrictExpression originalRestrict = ((RestrictExpression) _expr);
    AlphaExpression _expr_1 = originalRestrict.getExpr();
    final DependenceExpression originalDependence = ((DependenceExpression) _expr_1);
    final ISLSet d = originalRestrict.getRestrictDomain().copy();
    final ISLMultiAff f = originalDependence.getFunction().copy();
    RaiseDependence.apply(equation.getExpr());
    AlphaExpression _expr_2 = equation.getExpr();
    Assert.assertTrue((_expr_2 instanceof DependenceExpression));
    AlphaExpression _expr_3 = equation.getExpr();
    final DependenceExpression outerDependence = ((DependenceExpression) _expr_3);
    final ISLMultiAff f1 = outerDependence.getFunction();
    AlphaExpression _expr_4 = outerDependence.getExpr();
    Assert.assertTrue((_expr_4 instanceof RestrictExpression));
    AlphaExpression _expr_5 = outerDependence.getExpr();
    final RestrictExpression updatedRestrict = ((RestrictExpression) _expr_5);
    final ISLSet d1 = updatedRestrict.getRestrictDomain();
    AlphaExpression _expr_6 = updatedRestrict.getExpr();
    Assert.assertTrue((_expr_6 instanceof DependenceExpression));
    AlphaExpression _expr_7 = updatedRestrict.getExpr();
    final DependenceExpression innerDependence = ((DependenceExpression) _expr_7);
    final ISLMultiAff f2 = innerDependence.getFunction();
    Assert.assertTrue(f.isPlainEqual(f2.pullback(f1.copy())));
    Assert.assertTrue(d.isPlainEqual(d1.preimage(f1)));
  }

  @Test
  public void autoRestrictExpression_01() {
    final StandardEquation equation = RaiseDependenceTest.getEquation("autoRestrictExpression_01", "X");
    AlphaExpression _expr = equation.getExpr();
    final CaseExpression originalCase = ((CaseExpression) _expr);
    AlphaExpression _get = originalCase.getExprs().get(0);
    final AutoRestrictExpression originalRestrict = ((AutoRestrictExpression) _get);
    AlphaExpression _expr_1 = originalRestrict.getExpr();
    final DependenceExpression originalDependence = ((DependenceExpression) _expr_1);
    final ISLMultiAff f = originalDependence.getFunction().copy();
    final ISLSet d = originalDependence.getContextDomain().copy();
    RaiseDependence.apply(equation.getExpr());
    AlphaExpression _expr_2 = equation.getExpr();
    Assert.assertTrue((_expr_2 instanceof DependenceExpression));
    AlphaExpression _expr_3 = equation.getExpr();
    final DependenceExpression outerDependence = ((DependenceExpression) _expr_3);
    final ISLMultiAff f1 = outerDependence.getFunction();
    AlphaExpression _expr_4 = outerDependence.getExpr();
    Assert.assertTrue((_expr_4 instanceof CaseExpression));
    AlphaExpression _expr_5 = outerDependence.getExpr();
    final CaseExpression updatedCase = ((CaseExpression) _expr_5);
    Assert.assertEquals(1, updatedCase.getExprs().size());
    AlphaExpression _get_1 = updatedCase.getExprs().get(0);
    Assert.assertTrue((_get_1 instanceof DependenceExpression));
    AlphaExpression _get_2 = updatedCase.getExprs().get(0);
    final DependenceExpression middleDependence = ((DependenceExpression) _get_2);
    final ISLMultiAff f2 = middleDependence.getFunction();
    AlphaExpression _expr_6 = middleDependence.getExpr();
    Assert.assertTrue((_expr_6 instanceof RestrictExpression));
    AlphaExpression _expr_7 = middleDependence.getExpr();
    final RestrictExpression updatedRestriction = ((RestrictExpression) _expr_7);
    final ISLSet d1 = updatedRestriction.getRestrictDomain();
    AlphaExpression _expr_8 = updatedRestriction.getExpr();
    Assert.assertTrue((_expr_8 instanceof DependenceExpression));
    AlphaExpression _expr_9 = updatedRestriction.getExpr();
    final DependenceExpression innerDependence = ((DependenceExpression) _expr_9);
    final ISLMultiAff f3 = innerDependence.getFunction();
    Assert.assertTrue(f.isPlainEqual(f3.pullback(f2.copy().pullback(f1.copy()))));
    Assert.assertTrue(d.isPlainEqual(d1.preimage(f2.pullback(f1))));
  }

  @Test
  public void autoRestrictExpression_02() {
    final StandardEquation equation = RaiseDependenceTest.getEquation("autoRestrictExpression_02", "X");
    AlphaExpression _expr = equation.getExpr();
    final CaseExpression originalCase = ((CaseExpression) _expr);
    AlphaExpression _get = originalCase.getExprs().get(0);
    final RestrictExpression originalRestrict1 = ((RestrictExpression) _get);
    AlphaExpression _expr_1 = originalRestrict1.getExpr();
    final DependenceExpression originalDependence1 = ((DependenceExpression) _expr_1);
    AlphaExpression _get_1 = originalCase.getExprs().get(1);
    final AutoRestrictExpression originalRestrict2 = ((AutoRestrictExpression) _get_1);
    AlphaExpression _expr_2 = originalRestrict2.getExpr();
    final DependenceExpression originalDependence2 = ((DependenceExpression) _expr_2);
    final ISLSet d1 = originalRestrict1.getRestrictDomain().copy();
    final ISLSet d2 = originalDependence2.getContextDomain().copy();
    final ISLMultiAff f1 = originalDependence1.getFunction().copy();
    final ISLMultiAff f2 = originalDependence2.getFunction().copy();
    RaiseDependence.apply(equation.getExpr());
    AlphaExpression _expr_3 = equation.getExpr();
    Assert.assertTrue((_expr_3 instanceof DependenceExpression));
    AlphaExpression _expr_4 = equation.getExpr();
    final DependenceExpression outerDependence = ((DependenceExpression) _expr_4);
    final ISLMultiAff fPrime = outerDependence.getFunction();
    AlphaExpression _expr_5 = outerDependence.getExpr();
    Assert.assertTrue((_expr_5 instanceof CaseExpression));
    AlphaExpression _expr_6 = outerDependence.getExpr();
    final CaseExpression updatedCase = ((CaseExpression) _expr_6);
    Assert.assertEquals(2, updatedCase.getExprs().size());
    AlphaExpression _get_2 = updatedCase.getExprs().get(0);
    Assert.assertTrue((_get_2 instanceof DependenceExpression));
    AlphaExpression _get_3 = updatedCase.getExprs().get(0);
    final DependenceExpression updatedDep1 = ((DependenceExpression) _get_3);
    final ISLMultiAff f1Prime = updatedDep1.getFunction();
    AlphaExpression _expr_7 = updatedDep1.getExpr();
    Assert.assertTrue((_expr_7 instanceof RestrictExpression));
    AlphaExpression _expr_8 = updatedDep1.getExpr();
    final RestrictExpression updatedRestrict1 = ((RestrictExpression) _expr_8);
    final ISLSet d1Prime = updatedRestrict1.getRestrictDomain();
    AlphaExpression _expr_9 = updatedRestrict1.getExpr();
    Assert.assertTrue((_expr_9 instanceof DependenceExpression));
    AlphaExpression _expr_10 = updatedRestrict1.getExpr();
    final DependenceExpression innermostDep1 = ((DependenceExpression) _expr_10);
    final ISLMultiAff f1Prime2 = innermostDep1.getFunction();
    AlphaExpression _get_4 = updatedCase.getExprs().get(1);
    Assert.assertTrue((_get_4 instanceof DependenceExpression));
    AlphaExpression _get_5 = updatedCase.getExprs().get(1);
    final DependenceExpression updatedDep2 = ((DependenceExpression) _get_5);
    final ISLMultiAff f2Prime = updatedDep2.getFunction();
    AlphaExpression _expr_11 = updatedDep2.getExpr();
    Assert.assertTrue((_expr_11 instanceof RestrictExpression));
    AlphaExpression _expr_12 = updatedDep2.getExpr();
    final RestrictExpression updatedRestrict2 = ((RestrictExpression) _expr_12);
    final ISLSet d2Prime = updatedRestrict2.getRestrictDomain();
    AlphaExpression _expr_13 = updatedRestrict2.getExpr();
    Assert.assertTrue((_expr_13 instanceof DependenceExpression));
    AlphaExpression _expr_14 = updatedRestrict2.getExpr();
    final DependenceExpression innermostDep2 = ((DependenceExpression) _expr_14);
    final ISLMultiAff f2Prime2 = innermostDep2.getFunction();
    final ISLMultiAff fPrimeAtF1Prime = f1Prime.copy().pullback(fPrime.copy());
    Assert.assertTrue(f1.isPlainEqual(f1Prime2.pullback(fPrimeAtF1Prime.copy())));
    final ISLMultiAff fPrimeAtF2Prime = f2Prime.copy().pullback(fPrime.copy());
    Assert.assertTrue(f2.isPlainEqual(f2Prime2.pullback(fPrimeAtF2Prime.copy())));
    Assert.assertTrue(d1.isEqual(d1Prime.preimage(fPrimeAtF1Prime)));
    Assert.assertTrue(d2.isEqual(d2Prime.preimage(fPrimeAtF2Prime)));
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
    AlphaExpression _expr = equation.getExpr();
    Assert.assertTrue((_expr instanceof DependenceExpression));
    AlphaExpression _expr_1 = equation.getExpr();
    final DependenceExpression topDependence = ((DependenceExpression) _expr_1);
    final ISLMultiAff f1Prime = topDependence.getFunction();
    AlphaExpression _expr_2 = topDependence.getExpr();
    Assert.assertTrue((_expr_2 instanceof BinaryExpression));
    AlphaExpression _expr_3 = topDependence.getExpr();
    final BinaryExpression binaryExpr = ((BinaryExpression) _expr_3);
    AlphaExpression _left = binaryExpr.getLeft();
    Assert.assertTrue((_left instanceof DependenceExpression));
    AlphaExpression _right = binaryExpr.getRight();
    Assert.assertTrue((_right instanceof DependenceExpression));
    AlphaExpression _left_1 = binaryExpr.getLeft();
    final ISLMultiAff f2Prime = ((DependenceExpression) _left_1).getFunction();
    AlphaExpression _right_1 = binaryExpr.getRight();
    final ISLMultiAff f3Prime = ((DependenceExpression) _right_1).getFunction();
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
      Assert.assertTrue((child instanceof DependenceExpression));
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

  @Test
  public void externalFunction_01() {
    final StandardEquation equation = RaiseDependenceTest.getEquation("externalFunctionTest_01", "X");
    AlphaExpression _expr = equation.getExpr();
    final ExternalMultiArgExpression external = ((ExternalMultiArgExpression) _expr);
    AlphaExpression _get = external.getExprs().get(0);
    final IndexExpression index1 = ((IndexExpression) _get);
    final ISLMultiAff f1 = index1.getFunction();
    AlphaExpression _get_1 = external.getExprs().get(1);
    final IndexExpression index2 = ((IndexExpression) _get_1);
    final ISLMultiAff f2 = index2.getFunction();
    RaiseDependence.apply(equation.getExpr());
    AlphaExpression _expr_1 = equation.getExpr();
    Assert.assertTrue((_expr_1 instanceof DependenceExpression));
    AlphaExpression _expr_2 = equation.getExpr();
    final DependenceExpression topExpression = ((DependenceExpression) _expr_2);
    final ISLMultiAff fPrime = topExpression.getFunction();
    AlphaExpression _expr_3 = topExpression.getExpr();
    Assert.assertTrue((_expr_3 instanceof ExternalMultiArgExpression));
    AlphaExpression _expr_4 = topExpression.getExpr();
    final ExternalMultiArgExpression updatedExternal = ((ExternalMultiArgExpression) _expr_4);
    Assert.assertEquals(2, updatedExternal.getExprs().size());
    AlphaExpression _get_2 = updatedExternal.getExprs().get(0);
    Assert.assertTrue((_get_2 instanceof DependenceExpression));
    AlphaExpression _get_3 = updatedExternal.getExprs().get(0);
    final DependenceExpression dependence1 = ((DependenceExpression) _get_3);
    final ISLMultiAff f1Prime = dependence1.getFunction();
    AlphaExpression _get_4 = updatedExternal.getExprs().get(1);
    Assert.assertTrue((_get_4 instanceof DependenceExpression));
    AlphaExpression _get_5 = updatedExternal.getExprs().get(1);
    final DependenceExpression dependence2 = ((DependenceExpression) _get_5);
    final ISLMultiAff f2Prime = dependence2.getFunction();
    Assert.assertTrue(f1.isPlainEqual(f1Prime.pullback(fPrime.copy())));
    Assert.assertTrue(f2.isPlainEqual(f2Prime.pullback(fPrime)));
  }

  @Test
  public void caseTest_01() {
    final StandardEquation equation = RaiseDependenceTest.getEquation("caseTest_01", "X");
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
    final HashMap<AlphaExpression, ISLMultiAff> expectedFunctions = CommonExtensions.<AlphaExpression, ISLMultiAff>toHashMap(MapExtensions.<AlphaExpression, DependenceExpression, ISLMultiAff>mapValues(IterableExtensions.<AlphaExpression, DependenceExpression>toMap(ListExtensions.<AlphaExpression, DependenceExpression>map(((CaseExpression) _expr).getExprs(), _function), _function_1), _function_2));
    RaiseDependence.apply(equation.getExpr());
    Assert.assertTrue(DependenceExpression.class.isInstance(equation.getExpr()));
    AlphaExpression _expr_1 = equation.getExpr();
    final DependenceExpression topDependence = ((DependenceExpression) _expr_1);
    final ISLMultiAff commonFactor = topDependence.getFunction();
    Assert.assertTrue(CaseExpression.class.isInstance(topDependence.getExpr()));
    AlphaExpression _expr_2 = topDependence.getExpr();
    final CaseExpression caseExpr = ((CaseExpression) _expr_2);
    final Consumer<AlphaExpression> _function_3 = (AlphaExpression child) -> {
      Assert.assertTrue((child instanceof DependenceExpression));
    };
    caseExpr.getExprs().forEach(_function_3);
    final Function1<AlphaExpression, DependenceExpression> _function_4 = (AlphaExpression child) -> {
      return ((DependenceExpression) child);
    };
    final Function1<DependenceExpression, AlphaExpression> _function_5 = (DependenceExpression child) -> {
      return child.getExpr();
    };
    final Function1<DependenceExpression, ISLMultiAff> _function_6 = (DependenceExpression child) -> {
      return child.getFunction();
    };
    final HashMap<AlphaExpression, ISLMultiAff> remainingTerms = CommonExtensions.<AlphaExpression, ISLMultiAff>toHashMap(MapExtensions.<AlphaExpression, DependenceExpression, ISLMultiAff>mapValues(IterableExtensions.<AlphaExpression, DependenceExpression>toMap(ListExtensions.<AlphaExpression, DependenceExpression>map(caseExpr.getExprs(), _function_4), _function_5), _function_6));
    Set<AlphaExpression> _keySet = expectedFunctions.keySet();
    for (final AlphaExpression innerExpr : _keySet) {
      {
        final ISLMultiAff expected = expectedFunctions.get(innerExpr);
        final ISLMultiAff actual = remainingTerms.get(innerExpr).pullback(commonFactor.copy());
        Assert.assertTrue(expected.isPlainEqual(actual));
      }
    }
  }

  @Test
  public void normalizeUndoesRaising_Test02() {
    RaiseDependenceTest.normalizeTest("wrapVariableExpression_01", "X");
  }

  @Test
  public void normalizeUndoesRaising_Test03() {
    RaiseDependenceTest.normalizeTest("wrapVariableExpression_02", "X");
  }

  @Test
  public void normalizeUndoesRaising_Test04() {
    RaiseDependenceTest.normalizeTest("wrapIndexExpression_01", "X");
  }

  @Test
  public void normalizeUndoesRaising_Test05() {
    RaiseDependenceTest.normalizeTest("wrapIndexExpression_02", "X");
  }

  @Test
  public void normalizeUndoesRaising_Test06() {
    RaiseDependenceTest.normalizeTest("nestedDependenceFunction_01", "X");
  }

  @Test
  public void normalizeUndoesRaising_Test07() {
    RaiseDependenceTest.normalizeTest("restrictExpression_01", "X");
  }

  @Test
  public void normalizeUndoesRaising_Test08() {
    RaiseDependenceTest.normalizeTest("autoRestrictExpression_01", "X");
  }

  @Test
  public void normalizeUndoesRaising_Test09() {
    RaiseDependenceTest.normalizeTest("autoRestrictExpression_02", "X");
  }

  @Test
  public void normalizeUndoesRaising_Test10() {
    RaiseDependenceTest.normalizeTest("unaryExpression_01", "X");
  }

  @Test
  public void normalizeUndoesRaising_Test11() {
    RaiseDependenceTest.normalizeTest("simpleBinaryExpression_01", "X");
  }

  @Test
  public void normalizeUndoesRaising_Test12() {
    RaiseDependenceTest.normalizeTest("binaryExpressionBecomesNested_01", "X");
  }

  @Test
  public void normalizeUndoesRaising_Test13() {
    RaiseDependenceTest.normalizeTest("binaryExpressionBecomesNested_02", "X");
  }

  @Test
  public void normalizeUndoesRaising_Test14() {
    RaiseDependenceTest.normalizeTest("binaryExpressionBecomesNested_03", "X");
  }

  @Test
  public void normalizeUndoesRaising_Test15() {
    RaiseDependenceTest.normalizeTest("binaryExpressionBecomesNested_04", "X");
  }

  @Test
  public void normalizeUndoesRaising_Test16() {
    RaiseDependenceTest.normalizeTest("multiArgTest_01", "X");
  }

  @Test
  public void normalizeUndoesRaising_Test17() {
    RaiseDependenceTest.normalizeTest("caseTest_01", "X");
  }

  @Test
  public void normalizeUndoesRaising_Test18() {
    RaiseDependenceTest.normalizeTest("prefixScan", "X");
  }

  @Test
  public void normalizeUndoesRaising_Test19() {
    RaiseDependenceTest.normalizeTest("externalFunctionTest_01", "X");
  }

  /**
   * Used by several tests to ensure that the system can be normalized,
   * dependence raising can be applied, and then normalized again
   * to recreate the original normalization.
   */
  public static void normalizeTest(final String systemName, final String equationName) {
    final StandardEquation equation = RaiseDependenceTest.getEquation(systemName, equationName);
    LiftAutoRestrict.apply(equation);
    Normalize.apply(equation);
    final String expected = AShow.print(equation);
    RaiseDependence.apply(equation);
    Normalize.apply(equation);
    final String actual = AShow.print(equation);
    Assert.assertEquals(expected, actual);
  }
}
