package alpha.codegen

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
	 * Adds global variable declarations.
	 * Note: this does NOT check for name conflicts.
	 */
	def addGlobalVariable(VariableDecl... variables) {
		instance.globalVariables.addAll(variables)
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