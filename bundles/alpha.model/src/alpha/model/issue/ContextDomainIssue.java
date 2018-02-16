package alpha.model.issue;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public class ContextDomainIssue extends AbstractAlphaIssue {

	public ContextDomainIssue(TYPE type, String message, EObject source, EStructuralFeature feature) {
		super(type, message, source, feature);
	}

	@Override
	public String toString() {
		return String.format("%s: %s @ %s", type.name(), message, source.eClass().getName());
	}
}
