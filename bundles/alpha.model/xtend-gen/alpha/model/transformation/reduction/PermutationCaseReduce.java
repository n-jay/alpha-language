package alpha.model.transformation.reduction;

import alpha.model.AbstractReduceExpression;
import alpha.model.AlphaExpression;
import alpha.model.AlphaInternalStateConstructor;
import alpha.model.AlphaSystem;
import alpha.model.BinaryExpression;
import alpha.model.CaseExpression;
import alpha.model.RestrictExpression;
import alpha.model.SystemBody;
import alpha.model.factory.AlphaUserFactory;
import alpha.model.transformation.Normalize;
import alpha.model.transformation.reduction.ReductionUtil;
import alpha.model.util.AlphaExpressionUtil;
import alpha.model.util.AlphaOperatorUtil;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLSet;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

/**
 * Permutation Case-Reduce is a transformation that moves a CaseExpression
 * out of a reduction body.
 * 
 * Given a reduction of the form:
 *   reduce(op, f, case { E1; E2; } )
 * it returns
 *   case {
 *      D1  :  reduce(op, f, E1);
 *      D12 : (reduce(op, f, E1) op reduce(op, f, E2));
 *      D2  :  reduce(op, f, E2);
 *   }
 * 
 *  When the original CaseExpression has more than two branches,
 *  the E2 in the above is a CaseExpression with one less branch,
 *  where the first branch is "peeled out". Then, the transformation
 *  is recursively applied to reductions over E2 until it no longer
 *  is a CaseExpression.
 */
@SuppressWarnings("all")
public class PermutationCaseReduce {
  private PermutationCaseReduce() {
  }
  
  /**
   * Apply the transformation to all AbstractReduceExpressions in an AlphaSystem.
   * Silently ignores any AbstractReduceExpression where it is not applicable.
   */
  public static void apply(final AlphaSystem system) {
    final Consumer<SystemBody> _function = (SystemBody b) -> {
      PermutationCaseReduce.apply(b);
    };
    system.getSystemBodies().forEach(_function);
  }
  
  /**
   * Apply the transformation to all AbstractReduceExpressions in a SystemBody.
   * Silently ignores any AbstractReduceExpression where it is not applicable.
   */
  public static void apply(final SystemBody body) {
    final Consumer<AbstractReduceExpression> _function = (AbstractReduceExpression are) -> {
      PermutationCaseReduce.transform(are);
    };
    EcoreUtil2.<AbstractReduceExpression>getAllContentsOfType(body, AbstractReduceExpression.class).forEach(_function);
  }
  
  /**
   * Applies Permutation Case Reduce to the specified reduction.
   * This method throws an exception when it is not applicable to the specified expression.
   */
  public static void apply(final AbstractReduceExpression are) {
    int _transform = PermutationCaseReduce.transform(are);
    boolean _notEquals = (_transform != 1);
    if (_notEquals) {
      throw new IllegalArgumentException("[PermutationCaseReduce] Target AbstractReduceExpression must have a CaseExpression as its body.");
    }
  }
  
