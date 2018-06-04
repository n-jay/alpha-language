package alpha.model.util

import fr.irisa.cairn.jnimap.isl.jni.JNIISLAff
import fr.irisa.cairn.jnimap.isl.jni.JNIISLBasicSet
import fr.irisa.cairn.jnimap.isl.jni.JNIISLDimType
import fr.irisa.cairn.jnimap.isl.jni.JNIISLMap
import fr.irisa.cairn.jnimap.isl.jni.JNIISLMultiAff
import fr.irisa.cairn.jnimap.isl.jni.JNIISLSet
import java.util.LinkedList
import java.util.List

import static extension alpha.model.util.AlphaUtil.renameIndices

class AlphaPrintingUtil {
	
	/**
	 * ISLMultiAff to Alpha functions
	 */
	static def String toShowString(JNIISLMultiAff maff) {
		if (maff === null) return null;
		val lhs = maff.domainSpace.getNameList(JNIISLDimType.isl_dim_set).join(",")
		val rhs = maff.affs.join(",", [a|a.toAlphaString(false)]);
		
		return '''(«lhs»->«rhs»)'''
	}
	static def String toAShowString(JNIISLMultiAff maff) {
		if (maff === null) return null;
		val rhs = maff.affs.join(",", [a|a.toAlphaString(true)]);
		
		return '''[«rhs»]'''
	}
	static def String toAShowString(JNIISLMultiAff maff, List<String> context) {
		if (maff === null) return null;
		return toAShowString(maff.renameIndices(context))
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
	static def String toAlphaString(JNIISLAff aff, boolean arrayNotation) {
		val commonD = if (arrayNotation) aff.denominator else 1
		
		val constant = aff.constantVal
		val cstVal = (constant.numerator * commonD) / constant.denominator

		val posList = new LinkedList<String>
		val negList = new LinkedList<String>
		
		toAlphaStringHelper(aff, JNIISLDimType.isl_dim_param, commonD, posList, negList)
		toAlphaStringHelper(aff, JNIISLDimType.isl_dim_in, commonD, posList, negList)
		toAlphaStringHelper(aff, JNIISLDimType.isl_dim_div, commonD, posList, negList)
		
		val pos = posList.join("+")
		val neg = negList.join("")
		val cst = if (cstVal == 0) "" else if (cstVal > 0 && posList.length + negList.length > 0) "+"+cstVal else cstVal
		
		//when everything is 0, then the output is 0; otherwise 0 is not printed
		if (posList.length + negList.length == 0 && cstVal == 0) '''0'''
		else if (commonD != 1) '''(«pos»«neg»«cst»)/«commonD»'''
		else '''«pos»«neg»«cst»'''
	}
	
	/*
	 * Helper for printAff that collects positive/negative values of a given dim type
	 */
	private static def void toAlphaStringHelper(JNIISLAff aff, JNIISLDimType dimType, long commonD, List<String> posList, List<String> negList) {
		
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
	
	/**
	 * ISLSet to AlphaString
	 * 
	 * For sets, ISL string without the parameter part is the AlphaString.
	 */
	static def String toShowString(JNIISLSet set) {
		toShowString(set, null)
	}
	static def String toShowString(JNIISLSet set, JNIISLSet paramDom) {
		toShowString(set, paramDom, null)
	}
	static def String toShowString(JNIISLSet set, JNIISLSet paramDom, List<String> names) {
		val setRenamed = if (names !== null) set.renameIndices(names) else set
		val setGisted = if (paramDom !== null && paramDom.isParamSet) setRenamed.gist(paramDom.copy.addDims(JNIISLDimType.isl_dim_set, setRenamed.nbDims)) else setRenamed

		val bsets = setGisted.collectBasicSets
		val out = "{"+setGisted.indicesNames+":"+bsets.join(" or ")+"}";
		
		return out
	}
	static def String toAShowString(JNIISLSet set) {
		toAShowString(set, null)
	}
	static def String toAShowString(JNIISLSet set, JNIISLSet paramDom) {
		return toAShowString(set, paramDom, null)
	}
	static def String toAShowString(JNIISLSet set, JNIISLSet paramDom, List<String> names) {
		val setRenamed = if (names !== null) set.renameIndices(names) else set
		val setGisted = if (paramDom !== null && paramDom.isParamSet) setRenamed.gist(paramDom.copy.addDims(JNIISLDimType.isl_dim_set, setRenamed.nbDims)) else setRenamed
		
		val bsets = setGisted.collectBasicSets
		val out = "{:"+bsets.join(" or ")+"}";
		return out
	}
	static def collectBasicSets(JNIISLSet set) {
		set.basicSets.map[c|c.toString.replaceFirst("\\[.*\\]\\s->\\s*\\{", "").replaceAll("\\[[^\\[\\]]*\\]\\s*:\\s*", "").replaceFirst("\\}", "")]
	}
	static def collectConstraints(JNIISLSet set) {
		set.basicSets.map[collectConstraints]
	}
	static def collectConstraints(JNIISLBasicSet bset) {
		bset.constraints.map[c|c.toString.replaceFirst("\\[.*\\]\\s->\\s*\\{", "").replaceAll("\\[[^\\[\\]]*\\]\\s*:\\s*", "").replaceFirst("\\}", "")]
	}
	
	/**
	 * ISLMap to Alpha string
	 * 
	 */
	static def toShowString(JNIISLMap map) {
		"{"+map.collectBasicMaps.join("; ") + "}";
	}
	static def collectBasicMaps(JNIISLMap map) {
		map.basicMaps.map[c|c.toString.replaceFirst("\\[.*\\]\\s->\\s*\\{", "").replaceFirst("\\}", "")]
	}
	
	
}