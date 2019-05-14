package alpha.model.interactive

import alpha.model.AbstractReduceExpression
import alpha.model.AutoRestrictExpression
import alpha.model.CaseExpression
import alpha.model.ReduceExpression
import alpha.model.RestrictExpression
import alpha.model.StandardEquation
import alpha.model.UseEquation
import alpha.model.analysis.reduction.ShareSpaceAnalysis
import alpha.model.analysis.reduction.ShareSpaceAnalysisResult
import alpha.model.matrix.MatrixOperations
import alpha.model.transformation.Normalize
import alpha.model.transformation.SplitUnionIntoCase
import alpha.model.transformation.reduction.Distributivity
import alpha.model.transformation.reduction.HigherOrderOperator
import alpha.model.transformation.reduction.Idempotence
import alpha.model.transformation.reduction.PermutationCaseReduce
import alpha.model.transformation.reduction.SameOperatorSimplification
import alpha.model.transformation.reduction.SimplifyingReductions
import alpha.model.util.AShow
import alpha.model.util.AffineFunctionOperations
import alpha.model.util.AlphaUtil
import fr.irisa.cairn.jnimap.isl.jni.JNIISLMultiAff
import java.util.HashSet
import java.util.LinkedList
import java.util.List
import org.eclipse.xtext.EcoreUtil2
import alpha.model.transformation.reduction.ReductionDecomposition
import alpha.model.transformation.reduction.NormalizeReduction

class SimplifyingReductionsExploration extends AbstractInteractiveExploration {

	protected STATE state = STATE.INITIAL
	protected AbstractReduceExpression targetRE
	
	protected List<String> commandHistory;
	
	private new(String filepath) {
		super(filepath);
	}
	
	static final def start(String filepath) {
		val sre = new SimplifyingReductionsExploration(filepath);
		SimplifyingReductionsExploration.SKIP_SINGLE_CHOICE_QUESTIONS = true
		sre.run();
	}

	override mainLoop() {
		SimplifyingReductionsExploration.SKIP_SINGLE_CHOICE_QUESTIONS = false
		while (state != STATE.EXIT) {
			try {
				commandHistory = new LinkedList();
				
				switch (state) {
					case INITIAL: {
						selectReduceExpression();
					}
					case REDUCTION_SELECTED: {
						expressionDomainCheck()
					}
					case SIDE_EFFECT_FREE_TRANSFORMATIONS: {
						sideEffectFreeTransformations();
					}
					case DP_STEP_TRANSFORMATIONS: {
						DPStepTransformations();
					}
					case EXIT: {
						//do nothing
					}
				}
				
				if (!commandHistory.isEmpty) {
					setProperty("state", state)
					setProperty("targetRE", targetRE)
					recordState(commandHistory)
				}
			} catch (RuntimeException re) {
				errStream.println("Exception: " + re.class);
				errStream.println(re.message);
				errStream.println("Restoring previous state.");
				restoreState
			}
		}
		
		outStream.println(AShow.print(currentSystem));
	}
	
	/**
	 * Lists all reductions in the selected SystemBody to work with.
	 * 
	 */
	private def selectReduceExpression() {
		val body = getCurrentBody();
		
		val candidates = EcoreUtil2.getAllContentsOfType(body, AbstractReduceExpression);
		
		val nbAREs = candidates.size();
		
		if (nbAREs == 0) {
			outStream.println("No more ReduceExpression left. Finishing exploration.");
			state = STATE.EXIT
			return;
		}
		
		val selected = if (nbAREs == 1 && SKIP_SINGLE_CHOICE_QUESTIONS) { 0 }
		else {
			outStream.println(AShow.print(body));
			outStream.println("");
			outStream.println("Select a ReduceExpression to work on:");
			for (i : 0..< nbAREs) {
				val are = candidates.get(i);
				outStream.println(String.format("%d: %s (in %s)", i, AShow.print(are), AlphaUtil.getContainerEquation(are).equationName));
			}
			acceptInteger(0, nbAREs)
		}
		
		targetRE = candidates.get(selected) 
		state = STATE.REDUCTION_SELECTED
		outStream.println(String.format("TargetReduction: %s", AShow.print(targetRE)));				
	}
	
