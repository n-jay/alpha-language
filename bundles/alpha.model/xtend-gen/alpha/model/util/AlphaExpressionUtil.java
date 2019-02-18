package alpha.model.util;

import alpha.model.AlphaCompleteVisitable;
import alpha.model.AlphaExpression;
import alpha.model.AlphaNode;
import alpha.model.CalculatorExpression;
import alpha.model.POLY_OBJECT_TYPE;
import alpha.model.StandardEquation;
import alpha.model.UseEquation;
import alpha.model.Variable;
import alpha.model.issue.AlphaIssue;
import alpha.model.issue.AlphaIssueFactory;
import alpha.model.issue.UnexpectedISLErrorIssue;
import alpha.model.util.AlphaUtil;
import com.google.common.base.Objects;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLDimType;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLMap;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLMultiAff;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLSet;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * Utility methods that concern AlphaExpressions.
 */
@SuppressWarnings("all")
public class AlphaExpressionUtil {
  public static <T extends Object> Stream<T> getChildrenOfType(final AlphaNode expr, final Class<T> c) {
    final Predicate<EObject> _function = (EObject e) -> {
      return c.isInstance(e);
    };
    final Function<EObject, T> _function_1 = (EObject e) -> {
      return c.cast(e);
    };
    return expr.eContents().stream().filter(_function).<T>map(_function_1);
  }
  
  public static boolean testNonNullContextDomain(final Stream<AlphaExpression> exprs) {
    final Predicate<AlphaExpression> _function = (AlphaExpression e) -> {
      return ((e != null) && (e.getContextDomain() != null));
    };
    return exprs.allMatch(_function);
  }
  
  public static boolean testNonNullExpressionDomain(final Stream<AlphaExpression> exprs) {
    final Predicate<AlphaExpression> _function = (AlphaExpression e) -> {
      return ((e != null) && (e.getExpressionDomain() != null));
    };
    return exprs.allMatch(_function);
  }
  
  public static boolean testNonNullCalcExpression(final Stream<CalculatorExpression> exprs) {
    final Predicate<CalculatorExpression> _function = (CalculatorExpression e) -> {
      return ((e != null) && (e.getISLObject() != null));
    };
    return exprs.allMatch(_function);
  }
  
  /**
   * parentContext gives the context domain of the parent node
   * There are a few cases to consider:
   *  - parent is another AlphaExpression: simply take its context domain
   *  - parent is a  StandardEquation: take the variable domain
   *  - parent is an UseEquation: this depends on the corresponding input variable of the callee subsystem.
   *      In short, the context is the cross product of instantiation domain with the input variable domain.
   *  - for both Equations, the parameter domain of its enclosing SystemBody is intersected
   */
  protected static JNIISLSet _parentContext(final AlphaExpression child, final AlphaExpression parent, final Consumer<AlphaIssue> f) {
    return parent.getContextDomain();
  }
  
  protected static JNIISLSet _parentContext(final AlphaExpression child, final StandardEquation parent, final Consumer<AlphaIssue> f) {
    JNIISLSet _xifexpression = null;
    if (((parent.getSystemBody().getParameterDomainExpr() == null) || (parent.getSystemBody().getParameterDomain() == null))) {
      _xifexpression = null;
    } else {
      _xifexpression = parent.getVariable().getDomain().intersectParams(parent.getSystemBody().getParameterDomain());
    }
    return _xifexpression;
  }
  
