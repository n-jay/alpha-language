package alpha.model.transformation

import alpha.model.AlphaSystem
import alpha.model.ConstantExpression
import alpha.model.IndexExpression
import alpha.model.SystemBody
import alpha.model.VariableExpression

/**
 * This transformation implements a form of constant propagation in Alpha.
 * Equations that match the following:
 *   X = VariableExpression
 *   X = ConstantExpression
 *   X = IndexExpression
 * are all inlined into other equations.
 * 
 * Inlined VariableExpressions are wrapped by a RestrictExpression that restricts
 * the domain to the domain of the inlined Variable. 
 * 
 * This transformation also calls {@link RemoveUnusedEquations} to remove the inlined equations.
 * 
 * It is recommended to call {@link Normalize} and {@link SimplifyExpressions}
 * before using this transformation to maximize effectiveness.
 */
class PropagateSimpleEquations {
	
	
	private new () {}
	
	
	static def void apply(AlphaSystem system) {
		system.systemBodies.forEach[body|apply(body)]
	}
	
	static def void apply(SystemBody body) {
		val simpleEquations = body.standardEquations.filter[eq|
			eq.expr instanceof VariableExpression ||
			eq.expr instanceof ConstantExpression ||
			eq.expr instanceof IndexExpression
		]
		
		if (simpleEquations !== null) {
			simpleEquations.forEach[seq|SubstituteByDef.apply(body, null, seq.variable)]
			RemoveUnusedEquations.apply(body.system)
		}
		
	}
}