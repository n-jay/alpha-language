package alpha.model.transformation;

import alpha.model.AlphaCompleteVisitable;
import alpha.model.AlphaExpression;
import alpha.model.AlphaExpressionVisitable;
import alpha.model.AlphaInternalStateConstructor;
import alpha.model.AlphaVisitable;
import alpha.model.BinaryExpression;
import alpha.model.CaseExpression;
import alpha.model.DependenceExpression;
import alpha.model.IndexExpression;
import alpha.model.ModelPackage;
import alpha.model.MultiArgExpression;
import alpha.model.RestrictExpression;
import alpha.model.UnaryExpression;
import alpha.model.factory.AlphaUserFactory;
import alpha.model.util.AbstractAlphaCompleteVisitor;
import alpha.model.util.AlphaExpressionUtil;
import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLMultiAff;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * Normalization of Alpha programs.
 * 
 * Each StandardEquation in an Alpha program should satisfy the following in its normal form:
 *   - the parent of CaseExpression should be StandardEquation or ReduceExpression
 *   - the parent of RestrictExpression should be CaseExpression or ReduceExpression
 *   - the child of DependenceExpression should be VariableExpression or ConstantExpression
 * 
 * The same applies to each input expression in an UseEquation.
 * 
 * The normalization rules defined and implemented here should transform any input Alpha program into its normal form.
 * The rules have mainly two objectives:
 *   - DependenceExpressions are propagated downwards
 *   - RestrictExpressions are propagated upwards (except when its child is a CaseExpression)
 * 
 * Due to the direction of propagation, most rules for dependences matches with dependence as the parent,
 * but many rules involving restrict matches with other expressions as parents (e.g., binOp or unaryOp).
 * 
 * Note that the implementation in this class may not be complete yet, especially w.r.t. the new expressions.
 * In addition, this implementation do not use term-rewriting, and relies on bottom-up traversal
 * of the AST with occasional repeated traversal of sub-trees. This may create situations where multiple
 * calls are required to reach the normal form (which is a bug and should be fixed).
 * 
 * 
 * There is also a two-level notion of the normal form resulting from the extensions to Alpha
 * The extensions are mostly aimed at improving the readability of Alpha programs by adding short-hands for
 * describing polyhedral objects and adding structure. The "shallow" normalize, which is the default behavior,
 * keeps most of the extended syntax elements intact. Specifically:
 *  - uses of polyhedral objects defined at the top of a system are preserved
 *  - CalculatorExpressions in equations are also kept
 *  - named CaseExpressions are not flattened
 *  - AutoRestrictExpressions are preserved
 * 
 * The "deep" normalize will remove the extended syntax by replacing polyhedral objects and auto keywords
 *  with explicit (and self-contained) polyhedral domains/functions. CaseExpressions are completely flattened
 *  and names are removed. This form is suited for compatibility with AlphaZ@CSU and
 *  for back-end processing (e.g., code generator) where readability is not important.
 */
@SuppressWarnings("all")
public class Normalize extends AbstractAlphaCompleteVisitor {
  /**
   * Rules collected from AlphaZ implementation using Tom/Gom
   *  Removal of identity functions and empty case branches were
   *  implemented separately.
   * 
   *  debug("rule1", "dep@(A op B) -> dep@A op dep@B", "");
   *  debug("rule2a", "((dom : A) op B) -> dom : (A op B)", "");
   *  debug("rule2b", "(A op (dom : B)) -> dom : (A op B)", "");
   *  debug("rule3", "depA@depB@E -> (depB o depA)@E", "");
   *  debug("rule4", "domA : domB : E -> (domA intersection domB)@E", "");
   *  debug("rule5", "dep@(dom : E)-> dom.preimage(dep) : (dep@E)", "");
   *  debug("rule6", "dep@(op E)-> op (dep@E)", "");
   *  debug("rule7", "(op dom : E)-> dom : (op E)", "");
   *  debug("rule8a", "dep @ f(op, E)-> f(op, dep@E)", "");
   *  debug("rule8b", "dep @ exf(op, E)-> exf(op, dep@E)", "");
   *  debug("rule9", "dep@(val(f) -> val(f o dep)", "");
   * 	debug("rule10", "case E1; case E2 esac; E3; esac -> case E1; E2; E3; esac", "");
   * 	debug("rule11a", "case E1; esac op E2 -> case E1 op E2; esac", "");
   * 	debug("rule11b", "E1 op case E2; esac -> case E1 op E2; esac", "");
   * 	debug("rule12", "op case E; esac -> case op E; esac", "");
   * 	debug("rule13", "f(op, case E; esac) -> case f(op, E) esac;", "");
   *  debug("rule14", "dep case E; esac -> case dep E; esac", "");
   * 	debug("rule15", "dom : case E; esac -> case dom : E; esac", "");
   * debug("rule16", "dep @ if (cond, then, else) -> if(dep@cond, dep@then, dep@else) ", "");
   * debug("rule17a", "if(dom : cond, then, else) -> dom : if (cond, then, else)", "");
   * debug("rule17b", "if(cond, dom : then, else) -> dom : if (cond, then, else)", "");
   * debug("rule17c", "if(cond, then, dom : else) -> dom : if (cond, then, else)", "");
   * debug("rule18a", "if(case E; esac, then, else) -> esac if (E, then, else); case", "");
   * debug("rule18b", "if(cond, case E; esac, else) -> esac if (cond, E, else); case", "");
   * debug("rule18c", "if(cond, then, case E; esac) -> esac if (cond, then, E); case", "");
   * 	debug("rule19", "exFunc(op, dom : E) -> dom : exFunc(op, E)", "");
   */
  public static void apply(final AlphaCompleteVisitable acv) {
    if ((acv instanceof AlphaVisitable)) {
      Normalize.apply(((AlphaVisitable) acv));
    } else {
      if ((acv instanceof AlphaExpressionVisitable)) {
        Normalize.apply(((AlphaExpressionVisitable) acv));
      } else {
        throw new RuntimeException(("This should be unreachable code. Got: " + acv));
      }
    }
  }
  
