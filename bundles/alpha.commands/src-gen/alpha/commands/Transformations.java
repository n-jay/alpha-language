package alpha.commands;

import alpha.model.AlphaExpression;
import alpha.model.AlphaSystem;
import alpha.model.StandardEquation;
import alpha.model.SystemBody;
import alpha.model.Variable;
import fr.irisa.cairn.jnimap.isl.ISLMultiAff;


public class Transformations extends TransformationsBase {
	public static void ChangeOfBasis(AlphaSystem system, String varName, String fStr) {
		Variable var = ValueConverter.toVariable(system, varName);
		ISLMultiAff f = ValueConverter.toAffineFunction(system, fStr);
		ChangeOfBasis(system, var, f);
	}
	public static void PropagateSimpleEquations(AlphaSystem system, int bodyID) {
		SystemBody body = ValueConverter.toSystemBody(system, bodyID);
		PropagateSimpleEquations(body);
	}
	public static void SplitUnionIntoCase(AlphaSystem system, int bodyID) {
		SystemBody body = ValueConverter.toSystemBody(system, bodyID);
		SplitUnionIntoCase(body);
	}
	public static void SubstituteByDef(AlphaSystem system, String inlineVarStr) {
		Variable inlineVar = ValueConverter.toVariable(system, inlineVarStr);
		SubstituteByDef(system, inlineVar);
	}
	public static void SubstituteByDef(SystemBody body, String inlineVarStr) {
		Variable inlineVar = ValueConverter.toVariable(body, inlineVarStr);
		SubstituteByDef(body, inlineVar);
	}
	public static void SubstituteByDef(StandardEquation targetEq, String inlineVarStr) {
		Variable inlineVar = ValueConverter.toVariable(targetEq, inlineVarStr);
		SubstituteByDef(targetEq, inlineVar);
	}
	public static void SubstituteByDef(AlphaExpression targetExpr, String inlineVarStr) {
		Variable inlineVar = ValueConverter.toVariable(targetExpr, inlineVarStr);
		SubstituteByDef(targetExpr, inlineVar);
	}
}
