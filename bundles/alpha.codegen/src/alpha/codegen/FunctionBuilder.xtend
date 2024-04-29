package alpha.codegen

class FunctionBuilder {
	////////////////////////////////////////////////
	// Function Instance
	////////////////////////////////////////////////

	/** The function instance being built. */
	protected val Function instance
	
	/** Retrieves the instance of the function which was built. */
	def getInstance() {
		return instance
	}
	

	////////////////////////////////////////////////
	// Builder Construction
	////////////////////////////////////////////////
	
	/** Starts building a new C function. */
	static def start(Boolean isInline, DataType returnType, String name) {
		return new FunctionBuilder(isInline, returnType, name)
	}
	
	/** Protected constructor. */
	protected new(Boolean isInline, DataType returnType, String name) {
		instance = CodegenFactory.eINSTANCE.createFunction
		instance.isInline = isInline
		instance.returnType = returnType
		instance.name = name
	}
	

	////////////////////////////////////////////////
	// Function Building
	////////////////////////////////////////////////
	
	/**
	 * Adds new parameter to the function.
	 * Note: this does NOT check for name conflicts.
	 */
	def addParameter(Parameter... parameters) {
		instance.parameters.addAll(parameters)
		return this
	}
	
	/**
	 * Declares new variables for use in the function being built.
	 * Note: this does NOT check for name conflicts.
	 */
	def addVariable(VariableDecl... variables) {
		instance.declarations.addAll(variables)
		return this
	}
	
	/** Adds statements to the function being built. */
	def addStatement(Statement... statements) {
		instance.statements.addAll(statements)
		return this
	}
	
	/** Adds a comment to the function being built. */
	def addComment(String... commentLines) {
		val comment = Factory.commentStmt(commentLines)
		return addStatement(comment)
	}
	
	/** Adds an empty line to the function being built. */
	def addEmptyLine() {
		return addStatement(Factory.emptyLineStmt)
	}
}