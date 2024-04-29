package alpha.codegen;

import org.eclipse.xtext.xbase.lib.CollectionExtensions;

@SuppressWarnings("all")
public class FunctionBuilder {
  /**
   * The function instance being built.
   */
  protected final Function instance;

  /**
   * Retrieves the instance of the function which was built.
   */
  public Function getInstance() {
    return this.instance;
  }

  /**
   * Starts building a new C function.
   */
  public static FunctionBuilder start(final Boolean isInline, final DataType returnType, final String name) {
    return new FunctionBuilder(isInline, returnType, name);
  }

  /**
   * Protected constructor.
   */
  protected FunctionBuilder(final Boolean isInline, final DataType returnType, final String name) {
    this.instance = CodegenFactory.eINSTANCE.createFunction();
    this.instance.setIsInline(isInline);
    this.instance.setReturnType(returnType);
    this.instance.setName(name);
  }

  /**
   * Adds new parameter to the function.
   * Note: this does NOT check for name conflicts.
   */
  public FunctionBuilder addParameter(final Parameter... parameters) {
    CollectionExtensions.<Parameter>addAll(this.instance.getParameters(), parameters);
    return this;
  }

  /**
   * Declares new variables for use in the function being built.
   * Note: this does NOT check for name conflicts.
   */
  public FunctionBuilder addVariable(final VariableDecl... variables) {
    CollectionExtensions.<VariableDecl>addAll(this.instance.getDeclarations(), variables);
    return this;
  }

  /**
   * Adds statements to the function being built.
   */
  public FunctionBuilder addStatement(final Statement... statements) {
    CollectionExtensions.<Statement>addAll(this.instance.getStatements(), statements);
    return this;
  }

  /**
   * Adds a comment to the function being built.
   */
  public FunctionBuilder addComment(final String... commentLines) {
    final CommentStmt comment = Factory.commentStmt(commentLines);
    return this.addStatement(comment);
  }

  /**
   * Adds an empty line to the function being built.
   */
  public FunctionBuilder addEmptyLine() {
    return this.addStatement(Factory.emptyLineStmt());
  }
}
