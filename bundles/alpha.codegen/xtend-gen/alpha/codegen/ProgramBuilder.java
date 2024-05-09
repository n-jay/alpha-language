package alpha.codegen;

import java.util.List;
import java.util.function.Consumer;
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
   * If the variable to add is an exact duplicate of an existing one,
   * it will be silently skipped.
   * If it has the same name as an existing one, but different type,
   * an IllegalArgumentException will be thrown.
   * Otherwise, the variable will be added.
   */
  public ProgramBuilder addGlobalVariable(final boolean isStatic, final DataType dataType, final String name) {
    final VariableDecl decl = Factory.variableDecl(isStatic, dataType, name);
    return this.addGlobalVariable(decl);
  }

  /**
   * Adds global variable declarations.
   * If any variable to add is an exact duplicate of an existing one,
   * it will be silently skipped.
   * If any variable has the same name as an existing one but a different type,
   * an IllegalArgumentException will be thrown.
   * Otherwise, the variable will be added.
   */
  public ProgramBuilder addGlobalVariable(final VariableDecl... variables) {
    final Consumer<VariableDecl> _function = (VariableDecl it) -> {
      NameChecker.checkAdd(this.instance.getGlobalVariables(), it);
    };
    ((List<VariableDecl>)Conversions.doWrapArray(variables)).forEach(_function);
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
