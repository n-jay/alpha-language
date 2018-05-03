package alpha.model.util

import alpha.model.AlphaConstant
import alpha.model.AlphaExpression
import alpha.model.AlphaNode
import alpha.model.AlphaPackage
import alpha.model.AlphaRoot
import alpha.model.AlphaSystem
import alpha.model.AlphaVisitable
import alpha.model.CalculatorExpression
import fr.irisa.cairn.jnimap.isl.jni.ISLErrorException
import fr.irisa.cairn.jnimap.isl.jni.JNIISLMap
import fr.irisa.cairn.jnimap.isl.jni.JNIISLMultiAff
import fr.irisa.cairn.jnimap.isl.jni.JNIISLSet
import fr.irisa.cairn.jnimap.isl.jni.JNIISLTools
import fr.irisa.cairn.jnimap.isl.jni.JNIISLUnionMap
import java.util.LinkedList
import java.util.List
import java.util.function.Consumer
import java.util.function.Supplier
import java.util.stream.Stream
import org.eclipse.emf.ecore.EObject
import fr.irisa.cairn.jnimap.isl.jni.ISLFactory

class AlphaUtil {


	public static def AlphaSystem getContainerSystem(EObject node) {
		if (node instanceof AlphaSystem)
			return node as AlphaSystem
		
		if (node.eContainer() === null)
			return null
		
		return AlphaUtil.getContainerSystem(node.eContainer())
	}
	

	public static def JNIISLSet getParameterDomain(EObject node) {

		val system = AlphaUtil.getContainerSystem(node);
		if (system === null) {
			throw new RuntimeException("Node is not contained by an AlphaSystem.");
		}

		if (system.getParameterDomain() === null || system.getParameterDomain() === null) {
			throw new RuntimeException("The parameter domain of the container system is null.");
		}

		return system.getParameterDomain();
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
	public static def dispatch copy(JNIISLUnionMap umap) {
		umap.copy
	}
	
	/**
	 * Method that adds parameter domain names and replaces AlphaConstants with its value.
	 * Last step before passing the string to ISL.
	 */
	public static def String toContextFreeISLString(AlphaSystem system, String alphaDom) {
			val completed = new StringBuffer("[");
			completed.append(String.join(",", system.parameterDomain.getParametersNames()));
			completed.append("] -> ");

			completed.append(alphaDom);
			
			AlphaUtil.replaceAlphaConstants(system, completed.toString())
	}
	
	public static def dispatch JNIISLSet getScalarDomain(AlphaSystem system) {
		var jniset = ISLFactory.islSet(AlphaUtil.toContextFreeISLString(system, "{ [] : }"));
		val pdom = system.parameterDomain
		
		jniset.intersectParams(pdom.copy());
	}
	public static def dispatch JNIISLSet getScalarDomain(AlphaExpression expr) {
		if (expr.containerSystem === null) return null
		expr.containerSystem.scalarDomain
	}
	
	

	/**
	 * Helper function to obtain the additional indices due to while expressions when parsing polyhedral objects specified in ArrayNotation
	 * */
	public static def List<String> getWhileIndexNames(AlphaNode node) {
		val containerSystem = AlphaUtil.getContainerSystem(node)
		if (containerSystem.whileDomain !== null) containerSystem.whileDomain.indicesNames
		else new LinkedList;
	}
	
	public static def <T> T callISLwithErrorHandling(Supplier<T> r, Consumer<String> f) {
		return callISLwithErrorHandling(r, f, null);
	}
	public static def <T> T callISLwithErrorHandling(Supplier<T> r, Consumer<String> f, T defaultValue) {
		try {
			return JNIISLTools.<T>recordError(r);
		} catch (ISLErrorException e) {
			f.accept(e.islErrorMessage);
			return defaultValue;
		}
	}
	
	public static def void callISLwithErrorHandling(Runnable r, Consumer<String> f) {
		try {
			JNIISLTools.recordError(r);
		} catch (ISLErrorException e) {
			f.accept(e.islErrorMessage);
		}
	}
}