package alpha.model.transformation.reduction

import alpha.model.AbstractReduceExpression
import alpha.model.AlphaExpression
import alpha.model.ArgReduceExpression
import alpha.model.DependenceExpression
import alpha.model.REDUCTION_OP
import alpha.model.ReduceExpression
import alpha.model.RestrictExpression
import alpha.model.factory.AlphaUserFactory
import alpha.model.util.AffineFunctionOperations
import org.eclipse.xtext.EcoreUtil2
import fr.irisa.cairn.jnimap.isl.ISLMultiAff

class ReductionUtil {
	
	/**
	 * Dispatch methods for constructing reductions with the appropriate concrete type.
	 * 
	 */
	static def dispatch constructConcreteReduction(ReduceExpression base, REDUCTION_OP op, ISLMultiAff projection, AlphaExpression body) {
		AlphaUserFactory.createReduceExpression(op, projection, body)
	}

	static def dispatch constructConcreteReduction(ArgReduceExpression base, REDUCTION_OP op, ISLMultiAff projection, AlphaExpression body) {
		AlphaUserFactory.createArgReduceExpression(op, projection, body)
	}
	
	/**
	 * Takes a reduction and a function that have overlapping nullspace as the reduction body
	 * and projects the entire reduction by the given function.
	 * 
	 * Given a function Fc
	 *   - reduce(op, f, E)
	 * where ker(Fc) \in reuse(E), returns
	 *   - reduce(op, f', E')
	 * where
	 *   - f = f' o Fc
	 *   - E' = E with all domains and (domain of) dependences projected by Fc.
	 * 
	 * Assumes that input is normalized, and Fc satisfies the requirement.
	 * 
	 */
	static def projectReductionBody(AbstractReduceExpression are, ISLMultiAff Fc) {
		EcoreUtil2.getAllContentsOfType(are, DependenceExpression).forEach[de|
			val projectedDep = AffineFunctionOperations.projectFunctionDomain(de.function, Fc.copy);
			val newDepExpr = AlphaUserFactory.createDependenceExpression(projectedDep, de.expr)
			EcoreUtil2.replace(de, newDepExpr)
		]
		EcoreUtil2.getAllContentsOfType(are, RestrictExpression).forEach[re|
			val projectedDom = re.restrictDomain.apply(Fc.copy.toMap);
			val newRestrictExpr = AlphaUserFactory.createRestrictExpression(projectedDom, re.expr)
			EcoreUtil2.replace(re, newRestrictExpr)
		]
	}
}