package alpha.codegen

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