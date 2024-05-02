package alpha.model.transformation

import alpha.model.AlphaExpression
import alpha.model.AlphaExpressionVisitable
import alpha.model.AlphaVisitable
import alpha.model.DependenceExpression
import alpha.model.RestrictExpression
import alpha.model.StandardEquation
import alpha.model.Variable
import alpha.model.util.AbstractAlphaCompleteVisitor
import alpha.model.util.AlphaUtil
import java.util.List

import static extension alpha.model.factory.AlphaUserFactory.createJNIDomain
import static extension alpha.model.factory.AlphaUserFactory.createJNIFunction
import static extension alpha.model.util.AlphaUtil.renameOutputs

/**
 * Standardizes the names of indices in most context domains,
 * expression domains, dependence functions, and restrict domains
 * throughout the provided AST (or sub-tree).
 * 
 * Within all of these, input dimensions are renamed to "i0", "i1", etc.
 * based on their position in the space.
 */
class StandardizeNames extends AbstractAlphaCompleteVisitor {
	
	////////////////////////////////////////////////////////////
	// Entry Points
	////////////////////////////////////////////////////////////
	
	/** Protected constructor to force "apply" to be the entry point. */
	protected new() {}
	
	/** Applies name standardization to an Alpha expression. */
	def static apply(AlphaExpressionVisitable visitable) {
		new StandardizeNames().accept(visitable)
	}
	
	/** Applies name standardization to an Alpha system, equation, etc. */
	def static apply(AlphaVisitable visitable) {
		new StandardizeNames().accept(visitable)
	}
	
	
	////////////////////////////////////////////////////////////
	// Get Index Names
	////////////////////////////////////////////////////////////
	
	/** Checks whether the given list of names are valid index names for the given variable. */
	def protected static areValidNames(List<String> indexNames, Variable variable) {
		// For a list of index names to be valid, it can't be null
		// and must have the same number of names as the variable has indices.
		return indexNames !== null
			&& indexNames.size == variable.domain.nbIndices
	}
	
	/** Gets the index names to use from a parent equation. */
	def protected static dispatch getIndexNames(StandardEquation eq) {
		val variable = eq.variable
		
		// If the equation has index names (and they're valid), use those.
		val equationNames = eq.indexNames
		if (equationNames.areValidNames(variable)) {
			return equationNames
		}
		
		// Otherwise, try to use the names from the variable's domain.
		val variableNames = variable.domain.indexNames
		if (variableNames.areValidNames(variable)) {
			return variableNames
		}
		
		// As a last resort, use some default names.
		return AlphaUtil.defaultDimNames(variable.domain)
	}
	
	/** Gets the index names to use from a parent dependence expression. */
	def protected static dispatch getIndexNames(DependenceExpression expr) {
		return expr.function.space.outputNames
	}
	
	/** Gets the index names to use from a parent expression. */
	def protected static dispatch getIndexNames(AlphaExpression expr) {
		return expr.contextDomain.indexNames
	}
	
	/** Default rule if none of the other cases matched. */
	def protected static dispatch getIndexNames(Object obj) {
		throw new Exception("Cannot get the index names to use from the given parent.")
	}
	
	
	////////////////////////////////////////////////////////////
	// Name Standardization Rules
	////////////////////////////////////////////////////////////
	
	/** Renames the indices of the context domain and expression domain of the expression. */
	override inAlphaExpression(AlphaExpression expr) {
		val indexNames = expr.eContainer.getIndexNames
		
		expr.contextDomain = expr.contextDomain.renameIndices(indexNames)
		expr.expressionDomain = expr.expressionDomain.renameIndices(indexNames)
	}
	
	/**
	 * Renames the indices of the context domain, expression domain, and restrict domain
	 * for the restrict expression.
	 */
	override inRestrictExpression(RestrictExpression expr) {
		val indexNames = expr.eContainer.getIndexNames
		
		expr.contextDomain = expr.contextDomain.renameIndices(indexNames)
		expr.expressionDomain = expr.expressionDomain.renameIndices(indexNames)
		
		expr.domainExpr = AlphaUtil
			.renameIndices(expr.restrictDomain, indexNames)
			.createJNIDomain
	}
	
	/**
	 * Renames the indices of the context domain and expression domain of the expression.
	 * Also renames the inputs and outputs of the dependence function.
	 */
	override inDependenceExpression(DependenceExpression expr) {
		val indexNames = expr.eContainer.getIndexNames
		
		expr.contextDomain = expr.contextDomain.renameIndices(indexNames)
		expr.expressionDomain = expr.expressionDomain.renameIndices(indexNames)
		
		// The inputs to the dependence function are renamed to be the same as the
		// context and expression domains, but the output dimensions are set to default names.
		expr.functionExpr = AlphaUtil
			.renameIndices(expr.function, indexNames)
			.renameOutputs
			.createJNIFunction
	}
}