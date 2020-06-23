package alpha.model.issue;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import alpha.model.AlphaRoot;
import alpha.model.ModelPackage;

public class UnhandledExceptionIssue extends AbstractAlphaIssue {

	public UnhandledExceptionIssue(EObject source, EStructuralFeature feature, RuntimeException re) {
		super(TYPE.ERROR, String.format("Unhandled exception during parsing: %s", re.getMessage()), source, feature);
	}
	
	public UnhandledExceptionIssue(AlphaRoot root, RuntimeException re) {
		super(TYPE.ERROR, String.format("Unhandled exception during parsing: %s", re.getMessage()), root, ModelPackage.Literals.ALPHA_ROOT__ELEMENTS);
	}

}
