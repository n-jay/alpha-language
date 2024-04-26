package alpha.model.transformation

import alpha.model.AlphaSystem
import alpha.model.ReduceExpression
import alpha.model.StandardEquation
import alpha.model.SystemBody
import alpha.model.transformation.reduction.NormalizeReduction
import alpha.model.transformation.reduction.PermutationCaseReduce
import alpha.model.util.Show
import java.util.ArrayList

import static extension alpha.model.util.AlphaUtil.getContainerEquation
import static extension alpha.model.util.AlphaUtil.getContainerSystem
import static extension org.eclipse.xtext.EcoreUtil2.getAllContentsOfType
import alpha.model.AlphaInternalStateConstructor
import java.util.Set

/**
 * Splits any reductions whose bodies are not convex into cases of reductions 
 * with convex bodies.
 * 
 */
class SplitReduction {
	
	public static int counter = 0
	
	static def void apply(AlphaSystem system) {
		system.systemBodies.forEach[apply]
	}
	
	static def void apply(SystemBody body) {
		applyAndReport(body)
	}
	
	static def void apply(SystemBody body, Set<String> excludedEquations) {
		applyAndReport(body, excludedEquations)
	}
	
	static def applyAndReport(SystemBody body) {
		transform(body)	
	}
	
	static def applyAndReport(SystemBody body, Set<String> excludedEquations) {
		transform(body, excludedEquations)	
	}
	
	static def applyAndReport(ReduceExpression re) {
		transform(re)	
	}
	
	static private def transform(SystemBody body) {
		transform(body, newHashSet)
	}

	static private def normalizeReductions(SystemBody body, Set<String> excludedEquations) {
		body.standardEquations
			.reject[e | excludedEquations.contains(e.name)]
			.forEach[e | NormalizeReduction.apply(e)]
	}
	
	static private def transform(SystemBody body, Set<String> excludedEquations) {
		counter += 1
		val system = body.getContainerSystem
		
		body.normalizeReductions(excludedEquations)
		
		// Identify all of the equations that need to substituted after SplitUnionIntoCase. These
		// are guaranteed to be StandardEquations since NormalizeReduction was called previously.
		val nonConvexREs = new ArrayList<ReduceExpression>
		nonConvexREs.addAll(body
			.getAllContentsOfType(ReduceExpression)
			.reject[hasConvexBody]
			.map[e | e as ReduceExpression]
		) 
		
		val nonConvexEqus = new ArrayList<StandardEquation> 
		nonConvexEqus.addAll(nonConvexREs.map[e | e.getContainerEquation as StandardEquation])
		
		// Create separate reduction equations for each convex piece
		SplitUnionIntoCase.apply(body)
		PermutationCaseReduce.apply(body)
		body.normalizeReductions(excludedEquations)
		
		// Remove any references to the old union equation
		nonConvexEqus.forEach[equ | SubstituteByDef.apply(body, equ.variable)]
		RemoveUnusedEquations.apply(system)
		Normalize.apply(body)
		AlphaInternalStateConstructor.recomputeContextDomain(body)
	}
	
	static private def transform(ReduceExpression re) {
		val eq = re.getContainerEquation
		// Create separate reduction equations for each convex piece
		SplitUnionIntoCase.apply(re)
		PermutationCaseReduce.apply(re)
		val newEqs = NormalizeReduction.applyAndReport(eq)
		return newEqs
		
//		// Remove any references to the old union equation
//		nonConvexEqus.forEach[equ | SubstituteByDef.apply(body, equ.variable)]
//		RemoveUnusedEquations.apply(system)
//		Normalize.apply(body)
	}
	
	

	def static hasConvexBody(ReduceExpression re) {
		re.body.contextDomain.nbBasicSets == 1
	}
	
	def static hasNonConvexReduceExpressions(SystemBody body) {
		val nonConvexREs = 
			body.getAllContentsOfType(ReduceExpression)
				.reject[hasConvexBody]
		nonConvexREs.size > 0
	}
	
}




