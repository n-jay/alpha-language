package alpha.model.transformation

import alpha.model.AlphaExpression
import alpha.model.AlphaSystem
import alpha.model.ConstantExpression
import alpha.model.IndexExpression
import alpha.model.RestrictExpression
import alpha.model.SystemBody
import alpha.model.VariableExpression
import alpha.model.DependenceExpression

/**
 * This transformation implements a form of constant propagation in Alpha.
 * Equations that match the following:
 *   X = SimpleExpression
 * where
 *   SimpleExpression := SimpleExpression |
 *                       VariableExpression | ConstantExpression | IndexExpression
 *                       RestrictExpression : SimpleExpression |
 *                       DependenceExpression @ SimpleExpression
 * are all considered to be simple and are inlined.
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
		val simpleEquations = body.standardEquations.filter[eq|eq.expr.isSimple]
		
		if (simpleEquations !== null) {
			simpleEquations.forEach[seq|SubstituteByDef.apply(body, null, seq.variable)]
			RemoveUnusedEquations.apply(body.system)
		}
		
	}
	
	private static def dispatch isSimple(AlphaExpression expr) { false }
	
	private static def dispatch isSimple(VariableExpression expr) { true }
	private static def dispatch isSimple(ConstantExpression expr) { true }
	private static def dispatch isSimple(IndexExpression expr)    { true }
	private static def dispatch boolean isSimple(RestrictExpression expr)    { isSimple(expr.expr) }
	private static def dispatch boolean isSimple(DependenceExpression expr)    { isSimple(expr.expr) }
	
}