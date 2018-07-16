package alpha.model.issue;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * ContextDomainIssue indicates an error during context domain calculation. This
 * is usually because of lack of context information due to ArrayNotation being
 * mixed with pure Alpha notation.
 * 
 * @author tyuki
 *
 */
public class ContextDomainIssue extends AbstractAlphaIssue {

	public ContextDomainIssue(TYPE type, String message, EObject source, EStructuralFeature feature) {
		super(type, message, source, feature);
	}

	@Override
	public String toString() {
		return String.format("%s: %s @ %s", type.name(), message, source.eClass().getName());
	}
}
