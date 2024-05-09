package alpha.codegen

/**
 * A builder to aid in the construction of C programs.
 * 
 * To start building, use the static "start" method.
 * To get the final result, use the "getInstance()" method.
 * 
 * Each region of the program (header comment, includes, etc.)
 * can be added to at any point. The various regions are printed
 * in a deterministic order regardless of when you populated them.
 * However, elements within each region will appear in the order
 * you added them.
 */
class ProgramBuilder {
	////////////////////////////////////////////////
	// Program Instance
	////////////////////////////////////////////////
	
	/** The program instance being built. */
	protected val Program instance
	
	/** Retrieves the instance of the function which was built. */
	def getInstance() {
		return instance
	}
	

	////////////////////////////////////////////////
	// Builder Construction
	////////////////////////////////////////////////
	
	/** Starts building a new program. */
	static def start() {
		return new ProgramBuilder()
	}
	
	/** Protected constructor. */
	protected new() {
		val factory = CodegenFactory.eINSTANCE
		instance = factory.createProgram
		instance.headerComment = factory.createCommentStmt
	}
	

	////////////////////////////////////////////////
	// Program Building
	////////////////////////////////////////////////
	
	/** Adds lines to the program's header comment. */
	def addHeaderComment(String... commentLines) {
		instance.headerComment.addAll(commentLines)
		return this
	}
	
	/** Adds #include directives to the program. */
	def addInclude(Include... includes) {
		instance.includes.addAll(includes)
		return this
	}
	
	/**
	 * Adds macros to the "function macros" section of the program.
	 * Intended to be used for defining common functions like min(a,b) or floor(a).
	 */
	def addFunctionMacro(MacroStmt... macros) {
		instance.functionMacros.addAll(macros)
		return this
	}
	
	/**
	 * Declares a new global variable.
	 * If the variable to add is an exact duplicate of an existing one,
	 * it will be silently skipped.
	 * If it has the same name as an existing one, but different type,
	 * an IllegalArgumentException will be thrown.
	 * Otherwise, the variable will be added.
	 */
	def addGlobalVariable(boolean isStatic, DataType dataType, String name) {
		val decl = Factory.variableDecl(isStatic, dataType, name)
		return addGlobalVariable(decl)
	}
	
	/**
	 * Adds global variable declarations.
	 * If any variable to add is an exact duplicate of an existing one,
	 * it will be silently skipped.
	 * If any variable has the same name as an existing one but a different type,
	 * an IllegalArgumentException will be thrown.
	 * Otherwise, the variable will be added.
	 */
	def addGlobalVariable(VariableDecl... variables) {
		variables.forEach[NameChecker.checkAdd(instance.globalVariables, it)]
		return this
	}
	
	/**
	 * Adds macros to the "memory macros" section of the program.
	 * Intended to be used for defining how the global variables are accessed.
	 */
	def addMemoryMacro(MacroStmt... macros) {
		instance.memoryMacros.addAll(macros)
		return this
	}
	
	/**
	 * Adds functions to the program.
	 * Note: this does NOT check for name conflicts.
	 */
	def addFunction(Function... functions) {
		instance.functions.addAll(functions)
		return this
	}
}