  public static void apply(final AlphaVisitable av) {
    final Normalize visitor = new Normalize();
    av.accept(visitor);
  }
  
  public static void apply(final AlphaExpressionVisitable aev) {
    final Normalize visitor = new Normalize();
    aev.accept(visitor);
  }
  
  @Override
  public void outDependenceExpression(final DependenceExpression de) {
    this.dependenceExpressionRules(de, de.getExpr());
    boolean _isIdentity = de.getFunction().isIdentity();
    if (_isIdentity) {
      EcoreUtil.replace(de, de.getExpr());
    }
  }
  
  protected Object _dependenceExpressionRules(final DependenceExpression de, final DependenceExpression innerDep) {
    final JNIISLMultiAff composedF = innerDep.getFunction().pullback(de.getFunction());
    de.setFunctionExpr(AlphaUserFactory.createJNIFunction(composedF));
    EcoreUtil.replace(de.getExpr(), innerDep.getExpr());
    return null;
  }
  
  protected Object _dependenceExpressionRules(final DependenceExpression de, final IndexExpression innerIE) {
    final JNIISLMultiAff composedF = innerIE.getFunction().pullback(de.getFunction());
    innerIE.setFunctionExpr(AlphaUserFactory.createJNIFunction(composedF));
    EcoreUtil.replace(de, innerIE);
    return null;
  }
  
  protected Object _dependenceExpressionRules(final DependenceExpression de, final RestrictExpression innerRE) {
    final JNIISLSet preimage = innerRE.getRestrictDomain().preimage(de.getFunction());
    innerRE.setDomainExpr(AlphaUserFactory.createJNIDomain(preimage));
    EcoreUtil.replace(de, innerRE);
    return null;
  }
  
  protected Object _dependenceExpressionRules(final DependenceExpression de, final BinaryExpression binExpr) {
    EcoreUtil.replace(de, binExpr);
    final DependenceExpression newL = AlphaUserFactory.createDependenceExpression(de.getFunction(), binExpr.getLeft());
    final DependenceExpression newR = AlphaUserFactory.createDependenceExpression(de.getFunction(), binExpr.getRight());
    binExpr.setLeft(newL);
    binExpr.setRight(newR);
    Normalize.apply(binExpr);
    return null;
  }
  
  protected Object _dependenceExpressionRules(final DependenceExpression de, final UnaryExpression unaryExpr) {
    EcoreUtil.replace(de, unaryExpr);
    final DependenceExpression newExpr = AlphaUserFactory.createDependenceExpression(de.getFunction(), unaryExpr.getExpr());
    unaryExpr.setExpr(newExpr);
    Normalize.apply(unaryExpr);
    return null;
  }
  
  protected Object _dependenceExpressionRules(final DependenceExpression de, final MultiArgExpression mae) {
    this.propagateDownwards(de, mae);
    Normalize.apply(mae);
    return null;
  }
  
  protected Object _dependenceExpressionRules(final DependenceExpression de, final CaseExpression ce) {
    this.propagateDownwards(de, ce);
    Normalize.apply(ce);
    return null;
  }
  
