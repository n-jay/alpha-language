package alpha.model.transformation

import alpha.model.ReduceExpression
import alpha.model.StandardEquation
import alpha.model.util.AlphaUtil
import fr.irisa.cairn.jnimap.isl.jni.JNIISLDimType
import fr.irisa.cairn.jnimap.isl.jni.JNIISLMultiAff
import fr.irisa.cairn.jnimap.isl.jni.JNIISLPoint
import java.util.ArrayList
import alpha.model.util.AffineFunctionOperations
import fr.irisa.cairn.jnimap.isl.jni.JNIISLSpace
import alpha.model.factory.AlphaUserFactory
import org.eclipse.emf.ecore.util.EcoreUtil
import java.util.function.Function
import alpha.model.AlphaSystem
import alpha.model.SystemBody
import alpha.model.BINARY_OP
import alpha.model.REDUCTION_OP
import alpha.model.ExpressionDomainCalculator
import alpha.model.ContextDomainCalculator

class SimplifyingReductions {
	
	public static boolean DEBUG = false;
	
	public static Function<SimplifyingReductions, String> defineXaddEquationName = [sr|
		val origName = sr.reductionEquation.variable.name
		var XaddName = origName + "_add"

		AlphaUtil.duplicateNameResolver.apply(sr.containerSystem, XaddName, "_")
	]
	
	public static Function<SimplifyingReductions, String> defineXsubEquationName = [sr|
		val origName = sr.reductionEquation.variable.name
		var XaddName = origName + "_sub"

		AlphaUtil.duplicateNameResolver.apply(sr.containerSystem, XaddName, "_")
	]
	
	def void debug(String msg) {
		if (DEBUG)
			println("[SimplifyingReductions] " + msg)
	}
		
	ReduceExpression targetReduce;
	StandardEquation reductionEquation
	JNIISLMultiAff reuseDep;
	JNIISLMultiAff reuseDir;
	val AlphaSystem containerSystem;
	val SystemBody containerSystemBody;
	
	private new(ReduceExpression reduce, JNIISLMultiAff reuseDep) {
		targetReduce = reduce;
		this.reuseDep = reuseDep;
		containerSystem = AlphaUtil.getContainerSystem(targetReduce)
		containerSystemBody = AlphaUtil.getContainerSystemBody(targetReduce)
	}
	
	def void basicTests() {
		if (targetReduce.contextDomain.nbBasicSets > 1) {
			throw new RuntimeException("The context of the reduction body must be a single polyhedron.");
		}
		
		if (!(targetReduce.eContainer instanceof StandardEquation)) {
			throw new RuntimeException("The target ReduceExpression must be a direct child of a StandardEquation. Apply NormalizeReductions first.");
		}
		
		if (targetReduce.body.contextDomain.nbDims != reuseDep.getNbDims(JNIISLDimType.isl_dim_in)) {
			throw new RuntimeException("Given reuse dependence does not match the dimensionality of the reduction body.");
		}
	}
	
	static def void apply(ReduceExpression reduce, JNIISLMultiAff reuseDep) {
		val sr = new SimplifyingReductions(reduce, reuseDep);
		sr.simplify
	}
	
