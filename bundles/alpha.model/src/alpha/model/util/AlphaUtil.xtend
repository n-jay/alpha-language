package alpha.model.util

import alpha.model.AlphaConstant
import alpha.model.AlphaExpression
import alpha.model.AlphaNode
import alpha.model.AlphaPackage
import alpha.model.AlphaRoot
import alpha.model.AlphaSystem
import alpha.model.AlphaVisitable
import fr.irisa.cairn.jnimap.isl.jni.ISLErrorException
import fr.irisa.cairn.jnimap.isl.jni.ISLFactory
import fr.irisa.cairn.jnimap.isl.jni.JNIISLAff
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
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider

class AlphaUtil {
	

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
	
	static def AlphaRoot selectAlphaRoot(List<AlphaRoot> roots, String systemName) {
		//qualified name
		if (systemName.contains('.')) {
			val IQualifiedNameProvider provider = new DefaultDeclarativeQualifiedNameProvider;
			val matching = roots.map[r|r.eAllContents].filter(AlphaSystem).filter[s|provider.getFullyQualifiedName(s).toString.contentEquals(systemName)]
			if (matching.size>0) return getContainerRoot(matching.head)
		//just the system name
		} else {
			val matching = roots.iterator.flatMap[eAllContents.filter(AlphaSystem).filter[s|s.name.contentEquals(systemName)]]
			if (matching.hasNext) return getContainerRoot(matching.next)
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
	
	
	/* ISL to Alpha String */
	static def String toShowString(JNIISLMultiAff maff) {
		if (maff === null) return null;
		val lhs = maff.domainSpace.getNameList(JNIISLDimType.isl_dim_set).join(",")
		val rhs = maff.affs.join(",", [a|a.islAffToShowString]);
		
		return '''(«lhs»->«rhs»)'''
	}
	
	/**
	 * JNIISLAff to AlphaString
	 * 
	 * The JNIISLAff corresponds to an affine function with 1D output. The space defines the 
	 * index names, and the output expression is defined as a list of coef*name/denom with 
	 * an additional denominator that applies to the entire expression.
	 * 
	 * This method applies the following order:
	 *   - constant is always at the end
	 *   - positive values first
	 *   - among positive/negative values, the order is parameters, indices, divs
	 * 
	 */
	static def String islAffToShowString(JNIISLAff aff) {
		val commonD = aff.denominator
		
		val constant = aff.constantVal
		val cstVal = (constant.numerator * commonD) / constant.denominator

		val posList = new LinkedList<String>
		val negList = new LinkedList<String>
		
		islAffToShowStringHelper(aff, JNIISLDimType.isl_dim_param, commonD, posList, negList)
		islAffToShowStringHelper(aff, JNIISLDimType.isl_dim_in, commonD, posList, negList)
		islAffToShowStringHelper(aff, JNIISLDimType.isl_dim_div, commonD, posList, negList)
		
		val pos = posList.join("+")
		val neg = negList.join("")
		val cst = if (cstVal == 0) "" else if (cstVal > 0) "+"+cstVal else cstVal
		
		if (commonD != 1) '''(«pos»«neg»«cst»)/«commonD»'''
		else '''«pos»«neg»«cst»'''
	}
	
	/*
	 * Helper for printAff that collects positive/negative values of a given dim type
	 */
	private static def void islAffToShowStringHelper(JNIISLAff aff, JNIISLDimType dimType, long commonD, List<String> posList, List<String> negList) {
		
		val dims = aff.space
		val n = dims.getNbDims(dimType)
		val names = dims.getNameList(dimType)
		
		for (i : 0..< n) {
			val coefficient = aff.getCoefficientVal(dimType, i)
			val coef = (coefficient.numerator * commonD) / coefficient.denominator
			
			if (coef>1) posList.add('''«coef»«names.get(i)»''')
			else if (coef==1) posList.add(names.get(i))
			else if (coef<-1) negList.add('''«coef»«names.get(i)»''')
			else if (coef==-1) negList.add('''-«names.get(i)»''')
		}
	}
	
	dispatch static def String islSetToShowString(JNIISLMap map) {
		islSetToShowString(map, null)
	}
	dispatch static def String islSetToShowString(JNIISLMap map, JNIISLSet ctx) {
		return "expecting set; got: " + map
	}
	/**
	 * ISLSet to AlphaString
	 * 
	 * For sets, ISL string without the parameter part is the AlphaString.
	 */
	dispatch static def String islSetToShowString(JNIISLSet set) {
		islSetToShowString(set, null)
	}
	dispatch static def String islSetToShowString(JNIISLSet set, JNIISLSet ctx) {
		val str = if (ctx !== null && ctx.isParamSet) {
						set.gist(ctx.copy.addDims(JNIISLDimType.isl_dim_set, set.nbDims)).toString 
				   } else set.toString
		
		val out = str.replaceFirst("\\[.*\\]\\s->\\s*\\{", "{")
		return out
	}
}