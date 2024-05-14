package alpha.codegen.writeC;

import alpha.codegen.CustomExpr;
import alpha.codegen.Expression;
import alpha.codegen.Factory;
import alpha.codegen.ProgramBuilder;
import alpha.codegen.isl.AffineConverter;
import alpha.model.AlphaExpression;
import alpha.model.ConstantExpression;
import alpha.model.DependenceExpression;
import alpha.model.VariableExpression;
import java.util.ArrayList;
import java.util.Arrays;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;

/**
 * Converts Alpha dependence expressions to C expressions.
 * The type of the dependence expression's child determines
 * what C expression(s) to emit.
 * 
 * These rules could have been simply added to the ExprConverter
 * class, but were split out to improve readability.
 */
@SuppressWarnings("all")
public class DependenceExprConverter {
  /**
   * The converter used for converting the body of a dependence expression into C expressions.
   */
  protected final ExprConverter exprConverter;

  /**
   * Constructs a new converter for dependence expressions.
   */
  public DependenceExprConverter(final ExprConverter exprConverter) {
    this.exprConverter = exprConverter;
  }

  /**
   * Dispatches the conversion of a dependence expression based on the child expression.
   */
  public Expression convertExpr(final ProgramBuilder program, final DependenceExpression expr) {
    return this.convertExpr(program, expr, expr.getExpr());
  }

  /**
   * If the child is a constant, then simply emit that constant.
   */
  protected Expression _convertExpr(final ProgramBuilder program, final DependenceExpression parent, final ConstantExpression child) {
    return this.exprConverter.convertExpr(program, child);
  }

  /**
   * If the child is a variable, emit the appropriate kind of access with the identity function.
   * If the Alpha variable is an input, it's accessed via the memory macro.
   * Otherwise, it's accessed via the "eval" function.
   */
  protected Expression _convertExpr(final ProgramBuilder program, final DependenceExpression parent, final VariableExpression child) {
    final ArrayList<CustomExpr> indexExprs = AffineConverter.convertMultiAff(parent.getFunction());
    Boolean _isInput = child.getVariable().isInput();
    if ((_isInput).booleanValue()) {
      return Factory.callExpr(child.getVariable().getName(), ((Expression[])Conversions.unwrapArray(indexExprs, Expression.class)));
    } else {
      final String accessFunction = Common.getEvalName(child.getVariable());
      return Factory.callExpr(accessFunction, ((Expression[])Conversions.unwrapArray(indexExprs, Expression.class)));
    }
  }

  /**
   * Default case for child expressions that aren't supported yet.
   */
  protected Expression _convertExpr(final ProgramBuilder program, final DependenceExpression parent, final AlphaExpression child) {
    try {
      throw new Exception("Not implemented yet!");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  public Expression convertExpr(final ProgramBuilder program, final DependenceExpression parent, final AlphaExpression child) {
    if (child instanceof ConstantExpression) {
      return _convertExpr(program, parent, (ConstantExpression)child);
    } else if (child instanceof VariableExpression) {
      return _convertExpr(program, parent, (VariableExpression)child);
    } else if (child != null) {
      return _convertExpr(program, parent, child);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(program, parent, child).toString());
    }
  }
}
