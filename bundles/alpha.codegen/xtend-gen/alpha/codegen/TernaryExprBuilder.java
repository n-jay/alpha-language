package alpha.codegen;

@SuppressWarnings("all")
public class TernaryExprBuilder {
  /**
   * The eCore factory instance.
   */
  protected static final CodegenFactory factory = CodegenFactory.eINSTANCE;

  /**
   * The top-level ternary expression being built.
   */
  protected final TernaryExpr instance;

  /**
   * The current branch of the ternary expression being built.
   */
  protected TernaryExpr currentExpr;

  /**
   * Starts building a new ternary expression.
   * Note: this does not check that the expression provided
   * is actually a conditional expression.
   */
  public static TernaryExprBuilder start(final Expression conditional, final Expression thenExpr) {
    return new TernaryExprBuilder(conditional, thenExpr);
  }

  /**
   * Protected constructor.
   */
  protected TernaryExprBuilder(final Expression conditional, final Expression thenExpr) {
    this.instance = TernaryExprBuilder.factory.createTernaryExpr();
    this.instance.setConditional(conditional);
    this.instance.setThenExpr(thenExpr);
    this.currentExpr = this.instance;
  }

  /**
   * Adds another ternary expression to the chain of expressions being built.
   * Note: this does not check that the expression provided
   * is actually a conditional expression.
   */
  public TernaryExprBuilder addCase(final Expression conditional, final Expression thenExpr) {
    final TernaryExpr toAdd = TernaryExprBuilder.factory.createTernaryExpr();
    toAdd.setConditional(conditional);
    toAdd.setThenExpr(thenExpr);
    this.currentExpr.setElseExpr(toAdd);
    this.currentExpr = toAdd;
    return this;
  }

  /**
   * Adds a final "else" expression to finish this chain of ternary expressions.
   */
  public TernaryExpr elseCase(final Expression elseExpr) {
    this.currentExpr.setElseExpr(elseExpr);
    return this.instance;
  }
}
