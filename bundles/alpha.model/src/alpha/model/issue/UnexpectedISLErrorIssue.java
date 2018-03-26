package alpha.model.issue;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public class UnexpectedISLErrorIssue extends AbstractAlphaIssue {

	private StringBuffer srcLoc;
	
	public UnexpectedISLErrorIssue(String message, EObject source, EStructuralFeature feature) {
		super(TYPE.ERROR, message, source, feature);
		
		StackTraceElement[] trace = Thread.currentThread().getStackTrace();
		srcLoc = new StringBuffer();
		
		boolean first = true;
		for (StackTraceElement te : trace) {
			srcLoc.append("\n at ");
			
			//skip the first trace, which is within this constructor
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
