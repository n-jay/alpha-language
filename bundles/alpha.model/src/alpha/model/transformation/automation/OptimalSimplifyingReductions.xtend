package alpha.model.transformation.automation

import alpha.model.AbstractReduceExpression
import alpha.model.AlphaExpression
import alpha.model.AlphaInternalStateConstructor
import alpha.model.AlphaRoot
import alpha.model.AlphaSystem
import alpha.model.DependenceExpression
import alpha.model.ReduceExpression
import alpha.model.RestrictExpression
import alpha.model.StandardEquation
import alpha.model.SystemBody
import alpha.model.VariableExpression
import alpha.model.analysis.reduction.ShareSpaceAnalysis
import alpha.model.matrix.MatrixOperations
import alpha.model.transformation.Normalize
import alpha.model.transformation.RaiseDependence
import alpha.model.transformation.SplitUnionIntoCase
import alpha.model.transformation.reduction.Distributivity
import alpha.model.transformation.reduction.HigherOrderOperator
import alpha.model.transformation.reduction.Idempotence
import alpha.model.transformation.reduction.NormalizeReduction
import alpha.model.transformation.reduction.PermutationCaseReduce
import alpha.model.transformation.reduction.ReductionComposition
import alpha.model.transformation.reduction.ReductionDecomposition
import alpha.model.transformation.reduction.SameOperatorSimplification
import alpha.model.transformation.reduction.SimplifyingReductions
import alpha.model.util.AlphaUtil
import alpha.model.util.Show
import fr.irisa.cairn.jnimap.isl.ISLMultiAff
import java.util.LinkedList
import java.util.List
import java.util.Map
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.util.EcoreUtil

import static extension alpha.model.util.AlphaUtil.getContainerEquation
import static extension alpha.model.util.AlphaUtil.getContainerRoot
import static extension alpha.model.util.AlphaUtil.getContainerSystemBody
import static extension alpha.model.util.ISLUtil.dimensionality
import static extension java.lang.String.format

/**
 * Implements Algorithm 2 in the Simplifying Reductions paper. The current
 * implementation does not prune the search space. It simply explores all possible
 * combinations of reduction decomposition, dependence raising, and simplification
 * until termination or it finds the specified (via throttleLimit) number of 
 * optimized versions, whichever comes first.
 * 
 */
class OptimalSimplifyingReductions {
	
	public static boolean DEBUG = false
	
	private static def void debug(String msg) {
		if (DEBUG)
			println("[OptimalSimplifyingReductions] " + msg)
	}
	
	protected AlphaRoot root
	protected AlphaSystem system
	protected SystemBody systemBody
	protected int systemBodyID
	protected String originalSystemName
	protected int initialComplexity
	protected boolean throttle
	protected int throttleLimit
	protected long optimizationNum
	
	/**
	 * This maps contains the simplified versions of the program obtained
	 * during exploration. Simplified versions are grouped by complexity.
	 * The program versions of complexity O(N^k) reside in the list mapped to
	 * by the key k.
	 */
	public Map<Integer, List<State>> optimizations
	
	/**
	 * Creates an OSR instance and initializes exploration space parameters 
	 */
	protected new (SystemBody originalSystemBody, int limit) {
		root = EcoreUtil.copy(AlphaUtil.getContainerRoot(originalSystemBody))
		system = root.getSystem(originalSystemBody.system.fullyQualifiedName)
		systemBodyID = originalSystemBody.system.systemBodies.indexOf(originalSystemBody)
		systemBody = system.systemBodies.get(systemBodyID)
		optimizations = newHashMap
		originalSystemName = system.name
		optimizationNum = 0
		initialComplexity = systemBody.complexity
		throttle = throttleLimit > 0
		throttleLimit = limit
	}
	
	/** 
	 * Entry points to the optimal simplification algorithm.
	 * If no limit is specified, then it will explore all possible simplifications.
	 */
	static def apply(AlphaSystem system) { apply(system, 0) }
	static def apply(AlphaSystem system, int limit) {
		if (system.systemBodies.size == 1)
			apply(system.systemBodies.get(0), limit)
		else
			throw new IllegalArgumentException("A SystemBody must be specified for an AlphaSystem with multiple bodies.")
	}
	static def apply(SystemBody body) { apply(body, 0) }
	static def apply(SystemBody body, int limit) {
		
		val osr = new OptimalSimplifyingReductions(body, limit)
		osr.run
		return osr
	}
	