  protected Object _dependenceExpressionRules(final DependenceExpression de, final AlphaExpression expr) {
    return null;
  }
  
  @Override
  public void outRestrictExpression(final RestrictExpression re) {
    this.restrictExpressionRules(re, re.getExpr());
    EObject _eContainer = re.eContainer();
    boolean _tripleEquals = (_eContainer == null);
    if (_tripleEquals) {
      return;
    }
    EObject _eContainer_1 = re.eContainer();
    final JNIISLSet ctx = AlphaExpressionUtil.parentContext(re, ((AlphaCompleteVisitable) _eContainer_1), null);
    if (((ctx != null) && ctx.isEqual(re.getContextDomain()))) {
    }
  }
  
  protected Object _restrictExpressionRules(final RestrictExpression re, final RestrictExpression innerRE) {
    final JNIISLSet intersection = re.getRestrictDomain().intersect(innerRE.getRestrictDomain());
    re.setDomainExpr(AlphaUserFactory.createJNIDomain(intersection));
    EcoreUtil.replace(re.getExpr(), innerRE.getExpr());
    return null;
  }
  
  protected Object _restrictExpressionRules(final RestrictExpression re, final CaseExpression ce) {
    this.propagateDownwards(re, ce);
    AlphaInternalStateConstructor.recomputeContextDomain(ce);
    Normalize.apply(ce);
    return null;
  }
  
  protected Object _restrictExpressionRules(final RestrictExpression re, final AlphaExpression expr) {
    return null;
  }
  
  @Override
  public void outBinaryExpression(final BinaryExpression be) {
    this.binaryExpressionRules(be, be.getLeft());
    this.binaryExpressionRules(be, be.getRight());
  }
  
  protected Object _binaryExpressionRules(final BinaryExpression be, final RestrictExpression re) {
    EcoreUtil.replace(re, re.getExpr());
    EcoreUtil.replace(be, re);
    re.setExpr(be);
    return null;
  }
  
  protected Object _binaryExpressionRules(final BinaryExpression be, final CaseExpression ce) {
    EReference _eContainmentFeature = ce.eContainmentFeature();
    final boolean isLeft = Objects.equal(_eContainmentFeature, ModelPackage.Literals.BINARY_EXPRESSION__LEFT);
    AlphaExpression _xifexpression = null;
    if (isLeft) {
      _xifexpression = be.getRight();
    } else {
      _xifexpression = be.getLeft();
    }
    final AlphaExpression otherExpr = _xifexpression;
    EcoreUtil.replace(be, ce);
    int _size = ce.getExprs().size();
    final ArrayList<AlphaExpression> children = new ArrayList<AlphaExpression>(_size);
    final Consumer<AlphaExpression> _function = (AlphaExpression e) -> {
      children.add(e);
    };
    ce.getExprs().forEach(_function);
    ce.getExprs().clear();
    if (isLeft) {
      final Consumer<AlphaExpression> _function_1 = (AlphaExpression e) -> {
        ce.getExprs().add(AlphaUserFactory.createBinaryExpression(be.getOperator(), e, EcoreUtil.<AlphaExpression>copy(otherExpr)));
      };
      children.forEach(_function_1);
    } else {
      final Consumer<AlphaExpression> _function_2 = (AlphaExpression e) -> {
        ce.getExprs().add(AlphaUserFactory.createBinaryExpression(be.getOperator(), EcoreUtil.<AlphaExpression>copy(otherExpr), e));
      };
      children.forEach(_function_2);
    }
    AlphaInternalStateConstructor.recomputeContextDomain(ce);
    Normalize.apply(ce);
    return null;
  }
  
  protected Object _binaryExpressionRules(final BinaryExpression be, final AlphaExpression expr) {
    return null;
  }
  
  @Override
  public void outUnaryExpression(final UnaryExpression ue) {
    this.unaryExpressionRules(ue, ue.getExpr());
  }
  
  protected Object _unaryExpressionRules(final UnaryExpression ue, final RestrictExpression innerRE) {
    final AlphaExpression E = innerRE.getExpr();
    EcoreUtil.replace(ue, innerRE);
    innerRE.setExpr(ue);
    ue.setExpr(E);
    return null;
  }
  
  protected Object _unaryExpressionRules(final UnaryExpression ue, final CaseExpression ce) {
    this.propagateDownwards(ue, ce);
    Normalize.apply(ce);
    return null;
  }
  
  protected Object _unaryExpressionRules(final UnaryExpression ue, final AlphaExpression expr) {
    return null;
  }
  