	/**
	 * Once a reduction is selected, the basic assumptions must be checked.
	 *  - The expression domain of the reduction body is a single polyhedron.
	 *  - The ReduceExpression has trivial share space.
	 * 
	 * The latter is currently not checked; it only happens when the domain of 
	 * reduction body is unbounded.
	 */
	private def expressionDomainCheck() {
		val eqName = AlphaUtil.getContainerEquation(targetRE).equationName
		//expression ID must be obtained before transformation
		val exprID = targetRE.expressionID
		
		if (targetRE.body instanceof CaseExpression) {
			outStream.println("");
			outStream.println("Selected reduction has a CaseExpression as its body. Applying PermutationCaseReduce.")
			outStream.print("Press enter/return to continue...")
			inStream.readLine
			
			PermutationCaseReduce.apply(targetRE)
			state = STATE.INITIAL
			targetRE = null
			commandHistory.add(String.format("PermutationCaseReduce(GetExpression(body, %s, %s)", eqName, exprID))
			return;
		}
		
		if (targetRE.body.expressionDomain.nbBasicSets > 1) {
			outStream.println("");
			outStream.println("The expression domain of reduction body is not a single polyhedron. Applying SplitUnionIntoCase.");
			outStream.print("Press enter/return to continue...")
			inStream.readLine
			
			switch (targetRE.body) {
				RestrictExpression : {
					SplitUnionIntoCase.apply(targetRE.body as RestrictExpression)
				}
				AutoRestrictExpression : {
					SplitUnionIntoCase.apply(targetRE.body as AutoRestrictExpression)
				}
				default : {
					throw new UnsupportedOperationException("Expecting the body of reduction to be a restrict. The program may not be normalized.");
				}
			}
			
			state = STATE.INITIAL
			targetRE = null
			commandHistory.add(String.format("SplitUnionIntoCase(GetExpression(body, %s, %s)", eqName, exprID))
			return;
		}
		
		state = STATE.SIDE_EFFECT_FREE_TRANSFORMATIONS
	}
	
	/**
	 * Apply side-effect free SR enhancing transformations.
	 * This step is completely automatic. 
	 * 
	 */
	private def sideEffectFreeTransformations() {
		val eqName = AlphaUtil.getContainerEquation(targetRE).equationName
		//expression ID must be obtained before transformation
		val exprID = targetRE.body.expressionID
		
		//reduction decomposition without side-effect (not implemented)
		//same operator simplification
		val sosCount = SameOperatorSimplification.apply(targetRE)
		if (sosCount > 0) {
			outStream.println("");
			outStream.println(String.format("Applied SameOperatorSimplification: %s", AShow.print(targetRE)));
			outStream.print("Press enter/return to continue...")
			inStream.readLine
			
			state = STATE.INITIAL
			targetRE = null
			commandHistory.add(String.format("SameOperatorSimplification(GetExpression(body, %s, %s)", eqName, exprID))
			return;
		}
		//distributivity
		val distCount = Distributivity.apply(targetRE)
		if (distCount > 0) {
			outStream.println("");
			outStream.println(String.format("Applied Distributivity: %s", AShow.print(targetRE)));
			outStream.print("Press enter/return to continue...")
			inStream.readLine
			
			state = STATE.INITIAL
			targetRE = null
			commandHistory.add(String.format("Distributivity(GetExpression(body, %s, %s)", eqName, exprID))
			return
		}
		
		outStream.println("No side-effect free transformations to apply.");
		
		state = STATE.DP_STEP_TRANSFORMATIONS
	}
	
