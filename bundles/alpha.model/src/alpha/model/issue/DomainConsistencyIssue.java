package alpha.model.issue;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * DomainConsistensyIssue indicates that the spaces (number of dimensions) of
 * the domains associated to two expressions do not match. This is typically
 * caused by inappropriate DependenceExpressions or RestrictExpression.
 * 
 * @author tyuki
 *
 */
public class DomainConsistencyIssue extends AbstractAlphaIssue {

	public DomainConsistencyIssue(TYPE type, String message, EObject source, EStructuralFeature feature) {
		super(type, message, source, feature);
	}

}
