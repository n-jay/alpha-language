package alpha.model.transformation.reduction

import alpha.model.AbstractReduceExpression
import alpha.model.AlphaInternalStateConstructor
import alpha.model.DependenceExpression
import alpha.model.analysis.reduction.ShareSpaceAnalysis
import alpha.model.factory.AlphaUserFactory
import alpha.model.matrix.MatrixOperations
import alpha.model.transformation.Normalize
import alpha.model.util.AffineFunctionOperations
import alpha.model.util.AlphaUtil
import fr.irisa.cairn.jnimap.isl.jni.JNIISLDimType
import org.eclipse.xtext.EcoreUtil2
import alpha.model.util.AlphaOperatorUtil

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
class Idempotence {
	
	static def apply(AbstractReduceExpression are) {
		transform(are)
	}
	
	private static def transform(AbstractReduceExpression are) {
		if (!AlphaOperatorUtil.isIdempotent(are.operator)) {
			throw new IllegalArgumentException("[Idempotence] The operator of the specified reduction is not idempotent.");
		}
		//Idempotence requires the body to be normalized
		// this is for projecting all dependences by f_c
		Normalize.apply(are.body)
		
		val SSAR = ShareSpaceAnalysis.apply(are);
		val areSS = SSAR.getShareSpace(are.body)
		if (areSS === null)
			throw new IllegalArgumentException("[Idempotence] The body of the specified reduction does not have any reuse.");
		
		val kerFp = MatrixOperations.transpose(AffineFunctionOperations.computeKernel(are.projection))
		val kerFc = MatrixOperations.plainIntersection(kerFp, areSS)
		
		if (kerFc === null)
			throw new IllegalArgumentException("[Idempotence] The intersection of the share space of the reduction body and kernel of the projection is empty.");
			
		val params = AlphaUtil.getContainerSystem(are).parameterDomain.parametersNames
		val indices = are.body.contextDomain.indicesNames
		val Fc = AffineFunctionOperations.constructAffineFunctionWithSpecifiedKernel(params, indices, kerFc)
		
		val Fpprime = AffineFunctionOperations.projectFunctionDomain(are.projection, Fc.copy)
		
		EcoreUtil2.getAllContentsOfType(are, DependenceExpression).forEach[de|
			val projectedDep = AffineFunctionOperations.projectFunctionDomain(de.function, Fc.copy);
			val newDepExpr = AlphaUserFactory.createDependenceExpression(projectedDep, de.expr)
			EcoreUtil2.replace(de, newDepExpr)
		]
		
		val replacement = if (Fpprime.getNbDims(JNIISLDimType.isl_dim_in) == Fpprime.getNbDims(JNIISLDimType.isl_dim_out)) {
			are.body
		} else {
			ReductionUtil.constructConcreteReduction(are, are.operator, Fpprime, are.body)
		}

		EcoreUtil2.replace(are, replacement)
		AlphaInternalStateConstructor.recomputeContextDomain(replacement)
	}
}