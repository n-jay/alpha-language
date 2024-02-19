package alpha.model.transformation;

import alpha.model.AlphaExpression;
import alpha.model.AlphaExpressionVisitable;
import alpha.model.AlphaInternalStateConstructor;
import alpha.model.BinaryExpression;
import alpha.model.BooleanExpression;
import alpha.model.CaseExpression;
import alpha.model.ConstantExpression;
import alpha.model.DependenceExpression;
import alpha.model.IntegerExpression;
import alpha.model.MultiArgExpression;
import alpha.model.RealExpression;
import alpha.model.UnaryExpression;
import alpha.model.VariableExpression;
import alpha.model.factory.AlphaUserFactory;
import alpha.model.issue.AlphaIssue;
import alpha.model.util.AbstractAlphaExpressionVisitor;
import alpha.model.util.AffineFactorizer;
import alpha.model.util.CommonExtensions;
import com.google.common.base.Objects;
import fr.irisa.cairn.jnimap.isl.ISLMultiAff;
import fr.irisa.cairn.jnimap.isl.ISLSpace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.MapExtensions;
import org.eclipse.xtext.xbase.lib.Pair;

/**
 * Raises up dependence functions through the AST of a given expression.
 * This is done by factorizing dependence functions and bringing the "common factor" terms
 * up through the AST as high as they can be.
 * Some of these rules can be thought of as the opposite of the Normalize rules.
 * 
 * One use case is to expose the maximum amount of reuse, enabling automatic reuse vector selection
 * for the Simlpifying Reductions optimization.
 * 
 * List of Rules:
 * Constant and Variable Expressions:
 *     These rules effectively just wrap constants and variables in dependence functions.
 *     Note: they only apply if the constant/variable isn't already wrapped in a dependence function.
 * 
 *     (X) goes to (f @ X) where X is a constant and f is a map from the context domain to a zero-dimensional range.
 *     (X) goes to (f @ X) where X is a variable and f is the identity function.
 * 
 * Dependence Expressions:
 *     This rule simply merges nested dependence functions.
 * 
 *     (f1 @ f2 @ E) goes to (f @ E) where f=f1 @ f2
 * 
 * Binary Expressions:
 *     This rule factorizes the dependence functions f1 and f2,
 *     wrapping the binary expression in a dependence function of the common factor.
 * 
 *     ((f1 @ E1) op (f2 @ E2)) goes to ((f')@((f1' @ E1) op (f2' @ E2))) where f1 = f' @ f1' and f2 = f' @ f2'
 * 
 * Multi-Arg Expressions:
 *     This is the same as the Binary Expressions rule, but factorizes more than one expression.
 * 
 *     op(f1@E1, f2@E2, ...) goes to (f')@ op(f1'@E1, f2'@E2, ...) where fn = f' @ fn'
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
   * Applies the constant expression rules.
   */
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
   * Where: X is a constant, and f is a map from the context domain to a zero-dimensional range.
   */
  protected void constantExpressionRule(final ConstantExpression expr) {
    EObject _eContainer = expr.eContainer();
    if ((_eContainer instanceof DependenceExpression)) {
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
  }

  /**
   * Applies the variable expression rules.
   */
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
   * From:  f1 @ (f2 @ E)
   * To:    f @ E
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
   * Applies the unary expression rules.
   */
  @Override
  public void outUnaryExpression(final UnaryExpression ue) {
    this.unaryExpressionRule(ue, ue.getExpr());
  }

  /**
   * Pull up the dependence expressions within a unary expression.
   * 
   * From:  op (f @ E)
   * To:    f @ (op E)
   */
  protected List<AlphaIssue> _unaryExpressionRule(final UnaryExpression ue, final DependenceExpression de) {
    List<AlphaIssue> _xblockexpression = null;
    {
      EcoreUtil.replace(de, de.getExpr());
      EcoreUtil.replace(ue, de);
      de.setExpr(ue);
      _xblockexpression = AlphaInternalStateConstructor.recomputeContextDomain(de);
    }
    return _xblockexpression;
  }

  /**
   * No matching unary expression rule: do nothing.
   */
  protected List<AlphaIssue> _unaryExpressionRule(final UnaryExpression ue, final AlphaExpression expr) {
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
   * Pull out a common factor from dependence expressions within a binary expression.
   * 
   * From:  f1 @ E1 op f2 @ E2
   * To:    (f')@((f1' @ E1) op (f2' @ E2))
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

  /**
   * Applies the multi-argument expression rules.
   */
  @Override
  public void outMultiArgExpression(final MultiArgExpression me) {
    final EList<AlphaExpression> children = me.getExprs();
    final Function1<AlphaExpression, Boolean> _function = (AlphaExpression child) -> {
      return Boolean.valueOf((child instanceof DependenceExpression));
    };
    boolean _forall = IterableExtensions.<AlphaExpression>forall(children, _function);
    if (_forall) {
      final Function1<AlphaExpression, DependenceExpression> _function_1 = (AlphaExpression child) -> {
        return ((DependenceExpression) child);
      };
      this.multiArgExpressionRule(me, ((DependenceExpression[])Conversions.unwrapArray(ListExtensions.<AlphaExpression, DependenceExpression>map(children, _function_1), DependenceExpression.class)));
    }
  }

  /**
   * Pull out a common factor from dependence expressions within a multi-arg expression.
   * 
   * From:  op (f1@E1, f2@E2, ...)
   * To:    (f')@ op(f1'@E1, f2'@E2, ...)
   * Where: fn = f' @ fn'
   */
  protected List<AlphaIssue> multiArgExpressionRule(final MultiArgExpression me, final DependenceExpression... children) {
    List<AlphaIssue> _xblockexpression = null;
    {
      final Function1<DependenceExpression, AlphaExpression> _function = (DependenceExpression de) -> {
        return de.getExpr();
      };
      final Function1<DependenceExpression, ISLMultiAff> _function_1 = (DependenceExpression de) -> {
        return de.getFunction();
      };
      final HashMap<AlphaExpression, ISLMultiAff> innerExpressionAndDependence = CommonExtensions.<AlphaExpression, ISLMultiAff>toHashMap(MapExtensions.<AlphaExpression, DependenceExpression, ISLMultiAff>mapValues(IterableExtensions.<AlphaExpression, DependenceExpression>toMap(((Iterable<? extends DependenceExpression>)Conversions.doWrapArray(children)), _function), _function_1));
      final Collection<ISLMultiAff> functions = innerExpressionAndDependence.values();
      final Pair<ISLMultiAff, HashMap<ISLMultiAff, ISLMultiAff>> factorizationResult = AffineFactorizer.factorizeExpressions(((ISLMultiAff[])Conversions.unwrapArray(functions, ISLMultiAff.class)));
      final ISLMultiAff commonFactor = factorizationResult.getKey();
      final HashMap<ISLMultiAff, ISLMultiAff> remainingTermsMap = factorizationResult.getValue();
      final Function1<ISLMultiAff, ISLMultiAff> _function_2 = (ISLMultiAff de) -> {
        return remainingTermsMap.get(de);
      };
      final Function1<Map.Entry<AlphaExpression, ISLMultiAff>, DependenceExpression> _function_3 = (Map.Entry<AlphaExpression, ISLMultiAff> innerExprAndRemainder) -> {
        return AlphaUserFactory.createDependenceExpression(innerExprAndRemainder.getValue(), innerExprAndRemainder.getKey());
      };
      final ArrayList<DependenceExpression> newChildren = CommonExtensions.<DependenceExpression>toArrayList(IterableExtensions.<Map.Entry<AlphaExpression, ISLMultiAff>, DependenceExpression>map(MapExtensions.<AlphaExpression, ISLMultiAff, ISLMultiAff>mapValues(innerExpressionAndDependence, _function_2).entrySet(), _function_3));
      final MultiArgExpression newMultiArgExpr = AlphaUserFactory.createMultiArgExpression(me.getOperator());
      newMultiArgExpr.getExprs().addAll(newChildren);
      final DependenceExpression newParent = AlphaUserFactory.createDependenceExpression(commonFactor, newMultiArgExpr);
      EcoreUtil.replace(me, newParent);
      _xblockexpression = AlphaInternalStateConstructor.recomputeContextDomain(newParent);
    }
    return _xblockexpression;
  }

  /**
   * Applies the case expression rules.
   */
  @Override
  public void outCaseExpression(final CaseExpression ce) {
    final EList<AlphaExpression> children = ce.getExprs();
    final Function1<AlphaExpression, Boolean> _function = (AlphaExpression child) -> {
      return Boolean.valueOf((child instanceof DependenceExpression));
    };
    boolean _forall = IterableExtensions.<AlphaExpression>forall(children, _function);
    if (_forall) {
      final Function1<AlphaExpression, DependenceExpression> _function_1 = (AlphaExpression child) -> {
        return ((DependenceExpression) child);
      };
      this.caseExpressionRule(ce, ((DependenceExpression[])Conversions.unwrapArray(ListExtensions.<AlphaExpression, DependenceExpression>map(children, _function_1), DependenceExpression.class)));
    }
  }

  /**
   * Pull out a common factor from dependence expressions within a multi-arg expression.
   * 
   * From:  case {f1@E1, f2@E2, ...}
   * To:    (f')@ case{f1'@E1, f2'@E2, ...}
   * Where: fn = f' @ fn'
   */
  protected List<AlphaIssue> caseExpressionRule(final CaseExpression ce, final DependenceExpression... children) {
    List<AlphaIssue> _xblockexpression = null;
    {
      final Function1<DependenceExpression, AlphaExpression> _function = (DependenceExpression de) -> {
        return de.getExpr();
      };
      final Function1<DependenceExpression, ISLMultiAff> _function_1 = (DependenceExpression de) -> {
        return de.getFunction();
      };
      final HashMap<AlphaExpression, ISLMultiAff> innerExpressionAndDependence = CommonExtensions.<AlphaExpression, ISLMultiAff>toHashMap(MapExtensions.<AlphaExpression, DependenceExpression, ISLMultiAff>mapValues(IterableExtensions.<AlphaExpression, DependenceExpression>toMap(((Iterable<? extends DependenceExpression>)Conversions.doWrapArray(children)), _function), _function_1));
      final Collection<ISLMultiAff> functions = innerExpressionAndDependence.values();
      final Pair<ISLMultiAff, HashMap<ISLMultiAff, ISLMultiAff>> factorizationResult = AffineFactorizer.factorizeExpressions(((ISLMultiAff[])Conversions.unwrapArray(functions, ISLMultiAff.class)));
      final ISLMultiAff commonFactor = factorizationResult.getKey();
      final HashMap<ISLMultiAff, ISLMultiAff> remainingTermsMap = factorizationResult.getValue();
      final Function1<ISLMultiAff, ISLMultiAff> _function_2 = (ISLMultiAff de) -> {
        return remainingTermsMap.get(de);
      };
      final Function1<Map.Entry<AlphaExpression, ISLMultiAff>, DependenceExpression> _function_3 = (Map.Entry<AlphaExpression, ISLMultiAff> innerExprAndRemainder) -> {
        return AlphaUserFactory.createDependenceExpression(innerExprAndRemainder.getValue(), innerExprAndRemainder.getKey());
      };
      final ArrayList<DependenceExpression> newChildren = CommonExtensions.<DependenceExpression>toArrayList(IterableExtensions.<Map.Entry<AlphaExpression, ISLMultiAff>, DependenceExpression>map(MapExtensions.<AlphaExpression, ISLMultiAff, ISLMultiAff>mapValues(innerExpressionAndDependence, _function_2).entrySet(), _function_3));
      final CaseExpression newCaseExpr = AlphaUserFactory.createCaseExpression();
      newCaseExpr.getExprs().addAll(newChildren);
      final DependenceExpression newParent = AlphaUserFactory.createDependenceExpression(commonFactor, newCaseExpr);
      EcoreUtil.replace(ce, newParent);
      _xblockexpression = AlphaInternalStateConstructor.recomputeContextDomain(newParent);
    }
    return _xblockexpression;
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

  protected List<AlphaIssue> unaryExpressionRule(final UnaryExpression ue, final AlphaExpression de) {
    if (de instanceof DependenceExpression) {
      return _unaryExpressionRule(ue, (DependenceExpression)de);
    } else if (de != null) {
      return _unaryExpressionRule(ue, de);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(ue, de).toString());
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
