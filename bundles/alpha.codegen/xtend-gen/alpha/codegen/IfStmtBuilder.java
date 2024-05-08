package alpha.codegen;

import org.eclipse.xtext.xbase.lib.CollectionExtensions;

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
@SuppressWarnings("all")
public class IfStmtBuilder {
  /**
   * The eCore factory instance.
   */
  protected static final CodegenFactory factory = CodegenFactory.eINSTANCE;

  /**
   * The "if" statement instance being built.
   */
  protected final IfStmt instance;

  /**
   * The current branch of the "if" statement being built.
   */
  protected Branch currentBranch;

  /**
   * Retrieves the instance of the function which was built.
   */
  public IfStmt getInstance() {
    return this.instance;
  }

  /**
   * Starts building a new "if" statement.
   * Note: this does not check that the expression provided
   * is actually a conditional expression.
   */
  public static IfStmtBuilder start(final Expression conditional) {
    return new IfStmtBuilder(conditional);
  }

  /**
   * Protected constructor.
   */
  protected IfStmtBuilder(final Expression conditional) {
    final ConditionalBranch ifBranch = IfStmtBuilder.factory.createConditionalBranch();
    ifBranch.setConditional(conditional);
    this.currentBranch = ifBranch;
    this.instance = CodegenFactory.eINSTANCE.createIfStmt();
    this.instance.setIfBranch(ifBranch);
  }

  /**
   * Adds statements to the body of the current branch.
   */
  public IfStmtBuilder addStatement(final Statement... statements) {
    CollectionExtensions.<Statement>addAll(this.currentBranch.getBody(), statements);
    return this;
  }

  /**
   * Starts a new "else if" branch.
   * Note: this does not check that the expression provided
   * is actually a conditional expression.
   */
  public IfStmtBuilder startElseIf(final Expression conditional) {
    final ConditionalBranch branch = IfStmtBuilder.factory.createConditionalBranch();
    branch.setConditional(conditional);
    this.instance.getElseIfBranches().add(branch);
    this.currentBranch = branch;
    return this;
  }

  /**
   * Starts the "else" branch.
   * Note: if this is called more than once, successive calls will
   * clear any previous "else" branches which were constructed.
   */
  public IfStmtBuilder startElse() {
    final Branch branch = IfStmtBuilder.factory.createBranch();
    this.instance.setElseBranch(branch);
    this.currentBranch = branch;
    return this;
  }
}
