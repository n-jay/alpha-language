package alpha.codegen

class Factory {
	/** The eCore instance of the factory for creating new object instances. */
	protected static val factory = CodegenFactory.eINSTANCE

	////////////////////////////////////////////////
	// Programs and Includes
	////////////////////////////////////////////////
	
	/** Creates a "#include" directive using angle brackets (&lt; and &gt;). */
	def static include(String file) {
		include(file, false)
	}
	
	def static include(String file, boolean useQuotes) {
		val include = factory.createInclude
		include.file = file
		include.useQuotes = useQuotes
		return include
	} 
	
	
	////////////////////////////////////////////////
	// Variables and Data Types
	////////////////////////////////////////////////
	
	def static dataType(BaseDataType baseType, int indirectionLevel) {
		val dataType = factory.createDataType
		dataType.baseType = baseType
		dataType.indirectionLevel = indirectionLevel
		return dataType
	}
	
	def static variableDecl(DataType dataType, String name) {
		val variableDecl = factory.createVariableDecl
		variableDecl.dataType = dataType
		variableDecl.name = name
		return variableDecl
	}


	////////////////////////////////////////////////
	// Functions
	////////////////////////////////////////////////
	
	def static parameter(DataType dataType, String name) {
		val parameter = factory.createParameter
		parameter.dataType = dataType
		parameter.name = name
		return parameter
	}


	////////////////////////////////////////////////
	// Statements
	////////////////////////////////////////////////
	
	def static emptyLineStmt() {
		return factory.createEmptyLineStmt
	}
	
	def static commentStmt(String... commentLines) {
		val comment = factory.createCommentStmt
		comment.addAll(commentLines)
		return comment
	}
	
	def static expressionStmt(Expression expression) {
		val stmt = factory.createExpressionStmt
		stmt.expression = expression
		return stmt
	}
	
	def static macroStmt(String name, String[] arguments, String replacement) {
		val replacementExpr = replacement.customExpr
		return macroStmt(name, arguments, replacementExpr)
	}
	
	def static macroStmt(String name, String[] arguments, Expression replacement) {
		val macro = factory.createMacroStmt
		macro.name = name
		macro.arguments.addAll(arguments)
		macro.replacement = replacement
		return macro
	}
	
	def static undefStmt(String name) {
		val undef = factory.createUndefStmt
		undef.name = name
		return undef
	}
	
	def static assignmentStmt(Expression left, AssignmentOperator assignType, Expression right) {
		val stmt = factory.createAssignmentStmt
		stmt.left = left
		stmt.assignType = assignType
		stmt.right = right
		return stmt
	}
	
	def static returnStmt(Expression expression) {
		val stmt = factory.createReturnStmt
		stmt.expression = expression
		return stmt
	}


	////////////////////////////////////////////////
	// Expressions
	////////////////////////////////////////////////
	
	def static customExpr(String expression) {
		val expr = factory.createCustomExpr
		expr.expression = expression
		return expr
	}
	
	def static parenthesizedExpr(Expression expression) {
		val expr = factory.createParenthesizedExpr
		expr.expression = expression
		return expr
	}
	
	def static castExpr(DataType dataType, Expression expression) {
		val expr = factory.createCastExpr
		expr.dataType = dataType
		expr.expression = expression
		return expr
	}
	
	def static arrayAccessExpr(String variableName, Expression... indexExpressions) {
		val expr = factory.createArrayAccessExpr
		expr.variableName = variableName
		expr.indexExpressions.addAll(indexExpressions)
		return expr
	}
	
	def static callExpr(String functionName, Expression... arguments) {
		val expr = factory.createCallExpr
		expr.functionName = functionName
		expr.arguments.addAll(arguments)
		return expr
	}
	
	def static unaryExpr(UnaryOperator operator, Expression expression) {
		val expr = factory.createUnaryExpr
		expr.operator = operator
		expr.expression = expression
		return expr
	}
	
	def static binaryExpr(BinaryOperator operator, Expression left, Expression right) {
		val expr = factory.createBinaryExpr
		expr.operator = operator
		expr.left = left
		expr.right = right
		return expr
	}
	
	def static ternaryExpr(Expression conditional, Expression thenExpr, Expression elseExpr) {
		val expr = factory.createTernaryExpr
		expr.conditional = conditional
		expr.thenExpr = thenExpr
		expr.elseExpr = elseExpr
		return expr
	}
}