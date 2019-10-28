package alpha.model.issue;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public abstract class AbstractAlphaIssue implements AlphaIssue {
	
	protected final TYPE type;
	protected final String message;
	protected final EObject source;
	protected final EStructuralFeature feature;
	
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
	
	@Override
	public String toString() {
		return String.format("%s: %s @ %s", type.name(), message, source.eClass().getName());
	}

}
