package alpha.model.transformation

import alpha.model.AlphaExpression
import alpha.model.AlphaExpressionVisitable
import alpha.model.AlphaVisitable
import alpha.model.DependenceExpression
import alpha.model.IndexExpression
import alpha.model.ReduceExpression
import alpha.model.RestrictExpression
import alpha.model.StandardEquation
import alpha.model.Variable
import alpha.model.util.AbstractAlphaCompleteVisitor
import alpha.model.util.AlphaUtil
import fr.irisa.cairn.jnimap.isl.ISLDimType
import fr.irisa.cairn.jnimap.isl.ISLMultiAff
import java.util.List

import static extension alpha.model.factory.AlphaUserFactory.createJNIDomain
import static extension alpha.model.factory.AlphaUserFactory.createJNIFunction
import static extension alpha.model.util.CommonExtensions.toArrayList

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
	
	/** Gets the index names to use from a parent reduce expression. */
	def protected static dispatch getIndexNames(ReduceExpression expr) {
		return expr.projection.space.outputNames
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
	// Name Standardization Helper Methods
	////////////////////////////////////////////////////////////
	
	/**
	 * Renames the outputs for a mutli-affine expression.
	 * If the output is exactly equal to one of the inputs, the name of that input is used.
	 * Otherwise, a default name based on the index of the output is used.
	 */
	def protected static renameOutputs(ISLMultiAff multiAff) {
		val outputNames = (0 ..< multiAff.nbOutputs).map[getOutputName(multiAff, it)].toArrayList
		return AlphaUtil.renameOutputs(multiAff, outputNames)
	}
	
	/** Gets the name to use for a specific output of the given multi-affine expression. */
	def protected static getOutputName(ISLMultiAff multiAff, int outputIndex) {
		// If the affine expression for the desired output is an identity function for one of the inputs
		// (the output is exactly equal to the input, such as with i,j,k->j),
		// then we will use the name of that input as the name of this output.
		// Otherwise, use the following default name based on the index of the output.
		val aff = multiAff.getAff(outputIndex)
		val defaultName = "o" + outputIndex
		
		// If the expression has a constant, it's not an identity function.
		if (aff.constantVal != 0) {
			return defaultName
		}
		
		// If any coefficients aren't zero or one, it's not an identity function.
		val coefficients = (0 ..< aff.nbInputs).map[aff.getCoefficientVal(ISLDimType.isl_dim_in, it)].toArrayList
		if (coefficients.exists[(it != 0) || (it != 1)]) {
			return defaultName
		}
		
		// Identity functions must have exactly one coefficient of 1.
		if (coefficients.filter[it == 1].size != 1) {
			return defaultName
		}
		
		// If this is reached, then the affine expression is an identity function for an input.
		// Return the name of that input.
		return aff.getInputName(coefficients.indexOf(1))
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
	
	/**
	 * Renames the indices of the context domain and expression domain of the expression.
	 * Also renames the inputs and outputs of the index function.
	 */
	override inIndexExpression(IndexExpression expr) {
		val indexNames = expr.eContainer.getIndexNames
		
		expr.contextDomain = expr.contextDomain.renameIndices(indexNames)
		expr.expressionDomain = expr.expressionDomain.renameIndices(indexNames)
		
		// The inputs to the index function are renamed to be the same as the
		// context and expression domains, but the output dimensions are set to default names.
		expr.functionExpr = AlphaUtil
			.renameIndices(expr.function, indexNames)
			.renameOutputs
			.createJNIFunction
	}
	
	/**
	 * Renames the indices of the context domain and expression domain of the expression.
	 * Also renames the inputs and outputs of the projection function.
	 */
	override inReduceExpression(ReduceExpression expr) {
		val indexNames = expr.eContainer.getIndexNames
		
		expr.contextDomain = expr.contextDomain.renameIndices(indexNames)
		expr.expressionDomain = expr.expressionDomain.renameIndices(indexNames)
		
		// The inputs to the projection function are renamed to be the same as the
		// context and expression domains, but the output dimensions are set to default names.
		expr.projectionExpr = AlphaUtil
			.renameIndices(expr.projection, indexNames)
			.renameOutputs
			.createJNIFunction
	}
}