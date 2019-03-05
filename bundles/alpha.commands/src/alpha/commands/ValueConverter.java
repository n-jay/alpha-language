package alpha.commands;

import alpha.model.AlphaExpression;
import alpha.model.AlphaRoot;
import alpha.model.AlphaSystem;
import alpha.model.StandardEquation;
import alpha.model.SystemBody;
import alpha.model.Variable;
import alpha.model.util.AlphaUtil;
import fr.irisa.cairn.jnimap.isl.jni.ISLFactory;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLMultiAff;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLSet;

public class ValueConverter {

	public static JNIISLMultiAff toJNIISLMultiAff(String fStr) {
		return ISLFactory.islMultiAff(fStr);
	}

	public static JNIISLSet toJNIISLSet(String setStr) {
		return ISLFactory.islSet(setStr);
	}

	public static AlphaSystem toAlphaSystem(AlphaRoot root, String systemName) {
		return root.getSystem(systemName);
	}

	public static Variable toVariable(AlphaSystem system, String varName) {
		Variable v = system.getVariable(varName);
		
		if (v == null)
			throw new RuntimeException(String.format("Variable %s does not exist in system %s ", varName, system.getName()));
		
		return v;
	}

	public static SystemBody toSystemBody(AlphaSystem system, int bodyID) {
		if (system.getSystemBodies().size() > bodyID)
			return system.getSystemBodies().get(bodyID);
		
		throw new RuntimeException(String.format("AlphaSystem (%s) only has %d bodies, asked for bodyID: %d  ", 
									system.getName(), system.getSystemBodies().size(), bodyID));
	}

	public static StandardEquation toStandardEquation(SystemBody body, String eqName) {
//		system.g
//		 body.getStandardEquations()
		return null;
	}

	public static AlphaExpression toAlphaExpression(StandardEquation eq, String exprID) {
		// TODO Auto-generated method stub
		return null;
	}

}
	