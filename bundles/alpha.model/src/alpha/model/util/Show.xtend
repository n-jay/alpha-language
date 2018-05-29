package alpha.model.util

import alpha.model.AlphaConstant
import alpha.model.AlphaPackage
import alpha.model.AlphaRoot
import alpha.model.AlphaSystem
import alpha.model.AlphaVisitable
import alpha.model.CalculatorExpression
import alpha.model.ExternalFunction
import alpha.model.Imports
import alpha.model.JNIDomain
import alpha.model.StandardEquation
import alpha.model.UseEquation
import alpha.model.Variable
import fr.irisa.cairn.jnimap.runtime.JNIObject
import alpha.model.JNIFunction
import alpha.model.JNIFunctionInArrayNotation
import alpha.model.IfExpression
import alpha.model.RestrictExpression
import alpha.model.JNIDomainInArrayNotation
import alpha.model.AutoRestrictExpression
import alpha.model.CaseExpression
import alpha.model.DependenceExpression
import fr.irisa.cairn.jnimap.isl.jni.JNIISLMultiAff
import alpha.model.IndexExpression
import alpha.model.ReduceExpression
import alpha.model.ExternalReduceExpression
import alpha.model.ArgReduceExpression
import alpha.model.ExternalArgReduceExpression
import alpha.model.ConvolutionExpression
import alpha.model.SelectExpression
import alpha.model.BinaryExpression
import alpha.model.MultiArgExpression
import alpha.model.ExternalMultiArgExpression
import alpha.model.UnaryExpression
import alpha.model.VariableExpression
import alpha.model.BooleanExpression
import alpha.model.IntegerExpression
import alpha.model.RealExpression
import alpha.model.BinaryCalculatorExpression
import alpha.model.UnaryCalculatorExpression
import alpha.model.VariableDomain
import alpha.model.RectangularDomain
import org.eclipse.xtext.build.Indexer.IndexResult
import alpha.model.DefinedObject

class Show extends ModelSwitch<String> {

	public static def <T extends AlphaVisitable> print(T av) {
		val show = new Show();
		show.doSwitch(av)
	}

	/*
	 * CalculatorExpressions are printed differently depending on the context.
	 */
	
	protected def printParameterDomain(JNIDomain dom) {
		dom.islString
	}
	
	protected def printUECallParams(JNIFunctionInArrayNotation f) {
		f.alphaString
	}
	
	protected def printInstantiationDomain(CalculatorExpression dom) {
		AlphaUtil.islSetToShowString(dom.ISLObject)
	}
	
	protected def printWhileDomain(CalculatorExpression dom) {
		AlphaUtil.islSetToShowString(dom.ISLObject)
	}
	
	protected def printDomain(CalculatorExpression dom) {
		AlphaUtil.islSetToShowString(dom.ISLObject)
	}
	
	protected def printFunction(JNIISLMultiAff f) {
		AlphaUtil.toShowString(f)
	}
	
	protected def printRelation(CalculatorExpression rel) {
		rel.ISLObject.toString
	}
	

	override caseAlphaRoot(AlphaRoot root) {
		root.elements.map[doSwitch].join("\n");
	}

	override caseAlphaConstant(AlphaConstant ac) {
		'''constant «ac.name» = «ac.value»'''
	}

	override caseExternalFunction(ExternalFunction ef) {
		'''external «ef.name»(«ef.cardinality»)'''
	}

	override caseImports(Imports i) {
		'''import «i.importedNamespace»'''
	}

	override caseAlphaPackage(AlphaPackage ap) {
		'''
			package «ap.name» {
				«ap.elements.map[doSwitch].join("\n")»
			}
			
		'''
	}

	override caseAlphaSystem(AlphaSystem s) {
//	No define in Show syntax
//				«IF !s.definedObjects.isEmpty»
//					define
//						«s.definedObjects.map[doSwitch].join("\n")»
//				«ENDIF»
		'''
			affine «s.name» «s.parameterDomainExpr.printParameterDomain»
				«IF !s.inputs.isEmpty»
					inputs
						«s.inputs.map[doSwitch].join("\n")»
				«ENDIF»
				«IF !s.outputs.isEmpty»
					outputs
						«s.outputs.map[doSwitch].join("\n")»
				«ENDIF»
				«IF !s.locals.isEmpty»
					locals
						«s.locals.map[doSwitch].join("\n")»
				«ENDIF»
				«IF s.whileDomainExpr !== null»
					over «s.whileDomainExpr.printInstantiationDomain» while («s.testExpression.doSwitch»)
				«ENDIF»
				«IF !s.useEquations.isEmpty || !s.equations.isEmpty»
					let
						«(s.useEquations + s.equations).map[doSwitch].join("\n\n")»
				«ENDIF»
			.
		'''
	}

	override caseVariable(Variable v) {
		'''«v.name» : «v.domainExpr.printDomain»'''
	}
		
	override caseStandardEquation(StandardEquation se) {
		'''«se.variable.name» = «se.expr.doSwitch»;'''
	}
	
