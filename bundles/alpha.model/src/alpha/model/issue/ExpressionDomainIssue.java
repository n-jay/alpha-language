package alpha.model.issue;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * ExpressionDomainIssue indicates an error during expression domain
 * calculation. It is currently unused since the common errors are handled by
 * more specific issues ({@link DomainConsistencyIssue},
 * {@link CalculatorExpressionIssue}).
 * 
 * Some of the issues that are currently mapped to
 * {@link UnexpectedISLErrorIssue} may be turned into ExpressionDomainIssue in
 * the future.
 * 
 * @author tyuki
 *
 */
public class ExpressionDomainIssue extends AbstractAlphaIssue {

	public ExpressionDomainIssue(TYPE type, String message, EObject source, EStructuralFeature feature) {
		super(type, message, source, feature);
	}

	@Override
	public String toString() {
		return String.format("%s: %s @ %s", type.name(), message, source.eClass().getName());
	}
}
