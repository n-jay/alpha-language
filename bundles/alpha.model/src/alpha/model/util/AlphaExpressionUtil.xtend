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
import fr.irisa.cairn.jnimap.isl.jni.JNIISLAff
import fr.irisa.cairn.jnimap.isl.jni.JNIISLBasicSet
import fr.irisa.cairn.jnimap.isl.jni.JNIISLConstraint
import fr.irisa.cairn.jnimap.isl.jni.JNIISLDimType
import fr.irisa.cairn.jnimap.isl.jni.JNIISLMap
import fr.irisa.cairn.jnimap.isl.jni.JNIISLMultiAff
import fr.irisa.cairn.jnimap.isl.jni.JNIISLSet
import fr.irisa.cairn.jnimap.isl.jni.JNIISLSpace
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
		if (parent.systemBody.parameterDomainExpr === null || parent.systemBody.parameterDomain === null) null
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
	
	/**
	 * Computes the domain where a convolution operation is completely defined. That is, for each point
	 * in the kernel domain, there must be a valid definition of the expression (= in expression domain).
	 * 
	 * It is essentially taking a preimage by the set of dependences specified through the kernel domain.
	 * However, I did not see a straight-forward way to take preimages of relations in ISL. This method
	 * computes preimage using vertices by assuming that the kernel domain is a single polyhedron (basic set).
	 * 
	 * Each vertex is plugged in to the expression domain to replace the indices corresponding to the dimensions
	 * extended with the kernel domain. Then the kernel domain dimensions are projected out to find the domain
	 * that is defined for the vertex.
	 * 
	 * If you don't use the vertices, the kernel dimensions are only constraint to some range, not to a single point.
	 * Taking the domain of such relation does not give the preimage, since a point in the domain is considered to 
	 * be part of the set if it the relation holds for at least one value in the range. 
	 * 
	 */
	static def JNIISLSet preimageByConvolutionDependences(JNIISLBasicSet kernelDomain, JNIISLSet bodyExprDom ) {
		val vertices = kernelDomain.computeVertices
		if (vertices.nbCell != 1) throw new RuntimeException("Expecting only one cell for vertices of kernel domain in convolutions."); 
	
		val kernelDims = kernelDomain.getNbDims(JNIISLDimType.isl_dim_set);
		val offset = bodyExprDom.nbDims - kernelDims;
	
		var JNIISLSet res = null
		for (v : 0..<vertices.nbVertices) {
			val vertex = vertices.getVertexAt(v);
			val vMaff = vertex.expr
			val constraints = multiAffToConstraints(vMaff, bodyExprDom.space, offset)
			val dom = bodyExprDom.copy.intersect(constraints.toSet)
			val domProj = dom.projectOut(JNIISLDimType.isl_dim_set, offset, kernelDims);
			
			if (res === null) res = domProj
			else res = res.intersect(domProj);
		}
		
		return res
	}
	
	/**
	 * Helper for preimageByConvolutionDependences. Converts MultiAff to a set of constraints (basic set).
	 * 
	 */
	private static def JNIISLBasicSet multiAffToConstraints(JNIISLMultiAff maff, JNIISLSpace space, int offset) {
		val nbAff = maff.nbAff
		if (space.getNbDims(JNIISLDimType.isl_dim_set) < offset + nbAff)
			throw new RuntimeException("Incompatible space given for MultiAff to Constraint conversion: " + maff + " @ " + space );
			
		var constraints = JNIISLBasicSet.buildUniverse(space.copy());
		for (a : 0..<nbAff) {
			val c = affToConstraint(maff.getAff(a), space, offset+a);
			constraints = constraints.addConstraint(c);
		}
		
		return constraints
	}
	
	/**
	 * Helper for preimageByConvolutionDependences. Converts Aff to an equality constraint equating to a 
	 * specified dimension. 
	 */
	private static def JNIISLConstraint affToConstraint(JNIISLAff aff, JNIISLSpace space, int dim) {
		var c = JNIISLConstraint.buildEquality(space.copy);
		c = c.setCoefficient(JNIISLDimType.isl_dim_set, dim, -1)
		
		for (d : 0..<aff.getNbDims(JNIISLDimType.isl_dim_param)) {
			c = c.setCoefficient(JNIISLDimType.isl_dim_param, d, aff.getCoefficientVal(JNIISLDimType.isl_dim_param, d));
		}
		c = c.setConstant(aff.getConstantVal());

		return c
	}
}