package alpha.model.issue;

import org.eclipse.emf.ecore.EObject;

public class MisplacedAutoRestrictIssue extends AbstractAlphaIssue {

	public MisplacedAutoRestrictIssue(EObject auto) {
		super(TYPE.ERROR, "AutoRestrict can only be a direct child of CaseExpression (in current version)", auto, null);
	}

}