  @Override
  public void outMultiArgExpression(final MultiArgExpression mae) {
    EObject _eContainer = mae.eContainer();
    final AlphaCompleteVisitable container = ((AlphaCompleteVisitable) _eContainer);
    boolean changed = false;
    for (int i = 0; ((i < mae.getExprs().size()) && (!changed)); i++) {
      changed = this.multiArgExpressionRules(mae, mae.getExprs().get(i));
    }
    if (changed) {
      AlphaInternalStateConstructor.recomputeContextDomain(container);
      Normalize.apply(container);
      return;
    }
    final Function1<AlphaExpression, Boolean> _function = (AlphaExpression e) -> {
      return Boolean.valueOf((e instanceof RestrictExpression));
    };
    boolean _exists = IterableExtensions.<AlphaExpression>exists(mae.getExprs(), _function);
    if (_exists) {
      final Function1<RestrictExpression, JNIISLSet> _function_1 = (RestrictExpression e) -> {
        return e.getRestrictDomain();
      };
      final Function2<JNIISLSet, JNIISLSet, JNIISLSet> _function_2 = (JNIISLSet d1, JNIISLSet d2) -> {
        return d1.intersect(d2);
      };
      JNIISLSet intersection = IterableExtensions.<JNIISLSet>reduce(IterableExtensions.<RestrictExpression, JNIISLSet>map(Iterables.<RestrictExpression>filter(mae.getExprs(), RestrictExpression.class), _function_1), _function_2);
      final RestrictExpression hoistedRE = AlphaUserFactory.createRestrictExpression(intersection);
      EcoreUtil.replace(mae, hoistedRE);
      hoistedRE.setExpr(mae);
      final Consumer<RestrictExpression> _function_3 = (RestrictExpression e) -> {
        EcoreUtil.replace(e, e.getExpr());
      };
      Iterables.<RestrictExpression>filter(mae.getExprs(), RestrictExpression.class).forEach(_function_3);
      AlphaInternalStateConstructor.recomputeContextDomain(hoistedRE);
      Normalize.apply(hoistedRE);
      return;
    }
  }
  
  protected boolean _multiArgExpressionRules(final MultiArgExpression mae, final CaseExpression ce) {
    final int index = mae.getExprs().indexOf(ce);
    if ((index <= (-1))) {
      throw new RuntimeException("Unexpected case at normalize rule for multi-arg expressions. The child index cannot be found. ");
    }
    int _size = ce.getExprs().size();
    final ArrayList<AlphaExpression> children = new ArrayList<AlphaExpression>(_size);
    final Consumer<AlphaExpression> _function = (AlphaExpression e) -> {
      children.add(e);
    };
    ce.getExprs().forEach(_function);
    ce.getExprs().clear();
    final Consumer<AlphaExpression> _function_1 = (AlphaExpression e) -> {
      final MultiArgExpression newMAE = EcoreUtil.<MultiArgExpression>copy(mae);
      EcoreUtil.replace(newMAE.getExprs().get(index), e);
      ce.getExprs().add(newMAE);
    };
    children.forEach(_function_1);
    EcoreUtil.replace(mae, ce);
    return true;
  }
  
  protected boolean _multiArgExpressionRules(final MultiArgExpression mae, final AlphaExpression expr) {
    return false;
  }
  
  @Override
  public void outCaseExpression(final CaseExpression ce) {
  }
  
  protected Object _caseExpressionRules(final CaseExpression ce, final AlphaExpression expr) {
    return null;
  }
  
  /**
   * Helper function to propagate dependence/restrict expressions downwards.
   * 
   * It is a recurring pattern for several expressions to take the function/domain
   * in the outer dependence/restrict surrounding case/multi-arg expressions and
   * apply them to all of their children. This method centralizes this operation
   * to avoid redundant code.
   */
  private void propagateDownwards(final AlphaExpression outer, final AlphaExpression inner) {
    EcoreUtil.replace(outer, inner);
    final EList<AlphaExpression> exprsEList = this.getChildrenEList(inner);
    int _size = exprsEList.size();
    final ArrayList<AlphaExpression> children = new ArrayList<AlphaExpression>(_size);
    final Consumer<AlphaExpression> _function = (AlphaExpression e) -> {
      children.add(e);
    };
    exprsEList.forEach(_function);
    exprsEList.clear();
    final Consumer<AlphaExpression> _function_1 = (AlphaExpression e) -> {
      exprsEList.add(this.wrapExpression(outer, e));
    };
    children.forEach(_function_1);
  }
  
  private EList<AlphaExpression> _getChildrenEList(final CaseExpression ce) {
    return ce.getExprs();
  }
  
  private EList<AlphaExpression> _getChildrenEList(final MultiArgExpression mae) {
    return mae.getExprs();
  }
  
