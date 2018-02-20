package alpha.model.issue;

import org.eclipse.emf.ecore.EObject;

public class EmptyAutoRestrictIssue extends AbstractAlphaIssue {

	public EmptyAutoRestrictIssue(EObject auto) {
		super(TYPE.WARNING, "The inferrerd AutoRestrict domain is empty.", auto, null);
	}

}
