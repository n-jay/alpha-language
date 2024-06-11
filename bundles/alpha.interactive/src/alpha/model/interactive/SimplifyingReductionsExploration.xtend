package alpha.model.interactive

import alpha.model.AbstractReduceExpression
import alpha.model.AlphaExpression
import alpha.model.AutoRestrictExpression
import alpha.model.CaseExpression
import alpha.model.ReduceExpression
import alpha.model.RestrictExpression
import alpha.model.StandardEquation
import alpha.model.UseEquation
import alpha.model.Variable
import alpha.model.VariableExpression
import alpha.model.analysis.reduction.ShareSpaceAnalysis
import alpha.model.analysis.reduction.ShareSpaceAnalysisResult
import alpha.model.matrix.MatrixOperations
import alpha.model.transformation.Normalize
import alpha.model.transformation.SimplifyExpressions
import alpha.model.transformation.SplitUnionIntoCase
import alpha.model.transformation.SubstituteByDef
import alpha.model.transformation.reduction.Distributivity
import alpha.model.transformation.reduction.HigherOrderOperator
import alpha.model.transformation.reduction.Idempotence
import alpha.model.transformation.reduction.NormalizeReduction
import alpha.model.transformation.reduction.PermutationCaseReduce
import alpha.model.transformation.reduction.ReductionComposition
import alpha.model.transformation.reduction.ReductionDecomposition
import alpha.model.transformation.reduction.SameOperatorSimplification
import alpha.model.transformation.reduction.SimplifyingReductions
import alpha.model.util.AShow
import alpha.model.util.AlphaPrintingUtil
import alpha.model.util.AlphaUtil
import fr.irisa.cairn.jnimap.barvinok.BarvinokFunctions
import fr.irisa.cairn.jnimap.isl.ISLMultiAff
import java.util.LinkedList
import java.util.List
import org.eclipse.xtext.EcoreUtil2
import alpha.model.analysis.reduction.CandidateReuse

