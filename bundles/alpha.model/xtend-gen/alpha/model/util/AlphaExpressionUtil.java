package alpha.model.util;

import alpha.model.AlphaExpression;
import alpha.model.AlphaNode;
import alpha.model.AutoRestrictExpression;
import alpha.model.CalculatorExpression;
import alpha.model.POLY_OBJECT_TYPE;
import alpha.model.RestrictExpression;
import alpha.model.StandardEquation;
import alpha.model.UseEquation;
import alpha.model.Variable;
import alpha.model.factory.AlphaUserFactory;
import alpha.model.issue.AlphaIssue;
import alpha.model.issue.AlphaIssueFactory;
import alpha.model.issue.UnexpectedISLErrorIssue;
import alpha.model.util.AlphaUtil;
import com.google.common.base.Objects;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLAff;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLAffList;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLBasicSet;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLConstraint;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLDimType;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLMap;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLMultiAff;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLSet;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLSpace;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLVertex;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLVertices;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;

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
    JNIISLSet _xblockexpression = null;
    {
      if (((((((parent == null) || (parent.getSystemBody() == null)) || 
        (parent.getSystemBody().getParameterDomainExpr() == null)) || 
        (parent.getSystemBody().getParameterDomain() == null)) || 
        (parent.getVariable() == null)) || 
        (parent.getVariable().getDomain() == null))) {
        return null;
      }
      _xblockexpression = parent.getVariable().getDomain().intersectParams(parent.getSystemBody().getParameterDomain());
    }
    return _xblockexpression;
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
  
  /**
   * Computes the domain where a convolution operation is completely defined. That is, for each point
   * in the kernel domain, there must be a valid definition of the expression (= in expression domain).
   * 
   * It is essentially taking a preimage by the set of dependences specified through the kernel domain.
   * However, I did not see a straight-forward way to take preimages of relations in ISL. This method
   * computes preimage using vertices by assuming that the kernel domain is a single polyhedron (basic set).
   * 
   * Each vertex is plugged in to the expression domain to replace the indices corresponding to the dimensions
   * extended with the kernel domain. Then the kernel domain dimensions are projected out to find the domain
   * that is defined for the vertex.
   * 
   * If you don't use the vertices, the kernel dimensions are only constraint to some range, not to a single point.
   * Taking the domain of such relation does not give the preimage, since a point in the domain is considered to
   * be part of the set if it the relation holds for at least one value in the range.
   */
  public static JNIISLSet preimageByConvolutionDependences(final JNIISLBasicSet kernelDomain, final JNIISLSet bodyExprDom) {
    final JNIISLVertices vertices = kernelDomain.computeVertices();
    int _nbCell = vertices.getNbCell();
    boolean _notEquals = (_nbCell != 1);
    if (_notEquals) {
      throw new RuntimeException("Expecting only one cell for vertices of kernel domain in convolutions.");
    }
    final int kernelDims = kernelDomain.getNbDims(JNIISLDimType.isl_dim_set);
    int _nbDims = bodyExprDom.getNbDims();
    final int offset = (_nbDims - kernelDims);
    JNIISLSet res = null;
    int _nbVertices = vertices.getNbVertices();
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _nbVertices, true);
    for (final Integer v : _doubleDotLessThan) {
      {
        final JNIISLVertex vertex = vertices.getVertexAt((v).intValue());
        final JNIISLMultiAff vMaff = vertex.getExpr();
        final JNIISLBasicSet constraints = AlphaExpressionUtil.multiAffToConstraints(vMaff, bodyExprDom.getSpace(), offset);
        final JNIISLSet dom = bodyExprDom.copy().intersect(constraints.toSet());
        final JNIISLSet domProj = dom.projectOut(JNIISLDimType.isl_dim_set, offset, kernelDims);
        if ((res == null)) {
          res = domProj;
        } else {
          res = res.intersect(domProj);
        }
      }
    }
    return res;
  }
  
  /**
   * Helper for preimageByConvolutionDependences. Converts MultiAff to a set of constraints (basic set).
   */
  private static JNIISLBasicSet multiAffToConstraints(final JNIISLMultiAff maff, final JNIISLSpace space, final int offset) {
    final int nbAff = maff.getNbAff();
    int _nbDims = space.getNbDims(JNIISLDimType.isl_dim_set);
    boolean _lessThan = (_nbDims < (offset + nbAff));
    if (_lessThan) {
      throw new RuntimeException(((("Incompatible space given for MultiAff to Constraint conversion: " + maff) + " @ ") + space));
    }
    JNIISLBasicSet constraints = JNIISLBasicSet.buildUniverse(space.copy());
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, nbAff, true);
    for (final Integer a : _doubleDotLessThan) {
      {
        final JNIISLConstraint c = AlphaExpressionUtil.affToConstraint(maff.getAff((a).intValue()), space, (offset + (a).intValue()));
        constraints = constraints.addConstraint(c);
      }
    }
    return constraints;
  }
  
  /**
   * Helper for preimageByConvolutionDependences. Converts Aff to an equality constraint equating to a
   * specified dimension.
   */
  private static JNIISLConstraint affToConstraint(final JNIISLAff aff, final JNIISLSpace space, final int dim) {
    JNIISLConstraint c = JNIISLConstraint.buildEquality(space.copy());
    c = c.setCoefficient(JNIISLDimType.isl_dim_set, dim, (-1));
    int _nbDims = aff.getNbDims(JNIISLDimType.isl_dim_param);
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _nbDims, true);
    for (final Integer d : _doubleDotLessThan) {
      c = c.setCoefficient(JNIISLDimType.isl_dim_param, (d).intValue(), aff.getCoefficientVal(JNIISLDimType.isl_dim_param, (d).intValue()));
    }
    c = c.setConstant(aff.getConstantVal());
    return c;
  }
  
  /**
   * Extends a dependence by adding additional input dimensions, that are
   * mapped to the output space as identity.
   * 
   * Used for mapping external DependenceExpression into ConvolutionExpression
   */
  public static JNIISLMultiAff extendMultiAffWithIdentityDimensions(final JNIISLMultiAff orig, final int exDims) {
    final int origInputDims = orig.getNbDims(JNIISLDimType.isl_dim_in);
    final int origOutputDims = orig.getNbDims(JNIISLDimType.isl_dim_out);
    JNIISLSpace exSpace = orig.getSpace().copy();
    exSpace = exSpace.addDims(JNIISLDimType.isl_dim_in, exDims);
    exSpace = exSpace.addDims(JNIISLDimType.isl_dim_out, exDims);
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(origInputDims, (origInputDims + exDims), true);
    for (final Integer i : _doubleDotLessThan) {
      exSpace = exSpace.setName(JNIISLDimType.isl_dim_in, (i).intValue(), ("i" + i));
    }
    ExclusiveRange _doubleDotLessThan_1 = new ExclusiveRange(origOutputDims, (origOutputDims + exDims), true);
    for (final Integer i_1 : _doubleDotLessThan_1) {
      exSpace = exSpace.setName(JNIISLDimType.isl_dim_out, (i_1).intValue(), ("o" + i_1));
    }
    JNIISLMultiAff exMaff = JNIISLMultiAff.buildZero(exSpace.copy());
    JNIISLAffList affList = JNIISLAffList.build(orig.getContext(), (origOutputDims + exDims));
    ExclusiveRange _doubleDotLessThan_2 = new ExclusiveRange(0, origOutputDims, true);
    for (final Integer i_2 : _doubleDotLessThan_2) {
      {
        JNIISLAff affNew = exMaff.getAff((i_2).intValue());
        JNIISLAff affOrig = orig.getAff((i_2).intValue());
        affNew = affNew.setConstant(affOrig.getConstantVal());
        int _nbDims = orig.getNbDims(JNIISLDimType.isl_dim_param);
        ExclusiveRange _doubleDotLessThan_3 = new ExclusiveRange(0, _nbDims, true);
        for (final Integer d : _doubleDotLessThan_3) {
          affNew = affNew.setCoefficient(JNIISLDimType.isl_dim_param, (d).intValue(), affOrig.getCoefficientVal(JNIISLDimType.isl_dim_param, (d).intValue()));
        }
        int _nbDims_1 = orig.getNbDims(JNIISLDimType.isl_dim_in);
        ExclusiveRange _doubleDotLessThan_4 = new ExclusiveRange(0, _nbDims_1, true);
        for (final Integer d_1 : _doubleDotLessThan_4) {
          affNew = affNew.setCoefficient(JNIISLDimType.isl_dim_in, (d_1).intValue(), affOrig.getCoefficientVal(JNIISLDimType.isl_dim_in, (d_1).intValue()));
        }
        affList = affList.add(affNew);
      }
    }
    ExclusiveRange _doubleDotLessThan_3 = new ExclusiveRange(0, exDims, true);
    for (final Integer i_3 : _doubleDotLessThan_3) {
      {
        JNIISLAff affNew = exMaff.getAff(((i_3).intValue() + origOutputDims));
        affNew = affNew.setCoefficient(JNIISLDimType.isl_dim_in, ((i_3).intValue() + origOutputDims), 1);
        affList = affList.add(affNew);
      }
    }
    return JNIISLMultiAff.buildFromAffList(exSpace, affList);
  }
  
  public static final Function<AlphaExpression, AlphaExpression> filterAutoRestrict = ((Function<AlphaExpression, AlphaExpression>) (AlphaExpression expr) -> {
    AlphaExpression _xifexpression = null;
    if ((expr instanceof AutoRestrictExpression)) {
      RestrictExpression _xblockexpression = null;
      {
        final AutoRestrictExpression are = ((AutoRestrictExpression) expr);
        final RestrictExpression re = AlphaUserFactory.createRestrictExpression(are.getInferredDomain(), are.getExpr());
        re.setExpressionDomain(are.getExpressionDomain());
        re.setContextDomain(are.getContextDomain());
        _xblockexpression = re;
      }
      _xifexpression = _xblockexpression;
    } else {
      _xifexpression = expr;
    }
    return _xifexpression;
  });
  
  public static JNIISLSet parentContext(final AlphaExpression child, final EObject parent, final Consumer<AlphaIssue> f) {
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
