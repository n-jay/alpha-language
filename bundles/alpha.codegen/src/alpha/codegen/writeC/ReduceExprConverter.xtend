package alpha.codegen.writeC

import alpha.codegen.Expression
import alpha.codegen.Factory
import alpha.codegen.FunctionBuilder
import alpha.codegen.MacroStmt
import alpha.codegen.ProgramBuilder
import alpha.codegen.isl.ASTConverter
import alpha.codegen.isl.LoopGenerator
import alpha.model.ReduceExpression
import fr.irisa.cairn.jnimap.isl.ISLAff
import fr.irisa.cairn.jnimap.isl.ISLConstraint
import fr.irisa.cairn.jnimap.isl.ISLDimType
import fr.irisa.cairn.jnimap.isl.ISLSpace
import java.util.HashSet

/**
 * Converts an Alpha reduce expression into the appropriate C AST nodes.
 * A new function is created and added to the program which computes the reduction,
 * and the appropriate function call expression is returned.
 */
class ReduceExprConverter {
	/**
	 * A counter for the number of reductions that have been created.
	 * This is used for determining the names of functions and macros
	 * which will be emitted.
	 */
	protected static var nextReductionId = 0
	
	/** The name of the reduction variable inside of reduce functions. */
	protected static val reduceVarName = "reduceVar"
	
	/**
	 * Converts an Alpha reduce expression into the appropriate C AST nodes.
	 * A new function is created and added to the program which computes the reduction,
	 * and the appropriate function call expression is returned.
	 */
	def static Expression convertExpr(ProgramBuilder program, ReduceExpression expr) {
		// Create the reduce function and add it to the program.
		val reduceFunction = createReduceFunction(program, expr)
		program.addFunction(reduceFunction)
		
		// Return a call to the reduce function.
		val callArguments = #[expr.contextDomain.paramNames, expr.contextDomain.indexNames].flatten
		return Factory.callExpr(reduceFunction.name, callArguments)
	}
	
	/** Creates the function which evaluates the reduction at a specific output point. */
	def protected static createReduceFunction(ProgramBuilder program, ReduceExpression expr) {
		// Capture the next reduction ID so we can create function and macro names.
		val myId = nextReductionId.toString
		nextReductionId += 1
		
		// Start building the reduce function.
		val reduceFunctionName = "reduce" + myId
		val function = FunctionBuilder.start(false, Common.alphaValueType, reduceFunctionName)
		
		// Create the "reduction variable", which is what the reduction will accumulate into.
		// This needs to be initialized to the correct value for the reduction operator.
		val initializeStmt = Factory.assignmentStmt(reduceVarName, Common.getReductionInitialValue(expr.operator))
		function
			.addVariable(Common.alphaValueType, reduceVarName)
			.addStatement(initializeStmt)
			
		// Create the macros that evaluate points within the reduction body
		// and accumulate them into the reduce variable.
		val reducePointMacro = createReducePointMacro(myId, program, expr)
		val accumulateMacro = createAccumulationMacro(myId, expr, reducePointMacro)
		function.addStatement(reducePointMacro, accumulateMacro)
		
		// Use isl to determine what points need to be reduced and how they get reduced.
		val loopDomain = expr.createReduceLoopDomain
		val islAST = LoopGenerator.generateLoops(accumulateMacro.name, loopDomain)
		
		// The size parameters for the loop domain need to be added as function parameters.
		function.addParameter(loopDomain.paramNames.map[toParameter])
		
		// Add declarations for all the loop variables and add the loops themselves to the function.
		val loopResult = ASTConverter.convert(islAST)
		
		function
			.addVariable(loopResult.declarations.map[Factory.variableDecl(Common.alphaIndexType, it)])
			.addStatement(loopResult.statements)
			
		// Undefine the macros, then have the function return the reduce variable.
		function
			.addUndefine(reducePointMacro, accumulateMacro)
			.addReturn(reduceVarExpr)
			
		return function.instance
	}
	