	/**
	 * Lists all possible DP step that can be taken. 
	 * 
	 */
	private def DPStepTransformations() {
		Normalize.apply(targetRE.body)
		
		val nbParams = targetRE.expressionDomain.nbParams
		val SSAR = ShareSpaceAnalysis.apply(targetRE)
		
		val options = new LinkedList<DPStepOption>();
		
		val vectors = SimplifyingReductions.generateCandidateReuseVectors(targetRE, SSAR);
		for (vec : vectors) {
			options.add(new DPStepSimplifyingReduction(vec, nbParams));
		}
		
		//Idempotent
		if (Idempotence.testLegality(targetRE, SSAR)) {
			options.add(new DPStepIdempotence());
		}
		
		//Higher-Order Operator
		if (HigherOrderOperator.testLegality(targetRE, SSAR)) {
			options.add(new DPStepHigherOrderOperator());
		}
		
		//Decomposition with side-effects
		options.addAll(SSAR.findDecompositionCandidates)
		
		//Default option: revert & finish
		options.add(new DPStepPrintShareSpace(SSAR));
		options.add(new DPStepBacktrack());
		options.add(new DPStepFinish());
		
		
		outStream.println("");
		outStream.println("Select an action:");
		for (i : 0..< options.size) {
			val opt = options.get(i);
			outStream.println(String.format("%d: %s", i, opt.description));
		}
		val selected = acceptInteger(0, options.size)
		performAction(options.get(selected));
	}
	
	private def dispatch performAction(DPStepSimplifyingReduction step) {
		if (!(targetRE.eContainer instanceof StandardEquation)) {
			val eqName = AlphaUtil.getContainerEquation(targetRE).equationName
			//expression ID must be obtained before transformation
			val exprID = targetRE.expressionID
		
			val eq = NormalizeReduction.apply(targetRE)
			commandHistory.add(String.format("NormalizeReduction(GetExpression(body, %s, %s)", eqName, exprID))
			targetRE = eq.expr as AbstractReduceExpression
		}

		val eqName = AlphaUtil.getContainerEquation(targetRE).equationName
		//expression ID must be obtained before transformation
		val exprID = targetRE.expressionID
		
		SimplifyingReductions.apply(targetRE as ReduceExpression, step.reuseDepNoParams);
		
		outStream.println(String.format("Applied SimplifyingReductions."));
		state = STATE.INITIAL
		targetRE = null
		commandHistory.add(String.format("SimplifyingReductions(GetExpression(body, %s, %s, \"%s\")", eqName, exprID, MatrixOperations.toString(step.reuseDepNoParams)))
		
	}
	
	private def dispatch performAction(DPStepIdempotence step) {
		val eqName = AlphaUtil.getContainerEquation(targetRE).equationName
		//expression ID must be obtained before transformation
		val exprID = targetRE.expressionID
		
		Idempotence.apply(targetRE);
		
		outStream.println("");
		outStream.println(String.format("Applied Idempotence: %s", AShow.print(targetRE)));
		outStream.print("Press enter/return to continue...")
		inStream.readLine
		
		state = STATE.INITIAL
		targetRE = null
		commandHistory.add(String.format("Idempotence(GetExpression(body, %s, %s)", eqName, exprID))
	}
	
	private def dispatch performAction(DPStepHigherOrderOperator step) {
		val eqName = AlphaUtil.getContainerEquation(targetRE).equationName
		//expression ID must be obtained before transformation
		val exprID = targetRE.expressionID
		
		HigherOrderOperator.apply(targetRE);
		
		outStream.println("");
		outStream.println(String.format("Applied HigherOrderOperator: %s", AShow.print(targetRE)));
		outStream.print("Press enter/return to continue...")
		inStream.readLine
		
		state = STATE.INITIAL
		targetRE = null
		commandHistory.add(String.format("HigherOrderOperator(GetExpression(body, %s, %s)", eqName, exprID))
	}
	
	private def dispatch performAction(DPStepReductionDecomposition step) {
		val eqName = AlphaUtil.getContainerEquation(targetRE).equationName
		//expression ID must be obtained before transformation
		val exprID = targetRE.expressionID
		
		ReductionDecomposition.apply(targetRE, step.innerProjection,  step.outerProjection);
		
		outStream.println("");
		outStream.println(String.format("Applied ReductionDecomposition: %s", AShow.print(targetRE)));
		outStream.print("Press enter/return to continue...")
		inStream.readLine
		
		state = STATE.INITIAL
		targetRE = null
		commandHistory.add(String.format("ReductionDecomposition(GetExpression(body, %s, %s, \"%s\", \"%s\")", eqName, exprID, step.innerProjection, step.outerProjection))
	}
	
