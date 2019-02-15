package alpha.model.issue;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * DomainConsistensyIssue indicates that the two expressions have expression domains 
 * or context domains that do not agree with each other. 
 * 
 * An example is when spaces (number of dimensions) of the domains do not match. 
 * This is typically caused by inappropriate DependenceExpressions or RestrictExpression.
 * 
 * Another example is when the domains of case branches are not disjoint.
 * 
 * @author tyuki
 *
 */
public class DomainConsistencyIssue extends AbstractAlphaIssue {

	public DomainConsistencyIssue(TYPE type, String message, EObject source, EStructuralFeature feature) {
		super(type, message, source, feature);
	}

}
