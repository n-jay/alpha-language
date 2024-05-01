package alpha.codegen.writeC

import alpha.codegen.BaseDataType
import alpha.codegen.BinaryOperator
import alpha.codegen.DataType
import alpha.codegen.Factory
import alpha.codegen.FunctionBuilder
import alpha.codegen.IfStmtBuilder
import alpha.codegen.ProgramBuilder
import alpha.codegen.UnaryOperator
import alpha.codegen.isl.ConditionalConverter
import alpha.codegen.isl.LoopGenerator
import alpha.codegen.isl.MemoryUtils
import alpha.codegen.isl.PolynomialConverter
import alpha.model.AlphaSystem
import alpha.model.StandardEquation
import alpha.model.UseEquation
import alpha.model.Variable
import fr.irisa.cairn.jnimap.isl.ISLPWQPolynomial
import java.util.ArrayList

import static extension alpha.codegen.Factory.customExpr
import static extension alpha.codegen.isl.PolynomialConverter.convert
import static extension alpha.codegen.writeC.Common.getEvalName
import static extension alpha.codegen.writeC.Common.getFlagName
import static extension fr.irisa.cairn.jnimap.barvinok.BarvinokBindings.card

/** Converts an Alpha system to the simplified C AST. */
class SystemConverter {
	/** The list of all variables allocated by the entry point function which need to be freed before returning. */
	protected val ArrayList<String> allocatedVariables

	/**
	 * A counter for the number of statement macros that have been created.
	 * This is used for determining the names said macros.
	 */
	var nextStatementId = 0
	
	/**
	 * Flag to indicate that the C code being output should be compatible
	 * with the wrapper produced by the older AlphaZ.
	 */
	protected val boolean oldAlphaZCompatible
	
	/** The instance of the program builder. */
	protected val ProgramBuilder program
	
	/** The system being converted into a C program. */
	protected val AlphaSystem system
	
	/** Protected constructor. */
	protected new(AlphaSystem system, boolean oldAlphaZCompatible) {
		this.allocatedVariables = newArrayList
		this.oldAlphaZCompatible = oldAlphaZCompatible
		this.program = ProgramBuilder.start
		this.system = system
	}
	
	/**
	 * Converts an Alpha system to the simplified C AST.
	 * Only supports systems with a single body.
	 */
	def static convert(AlphaSystem system) {
		return convert(system, false)
	}
	
	/**
	 * Converts an Alpha system to the simplified C AST.
	 * Only supports systems with a single body.
	 * 
	 * If requested, the code produced will aim for compatibility with
	 * the older version of AlphaZ (although with no guarantees).
	 * This means that the inputs to the entry point will assume
	 * that memory for the system's inputs and outputs were allocated
	 * via the bounding box method, as opposed to linearized memory.
	 * 
	 * Note: since the newer Alpha language doesn't have typing,
	 * all indices are assumed to be of type "long",
	 * and all data values are of type "float".
	 */
	def static convert(AlphaSystem system, boolean oldAlphaZCompatible) {
		return (new SystemConverter(system, oldAlphaZCompatible)).convertSystem
	}
	
	/**
	 * Converts an Alpha system to the simplified C AST.
	 * Only supports systems with a single body.
	 */
	def protected convertSystem() {
		// Only systems with a single body are currently supported.
		if (system.systemBodies.size != 1) {
			throw new IllegalArgumentException("Only systems with one body are supported, but this system has " + system.systemBodies.size + ".")
		}
		val systemBody = system.systemBodies.get(0)
		
		// "Use" equations aren't currently supported.
		if (systemBody.equations.exists[it instanceof UseEquation]) {
			throw new IllegalArgumentException("Systems with 'use equations' are not currently supported.")
		}
		val equations = systemBody.equations.map[it as StandardEquation]
		
		// Add the defaults to the program being built.
		program.addHeaderComment(Common.defaultHeaderComments)
			.addInclude(Common.defaultIncludes)
			.addFunctionMacro(Common.defaultFunctionMacros)
		
		// Prepare all the global variables and their memory macros.
		system.parameterDomain.paramNames.forEach[program.addGlobalVariable(true, Common.alphaIndexType, it)]
		system.variables.forEach[prepareAlphaVariable]
		
		// Create all the necessary "eval" functions.
//		equations.forEach[createEvalFunction]
		for (eq : equations) {
			eq.createEvalFunction
		}
		
		// Create the entry point of the program, then return the final program instance.
		val entryPoint = FunctionBuilder
			.start(BaseDataType.VOID, system.name)
			.prepareEntryArguments()
			.checkParameters()
			.allocateMemory()
			.evaluateOutputs()
			.freeAllocatedVariables
			.instance
		program.addFunction(entryPoint)
		
		return program.instance
	}
	
	
	/////////////////////////////////////////////////////////////////////////////
	// Variable and Memory Macro Declarations
	/////////////////////////////////////////////////////////////////////////////
	
