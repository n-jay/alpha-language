package alpha.model.issue;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import alpha.model.issue.AlphaIssue.TYPE;

public abstract class AbstractAlphaIssue implements AlphaIssue {
	
	private TYPE type;
	private String message;
	private EObject source;
	private EStructuralFeature feature;
	
	 public AbstractAlphaIssue(TYPE type, String message, EObject source, EStructuralFeature feature) {
		this.type = type;
		this.message = message;
		this.source = source;
		this.feature = feature;
	}

	@Override
	public TYPE getType() {
		return type;
	}

	@Override
	public String getMessage() {
		return message;
	}

	@Override
	public EObject getSource() {
		return source;
	}

	@Override
	public EStructuralFeature getFeature() {
		return feature;
	}

}
