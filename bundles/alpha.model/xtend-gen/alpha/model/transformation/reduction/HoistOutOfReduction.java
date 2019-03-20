package alpha.model.transformation.reduction;

import alpha.model.AbstractReduceExpression;
import alpha.model.AlphaExpression;
import alpha.model.AlphaInternalStateConstructor;
import alpha.model.BINARY_OP;
import alpha.model.BinaryExpression;
import alpha.model.DependenceExpression;
import alpha.model.MultiArgExpression;
import alpha.model.RestrictExpression;
import alpha.model.factory.AlphaUserFactory;
import alpha.model.transformation.Normalize;
import alpha.model.transformation.reduction.ReductionUtil;
import alpha.model.util.AlphaOperatorUtil;
import com.google.common.base.Objects;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * HoistOutOfReduction moves Binary/MultiArgExpression out of a reduction.
 * Given reduction of the form:
 *   reduce(op, f, E1 op E2)
 * it is transformed into:
 *   reduce(op, f, D : E1) op reduce(op, f, D : E2)
 * where D is the context domain of E1 op E2.
 * When the operation is a MultiArgExpression, the output
 * is a MultiArgExpression over reductions on each operand.
 */
@SuppressWarnings("all")
public class HoistOutOfReduction {
  private final AlphaExpression targetExpr;
  
  private AbstractReduceExpression targetReduce;
  
  private HoistOutOfReduction(final AlphaExpression expr) {
    this.targetExpr = expr;
  }
  
  public static void apply(final BinaryExpression expr) {
    final HoistOutOfReduction T = new HoistOutOfReduction(expr);
    T.transform();
  }
  
  public static void apply(final MultiArgExpression expr) {
    final HoistOutOfReduction T = new HoistOutOfReduction(expr);
    T.transform();
  }
  
  private void transform() {
    final BINARY_OP targetExprOp = AlphaOperatorUtil.getBinaryOP(this.targetExpr);
    this.traverse(this.targetExpr.eContainer());
    BINARY_OP _reductionOPtoBinaryOP = AlphaOperatorUtil.reductionOPtoBinaryOP(this.targetReduce.getOperator());
    boolean _notEquals = (!Objects.equal(_reductionOPtoBinaryOP, targetExprOp));
    if (_notEquals) {
      throw new IllegalArgumentException("[HoistOutOfReduction] The operators of the specified expression and enclosing reduction do not match.");
    }
    final AlphaExpression replacement = this.createReplacement(this.targetExpr);
    EcoreUtil.replace(this.targetReduce, replacement);
    AlphaInternalStateConstructor.recomputeContextDomain(replacement);
    Normalize.apply(replacement);
  }
  
  private AlphaExpression _createReplacement(final BinaryExpression binExpr) {
    BinaryExpression _xblockexpression = null;
    {
      final AbstractReduceExpression R1 = ReductionUtil.constructConcreteReduction(this.targetReduce, 
        this.targetReduce.getOperator(), this.targetReduce.getProjection(), 
        AlphaUserFactory.createRestrictExpression(this.targetReduce.getBody().getContextDomain(), binExpr.getLeft()));
      final AbstractReduceExpression R2 = ReductionUtil.constructConcreteReduction(this.targetReduce, 
        this.targetReduce.getOperator(), this.targetReduce.getProjection(), 
        AlphaUserFactory.createRestrictExpression(this.targetReduce.getBody().getContextDomain(), binExpr.getRight()));
      _xblockexpression = AlphaUserFactory.createBinaryExpression(binExpr.getOperator(), R1, R2);
    }
    return _xblockexpression;
  }
  
  private AlphaExpression _createReplacement(final MultiArgExpression mae) {
    MultiArgExpression _xblockexpression = null;
    {
      final MultiArgExpression result = AlphaUserFactory.createMultiArgExpression(mae.getOperator());
      EList<AlphaExpression> _exprs = mae.getExprs();
      for (final AlphaExpression expr : _exprs) {
        {
          final AbstractReduceExpression reduce = ReductionUtil.constructConcreteReduction(this.targetReduce, 
            this.targetReduce.getOperator(), this.targetReduce.getProjection(), 
            AlphaUserFactory.createRestrictExpression(this.targetReduce.getBody().getContextDomain(), EcoreUtil.<AlphaExpression>copy(expr)));
          result.getExprs().add(reduce);
        }
      }
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  private void _traverse(final EObject obj) {
    Class<? extends EObject> _class = obj.getClass();
    String _plus = ("[HoistOutOfReduction] Found unexpected object type while traversing the AST: " + _class);
    throw new IllegalArgumentException(_plus);
  }
  
  private void _traverse(final AlphaExpression expr) {
    Class<? extends AlphaExpression> _class = expr.getClass();
    String _plus = ("[HoistOutOfReduction] Found unexpected expression type while traversing the AST: " + _class);
    throw new IllegalArgumentException(_plus);
  }
  
  private void _traverse(final DependenceExpression de) {
    throw new IllegalArgumentException("[HoistOutOfReduction] DependenceExpression are not allowed between the specified expression and the enclosing reduction.");
  }
  
  private void _traverse(final AbstractReduceExpression are) {
    this.targetReduce = are;
  }
  
  private void _traverse(final RestrictExpression re) {
    this.traverse(re.eContainer());
  }
  
  private AlphaExpression createReplacement(final AlphaExpression binExpr) {
    if (binExpr instanceof BinaryExpression) {
      return _createReplacement((BinaryExpression)binExpr);
    } else if (binExpr instanceof MultiArgExpression) {
      return _createReplacement((MultiArgExpression)binExpr);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(binExpr).toString());
    }
  }
  
  private void traverse(final EObject are) {
    if (are instanceof AbstractReduceExpression) {
      _traverse((AbstractReduceExpression)are);
      return;
    } else if (are instanceof DependenceExpression) {
      _traverse((DependenceExpression)are);
      return;
    } else if (are instanceof RestrictExpression) {
      _traverse((RestrictExpression)are);
      return;
    } else if (are instanceof AlphaExpression) {
      _traverse((AlphaExpression)are);
      return;
    } else if (are != null) {
      _traverse(are);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(are).toString());
    }
  }
}
