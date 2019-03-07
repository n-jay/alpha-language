package alpha.model.transformation

import alpha.model.AlphaRoot
import alpha.model.AlphaSystem
import alpha.model.Variable
import alpha.model.VariableExpression
import java.util.HashMap
import org.eclipse.xtext.EcoreUtil2
import alpha.model.StandardEquation

/**
 * Removes local equations/variables that are defined 
 * but are never used in a system.
 */
class RemoveUnusedEquations {
	
	private new() {}
	
	
	static def void apply(AlphaRoot root) {
		root.systems.forEach[s|apply(s)]
	}
	
	static def void apply(AlphaSystem system) {
		val map = new HashMap<Variable, Boolean>();
		
		EcoreUtil2.getAllContentsOfType(system, VariableExpression).
			filter[ve|ve.variable.isLocal].
			forEach[ve|map.put(ve.variable, true)]

		val unusedVars = system.locals.stream.filter[v|!map.containsKey(v)].toArray
		val unusedEqs = EcoreUtil2.getAllContentsOfType(system, StandardEquation).filter[eq|unusedVars.contains(eq.variable)]

		system.locals.removeAll(unusedVars)
		system.systemBodies.forEach[body|body.equations.removeAll(unusedEqs)]
	}
}