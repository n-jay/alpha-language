package alpha.model.util

import org.eclipse.emf.ecore.EObject
import alpha.model.AlphaSystem
import alpha.model.AlphaPackage
import alpha.model.AlphaConstant
import alpha.model.AlphaRoot
import alpha.model.AlphaVisitable

class AlphaUtil {


	public static def AlphaSystem getContainerSystem(EObject node) {
		if (node instanceof AlphaSystem)
			return node as AlphaSystem
		
		if (node.eContainer() === null)
			return null
		
		return AlphaUtil.getContainerSystem(node.eContainer())
	}

	public static def String replaceAlphaConstants(AlphaSystem system, String jniString) {
		if (system !== null && system.eContainer !== null) {
			var str = jniString
			for (ac : gatherAlphaConstants(system.eContainer as AlphaVisitable)) {
				str = str.replaceAll(ac.name, ac.value.toString);
			}
			return str
		} 
		
		
		return jniString
	}
	
	private static def dispatch gatherAlphaConstants(AlphaPackage ap) {
		ap.elements.filter(AlphaConstant)
	}
	
	private static def dispatch gatherAlphaConstants(AlphaRoot ar) {
		ar.elements.filter(AlphaConstant)
	}
	
}