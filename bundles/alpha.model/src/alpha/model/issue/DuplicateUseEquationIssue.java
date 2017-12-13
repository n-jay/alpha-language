package alpha.model.issue;

import alpha.model.ModelPackage;
import alpha.model.UseEquation;

public class DuplicateUseEquationIssue extends AbstractAlphaIssue {

	public DuplicateUseEquationIssue(UseEquation source) {
		super(TYPE.ERROR, "This UseEquation defines a variable that is defined by another equation.", source, ModelPackage.Literals.USE_EQUATION__OUTPUT_EXPRS);
	}

}
