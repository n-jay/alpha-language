package alpha.codegen

class IfStmtBuilder {
	////////////////////////////////////////////////
	// Fields and Statement Instance
	////////////////////////////////////////////////
	
	/** The eCore factory instance. */
	protected static val factory = CodegenFactory.eINSTANCE

	/** The "if" statement instance being built. */
	protected val IfStmt instance
	
	/** The current branch of the "if" statement being built. */
	protected var Branch currentBranch
	
	/** Retrieves the instance of the function which was built. */
	def getInstance() {
		return instance
	}
	

	////////////////////////////////////////////////
	// Builder Construction
	////////////////////////////////////////////////
	
	/**
	 * Starts building a new "if" statement.
	 * Note: this does not check that the expression provided
	 * is actually a conditional expression.
	 */
	static def start(Expression conditional) {
		return new IfStmtBuilder(conditional)
	}
	
	/** Protected constructor. */
	protected new(Expression conditional) {
		// Construct the first branch of the "if" statement
		// and record it as the current branch being built.
		val ifBranch = factory.createConditionalBranch
		ifBranch.conditional = conditional
		currentBranch = ifBranch
		
		// Construct a new "if" statement instance
		// and set its "if" branch to be the above branch.
		instance = CodegenFactory.eINSTANCE.createIfStmt
		instance.ifBranch = ifBranch
	}
	

	////////////////////////////////////////////////
	// Statement Building
	////////////////////////////////////////////////
	
	/** Adds statements to the body of the current branch. */
	def addStatement(Statement... statements) {
		currentBranch.body.addAll(statements)
		return this
	}
	
	/**
	 * Starts a new "else if" branch.
	 * Note: this does not check that the expression provided
	 * is actually a conditional expression.
	 */
	def startElseIf(Expression conditional) {
		val branch = factory.createConditionalBranch
		branch.conditional = conditional
		
		instance.elseIfBranches.add(branch)
		currentBranch = branch
		return this
	}
	
	/**
	 * Starts the "else" branch.
	 * Note: if this is called more than once, successive calls will
	 * clear any previous "else" branches which were constructed.
	 */
	def startElse() {
		val branch = factory.createBranch
		
		instance.elseBranch = branch
		currentBranch = branch
		return this
	}
}