	/**
	 * Declares global variables for the Alpha variable itself
	 * and its associated flag variable (if needed).
	 * Also creates the memory access macros needed for accessing values.
	 */
	def protected prepareAlphaVariable(Variable variable) {
		// Variables (and their flags variables) are stored as linearized memory,
		// but accessed by macros that accept the dimensions declared in the Alpha program.
		// The "rank" function computes this mapping between the two.
		// We may need it twice (once for the variable itself, once for its flags),
		// so we compute it with ISL once, but convert that to an expression twice.
		val rank = MemoryUtils.rank(variable.domain)
		
		// We always declare the variable itself (and its memory macro).
		// However, if we need to be compatible with the older AlphaZ
		// and this is an input or output variable, the declarations are different.
		if (oldAlphaZCompatible && (variable.isInput || variable.isOutput)) {
			prepareOldAlphaZCompatibleVariable(variable)
		} else {
			prepareVariable(variable, rank, false)
		}
		
		// Non-input variables (i.e., locals or outputs) need to have flag variables
		// be created as well. We don't need to worry about compatibility here, though. 
		if (!variable.isInput) {
			prepareVariable(variable, rank, true)
		}
	}
	
	/**
	 * Declares a new global variable for either a standard Alpha variable
	 * or for its flag variable, then constructs the memory macro
	 * used to access values in that global variable.
	 */
	def protected prepareVariable(Variable variable, ISLPWQPolynomial rank, boolean createFlag) {
		// Declare a new global variable (either the variable itself or the flags variable).
		val name = createFlag ? variable.flagName : variable.name
		val type = createFlag ? Common.flagVariableType : Common.alphaVariableType
		program.addGlobalVariable(true, type, name)
		
		// Construct a memory macro for accessing the variable.
		val accessExpression = PolynomialConverter.convert(rank)
		val macroReplacement = Factory.arrayAccessExpr(name, accessExpression)
		val macro = Factory.macroStmt(name, variable.domain.indexNames, macroReplacement)
		program.addMemoryMacro(macro)
	}
	
	/**
	 * Declares a new global variable for an Alpha input or output variable
	 * and creates its memory macro.
	 * 
	 * Note: this is ONLY intended for compatibility with the older version
	 * of AlphaZ, where memory is allocated as a multi-dimensional bounding
	 * box for the variable in question. This may result in negative indexing,
	 * which does not work correctly.
	 */
	def protected prepareOldAlphaZCompatibleVariable(Variable variable) {
		// Declare a new global variable.
		val name = variable.name
		val type = Common.alphaVariableType
		
		// The common Alpha variable type assumes linarized memory,
		// meaning it's always an array.
		// However, this was not necessarily the case in the C code produced
		// by the older AlphaZ, where the level of indirection equaled the number
		// of indices of the variable.
		// Fix this for compatibility.
		type.indirectionLevel = variable.domain.nbIndices
		
		program.addGlobalVariable(true, type, name)
		
		// Construct a memory macro for accessing the variable.
		// Since it's a multi-dimensional bounding box,
		// simply index by the indices in order.
		val arrayAccess = Factory.arrayAccessExpr(variable.name, variable.domain.indexNames)
		val macro = Factory.macroStmt(name, variable.domain.indexNames, arrayAccess)
		program.addMemoryMacro(macro)
	}
	
	
	/////////////////////////////////////////////////////////////////////////////
	// Evaluation Function Declarations
	/////////////////////////////////////////////////////////////////////////////
	
	/**
	 * Creates a function which can evaluate either a local or output Alpha variable
	 * at some point in its domain, returning the computed (or fetched) value.
	 */
	def protected createEvalFunction(StandardEquation equation) {
		val evalBuilder = FunctionBuilder.start(Common.alphaValueType, equation.variable.evalName)
		
		// Add a function parameter for each index of the variable's domain.
		val indexNames = equation.variable.domain.indexNames
		indexNames.forEach[evalBuilder.addParameter(Common.alphaIndexType, it)]
		
		// Add the "if" statement that checks the flag variable and evaluates
		// the actual variable if needed, then return the value of the variable.
		val flagCheckingBlock = equation.getFlagCheckingBlock
		evalBuilder.addComment("Check the flags.")
			.addStatement(flagCheckingBlock)
			.addEmptyLine
			.addReturn(equation.variable.identityAccess(false))
		
		program.addFunction(evalBuilder.instance)
	}
	
