package alpha.model.issue;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * CalculatorExpressionIssue indicates that a calc expr could not be evaluated.
 * The common cases are when the types of its operands are not supported by the
 * operator or syntax error of the base expressions representing
 * domains/relations.
 * 
 * @author tyuki
 *
 */
public class CalculatorExpressionIssue extends AbstractAlphaIssue {

	public CalculatorExpressionIssue(TYPE type, String message, EObject source, EStructuralFeature feature) {
		super(type, message, source, feature);
	}

}