	private def findDecompositionCandidates(ShareSpaceAnalysisResult SSAR) {
		val exprREs = SSAR.expressionsWithReuse
		val kerFp = MatrixOperations.transpose(AffineFunctionOperations.computeKernel(targetRE.projection))

		val REs = new HashSet<long[][]>();
		for (exprRE : exprREs) {
			val intersection = MatrixOperations.plainIntersection(exprRE.value, kerFp)
			if (intersection !== null)
				REs.add(intersection)
		}
		
		val candidates = new LinkedList<DPStepReductionDecomposition>();
		

		val params = targetRE.body.expressionDomain.parametersNames
		val indices = targetRE.body.expressionDomain.indicesNames		
		for (RE : REs) {
			val Fp = AffineFunctionOperations.constructAffineFunctionWithSpecifiedKernel(params, indices, RE);
			val Fpp = AffineFunctionOperations.projectFunctionDomain(targetRE.projection, Fp.copy)
			candidates.add(new DPStepReductionDecomposition(Fp, Fpp));
		}
		
		return candidates;
	}
	
	
	private def dispatch performAction(DPStepBacktrack step) {
		do {
			rollbackState
		} while (state != STATE.INITIAL && state != STATE.REDUCTION_SELECTED && state != STATE.DP_STEP_TRANSFORMATIONS)
	}
	private def dispatch performAction(DPStepFinish step) {
		state = STATE.EXIT
	}
	private def dispatch performAction(DPStepPrintShareSpace step) {
		outStream.println(step.SSAR);
	}
	
	private static enum STATE {
		INITIAL,
		REDUCTION_SELECTED,
		SIDE_EFFECT_FREE_TRANSFORMATIONS,
		DP_STEP_TRANSFORMATIONS,
		EXIT
	}
	
	override protected initProperties() {
		setProperty("state", STATE.INITIAL)
	}
	override protected reflectProperties() {
		state = if (getProperty("state") !== null) getProperty("state") as STATE else STATE.INITIAL;
		targetRE = if (getProperty("targetRE") !== null) getProperty("targetRE") as AbstractReduceExpression else null
	}
	
	private static abstract class DPStepOption {
	
		abstract def String description();
	}
	
	private static class DPStepSimplifyingReduction extends DPStepOption {
		long[] reuseDepNoParams;
		
		new(long[] reuseDep, int nbParams) {
			reuseDepNoParams = MatrixOperations.removeColumns(reuseDep, (0..<nbParams))
		}
		
		override description() {
			String.format("Apply SimplifyingReduction with: %s", MatrixOperations.toString(reuseDepNoParams));
		}
		
	}
	
	private static class DPStepIdempotence extends DPStepOption {
		
		override description() {
			String.format("Apply Idempotence");
		}
	}
	
	private static class DPStepHigherOrderOperator extends DPStepOption {
		
		override description() {
			String.format("Apply HigherOrderOperator");
		}
	}
	
	private static class DPStepReductionDecomposition extends DPStepOption {
		
		JNIISLMultiAff innerProjection
		JNIISLMultiAff outerProjection
		
		new(JNIISLMultiAff innerF, JNIISLMultiAff outerF) {
			innerProjection = innerF;
			outerProjection = outerF;
		}
		
		override description() {
			String.format("Apply ReductionDecomposition with %s o %s", outerProjection, innerProjection);
		}
	}
	
	private static class DPStepBacktrack extends DPStepOption {
		
		override description() {
			String.format("Revert to previous state.");
		}
	}
	
	private static class DPStepFinish extends DPStepOption {
		
		override description() {
			String.format("Finish exploration.");
		}
	}
	
	private static class DPStepPrintShareSpace extends DPStepOption {
		ShareSpaceAnalysisResult SSAR;
		new (ShareSpaceAnalysisResult SSAR) {
			this.SSAR = SSAR;
		}
		
		override description() {
			String.format("Print Share Space");
		}
	}
	
	////////////////
	private dispatch def getEquationName(StandardEquation eq) {
		eq.variable.name
	}
	
	private dispatch def getEquationName(UseEquation eq) {
		'''UseEquation'''
	}
}