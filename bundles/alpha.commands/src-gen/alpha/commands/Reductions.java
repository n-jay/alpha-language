package alpha.commands;

import alpha.model.AlphaRoot;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLMultiAff;
import alpha.model.AlphaSystem;
import alpha.model.SystemBody;
import alpha.model.StandardEquation;
import alpha.model.AlphaExpression;


public class Reductions extends ReductionsBase {
	public static void SerializeReduction(AlphaRoot root, String systemName, int bodyID, String eqName, String exprID, JNIISLMultiAff schedule) {
		AlphaSystem system = ValueConverter.toAlphaSystem(root, systemName);
		SerializeReduction(system, bodyID, eqName, exprID, schedule);
	}
	public static void SerializeReduction(AlphaRoot root, String systemName, int bodyID, String eqName, String exprID, String fStr) {
		JNIISLMultiAff schedule = ValueConverter.toJNIISLMultiAff(fStr);
		SerializeReduction(root, systemName, bodyID, eqName, exprID, schedule);
	}
	public static void SerializeReduction(AlphaSystem system, int bodyID, String eqName, String exprID, JNIISLMultiAff schedule) {
		SystemBody systemBody = ValueConverter.toSystemBody(system, bodyID);
		String eq = eqName;
		String expr = exprID;
		SerializeReduction(systemBody, eq, expr, schedule);
	}
	public static void SerializeReduction(AlphaSystem system, String eqName, String exprID, JNIISLMultiAff schedule) {
		int bodyID = 0;
		SerializeReduction(system, bodyID, eqName, exprID, schedule);
	}
	public static void SerializeReduction(AlphaSystem system, int bodyID, String eqName, String exprID, String fStr) {
		JNIISLMultiAff schedule = ValueConverter.toJNIISLMultiAff(fStr);
		SerializeReduction(system, bodyID, eqName, exprID, schedule);
	}
	public static void SerializeReduction(AlphaSystem system, String eqName, String exprID, String fStr) {
		int bodyID = 0;
		JNIISLMultiAff schedule = ValueConverter.toJNIISLMultiAff(fStr);
		SerializeReduction(system, bodyID, eqName, exprID, schedule);
	}
	public static void SerializeReduction(SystemBody systemBody, String eqName, String exprID, JNIISLMultiAff schedule) {
		StandardEquation eq = ValueConverter.toStandardEquation(systemBody, eqName);
		AlphaExpression expr = ValueConverter.toAlphaExpression(eq, exprID);
		SerializeReduction(systemBody, eq, expr, schedule);
	}
	public static void SerializeReduction(SystemBody systemBody, String eqName, String exprID, String fStr) {
		StandardEquation eq = ValueConverter.toStandardEquation(systemBody, eqName);
		AlphaExpression expr = ValueConverter.toAlphaExpression(eq, exprID);
		JNIISLMultiAff schedule = ValueConverter.toJNIISLMultiAff(fStr);
		SerializeReduction(systemBody, eq, expr, schedule);
	}
}