  private AlphaExpression _wrapExpression(final RestrictExpression wrapper, final AlphaExpression expr) {
    return AlphaUserFactory.createRestrictExpression(wrapper.getRestrictDomain(), expr);
  }
  
  private AlphaExpression _wrapExpression(final DependenceExpression wrapper, final AlphaExpression expr) {
    return AlphaUserFactory.createDependenceExpression(wrapper.getFunction(), expr);
  }
  
  private AlphaExpression _wrapExpression(final UnaryExpression wrapper, final AlphaExpression expr) {
    return AlphaUserFactory.createUnaryExpression(wrapper.getOperator(), expr);
  }
  
  protected Object dependenceExpressionRules(final DependenceExpression de, final AlphaExpression binExpr) {
    if (binExpr instanceof BinaryExpression) {
      return _dependenceExpressionRules(de, (BinaryExpression)binExpr);
    } else if (binExpr instanceof CaseExpression) {
      return _dependenceExpressionRules(de, (CaseExpression)binExpr);
    } else if (binExpr instanceof DependenceExpression) {
      return _dependenceExpressionRules(de, (DependenceExpression)binExpr);
    } else if (binExpr instanceof IndexExpression) {
      return _dependenceExpressionRules(de, (IndexExpression)binExpr);
    } else if (binExpr instanceof MultiArgExpression) {
      return _dependenceExpressionRules(de, (MultiArgExpression)binExpr);
    } else if (binExpr instanceof RestrictExpression) {
      return _dependenceExpressionRules(de, (RestrictExpression)binExpr);
    } else if (binExpr instanceof UnaryExpression) {
      return _dependenceExpressionRules(de, (UnaryExpression)binExpr);
    } else if (binExpr != null) {
      return _dependenceExpressionRules(de, binExpr);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(de, binExpr).toString());
    }
  }
  
  protected Object restrictExpressionRules(final RestrictExpression re, final AlphaExpression ce) {
    if (ce instanceof CaseExpression) {
      return _restrictExpressionRules(re, (CaseExpression)ce);
    } else if (ce instanceof RestrictExpression) {
      return _restrictExpressionRules(re, (RestrictExpression)ce);
    } else if (ce != null) {
      return _restrictExpressionRules(re, ce);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(re, ce).toString());
    }
  }
  
  protected Object binaryExpressionRules(final BinaryExpression be, final AlphaExpression ce) {
    if (ce instanceof CaseExpression) {
      return _binaryExpressionRules(be, (CaseExpression)ce);
    } else if (ce instanceof RestrictExpression) {
      return _binaryExpressionRules(be, (RestrictExpression)ce);
    } else if (ce != null) {
      return _binaryExpressionRules(be, ce);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(be, ce).toString());
    }
  }
  
  protected Object unaryExpressionRules(final UnaryExpression ue, final AlphaExpression ce) {
    if (ce instanceof CaseExpression) {
      return _unaryExpressionRules(ue, (CaseExpression)ce);
    } else if (ce instanceof RestrictExpression) {
      return _unaryExpressionRules(ue, (RestrictExpression)ce);
    } else if (ce != null) {
      return _unaryExpressionRules(ue, ce);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(ue, ce).toString());
    }
  }
  
  protected boolean multiArgExpressionRules(final MultiArgExpression mae, final AlphaExpression ce) {
    if (ce instanceof CaseExpression) {
      return _multiArgExpressionRules(mae, (CaseExpression)ce);
    } else if (ce != null) {
      return _multiArgExpressionRules(mae, ce);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(mae, ce).toString());
    }
  }
  
  protected Object caseExpressionRules(final CaseExpression ce, final AlphaExpression expr) {
    return _caseExpressionRules(ce, expr);
  }
  
  private EList<AlphaExpression> getChildrenEList(final AlphaExpression ce) {
    if (ce instanceof CaseExpression) {
      return _getChildrenEList((CaseExpression)ce);
    } else if (ce instanceof MultiArgExpression) {
      return _getChildrenEList((MultiArgExpression)ce);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(ce).toString());
    }
  }
  
  private AlphaExpression wrapExpression(final AlphaExpression wrapper, final AlphaExpression expr) {
    if (wrapper instanceof DependenceExpression) {
      return _wrapExpression((DependenceExpression)wrapper, expr);
    } else if (wrapper instanceof RestrictExpression) {
      return _wrapExpression((RestrictExpression)wrapper, expr);
    } else if (wrapper instanceof UnaryExpression) {
      return _wrapExpression((UnaryExpression)wrapper, expr);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(wrapper, expr).toString());
    }
  }
}
