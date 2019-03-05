package alpha.model.util

import alpha.model.AlphaConstant
import alpha.model.AlphaExpression
import alpha.model.AlphaNode
import alpha.model.AlphaPackage
import alpha.model.AlphaRoot
import alpha.model.AlphaSystem
import alpha.model.AlphaVisitable
import alpha.model.Equation
import alpha.model.SystemBody
import fr.irisa.cairn.jnimap.isl.jni.ISLErrorException
import fr.irisa.cairn.jnimap.isl.jni.ISLFactory
import fr.irisa.cairn.jnimap.isl.jni.JNIISLDimType
import fr.irisa.cairn.jnimap.isl.jni.JNIISLMap
import fr.irisa.cairn.jnimap.isl.jni.JNIISLMultiAff
import fr.irisa.cairn.jnimap.isl.jni.JNIISLSet
import fr.irisa.cairn.jnimap.isl.jni.JNIISLTools
import fr.irisa.cairn.jnimap.isl.jni.JNIISLUnionMap
import java.util.LinkedList
import java.util.List
import java.util.function.Consumer
import java.util.function.Supplier
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider
import org.eclipse.xtext.naming.IQualifiedNameProvider

/**
 * Utility methods for analysis and transformation of Alpha programs.
 * 
 */
class AlphaUtil {
	
	
	static def duplicateNameResolver() {
		return [AlphaSystem s, String nameCandidate, String postfix|
			var currentName = nameCandidate;
			
			while (s.getVariable(currentName) !== null) {
				currentName = currentName + postfix
			}
			
			return currentName
		];
	} 

	static def AlphaRoot getContainerRoot(EObject node) {
		if (node instanceof AlphaRoot)
			return node as AlphaRoot
		
		if (node.eContainer() === null)
			return null
		
		return AlphaUtil.getContainerRoot(node.eContainer())
	}

	static def AlphaSystem getContainerSystem(EObject node) {
		if (node instanceof AlphaSystem)
			return node as AlphaSystem
		
		if (node.eContainer() === null)
			return null
		
		return AlphaUtil.getContainerSystem(node.eContainer())
	}
	
	static def SystemBody getContainerSystemBody(EObject node) {
		if (node instanceof SystemBody)
			return node as SystemBody
		
		if (node.eContainer() === null)
			return null
		
		return AlphaUtil.getContainerSystemBody(node.eContainer())
	}
	
	static def Equation getContainerEquation(EObject node) {
		if (node instanceof Equation)
			return node as Equation
		
		if (node.eContainer() === null)
			return null
		
		return AlphaUtil.getContainerEquation(node.eContainer())
	}
	/**
	 * Selects an AlphaRoot that contains a given system name. The given system name may be
	 * fully qualified or just the bare name. If the bare name cannot uniquely identify a 
	 * system, then it throws a RuntimeException.
	 * 
	 */
	static def AlphaRoot selectAlphaRoot(List<AlphaRoot> roots, String systemName) {
		//qualified name
		if (systemName.contains('.')) {
			val IQualifiedNameProvider provider = new DefaultDeclarativeQualifiedNameProvider;
			val matching = roots.map[r|r.eAllContents].filter(AlphaSystem).filter[s|provider.getFullyQualifiedName(s).toString.contentEquals(systemName)].toList
			if (matching.length>0) return getContainerRoot(matching.head)
		//just the system name
		} else {
			val matching = roots.iterator.flatMap[eAllContents.filter(AlphaSystem).filter[s|s.name.contentEquals(systemName)]].toList
			if (matching.size>1) throw new RuntimeException("There are multiple systems with the name: " + systemName);
			if (matching.size>0) return getContainerRoot(matching.head)
		}
		
		throw new RuntimeException("System " + systemName + " was not found.");
	}

	