	protected def void simplify() {
		basicTests();
		reductionEquation = (AlphaUtil.getContainerEquation(targetReduce) as StandardEquation)
		
		val targetVariable = reductionEquation.variable
		
		debug("ReuseDependence : " + reuseDep);
		
		reuseDir = AffineFunctionOperations.negateUniformFunction(reuseDep);
		debug("ReuseDirection  : " + reuseDir);
		
		val reuseDepProjected = constructDependenceFunctionInAnswerSpace
		debug("ReuseDepProjected: "+ reuseDepProjected);
		
		if (reuseDepProjected.isIdentity) {
			throw new RuntimeException("The reuse dependence is in the kernel of the projection function.");
		}
		
		//Find Dadd, Dsub, Dinit
		val origDE = targetReduce.body.contextDomain
		debug("DE  : "+ origDE);
		
		//E' is the translation of the original domain by reuse vector
		val DEp    = origDE.copy.apply(reuseDir.toMap)
		debug("DE' : "+ DEp);
		
		//Dadd = proj (DE - DE')
		val Dadd   = origDE.copy.subtract(DEp.copy).apply(targetReduce.projection.toMap).intersect(targetVariable.domain)
		debug("Dadd: "+ Dadd);
		
		//Dsub = proj (DE' - DE)
		val Dsub   = DEp.copy.subtract(origDE.copy).apply(targetReduce.projection.toMap).intersect(targetVariable.domain)
		debug("Dsub: "+ Dsub);
		
		//Dint = proj (DE ^ DE')
		val Dint  = origDE.copy.intersect(DEp.copy).apply(targetReduce.projection.toMap).intersect(targetVariable.domain)
		debug("Dint: "+ Dint);
		
		if (Dint.isEmpty) {
			throw new RuntimeException("Initialization domain is empty; input reuse vector is invalid.");
		}
		
		//Xadd = reduce( op, proj, (DE - DE') : E )
		val XaddName = defineXaddEquationName.apply(this)
		{
			val restrictDom = origDE.copy.subtract(DEp.copy)
			val restrictExpr = AlphaUserFactory.createRestrictExpression(restrictDom, EcoreUtil.copy(targetReduce.body))
			val Xadd = AlphaUserFactory.createReduceExpression(targetReduce.operator, targetReduce.projection, restrictExpr);
			
			val XaddDom = restrictDom.copy.apply(targetReduce.projection.toMap)
			val XaddVar = AlphaUserFactory.createVariable(XaddName, XaddDom)
			val XaddEq = AlphaUserFactory.createStandardEquation(XaddVar, Xadd);
			containerSystem.locals.add(XaddVar)
			containerSystemBody.equations.add(XaddEq)
			
			ExpressionDomainCalculator.calculate(XaddEq)
			ContextDomainCalculator.calculate(XaddEq)
		}
		
		//Xsub = reduce( op, proj, proj^-1(Dint) : (DE - DE') : E )
		val XsubName = defineXsubEquationName.apply(this)
		if (!Dsub.isEmpty) {
			val restrictDom = DEp.copy.subtract(origDE.copy)
			val DintPreimage = Dint.copy.preimage(targetReduce.projection)
			val depExpr = AlphaUserFactory.createDependenceExpression(reuseDep.copy, EcoreUtil.copy(targetReduce.body))
			val innerRestrict = AlphaUserFactory.createRestrictExpression(restrictDom, depExpr)
			val outerRestrict = AlphaUserFactory.createRestrictExpression(DintPreimage, innerRestrict)
			val Xsub = AlphaUserFactory.createReduceExpression(targetReduce.operator, targetReduce.projection, outerRestrict);
			
			val XsubDom = restrictDom.copy.apply(targetReduce.projection.toMap).intersect(Dint.copy)
			val XsubVar = AlphaUserFactory.createVariable(XsubName, XsubDom)
			val XsubEq = AlphaUserFactory.createStandardEquation(XsubVar, Xsub);
			containerSystem.locals.add(XsubVar)
			containerSystemBody.equations.add(XsubEq)
			
			ExpressionDomainCalculator.calculate(XsubEq)
			ContextDomainCalculator.calculate(XsubEq)
		}
		
		
		//Creating the main CaseExpression of the transformed reduction
		val mainCaseExpr = AlphaUserFactory.createCaseExpression
		
		//common expressions
		val binaryOp = reductionOPtoBinaryOP(targetReduce.operator)
		val XaddRef = AlphaUserFactory.createVariableExpression(containerSystem.getVariable(XaddName))
		val Xref = AlphaUserFactory.createVariableExpression(reductionEquation.variable)
		//Xreuse = projectedReuse @ X
		val reuseExpr = AlphaUserFactory.createDependenceExpression(reuseDepProjected.copy, Xref)
		
		//Case 1
		// (Dadd - Dint) : Xadd
		{
			val restrictDom = Dadd.copy.subtract(Dint.copy)
			val branch1expr = AlphaUserFactory.createRestrictExpression(restrictDom, EcoreUtil.copy(XaddRef));
			
			mainCaseExpr.exprs.add(branch1expr)
		}
		
		//Case 2
		// (Dint - (Dadd V Dsub)) : Xreuse
		{
			val restrictDom = Dint.copy.subtract(Dadd.copy.union(Dsub.copy))
			val branch2expr = AlphaUserFactory.createRestrictExpression(restrictDom, EcoreUtil.copy(reuseExpr));
			
			mainCaseExpr.exprs.add(branch2expr)
		}
		
		//Case 3
		// (Dadd ^ (Dint - Dsub)) : Xadd + Xreuse
		{
			val restrictDom = Dadd.copy.intersect(Dint.copy.subtract(Dsub.copy))
			val binaryExpr = AlphaUserFactory.createBinaryExpression(binaryOp, EcoreUtil.copy(XaddRef), EcoreUtil.copy(reuseExpr))
			val branch3expr = AlphaUserFactory.createRestrictExpression(restrictDom, binaryExpr);
			
			mainCaseExpr.exprs.add(branch3expr)
		}
		
		//Cases 4 and 5 are only when subtraction is necessary 
		if (!Dsub.isEmpty) {
			val invOp = reductionOPtoBinaryInverseOP(targetReduce.operator)
			val XsubRef = AlphaUserFactory.createVariableExpression(containerSystem.getVariable(XsubName))
			//Case 4
			// (Dsub ^ (Dint - Dadd)) : Xreuse - Xsub
			{
				val restrictDom = Dsub.copy.intersect(Dint.copy.subtract(Dadd.copy))
				val binaryExpr = AlphaUserFactory.createBinaryExpression(invOp, EcoreUtil.copy(reuseExpr),  EcoreUtil.copy(XsubRef))
				val branch4expr = AlphaUserFactory.createRestrictExpression(restrictDom, binaryExpr);
				
				mainCaseExpr.exprs.add(branch4expr)
			}
			
			//Case 5
			// (Dadd ^ Dint ^ Dsub) : Xadd + Xreuse - Xsub
			{
				val restrictDom = Dadd.copy.intersect(Dint.copy.intersect(Dsub.copy))
				val binaryExprAdd = AlphaUserFactory.createBinaryExpression(binaryOp, XaddRef, reuseExpr)
				val binaryExprSub = AlphaUserFactory.createBinaryExpression(invOp, binaryExprAdd,  XsubRef)
				val branch5expr = AlphaUserFactory.createRestrictExpression(restrictDom, binaryExprSub);
				
				mainCaseExpr.exprs.add(branch5expr)
			}
		}
		
		EcoreUtil.replace(targetReduce, mainCaseExpr)
		
		ExpressionDomainCalculator.calculate(reductionEquation)
		ContextDomainCalculator.calculate(reductionEquation)
	}
	
