package alpha.codegen.tests;

import alpha.codegen.BinaryExpr;
import alpha.codegen.BinaryOperator;
import alpha.codegen.CustomExpr;
import alpha.codegen.Expression;
import alpha.codegen.Factory;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IntegerRange;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class FactoryTest {
  /**
   * Tests that binary expression trees group elements left to right.
   */
  @Test
  public void binaryExprTree_01() {
    final Function1<Integer, CustomExpr> _function = (Integer it) -> {
      return Factory.customExpr(it.toString());
    };
    final Iterable<CustomExpr> exprs = IterableExtensions.<Integer, CustomExpr>map(new IntegerRange(0, 4), _function);
    final Expression tree = Factory.binaryExprTree(BinaryOperator.PLUS, ((Expression[])Conversions.unwrapArray(exprs, Expression.class)));
    Assert.assertTrue((tree instanceof BinaryExpr));
    final BinaryExpr root = ((BinaryExpr) tree);
    Expression _right = root.getRight();
    final CustomExpr four = ((CustomExpr) _right);
    Expression _left = root.getLeft();
    final BinaryExpr leftOf4 = ((BinaryExpr) _left);
    Expression _right_1 = leftOf4.getRight();
    final CustomExpr three = ((CustomExpr) _right_1);
    Expression _left_1 = leftOf4.getLeft();
    final BinaryExpr leftOf3 = ((BinaryExpr) _left_1);
    Expression _right_2 = leftOf3.getRight();
    final CustomExpr two = ((CustomExpr) _right_2);
    Expression _left_2 = leftOf3.getLeft();
    final BinaryExpr leftOf2 = ((BinaryExpr) _left_2);
    Expression _right_3 = leftOf2.getRight();
    final CustomExpr one = ((CustomExpr) _right_3);
    Expression _left_3 = leftOf2.getLeft();
    final CustomExpr zero = ((CustomExpr) _left_3);
    Assert.assertEquals("4", four.getExpression());
    Assert.assertEquals("3", three.getExpression());
    Assert.assertEquals("2", two.getExpression());
    Assert.assertEquals("1", one.getExpression());
    Assert.assertEquals("0", zero.getExpression());
  }
}
