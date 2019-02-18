package alpha.model.util

import alpha.model.AlphaExpression
import alpha.model.AlphaNode
import alpha.model.CalculatorExpression
import alpha.model.POLY_OBJECT_TYPE
import alpha.model.StandardEquation
import alpha.model.UseEquation
import alpha.model.issue.AlphaIssue
import alpha.model.issue.AlphaIssueFactory
import alpha.model.issue.UnexpectedISLErrorIssue
import fr.irisa.cairn.jnimap.isl.jni.JNIISLDimType
import fr.irisa.cairn.jnimap.isl.jni.JNIISLMap
import fr.irisa.cairn.jnimap.isl.jni.JNIISLMultiAff
import fr.irisa.cairn.jnimap.isl.jni.JNIISLSet
import java.util.function.Consumer
import java.util.stream.Stream

/**
 * Utility methods that concern AlphaExpressions.
 * 
 */
class AlphaExpressionUtil {
	
		
	static def <T> getChildrenOfType(AlphaNode expr, Class<T> c) {
		expr.eContents.stream.filter([e|c.isInstance(e)]).map([e|c.cast(e)])
	}
	
	static def testNonNullContextDomain(Stream<AlphaExpression> exprs) {
		return exprs.allMatch([e|e !== null && e.contextDomain !== null]);
	}
	
	static def testNonNullExpressionDomain(Stream<AlphaExpression> exprs) {
		return exprs.allMatch([e|e !== null && e.expressionDomain !== null]);
	}
	
	static def testNonNullCalcExpression(Stream<CalculatorExpression> exprs) {
		return exprs.allMatch([e|e !== null && e.ISLObject !== null]);
	}
	
	/*
	 * parentContext gives the context domain of the parent node
	 * There are a few cases to consider:
	 *  - parent is another AlphaExpression: simply take its context domain
	 *  - parent is a  StandardEquation: take the variable domain
	 *  - parent is an UseEquation: this depends on the corresponding input variable of the callee subsystem.
	 *      In short, the context is the cross product of instantiation domain with the input variable domain.
	 *  - for both Equations, the parameter domain of its enclosing SystemBody is intersected
	 */
	//default case, just pass the context of the parent
	static dispatch def parentContext(AlphaExpression child, AlphaExpression parent, Consumer<AlphaIssue> f) {
		parent.contextDomain
	}
	
	static dispatch def parentContext(AlphaExpression child, StandardEquation parent, Consumer<AlphaIssue> f) {
		if (parent.systemBody.parameterDomain === null) null
		else parent.variable.domain.intersectParams(parent.systemBody.parameterDomain)
	}

	//For UseEquations, the context depends on the location of the child
	// the instantiation domain is extended by the number of dimension with the corresponding input/output in the callee subsystem
	//  
	static dispatch def parentContext(AlphaExpression child, UseEquation parent, Consumer<AlphaIssue> f) {
		if (checkCalcExprType(parent.instantiationDomainExpr, POLY_OBJECT_TYPE.SET, f) &&
			parent.systemBody.parameterDomain !== null) {
			
			val inputLoc = parent.inputExprs.indexOf(child);
			val outputLoc = parent.outputExprs.indexOf(child)
			if (inputLoc == -1 && outputLoc == -1) return null
			
			val calleeVar = if (inputLoc!=-1) parent.system.inputs.get(inputLoc) else parent.system.outputs.get(outputLoc)
			
			val instantiationDomain = parent.instantiationDomain.intersectParams(parent.systemBody.parameterDomain);
			
			if (testNonNullExpressionDomain(getChildrenOfType(child, AlphaExpression))) {
				val exDom = AlphaUtil.callISLwithErrorHandling(
					[extendCalleeDomainByInstantiationDomain(instantiationDomain, parent.callParams, calleeVar.domain)],
					[err|new UnexpectedISLErrorIssue(err, child.eContainer(), child.eContainingFeature())]
				);
				//The context domain computed as above may contain indices with primes when the same index name is used in two systems.
				//The index names are renamed to that of expression domain to avoid issues due to nameing.
				// (a space [i,i'] gives [i,i] as index names in ISL)
				return AlphaUtil.renameIndices(exDom, child.expressionDomain.indicesNames)
			}
			
		} else {
			return null
		}
	}
	
	private static def boolean checkCalcExprType(CalculatorExpression cexpr, POLY_OBJECT_TYPE expected, Consumer<AlphaIssue> f) {
		if (cexpr.getType() != expected) {
			if (f !== null)
				f.accept(AlphaIssueFactory.unmatchedCalcExprType(cexpr, expected))
			return false;
		}
		
		return true;
	}
	
	/**
	 * Extends the domain of a subsystem (variable) by the instantiation domain.
	 * 
	 * The output domain takes the following form:
	 *   - The parameters of the caller domain becomes the new set of parameters.
	 *   - The parameters of the callee domain are replaced by expressions over indices in the caller domain.
	 * 
	 * The above is done through:
	 *   - Convert the callee domain (set) to relation from parameter to domain (map)
	 *   - Add the parameters of the caller domain to the resulting map.
	 *   - Create another map that represents the relation between caller domain and parameter values of the instances
	 *   - Compose the two maps and collapse it as a set
	 *  
	 */
	private static def JNIISLSet extendCalleeDomainByInstantiationDomain(JNIISLSet instantiationDomain, JNIISLMultiAff callParams, JNIISLSet calleeVarDom) {
		val map = JNIISLMap.fromRange(calleeVarDom)
		val nparam = map.getNbParams()
		val p2s = map.moveDims(JNIISLDimType.isl_dim_in, 0, JNIISLDimType.isl_dim_param, 0, nparam)
		val p2sEx = p2s.alignParams(instantiationDomain.space)
		val paramCallRel = callParams.toMap.intersectDomain(instantiationDomain)
		val ctxMap = paramCallRel.applyRange(p2sEx)
		
		return ctxMap.toSet
	}
}