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
import alpha.model.util.AffineFunctionOperations;
import alpha.model.util.AlphaOperatorUtil;
import com.google.common.base.Objects;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLDimType;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLMultiAff;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLSet;
import java.util.Arrays;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;

/**
 * FactorOutFromReduction moves an expression within a reduction outwards.
 * 
 * Given a commutative semiring (+, .) an expression of the form:
 *   reduce(., f, E1 + E2)
 * is transformed into:
 *   E1 + reduce(., f, E2)
 * provided that E1 is a constant for each instance of the reduction.
 * 
 * The implementation in this class takes an expression to factor out, and
 * then traverses the AST backwards until an AbstractReduceExpression is found.
 * Then the expression is factored out from the identified reduction, after
 * testing for legality.
 */
@SuppressWarnings("all")
public class FactorOutFromReduction {
  private FactorOutFromReduction(final DependenceExpression expr) {
    this.targetExpr = expr;
    this.enclosingOperation = null;
    this.targetReduce = null;
  }
  
  private final DependenceExpression targetExpr;
  
  private AbstractReduceExpression targetReduce;
  
  private AlphaExpression enclosingOperation;
  
  private int childExprID;
  
  private BINARY_OP enclosingOperationOP = null;
  
  /**
   * Applies FactorOutFromReduction to the specified expression.
   * 
   * Returns the resulting BinaryExpression
   */
  public static BinaryExpression apply(final DependenceExpression expr) {
    BinaryExpression _xblockexpression = null;
    {
      final FactorOutFromReduction T = new FactorOutFromReduction(expr);
      _xblockexpression = T.transform();
    }
    return _xblockexpression;
  }
  
