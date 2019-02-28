package alpha.commands;

import alpha.model.AlphaSystem;
import alpha.model.Variable;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLMultiAff;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLSet;
import alpha.model.SystemBody;
import alpha.model.StandardEquation;


public class Transformations extends TransformationsBase {
	public static void ChangeOfBasis(AlphaSystem system, String varName, String fStr) {
		Variable var = ValueConverter.toVariable(system, varName);
		JNIISLMultiAff f = ValueConverter.toJNIISLMultiAff(fStr);
		ChangeOfBasis(system, var, f);
	}
	public static void Split(AlphaSystem system, String varName, String s_splitDom) {
		Variable var = ValueConverter.toVariable(system, varName);
		JNIISLSet splitDom = ValueConverter.toJNIISLSet(s_splitDom);
		Split(system, var, splitDom);
	}
	public static void SubstituteByDef(SystemBody body, String s_targetEq, String s_inlineEq) {
		StandardEquation targetEq = ValueConverter.toStandardEquation(body, s_targetEq);
		StandardEquation inlineEq = ValueConverter.toStandardEquation(body, s_inlineEq);
		SubstituteByDef(body, targetEq, inlineEq);
	}
}
