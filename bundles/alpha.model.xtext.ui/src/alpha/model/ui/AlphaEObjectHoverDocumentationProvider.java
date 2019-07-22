package alpha.model.ui;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.editor.hover.html.DefaultHoverDocumentationProvider;

import alpha.model.AutoRestrictExpression;
import fr.irisa.cairn.jnimap.isl.ISLSet;

public class AlphaEObjectHoverDocumentationProvider extends DefaultHoverDocumentationProvider {
	
	@Override
	public String getDocumentation(EObject object) {
		if (object instanceof AutoRestrictExpression) {
			ISLSet domain = ((AutoRestrictExpression) object).getInferredDomain();
			return (domain != null)?domain.toString():"null";
		}
		
		return super.getDocumentation(object);
	}

}
