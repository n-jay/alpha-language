package alpha.model.transformation;

import alpha.model.AlphaExpression;
import alpha.model.AlphaExpressionVisitable;
import alpha.model.BinaryExpression;
import alpha.model.DependenceExpression;
import alpha.model.factory.AlphaUserFactory;
import alpha.model.util.AbstractAlphaExpressionVisitor;
import alpha.model.util.AffineFactorizer;
import fr.irisa.cairn.jnimap.isl.ISLMultiAff;
import java.util.Arrays;
import java.util.HashMap;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.xbase.lib.Pair;

/**
 * Raises up dependence functions through the AST of a given expression.
 * This is done by factorizing dependence functions and bringing the "common factor" terms
 * up through the AST as high as they can be.
 * Some of these rules can be thought of as the opposite of the Normalize rules.
 * 
 * One use case is to expose the maximum amount of reuse, enabling automatic reuse vector selection
 * for the Simlpifying Reductions optimization.
 */
@SuppressWarnings("all")
public class RaiseDependence extends AbstractAlphaExpressionVisitor {
  /**
   * Protected constructor to restrict access to the instance methods.
   */
  protected RaiseDependence() {
  }

  /**
   * Applies dependence raising to the AST of the given visitable expression.
   */
  public static void apply(final AlphaExpressionVisitable visitable) {
    new RaiseDependence().accept(visitable);
  }

  /**
   * Applies the binary expression rules.
   */
  @Override
  public void outBinaryExpression(final BinaryExpression be) {
    this.binaryExpressionRule(be, be.getLeft(), be.getRight());
  }

  /**
   * From:  f1@A op f2@B
   * To:    (f')@(f1'@A op f2'@B)
   * Where: f1 = f' @ f1' and f2 = f' @ f2'
   */
  protected Object _binaryExpressionRule(final BinaryExpression be, final DependenceExpression left, final DependenceExpression right) {
    final ISLMultiAff f1 = left.getFunction();
    final ISLMultiAff f2 = right.getFunction();
    final Pair<ISLMultiAff, HashMap<ISLMultiAff, ISLMultiAff>> factorizationResult = AffineFactorizer.factorizeExpressions(f1, f2);
    final ISLMultiAff fPrime = factorizationResult.getKey();
    final ISLMultiAff f1Prime = factorizationResult.getValue().get(f1);
    final ISLMultiAff f2Prime = factorizationResult.getValue().get(f2);
    final DependenceExpression newLeft = AlphaUserFactory.createDependenceExpression(f1Prime, left.getExpr());
    final DependenceExpression newRight = AlphaUserFactory.createDependenceExpression(f2Prime, right.getExpr());
    final BinaryExpression newBinaryExpr = AlphaUserFactory.createBinaryExpression(be.getOperator(), newLeft, newRight);
    final DependenceExpression newParent = AlphaUserFactory.createDependenceExpression(fPrime, newBinaryExpr);
    EcoreUtil.replace(be, newParent);
    return null;
  }

  /**
   * No matching binary expression rule: do nothing.
   */
  protected Object _binaryExpressionRule(final BinaryExpression be, final AlphaExpression left, final AlphaExpression right) {
    return null;
  }

  protected Object binaryExpressionRule(final BinaryExpression be, final AlphaExpression left, final AlphaExpression right) {
    if (left instanceof DependenceExpression
         && right instanceof DependenceExpression) {
      return _binaryExpressionRule(be, (DependenceExpression)left, (DependenceExpression)right);
    } else if (left != null
         && right != null) {
      return _binaryExpressionRule(be, left, right);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(be, left, right).toString());
    }
  }
}
