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
import java.util.ArrayList

/**
 * Converts an isl AST node into equivalent C AST nodes and a list of any declared loop variable names.
 */
class ASTConverter {
	/**
	 * A "user" node is just an expression statement, so we can directly
	 * convert the expression it contains into a statement.
	 */
	def static dispatch ASTConversionResult convert(ISLASTUserNode node) {
		val stmt = Factory.customStmt(node.expression.toCString)
		return new ASTConversionResult(stmt)
	}
	
	/** A "block" node just contains more nodes within it. */
	def static dispatch ASTConversionResult convert(ISLASTBlockNode node) {
		val childrenList = node.getChildren()
		val results = (0 ..< childrenList.nbNodes)
			.map[childrenList.get(it).convert]
		
		val declarations = results.flatMap[it.declarations]
		val statements = results.flatMap[it.statements]
		
		return new ASTConversionResult(declarations, statements)
	}
	
	/** A "for" node corresponds to a loop statement. */
	def static dispatch ASTConversionResult convert(ISLASTForNode node) {
		// Get the information about this loop.
		val loopVariable = node.iterator.toCString
		val initializer = node.init.customExpr
		val conditional = node.cond.customExpr
		val incrementBy = node.inc.customExpr
		
		// Convert the contents of the loop and use it to construct this loop.
		// Put the current loop variable at the start of the list of declared variables,
		// since this one will be encountered before any child declarations.
		val bodyResult = node.body.convert
		
		val declarations = newArrayList(loopVariable)
		declarations.addAll(bodyResult.declarations)
		
		val statement = Factory.loopStmt(loopVariable, initializer, conditional, incrementBy, bodyResult.statements)
		
		return new ASTConversionResult(declarations, statement)
	}
	
	/**
	 * An "if" node corresponds to an If statement.
	 * If there is an "else" node which is actually another "if" node,
	 * then we convert that to an "else if" block using the "convertConditional"
	 * dispatch methods.
	 */
	def static dispatch ASTConversionResult convert(ISLASTIfNode node) {
		// To start, we convert the contents of the "then" block
		// so we have any declarations and statements made there.
		val thenBlock = node.then.convert
		val declarations = new ArrayList<String>(thenBlock.declarations)
		
		// This if node's conditional and the statements from the "then" block
		// can be used to start constructing a new C "if" statement.
		val builder = IfStmtBuilder
			.start(node.cond.customExpr)
			.addStatement(thenBlock.statements)
		
		// If there's an "else" block, convert that as well and capture its declarations.
		if (node.hasElse > 0) {
			val elseDeclarations = convertConditional(node.getElse, builder)
			declarations.addAll(elseDeclarations)
		}

		// Return the result containing all declarations and the full "if..then..else" statement block.
		return new ASTConversionResult(declarations, builder.instance)
	}
	
	/**
	 * If the "else" of an "if" node is another "if" node, build an "else if" block.
	 * Any declared variables are returned.
	 */
	def protected static dispatch ArrayList<String> convertConditional(ISLASTIfNode node, IfStmtBuilder builder) {
		// To start, we convert the contents of the "then" block
		// so we have any declarations and statements made there.
		val thenBlock = node.then.convert
		val declarations = new ArrayList<String>(thenBlock.declarations)
		
		// This if node's conditional and the statements from the "then" block can be added
		// to the C if statement being constructed.
		builder.startElseIf(node.cond.customExpr).addStatement(thenBlock.statements)
		
		// If there's an "else" block, convert that as well and capture its declarations.
		if (node.hasElse > 0) {
			val elseDeclarations = convertConditional(node.getElse, builder)
			declarations.addAll(elseDeclarations)
		}
		
		return declarations
	}
	
	/**
	 * If the "else" of an "if" node isn't another "if" node, build an "else" block.
	 * Any declared variables are returned.
	 */
	protected def static dispatch ArrayList<String> convertConditional(ISLASTNode node, IfStmtBuilder builder) {
		val result = node.convert
		builder.startElse().addStatement(result.statements)
		return result.declarations
	}
	
	/** Handles if the AST node type doesn't have a rule made for it. */
	def static dispatch ASTConversionResult convert(ISLASTNode node) {
		throw new Exception("Not implemented yet!")
	}
	
	/** ISL expression nodes can just be converted to their C string. */
	def static getCustomExpr(ISLASTExpression expression) {
		return Factory.customExpr(expression.toCString)
	}
}