	static def JNIISLSet getParameterDomain(EObject node) {

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
	static def String replaceAlphaConstants(AlphaSystem system, String jniString) {
		if (system !== null && system.eContainer !== null) {
			var str = jniString
			for (ac : gatherAlphaConstants(system.eContainer as AlphaVisitable)) {
				str = str.replaceAll(ac.name, ac.value.toString);
			}
			return str
		} 
		
		
		return jniString
	}
	
	static def getAlphaConstants(AlphaSystem system) {
		if (system !== null && system.eContainer !== null) {
			return gatherAlphaConstants(system.eContainer as AlphaVisitable)
		}
	}
	
	private static def dispatch gatherAlphaConstants(AlphaPackage ap) {
		ap.elements.filter(AlphaConstant)
	}
	
	private static def dispatch gatherAlphaConstants(AlphaRoot ar) {
		ar.elements.filter(AlphaConstant)
	}
	

	//Void is for null in Xtend dispatch
	static def dispatch copy(Void n) {
		null
	}
	static def dispatch copy(JNIISLMap map) {
		map.copy
	}
	static def dispatch copy(JNIISLSet set) {
		set.copy
	}
	static def dispatch copy(JNIISLMultiAff maff) {
		maff.copy
	}
	static def dispatch copy(JNIISLUnionMap umap) {
		umap.copy
	}
	
	/**
	 * Method that adds parameter domain names and replaces AlphaConstants with its value.
	 * Last step before passing the string to ISL.
	 */
	static def String toContextFreeISLString(AlphaSystem system, String alphaDom) {
			val completed = new StringBuffer("[");
			completed.append(String.join(",", system.parameterDomain.getParametersNames()));
			completed.append("] -> ");

			completed.append(alphaDom);
			
			AlphaUtil.replaceAlphaConstants(system, completed.toString())
	}
	
	static def dispatch JNIISLSet getScalarDomain(AlphaSystem system) {
		var jniset = ISLFactory.islSet(AlphaUtil.toContextFreeISLString(system, "{ [] : }"));
		val pdom = system.parameterDomain
		
		jniset.intersectParams(pdom.copy());
	}
	static def dispatch JNIISLSet getScalarDomain(AlphaExpression expr) {
		if (expr.containerSystem === null) return null
		expr.containerSystem.scalarDomain
	}
	
	

	/**
	 * Helper function to obtain the additional indices due to while expressions when parsing polyhedral objects specified in ArrayNotation
	 * */
	static def List<String> getWhileIndexNames(AlphaNode node) {
		val containerSystem = AlphaUtil.getContainerSystem(node)
		if (containerSystem.whileDomain !== null) containerSystem.whileDomain.indicesNames
		else new LinkedList;
	}
	
	static def <T> T callISLwithErrorHandling(Supplier<T> r, Consumer<String> f) {
		return callISLwithErrorHandling(r, f, null);
	}
	static def <T> T callISLwithErrorHandling(Supplier<T> r, Consumer<String> f, T defaultValue) {
		try {
			return JNIISLTools.<T>recordError(r);
		} catch (ISLErrorException e) {
			f.accept(e.islErrorMessage);
			return defaultValue;
		}
	}
	
	static def void callISLwithErrorHandling(Runnable r, Consumer<String> f) {
		try {
			JNIISLTools.recordError(r);
		} catch (ISLErrorException e) {
			f.accept(e.islErrorMessage);
		}
	}
	
	static def renameIndices(JNIISLSet set, List<String> names) {
		val n = set.getNbDims()
		var res = set;
		if (n > names.length) throw new RuntimeException("Need n or more index names to rename n-d space.");
		for (i : 0..<n) {
			res = res.setDimName(JNIISLDimType.isl_dim_set, i, names.get(i))
		}
			
		return res
	}
	static def renameIndices(JNIISLMap map, List<String> names) {
		val n = map.getNbDims(JNIISLDimType.isl_dim_in)
		var res = map;
		if (n > names.length) throw new RuntimeException("Need n or more index names to rename n-d space.");
		for (i : 0..<n) {
			res = res.setDimName(JNIISLDimType.isl_dim_in, i, names.get(i))
		}
			
		return res
	}
	static def renameIndices(JNIISLMultiAff maff, List<String> names) {
		val n = maff.getNbDims(JNIISLDimType.isl_dim_in)
		if (n > names.length) throw new RuntimeException("Need n or more index names to rename n-d space.");
		var res = maff;
		for (i : 0..<n) {
			res = res.setDimName(JNIISLDimType.isl_dim_in, i, names.get(i))
		}
			
		return res
	}
}