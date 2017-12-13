package alpha.model.issue;

import alpha.model.AlphaSystem;
import alpha.model.ModelPackage;

public class DuplicateSystemIssue extends AbstractAlphaIssue {

	public DuplicateSystemIssue(AlphaSystem source) {
		super(TYPE.ERROR, "Duplicate System", source, ModelPackage.Literals.ALPHA_SYSTEM__NAME);
	}

}
