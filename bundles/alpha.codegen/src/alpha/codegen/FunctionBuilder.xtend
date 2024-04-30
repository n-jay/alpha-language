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
	
	/** Starts building a new, non-inlined C function with a non-pointer return type. */
	static def start(BaseDataType returnType, String name) {
		val dataType = Factory.dataType(returnType, 0)
		return new FunctionBuilder(false, dataType, name)
	}
	
	/** Starts building a new, non-inlined C function. */
	static def start(DataType returnType, String name) {
		return new FunctionBuilder(false, returnType, name)
	}
	
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
	 * Adds a new parameter to the function.
	 * Note: this does NOT check for name conflicts.
	 */
	def addParameter(DataType dataType, String name) {
		val parameter = Factory.parameter(dataType, name)
		return addParameter(parameter)
	}
	
	/**
	 * Adds new parameters to the function.
	 * Note: this does NOT check for name conflicts.
	 */
	def addParameter(Parameter... parameters) {
		instance.parameters.addAll(parameters)
		return this
	}
	
	/**
	 * Declares a new variable for use in the function being built.
	 * Note: this does NOT check for name conflicts.
	 */
	def addVariable(DataType dataType, String name) {
		val decl = Factory.variableDecl(dataType, name)
		return addVariable(decl)
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
	
	/** Adds undefine statements for the given macros. */
	def addUndefine(MacroStmt... macros) {
		return macros.map[Factory.undefStmt(it.name)].addStatement
	}
	
	/** Adds a return statement for the given expression. */
	def addReturn(Expression expr) {
		return addStatement(Factory.returnStmt(expr))
	}
}