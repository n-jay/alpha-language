package alpha.model.transformation.reduction

import alpha.model.AbstractReduceExpression
import alpha.model.AlphaInternalStateConstructor
import alpha.model.AlphaSystem
import alpha.model.ReduceExpression
import alpha.model.StandardEquation
import alpha.model.SystemBody
import alpha.model.analysis.reduction.ShareSpaceAnalysisResult
import alpha.model.factory.AlphaUserFactory
import alpha.model.matrix.MatrixOperations
import alpha.model.transformation.Normalize
import alpha.model.transformation.PropagateSimpleEquations
import alpha.model.transformation.SimplifyExpressions
import alpha.model.util.AffineFunctionOperations
import alpha.model.util.AlphaOperatorUtil
import alpha.model.util.AlphaUtil
import java.util.ArrayList
import java.util.LinkedList
import java.util.function.Function
import org.eclipse.emf.ecore.util.EcoreUtil
import alpha.model.util.DomainOperations
import fr.irisa.cairn.jnimap.isl.ISLDimType
import fr.irisa.cairn.jnimap.isl.ISLMultiAff
import fr.irisa.cairn.jnimap.isl.ISLPoint
import fr.irisa.cairn.jnimap.isl.ISLSpace

class SimplifyingReductions {
	
	public static boolean DEBUG = false;

	/**
	 * Setting this variable to true disables all the
	 * post processing simplifications. Intended to be
	 * used for debugging purposes or to check the
	 * result of SR against the theorem in the paper. 
	 */
	public static boolean DISABLE_POST_PROCESSING = false;
	
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
	ISLMultiAff reuseDep;
	ISLMultiAff reuseDir;
	val AlphaSystem containerSystem;
	val SystemBody containerSystemBody;
	
	private new(ReduceExpression reduce, ISLMultiAff reuseDep) {
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
		
		if (targetReduce.body.contextDomain.nbIndices != reuseDep.nbInputs) {
			throw new RuntimeException("Given reuse dependence does not match the dimensionality of the reduction body.");
		}
		
		val kerQ = DomainOperations.kernelOfLinearPart(targetReduce.body.contextDomain)
		if (kerQ !== null) {
			throw new RuntimeException("The body of the target ReduceExpression has non-empty ker(Q); kernel of the linear part of the domain. This case is currently not handled.");
		}
	}
	
	static def void apply(ReduceExpression reduce, ISLMultiAff reuseDep) {
		val sr = new SimplifyingReductions(reduce, reuseDep);
		sr.simplify
	}
	
	static def void apply(ReduceExpression reduce, int[] reuseDepNoParams) {
		apply(reduce, reuseDepNoParams.map[v|v as long])
	}
	static def void apply(ReduceExpression reduce, long[] reuseDepNoParams) {
		val space = ISLSpace.idMapDimFromSetDim(reduce.body.expressionDomain.space.copy)
		val reuseDep = MatrixOperations.bindVector(newLongArrayOfSize(space.nbParams), reuseDepNoParams);
		val maff = AffineFunctionOperations.createUniformFunction(space.copy, reuseDep);
		
		apply(reduce, maff);
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
			AlphaInternalStateConstructor.recomputeContextDomain(XaddEq)
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
			AlphaInternalStateConstructor.recomputeContextDomain(XsubEq)
		}
		
		
		//Creating the main CaseExpression of the transformed reduction
		val mainCaseExpr = AlphaUserFactory.createCaseExpression
		
		//common expressions
		val binaryOp = AlphaOperatorUtil.reductionOPtoBinaryOP(targetReduce.operator)
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
			val invOp = AlphaOperatorUtil.reductionOPtoBinaryInverseOP(targetReduce.operator)
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
		AlphaInternalStateConstructor.recomputeContextDomain(reductionEquation)
		
		if (!DISABLE_POST_PROCESSING) {
			SimplifyExpressions.apply(containerSystemBody)
			Normalize.apply(containerSystemBody)
			PropagateSimpleEquations.apply(containerSystemBody)
			Normalize.apply(containerSystemBody)
		}
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
		val nbParams = reuseDep.domainSpace.nbParams

		var point = ISLPoint.buildZero(reuseDep.domainSpace);

		for (d : 0..<b.size) {
			val dimType = if (d < nbParams) ISLDimType.isl_dim_param else ISLDimType.isl_dim_set
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
		
		
		val projectedB = new ArrayList<Long>(nbParams+targetReduce.projection.nbOutputs)
		for (d : 0..<nbParams) projectedB.add(0l); //implicit parameter dims
		for (aff : targetReduce.projection.affs) {
			projectedB.add(aff.eval(point.copy).asLong)
		}

		val domSpace = reductionEquation.variable.domain.space
		val space = ISLSpace.idMapDimFromSetDim(domSpace)
		val f = AffineFunctionOperations.createUniformFunction(space, projectedB)
		
		AlphaUtil.renameIndices(f, reductionEquation.variable.domain.indexNames)
	}
	
	/**
	 * Creates a list of JNIISLMultiAff that are valid reuse vectors given the share space.
	 * Exposed to be used by SimplifyingReductionExploration.
	 * 
	 */
	static def generateCandidateReuseVectors(AbstractReduceExpression are, ShareSpaceAnalysisResult SSAR) {
		val vectors = new LinkedList<long[]>();
		
		val areSS = SSAR.getShareSpace(are.body)
		if (areSS === null)
			return vectors;
			
		val kerFp = MatrixOperations.transpose(AffineFunctionOperations.computeKernel(are.projection))
		
		if (MatrixOperations.plainIntersection(areSS, kerFp) !== null) {
			return vectors;
		}
		
		for (row : areSS) {
			vectors.add(MatrixOperations.scalarMultiplication(row, -1));
			vectors.add(row);
		}
		
		return vectors;
	}
}