	override caseUseEquation(UseEquation ue) {
		val idom = if (ue.instantiationDomainExpr !== null && ue.instantiationDomain.nbDims > 0) 
			'''over «ue.instantiationDomainExpr.printInstantiationDomain» : ''' else ''''''
		
		'''«idom»(«ue.outputExprs.map[doSwitch].join(", ")») = «ue.system.name»«ue.callParamsExpr.doSwitch»«ue.inputExprs.map[doSwitch].join(", ")»;'''
	}
	
	/* AlphaExpression */
	
	override caseIfExpression(IfExpression ie) {
		'''if «ie.condExpr.doSwitch» then «ie.thenExpr.doSwitch» else «ie.elseExpr.doSwitch»'''
	}
	
	override caseRestrictExpression(RestrictExpression re) {
		val domStr = if (re.domainExpr instanceof JNIDomain || re.domainExpr instanceof JNIDomainInArrayNotation)
		re.domainExpr.printDomain else '''{«re.domainExpr.printDomain»}''' 
			
		'''«domStr» : «re.expr.doSwitch»'''
	}
	
	override caseAutoRestrictExpression(AutoRestrictExpression are) {
		'''auto : «are.expr.doSwitch»'''
	}
	
	override caseCaseExpression(CaseExpression ce) {
		'''
			case «IF ce.name !== null»«ce.name»«ENDIF» {
				«ce.exprs.join("", ";\n", ";", [e|e.doSwitch])»
			}'''
	}

	override caseDependenceExpression(DependenceExpression de) {
		'''«de.function.printFunction»@«de.expr.doSwitch»'''
	}
	
	override caseIndexExpression(IndexExpression ie) {
		'''val «ie.function.printFunction»'''
	}
	
	override caseReduceExpression(ReduceExpression re) {
		'''reduce(«re.operator», «re.projection.printFunction», «re.body.doSwitch»)'''
	}
	
	override caseExternalReduceExpression(ExternalReduceExpression ere) {
		'''reduce(«ere.externalFunction.name», «ere.projection.printFunction», «ere.body.doSwitch»)'''
	}
	
	override caseArgReduceExpression(ArgReduceExpression re) {
		'''argreduce(«re.operator», «re.projection.printFunction», «re.body.doSwitch»)'''
	}
	
	override caseExternalArgReduceExpression(ExternalArgReduceExpression ere) {
		'''argreduce(«ere.externalFunction.name», «ere.projection.printFunction», «ere.body.doSwitch»)'''
	}
	
	override caseConvolutionExpression(ConvolutionExpression ce) {
		'''conv(«ce.kernelDomainExpr.printDomain», «ce.kernelExpression.doSwitch», «ce.dataExpression.doSwitch»)'''
	}
	
	override caseSelectExpression(SelectExpression se) {
		'''select «se.relationExpr.printRelation» from «se.expr.doSwitch»'''
	}
	
	override caseBinaryExpression(BinaryExpression be) {
		'''(«be.left.doSwitch» «be.operator» «be.right.doSwitch»)'''
	}
	
	override caseMultiArgExpression(MultiArgExpression  mae) {
		'''«mae.operator»(«mae.exprs.map[doSwitch].join(", ")»)'''
	}
	
	override caseExternalMultiArgExpression(ExternalMultiArgExpression  emae) {
		'''«emae.externalFunction.name»(«emae.exprs.map[doSwitch].join(", ")»)'''
	}
	
	override caseUnaryExpression(UnaryExpression ue) {
		'''«ue.operator» «ue.expr.doSwitch»'''
	}
	
	override caseVariableExpression(VariableExpression ve) {
		ve.variable.name
	}
	
	override caseBooleanExpression(BooleanExpression be) {
		be.value.toString
	}
	
	override caseIntegerExpression(IntegerExpression ie) {
		ie.value.toString
	}
	
	override caseRealExpression(RealExpression re) {
		re.value.toString
	}
	
	/* CalculatorExpression */
	override caseBinaryCalculatorExpression(BinaryCalculatorExpression bce) {
		'''(«bce.left.doSwitch» «bce.operator» «bce.right.doSwitch»)'''
	}
	
	override caseUnaryCalculatorExpression(UnaryCalculatorExpression uce) {
		'''«uce.operator» «uce.expr.doSwitch»)'''
	}
	
	override caseVariableDomain(VariableDomain vd) {
		'''{ «vd.variable.name» }'''
	}
	
	override caseRectangularDomain(RectangularDomain rd) {
		val inames = if (rd.indexNames !== null && rd.indexNames.length == rd.upperBounds.length)
		'''as [«rd.indexNames.join(",")»]''' else '''''' 
		'''[«rd.upperBounds.join(",")»] «inames»'''
	}
	
	override caseDefinedObject(DefinedObject dobj) {
		dobj.object.name
	}
	
	override caseJNIDomain(JNIDomain dom) {
		dom.islString
	}
	
	override caseJNIDomainInArrayNotation(JNIDomainInArrayNotation dom) {
		dom.ISLSet.basicSets.join("","","",[bs|bs.constraints.map[c|c.aff.toString].join("and")])
	}
	
}