	/** 
	 * Preprocess the input program. After preprocessing all reductions are
	 * normalized and the body of every reduction is a single convex polyhedron
	 * (i.e., an ISLSet with a single ISLBasicSet). This is achieved via 
	 * SplitUnionIntoCase, PermutationCaseReduce, and NormalizeReduction.
	 * 
	 * The State object is a wrapper around the AlphaRoot object and used to 
	 * maintain a correspondence between the sequence of dynamic programming steps
	 * performed and transformed program.
	 */
	protected def preprocessing() {
		ReductionComposition.apply(systemBody)
		SplitUnionIntoCase.apply(systemBody)
		PermutationCaseReduce.apply(systemBody)
		NormalizeReduction.apply(systemBody)
		Normalize.apply(systemBody)
		
		debug('After preprocessing:')
		debug(Show.print(systemBody))
		
		val state = new State(systemBody, newLinkedList)
		
		(0..<state.complexity).forEach[i | optimizations.put(i, newLinkedList)]
		
		return state
	}
	
	/**
	 * Entry point to the algorithm. The current implementation maintains a list
	 * of unexplored equations for each program state. Given an initial preprocessed
	 * program state, we begin by optimizing equations one at a time.
	 * 
	 */
	private def run() {
		val state = preprocessing
		
		try {
			state.optimizeUnexploredEquations
		} catch (ThrottleException e) {
			debug('Throttled search to stop after ' + throttleLimit + ' results')
		}
	}
	
	/**
	 * optimizeUnexploredEquations and optimizeEquation together carry out the recursive simplification
	 * algorithm. The given program state is optimized while it has unexplored equations. Each equation
	 * has a boolean flag property to indicate whether it has been explored. Any new equations that
	 * are introduced during the optimization are effectively queued because they have not yet been 
	 * marked as explored.
	 * 
	 * After the program state has been optimized (i.e., all equations have been explored), if the 
	 * state complexity is smaller than the initialComplexity then the state is added to the list of
	 * optimized versions.
	 */
	private def void optimizeUnexploredEquations(State state) {
		while (state.body.hasUnexploredEquations) {
			val eq = state.body.nextUnexploredEquation
			debug('optimizing equation ' + eq.variable.name) 
			debug(state.show.toString)
			eq.optimizeEquation(eq.expr, state)
		}
		
		val stateComplexity = state.complexity
		if (stateComplexity < initialComplexity) {
			optimizationNum++
			state.addToOptimzations
			if (throttle && optimizationNum >= throttleLimit)
				throw new ThrottleException
		}
	}
	
	/** 
	 * optimizeEquation is implemented as a dispatch method, because only equations involving
	 * reduce expressions need to be recursively explored.
	 */
	private def dispatch void optimizeEquation(StandardEquation eq, ReduceExpression re, State state) {
		val containerSystemBody = eq.getContainerSystemBody
		if (re.isOptimallySimplified) {
			eq.setExplored
			return
		}
		
		val body = eq.getContainerSystemBody
		
		while(!sideEffectFreeTransformations(body, eq.variable.name)) {}
		
		val targetEq = body.getStandardEquation(eq.variable.name)
		
		if (targetEq.expr.isNotReduceExpr) {
			eq.setExplored
			return
		}
		
		// Enumerate the list of candidate dynamic programming steps
		val candidates = enumerateCandidates(targetEq.expr as ReduceExpression)
		candidates.forEach[c |
			debug("candidate: " + c.description)
		]
		
		// Explore each step recursively. For each step, create a new state by applying the step.
		// Then recursively call optimizeUnexploredEquations for the new state
		for (step : candidates) {
			val optimizedRoot = EcoreUtil.copy(containerSystemBody.getContainerRoot)
			val optimizedBody = optimizedRoot.getSystem(originalSystemName).systemBodies.get(systemBodyID)
			val optimizedEq = optimizedRoot.getEquation(targetEq.name)
			optimizedEq.expr.applyDPStep(step)
			optimizedEq.explored = optimizedEq.expr.isNotReduceExpr
			val steps = newLinkedList
			steps.addAll(state.steps)
			steps += step
			val newState = new State(optimizedBody, steps)
			optimizeUnexploredEquations(newState)
		}
		
		// At this point, the recursion has returned for the current state of the equation eq and
		// eq is marked as explored
		eq.setExplored
	}
	private def dispatch void optimizeEquation(StandardEquation eq, AlphaExpression ae, State state) {
		eq.explored = true
	}
	
