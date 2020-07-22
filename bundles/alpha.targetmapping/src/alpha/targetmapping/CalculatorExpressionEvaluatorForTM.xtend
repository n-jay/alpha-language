package alpha.targetmapping

import alpha.model.CalculatorExpression
import alpha.model.CalculatorExpressionEvaluator
import alpha.model.JNIFunctionInArrayNotation
import alpha.model.issue.CalculatorExpressionIssue
import alpha.model.util.AlphaUtil
import alpha.targetmapping.util.TargetMappingUtil
import fr.irisa.cairn.jnimap.isl.ISLFactory
import java.util.List
import java.util.function.Function

class CalculatorExpressionEvaluatorForTM extends CalculatorExpressionEvaluator {
	
	//current band size is used to interpret JNIIdentityFunction
	val int currentBandSize
	val int bandIdOffset
	
	public static Function<Integer,String> DEFAULT_SCHEDULE_DIMENSION_NAME_PROVIDER = [x|'''i«x»''']
	
	/*
	 * These static method should shadow the ones in parent class.
	 * 
	 */
	static def List<CalculatorExpressionIssue> calculate(CalculatorExpression expr) {
		return calculate(expr, null)
	}

	static def List<CalculatorExpressionIssue> calculate(CalculatorExpression expr, List<String> indexNameContext) {
		return calculate(expr, indexNameContext, -1, 0)
	}
	
	static def List<CalculatorExpressionIssue> calculate(CalculatorExpression expr, List<String> indexNameContext, int currentBandSize, int bandIdOffset) {
			
		val calc = new CalculatorExpressionEvaluatorForTM(indexNameContext, currentBandSize, bandIdOffset);
		
		calc.testSystemConsistency(expr)
		if (calc.issues.size > 0) return calc.issues

		expr.accept(calc);

		return calc.issues
	}
	
	protected new(List<String> indexNameContext, int currentBandSize, int bandIdOffset) {
		super(indexNameContext)
		this.currentBandSize = currentBandSize;
		this.bandIdOffset = bandIdOffset
	}
	
	override getReferredSystem(CalculatorExpression expr) {
		return TargetMappingUtil.getTargetSystem(expr.eContainer as TargetMappingNode)
	}
	
	protected def dispatch parseJNIFunctionInContext(JNIFunctionInArrayNotation jniFunction, TargetMappingNode parent) {
		return parseJNIFunctionAsFunction(jniFunction);
	}
	
	protected def dispatch void parseJNIFunction(JNIIdentityFunction jniFunction) {
		
		val dimNames = if (indexNameContext !== null) 
							indexNameContext 
						else
							(bandIdOffset..<bandIdOffset+currentBandSize).map[i|DEFAULT_SCHEDULE_DIMENSION_NAME_PROVIDER.apply(i)].toList
		
		try {
			val jnimaff = ISLFactory.islMultiAff(
					AlphaUtil.toContextFreeISLString(getReferredSystem(jniFunction),
					String.format("{ %s -> %s }", dimNames, dimNames)
				));
			jniFunction.setISLMultiAff(jnimaff);
		} catch (RuntimeException re) {
			val msg = if(re.message === null) re.class.name else re.message
			registerIssue(msg, jniFunction);
		}
	}
}