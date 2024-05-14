package alpha.codegen.writeC

import alpha.codegen.BaseDataType
import alpha.codegen.BinaryOperator
import alpha.codegen.DataType
import alpha.codegen.Factory
import alpha.codegen.FunctionBuilder
import alpha.codegen.IfStmtBuilder
import alpha.codegen.ProgramBuilder
import alpha.codegen.UnaryOperator
import alpha.codegen.isl.ASTConverter
import alpha.codegen.isl.ConditionalConverter
import alpha.codegen.isl.LoopGenerator
import alpha.codegen.isl.MemoryUtils
import alpha.codegen.isl.PolynomialConverter
import alpha.model.AlphaSystem
import alpha.model.StandardEquation
import alpha.model.UseEquation
import alpha.model.Variable
import alpha.model.transformation.Normalize
import alpha.model.transformation.StandardizeNames
import fr.irisa.cairn.jnimap.isl.ISLSet
import java.util.ArrayList

import static extension alpha.codegen.Factory.customExpr
import static extension alpha.codegen.isl.PolynomialConverter.convert
import static extension alpha.codegen.writeC.Common.getEvalName
import static extension alpha.model.util.AlphaUtil.copyAE
import static extension alpha.model.util.CommonExtensions.toArrayList
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
	
	/** A name checker to ensure names are unique. */
	protected val WriteCNameChecker nameChecker
	
	/** The data type of values in the Alpha variables. */
	protected val BaseDataType valueType
	
	/** The converter to use for turning Alpha expressions into C code. */
	protected val ExprConverter exprConverter
	
	/** Protected constructor. */
	protected new(AlphaSystem system, BaseDataType valueType, boolean oldAlphaZCompatible) {
		this.allocatedVariables = newArrayList
		this.oldAlphaZCompatible = oldAlphaZCompatible
		this.system = system
		this.nameChecker = new WriteCNameChecker
		this.program = ProgramBuilder.start(this.nameChecker)
		this.valueType = valueType
		this.exprConverter = new ExprConverter(valueType)
	}
	
	/**
	 * Converts an Alpha system to the simplified C AST.
	 * Only supports systems with a single body.
	 * Defaults to data being of type "float" and linearizing memory usage.
	 */
	def static convert(AlphaSystem system) {
		return convert(system, BaseDataType.FLOAT, false)
	}
	
	/**
	 * Converts an Alpha system to the simplified C AST.
	 * Only supports systems with a single body.
	 * Defaults to data being of type "float".
	 */
	def static convert(AlphaSystem system, boolean oldAlphaZCompatible) {
		return convert(system, BaseDataType.FLOAT, false)
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
	def static convert(AlphaSystem system, BaseDataType valueType, boolean oldAlphaZCompatible) {
		// Duplicate the system and then preprocess the duplicate
		// by applying normalization and name standardization.
		val duplicate = system.copyAE
		Normalize.apply(duplicate)
		StandardizeNames.apply(duplicate)
		
		return (new SystemConverter(duplicate, valueType, oldAlphaZCompatible)).convertSystem
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
		
		// Declare global variables and memory macros for system parameters, inputs,
		// outputs, and locals. If we need compatibility with the older AlphaZ system,
		// only inputs and outputs need to use the compatibility format.
		// Everything else uses linearized memory.
		val inputOutputFormat = oldAlphaZCompatible ? StorageFormat.OldAlphaZCompatible : StorageFormat.Linearized
		addGlobalIndexVariable(system.parameterDomain.paramNames)
		addGlobalVariable(inputOutputFormat, system.inputs)
		addGlobalVariable(inputOutputFormat, system.outputs)
		addGlobalVariable(StorageFormat.Linearized, system.locals)
		
		// Outputs and locals also need flags variables.
		// These also declare the memory macros for accessing the variables.
		addFlagsVariable(system.outputs)
		addFlagsVariable(system.locals)
		
		// Create all the necessary "eval" functions.
		equations.forEach[createEvalFunction]
		
		// Create the entry point of the program, then return the final program instance.
		val entryPoint = FunctionBuilder
			.start(BaseDataType.VOID, system.name, nameChecker)
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
	// Typing
	/////////////////////////////////////////////////////////////////////////////
	
	def alphaValueType() {
		return alphaVariableType(0)
	}
	
	def alphaVariableType() {
		return alphaVariableType(1)
	}
	
	def alphaVariableType(int indirectionLevel) {
		return Factory.dataType(valueType, indirectionLevel)
	}
	
	
	/////////////////////////////////////////////////////////////////////////////
	// Variable and Memory Macro Declarations
	/////////////////////////////////////////////////////////////////////////////
	
	/** Adds global variables that store indexes (e.g., system parameters). */
	def addGlobalIndexVariable(String... names) {
		for (name : names) {
			program.addGlobalVariable(true, Common.alphaIndexType, name)
		}
	}
	
	/**
	 * Adds a global variable (and memory macro) for the given variables
	 * using the desired format for storing the data of those variables.
	 */
	def addGlobalVariable(StorageFormat format, Variable... variables) {
		// Create variable declarations and add them to the program.
		switch (format) {
			case Linearized: variables.forEach[addLinearizedGlobalVariable]
			case OldAlphaZCompatible: variables.forEach[addCompatibilityGlobalVariable]
			default: throw new IllegalArgumentException("Unrecognized format: " + format.toString)
		}
	}
	
	/**
	 * Adds a global variable (and memory macro) for the given variable
	 * which uses a linear array of memory to minimize the space taken up.
	 */
	def protected addLinearizedGlobalVariable(Variable variable) {
		// Name checking is handled by the program builder.
		program.addGlobalVariable(true, alphaVariableType, variable.name)
		addLinearMemoryMacro(variable.name, variable.domain)
	}
	
	/**
	 * Adds a global variable (and memory macro) for the given variable
	 * which is compatible with wrapper code from the original AlphaZ system.
	 */
	def protected addCompatibilityGlobalVariable(Variable variable) {
		// Scalars are handled somewhat differently in the older AlphaZ system.
		if (variable.domain.nbIndices == 0) {
			return addCompatiblityGlobalScalar(variable)
		}
		
		// Create the global variable.
		// Name checking is handled by the program builder.
		val dataType = alphaVariableType(variable.domain.nbIndices)
		program.addGlobalVariable(true, dataType, variable.name)
		
		// Construct a memory macro for accessing the variable.
		// Since it's a bounding box, simply index the variable by the indices in order.
		val arrayAccess = Factory.arrayAccessExpr(variable.name, variable.domain.indexNames)
		val macro = Factory.macroStmt(variable.name, variable.domain.indexNames, arrayAccess)
		program.addMemoryMacro(macro)
	}
	
	/**
	 * Adds a global variable (and memory macro) for the given scalar variable
	 * which is compatible with wrapper code from the original AlphaZ system.
	 */
	def protected addCompatiblityGlobalScalar(Variable variable) {
		// The older AlphaZ system would pass in the variable as a pointer, just to a single value.
		val dataType = alphaVariableType(1)
		program.addGlobalVariable(true, dataType, variable.name)
		
		val arrayAccess = Factory.arrayAccessExpr(variable.name, "0")
		val macro = Factory.macroStmt(variable.name, variable.domain.indexNames, arrayAccess)
		program.addMemoryMacro(macro)
	}
	
	/**
	 * Adds a global variable (and memory macro) for storing the "flags"
	 * for the given variables, which indicate if a value has been computed already,
	 * is currently being computed (i.e., cyclic dependence), or needs to be
	 * computed still. These always use linearized memory to minimize the amount
	 * of space taken up.
	 */
	def protected addFlagsVariable(Variable... variables) {
		for (variable : variables) {
			// Create the global variable for the linear flag variable
			// and a memory macro for easily accessing that memory.
			// Note: getting the flag name from the name checker will create it.
			val flagName = nameChecker.getFlagName(variable)
			program.addGlobalVariable(true, Common.flagVariableType, flagName)
			addLinearMemoryMacro(flagName, variable.domain)
		}
	}
	
	/**
	 * Adds a memory macro for accessing a linearized variable.
	 * The macro is named the same as the variable.
	 */
	def protected addLinearMemoryMacro(String variableName, ISLSet domain) {
		val rank = MemoryUtils.rank(domain)
		val accessExpression = PolynomialConverter.convert(rank)
		val macroReplacement = Factory.arrayAccessExpr(variableName, accessExpression)
		val macro = Factory.macroStmt(variableName, domain.indexNames, macroReplacement)
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
		// Start building a static, non-inlined function.
		val evalBuilder = FunctionBuilder.start(true, false, alphaValueType, equation.variable.evalName, nameChecker)
		
		// Add a function parameter for each index of the variable's domain.
		val indexNames = equation.expr.contextDomain.indexNames
		indexNames.forEach[evalBuilder.addParameter(Common.alphaIndexType, it)]
		
		// Add the "if" statement that checks the flag variable and evaluates
		// the actual variable if needed, then return the value of the variable.
		val flagCheckingBlock = equation.getFlagCheckingBlock
		evalBuilder.addComment("Check the flags.")
			.addStatement(flagCheckingBlock)
			.addEmptyLine
			.addReturn(equation.identityAccess(false))
		
		program.addFunction(evalBuilder.instance)
	}
	
	/**
	 * Constructs the "if" statement block that checks the status of the flags variable and
	 * evaluates the variable if needed, or reports a self-dependence if detected.
	 */
	def protected getFlagCheckingBlock(StandardEquation equation) {
		// For readability of this code, here is the statement that actually assigns
		// the variable being computed.
		val computeValue = exprConverter.convertExpr(program, equation.expr)
		val computeAndStore = Factory.assignmentStmt(equation.identityAccess(false), computeValue)
		
		// If the flags indicate the value hasn't been evaluated yet:
		//     Set the flag to "in progress"
		//     Evaluate the variable and save its value
		//     Set the flag to "evaluated"
		// Else if the flag indicates the value is "in progress":
		//     Let the user know there is a self dependence
		//     Kill the program
		return IfStmtBuilder
			.start(equation.ifFlagEquals(FlagStatus.NOT_EVALUATED))
			.addStatement(
				equation.setFlagTo(FlagStatus.IN_PROGRESS),
				computeAndStore,
				equation.setFlagTo(FlagStatus.EVALUATED)
			)
			.startElseIf(equation.ifFlagEquals(FlagStatus.IN_PROGRESS))
			.addStatement(
				equation.selfDependencePrintfStmt,
				Factory.exitCall(-1)
			)
			.instance
	}
	
	/** Gets the expression to check if a flags variable is set to a given value. */
	def protected ifFlagEquals(StandardEquation equation, FlagStatus flagStatus) {
		return Factory.binaryExpr(BinaryOperator.EQ, equation.identityAccess(true), Common.toExpr(flagStatus))
	}
	
	/** Gets the statement that sets a flags variable to a given value. */
	def protected setFlagTo(StandardEquation equation, FlagStatus flagStatus) {
		Factory.assignmentStmt(equation.identityAccess(true), Common.toExpr(flagStatus))
	}
	
	/** Gets the expression used to access a variable (or its flag). */
	def protected identityAccess(StandardEquation equation, boolean accessFlags) {
		val name = accessFlags ? nameChecker.getFlagName(equation.variable) : equation.variable.name
		return Factory.callExpr(name, equation.expr.contextDomain.indexNames)
	}
	
	/** Gets the "printf" statement that tells the user a self dependence was found (and where it was). */
	def protected static getSelfDependencePrintfStmt(StandardEquation equation) {
		val locationFormat = (0 ..< equation.expr.contextDomain.nbIndices).map["%ld"].join(",")
		val message = '''"There is a self dependence on «equation.variable.name» at («locationFormat»)\n"'''
		return Factory.printfCall(message, equation.expr.contextDomain.indexNames)
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
		system.inputs.forEach[builder.prepareEntryArgument(it)]
		system.outputs.forEach[builder.prepareEntryArgument(it)]
		
		builder.addEmptyLine
	}
	
	/** Adds a parameter to the function and the assignment statement needed to copy it to the global variable. */
	def protected prepareEntryArgument(FunctionBuilder builder, Variable variable) {
		// Always start with the Alpha variable type, which uses linearized memory.
		// However, if we need compatibility with the older AlphaZ system,
		// change the level of indirection to match the number of indices
		// in the variable's domain (minimum of 1, as scalars are still passed in as pointers).
		val dataType = alphaVariableType
		if (oldAlphaZCompatible) {
			dataType.indirectionLevel = Integer.max(1, variable.domain.nbIndices)
		}
		return builder.prepareEntryArgument(variable.name, dataType)
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
		// If none of the basic sets in the parameter domain have any constraints
		// (i.e., the entire set is unconstrained), there is no need to produce an
		// "if" statement to check if we're in the domain.
		if (system.parameterDomain.basicSets.forall[it.nbConstraints == 0]) {
			return builder
		}
		
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
		val name = allocateFlag ? nameChecker.getFlagName(variable) : variable.name
		val dataType = allocateFlag ? Common.flagVariableType : alphaVariableType
		
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
		// Any loop variables used need to also be declared.
		val islAST = LoopGenerator.generateLoops(macroName, variable.domain)
		val loopResult = ASTConverter.convert(islAST)
		val loopVariables = loopResult.declarations
			.map[Factory.variableDecl(Common.alphaIndexType, it)]
			.toArrayList
		
		builder.addVariable(loopVariables)
			.addStatement(loopResult.statements)
		
		// Undefine the macro now that we're done with it.
		builder.addStatement(Factory.undefStmt(macroName))
	}
}