  protected static JNIISLSet _parentContext(final AlphaExpression child, final UseEquation parent, final Consumer<AlphaIssue> f) {
    if ((AlphaExpressionUtil.checkCalcExprType(parent.getInstantiationDomainExpr(), POLY_OBJECT_TYPE.SET, f) && 
      (parent.getSystemBody().getParameterDomain() != null))) {
      final int inputLoc = parent.getInputExprs().indexOf(child);
      final int outputLoc = parent.getOutputExprs().indexOf(child);
      if (((inputLoc == (-1)) && (outputLoc == (-1)))) {
        return null;
      }
      Variable _xifexpression = null;
      if ((inputLoc != (-1))) {
        _xifexpression = parent.getSystem().getInputs().get(inputLoc);
      } else {
        _xifexpression = parent.getSystem().getOutputs().get(outputLoc);
      }
      final Variable calleeVar = _xifexpression;
      final JNIISLSet instantiationDomain = parent.getInstantiationDomain().intersectParams(parent.getSystemBody().getParameterDomain());
      boolean _testNonNullExpressionDomain = AlphaExpressionUtil.testNonNullExpressionDomain(AlphaExpressionUtil.<AlphaExpression>getChildrenOfType(child, AlphaExpression.class));
      if (_testNonNullExpressionDomain) {
        final Supplier<JNIISLSet> _function = () -> {
          return AlphaExpressionUtil.extendCalleeDomainByInstantiationDomain(instantiationDomain, parent.getCallParams(), calleeVar.getDomain());
        };
        final Consumer<String> _function_1 = (String err) -> {
          EObject _eContainer = child.eContainer();
          EStructuralFeature _eContainingFeature = child.eContainingFeature();
          new UnexpectedISLErrorIssue(err, _eContainer, _eContainingFeature);
        };
        final JNIISLSet exDom = AlphaUtil.<JNIISLSet>callISLwithErrorHandling(_function, _function_1);
        return AlphaUtil.renameIndices(exDom, child.getExpressionDomain().getIndicesNames());
      }
    } else {
      return null;
    }
    return null;
  }
  
  private static boolean checkCalcExprType(final CalculatorExpression cexpr, final POLY_OBJECT_TYPE expected, final Consumer<AlphaIssue> f) {
    POLY_OBJECT_TYPE _type = cexpr.getType();
    boolean _notEquals = (!Objects.equal(_type, expected));
    if (_notEquals) {
      if ((f != null)) {
        f.accept(AlphaIssueFactory.unmatchedCalcExprType(cexpr, expected));
      }
      return false;
    }
    return true;
  }
  
  /**
   * Extends the domain of a subsystem (variable) by the instantiation domain.
   * 
   * The output domain takes the following form:
   *   - The parameters of the caller domain becomes the new set of parameters.
   *   - The parameters of the callee domain are replaced by expressions over indices in the caller domain.
   * 
   * The above is done through:
   *   - Convert the callee domain (set) to relation from parameter to domain (map)
   *   - Add the parameters of the caller domain to the resulting map.
   *   - Create another map that represents the relation between caller domain and parameter values of the instances
   *   - Compose the two maps and collapse it as a set
   */
  private static JNIISLSet extendCalleeDomainByInstantiationDomain(final JNIISLSet instantiationDomain, final JNIISLMultiAff callParams, final JNIISLSet calleeVarDom) {
    final JNIISLMap map = JNIISLMap.fromRange(calleeVarDom);
    final int nparam = map.getNbParams();
    final JNIISLMap p2s = map.moveDims(JNIISLDimType.isl_dim_in, 0, JNIISLDimType.isl_dim_param, 0, nparam);
    final JNIISLMap p2sEx = p2s.alignParams(instantiationDomain.getSpace());
    final JNIISLMap paramCallRel = callParams.toMap().intersectDomain(instantiationDomain);
    final JNIISLMap ctxMap = paramCallRel.applyRange(p2sEx);
    return ctxMap.toSet();
  }
  
  public static JNIISLSet parentContext(final AlphaExpression child, final AlphaCompleteVisitable parent, final Consumer<AlphaIssue> f) {
    if (parent instanceof StandardEquation) {
      return _parentContext(child, (StandardEquation)parent, f);
    } else if (parent instanceof UseEquation) {
      return _parentContext(child, (UseEquation)parent, f);
    } else if (parent instanceof AlphaExpression) {
      return _parentContext(child, (AlphaExpression)parent, f);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(child, parent, f).toString());
    }
  }
}
