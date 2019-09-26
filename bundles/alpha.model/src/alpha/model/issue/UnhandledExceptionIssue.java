package alpha.model.issue;

import alpha.model.AlphaRoot;
import alpha.model.ModelPackage;

public class UnhandledExceptionIssue extends AbstractAlphaIssue {

	public UnhandledExceptionIssue(AlphaRoot root, RuntimeException re) {
		super(TYPE.ERROR, String.format("Unhandled exception during parsing: %s", re.getMessage()), root, ModelPackage.Literals.ALPHA_ROOT__ELEMENTS);
	}

}
