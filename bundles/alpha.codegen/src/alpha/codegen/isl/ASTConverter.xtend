package alpha.codegen.isl

import alpha.codegen.Factory
import alpha.codegen.IfStmtBuilder
import alpha.codegen.Statement
import fr.irisa.cairn.jnimap.isl.ISLASTBlockNode
import fr.irisa.cairn.jnimap.isl.ISLASTExpression
import fr.irisa.cairn.jnimap.isl.ISLASTForNode
import fr.irisa.cairn.jnimap.isl.ISLASTIfNode
import fr.irisa.cairn.jnimap.isl.ISLASTNode
import fr.irisa.cairn.jnimap.isl.ISLASTUserNode

class ASTConverter {
	/**
	 * A "user" node is just an expression statement, so we can directly
	 * convert the expression it contains into a statement.
	 */
	def static dispatch Iterable<Statement> convert(ISLASTUserNode node) {
		return #[Factory.customStmt(node.expression.toCString)]
	}
	
	/** A "block" node just contains more nodes within it. */
	def static dispatch Iterable<Statement> convert(ISLASTBlockNode node) {
		val childrenList = node.getChildren()
		return (0 ..< childrenList.nbNodes)
			.map[childrenList.get(it)]
			.flatMap[convert]
	}
	
	/** A "for" node corresponds to a loop statement. */
	def static dispatch Iterable<Statement> convert(ISLASTForNode node) {
		val loopVariable = node.iterator.toCString
		val initializer = node.init.customExpr
		val conditional = node.cond.customExpr
		val incrementBy = node.inc.customExpr
		val body = node.body.convert
		
		return #[Factory.loopStmt(loopVariable, initializer, conditional, incrementBy, body)]
	}
	
	/**
	 * An "if" node corresponds to an If statement.
	 * If there is an "else" node which is actually another "if" node,
	 * then we convert that to an "else if" block using the "convertConditional"
	 * dispatch methods.
	 */
	def static dispatch Iterable<Statement> convert(ISLASTIfNode node) {
		// Create a conditional builder and add the "then" block.
		val builder = IfStmtBuilder.start(node.cond.customExpr)
			.addStatement(node.then.convert)
		
		// If there's an "else" block, keep converting it.
		if (node.hasElse > 0) {
			convertConditional(node.getElse, builder)
		}

		return #[builder.instance]
	}
	
	/** If the "else" of an "if" node is another "if" node, build an "else if" block. */
	def protected static dispatch void convertConditional(ISLASTIfNode node, IfStmtBuilder builder) {
		builder.startElseIf(node.cond.customExpr).addStatement(node.then.convert)
		if (node.hasElse > 0) {
			convertConditional(node.getElse, builder)
		}
	}
	
	/** If the "else" of an "if" node isn't another "if" node, build an "else" block. */
	protected def static dispatch void convertConditional(ISLASTNode node, IfStmtBuilder builder) {
		builder.startElse().addStatement(node.convert)
	}
	
	/** Handles if the AST node type doesn't have a rule made for it. */
	def static dispatch Iterable<Statement> convert(ISLASTNode node) {
		throw new Exception("Not implemented yet!")
	}
	
	/** ISL expression nodes can just be converted to their C string. */
	def static getCustomExpr(ISLASTExpression expression) {
		return Factory.customExpr(expression.toCString)
	}
}