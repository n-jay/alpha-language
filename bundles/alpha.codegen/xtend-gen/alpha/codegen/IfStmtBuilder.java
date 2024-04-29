package alpha.codegen;

import org.eclipse.xtext.xbase.lib.CollectionExtensions;

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
