package alpha.model.transformation.reduction;

import alpha.model.AbstractReduceExpression;
import alpha.model.AlphaExpression;
import alpha.model.AlphaInternalStateConstructor;
import alpha.model.DependenceExpression;
import alpha.model.analysis.reduction.ShareSpaceAnalysis;
import alpha.model.analysis.reduction.ShareSpaceAnalysisResult;
import alpha.model.factory.AlphaUserFactory;
import alpha.model.issue.AlphaIssue;
import alpha.model.matrix.MatrixOperations;
import alpha.model.transformation.Normalize;
import alpha.model.transformation.reduction.ReductionUtil;
import alpha.model.util.AffineFunctionOperations;
import alpha.model.util.AlphaOperatorUtil;
import alpha.model.util.AlphaUtil;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLDimType;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLMultiAff;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.xtext.EcoreUtil2;

/**
 * Idempotence is one of the transformations that can be applied with
 * a reuse vector overlapping the kernel of the projection function.
 * 
 * When repeated application of the reduction operator over the same
 * value does not change the output (i.e., when the operator is idempotent),
 * the domain of the reduction body may be restricted to avoid repeated operations.
 * 
 * Given a reduction of the form:
 *   reduce(op, f, E)
 * and a projection f_c, where ker(f_c) = ker(f) /\ reuse(E),
 * the transformation produces:
 *  reduce(op, f', E')
 * where
 *  - f' is the domain of f projected by f_c
 *  - and E' is the E re-defined to the space of the domain of f'
 * 
 * This re-definition is done by visiting all DependenceExpressions in E
 * and projecting the domain of the dependence function by f_c.
 */
@SuppressWarnings("all")
public class Idempotence {
  public static List<AlphaIssue> apply(final AbstractReduceExpression are) {
    return Idempotence.transform(are);
  }
  
  private static List<AlphaIssue> transform(final AbstractReduceExpression are) {
    List<AlphaIssue> _xblockexpression = null;
    {
      boolean _isIdempotent = AlphaOperatorUtil.isIdempotent(are.getOperator());
      boolean _not = (!_isIdempotent);
      if (_not) {
        throw new IllegalArgumentException("[Idempotence] The operator of the specified reduction is not idempotent.");
      }
      Normalize.apply(are.getBody());
      final ShareSpaceAnalysisResult SSAR = ShareSpaceAnalysis.apply(are);
      final long[][] areSS = SSAR.getShareSpace(are.getBody());
      if ((areSS == null)) {
        throw new IllegalArgumentException("[Idempotence] The body of the specified reduction does not have any reuse.");
      }
      final long[][] kerFp = MatrixOperations.transpose(AffineFunctionOperations.computeKernel(are.getProjection()));
      final long[][] kerFc = MatrixOperations.plainIntersection(kerFp, areSS);
      if ((kerFc == null)) {
        throw new IllegalArgumentException("[Idempotence] The intersection of the share space of the reduction body and kernel of the projection is empty.");
      }
      final List<String> params = AlphaUtil.getContainerSystem(are).getParameterDomain().getParametersNames();
      final List<String> indices = are.getBody().getContextDomain().getIndicesNames();
      final JNIISLMultiAff Fc = AffineFunctionOperations.constructAffineFunctionWithSpecifiedKernel(params, indices, kerFc);
      final JNIISLMultiAff Fpprime = AffineFunctionOperations.projectFunctionDomain(are.getProjection(), Fc.copy());
      final Consumer<DependenceExpression> _function = (DependenceExpression de) -> {
        final JNIISLMultiAff projectedDep = AffineFunctionOperations.projectFunctionDomain(de.getFunction(), Fc.copy());
        final DependenceExpression newDepExpr = AlphaUserFactory.createDependenceExpression(projectedDep, de.getExpr());
        EcoreUtil2.replace(de, newDepExpr);
      };
      EcoreUtil2.<DependenceExpression>getAllContentsOfType(are, DependenceExpression.class).forEach(_function);
      AlphaExpression _xifexpression = null;
      int _nbDims = Fpprime.getNbDims(JNIISLDimType.isl_dim_in);
      int _nbDims_1 = Fpprime.getNbDims(JNIISLDimType.isl_dim_out);
      boolean _equals = (_nbDims == _nbDims_1);
      if (_equals) {
        _xifexpression = are.getBody();
      } else {
        _xifexpression = ReductionUtil.constructConcreteReduction(are, are.getOperator(), Fpprime, are.getBody());
      }
      final AlphaExpression replacement = _xifexpression;
      EcoreUtil2.replace(are, replacement);
      _xblockexpression = AlphaInternalStateConstructor.recomputeContextDomain(replacement);
    }
    return _xblockexpression;
  }
}