	def static int complexity(SystemBody body) {
		body.equations
			.filter[eq | eq instanceof StandardEquation]
			.map[eq | eq as StandardEquation].map[eq |
				if (eq.expr instanceof ReduceExpression) {
					(eq.expr as ReduceExpression).body.contextDomain.dimensionality
				} else {
					eq.variable.domain.dimensionality
				}
			].max
	}
	
	/**
	 * Side effect free transformations are repeatedly applied until convergence.
	 * 
	 */
	protected def sideEffectFreeTransformations(SystemBody body, String eqName) {
		val eq = body.getStandardEquation(eqName)

		SplitUnionIntoCase.apply(body)
		PermutationCaseReduce.apply(body)
		val nrCount = NormalizeReduction.apply(body)
		Normalize.apply(body)
		
		if (nrCount > 0) return false;
		
		// If earlier transformation has exposed non-reduce expressions,
		// then DP must recurse on new equations after NormalizeReduction
		if (!(eq.expr instanceof AbstractReduceExpression)) return true;
		
		if (SameOperatorSimplification.apply(eq.expr as ReduceExpression) > 0) return false;
		if (Distributivity.apply(eq.expr as ReduceExpression) > 0) return false;
		
		return true;
	}

	/** 
	 * Only raise dependence expressions when the reduction body is not any of the following:
	 * - depExpr
	 * - varExpr
	 * - restrictExpr(depExpr)
	 * - restrictExpr(varExpr)
	 */
	private dispatch def shouldRaiseDependence(DependenceExpression de) { false }
	private dispatch def shouldRaiseDependence(VariableExpression ve) { false }
	private dispatch def shouldRaiseDependence(RestrictExpression re) { shouldRaiseDependence(re, re.expr) }
	private dispatch def shouldRaiseDependence(RestrictExpression re, DependenceExpression de) { false }
	private dispatch def shouldRaiseDependence(RestrictExpression re, VariableExpression ve) { false }
	private dispatch def shouldRaiseDependence(RestrictExpression re, AlphaExpression ae) { true }
	private dispatch def shouldRaiseDependence(AlphaExpression ae) { true }
	
	/** 
	 * Creates a list of possible transformations that are valid steps in the DP
	 * 
	 */
	protected def enumerateCandidates(AbstractReduceExpression targetRE) {
		val nbParams = targetRE.expressionDomain.nbParams
		val SSAR = ShareSpaceAnalysis.apply(targetRE)
		
		val candidates = new LinkedList<DynamicProgrammingStep>();
		
		// SimplifyingReductions if body is bigger than answer 
		val answerDim = (targetRE.getContainerEquation as StandardEquation).variable.domain.dimensionality
		val bodyDim = targetRE.body.contextDomain.dimensionality
		if (bodyDim > answerDim) {
			val vectors = SimplifyingReductions.generateCandidateReuseVectors(targetRE, SSAR);
			candidates.addAll(vectors.map[vec | new StepSimplifyingReduction(targetRE, vec, nbParams)])
			
			/* TODO - place-holder for max simplification splitting step.
			 * If vectors is empty but bodyDim is larger than answerDim then there is potentially
			 * reuse that has not yet been exploited, but can be via splitting.
			 * The call to generate the DP steps for splitting in this case should go here.
			 * This comment block should be removed by the PR that introduces the splitting logic,
			 * which will be done separately. 
			 */
		}
		
		// Idempotent
		if (Idempotence.testLegality(targetRE, SSAR)) {
			candidates.add(new StepIdempotence(targetRE));
		}
		
		// Higher-Order Operator
		if (HigherOrderOperator.testLegality(targetRE, SSAR)) {
			candidates.add(new StepHigherOrderOperator(targetRE));
		}
		
		// Decomposition with side-effects
		val decompositionCandidates = SimplifyingReductions.generateDecompositionCandidates(SSAR, targetRE)
		for (pair : decompositionCandidates) {
			candidates.add(new StepReductionDecomposition(targetRE, pair.key, pair.value))
		}
		
		// RaiseDependence
		if (targetRE.body.shouldRaiseDependence) {
			candidates.add(new StepRaiseDependence(targetRE))
		}
		
		return candidates;
	}
	
