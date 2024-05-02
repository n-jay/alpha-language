package alpha.model.transformation;

import alpha.model.AlphaExpression;
import alpha.model.AlphaExpressionVisitable;
import alpha.model.AlphaVisitable;
import alpha.model.DependenceExpression;
import alpha.model.RestrictExpression;
import alpha.model.StandardEquation;
import alpha.model.Variable;
import alpha.model.factory.AlphaUserFactory;
import alpha.model.util.AbstractAlphaCompleteVisitor;
import alpha.model.util.AlphaUtil;
import fr.irisa.cairn.jnimap.isl.ISLSet;
import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Exceptions;

/**
 * Standardizes the names of indices in most context domains,
 * expression domains, dependence functions, and restrict domains
 * throughout the provided AST (or sub-tree).
 * 
 * Within all of these, input dimensions are renamed to "i0", "i1", etc.
 * based on their position in the space.
 */
@SuppressWarnings("all")
public class StandardizeNames extends AbstractAlphaCompleteVisitor {
  /**
   * Protected constructor to force "apply" to be the entry point.
   */
  protected StandardizeNames() {
  }

  /**
   * Applies name standardization to an Alpha expression.
   */
  public static void apply(final AlphaExpressionVisitable visitable) {
    new StandardizeNames().accept(visitable);
  }

  /**
   * Applies name standardization to an Alpha system, equation, etc.
   */
  public static void apply(final AlphaVisitable visitable) {
    new StandardizeNames().accept(visitable);
  }

  /**
   * Checks whether the given list of names are valid index names for the given variable.
   */
  protected static boolean areValidNames(final List<String> indexNames, final Variable variable) {
    return ((indexNames != null) && (indexNames.size() == variable.getDomain().getNbIndices()));
  }

  /**
   * Gets the index names to use from a parent equation.
   */
  protected static List<String> _getIndexNames(final StandardEquation eq) {
    final Variable variable = eq.getVariable();
    final EList<String> equationNames = eq.getIndexNames();
    boolean _areValidNames = StandardizeNames.areValidNames(equationNames, variable);
    if (_areValidNames) {
      return equationNames;
    }
    final List<String> variableNames = variable.getDomain().getIndexNames();
    boolean _areValidNames_1 = StandardizeNames.areValidNames(variableNames, variable);
    if (_areValidNames_1) {
      return variableNames;
    }
    return AlphaUtil.defaultDimNames(variable.getDomain());
  }

  /**
   * Gets the index names to use from a parent dependence expression.
   */
  protected static List<String> _getIndexNames(final DependenceExpression expr) {
    return expr.getFunction().getSpace().getOutputNames();
  }

  /**
   * Gets the index names to use from a parent expression.
   */
  protected static List<String> _getIndexNames(final AlphaExpression expr) {
    return expr.getContextDomain().getIndexNames();
  }

  /**
   * Default rule if none of the other cases matched.
   */
  protected static List<String> _getIndexNames(final Object obj) {
    try {
      throw new Exception("Cannot get the index names to use from the given parent.");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  /**
   * Renames the indices of the context domain and expression domain of the expression.
   */
  @Override
  public void inAlphaExpression(final AlphaExpression expr) {
    final List<String> indexNames = StandardizeNames.getIndexNames(expr.eContainer());
    expr.setContextDomain(expr.getContextDomain().<ISLSet>renameIndices(indexNames));
    expr.setExpressionDomain(expr.getExpressionDomain().<ISLSet>renameIndices(indexNames));
  }

  /**
   * Renames the indices of the context domain, expression domain, and restrict domain
   * for the restrict expression.
   */
  @Override
  public void inRestrictExpression(final RestrictExpression expr) {
    final List<String> indexNames = StandardizeNames.getIndexNames(expr.eContainer());
    expr.setContextDomain(expr.getContextDomain().<ISLSet>renameIndices(indexNames));
    expr.setExpressionDomain(expr.getExpressionDomain().<ISLSet>renameIndices(indexNames));
    expr.setDomainExpr(AlphaUserFactory.createJNIDomain(AlphaUtil.renameIndices(expr.getRestrictDomain(), indexNames)));
  }

  /**
   * Renames the indices of the context domain and expression domain of the expression.
   * Also renames the inputs and outputs of the dependence function.
   */
  @Override
  public void outDependenceExpression(final DependenceExpression expr) {
    final List<String> indexNames = StandardizeNames.getIndexNames(expr.eContainer());
    expr.setContextDomain(expr.getContextDomain().<ISLSet>renameIndices(indexNames));
    expr.setExpressionDomain(expr.getExpressionDomain().<ISLSet>renameIndices(indexNames));
    expr.setFunctionExpr(AlphaUserFactory.createJNIFunction(AlphaUtil.renameOutputs(AlphaUtil.renameIndices(expr.getFunction(), indexNames))));
  }

  protected static List<String> getIndexNames(final Object expr) {
    if (expr instanceof DependenceExpression) {
      return _getIndexNames((DependenceExpression)expr);
    } else if (expr instanceof StandardEquation) {
      return _getIndexNames((StandardEquation)expr);
    } else if (expr instanceof AlphaExpression) {
      return _getIndexNames((AlphaExpression)expr);
    } else if (expr != null) {
      return _getIndexNames(expr);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(expr).toString());
    }
  }
}