/**
 * Interactive exploration of Simplifying Reductions.
 * 
 * This is designed to be an interactive alternative to the optimality
 * algorithm in the paper based on dynamic programming. Instead of 
 * using DP to enumerate the possible space, the user navigates through
 * the exploration space. The user may also rollback and explore a
 * different path when necessary.
 * 
 * It does not fully implement the original algorithm in the SR paper.
 * There are a few steps that are mostly for reductions with unbounded
 * domain, which have not been implemented.
 * 
 */
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
						StepTransformations();
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
				re.printStackTrace
				errStream.println("Restoring previous state.");
				restoreState
			}
		}
		
		outStream.println("Final program:");
		outStream.println(AShow.print(currentSystem));
		outStream.println("");
		outStream.print("Press enter/return to output transformation script")
		inStream.readLine
	
		outStream.println();
		outStream.println("import groovy.transform.BaseScript");
		outStream.println("@BaseScript alpha.commands.groovy.AlphaScript alphaScript");
		outStream.println();
		for (String c : getCommandSequence()) {
			outStream.println(c);
		}
		outStream.println();
		outStream.println("CheckProgram(root)");
		outStream.println("AShow(system)");
		outStream.println();
	}
	
	/**
	 * Lists all reductions in the selected SystemBody to work with.
	 * 
	 */
	private def selectReduceExpression() {
		val body = getCurrentBody();
		
		val candidates = EcoreUtil2.getAllContentsOfType(body, AbstractReduceExpression);
		
		val options = new LinkedList<ExplorationStep>();
		
		options.addAll(candidates.map[e|new StepSelectReduction(e)])
		
		options.add(new StepPrintSystemBody());
		options.add(new StepPrintCardinality());
		options.add(new StepSimplifyExpressions());
		options.add(new StepSplitUnionIntoCase());
		options.add(new StepBacktrack());
		options.add(new StepFinish());
		
		outStream.println("");
		outStream.println("Select a ReduceExpression to work on:");
		for (i : 0..< options.size) {
			val opt = options.get(i);
			outStream.println(String.format("%d: %s", i, opt.description));
		}
		val selected = acceptInteger(0, options.size)
		performAction(options.get(selected));	
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
		
		if (targetRE.body instanceof CaseExpression) {
			val getExprCommand = targetRE.getExpressionCommandString
			
			outStream.println("");
			outStream.println("Selected reduction has a CaseExpression as its body. Applying PermutationCaseReduce.")
			outStream.print("Press enter/return to continue...")
			inStream.readLine
			
			PermutationCaseReduce.apply(targetRE)
			state = STATE.INITIAL
			targetRE = null
			commandHistory.add(String.format("PermutationCaseReduce(%s)", getExprCommand))
			return;
		}
		
		if (targetRE.body.expressionDomain.nbBasicSets > 1) {
			val getExprCommand = targetRE.expressionCommandString
			val getExprCommandBody = targetRE.body.expressionCommandString
			
			outStream.println("");
			outStream.println("The expression domain of reduction body is not a single polyhedron. Applying SplitUnionIntoCase + PermutationCaseReduce.");
			outStream.print("Press enter/return to continue...")
			inStream.readLine
			
			switch (targetRE.body) {
				RestrictExpression : {
					SplitUnionIntoCase.apply(targetRE.body as RestrictExpression)
					PermutationCaseReduce.apply(targetRE)
				}
				AutoRestrictExpression : {
					SplitUnionIntoCase.apply(targetRE.body as AutoRestrictExpression)
					PermutationCaseReduce.apply(targetRE)
				}
				default : {
					throw new UnsupportedOperationException("Expecting the body of reduction to be a restrict. The program may not be normalized.");
				}
			}
			
			state = STATE.INITIAL
			targetRE = null
			commandHistory.add(String.format("SplitUnionIntoCase(%s)", getExprCommandBody))
			commandHistory.add(String.format("PermutationCaseReduce(%s)", getExprCommand))
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
		val getExprCommand = targetRE.getExpressionCommandString
		
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
			commandHistory.add(String.format("SameOperatorSimplification(%s)", getExprCommand))
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
			commandHistory.add(String.format("Distributivity(%s)", getExprCommand))
			return
		}
		
		outStream.println("No side-effect free transformations to apply.");
		
		state = STATE.DP_STEP_TRANSFORMATIONS
	}
	
	/**
	 * Lists all possible DP step that can be taken. 
	 * 
	 */
	private def StepTransformations() {
		val SSAR = ShareSpaceAnalysis.apply(targetRE)
		
		val options = new LinkedList<ExplorationStep>();
		
		//SimplifyingReductions
		val candidateReuse = new CandidateReuse(targetRE, SSAR)
		for (vec : candidateReuse.vectors) {
			options.add(new StepSimplifyingReduction(vec));
		}
		
		//Idempotent
		if (Idempotence.testLegality(targetRE, SSAR)) {
			options.add(new StepIdempotence());
		}
		
		//Higher-Order Operator
		if (HigherOrderOperator.testLegality(targetRE, SSAR)) {
			options.add(new StepHigherOrderOperator());
		}
		
		//Composition
		if (ReductionComposition.testLegality(targetRE)) {
			options.add(new StepReductionComposition());
		}
		
		//Decomposition with side-effects
		for (pair : SimplifyingReductions.generateDecompositionCandidates(SSAR, targetRE)) {
			options.add(new StepReductionDecomposition(pair.key, pair.value))
		}
		
		//Inline
		options.addAll(targetRE.findInlineCandidates)
		
		//Default Options
		options.add(new StepPrintSystemBody());
		options.add(new StepPrintCardinality());
		options.add(new StepPrintShareSpace(SSAR));
		options.add(new StepBacktrack());
		options.add(new StepFinish());
		
		
		outStream.println("");
		outStream.println("Select an action:");
		for (i : 0..< options.size) {
			val opt = options.get(i);
			outStream.println(String.format("%d: %s", i, opt.description));
		}
		val selected = acceptInteger(0, options.size)
		performAction(options.get(selected));
	}
	
	private def dispatch performAction(StepSelectReduction step) {
		targetRE = step.are 
		state = STATE.REDUCTION_SELECTED
		outStream.println(String.format("TargetReduction: %s", AShow.print(targetRE)));			
	}
	
	private def dispatch performAction(StepSimplifyingReduction step) {
		if (!(targetRE.eContainer instanceof StandardEquation)) {
			val getExprCommand = targetRE.getExpressionCommandString
		
			val eq = NormalizeReduction.apply(targetRE)
			commandHistory.add(String.format("NormalizeReduction(%s)", getExprCommand))
			targetRE = eq.expr as AbstractReduceExpression
		}

		val getExprCommand = targetRE.getExpressionCommandString
		
		SimplifyingReductions.apply(targetRE as ReduceExpression, step.reuseDepNoParams);
		
		outStream.println(String.format("Applied SimplifyingReductions."));
		state = STATE.INITIAL
		targetRE = null
		commandHistory.add(String.format("SimplifyingReductions(%s, \"%s\")", getExprCommand, MatrixOperations.toString(step.reuseDepNoParams)))
	}
	
	private def dispatch performAction(StepIdempotence step) {
		val getExprCommand = targetRE.getExpressionCommandString
		
		Idempotence.apply(targetRE);
		
		outStream.println("");
		outStream.println(String.format("Applied Idempotence: %s", AShow.print(targetRE)));
		outStream.print("Press enter/return to continue...")
		inStream.readLine
		
		state = STATE.INITIAL
		targetRE = null
		commandHistory.add(String.format("Idempotence(%s)",getExprCommand))
	}
	
	private def dispatch performAction(StepHigherOrderOperator step) {
		val getExprCommand = targetRE.getExpressionCommandString
		
		HigherOrderOperator.apply(targetRE);
		
		outStream.println("");
		outStream.println(String.format("Applied HigherOrderOperator: %s", AShow.print(targetRE)));
		outStream.print("Press enter/return to continue...")
		inStream.readLine
		
		state = STATE.INITIAL
		targetRE = null
		commandHistory.add(String.format("HigherOrderOperator(%s)", getExprCommand))
	}
	
	private def dispatch performAction(StepReductionComposition step) {
		val getExprCommand = targetRE.getExpressionCommandString
		
		ReductionComposition.apply(targetRE);
		Normalize.apply(currentBody)
		
		outStream.println("");
		outStream.println(String.format("Applied ReductionComposition: %s", AShow.print(targetRE)));
		outStream.print("Press enter/return to continue...")
		inStream.readLine
		
		state = STATE.SIDE_EFFECT_FREE_TRANSFORMATIONS
		commandHistory.add(String.format("ReductionComposition(%s)", getExprCommand))
		commandHistory.add(String.format("Normalize(body)"))
	}
	
	private def dispatch performAction(StepReductionDecomposition step) {
		val getExprCommand = targetRE.getExpressionCommandString
		
		ReductionDecomposition.apply(targetRE, step.innerProjection,  step.outerProjection);
		Normalize.apply(currentBody)
		
		outStream.println("");
		outStream.println(String.format("Applied ReductionDecomposition: %s", AShow.print(targetRE)));
		outStream.print("Press enter/return to continue...")
		inStream.readLine
		
		state = STATE.INITIAL
		targetRE = null
		
		commandHistory.add(String.format("ReductionDecomposition(%s, \"%s\", \"%s\")", getExprCommand,
				AlphaPrintingUtil.toShowString(step.innerProjection),
				AlphaPrintingUtil.toShowString( step.outerProjection)
		))
		commandHistory.add(String.format("Normalize(body)"))
	}

	private def dispatch performAction(StepInlineVariable step) {
		val getExprCommand = targetRE.getExpressionCommandString
		
		SubstituteByDef.apply(targetRE, step.variable);
		Normalize.apply(targetRE)
		
		outStream.println("");
		outStream.println(String.format("Applied SubstituteByDef: %s", AShow.print(targetRE)));
		outStream.print("Press enter/return to continue...")
		inStream.readLine
		
		state = STATE.SIDE_EFFECT_FREE_TRANSFORMATIONS
		commandHistory.add(String.format("SubstituteByDef(%s, \"%s\")", getExprCommand, step.variable.name))
		commandHistory.add(String.format("Normalize(%s)", getExprCommand))
	}
	
	private def dispatch performAction(StepSimplifyExpressions step) {
		SimplifyExpressions.apply(currentBody)
		Normalize.apply(currentBody)
		
		outStream.println("");
		outStream.println(String.format("Applied SimplifyExpressions"));
		
		commandHistory.add(String.format("SimplifyExpressions(body)"))
		commandHistory.add(String.format("Normalize(body)"))
	}
	
	private def dispatch performAction(StepSplitUnionIntoCase step) {
		SplitUnionIntoCase.apply(currentBody)
		
		outStream.println("");
		outStream.println(String.format("Applied SplitUnionIntoCase"));
		
		commandHistory.add(String.format("SplitUnionIntoCase(body)"))
	}
	
	private def dispatch performAction(StepPrintSystemBody step) {
		outStream.println(AShow.print(currentBody));
	}
	
	private def dispatch performAction(StepPrintCardinality step) {
		val candidates = EcoreUtil2.getAllContentsOfType(currentBody, AbstractReduceExpression);
		
		for (candidate : candidates) {
			if (candidate.body.contextDomain.nbBasicSets > 1) {
				outStream.println(String.format("N/A; context domain involves union. : card(%s)", AShow.print(candidate)));
			} else {
				val card = BarvinokFunctions.card(candidate.body.contextDomain)
				val qp = card.getPieceAt(0).getQp
				outStream.println(String.format("%s : card(%s)", AlphaPrintingUtil.toShowString(qp), AShow.print(candidate)));
			}			
		}
	}
	private def dispatch performAction(StepPrintShareSpace step) {
		outStream.println(step.SSAR);
	}
	private def dispatch performAction(StepBacktrack step) {
		do {
			rollbackState
		} while (state != STATE.INITIAL && state != STATE.REDUCTION_SELECTED && state != STATE.DP_STEP_TRANSFORMATIONS)
	}
	private def dispatch performAction(StepFinish step) {
		state = STATE.EXIT
	}
	
	private static def getExpressionCommandString(AlphaExpression target) {
		val eqName = AlphaUtil.getContainerEquation(target).equationName
		//expression ID must be obtained before transformation
		val exprID = target.expressionID
		
		return String.format("GetExpression(body, \"%s\", \"%s\")", eqName, exprID)
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
		
		//consistency check
		if (targetRE !== null && AlphaUtil.getContainerSystemBody(targetRE) !== currentBody) {
			throw new RuntimeException("Main loop state is inconsistent.");
		}
	}
	
	private static abstract class ExplorationStep {
	
		abstract def String description();
	}
	
	private static class StepSelectReduction extends ExplorationStep {
		AbstractReduceExpression are;
		
		new (AbstractReduceExpression are) {
			this.are = are
		}
		
		override description() {
			String.format("%s (in %s)", AShow.print(are), AlphaUtil.getContainerEquation(are).equationName)
		}
		
	}
	
	private static class StepSimplifyingReduction extends ExplorationStep {
		long[] reuseDepNoParams;
		
		new(long[] reuseDepNoParams) {
			this.reuseDepNoParams = reuseDepNoParams
		}
		
		override description() {
			String.format("Apply SimplifyingReduction with: %s", MatrixOperations.toString(reuseDepNoParams));
		}
		
	}
	
	private static class StepIdempotence extends ExplorationStep {
		
		override description() {
			String.format("Apply Idempotence");
		}
	}
	
	private static class StepHigherOrderOperator extends ExplorationStep {
		
		override description() {
			String.format("Apply HigherOrderOperator");
		}
	}
	
	private static class StepReductionComposition extends ExplorationStep {
		
		override description() {
			"Apply ReductionComposition"
		}
		
	}
	
	private static class StepReductionDecomposition extends ExplorationStep {
		
		ISLMultiAff innerProjection
		ISLMultiAff outerProjection
		
		new(ISLMultiAff innerF, ISLMultiAff outerF) {
			innerProjection = innerF;
			outerProjection = outerF;
		}
		
		override description() {
			String.format("Apply ReductionDecomposition with %s o %s", outerProjection, innerProjection);
		}
	}
	
	private static class StepInlineVariable extends ExplorationStep {
		Variable variable;
		
		new(Variable v) {
			variable = v
		}
		
		override description() {
			String.format("Inline %s", variable.name);
		}
	}
	
	private static class StepSimplifyExpressions extends ExplorationStep {
		override description() {
			"Apply SimplifyExpression to current SystemBody"
		}
	}
	
	private static class StepSplitUnionIntoCase extends ExplorationStep {
		override description() {
			"Apply SplitUnionIntoCase to current SystemBody"
		}
	}
	
	private static class StepPrintSystemBody extends ExplorationStep {
		override description() {
			String.format("Print current SystemBody");
		}
	}
	
	private static class StepPrintCardinality extends ExplorationStep {
		override description() {
			String.format("Print Cardinality of the reduction bodies");
		}
	}
	
	private static class StepPrintShareSpace extends ExplorationStep {
		ShareSpaceAnalysisResult SSAR;
		new (ShareSpaceAnalysisResult SSAR) {
			this.SSAR = SSAR;
		}
		
		override description() {
			String.format("Print Share Space");
		}
	}
	
	private static class StepBacktrack extends ExplorationStep {
		
		override description() {
			String.format("Revert to previous state.");
		}
	}
	
	private static class StepFinish extends ExplorationStep {
		
		override description() {
			String.format("Finish exploration.");
		}
	}
	
	private static def findInlineCandidates(AbstractReduceExpression are) {
		EcoreUtil2.getAllContentsOfType(are, VariableExpression).filter[ve|ve.variable.local || ve.variable.output].map[
			ve|new StepInlineVariable(ve.variable)
		]
	}
	
	////////////////
	private static dispatch def getEquationName(StandardEquation eq) {
		eq.variable.name
	}
	
	private static dispatch def getEquationName(UseEquation eq) {
		'''UseEquation'''
	}
}