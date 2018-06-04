package alpha.model.util

import alpha.model.AlphaVisitable
import alpha.model.ConstantExpression
import alpha.model.DependenceExpression
import alpha.model.ReduceExpression
import alpha.model.StandardEquation
import alpha.model.VariableExpression
import fr.irisa.cairn.jnimap.isl.jni.JNIISLMultiAff
import fr.irisa.cairn.jnimap.isl.jni.JNIISLSet
import java.util.LinkedList
import java.util.List
import java.util.Stack
import alpha.model.CalculatorExpression
import alpha.model.AbstractReduceExpression
import fr.irisa.cairn.jnimap.isl.jni.JNIISLDimType
import alpha.model.IndexExpression

class AShow extends Show {
	
	protected List<String> indexNameContext;
	protected Stack<List<String>> contextHistory = new Stack
	
	//When AShow is not possible, switches to Show
	Show show = new Show
	
	static def <T extends AlphaVisitable> print(T av) {
		val ashow = new AShow();
		ashow.doSwitch(av)
	}
	
	override protected printDomain(JNIISLSet set) {
		AlphaUtil.toAShowString(set, parameterContext, indexNameContext)
	}
	
	override printFunction(JNIISLMultiAff f) {
		AlphaUtil.toAShowString(f, indexNameContext)
	}
	override printRelation(CalculatorExpression rel) {
		rel.ISLObject.toString
	}
	
	
	
	/*
	 * CalculatorExpressions are printed differently depending on the context.
	 */
		
	override caseStandardEquation(StandardEquation se) {
		indexNameContext = se.variable.domain.indicesNames
		
		val indices = if (indexNameContext.length > 0) '['+indexNameContext.join(",")+']' else ""
		
		'''«se.variable.name»«indices» = «se.expr.doSwitch»;'''
	}
//	
//	override caseUseEquation(UseEquation ue) {
//		val idom = if (ue.instantiationDomainExpr !== null && ue.instantiationDomain.nbDims > 0) 
//			'''over «ue.instantiationDomainExpr.printInstantiationDomain» : ''' else ''''''
//		
//		'''«idom»(«ue.outputExprs.map[doSwitch].join(", ")») = «ue.system.name»«ue.callParamsExpr.doSwitch»«ue.inputExprs.map[doSwitch].join(", ")»;'''
//	}
//	
//	/* AlphaExpression */
//	
	
	override caseDependenceExpression(DependenceExpression de) {
		if (de.expr instanceof ConstantExpression || de.expr instanceof VariableExpression) {
			'''«de.expr.doSwitch»«de.function.printFunction»'''
		} else {
			show.doSwitch(de)
		}
	}
	
	override caseIndexExpression(IndexExpression ie) {
		ie.function.printFunction
	}
	
	override protected printProjectionFunction(JNIISLMultiAff maff) {
		contextHistory.push(indexNameContext)
		
		indexNameContext = new LinkedList<String>(maff.space.getNameList(JNIISLDimType.isl_dim_in))
		
		super.printProjectionFunction(maff)
	}
	
	override protected printAbstractReduceExpression(AbstractReduceExpression are) {
		val res = super.printAbstractReduceExpression(are)
		
		indexNameContext = contextHistory.pop();
		
		return res;
	}
}