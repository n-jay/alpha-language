package alpha.model.issue;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public interface AlphaIssue {
	public enum TYPE {
		WARNING,
		ERROR
	}

	public TYPE getType();
	public String getMessage();
	public EObject getSource();
	public EStructuralFeature getFeature();
}
