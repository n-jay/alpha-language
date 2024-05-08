package alpha.codegen

/**
 * A builder to aid in the construction a chain of C ternary expressions.
 * 
 * To start building, use the static "start" method.
 * The final result is returned with the "elseCase" method.
 * 
 * When you start building the statement, you must provide both
 * the conditional to check and the expression to evaluate to
 * if the conditional returns TRUE.
 * 
 * You can chain multiple ternary expressions together using the
 * "addCase" method. Successive cases will behave like "else if"
 * blocks from an "if" statement.
 * 
 * Unlike "if..else if..else" statements, an "else" expression is required.
 * This is the expression to evaluate to if none of the conditionals
 * return TRUE. Since no more chaining is possible, adding this final case
 * will return the ternary expression chain that was built.
 */
class TernaryExprBuilder {
	////////////////////////////////////////////////
	// Fields and Expression Instance
	////////////////////////////////////////////////
	
	/** The eCore factory instance. */
	protected static val factory = CodegenFactory.eINSTANCE
	
	/** The top-level ternary expression being built. */
	protected val TernaryExpr instance
	
	/** The current branch of the ternary expression being built. */
	protected var TernaryExpr currentExpr
	

	////////////////////////////////////////////////
	// Builder Construction
	////////////////////////////////////////////////
	
	/**
	 * Starts building a new ternary expression.
	 * Note: this does not check that the expression provided
	 * is actually a conditional expression.
	 */
	static def start(Expression conditional, Expression thenExpr) {
		return new TernaryExprBuilder(conditional, thenExpr)
	}
	
	/** Protected constructor. */
	protected new(Expression conditional, Expression thenExpr) {
		instance = factory.createTernaryExpr
		instance.conditional = conditional
		instance.thenExpr = thenExpr
		
		currentExpr = instance
	}
	

	////////////////////////////////////////////////
	// Expression Building
	////////////////////////////////////////////////
	
	/**
	 * Adds another ternary expression to the chain of expressions being built.
	 * Note: this does not check that the expression provided
	 * is actually a conditional expression.
	 */
	def addCase(Expression conditional, Expression thenExpr) {
		val toAdd = factory.createTernaryExpr
		toAdd.conditional = conditional
		toAdd.thenExpr = thenExpr
		
		currentExpr.elseExpr = toAdd
		currentExpr = toAdd
		return this
	}
	
	/** Adds a final "else" expression to finish this chain of ternary expressions. */
	def elseCase(Expression elseExpr) {
		currentExpr.elseExpr = elseExpr
		return instance
	}
}