package alpha.model.transformation.reduction

import alpha.model.AbstractReduceExpression
import alpha.model.AlphaInternalStateConstructor
import alpha.model.factory.AlphaUserFactory
import fr.irisa.cairn.jnimap.isl.ISLErrorException
import fr.irisa.cairn.jnimap.isl.JNIISLTools
import fr.irisa.cairn.jnimap.isl.ISLMultiAff

/**
 * ReductionDecomposition splits a reduction into two.
 * A reduction of the form:
 *   reduce(op, f, E)
 * is transformed into:
 *   reduce(op, f2, reduce(op, f1, E))
 * where f = f2 o f1.
 */
class ReductionDecomposition {
	
	private new() {}
	
	/**
	 * Applies ReductionDecomposition using the input functions.
	 * Input f1 becomes the projection function of the inner reduction.
	 */
	static def apply(AbstractReduceExpression are, ISLMultiAff f1, ISLMultiAff f2) {
		val validDecomposition = {
			try {
				JNIISLTools.recordError([|f2.copy.pullback(f1.copy).isPlainEqual(are.projection)])
			} catch (ISLErrorException isle) {
				throw new IllegalArgumentException("[ReductionDecomposition] ISL error while testing for validity of input functions: " + isle.islErrorMessage);
			}
		}
		if (!validDecomposition) {
			throw new IllegalArgumentException("[ReductionDecomposition] The composition of input functions must match the original projection. ");
		}
		
		val innerARE = ReductionUtil.constructConcreteReduction(are, are.operator, f1, are.body)
		are.body = innerARE
		are.projectionExpr = AlphaUserFactory.createJNIFunction(f2)
		
		AlphaInternalStateConstructor.recomputeContextDomain(innerARE)
	}
}