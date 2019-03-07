package alpha.model.transformation

import alpha.model.AlphaSystem
import alpha.model.StandardEquation
import alpha.model.SystemBody
import alpha.model.Variable
import alpha.model.util.AbstractAlphaCompleteVisitor
import alpha.model.UseEquation
import alpha.model.VariableExpression
import alpha.model.factory.AlphaUserFactory
import org.eclipse.emf.ecore.util.EcoreUtil
import alpha.model.AlphaInternalStateConstructor

/**
 * Replaces a VariableExpression with the definition of the corresponding StandardEquation.
 * Variables defined through UseEquations cannot be substituted.
 * 
 * When the target equation is specified, the substitution only happens in the definition
 * of the target. Otherwise, all occurrences in an AlphaSystem (or SystemBody) are substituted.
 * 
 * Given
 *  X = Y;
 *  Y = E;
 * substituting Y in X gives:
 *  X = D : E
 * where D is the domain of Y. 
 * 
 */
class SubstituteByDef extends AbstractAlphaCompleteVisitor  {
	protected SystemBody systemBody;
	protected StandardEquation targetEquation
	protected StandardEquation substituteEquation
	
	private new(SystemBody systemBody, StandardEquation targetEquation, StandardEquation substituteEquation) {
		this.systemBody = systemBody;
		this.targetEquation = targetEquation
		this.substituteEquation = substituteEquation
	}
	
	
	static def void apply(AlphaSystem system, Variable substituteVar) {
		system.systemBodies.forEach[body|apply(body, substituteVar)]
	}
	
	static def void apply(AlphaSystem system, StandardEquation targetEq, Variable substituteVar) {
		system.systemBodies.forEach[body|apply(body, targetEq, substituteVar)]
	}
	
	static def void apply(SystemBody body, Variable substituteVar) {
		apply(body, null, substituteVar)
	}
	
	static def void apply(SystemBody body, StandardEquation targetEq, Variable substituteVar) {
		
		val subEq = body.getStandardEquation(substituteVar)
		val visitor = new SubstituteByDef(body, targetEq, subEq)
		
		visitor.accept(body)
	}
	
	override visitUseEquation(UseEquation ue) {
		//stop visiting
		return
	}
	
	override visitStandardEquation(StandardEquation se) {
		//only visit targets
		if (targetEquation === null || se == targetEquation)
			super.visitStandardEquation(se)
		return
	}
	
	override outVariableExpression(VariableExpression ve) {
		if (ve.variable == substituteEquation.variable) {
			val substituteExpr = AlphaUserFactory.createRestrictExpression(substituteEquation.variable.domain, EcoreUtil.copy(substituteEquation.expr))
			EcoreUtil.replace(ve, substituteExpr)
			AlphaInternalStateConstructor.recomputeContextDomain(substituteExpr)
		}
	}

	
}