	////////////////////////////////////////////////////////////
	// Dynamic programming step application methods
	////////////////////////////////////////////////////////////

	protected dispatch def applyDPStep(ReduceExpression re, StepSimplifyingReduction step) {
		SimplifyingReductions.apply(re, step.reuseDepNoParams)
	}
	protected dispatch def applyDPStep(ReduceExpression re, StepIdempotence step) {
		Idempotence.apply(re)
	}
	protected dispatch def applyDPStep(ReduceExpression re, StepHigherOrderOperator step) {
		HigherOrderOperator.apply(re)
	}
	protected dispatch def applyDPStep(ReduceExpression re, StepReductionDecomposition step) {
		ReductionDecomposition.apply(re, step.innerProjection.copy, step.outerProjection.copy)
		NormalizeReduction.apply(re.getContainerEquation)
		Normalize.apply(systemBody)
	}
	protected dispatch def applyDPStep(ReduceExpression re, StepRaiseDependence step) {
		RaiseDependence.apply(re, true)
		AlphaInternalStateConstructor.recomputeContextDomain(systemBody)
	}
	protected dispatch def applyDPStep(AlphaExpression ae, DynamicProgrammingStep step) {
		// do nothing
	}
	
	////////////////////////////////////////////////////////////
	// Dynamic programming step definitions
	////////////////////////////////////////////////////////////
	
	static abstract class DynamicProgrammingStep {
		protected val EList<Integer> nodeID
		protected AbstractReduceExpression re;
		
		new (AbstractReduceExpression targetRE) {
			nodeID = targetRE.nodeID
			re = targetRE	
		}
		
		abstract def String description();
	}
	
	static class StepBeginEquation extends DynamicProgrammingStep  {
		new(AbstractReduceExpression targetRE) {
			super(targetRE)
		}
		
		override description() {
			val eq = re.getContainerEquation
			val eqVarName = (eq instanceof StandardEquation) ? (eq as StandardEquation).variable.name : null 
			val toEqStr = (eqVarName !== null) ? 'to %s'.format(eqVarName) : ''
			String.format("Optimize equation %s", toEqStr);
		}
	}
	
	static class StepSimplifyingReduction extends DynamicProgrammingStep  {
		long[] reuseDepNoParams;
		
		new(AbstractReduceExpression targetRE, long[] reuseDepNoParams, int nbParams) {
			super(targetRE)
			this.reuseDepNoParams = reuseDepNoParams
		}
		
		override description() {
			val eq = re.getContainerEquation
			val eqVarName = (eq instanceof StandardEquation) ? (eq as StandardEquation).variable.name : null 
			val toEqStr = (eqVarName !== null) ? ' to %s'.format(eqVarName) : ''
			String.format("Apply SimplifyingReduction%s with: %s", toEqStr, MatrixOperations.toString(reuseDepNoParams));
		}
		
		def getReuseDepNoParams() {
			reuseDepNoParams
		}
	}
		
	static class StepIdempotence extends DynamicProgrammingStep {
		new(AbstractReduceExpression targetRE) {
			super(targetRE)
		}
		
		override description() {
			String.format("Apply Idempotence");
		}
	}
	
	static class StepHigherOrderOperator extends DynamicProgrammingStep {
		new(AbstractReduceExpression targetRE) {
			super(targetRE)
		}
		
		override description() {
			String.format("Apply HigherOrderOperator");
		}
	}
	
