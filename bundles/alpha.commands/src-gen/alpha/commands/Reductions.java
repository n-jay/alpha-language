package alpha.commands;

import alpha.model.AlphaSystem;
import alpha.model.SystemBody;
import alpha.model.StandardEquation;
import alpha.model.AbstractReduceExpression;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLMultiAff;
import alpha.model.DependenceExpression;
import alpha.model.AlphaVisitable;
import alpha.model.ReduceExpression;


public class Reductions extends ReductionsBase {
	public static void ReductionComposition(SystemBody body, String targetEq, String exprID) {
		StandardEquation eq = ValueConverter.toStandardEquation(body, targetEq);
		ReductionComposition(eq, exprID);
	}
	public static void ReductionComposition(SystemBody body, String targetEq) {
		String exprID = "0";
		ReductionComposition(body, targetEq, exprID);
	}
	public static void ReductionComposition(StandardEquation eq, String exprID) {
		AbstractReduceExpression reduction = ValueConverter.toAbstractReduceExpression(eq, exprID);
		ReductionComposition(reduction);
	}
	public static void ReductionComposition(StandardEquation eq) {
		String exprID = "0";
		ReductionComposition(eq, exprID);
	}
	public static void ReducionDecomposition(SystemBody body, String targetEq, String exprID, JNIISLMultiAff f1, JNIISLMultiAff f2) {
		StandardEquation eq = ValueConverter.toStandardEquation(body, targetEq);
		ReducionDecomposition(eq, exprID, f1, f2);
	}
	public static void ReducionDecomposition(SystemBody body, String targetEq, String exprID, String f1Str, String f2Str) {
		JNIISLMultiAff f1 = ValueConverter.toAffineFunction(body, f1Str);
		JNIISLMultiAff f2 = ValueConverter.toAffineFunction(body, f2Str);
		ReducionDecomposition(body, targetEq, exprID, f1, f2);
	}
	public static void ReducionDecomposition(StandardEquation eq, String exprID, JNIISLMultiAff f1, JNIISLMultiAff f2) {
		AbstractReduceExpression reduction = ValueConverter.toAbstractReduceExpression(eq, exprID);
		ReductionDecomposition(reduction, f1, f2);
	}
	public static void ReducionDecomposition(StandardEquation eq, JNIISLMultiAff f1, JNIISLMultiAff f2) {
		String exprID = "0";
		ReducionDecomposition(eq, exprID, f1, f2);
	}
	public static void ReducionDecomposition(StandardEquation eq, String exprID, String f1Str, String f2Str) {
		JNIISLMultiAff f1 = ValueConverter.toAffineFunction(eq, f1Str);
		JNIISLMultiAff f2 = ValueConverter.toAffineFunction(eq, f2Str);
		ReducionDecomposition(eq, exprID, f1, f2);
	}
	public static void ReducionDecomposition(StandardEquation eq, String f1Str, String f2Str) {
		String exprID = "0";
		JNIISLMultiAff f1 = ValueConverter.toAffineFunction(eq, f1Str);
		JNIISLMultiAff f2 = ValueConverter.toAffineFunction(eq, f2Str);
		ReducionDecomposition(eq, exprID, f1, f2);
	}
	public static void ReductionDecomposition(AbstractReduceExpression reduction, String f1Str, String f2Str) {
		JNIISLMultiAff f1 = ValueConverter.toAffineFunction(reduction, f1Str);
		JNIISLMultiAff f2 = ValueConverter.toAffineFunction(reduction, f2Str);
		ReductionDecomposition(reduction, f1, f2);
	}
	public static void FactorOutFromReduction(SystemBody body, String targetEq, String exprID) {
		StandardEquation eq = ValueConverter.toStandardEquation(body, targetEq);
		FactorOutFromReduction(eq, exprID);
	}
	public static void FactorOutFromReduction(SystemBody body, String targetEq) {
		String exprID = "0";
		FactorOutFromReduction(body, targetEq, exprID);
	}
	public static void FactorOutFromReduction(StandardEquation eq, String exprID) {
		DependenceExpression expr = ValueConverter.toDependenceExpression(eq, exprID);
		FactorOutFromReduction(expr);
	}
	public static void FactorOutFromReduction(StandardEquation eq) {
		String exprID = "0";
		FactorOutFromReduction(eq, exprID);
	}
	public static void NormalizeReduction(SystemBody body, String targetEq, String exprID) {
		StandardEquation eq = ValueConverter.toStandardEquation(body, targetEq);
		NormalizeReduction(eq, exprID);
	}
	public static void NormalizeReduction(SystemBody body, String targetEq) {
		String exprID = "0";
		NormalizeReduction(body, targetEq, exprID);
	}
	public static void NormalizeReduction(StandardEquation eq, String exprID) {
		AbstractReduceExpression reduction = ValueConverter.toAbstractReduceExpression(eq, exprID);
		NormalizeReduction(reduction);
	}
	public static void NormalizeReduction(StandardEquation eq) {
		String exprID = "0";
		NormalizeReduction(eq, exprID);
	}
	public static void SimplifyingReductions(SystemBody body, String targetEq, String exprID, JNIISLMultiAff reuseDep) {
		StandardEquation eq = ValueConverter.toStandardEquation(body, targetEq);
		SimplifyingReductions(eq, exprID, reuseDep);
	}
	public static void SimplifyingReductions(SystemBody body, String targetEq, String exprID, String reuseDepStr) {
		JNIISLMultiAff reuseDep = ValueConverter.toAffineFunction(body, reuseDepStr);
		SimplifyingReductions(body, targetEq, exprID, reuseDep);
	}
	public static void SimplifyingReductions(SystemBody body, String targetEq, JNIISLMultiAff reuseDep) {
		String exprID = "0";
		SimplifyingReductions(body, targetEq, exprID, reuseDep);
	}
	public static void SimplifyingReductions(SystemBody body, String targetEq, String reuseDepStr) {
		String exprID = "0";
		JNIISLMultiAff reuseDep = ValueConverter.toAffineFunction(body, reuseDepStr);
		SimplifyingReductions(body, targetEq, exprID, reuseDep);
	}
	public static void SimplifyingReductions(StandardEquation eq, String exprID, JNIISLMultiAff reuseDep) {
		ReduceExpression reduction = ValueConverter.toReduceExpression(eq, exprID);
		SimplifyingReductions(reduction, reuseDep);
	}
	public static void SimplifyingReductions(StandardEquation eq, String exprID, String reuseDepStr) {
		JNIISLMultiAff reuseDep = ValueConverter.toAffineFunction(eq, reuseDepStr);
		SimplifyingReductions(eq, exprID, reuseDep);
	}
	public static void SimplifyingReductions(StandardEquation eq, JNIISLMultiAff reuseDep) {
		String exprID = "0";
		SimplifyingReductions(eq, exprID, reuseDep);
	}
	public static void SimplifyingReductions(StandardEquation eq, String reuseDepStr) {
		String exprID = "0";
		JNIISLMultiAff reuseDep = ValueConverter.toAffineFunction(eq, reuseDepStr);
		SimplifyingReductions(eq, exprID, reuseDep);
	}
	public static void SimplifyingReductions(ReduceExpression reduction, String reuseDepStr) {
		JNIISLMultiAff reuseDep = ValueConverter.toAffineFunction(reduction, reuseDepStr);
		SimplifyingReductions(reduction, reuseDep);
	}
}