  /**
   * Implementation of the transformation.
   */
  private static int transform(final AbstractReduceExpression are) {
    AlphaExpression _body = are.getBody();
    boolean _not = (!(_body instanceof CaseExpression));
    if (_not) {
      return 0;
    }
    AlphaExpression _body_1 = are.getBody();
    final CaseExpression innerCase = ((CaseExpression) _body_1);
    final AlphaExpression E1 = innerCase.getExprs().get(0);
    final List<AlphaExpression> E2list = innerCase.getExprs().subList(1, innerCase.getExprs().size());
    int _size = E2list.size();
    final boolean recurse = (_size > 1);
    AlphaExpression _xifexpression = null;
    int _size_1 = E2list.size();
    boolean _equals = (_size_1 == 1);
    if (_equals) {
      _xifexpression = AlphaExpressionUtil.filterAutoRestrict.apply(E2list.get(0));
    } else {
      CaseExpression _xblockexpression = null;
      {
        final CaseExpression E = AlphaUserFactory.createCaseExpression();
        final Function1<AlphaExpression, JNIISLSet> _function = (AlphaExpression e) -> {
          return e.getExpressionDomain();
        };
        final Function2<JNIISLSet, JNIISLSet, JNIISLSet> _function_1 = (JNIISLSet d1, JNIISLSet d2) -> {
          return d1.union(d2);
        };
        final JNIISLSet domUnion = IterableExtensions.<JNIISLSet>reduce(ListExtensions.<AlphaExpression, JNIISLSet>map(E2list, _function), _function_1);
        E.setExpressionDomain(domUnion);
        final Function1<AlphaExpression, AlphaExpression> _function_2 = (AlphaExpression e) -> {
          return AlphaExpressionUtil.filterAutoRestrict.apply(e);
        };
        E.getExprs().addAll(ListExtensions.<AlphaExpression, AlphaExpression>map(E2list, _function_2));
        _xblockexpression = E;
      }
      _xifexpression = _xblockexpression;
    }
    final AlphaExpression E2 = _xifexpression;
    final JNIISLSet fDE1 = E1.getExpressionDomain().apply(are.getProjection().toMap());
    final JNIISLSet fDE2 = E2.getExpressionDomain().apply(are.getProjection().toMap());
    final JNIISLSet D12 = fDE1.copy().intersect(fDE2.copy());
    final JNIISLSet D1 = fDE1.copy().subtract(fDE2.copy());
    final JNIISLSet D2 = fDE2.subtract(fDE1);
    final CaseExpression outerCase = AlphaUserFactory.createCaseExpression();
    final LinkedList<AlphaExpression> recurseTarget = new LinkedList<AlphaExpression>();
    RestrictExpression _xifexpression_1 = null;
    boolean _isEmpty = D1.isEmpty();
    boolean _not_1 = (!_isEmpty);
    if (_not_1) {
      RestrictExpression _xblockexpression_1 = null;
      {
        final AbstractReduceExpression X1 = ReductionUtil.constructConcreteReduction(are, are.getOperator(), are.getProjection(), EcoreUtil.<AlphaExpression>copy(E1));
        _xblockexpression_1 = AlphaUserFactory.createRestrictExpression(D1, X1);
      }
      _xifexpression_1 = _xblockexpression_1;
    }
    final RestrictExpression newE1 = _xifexpression_1;
    RestrictExpression _xifexpression_2 = null;
    boolean _isEmpty_1 = D2.isEmpty();
    boolean _not_2 = (!_isEmpty_1);
    if (_not_2) {
      RestrictExpression _xblockexpression_2 = null;
      {
        final AbstractReduceExpression X2 = ReductionUtil.constructConcreteReduction(are, are.getOperator(), are.getProjection(), EcoreUtil.<AlphaExpression>copy(E2));
        recurseTarget.add(X2);
        _xblockexpression_2 = AlphaUserFactory.createRestrictExpression(D2, X2);
      }
      _xifexpression_2 = _xblockexpression_2;
    }
    final RestrictExpression newE2 = _xifexpression_2;
    RestrictExpression _xifexpression_3 = null;
    boolean _isEmpty_2 = D12.isEmpty();
    boolean _not_3 = (!_isEmpty_2);
    if (_not_3) {
      RestrictExpression _xblockexpression_3 = null;
      {
        final AbstractReduceExpression X1 = ReductionUtil.constructConcreteReduction(are, are.getOperator(), are.getProjection(), E1);
        final AbstractReduceExpression X2 = ReductionUtil.constructConcreteReduction(are, are.getOperator(), are.getProjection(), E2);
        recurseTarget.add(X2);
        final BinaryExpression X12 = AlphaUserFactory.createBinaryExpression(AlphaOperatorUtil.reductionOPtoBinaryOP(are.getOperator()), X1, X2);
        _xblockexpression_3 = AlphaUserFactory.createRestrictExpression(D12, X12);
      }
      _xifexpression_3 = _xblockexpression_3;
    }
    final RestrictExpression newE12 = _xifexpression_3;
    if ((newE1 != null)) {
      outerCase.getExprs().add(newE1);
    }
    if ((newE12 != null)) {
      outerCase.getExprs().add(newE12);
    }
    if ((newE2 != null)) {
      outerCase.getExprs().add(newE2);
    }
    EcoreUtil.replace(are, outerCase);
    AlphaInternalStateConstructor.recomputeContextDomain(outerCase);
    int Tcount = 1;
    if (recurse) {
      for (final AlphaExpression expr : recurseTarget) {
        int _Tcount = Tcount;
        int _transform = PermutationCaseReduce.transform(((AbstractReduceExpression) expr));
        Tcount = (_Tcount + _transform);
      }
    }
    Normalize.apply(outerCase);
    return Tcount;
  }
}
