package alpha.codegen;

import alpha.model.util.CommonExtensions;
import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtext.xbase.lib.CollectionExtensions;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

/**
 * A builder to aid in the construction of C functions.
 * 
 * To start building, use one of the static "start" methods.
 * To get the final result, use the "getInstance()" method.
 * 
 * Parameters, local variables, and statements can be added
 * at any point while building the function.
 * 
 * Parameters will appear in the order they're added.
 * Local variables will all be declared (with no initial value)
 * at the start of the function in the order they're added.
 * Statements, comments, etc. will appear after the variable
 * declarations in the order they're added.
 */
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
   * Starts building a new, non-inlined C function with a non-pointer return type.
   */
  public static FunctionBuilder start(final BaseDataType returnType, final String name) {
    final DataType dataType = Factory.dataType(returnType, 0);
    return new FunctionBuilder(Boolean.valueOf(false), dataType, name);
  }

  /**
   * Starts building a new, non-inlined C function.
   */
  public static FunctionBuilder start(final DataType returnType, final String name) {
    return new FunctionBuilder(Boolean.valueOf(false), returnType, name);
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
   * Adds a new parameter to the function.
   * Note: this does NOT check for name conflicts.
   */
  public FunctionBuilder addParameter(final DataType dataType, final String name) {
    final Parameter parameter = Factory.parameter(dataType, name);
    return this.addParameter(parameter);
  }

  /**
   * Adds new parameters to the function.
   * Note: this does NOT check for name conflicts.
   */
  public FunctionBuilder addParameter(final Parameter... parameters) {
    CollectionExtensions.<Parameter>addAll(this.instance.getParameters(), parameters);
    return this;
  }

  /**
   * Declares a new variable for use in the function being built.
   * If the variable to add is an exact duplicate of an existing one,
   * it will be silently skipped.
   * If it has the same name as an existing one, but different type,
   * an IllegalArgumentException will be thrown.
   * Otherwise, the variable will be added.
   */
  public FunctionBuilder addVariable(final DataType dataType, final String name) {
    final VariableDecl decl = Factory.variableDecl(dataType, name);
    return this.addVariable(decl);
  }

  /**
   * Declares new variables for use in the function being built.
   * If the variable to add is an exact duplicate of an existing one,
   * it will be silently skipped.
   * If it has the same name as an existing one, but different type,
   * an IllegalArgumentException will be thrown.
   * Otherwise, the variable will be added.
   */
  public FunctionBuilder addVariable(final VariableDecl variable) {
    final Function1<VariableDecl, Boolean> _function = (VariableDecl it) -> {
      return Boolean.valueOf(this.hasSameName(it, variable));
    };
    final ArrayList<VariableDecl> sameName = CommonExtensions.<VariableDecl>toArrayList(IterableExtensions.<VariableDecl>filter(this.instance.getDeclarations(), _function));
    boolean _isEmpty = sameName.isEmpty();
    if (_isEmpty) {
      this.instance.getDeclarations().add(variable);
      return this;
    }
    final Function1<VariableDecl, Boolean> _function_1 = (VariableDecl it) -> {
      return Boolean.valueOf(this.hasDifferentType(it, variable));
    };
    boolean _exists = IterableExtensions.<VariableDecl>exists(sameName, _function_1);
    if (_exists) {
      String _name = variable.getName();
      String _plus = ("Duplicate declarations for variable \'" + _name);
      String _plus_1 = (_plus + "\' with different types.");
      throw new IllegalArgumentException(_plus_1);
    }
    return this;
  }

  protected boolean hasSameName(final VariableDecl first, final VariableDecl second) {
    String _name = first.getName();
    String _name_1 = second.getName();
    return Objects.equal(_name, _name_1);
  }

  protected boolean hasDifferentType(final VariableDecl first, final VariableDecl second) {
    return ((!Objects.equal(first.getDataType().getBaseType(), second.getDataType().getBaseType())) || (first.getDataType().getIndirectionLevel() != second.getDataType().getIndirectionLevel()));
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

  /**
   * Adds undefine statements for the given macros.
   */
  public FunctionBuilder addUndefine(final MacroStmt... macros) {
    final Function1<MacroStmt, UndefStmt> _function = (MacroStmt it) -> {
      return Factory.undefStmt(it.getName());
    };
    return this.addStatement(((Statement[])Conversions.unwrapArray(ListExtensions.<MacroStmt, UndefStmt>map(((List<MacroStmt>)Conversions.doWrapArray(macros)), _function), Statement.class)));
  }

  /**
   * Adds a return statement for the given expression.
   */
  public FunctionBuilder addReturn(final Expression expr) {
    return this.addStatement(Factory.returnStmt(expr));
  }
}