	/**
	 * Constructs the "if" statement block that checks the status of the flags variable and
	 * evaluates the variable if needed, or reports a self-dependence if detected.
	 */
	def protected getFlagCheckingBlock(StandardEquation equation) {
		val variable = equation.variable
		
		// For readability of this code, here is the statement that actually assigns
		// the variable being computed.
		val computeValue = ExprConverter.convertExpr(program, equation.expr)
		val computeAndStore = Factory.assignmentStmt(variable.identityAccess(false), computeValue)
		
		// If the flags indicate the value hasn't been evaluated yet:
		//     Set the flag to "in progress"
		//     Evaluate the variable and save its value
		//     Set the flag to "evaluated"
		// Else if the flag indicates the value is "in progress":
		//     Let the user know there is a self dependence
		//     Kill the program
		return IfStmtBuilder
			.start(variable.ifFlagEquals(FlagStatus.NOT_EVALUATED))
			.addStatement(
				variable.setFlagTo(FlagStatus.IN_PROGRESS),
				computeAndStore,
				variable.setFlagTo(FlagStatus.EVALUATED)
			)
			.startElseIf(variable.ifFlagEquals(FlagStatus.IN_PROGRESS))
			.addStatement(
				variable.selfDependencePrintfStmt,
				Factory.exitCall(-1)
			)
			.instance
	}
	
	/** Gets the expression to check if a flags variable is set to a given value. */
	def protected static ifFlagEquals(Variable variable, FlagStatus flagStatus) {
		return Factory.binaryExpr(BinaryOperator.EQ, variable.identityAccess(true), Common.toExpr(flagStatus))
	}
	
	/** Gets the statement that sets a flags variable to a given value. */
	def protected static setFlagTo(Variable variable, FlagStatus flagStatus) {
		Factory.assignmentStmt(variable.identityAccess(true), Common.toExpr(flagStatus))
	}
	
	/** Gets the expression used to access a variable (or its flag). */
	def protected static identityAccess(Variable variable, boolean accessFlags) {
		val name = accessFlags ? variable.flagName : variable.name
		return Factory.callExpr(name, variable.domain.indexNames)
	}
	
	/** Gets the "printf" statement that tells the user a self dependence was found (and where it was). */
	def protected static getSelfDependencePrintfStmt(Variable variable) {
		val locationFormat = (0 ..< variable.domain.nbIndices).map["%ld"].join(",")
		val message = '''"There is a self dependence on «variable.name» at («locationFormat»)\n"'''
		return Factory.printfCall(message, variable.domain.indexNames)
	}
	
	/////////////////////////////////////////////////////////////////////////////
	// Entry Point Arguments and Parameter Checking
	/////////////////////////////////////////////////////////////////////////////
	
	/**
	 * Adds parameters to the function for all system parameters, inputs, and outputs,
	 * then adds statements to the function which copy the function's arguments
	 * to the global variables they're accessed from.
	 */
	def protected prepareEntryArguments(FunctionBuilder builder) {
		builder.addComment("Copy arguments to the global variables.")
		
		// All parameters in the system's domain are added as index parameters.
		system.parameterDomain.paramNames.forEach[builder.prepareEntryArgument(it, Common.alphaIndexType)]
		
		// All system inputs and outputs are added as Alpha variable parameters.
		system.inputs.forEach[builder.prepareEntryArgument(it.name, Common.alphaVariableType)]
		system.outputs.forEach[builder.prepareEntryArgument(it.name, Common.alphaVariableType)]
		
		builder.addEmptyLine
	}
	
	/** Adds a parameter to the function and the assignment statement needed to copy it to the global variable. */
	def protected static prepareEntryArgument(FunctionBuilder builder, String name, DataType type) {
		// We use a prefix to differentiate the entry point's argument name
		// from the global variable it represents.
		val argName = "_local_" + name
		
		// Add the argument as a new parameter for the function.
		builder.addParameter(type, argName)
		
		// Copy the value to the global variable.
		val copyStmt = Factory.assignmentStmt(name, argName)
		builder.addStatement(copyStmt)
	}
	
