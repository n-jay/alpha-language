package alpha.targetmapping.issue;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import alpha.model.issue.AbstractAlphaIssue;

abstract public class AbstractTargetMappingIssue extends AbstractAlphaIssue implements TargetMappingIssue {

	public AbstractTargetMappingIssue(TYPE type, String message, EObject source, EStructuralFeature feature) {
		super(type, message, source, feature);
	}

}