	static class StepReductionDecomposition extends DynamicProgrammingStep {
		ISLMultiAff innerProjection
		ISLMultiAff outerProjection
		
		new(AbstractReduceExpression targetRE, ISLMultiAff innerF, ISLMultiAff outerF) {
			super(targetRE)
			innerProjection = innerF;
			outerProjection = outerF;
		}
		
		override description() {
			val eq = re.getContainerEquation
			val eqVarName = (eq instanceof StandardEquation) ? (eq as StandardEquation).variable.name : null 
			val toEqStr = (eqVarName !== null) ? ' to %s'.format(eqVarName) : ''
			String.format("Apply ReductionDecomposition%s with %s o %s", toEqStr, outerProjection, innerProjection);
		}
	}
	
	static class StepRaiseDependence extends DynamicProgrammingStep {
		new(AbstractReduceExpression targetRE) {
			super(targetRE)
		}
		
		override description() {
			'Apply RaiseDependence'
		}
	}
	
	////////////////////////////////////////////////////////////
	// Miscellaneous helper inner classes
	////////////////////////////////////////////////////////////
	
	/** 
	 * Exception used to indicate that the exploration should stop. The current implementation
	 * does not implement any pruning of the search space. If/when pruning is introduced, this 
	 * should probably be removed.
	 */
	static class ThrottleException extends Exception {}
	
	/**
	 * This class is used to maintain the correspondence between the current state of the program
	 * and the history of dynamic programming steps taken to get there. This is the main object 
	 * that is passed around during the recursive simplification.
	 */
	static class State {
		SystemBody body
		List<DynamicProgrammingStep> steps
		
		new (SystemBody body, List<DynamicProgrammingStep> steps) {
			this.body = body
			this.steps = steps
		}
		
		def root() {
			body.getContainerRoot
		}
		
		def complexity() {
			body.complexity
		}
		
		def show() '''
			// Complexity: «complexity»D
			«(0..<steps.size).map[i | 
				val indent = '// ' + (0..<i).map['+--'].join + '+-- '
				indent + steps.get(i).description
			].join('\n')»
			«Show.print(body.system)»
		'''
	}
	
	////////////////////////////////////////////////////////////
	// Miscellaneous helper functions
	////////////////////////////////////////////////////////////
	
	private def StandardEquation getEquation(AlphaRoot root, String name) {
		val eqs = root.getSystem(originalSystemName)
			.systemBodies.get(systemBodyID)
			.equations
			.filter[eq | eq instanceof StandardEquation]
			.map[eq | eq as StandardEquation]
			.filter[eq | eq.name == name]
		if (eqs.size != 1) {
			throw new Exception("failed to get expression in copied root, this should not happen")
		}
		eqs.get(0)
	}
	
	/** 
	 * Returns true if the dimensionality reduce expression's body's context domain is the same
	 * as the dimensionality of the variable on the LHS of the container equation.
	 * The parent of the expression is guaranteed to be a Standard Equation since NormalizeReduction
	 * has been systematically called.
	 */
	protected def isOptimallySimplified(ReduceExpression re) {
		if (!(re.eContainer instanceof StandardEquation)) {
			throw new Exception('Reduction has not been normalized: ' + Show.print(re.getContainerEquation))
		}
		val eq = re.getContainerEquation as StandardEquation
		val lhsDim = eq.variable.domain.nbIndices
		val rhsDim = re.body.contextDomain.dimensionality
		lhsDim >= rhsDim
	}
	
	/** Returns true if expr is not a ReduceExpression */
	private def static isNotReduceExpr(AlphaExpression expr) {
		!(expr instanceof ReduceExpression)
	}
	
	/** Add the state to the appropriate list of optimizations */
	private def addToOptimzations(State state) {
		val opts = optimizations.get(state.complexity)
		opts += state
	}
	
	/** Returns true if the system body has at least one unexplored equation */
	private def hasUnexploredEquations(SystemBody body) {
		body.standardEquations.reject[explored].size > 0
	}
	
	/** Returns the first equation in the system body marked as unexplored */
	private def nextUnexploredEquation(SystemBody body) {
		body.standardEquations.findFirst[eq | !eq.explored]
	}
}