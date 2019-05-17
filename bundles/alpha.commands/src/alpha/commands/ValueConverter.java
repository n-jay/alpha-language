package alpha.commands;

import java.util.Arrays;
import java.util.stream.Collectors;

import alpha.model.AbstractReduceExpression;
import alpha.model.AlphaExpression;
import alpha.model.AlphaRoot;
import alpha.model.AlphaSystem;
import alpha.model.CalculatorExpressionEvaluator;
import alpha.model.DependenceExpression;
import alpha.model.Equation;
import alpha.model.ReduceExpression;
import alpha.model.StandardEquation;
import alpha.model.SystemBody;
import alpha.model.Variable;
import alpha.model.util.AlphaUtil;
import fr.irisa.cairn.jnimap.isl.jni.ISLFactory;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLMultiAff;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLSet;

public class ValueConverter {
	
	public static JNIISLMultiAff toAffineFunction(AlphaSystem system, String fStr) {
		return CalculatorExpressionEvaluator.parseAffineFunction(system, fStr);
	}
	
	public static JNIISLMultiAff toAffineFunction(SystemBody body, String fStr) {
		return toAffineFunction(body.getSystem(), fStr);
	}

	public static JNIISLMultiAff toAffineFunction(Equation eq, String fStr) {
		return toAffineFunction(AlphaUtil.getContainerSystem(eq), fStr);
	}
	public static JNIISLMultiAff toAffineFunction(AlphaExpression expr, String fStr) {
		return toAffineFunction(AlphaUtil.getContainerSystem(expr), fStr);
	}

	public static JNIISLSet toDomain(AlphaSystem system, String domStr) {
		return CalculatorExpressionEvaluator.parseDomain(system, domStr);
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
	
	public static Variable toVariable(SystemBody body, String varName) {
		return toVariable(body.getSystem(), varName);
	}

	public static SystemBody toSystemBody(AlphaSystem system, int bodyID) {
		if (system.getSystemBodies().size() > bodyID)
			return system.getSystemBodies().get(bodyID);
		
		throw new RuntimeException(String.format("AlphaSystem (%s) only has %d bodies, asked for bodyID: %d  ", 
									system.getName(), system.getSystemBodies().size(), bodyID));
	}

	public static Equation toEquation(SystemBody body, String varName) {
		return body.getStandardEquation(varName);
	}

	public static StandardEquation toStandardEquation(SystemBody body, String eqName) {
		return body.getStandardEquation(eqName);
	}

	public static AlphaExpression toAlphaExpression(StandardEquation eq, String exprID) {
		return eq.getExpression(exprID);
	}

	public static AbstractReduceExpression toAbstractReduceExpression(StandardEquation eq, String exprID) {
		AlphaExpression expr = toAlphaExpression(eq, exprID);
		if (expr instanceof AbstractReduceExpression) return (AbstractReduceExpression)expr;
		
		throw new RuntimeException("[ValueConverter] The specified expression is not a reduction: " + expr);
	}

	public static DependenceExpression toDependenceExpression(StandardEquation eq, String exprID) {
		AlphaExpression expr = toAlphaExpression(eq, exprID);
		if (expr instanceof DependenceExpression) return (DependenceExpression)expr;
		
		throw new RuntimeException("[ValueConverter] The specified expression is not a dependence: " + expr);
	}

	public static ReduceExpression toReduceExpression(StandardEquation eq, String exprID) {
		AlphaExpression expr = toAlphaExpression(eq, exprID);
		if (expr instanceof ReduceExpression) return (ReduceExpression)expr;
		
		throw new RuntimeException("[ValueConverter] The specified expression is not a reduction: " + expr);
	}

	public static int[] toIntegerArray(String str) {
		return Arrays.stream(str.replace("[", "").replace("]", "").split("\\s*,\\s*")).mapToInt(s->Integer.parseInt(s)).toArray();
	}

}
	