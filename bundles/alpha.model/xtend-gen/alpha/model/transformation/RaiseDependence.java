package alpha.model.transformation;

import alpha.model.AlphaExpression;
import alpha.model.AlphaExpressionVisitable;
import alpha.model.AlphaInternalStateConstructor;
import alpha.model.BinaryExpression;
import alpha.model.BooleanExpression;
import alpha.model.ConstantExpression;
import alpha.model.DependenceExpression;
import alpha.model.IntegerExpression;
import alpha.model.RealExpression;
import alpha.model.VariableExpression;
import alpha.model.factory.AlphaUserFactory;
import alpha.model.issue.AlphaIssue;
import alpha.model.util.AbstractAlphaExpressionVisitor;
import alpha.model.util.AffineFactorizer;
import com.google.common.base.Objects;
import fr.irisa.cairn.jnimap.isl.ISLMultiAff;
import fr.irisa.cairn.jnimap.isl.ISLSpace;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.xbase.lib.InputOutput;
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

  @Override
  public void outConstantExpression(final ConstantExpression ce) {
    this.constantExpressionRule(ce);
  }

  /**
   * Wraps a constant expression in a dependence expression,
   * assuming it's not already wrapped.
   * 
   * From:  X
   * To:    f @ X
   * Where: X is a constant, and f is a map with a zero-dimensional range.
   */
  protected void constantExpressionRule(final ConstantExpression expr) {
    boolean _isInstance = DependenceExpression.class.isInstance(expr.eContainer());
    if (_isInstance) {
      return;
    }
    final ISLMultiAff toEmpty = ISLMultiAff.buildZero(expr.getContextDomain().getSpace());
    ConstantExpression _switchResult = null;
    boolean _matched = false;
    if (expr instanceof BooleanExpression) {
      if (Objects.equal(expr, ((BooleanExpression)expr))) {
        _matched=true;
        _switchResult = AlphaUserFactory.createBooleanExpression((((BooleanExpression)expr).getValue()).booleanValue());
      }
    }
    if (!_matched) {
      if (expr instanceof IntegerExpression) {
        if (Objects.equal(expr, ((IntegerExpression)expr))) {
          _matched=true;
          _switchResult = AlphaUserFactory.createIntegerExpression((((IntegerExpression)expr).getValue()).intValue());
        }
      }
    }
    if (!_matched) {
      if (expr instanceof RealExpression) {
        if (Objects.equal(expr, ((RealExpression)expr))) {
          _matched=true;
          _switchResult = AlphaUserFactory.createRealExpression((((RealExpression)expr).getValue()).floatValue());
        }
      }
    }
    if (!_matched) {
      throw new IllegalArgumentException("Unrecognized constant expression type.");
    }
    final ConstantExpression replacementConstant = _switchResult;
    final DependenceExpression wrappingDependence = AlphaUserFactory.createDependenceExpression(toEmpty, replacementConstant);
    EcoreUtil.replace(expr, wrappingDependence);
    AlphaInternalStateConstructor.recomputeContextDomain(wrappingDependence);
    InputOutput.println();
  }

  @Override
  public void outVariableExpression(final VariableExpression ve) {
    this.variableExpressionRule(ve);
  }

  /**
   * Wraps a variable expression in a dependence expression,
   * assuming it's not already wrapped.
   * 
   * From:  X
   * To:    f @ X
   * Where: f is the identity function
   */
  protected void variableExpressionRule(final VariableExpression expr) {
    boolean _isInstance = DependenceExpression.class.isInstance(expr.eContainer());
    if (_isInstance) {
      return;
    }
    final ISLMultiAff identity = ISLMultiAff.buildIdentity(ISLSpace.idMapDimFromSetDim(expr.getContextDomain().getSpace()));
    final VariableExpression replacementVar = AlphaUserFactory.createVariableExpression(expr.getVariable());
    final DependenceExpression wrappingDependence = AlphaUserFactory.createDependenceExpression(identity, replacementVar);
    EcoreUtil.replace(expr, wrappingDependence);
    AlphaInternalStateConstructor.recomputeContextDomain(wrappingDependence);
  }

  /**
   * Applies the binary expression rules.
   */
  @Override
  public void outDependenceExpression(final DependenceExpression de) {
    this.dependenceExpressionRule(de, de.getExpr());
  }

  /**
   * Merge nested dependence expressions.
   * 
   * From:  f1 @ (f2 @ X)
   * To:    f @ X
   * Where: f = f1 @ f2
   */
  protected List<AlphaIssue> _dependenceExpressionRule(final DependenceExpression de, final DependenceExpression innerDe) {
    List<AlphaIssue> _xblockexpression = null;
    {
      final ISLMultiAff f1 = de.getFunction();
      final ISLMultiAff f2 = innerDe.getFunction();
      final ISLMultiAff f = f2.pullback(f1);
      final DependenceExpression newDe = AlphaUserFactory.createDependenceExpression(f, innerDe.getExpr());
      EcoreUtil.replace(de, newDe);
      _xblockexpression = AlphaInternalStateConstructor.recomputeContextDomain(newDe);
    }
    return _xblockexpression;
  }

  /**
   * No matching dependence expression rule: do nothing.
   */
  protected List<AlphaIssue> _dependenceExpressionRule(final DependenceExpression de, final AlphaExpression inner) {
    return null;
  }

  /**
   * Applies the binary expression rules.
   */
  @Override
  public void outBinaryExpression(final BinaryExpression be) {
    this.binaryExpressionRule(be, be.getLeft(), be.getRight());
  }

  /**
   * Pull out a common factor from dependence expressions within a binary expression
   * 
   * From:  f1@A op f2@B
   * To:    (f')@(f1'@A op f2'@B)
   * Where: f1 = f' @ f1' and f2 = f' @ f2'
   */
  protected List<AlphaIssue> _binaryExpressionRule(final BinaryExpression be, final DependenceExpression left, final DependenceExpression right) {
    List<AlphaIssue> _xblockexpression = null;
    {
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
      _xblockexpression = AlphaInternalStateConstructor.recomputeContextDomain(newParent);
    }
    return _xblockexpression;
  }

  /**
   * No matching binary expression rule: do nothing.
   */
  protected List<AlphaIssue> _binaryExpressionRule(final BinaryExpression be, final AlphaExpression left, final AlphaExpression right) {
    return null;
  }

  protected List<AlphaIssue> dependenceExpressionRule(final DependenceExpression de, final AlphaExpression innerDe) {
    if (innerDe instanceof DependenceExpression) {
      return _dependenceExpressionRule(de, (DependenceExpression)innerDe);
    } else if (innerDe != null) {
      return _dependenceExpressionRule(de, innerDe);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(de, innerDe).toString());
    }
  }

  protected List<AlphaIssue> binaryExpressionRule(final BinaryExpression be, final AlphaExpression left, final AlphaExpression right) {
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
