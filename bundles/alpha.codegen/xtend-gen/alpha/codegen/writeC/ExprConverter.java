package alpha.codegen.writeC;

import alpha.codegen.BinaryOperator;
import alpha.codegen.CustomExpr;
import alpha.codegen.Expression;
import alpha.codegen.Factory;
import alpha.codegen.ProgramBuilder;
import alpha.codegen.TernaryExprBuilder;
import alpha.codegen.UnaryOperator;
import alpha.model.AlphaExpression;
import alpha.model.AutoRestrictExpression;
import alpha.model.BinaryExpression;
import alpha.model.CaseExpression;
import alpha.model.ConstantExpression;
import alpha.model.DependenceExpression;
import alpha.model.IfExpression;
import alpha.model.IndexExpression;
import alpha.model.MultiArgExpression;
import alpha.model.PolynomialIndexExpression;
import alpha.model.ReduceExpression;
import alpha.model.RestrictExpression;
import alpha.model.UnaryExpression;
import alpha.model.VariableExpression;
import alpha.model.util.CommonExtensions;
import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class ExprConverter {
  /**
   * Alpha "restrict" expressions don't need to be wrapped in conditionals,
   * as the context domain within Alpha ensures the expression is only accessed where appropriate.
   * For restrict expressions inside "case" or "reduce" expressions,
   * the conditional checking should be handled by the conversion of the "case" or "reduce.
   */
  protected static Expression _convertExpr(final ProgramBuilder program, final RestrictExpression re) {
    return ExprConverter.convertExpr(program, re.getExpr());
  }

  /**
   * Alpha "auto-restrict" expressions don't need to be wrapped in conditionals,
   * as the context domain within Alpha ensures the expression is only accessed where appropriate.
   * For auto-restrict expressions inside "case" or "reduce" expressions,
   * the conditional checking should be handled by the conversion of the "case" or "reduce.
   */
  protected static Expression _convertExpr(final ProgramBuilder program, final AutoRestrictExpression re) {
    return ExprConverter.convertExpr(program, re.getExpr());
  }

  /**
   * Converts an Alpha "case" expression into a C ternary expression.
   */
  protected static Expression _convertExpr(final ProgramBuilder program, final CaseExpression ce) {
    int _size = ce.getExprs().size();
    boolean _lessEqualsThan = (_size <= 0);
    if (_lessEqualsThan) {
      throw new IllegalArgumentException("Alpha case expression found with no cases.");
    }
    final ArrayList<AutoRestrictExpression> autoRestricts = CommonExtensions.<AutoRestrictExpression>toArrayList(Iterables.<AutoRestrictExpression>filter(ce.getExprs(), AutoRestrictExpression.class));
    int _size_1 = autoRestricts.size();
    boolean _greaterThan = (_size_1 > 1);
    if (_greaterThan) {
      throw new IllegalArgumentException("Alpha case expression found with more than one auto-restrict case.");
    }
    int _size_2 = ce.getExprs().size();
    boolean _equals = (_size_2 == 1);
    if (_equals) {
      return ExprConverter.convertExpr(program, ce.getExprs().get(0));
    }
    AlphaExpression _xifexpression = null;
    int _size_3 = autoRestricts.size();
    boolean _equals_1 = (_size_3 == 1);
    if (_equals_1) {
      _xifexpression = autoRestricts.get(0);
    } else {
      _xifexpression = IterableExtensions.<AlphaExpression>last(ce.getExprs());
    }
    final AlphaExpression lastCase = _xifexpression;
    final Function1<AlphaExpression, Boolean> _function = (AlphaExpression it) -> {
      return Boolean.valueOf((it == lastCase));
    };
    final Iterable<AlphaExpression> remainingCases = IterableExtensions.<AlphaExpression>reject(ce.getExprs(), _function);
    final AlphaExpression firstCase = IterableExtensions.<AlphaExpression>head(remainingCases);
    final TernaryExprBuilder builder = TernaryExprBuilder.start(ExprConverter.createConditional(firstCase), ExprConverter.convertExpr(program, firstCase));
    final Consumer<AlphaExpression> _function_1 = (AlphaExpression it) -> {
      builder.addCase(ExprConverter.createConditional(it), ExprConverter.convertExpr(program, it));
    };
    IterableExtensions.<AlphaExpression>tail(remainingCases).forEach(_function_1);
    return builder.elseCase(ExprConverter.convertExpr(program, lastCase));
  }

  /**
   * Creates a conditional expression to ensure a restrict case is being respected.
   */
  protected static Expression _createConditional(final RestrictExpression re) {
    try {
      throw new Exception("Not implemented yet!");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  /**
   * Creates a conditional expression to ensure this expression (which is neither a restrict
   * nor an auto-restrict) is only evaluated within its context domain.
   */
  protected static Expression _createConditional(final AlphaExpression expr) {
    try {
      throw new Exception("Not implemented yet!");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  /**
   * Dependence expression conversion is handled by a separate class.
   */
  protected static Expression _convertExpr(final ProgramBuilder program, final DependenceExpression expr) {
    try {
      throw new Exception("Not implemented yet!");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  protected static Expression _convertExpr(final ProgramBuilder program, final IfExpression expr) {
    final Expression conditional = ExprConverter.convertExpr(program, expr.getCondExpr());
    final Expression thenExpr = ExprConverter.convertExpr(program, expr.getThenExpr());
    final Expression elseExpr = ExprConverter.convertExpr(program, expr.getElseExpr());
    return Factory.ternaryExpr(conditional, thenExpr, elseExpr);
  }

  /**
   * Index expressions in Alpha convert indices into values.
   * Thus, we just need to output the expression itself.
   */
  protected static Expression _convertExpr(final ProgramBuilder program, final IndexExpression ie) {
    final String exprLiteral = ie.getFunctionExpr().plainToString().replaceAll("[\\[\\]]", "");
    return Factory.customExpr(exprLiteral);
  }

  protected static Expression _convertExpr(final ProgramBuilder program, final PolynomialIndexExpression expr) {
    try {
      throw new Exception("Not implemented yet!");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  /**
   * Reduce expression conversion is handled by a separate class.
   */
  protected static Expression _convertExpr(final ProgramBuilder program, final ReduceExpression expr) {
    try {
      throw new Exception("Not implemented yet!");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  /**
   * Translates a variable expression into a variable access.
   * Note: variable expressions inside dependence expressions are handled
   * by the dependence expression converter, not here.
   * If this is reached, then the variable is implicitly being accessed by the identity function.
   */
  protected static Expression _convertExpr(final ProgramBuilder program, final VariableExpression expr) {
    final Function1<String, CustomExpr> _function = (String it) -> {
      return Factory.customExpr(it);
    };
    final List<CustomExpr> indexExprs = ListExtensions.<String, CustomExpr>map(expr.getContextDomain().getIndexNames(), _function);
    Boolean _isInput = expr.getVariable().isInput();
    if ((_isInput).booleanValue()) {
      return Factory.callExpr(expr.getVariable().getName(), ((Expression[])Conversions.unwrapArray(indexExprs, Expression.class)));
    } else {
      final String accessFunction = Common.getEvalName(expr.getVariable());
      return Factory.callExpr(accessFunction, ((Expression[])Conversions.unwrapArray(indexExprs, Expression.class)));
    }
  }

  /**
   * Constants in Alpha simply map to the same constant in C.
   */
  protected static Expression _convertExpr(final ProgramBuilder program, final ConstantExpression ce) {
    return Factory.customExpr(ce.valueString());
  }

  /**
   * There is a 1-to-1 matching between Alpha and C unary expressions.
   */
  protected static Expression _convertExpr(final ProgramBuilder program, final UnaryExpression ue) {
    final UnaryOperator op = Common.getOperator(ue.getOperator());
    final Expression expr = ExprConverter.convertExpr(program, ue.getExpr());
    return Factory.unaryExpr(op, expr);
  }

  protected static Expression _convertExpr(final ProgramBuilder program, final BinaryExpression be) {
    final Expression left = ExprConverter.convertExpr(program, be.getLeft());
    final Expression right = ExprConverter.convertExpr(program, be.getRight());
    final BinaryOperator op = Common.getOperator(be.getOperator());
    return Factory.binaryExpr(op, left, right);
  }

  /**
   * Multi-arg expressions are converted into a tree of nested binary expressions.
   */
  protected static Expression _convertExpr(final ProgramBuilder program, final MultiArgExpression expr) {
    final BinaryOperator op = Common.getOperator(expr.getOperator());
    final Function1<AlphaExpression, Expression> _function = (AlphaExpression it) -> {
      return ExprConverter.convertExpr(program, it);
    };
    final List<Expression> children = ListExtensions.<AlphaExpression, Expression>map(expr.getExprs(), _function);
    return Factory.binaryExprTree(op, ((Expression[])Conversions.unwrapArray(children, Expression.class)));
  }

  /**
   * Default case to catch unknown expression types.
   */
  protected static Expression _convertExpr(final ProgramBuilder program, final AlphaExpression expr) {
    try {
      throw new Exception("Not implemented yet!");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  public static Expression convertExpr(final ProgramBuilder program, final AlphaExpression expr) {
    if (expr instanceof ReduceExpression) {
      return _convertExpr(program, (ReduceExpression)expr);
    } else if (expr instanceof AutoRestrictExpression) {
      return _convertExpr(program, (AutoRestrictExpression)expr);
    } else if (expr instanceof BinaryExpression) {
      return _convertExpr(program, (BinaryExpression)expr);
    } else if (expr instanceof CaseExpression) {
      return _convertExpr(program, (CaseExpression)expr);
    } else if (expr instanceof ConstantExpression) {
      return _convertExpr(program, (ConstantExpression)expr);
    } else if (expr instanceof DependenceExpression) {
      return _convertExpr(program, (DependenceExpression)expr);
    } else if (expr instanceof IfExpression) {
      return _convertExpr(program, (IfExpression)expr);
    } else if (expr instanceof IndexExpression) {
      return _convertExpr(program, (IndexExpression)expr);
    } else if (expr instanceof MultiArgExpression) {
      return _convertExpr(program, (MultiArgExpression)expr);
    } else if (expr instanceof PolynomialIndexExpression) {
      return _convertExpr(program, (PolynomialIndexExpression)expr);
    } else if (expr instanceof RestrictExpression) {
      return _convertExpr(program, (RestrictExpression)expr);
    } else if (expr instanceof UnaryExpression) {
      return _convertExpr(program, (UnaryExpression)expr);
    } else if (expr instanceof VariableExpression) {
      return _convertExpr(program, (VariableExpression)expr);
    } else if (expr != null) {
      return _convertExpr(program, expr);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(program, expr).toString());
    }
  }

  public static Expression createConditional(final AlphaExpression re) {
    if (re instanceof RestrictExpression) {
      return _createConditional((RestrictExpression)re);
    } else if (re != null) {
      return _createConditional(re);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(re).toString());
    }
  }
}
