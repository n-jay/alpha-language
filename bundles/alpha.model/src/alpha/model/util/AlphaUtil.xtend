package alpha.model.util

import alpha.model.AlphaConstant
import alpha.model.AlphaExpression
import alpha.model.AlphaNode
import alpha.model.AlphaPackage
import alpha.model.AlphaRoot
import alpha.model.AlphaSystem
import alpha.model.AlphaVisitable
import alpha.model.POLY_OBJECT_TYPE
import fr.irisa.cairn.jnimap.isl.jni.ISLErrorException
import fr.irisa.cairn.jnimap.isl.jni.JNIISLMap
import fr.irisa.cairn.jnimap.isl.jni.JNIISLMultiAff
import fr.irisa.cairn.jnimap.isl.jni.JNIISLSet
import fr.irisa.cairn.jnimap.isl.jni.JNIISLTools
import java.util.LinkedList
import java.util.List
import java.util.function.Consumer
import java.util.function.Supplier
import java.util.stream.Stream
import org.eclipse.emf.ecore.EObject
import alpha.model.CalculatorExpression

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
		return JNIISLSet.buildUniverse(system.parameterDomain.ISLSet.space)
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
		if (containerSystem.whileDomain !== null && containerSystem.whileDomain.type == POLY_OBJECT_TYPE.SET) {
			return (containerSystem.whileDomain.ISLObject as JNIISLSet).indicesNames
		}
		return new LinkedList;
	}
	
	
	public static def <T> getChildrenOfType(AlphaNode expr, Class<T> c) {
		expr.eContents.stream.filter([e|c.isInstance(e)]).map([e|c.cast(e)])
	}
	
	public static def testNonNullContextDomain(Stream<AlphaExpression> exprs) {
		return exprs.allMatch([e|e !== null && e.contextDomain !== null]);
	}
	
	public static def testNonNullExpressionDomain(Stream<AlphaExpression> exprs) {
		return exprs.allMatch([e|e !== null && e.expressionDomain !== null]);
	}
	
	public static def testNonNullCalcExpression(Stream<CalculatorExpression> exprs) {
		return exprs.allMatch([e|e !== null && e.ISLObject !== null]);
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