package alpha.model.issue;

import org.eclipse.emf.ecore.EObject;

public class MultipleAutoRestrictIssue extends AbstractAlphaIssue {

	public MultipleAutoRestrictIssue(EObject auto) {
		super(TYPE.ERROR, "More than one AutoRestrict is not allowed in a CaseExpression.", auto, null);
	}

}
