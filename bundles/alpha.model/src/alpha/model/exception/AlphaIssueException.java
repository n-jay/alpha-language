package alpha.model.exception;

import java.util.List;

import alpha.model.issue.AlphaIssue;

public class AlphaIssueException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8017687369130337862L;
	
	final private List<AlphaIssue> issues;
	
	public AlphaIssueException(List<AlphaIssue> issues) {
		this.issues = issues;
	}
	
	@Override
	public String getMessage() {
		return "AlphaIssues: " + issues;
	}

}
