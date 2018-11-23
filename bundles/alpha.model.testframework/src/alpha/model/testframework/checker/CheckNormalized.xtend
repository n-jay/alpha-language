package alpha.model.testframework.checker

import alpha.model.AlphaVisitable
import alpha.model.CaseExpression
import alpha.model.ConstantExpression
import alpha.model.DependenceExpression
import alpha.model.ReduceExpression
import alpha.model.RestrictExpression
import alpha.model.StandardEquation
import alpha.model.VariableExpression
import alpha.model.transformation.Normalize
import alpha.model.util.ModelSwitch
import org.eclipse.emf.ecore.EObject

/**
 * Quick check to test if the program is in normal form or not.
 * See {@link Normalize} for definition of its expected behavior. 
 * 
 * The test do not consider use equations for now.
 * 
 */
class CheckNormalized  extends ModelSwitch<Boolean> {
	
	final boolean DEEP;
	
	protected new(boolean deep) {
		DEEP = deep;
	}
	
	static def boolean apply(AlphaVisitable av) {
		return apply(av, false);
	}
	
	static def boolean apply(AlphaVisitable av, boolean deep) {
		val sw = new CheckNormalized(false);
		return sw.doSwitch(av);
	}
	
	override defaultCase(EObject eObject) {
		if (eObject.eContents.size > 0)
			eObject.eContents.map[doSwitch].reduce(b1,b2|b1 && b2)
		true
	}
	
	/*override*/ def caseCaseExpression(CaseExpression ce) {
		if (ce.named || ce.eContainer instanceof StandardEquation || ce.eContainer instanceof ReduceExpression) {
			return defaultCase(ce)
		}
		false
	}
	
	/*override*/ def caseRestrictExpression(RestrictExpression re) {
		if (re.eContainer instanceof StandardEquation || re.eContainer instanceof ReduceExpression || re.eContainer instanceof CaseExpression) {
			return defaultCase(re)
		}
		false
	}
	
	/*override*/ def caseDependenceExpression(DependenceExpression de) {
		return Boolean.valueOf(de.expr instanceof VariableExpression || de.expr instanceof ConstantExpression)
	}	
	
}