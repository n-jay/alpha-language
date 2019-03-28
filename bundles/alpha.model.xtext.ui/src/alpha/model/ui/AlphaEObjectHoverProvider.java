package alpha.model.ui;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider;

import alpha.model.AutoRestrictExpression;

public class AlphaEObjectHoverProvider extends DefaultEObjectHoverProvider {
	
	@Override
	protected boolean hasHover(EObject o) {
		if (o instanceof AutoRestrictExpression) return true;
		
		return super.hasHover(o);
	}
	
	@Override
	protected String getDocumentation(EObject o) {
		return super.getDocumentation(o);
	}

}
