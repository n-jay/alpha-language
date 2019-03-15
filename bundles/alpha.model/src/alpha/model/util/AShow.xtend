package alpha.model.util

import alpha.model.AbstractReduceExpression
import alpha.model.AlphaCompleteVisitable
import alpha.model.ConstantExpression
import alpha.model.ConvolutionExpression
import alpha.model.DependenceExpression
import alpha.model.IndexExpression
import alpha.model.SelectExpression
import alpha.model.StandardEquation
import alpha.model.UseEquation
import alpha.model.VariableExpression
import com.google.common.collect.Streams
import fr.irisa.cairn.jnimap.isl.jni.JNIISLDimType
import fr.irisa.cairn.jnimap.isl.jni.JNIISLMultiAff
import fr.irisa.cairn.jnimap.isl.jni.JNIISLSet
import java.util.LinkedList
import java.util.List
import java.util.Stack
import org.eclipse.emf.ecore.EObject
import alpha.model.AlphaSystemElement
import alpha.model.AlphaExpressionVisitable

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
	
	//This variable is used to stop the visiting once it is encountered.
	//It's use is to support printing of sub-trees. First pass visits from the container system
	// to the target while collecting context information. Then the second pass uses the 
	// collected context to print the target sub-tree.
	final AlphaCompleteVisitable haltTarget;
	List<String> indexNameContextWhenHalted;
	
	//When AShow is not possible, switches to Show
	Show show = new Show
	
	private new() { haltTarget = null }
	private new(AlphaCompleteVisitable target) { haltTarget = target }
	
	static def print(AlphaCompleteVisitable av) {
		val ashow = new AShow();
		
		if (av instanceof AlphaSystemElement || av instanceof AlphaExpressionVisitable) {
			val contextCollector = new AShow(av);
			contextCollector.doSwitch(AlphaUtil.getContainerSystem(av))
			ashow.parameterContext = contextCollector.parameterContext
			ashow.indexNameContext = contextCollector.indexNameContextWhenHalted
			
			//If AShow already failed
			if (ashow.indexNameContext === null) {
				return new Show().doSwitch(av).toString
			}
		}
		
		ashow.doSwitch(av).toString()
	}
	
	override doSwitch(EObject obj) {
		if (haltTarget !== null && haltTarget === obj) {
			indexNameContextWhenHalted = new LinkedList<String>(indexNameContext)
			''''''
		} else {
			super.doSwitch(obj)
		}
	}
	
	override protected printDomain(JNIISLSet set) {
		AlphaPrintingUtil.toAShowString(set, parameterContext, indexNameContext)
	}
	
	override printFunction(JNIISLMultiAff f) {
		AlphaPrintingUtil.toAShowString(f, indexNameContext)
	}
	
	protected def printDomainInShowSytanxWithIndexNameContext(JNIISLSet set) {
		AlphaPrintingUtil.toShowString(set, parameterContext, indexNameContext)
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

		val kernelDomainNames = ce.kernelDomain.indicesNames

		//when domain names conflict, give default names
		val conflict = Streams.zip(indexNameContext.stream, kernelDomainNames.stream, [e1,e2|e1.contentEquals(e2)]).reduce([b1,b2|b1||b2])
		var List<String> printCtx
		if (conflict.present && conflict.get) {
			printCtx = 	(ce.contextDomain.nbDims..<ce.contextDomain.nbDims+ce.kernelDomain.nbDims).map[i|"i"+i].toList
		} else {
			printCtx = kernelDomainNames
		}

		contextHistory.push(indexNameContext)
		val newCtx = new LinkedList<String>(indexNameContext);
		newCtx.addAll(printCtx);
		
		indexNameContext = printCtx
		val kerDom = printDomainInShowSytanxWithIndexNameContext(ce.kernelDomain);
		
		indexNameContext = newCtx;
		
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