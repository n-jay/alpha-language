package alpha.model.issue;

import alpha.model.AlphaExpression;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLSet;

public class OverlappingCaseIssue extends AbstractAlphaIssue {
	
	private final AlphaExpression branch;
	private final JNIISLSet overlap;

	public OverlappingCaseIssue(AlphaExpression branch, JNIISLSet overlap) {
		super(TYPE.ERROR, 
				String.format("Context domain of cases brances are overlapped: %s", overlap.toString()), 
				branch, null);
		this.branch = branch;
		this.overlap = overlap;
	}

}
