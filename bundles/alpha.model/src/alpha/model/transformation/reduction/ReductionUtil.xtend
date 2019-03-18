package alpha.model.transformation.reduction

import alpha.model.AlphaExpression
import alpha.model.ArgReduceExpression
import alpha.model.REDUCTION_OP
import alpha.model.ReduceExpression
import alpha.model.factory.AlphaUserFactory
import fr.irisa.cairn.jnimap.isl.jni.JNIISLMultiAff

class ReductionUtil {
	
	/**
	 * Dispatch methods for constructing reductions with the appropriate concrete type.
	 * 
	 */
	static def dispatch constructConcreteReduction(ReduceExpression base, REDUCTION_OP op, JNIISLMultiAff projection, AlphaExpression body) {
		AlphaUserFactory.createReduceExpression(op, projection, body)
	}

	static def dispatch constructConcreteReduction(ArgReduceExpression base, REDUCTION_OP op, JNIISLMultiAff projection, AlphaExpression body) {
		AlphaUserFactory.createArgReduceExpression(op, projection, body)
	}

}