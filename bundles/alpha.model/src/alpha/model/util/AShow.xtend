package alpha.model.util

import alpha.model.AbstractReduceExpression
import alpha.model.AlphaVisitable
import alpha.model.ConstantExpression
import alpha.model.ConvolutionExpression
import alpha.model.DependenceExpression
import alpha.model.IndexExpression
import alpha.model.StandardEquation
import alpha.model.VariableExpression
import fr.irisa.cairn.jnimap.isl.jni.JNIISLDimType
import fr.irisa.cairn.jnimap.isl.jni.JNIISLMultiAff
import fr.irisa.cairn.jnimap.isl.jni.JNIISLSet
import java.util.LinkedList
import java.util.List
import java.util.Stack
import alpha.model.UseEquation
import alpha.model.SelectExpression
import org.eclipse.xtext.EcoreUtil2

/**
 * AShow prints the given program in ArrayNotation.
 * 
 * It largely follows Show with two main differences:<ul>
 * <li>Domains and functions are printed with ArrayNotation that relies on context.</li>
 * <li>The available context information is tracked by overriding some of the cases.</li>
 * </ul>
 * 
 */
class AShow extends Show {
	
	protected List<String> indexNameContext;
	protected Stack<List<String>> contextHistory = new Stack
	
	//When AShow is not possible, switches to Show
	Show show = new Show
	
	static def <T extends AlphaVisitable> print(T av) {
		val ashow = new AShow();
		ashow.doSwitch(av).toString()
	}
	
	override protected printDomain(JNIISLSet set) {
		AlphaPrintingUtil.toAShowString(set, parameterContext, indexNameContext)
	}
	
	override printFunction(JNIISLMultiAff f) {
		AlphaPrintingUtil.toAShowString(f, indexNameContext)
	}
	
	
	
	/*
	 * CalculatorExpressions are printed differently depending on the context.
	 */
		
	override caseStandardEquation(StandardEquation se) {
		indexNameContext = se.variable.domain.indicesNames
		
		val indices = if (indexNameContext.length > 0) '['+indexNameContext.join(",")+']' else ""
		
		'''«se.variable.name»«indices» = «se.expr.doSwitch»;'''
	}
	
	
	override caseUseEquation(UseEquation ue) {
		val names = (ue.inputExprs + ue.outputExprs).map[e|e.contextDomain.indicesNames].maxBy[n|n.length]
		val idomDeclared = (ue.instantiationDomainExpr !== null && ue.instantiationDomain.nbDims > 0)


		val withNames = if (idomDeclared) 
							names.subList(ue.instantiationDomain.nbDims, names.length)
						else
							names
		
		val idom = if (idomDeclared) '''over «ue.instantiationDomain.printInstantiationDomain»''' else ''''''
		
		indexNameContext = names
		
		val callParam = ue.callParamsExpr.printSubsystemCallParams(ue.instantiationDomain)
		
		'''«idom» with [«withNames.join(",")»] : («ue.outputExprs.map[doSwitch].join(", ")») = «ue.system.name»«callParam»(«ue.inputExprs.map[doSwitch].join(", ")»);'''
	}
	
	/* AlphaExpression */
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
	
	override caseConvolutionExpression(ConvolutionExpression ce) {
		val kerDom = super.printDomain(ce.kernelDomain);
		
		contextHistory.push(indexNameContext)
		
		val copy = new LinkedList<String>(indexNameContext);
		copy.addAll(ce.kernelDomain.indicesNames);
		indexNameContext = copy;
		
		val res = '''conv(«kerDom», «ce.kernelExpression.doSwitch», «ce.dataExpression.doSwitch»)'''
		
		indexNameContext = contextHistory.pop();
		
		return res;
	}
	
	override caseSelectExpression(SelectExpression se) {
		contextHistory.push(indexNameContext)
		indexNameContext = se.selectRelation.rangeNames;
		
		val res = super.caseSelectExpression(se)
		
		indexNameContext = contextHistory.pop();
		
		return res;
	}
	
}