	/** Constructs the domain which will represent the loop nest that isl will produce. */
	def protected static createReduceLoopDomain(ReduceExpression reduceExpr) {
		// We will use ISL to create the loop nest for the reduction.
		// This needs two things: the domain of points to iterate over,
		// and a map to the time at which they are computed at.
		//
		// When the reduce function is called, we want a specific value within the domain
		// where the reduction outputs its results to (i.e., the context domain of the reduce expression).
		// To allow constraining the reduction body to only the points needed for a particular output,
		// we take the reduction body's context domain and add a parameter for each output dimension.
		// Then, since the output point is determined by the reduction's projection function,
		// we equate each of the output parameters to the appropriate output dimension of the projection function.
		// This will give us a set which is parameterized by the output domain,
		// which in turn allows isl to produce the loops that produce only that one output.
		
		// We will start with the entire reduction body, then add parameters and constraints to it.
		var pointsToReduce = reduceExpr.body.contextDomain.copy
		
		// Get the list of names that already exist so we don't create duplicates.
		val existingNames = new HashSet<String>
		existingNames.addAll(pointsToReduce.paramNames)
		existingNames.addAll(pointsToReduce.indexNames)
		
		// For each index in the reduction's output domain,
		// add a new parameter representing that output dimension to the set of points to reduce.
		// Then, set that new parameter equal to its expression in the reduction's projection function.
		// This will ensure we only reduce the set of points which are going to the desired output point.
		val outputDomain = reduceExpr.contextDomain
		for (i: 0 ..< outputDomain.nbIndices) {
			// Get a unique parameter name which will represent that output,
			// record it as an existing name, and add it to the set of points to reduce.
			val outputName = outputDomain.getIndexName(i)
			val parameterName = outputName.makeParameterName(existingNames)
			existingNames.add(parameterName)
			pointsToReduce = pointsToReduce.addParams(#[parameterName])
			
			// Construct an equality constraint for that new parameter
			// according to the expression which computes that index.
			// Add the constraint to the set of points to reduce.
			val outputExpr = reduceExpr.projection.getAff(i)
			val outputConstraint = constrainAddedParameter(pointsToReduce.space, outputExpr)
			pointsToReduce = pointsToReduce.addConstraint(outputConstraint)
		}
		
		return pointsToReduce
	}
	
	/**
	 * Turns an index name into a unique parameter name.
	 * The new name is added to the given set of existing names.
	 */
	def protected static makeParameterName(String indexName, HashSet<String> existingNames) {
		// Keep adding "p" characters to the end of the name until it's unique.
		var parameterName = indexName
		do {
			parameterName += "p"
		} while(existingNames.contains(parameterName))
		
		return parameterName
	}
	
	/**
	 * Adds an equality constraint to the recently added parameter
	 * (i.e., the parameter with the largest index).
	 * This parameter is set equal to the given affine expression
	 * (which comes from the reduction's projection function).
	 */
	def protected static constrainAddedParameter(ISLSpace reductionSpace, ISLAff outputExpr) {
		// Since we're constraining the parameter that was just added,
		// we know the parameter index we're constraining is the last one.
		val parameterIndex = reductionSpace.nbParams - 1
		
		// The equality constraint we want to add is of the form: outputExpr - newParameter = 0.
		// Thus, let's start with a fresh equality constraint and set the coefficient of
		// the new parameter to be -1.
		var equality = ISLConstraint
			.buildEquality(reductionSpace.copy)
			.setCoefficient(ISLDimType.isl_dim_param, parameterIndex, -1)
		
		// Next, we will copy all the coefficients from the output expression.
		// Since all new parameters are added to the end of the reduction space,
		// the parameters and indices for the output expression are still aligned
		// with the reduction space.
		for (paramIdx: 0 ..< outputExpr.nbParams) {
			val coefficient = outputExpr.getCoefficientVal(ISLDimType.isl_dim_param, paramIdx)
			equality = equality.setCoefficient(ISLDimType.isl_dim_param, paramIdx, coefficient)
		}
		for (inIdx: 0 ..< outputExpr.nbInputs) {
			val coefficient = outputExpr.getCoefficientVal(ISLDimType.isl_dim_in, inIdx)
			equality = equality.setCoefficient(ISLDimType.isl_dim_set, inIdx, coefficient)
		}
		
		return equality
	}
	
	/** Gets an expression representing the reduce variable. */
	def protected static reduceVarExpr() {
		return Factory.customExpr(reduceVarName)
	}
	
	/** Constructs a parameter for the reduce function. */
	def protected static toParameter(String name) {
		return Factory.parameter(Common.alphaIndexType, name)
	}
	
	/** Constructs the macro that evaluates a point within the reduction body. */
	def protected static createReducePointMacro(String reductionId, ProgramBuilder program, ReduceExpression expr) {
		val name = "RP" + reductionId
		val arguments = expr.body.contextDomain.indexNames
		val replacement = ExprConverter.convertExpr(program, expr.body)
		
		return Factory.macroStmt(name, arguments, replacement)
	}
	
	/** Constructs the macro used to accumulate points of the reduction body into the reduce variable. */
	def protected static createAccumulationMacro(String reductionId, ReduceExpression expr, MacroStmt reducePointMacro) {
		val name = "R" + reductionId
		
		// Construct a call to the reduce point macro.
		// Since isl's call to this macro doesn't parenthesize the inputs,
		// and since the macro for the reduction body might not be parenthesized,
		// parenthesize all the arguments to the call.
		val reducePointArguments = expr.body.contextDomain.indexNames.map[Factory.parenthesizedExpr(it)]
		val reducePointCall = Factory.callExpr(reducePointMacro.name, reducePointArguments)
		
		// Construct a binary expression to add the reduce variable to the point which was reduced,
		// then wrap that in an assignment statement.
		val operator = Common.getOperator(expr.operator)
		val accumulateExpr = Factory.binaryExpr(operator, reduceVarExpr, reducePointCall)
		val accumulateStmt = Factory.assignmentStmt(reduceVarExpr, accumulateExpr)
		
		return Factory.macroStmt(name, expr.body.contextDomain.indexNames, accumulateStmt)
	}
}