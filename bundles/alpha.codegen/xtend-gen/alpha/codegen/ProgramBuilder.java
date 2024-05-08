package alpha.codegen;

import org.eclipse.xtext.xbase.lib.CollectionExtensions;
import org.eclipse.xtext.xbase.lib.Conversions;

/**
 * A builder to aid in the construction of C programs.
 * 
 * To start building, use the static "start" method.
 * To get the final result, use the "getInstance()" method.
 * 
 * Each region of the program (header comment, includes, etc.)
 * can be added to at any point. The various regions are printed
 * in a deterministic order regardless of when you populated them.
 * However, elements within each region will appear in the order
 * you added them.
 */
@SuppressWarnings("all")
public class ProgramBuilder {
  /**
   * The program instance being built.
   */
  protected final Program instance;

  /**
   * Retrieves the instance of the function which was built.
   */
  public Program getInstance() {
    return this.instance;
  }

  /**
   * Starts building a new program.
   */
  public static ProgramBuilder start() {
    return new ProgramBuilder();
  }

  /**
   * Protected constructor.
   */
  protected ProgramBuilder() {
    final CodegenFactory factory = CodegenFactory.eINSTANCE;
    this.instance = factory.createProgram();
    this.instance.setHeaderComment(factory.createCommentStmt());
  }

  /**
   * Adds lines to the program's header comment.
   */
  public ProgramBuilder addHeaderComment(final String... commentLines) {
    this.instance.getHeaderComment().addAll(((Iterable<String>)Conversions.doWrapArray(commentLines)));
    return this;
  }

  /**
   * Adds #include directives to the program.
   */
  public ProgramBuilder addInclude(final Include... includes) {
    CollectionExtensions.<Include>addAll(this.instance.getIncludes(), includes);
    return this;
  }

  /**
   * Adds macros to the "function macros" section of the program.
   * Intended to be used for defining common functions like min(a,b) or floor(a).
   */
  public ProgramBuilder addFunctionMacro(final MacroStmt... macros) {
    CollectionExtensions.<MacroStmt>addAll(this.instance.getFunctionMacros(), macros);
    return this;
  }

  /**
   * Declares a new global variable.
   * Note: this does NOT check for name conflicts.
   */
  public ProgramBuilder addGlobalVariable(final boolean isStatic, final DataType dataType, final String name) {
    final VariableDecl decl = Factory.variableDecl(isStatic, dataType, name);
    return this.addGlobalVariable(decl);
  }

  /**
   * Adds global variable declarations.
   * Note: this does NOT check for name conflicts.
   */
  public ProgramBuilder addGlobalVariable(final VariableDecl... variables) {
    CollectionExtensions.<VariableDecl>addAll(this.instance.getGlobalVariables(), variables);
    return this;
  }

  /**
   * Adds macros to the "memory macros" section of the program.
   * Intended to be used for defining how the global variables are accessed.
   */
  public ProgramBuilder addMemoryMacro(final MacroStmt... macros) {
    CollectionExtensions.<MacroStmt>addAll(this.instance.getMemoryMacros(), macros);
    return this;
  }

  /**
   * Adds functions to the program.
   * Note: this does NOT check for name conflicts.
   */
  public ProgramBuilder addFunction(final Function... functions) {
    CollectionExtensions.<Function>addAll(this.instance.getFunctions(), functions);
    return this;
  }
}
