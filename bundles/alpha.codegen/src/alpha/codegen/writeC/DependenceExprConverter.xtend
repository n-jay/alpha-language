package alpha.codegen.writeC

import alpha.codegen.Expression
import alpha.codegen.Factory
import alpha.codegen.ProgramBuilder
import alpha.codegen.isl.AffineConverter
import alpha.model.AlphaExpression
import alpha.model.ConstantExpression
import alpha.model.DependenceExpression
import alpha.model.VariableExpression

/**
 * Converts Alpha dependence expressions to C expressions.
 * The type of the dependence expression's child determines
 * what C expression(s) to emit.
 * 
 * These rules could have been simply added to the ExprConverter
 * class, but were split out to improve readability. 
 */
class DependenceExprConverter {
	/** The converter used for converting the body of a dependence expression into C expressions. */
	protected val ExprConverter exprConverter
	
	/** Constructs a new converter for dependence expressions. */
	new(ExprConverter exprConverter) {
		this.exprConverter = exprConverter
	}
	
	/** Dispatches the conversion of a dependence expression based on the child expression. */
	def Expression convertExpr(ProgramBuilder program, DependenceExpression expr) {
		return convertExpr(program, expr, expr.expr)
	}
	
	/** If the child is a constant, then simply emit that constant. */
	def dispatch convertExpr(ProgramBuilder program, DependenceExpression parent, ConstantExpression child) {
		exprConverter.convertExpr(program, child)
	}
	
	/**
	 * If the child is a variable, emit the appropriate kind of access with the identity function.
	 * If the Alpha variable is an input, it's accessed via the memory macro.
	 * Otherwise, it's accessed via the "eval" function.
	 */
	def dispatch convertExpr(ProgramBuilder program, DependenceExpression parent, VariableExpression child) {
		// Build an expression for each index of the variable,
		// as determined by each output dimension of the dependence function.
		val indexExprs = AffineConverter.convertMultiAff(parent.function)
		
		// If the variable is an input, we can simply use the memory macro.
		// Otherwise, we access it through its "eval" function macro
		// to ensure the point has been evaluated.
		if (child.variable.isInput) {
			return Factory.callExpr(child.variable.name, indexExprs)
		} else {
			val accessFunction = Common.getEvalName(child.variable)
			return Factory.callExpr(accessFunction, indexExprs)	
		}
	}
	
	/** Default case for child expressions that aren't supported yet. */
	def dispatch convertExpr(ProgramBuilder program, DependenceExpression parent, AlphaExpression child) {
		throw new Exception("Not implemented yet!")
	}
}