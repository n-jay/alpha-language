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
   * A name checker to ensure all names are unique.
   */
  protected final NameChecker nameChecker;

  /**
   * Retrieves the instance of the program which was built.
   */
  public Program getInstance() {
    return this.instance;
  }

  /**
   * Retrieves the name checker being used for building this program.
   */
  public NameChecker getNameChecker() {
    return this.nameChecker;
  }

  /**
   * Starts building a new program using the given name checker.
   */
  public static ProgramBuilder start(final NameChecker nameChecker) {
    return new ProgramBuilder(nameChecker);
  }

  /**
   * Protected constructor.
   */
  protected ProgramBuilder(final NameChecker nameChecker) {
    final CodegenFactory factory = CodegenFactory.eINSTANCE;
    this.instance = factory.createProgram();
    this.instance.setHeaderComment(factory.createCommentStmt());
    this.nameChecker = nameChecker;
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
   * If any of the names are duplicates of anything else in the global scope,
   * a NameConflictException will be thrown.
   */
  public ProgramBuilder addFunctionMacro(final MacroStmt... macros) {
    final Consumer<MacroStmt> _function = (MacroStmt it) -> {
      this.nameChecker.checkAddGlobal(it.getName());
    };
    ((List<MacroStmt>)Conversions.doWrapArray(macros)).forEach(_function);
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
   * If any of the names are duplicates of anything else in the global scope,
   * a NameConflictException will be thrown.
   */
  public ProgramBuilder addGlobalVariable(final VariableDecl... variables) {
    final Consumer<VariableDecl> _function = (VariableDecl it) -> {
      this.nameChecker.checkAddGlobal(it.getName());
    };
    ((List<VariableDecl>)Conversions.doWrapArray(variables)).forEach(_function);
    CollectionExtensions.<VariableDecl>addAll(this.instance.getGlobalVariables(), variables);
    return this;
  }

  /**
   * Adds macros to the "memory macros" section of the program.
   * Intended to be used for defining how the global variables are accessed.
   * Name checking is not performed, as we often want the memory macro's name
   * to match a global variable's name.
   */
  public ProgramBuilder addMemoryMacro(final MacroStmt... macros) {
    CollectionExtensions.<MacroStmt>addAll(this.instance.getMemoryMacros(), macros);
    return this;
  }

  /**
   * Adds functions to the program.
   * If any of the names are duplicates of anything else in the global scope,
   * a NameConflictException will be thrown.
   */
  public ProgramBuilder addFunction(final Function... functions) {
    final Consumer<Function> _function = (Function it) -> {
      this.nameChecker.checkAddGlobal(it.getName());
    };
    ((List<Function>)Conversions.doWrapArray(functions)).forEach(_function);
    CollectionExtensions.<Function>addAll(this.instance.getFunctions(), functions);
    return this;
  }

  /**
   * Starts building a function using this program's name checker.
   */
  public FunctionBuilder startFunction(final boolean isStatic, final boolean isInline, final DataType returnType, final String name) {
    return FunctionBuilder.start(isStatic, isInline, returnType, name, this.nameChecker);
  }
}