	/** Adds the "if" statements needed to check that the parameters are valid. */
	def protected checkParameters(FunctionBuilder builder) {
		val isValid = ConditionalConverter.convert(system.parameterDomain)
		val parameterCheck = IfStmtBuilder
			.start(Factory.unaryExpr(UnaryOperator.NOT, isValid))
			.addStatement(
				Factory.callStmt("printf", "\"The value of the parameters are invalid.\\n\""),
				Factory.callStmt("exit", "-1")
			)
			.instance

		builder.addComment("Check parameter validity.")
			.addStatement(parameterCheck)
			.addEmptyLine
	}
	
	
	/////////////////////////////////////////////////////////////////////////////
	// Memory Allocation and Deallocation
	/////////////////////////////////////////////////////////////////////////////
	
	/** Adds the statements needed to allocate memory for the Alpha variables and any necessary flags. */
	def protected allocateMemory(FunctionBuilder builder) {
		// Allocate the Alpha local variables first.
		builder.addComment("Allocate memory for local storage.")
		system.locals.forEach[builder.allocateMemory(it, false)]
		builder.addEmptyLine
		
		// Allocate memory for, and initialize, all the flags variables.
		builder.addComment("Allocate and initialize flag variables.")
		system.outputs.forEach[builder.allocateMemory(it, true)]
		system.locals.forEach[builder.allocateMemory(it, true)]
		builder.addEmptyLine
	}
	
	/**
	 * Adds the calls to "malloc", "mallocCheck", and "memset" as needed
	 * for an Alpha variable or its flag variable.
	 */
	def protected allocateMemory(FunctionBuilder builder, Variable variable, boolean allocateFlag) {
		// Determine the name and data type of the C variable based on
		// whether we're allocating memory for the standard variable or the flags variable.
		val name = allocateFlag ? variable.flagName : variable.name
		val dataType = allocateFlag ? Common.flagVariableType : Common.alphaValueType
		
		// Record that we're allocating this variable so it can be freed later.
		allocatedVariables.add(name)
		
		// We allocate a linear array of memory for each variable.
		// The number of indices we need to allocate is defined by the cardinality of the domain.
		// We may need the expression for this twice (for "malloc" and "memset"), but we don't
		// want the same AST node objects to appear multiple times in the AST,
		// so compute the ISL polynomial once, then convert it to C expressions as needed.
		val cardinality = variable.domain.card
		
		// Call "malloc" to allocate memory and assign it to the variable.
		val mallocCall = Factory.mallocCall(dataType, cardinality.convert)
		builder.addStatement(Factory.assignmentStmt(name, mallocCall))
		
		// Next, we need to check if memory was successfully allocated.
		// We do this with our custom "checkMalloc" macro function,
		// which takes in the pointer and the name of the variable
		// (as a string, to print it if malloc failed).
		val nameStringExpr = Factory.customExpr('''"«name»"''')
		builder.addStatement(Factory.callStmt("mallocCheck", name.customExpr, nameStringExpr))
		
		// If this is a flags variable, we also want to initialize the memory
		// to the "not evaluated" value by calling "memset".
		if (allocateFlag) {
			val flagStatusExpr = Common.toExpr(FlagStatus.NOT_EVALUATED)
			builder.addStatement(Factory.callStmt("memset", name.customExpr, flagStatusExpr, cardinality.convert))
		}
	}
	
	/** Frees all allocated variables. */
	def protected freeAllocatedVariables(FunctionBuilder builder) {
		builder.addComment("Free all allocated memory.")
		builder.addStatement(allocatedVariables.map[Factory.callStmt("free", it)])
	}
	
	
	/////////////////////////////////////////////////////////////////////////////
	// Output Evaluating
	/////////////////////////////////////////////////////////////////////////////
	
	/** Evaluates all points of all outputs of the system. */
	def protected evaluateOutputs(FunctionBuilder builder) {
		builder.addComment("Evaluate all the outputs.")
		system.outputs.forEach[builder.evaluateAllPoints(it)]
		builder.addEmptyLine
	}
	
	/** Evaluates all the points within an output variable. */
	def protected evaluateAllPoints(FunctionBuilder builder, Variable variable) {
		// Get a unique name for the macro.
		val macroName = "S" + nextStatementId
		nextStatementId += 1
		
		// Add a macro that simply calls the "eval" function.
		// The loop nest generated by ISL will call this macro.
		val callEval = Factory.callExpr(variable.evalName, variable.domain.indexNames)
		val macro = Factory.macroStmt(macroName, variable.domain.indexNames, callEval)
		builder.addStatement(macro)
		
		// We will have ISL create a loop nest that visits all points in their lexicographic order.
		val loopStmt = LoopGenerator.generateLoops(macroName, variable.domain)
		builder.addStatement(loopStmt)
		
		// Undefine the macro now that we're done with it.
		builder.addStatement(Factory.undefStmt(macroName))
	}
}