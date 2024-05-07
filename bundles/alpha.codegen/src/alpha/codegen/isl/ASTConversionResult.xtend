package alpha.codegen.isl

import alpha.codegen.Statement
import alpha.codegen.VariableDecl
import java.util.ArrayList
import org.eclipse.xtend.lib.annotations.Data

import static extension alpha.model.util.CommonExtensions.toArrayList

/**
 * Holds the results of converting an isl AST to the simplified C AST.
 * This separates any variables which need to be declared for use in loop statements
 * and the statements themselves.
 */
@Data
class ASTConversionResult {
	/** The variables to declare because they are used in loop statements. */
	ArrayList<String> declarations
	
	/** The top-level statements that the isl AST represents. */
	ArrayList<Statement> statements
	
	/** Constructs a new result which doesn't declare any loop variables. */
	new(Statement... statements) {
		this(newArrayList, statements)
	}
	
	/** Constructs a new result which declares a single loop variable. */
	new(String declaration, Statement... statements) {
		this(#[declaration], statements)
	}
	
	/** Constructs a new result from scratch. */
	new(Iterable<String> declarations, Statement... statements) {
		this.declarations = declarations.toArrayList
		this.statements = statements.toArrayList
	}
}