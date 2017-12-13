package alpha.model.issue;

import org.eclipse.emf.ecore.EObject;

import alpha.model.ModelPackage;

public class DuplicatePolyObjectIssue  extends AbstractAlphaIssue {

	public DuplicatePolyObjectIssue(EObject source) {
		super(TYPE.ERROR, "Duplicate Name", source, ModelPackage.Literals.POLYHEDRAL_OBJECT__NAME);
	}

}
