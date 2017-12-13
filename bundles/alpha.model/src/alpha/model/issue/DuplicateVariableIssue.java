package alpha.model.issue;

import org.eclipse.emf.ecore.EObject;

import alpha.model.ModelPackage;

public class DuplicateVariableIssue extends AbstractAlphaIssue {

	public DuplicateVariableIssue(EObject source) {
		super(TYPE.ERROR, "Duplicate Name", source, ModelPackage.Literals.VARIABLE__NAME);
	}

}
