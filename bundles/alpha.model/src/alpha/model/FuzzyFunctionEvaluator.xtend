package alpha.model

import alpha.model.issue.AlphaIssue
import java.util.List
import java.util.LinkedList
import java.util.Stack
import alpha.model.util.AlphaUtil

import static alpha.model.util.AlphaUtil.getParameterDomain
import static alpha.model.util.AlphaUtil.callISLwithErrorHandling
import fr.irisa.cairn.jnimap.isl.jni.ISLFactory
import alpha.model.issue.CalculatorExpressionIssue
import alpha.model.issue.AlphaIssue.TYPE

/**
 * 
 * 
 * This class computes the ISL representation for {@link FuzzyFunction}s. 
 * FuzzyFunctions are not part of the calculator expression, but have a similar structure to them.
 */
class FuzzyFunctionEvaluator {
	
	private List<AlphaIssue> issues = new LinkedList;

	private Stack<List<String>> contextHistory = new Stack;
	private List<String> indexNameContext;
	
	protected new(List<String> indexNameContext) {
		this.indexNameContext = indexNameContext;
	}
	
	public static def List<AlphaIssue> calculate(FuzzyFunction ff) {
		calculate(ff, null)
	}
	
	public static def List<AlphaIssue> calculate(FuzzyFunction ff, List<String> indexNameContext) {
		val calc = new FuzzyFunctionEvaluator(indexNameContext);	
		
		calc.visitFuzzyFunction(ff);
		
		return calc.issues
	}
	
		private def registerIssue(String msg, AlphaNode node) {
		issues.add(new CalculatorExpressionIssue(TYPE.ERROR, msg, node.eContainer, node.eContainingFeature));
	}
	
	/**
	 * Computes the ISL representation of the textual representation.
	 * This is done top-down, since the computed map gives the context
	 * for AffineFuzzyVariableUse in its children.
	 * 
	 */
	private dispatch def void computeBaseMap(FuzzyFunction ff) {
//		try {
			val pdom = getParameterDomain(ff);
			var jnimap = ISLFactory.islMap(AlphaUtil.toContextFreeISLString(AlphaUtil.getContainerSystem(ff), "{"+ff.alphaString+"}"));

			jnimap = jnimap.intersectParams(pdom.copy());

			ff.fuzzyMap = jnimap
			
			if (ff.fuzzyMap.domainIsWrapping) {
				val newnames = ff.fuzzyMap.getDomain.unwrap.domainNames
				contextHistory.push(indexNameContext)
				indexNameContext = newnames
			} else {
				//TODO this should raise an issue
				contextHistory.push(indexNameContext)
				indexNameContext = null
			}
//		} catch (RuntimeException re) {
//			val msg = if(re.message === null) re.class.name else re.message
//			registerIssue(msg, ff);
//		}
		
	}
	private dispatch def void computeBaseMap(FuzzyFunctionInArrayNotation ff) {
		contextHistory.push(indexNameContext)
		indexNameContext = null
		
	}
	private dispatch def void computeBaseMap(AffineFuzzyVariableUse afvu) {
		issues.addAll(CalculatorExpressionEvaluator.calculate(afvu.useFunction, indexNameContext))
	}
	/**
	 * Computes the dependence relation, which is the set of values
	 * that a FuzzyFunction may use. This is computed by first adding the constraints
	 * on the fuzzy variables, and then projecting them out.
	 * 
	 */
	private def void computeDependenceRelation(FuzzyFunction ff) {
		indexNameContext = contextHistory.pop
		
		
	}
	
	/*
	 * Simple visitor to calculate bottom-up.
	 * 
	 */
	 
	protected def visitFuzzyFunction(FuzzyFunction ff) {
		computeBaseMap(ff)
		for( indirection : ff.indirections) {
			visitFuzzyVariableUse(indirection)
		}
		computeDependenceRelation(ff)
	}
	
	protected dispatch def void visitFuzzyVariableUse(NestedFuzzyFunction nff) {
		visitFuzzyFunction(nff)
	}
	protected dispatch def void visitFuzzyVariableUse(AffineFuzzyVariableUse afvu) {
			
	}
}