package alpha.codegen.isl;

import alpha.codegen.CustomExpr;
import alpha.codegen.ExpressionStmt;
import alpha.codegen.Factory;
import alpha.codegen.IfStmt;
import alpha.codegen.IfStmtBuilder;
import alpha.codegen.LoopStmt;
import alpha.codegen.Statement;
import fr.irisa.cairn.jnimap.isl.ISLASTBlockNode;
import fr.irisa.cairn.jnimap.isl.ISLASTExpression;
import fr.irisa.cairn.jnimap.isl.ISLASTForNode;
import fr.irisa.cairn.jnimap.isl.ISLASTIfNode;
import fr.irisa.cairn.jnimap.isl.ISLASTNode;
import fr.irisa.cairn.jnimap.isl.ISLASTNodeList;
import fr.irisa.cairn.jnimap.isl.ISLASTUserNode;
import java.util.Arrays;
import java.util.Collections;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class ASTConverter {
  /**
   * A "user" node is just an expression statement, so we can directly
   * convert the expression it contains into a statement.
   */
  protected static Iterable<Statement> _convert(final ISLASTUserNode node) {
    ExpressionStmt _customStmt = Factory.customStmt(node.getExpression().toCString());
    return Collections.<Statement>unmodifiableList(CollectionLiterals.<Statement>newArrayList(_customStmt));
  }

  /**
   * A "block" node just contains more nodes within it.
   */
  protected static Iterable<Statement> _convert(final ISLASTBlockNode node) {
    final ISLASTNodeList childrenList = node.getChildren();
    int _nbNodes = childrenList.getNbNodes();
    final Function1<Integer, ISLASTNode> _function = (Integer it) -> {
      return childrenList.get((it).intValue());
    };
    final Function1<ISLASTNode, Iterable<Statement>> _function_1 = (ISLASTNode it) -> {
      return ASTConverter.convert(it);
    };
    return IterableExtensions.<ISLASTNode, Statement>flatMap(IterableExtensions.<Integer, ISLASTNode>map(new ExclusiveRange(0, _nbNodes, true), _function), _function_1);
  }

  /**
   * A "for" node corresponds to a loop statement.
   */
  protected static Iterable<Statement> _convert(final ISLASTForNode node) {
    final String loopVariable = node.getIterator().toCString();
    final CustomExpr initializer = ASTConverter.getCustomExpr(node.getInit());
    final CustomExpr conditional = ASTConverter.getCustomExpr(node.getCond());
    final CustomExpr incrementBy = ASTConverter.getCustomExpr(node.getInc());
    final Iterable<Statement> body = ASTConverter.convert(node.getBody());
    LoopStmt _loopStmt = Factory.loopStmt(loopVariable, initializer, conditional, incrementBy, ((Statement[])Conversions.unwrapArray(body, Statement.class)));
    return Collections.<Statement>unmodifiableList(CollectionLiterals.<Statement>newArrayList(_loopStmt));
  }

  /**
   * An "if" node corresponds to an If statement.
   * If there is an "else" node which is actually another "if" node,
   * then we convert that to an "else if" block using the "convertConditional"
   * dispatch methods.
   */
  protected static Iterable<Statement> _convert(final ISLASTIfNode node) {
    final IfStmtBuilder builder = IfStmtBuilder.start(ASTConverter.getCustomExpr(node.getCond())).addStatement(((Statement[])Conversions.unwrapArray(ASTConverter.convert(node.getThen()), Statement.class)));
    int _hasElse = node.hasElse();
    boolean _greaterThan = (_hasElse > 0);
    if (_greaterThan) {
      ASTConverter.convertConditional(node.getElse(), builder);
    }
    IfStmt _instance = builder.getInstance();
    return Collections.<Statement>unmodifiableList(CollectionLiterals.<Statement>newArrayList(_instance));
  }

  /**
   * If the "else" of an "if" node is another "if" node, build an "else if" block.
   */
  protected static void _convertConditional(final ISLASTIfNode node, final IfStmtBuilder builder) {
    builder.startElseIf(ASTConverter.getCustomExpr(node.getCond())).addStatement(((Statement[])Conversions.unwrapArray(ASTConverter.convert(node.getThen()), Statement.class)));
    int _hasElse = node.hasElse();
    boolean _greaterThan = (_hasElse > 0);
    if (_greaterThan) {
      ASTConverter.convertConditional(node.getElse(), builder);
    }
  }

  /**
   * If the "else" of an "if" node isn't another "if" node, build an "else" block.
   */
  protected static void _convertConditional(final ISLASTNode node, final IfStmtBuilder builder) {
    builder.startElse().addStatement(((Statement[])Conversions.unwrapArray(ASTConverter.convert(node), Statement.class)));
  }

  /**
   * Handles if the AST node type doesn't have a rule made for it.
   */
  protected static Iterable<Statement> _convert(final ISLASTNode node) {
    try {
      throw new Exception("Not implemented yet!");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  /**
   * ISL expression nodes can just be converted to their C string.
   */
  public static CustomExpr getCustomExpr(final ISLASTExpression expression) {
    return Factory.customExpr(expression.toCString());
  }

  public static Iterable<Statement> convert(final ISLASTNode node) {
    if (node instanceof ISLASTBlockNode) {
      return _convert((ISLASTBlockNode)node);
    } else if (node instanceof ISLASTForNode) {
      return _convert((ISLASTForNode)node);
    } else if (node instanceof ISLASTIfNode) {
      return _convert((ISLASTIfNode)node);
    } else if (node instanceof ISLASTUserNode) {
      return _convert((ISLASTUserNode)node);
    } else if (node != null) {
      return _convert(node);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(node).toString());
    }
  }

  protected static void convertConditional(final ISLASTNode node, final IfStmtBuilder builder) {
    if (node instanceof ISLASTIfNode) {
      _convertConditional((ISLASTIfNode)node, builder);
      return;
    } else if (node != null) {
      _convertConditional(node, builder);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(node, builder).toString());
    }
  }
}
