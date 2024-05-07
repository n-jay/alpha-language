package alpha.model

import alpha.model.util.AbstractAlphaCompleteVisitor

import static extension alpha.model.util.ISLUtil.dimensionality

class ComplexityCalculator extends AbstractAlphaCompleteVisitor {

	int maxComplexity

	def static int complexity(AlphaVisitable av) {
		val visitor = new ComplexityCalculator
		visitor.accept(av)
		return visitor.maxComplexity
	}
	
	def updateComplexity(int c) {
		if (c > maxComplexity)
			maxComplexity = c
	}
	
	override outStandardEquation(StandardEquation eq) {
		updateComplexity(eq.variable.domain.dimensionality)
	}
	
	override outUseEquation(UseEquation eq) {
		throw new Exception('Complexity calculation of UseEquations not yet implemented')
	}
	
	override outReduceExpression(ReduceExpression re) {
		updateComplexity(re.body.contextDomain.dimensionality)
	}
}