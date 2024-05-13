package alpha.codegen

/**
 * A builder to aid in the construction of C "if..else if..else" statement.
 * 
 * To start building, use the static "start" method.
 * To get the final result, use the "getInstance()" method.
 * 
 * When you start building the statement, you must provide the conditional
 * expression to use for the first "if" statement.
 * Then, you can add any necessary statements to that "if" block.
 * 
 * Once the first "if" block is complete, you can create any necessary
 * "else if" blocks in the same manner by calling the "startElseIf" method
 * and providing the conditional expression for that block.
 * Then, statements are added to this block in the same manner.
 * 
 * To generate a final "else" block (not "else if"), use the "startElse"
 * method and add statements to the block.
 * 
 * Technically, you can construct the final "else" block and then
 * go back to constructing "else if" blocks, as the "else" block
 * will always appear at the end of the "if..else if..else" block.
 * Be cautious of readability if you do this.
 * 
 * If you call "startElse" again after already constructing an
 * "else" block, the previously built block will be cleared
 * and replaced with the new one you are now building.
 * Be cautious of readability if you do this.
 */
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