	/**
	 * The reuse dependence is specified in the space of reduction body,
	 * but the actual dependence will be among the reduction instance.
	 * Thus, the projection of the reuse must be computed.
	 * 
	 * In this method, this process is implemented as evaluating the 
	 * constant vector representing the uniform reuse dependence by
	 * the projection function, and then reconstructing the uniform
	 * function from the result of the evaluation.
	 */
	private def constructDependenceFunctionInAnswerSpace() {
		val b = AffineFunctionOperations.getConstantVector(reuseDep)
		val nbParams = reuseDep.domainSpace.getNbDims(JNIISLDimType.isl_dim_param)

		var point = JNIISLPoint.buildZero(reuseDep.domainSpace);

		for (d : 0..<b.size) {
			val dimType = if (d < nbParams) JNIISLDimType.isl_dim_param else JNIISLDimType.isl_dim_set
			val pos = if (d < nbParams) d else d-nbParams
			val v = b.get(d).intValue
			//FIXME a bit strange due to add/sub taking unsigned int. Update to use ISL_Val 
			if (v >= 0) {
				point = point.add(dimType, pos, v);
			} else {
				point = point.sub(dimType, pos, -v);
			}
		}
		
		//FIXME
		//There is a bug in ISL (already fixed) that makes the ISL_Val version not work.
		// Use the following code when ISL 0.21 is released 
//			for (d : 0..<b.size) {
//				val dimType = if (d < nbParams) JNIISLDimType.isl_dim_param else JNIISLDimType.isl_dim_set
//				val pos = if (d < nbParams) d else d-nbParams
//				
//				val v = JNIISLVal.buildFromLong(JNIISLContext.ctx, b.get(d))
//				point = point.setCoordinate(dimType, pos, v);
//			}
		
		
		val projectedB = new ArrayList<Long>(nbParams+targetReduce.projection.nbAff)
		for (d : 0..<nbParams) projectedB.add(0l); //implicit parameter dims
		for (aff : targetReduce.projection.affs) {
			projectedB.add(aff.eval(point.copy).asLong)
		}

		val space = JNIISLSpace.idMapDimFromSetDim(reductionEquation.variable.domain.space)
		val f = AffineFunctionOperations.createUniformFunction(space, projectedB)
		
		AlphaUtil.renameIndices(f, reductionEquation.variable.domain.indicesNames)
	}
	
	private static def BINARY_OP reductionOPtoBinaryOP(REDUCTION_OP op) {
		switch (op) {
			case MIN: { BINARY_OP.MIN }
			case MAX: { BINARY_OP.MAX }
			case PROD: { BINARY_OP.MUL }
			case SUM: { BINARY_OP.ADD } 
			case AND: { BINARY_OP.AND }
			case OR: { BINARY_OP.OR }
			case XOR: { BINARY_OP.XOR }
			case EX: {
				throw new RuntimeException("[SimplifyingReductions] Reductions with external functions are not yet handled.");
			}
			
		}
	}
	
	private static def BINARY_OP reductionOPtoBinaryInverseOP(REDUCTION_OP op) {
		switch (op) {
			case MIN,
			case MAX, 
			case AND,
			case OR,
			case XOR: { 
				throw new RuntimeException("[SimplifyingReductions] Operator does not have an inverse.");
			}
			case PROD: { BINARY_OP.DIV }
			case SUM: { BINARY_OP.SUB }
			case EX: {
				throw new RuntimeException("[SimplifyingReductions] Reductions with external functions are not yet handled.");
			}
			
		}
	}
}