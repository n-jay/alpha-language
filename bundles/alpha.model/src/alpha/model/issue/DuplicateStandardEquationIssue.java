package alpha.model.issue;

import alpha.model.ModelPackage;
import alpha.model.StandardEquation;

public class DuplicateStandardEquationIssue extends AbstractAlphaIssue {

	public DuplicateStandardEquationIssue(StandardEquation source) {
		super(TYPE.ERROR, "This StandardEquation defined a variable that is defined by another equation.", source, ModelPackage.Literals.STANDARD_EQUATION__VARIABLE);
	}
}
