package alpha.model.exception;

import java.util.List;

import alpha.model.issue.AlphaIssue;

/**
 * AlphaIssueException reports a list of issues found during parsing and IR
 * construction. Each AlphaIssue does not immediately raise an exception, since
 * many errors could be caught simultaneously, which is better than reporting as
 * soon as a single error is found.
 * 
 * @author tyuki
 *
 */
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
