package alpha.codegen;

import org.eclipse.xtext.xbase.lib.CollectionExtensions;
import org.eclipse.xtext.xbase.lib.Conversions;

@SuppressWarnings("all")
public class Factory {
  /**
   * The eCore instance of the factory for creating new object instances.
   */
  protected static final CodegenFactory factory = CodegenFactory.eINSTANCE;

  /**
   * Creates a "#include" directive using angle brackets (&lt; and &gt;).
   */
  public static Include include(final String file) {
    return Factory.include(file, false);
  }

  public static Include include(final String file, final boolean useQuotes) {
    final Include include = Factory.factory.createInclude();
    include.setFile(file);
    include.setUseQuotes(useQuotes);
    return include;
  }

  public static DataType dataType(final BaseDataType baseType, final int indirectionLevel) {
    final DataType dataType = Factory.factory.createDataType();
    dataType.setBaseType(baseType);
    dataType.setIndirectionLevel(indirectionLevel);
    return dataType;
  }

  public static VariableDecl variableDecl(final DataType dataType, final String name) {
    final VariableDecl variableDecl = Factory.factory.createVariableDecl();
    variableDecl.setDataType(dataType);
    variableDecl.setName(name);
    return variableDecl;
  }

  public static Parameter parameter(final DataType dataType, final String name) {
    final Parameter parameter = Factory.factory.createParameter();
    parameter.setDataType(dataType);
    parameter.setName(name);
    return parameter;
  }

  public static EmptyLineStmt emptyLineStmt() {
    return Factory.factory.createEmptyLineStmt();
  }

  public static CommentStmt commentStmt(final String... commentLines) {
    final CommentStmt comment = Factory.factory.createCommentStmt();
    comment.addAll(((Iterable<String>)Conversions.doWrapArray(commentLines)));
    return comment;
  }

  public static ExpressionStmt expressionStmt(final Expression expression) {
    final ExpressionStmt stmt = Factory.factory.createExpressionStmt();
    stmt.setExpression(expression);
    return stmt;
  }

  public static MacroStmt macroStmt(final String name, final String[] arguments, final String replacement) {
    final CustomExpr replacementExpr = Factory.customExpr(replacement);
    return Factory.macroStmt(name, arguments, replacementExpr);
  }

  public static MacroStmt macroStmt(final String name, final String[] arguments, final Expression replacement) {
    final MacroStmt macro = Factory.factory.createMacroStmt();
    macro.setName(name);
    CollectionExtensions.<String>addAll(macro.getArguments(), arguments);
    macro.setReplacement(replacement);
    return macro;
  }

  public static UndefStmt undefStmt(final String name) {
    final UndefStmt undef = Factory.factory.createUndefStmt();
    undef.setName(name);
    return undef;
  }

  public static AssignmentStmt assignmentStmt(final Expression left, final AssignmentOperator assignType, final Expression right) {
    final AssignmentStmt stmt = Factory.factory.createAssignmentStmt();
    stmt.setLeft(left);
    stmt.setAssignType(assignType);
    stmt.setRight(right);
    return stmt;
  }

  public static ReturnStmt returnStmt(final Expression expression) {
    final ReturnStmt stmt = Factory.factory.createReturnStmt();
    stmt.setExpression(expression);
    return stmt;
  }

  public static CustomExpr customExpr(final String expression) {
    final CustomExpr expr = Factory.factory.createCustomExpr();
    expr.setExpression(expression);
    return expr;
  }

  public static ParenthesizedExpr parenthesizedExpr(final Expression expression) {
    final ParenthesizedExpr expr = Factory.factory.createParenthesizedExpr();
    expr.setExpression(expression);
    return expr;
  }

  public static CastExpr castExpr(final DataType dataType, final Expression expression) {
    final CastExpr expr = Factory.factory.createCastExpr();
    expr.setDataType(dataType);
    expr.setExpression(expression);
    return expr;
  }

  public static ArrayAccessExpr arrayAccessExpr(final String variableName, final Expression... indexExpressions) {
    final ArrayAccessExpr expr = Factory.factory.createArrayAccessExpr();
    expr.setVariableName(variableName);
    CollectionExtensions.<Expression>addAll(expr.getIndexExpressions(), indexExpressions);
    return expr;
  }

  public static CallExpr callExpr(final String functionName, final Expression... arguments) {
    final CallExpr expr = Factory.factory.createCallExpr();
    expr.setFunctionName(functionName);
    CollectionExtensions.<Expression>addAll(expr.getArguments(), arguments);
    return expr;
  }

  public static UnaryExpr unaryExpr(final UnaryOperator operator, final Expression expression) {
    final UnaryExpr expr = Factory.factory.createUnaryExpr();
    expr.setOperator(operator);
    expr.setExpression(expression);
    return expr;
  }

  public static BinaryExpr binaryExpr(final BinaryOperator operator, final Expression left, final Expression right) {
    final BinaryExpr expr = Factory.factory.createBinaryExpr();
    expr.setOperator(operator);
    expr.setLeft(left);
    expr.setRight(right);
    return expr;
  }

  public static TernaryExpr ternaryExpr(final Expression conditional, final Expression thenExpr, final Expression elseExpr) {
    final TernaryExpr expr = Factory.factory.createTernaryExpr();
    expr.setConditional(conditional);
    expr.setThenExpr(thenExpr);
    expr.setElseExpr(elseExpr);
    return expr;
  }
}
