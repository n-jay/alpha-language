package alpha.commands;

import alpha.model.AlphaVisitable;
import alpha.model.AlphaSystem;
import alpha.model.SystemBody;
import alpha.model.AlphaRoot;
import alpha.model.Variable;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLMultiAff;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLSet;
import alpha.model.StandardEquation;


public class Transformations extends TransformationsBase {
	public static void PropagateSimpleEquations(AlphaSystem system, int bodyID) {
		SystemBody body = ValueConverter.toSystemBody(system, bodyID);
		PropagateSimpleEquations(body);
	}
	public static void ChangeOfBasis(AlphaSystem system, String varName, String fStr) {
		Variable var = ValueConverter.toVariable(system, varName);
		JNIISLMultiAff f = ValueConverter.toAffineFunction(fStr);
		ChangeOfBasis(system, var, f);
	}
	public static void Split(AlphaSystem system, String varName, String s_splitDom) {
		Variable var = ValueConverter.toVariable(system, varName);
		JNIISLSet splitDom = ValueConverter.toDomain(s_splitDom);
		Split(system, var, splitDom);
	}
	public static void SubstituteByDef(AlphaSystem system, String inlineVarStr) {
		Variable inlineVar = ValueConverter.toVariable(system, inlineVarStr);
		SubstituteByDef(system, inlineVar);
	}
	public static void SubstituteByDef(SystemBody body, String inlineVarStr) {
		Variable inlineVar = ValueConverter.toVariable(body, inlineVarStr);
		SubstituteByDef(body, inlineVar);
	}
	public static void SubstituteByDef(SystemBody body, String s_targetEq, String inlineVarStr) {
		StandardEquation targetEq = ValueConverter.toStandardEquation(body, s_targetEq);
		Variable inlineVar = ValueConverter.toVariable(body, inlineVarStr);
		SubstituteByDef(body, targetEq, inlineVar);
	}
}
