package alpha.model.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

import alpha.model.AlphaSystem;
import alpha.model.CalculatorExpression;
import alpha.model.PolyhedralObject;

public class AlphaUtil {

	
	public static AlphaSystem getContainerSystem(EObject node) {
		if (node instanceof AlphaSystem)
			return (AlphaSystem)node;
		
		if (node.eContainer() == null)
			return null;
		
		return AlphaUtil.getContainerSystem(node.eContainer());
	}
}
