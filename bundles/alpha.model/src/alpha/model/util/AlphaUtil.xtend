package alpha.model.util

import alpha.model.AlphaConstant
import alpha.model.AlphaExpression
import alpha.model.AlphaPackage
import alpha.model.AlphaRoot
import alpha.model.AlphaSystem
import alpha.model.AlphaVisitable
import fr.irisa.cairn.jnimap.isl.jni.JNIISLMap
import fr.irisa.cairn.jnimap.isl.jni.JNIISLMultiAff
import fr.irisa.cairn.jnimap.isl.jni.JNIISLSet
import org.eclipse.emf.ecore.EObject

class AlphaUtil {


	public static def AlphaSystem getContainerSystem(EObject node) {
		if (node instanceof AlphaSystem)
			return node as AlphaSystem
		
		if (node.eContainer() === null)
			return null
		
		return AlphaUtil.getContainerSystem(node.eContainer())
	}

	/**
	 * Replaces all AlphaConstants in the given string with its integer values.
	 * It is based on String.replaceAll, so it may fail on some inputs.
	 * Currently the model is that the users pick good names for AlphaConstants to avoid this issue
	 */
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
	

	//Void is for null in Xtend dispatch
	public static def dispatch copy(Void n) {
		null
	}
	public static def dispatch copy(JNIISLMap map) {
		map.copy
	}
	public static def dispatch copy(JNIISLSet set) {
		set.copy
	}
	public static def dispatch copy(JNIISLMultiAff maff) {
		maff.copy
	}
	
	
	public static def dispatch JNIISLSet getScalarDomain(AlphaSystem system) {
		return JNIISLSet.buildUniverse(system.parameterDomain.islSet.space)
	}
	public static def dispatch JNIISLSet getScalarDomain(AlphaExpression expr) {
		if (expr.containerSystem === null) return null
		expr.containerSystem.scalarDomain
	}
}