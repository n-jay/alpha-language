package alpha.model.issue;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * UnexpectedISLErrorIssue is the default issue used when an ISL operation
 * failed. Ideally all such exception should be mapped to more specific issues
 * that better represent the cause of the problem.
 * 
 * @author tyuki
 *
 */
public class UnexpectedISLErrorIssue extends AbstractAlphaIssue {

	private StringBuffer srcLoc;

	public UnexpectedISLErrorIssue(String message, EObject source, EStructuralFeature feature) {
		super(TYPE.ERROR, message, source, feature);

		StackTraceElement[] trace = Thread.currentThread().getStackTrace();
		srcLoc = new StringBuffer();

		boolean first = true;
		for (StackTraceElement te : trace) {
			srcLoc.append("\n at ");

			// skip the first trace, which is within this constructor
			if (first) {
				first = false;
				continue;
			}
			srcLoc.append(te.toString());
		}

	}

	@Override
	public String getMessage() {
		return message + srcLoc;
	}

}