  /**
   * Tests for legality of the transformation. Throw IllegalArgumentException when
   * the transformation is illegal.
   * 
   * It is exposed as a public static method to be used by {@link Distributivity}
   */
  public static void testLegality(final AbstractReduceExpression targetReduce, final BINARY_OP enclosingOperationOP, final DependenceExpression targetExpr) {
    if ((((targetReduce == null) || (enclosingOperationOP == null)) || (targetExpr == null))) {
      throw new IllegalArgumentException("[FactorOutFromReduction] One or more inputs are null.");
    }
    boolean _xblockexpression = false;
    {
      final JNIISLSet ctx = targetReduce.getBody().getContextDomain();
      final int nbDims = ctx.getNbDims(JNIISLDimType.isl_dim_set);
      boolean bounded = true;
      ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, nbDims, true);
      for (final Integer d : _doubleDotLessThan) {
        bounded = (bounded && ctx.hasAnyLowerBound(JNIISLDimType.isl_dim_set, (d).intValue()));
      }
      _xblockexpression = bounded;
    }
    final boolean bounded = _xblockexpression;
    if ((!bounded)) {
      throw new IllegalArgumentException("[FactorOutFromReduction] The reduction body enclosing the target expression has unbounded context domain.");
    }
    if ((enclosingOperationOP == null)) {
      throw new IllegalArgumentException("[FactorOutFromReduction] Target expression is not enclosed in a BinaryExpression or MultiArgExpression.");
    }
    boolean _isDistributiveOver = AlphaOperatorUtil.isDistributiveOver(enclosingOperationOP, AlphaOperatorUtil.getBinaryOP(targetReduce));
    boolean _not = (!_isDistributiveOver);
    if (_not) {
      throw new IllegalArgumentException("[FactorOutFromReduction] Target expression cannot be distributed out of the reduction.");
    }
    boolean _kernelInclusion = AffineFunctionOperations.kernelInclusion(targetReduce.getProjection(), targetExpr.getFunction());
    boolean _not_1 = (!_kernelInclusion);
    if (_not_1) {
      throw new IllegalArgumentException("[FactorOutFromReduction] The nullspace of the target expression must include the nullspace of the projection function.");
    }
  }
  
  private BinaryExpression transform() {
    this.traverse(this.targetExpr, this.targetExpr.eContainer());
    FactorOutFromReduction.testLegality(this.targetReduce, this.enclosingOperationOP, this.targetExpr);
    final JNIISLMultiAff inverseProjection = AffineFunctionOperations.inverseInContext(this.targetReduce.getProjection(), this.targetExpr.getContextDomain().lexMin(), null);
    final BinaryExpression newBinExpr = AlphaUserFactory.createBinaryExpression(this.enclosingOperationOP);
    EcoreUtil.replace(this.targetReduce, newBinExpr);
    final RestrictExpression factoredExpr = AlphaUserFactory.createRestrictExpression(this.targetExpr.getContextDomain(), this.targetExpr);
    final DependenceExpression inverseDepExpr = AlphaUserFactory.createDependenceExpression(inverseProjection, factoredExpr);
    newBinExpr.setLeft(inverseDepExpr);
    newBinExpr.setRight(this.targetReduce);
    if ((this.enclosingOperation instanceof BinaryExpression)) {
      AlphaExpression _xifexpression = null;
      if ((this.childExprID == 0)) {
        _xifexpression = ((BinaryExpression)this.enclosingOperation).getRight();
      } else {
        _xifexpression = ((BinaryExpression)this.enclosingOperation).getLeft();
      }
      final AlphaExpression remainingExpr = _xifexpression;
      EcoreUtil.replace(this.enclosingOperation, remainingExpr);
    } else {
      if ((this.enclosingOperation instanceof MultiArgExpression)) {
        int _length = ((Object[])Conversions.unwrapArray(((MultiArgExpression)this.enclosingOperation).getExprs(), Object.class)).length;
        boolean _equals = (_length == 1);
        if (_equals) {
          EcoreUtil.replace(this.enclosingOperation, ((MultiArgExpression)this.enclosingOperation).getExprs().get(0));
        }
      } else {
        throw new RuntimeException(("[FactorOutFromReduction] Unexpected type for enclosingOperation: " + this.enclosingOperation));
      }
    }
    AlphaInternalStateConstructor.recomputeContextDomain(newBinExpr);
    Normalize.apply(newBinExpr);
    return newBinExpr;
  }
  
  private void _traverse(final AlphaExpression child, final EObject obj) {
    Class<? extends EObject> _class = obj.getClass();
    String _plus = ("[FactorOutFromReduction] Found unexpected object type while traversing the AST: " + _class);
    throw new IllegalArgumentException(_plus);
  }
  
  private void _traverse(final AlphaExpression child, final AlphaExpression expr) {
    Class<? extends AlphaExpression> _class = expr.getClass();
    String _plus = ("[FactorOutFromReduction] Found unexpected expression type while traversing the AST: " + _class);
    throw new IllegalArgumentException(_plus);
  }
  
  private void _traverse(final AlphaExpression child, final DependenceExpression de) {
    throw new IllegalArgumentException("[FactorOutFromReduction] DependenceExpression are not allowed between the specified expression and the enclosing reduction. (The target expression must be a DependenceExpression, but compositions are not allowed.)");
  }
  
  private void _traverse(final AlphaExpression child, final AbstractReduceExpression are) {
    this.targetReduce = are;
  }
  
  private void _traverse(final AlphaExpression child, final RestrictExpression re) {
    this.traverse(re, re.eContainer());
  }
  
  private void _traverse(final AlphaExpression child, final BinaryExpression bexpr) {
    if ((this.enclosingOperation == null)) {
      int _xifexpression = (int) 0;
      AlphaExpression _left = bexpr.getLeft();
      boolean _equals = Objects.equal(_left, child);
      if (_equals) {
        _xifexpression = 0;
      } else {
        _xifexpression = 1;
      }
      this.childExprID = _xifexpression;
      this.enclosingOperation = bexpr;
      this.enclosingOperationOP = AlphaOperatorUtil.getBinaryOP(this.enclosingOperation);
    } else {
      final BINARY_OP op = AlphaOperatorUtil.getBinaryOP(bexpr);
      boolean _notEquals = (!Objects.equal(op, this.enclosingOperationOP));
      if (_notEquals) {
        throw new IllegalArgumentException("[FactorOutFromReduction] Operators in all BinaryExpressions (and MultiArgExpressions) from the target expression to the enclosing reduction must be the same.");
      }
    }
    this.traverse(bexpr, bexpr.eContainer());
  }
  
  private void _traverse(final AlphaExpression child, final MultiArgExpression mae) {
    if ((this.enclosingOperation == null)) {
      this.childExprID = mae.getExprs().indexOf(child);
      this.enclosingOperation = mae;
      this.enclosingOperationOP = AlphaOperatorUtil.getBinaryOP(this.enclosingOperation);
    } else {
      final BINARY_OP op = AlphaOperatorUtil.getBinaryOP(mae);
      boolean _notEquals = (!Objects.equal(op, this.enclosingOperationOP));
      if (_notEquals) {
        throw new IllegalArgumentException("[FactorOutFromReduction] Operators in all MultiArgExpressions (and BinaryExpressions) from the target expression to the enclosing reduction must be the same.");
      }
    }
    this.traverse(mae, mae.eContainer());
  }
  
  private void traverse(final AlphaExpression child, final EObject are) {
    if (are instanceof AbstractReduceExpression) {
      _traverse(child, (AbstractReduceExpression)are);
      return;
    } else if (are instanceof BinaryExpression) {
      _traverse(child, (BinaryExpression)are);
      return;
    } else if (are instanceof DependenceExpression) {
      _traverse(child, (DependenceExpression)are);
      return;
    } else if (are instanceof MultiArgExpression) {
      _traverse(child, (MultiArgExpression)are);
      return;
    } else if (are instanceof RestrictExpression) {
      _traverse(child, (RestrictExpression)are);
      return;
    } else if (are instanceof AlphaExpression) {
      _traverse(child, (AlphaExpression)are);
      return;
    } else if (are != null) {
      _traverse(child, are);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(child, are).toString());
    }
  }
}
