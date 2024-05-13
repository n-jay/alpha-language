package alpha.model.util

import alpha.model.AlphaExpression
import alpha.model.AlphaRoot
import alpha.model.AlphaSystem
import alpha.model.AutoRestrictExpression
import alpha.model.BinaryExpression
import alpha.model.CaseExpression
import alpha.model.RestrictExpression
import alpha.model.SystemBody
import alpha.model.UnaryExpression
import alpha.model.UseEquation
import alpha.model.Variable
import alpha.model.PolynomialIndexExpression
import alpha.model.SelectExpression
import alpha.model.ConvolutionExpression
import alpha.model.JNIDomain
import fr.irisa.cairn.jnimap.isl.ISLMultiAff
import fr.irisa.cairn.jnimap.isl.ISLSet

/**
 * Prints the Alpha program in Show notation of the older syntax used in
 * AlphaZ @ CSU. 
 * 
 * The input program should not use:
 *   - FuzzyVariable/Function
 *   - While domains
 *   - PolynomialIndexExpression
 *   - SelectExpression
 *   - ConvolutionExpression
 * 
 * In addition:
 *   - a single system body must be specified for systems with multiple bodies
 *   - all package and external function declarations are removed 
 */
class ShowLegacyAlpha {

	
	static def print(AlphaRoot root) {
		root.systems.join("\n", [s|print(s)])
	}
	
	static def print(AlphaSystem system) {
		if (system.systemBodies.size > 1) {
			throw new IllegalArgumentException("[ShowLegacyAlpha] A system with multiple bodies are not supported.");
		}
		
		val show = new ShowLegacyAlphaForSystem(system.systemBodies.get(0));
		
		show.doSwitch(system).toString()
	}
	
	static def print(SystemBody systemBody) {
		val show = new ShowLegacyAlphaForSystem(systemBody);
		
		show.doSwitch(systemBody.system).toString()
	}
	
	static class ShowLegacyAlphaForSystem extends Show {
		protected SystemBody targetBody
		
		new(SystemBody targetBody) {
		 	this.targetBody = targetBody
		}
		
		override protected printDomain(ISLSet set) {
			AlphaPrintingUtil.toLegacyAlphaString(set)
		}
		
		override protected printParameterDomain(JNIDomain dom) {
			AlphaPrintingUtil.toLegacyAlphaStringParameterDomain(dom.ISLSet)
		}
		
		override protected printVariableDeclarationDomain(ISLSet set) {
			AlphaPrintingUtil.toLegacyAlphaString(set)
		}
		
		override caseAlphaSystem(AlphaSystem s) {
			if (s.whileDomainExpr !== null) throw new IllegalArgumentException("[ShowLegacyAlpha] While domains are not allowed.");
			
		'''
			affine «s.name» «s.parameterDomainExpr.printParameterDomain»
				«IF !s.inputs.isEmpty»
					input
						«s.inputs.map[doSwitch].join("\n")»
				«ENDIF»
				«IF !s.outputs.isEmpty»
					output
						«s.outputs.map[doSwitch].join("\n")»
				«ENDIF»
				«IF !s.locals.isEmpty»
					local
						«s.locals.map[doSwitch].join("\n")»
				«ENDIF»
				let
					«(targetBody.equations).map[doSwitch].join("\n\n")»
			.
		'''
		}
		
		override caseVariable(Variable v) {
			'''float «v.name» «v.domain.printVariableDeclarationDomain»;'''
		}
		
		override caseUseEquation(UseEquation ue) {
			throw new UnsupportedOperationException("[ShowLegacyAlpha] Use equations are not yet supported.");
		}
		
		override caseRestrictExpression(RestrictExpression re) {
			caseRestrict(re, re.restrictDomain, re.expr)
		}
		
		override caseAutoRestrictExpression(AutoRestrictExpression are) {
			caseRestrict(are, are.inferredDomain, are.expr)
		}
		
		private def caseRestrict(AlphaExpression expr, ISLSet domain, AlphaExpression child) {
			val domStr = domain.printDomain
						
			if (expr.eContainer instanceof UnaryExpression || expr.eContainer instanceof BinaryExpression) {
				'''(«domStr» : «child.doSwitch»)'''
			} else {
				'''«domStr» : «child.doSwitch»'''
			}
		}
		
		override caseCaseExpression(CaseExpression ce) {
			'''
			case 
				«ce.exprs.join("", ";\n", ";", [e|e.doSwitch])»
			esac'''
		}
		
		override casePolynomialIndexExpression(PolynomialIndexExpression pie) {
			throw new IllegalArgumentException("[ShowLegacyAlpha] PolynomialIndexExpression is not allowed.")
		}
		
		override caseSelectExpression(SelectExpression se) {
			throw new IllegalArgumentException("[ShowLegacyAlpha] SelectExpression is not allowed.")
		}
		
		override caseConvolutionExpression(ConvolutionExpression ce) {
			throw new IllegalArgumentException("[ShowLegacyAlpha] ConvolutionExpression is not allowed.")
		}
		
	}
}