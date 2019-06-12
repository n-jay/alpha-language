package alpha.commands;

import alpha.model.AbstractReduceExpression;
import alpha.model.AlphaExpression;
import alpha.model.DependenceExpression;
import alpha.model.ReduceExpression;
import alpha.model.StandardEquation;
import alpha.model.SystemBody;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLMultiAff;


public class Reductions extends ReductionsBase {
	public static void Distributivity(SystemBody body, String targetEq, String exprID) {
		StandardEquation eq = ValueConverter.toStandardEquation(body, targetEq);
		Distributivity(eq, exprID);
	}
	public static void Distributivity(SystemBody body, String targetEq) {
		String exprID = "0";
		Distributivity(body, targetEq, exprID);
	}
	public static void Distributivity(StandardEquation eq, String exprID) {
		AbstractReduceExpression are = ValueConverter.toAbstractReduceExpression(eq, exprID);
		Distributivity(are);
	}
	public static void Distributivity(StandardEquation eq) {
		String exprID = "0";
		Distributivity(eq, exprID);
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
	public static void HigherOrderOperator(SystemBody body, String targetEq, String exprID) {
		StandardEquation eq = ValueConverter.toStandardEquation(body, targetEq);
		HigherOrderOperator(eq, exprID);
	}
	public static void HigherOrderOperator(SystemBody body, String targetEq) {
		String exprID = "0";
		HigherOrderOperator(body, targetEq, exprID);
	}
	public static void HigherOrderOperator(StandardEquation eq, String exprID) {
		AbstractReduceExpression are = ValueConverter.toAbstractReduceExpression(eq, exprID);
		HigherOrderOperator(are);
	}
	public static void HigherOrderOperator(StandardEquation eq) {
		String exprID = "0";
		HigherOrderOperator(eq, exprID);
	}
	public static void HoistOutOfReduction(SystemBody body, String targetEq, String exprID) {
		StandardEquation eq = ValueConverter.toStandardEquation(body, targetEq);
		HoistOutOfReduction(eq, exprID);
	}
	public static void HoistOutOfReduction(SystemBody body, String targetEq) {
		String exprID = "0";
		HoistOutOfReduction(body, targetEq, exprID);
	}
	public static void HoistOutOfReduction(StandardEquation eq, String exprID) {
		AlphaExpression expr = ValueConverter.toAlphaExpression(eq, exprID);
		HoistOutOfReduction(expr);
	}
	public static void HoistOutOfReduction(StandardEquation eq) {
		String exprID = "0";
		HoistOutOfReduction(eq, exprID);
	}
	public static void Idempotence(SystemBody body, String targetEq, String exprID) {
		StandardEquation eq = ValueConverter.toStandardEquation(body, targetEq);
		Idempotence(eq, exprID);
	}
	public static void Idempotence(SystemBody body, String targetEq) {
		String exprID = "0";
		Idempotence(body, targetEq, exprID);
	}
	public static void Idempotence(StandardEquation eq, String exprID) {
		AbstractReduceExpression are = ValueConverter.toAbstractReduceExpression(eq, exprID);
		Idempotence(are);
	}
	public static void Idempotence(StandardEquation eq) {
		String exprID = "0";
		Idempotence(eq, exprID);
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
	public static void PermutationCaseReduce(SystemBody body, String targetEq, String exprID) {
		StandardEquation eq = ValueConverter.toStandardEquation(body, targetEq);
		PermutationCaseReduce(eq, exprID);
	}
	public static void PermutationCaseReduce(SystemBody body, String targetEq) {
		String exprID = "0";
		PermutationCaseReduce(body, targetEq, exprID);
	}
	public static void PermutationCaseReduce(StandardEquation eq, String exprID) {
		AbstractReduceExpression are = ValueConverter.toAbstractReduceExpression(eq, exprID);
		PermutationCaseReduce(are);
	}
	public static void PermutationCaseReduce(StandardEquation eq) {
		String exprID = "0";
		PermutationCaseReduce(eq, exprID);
	}
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
	public static void SameOperatorSimplification(SystemBody body, String targetEq, String exprID) {
		StandardEquation eq = ValueConverter.toStandardEquation(body, targetEq);
		SameOperatorSimplification(eq, exprID);
	}
	public static void SameOperatorSimplification(SystemBody body, String targetEq) {
		String exprID = "0";
		SameOperatorSimplification(body, targetEq, exprID);
	}
	public static void SameOperatorSimplification(StandardEquation eq, String exprID) {
		AbstractReduceExpression reduction = ValueConverter.toAbstractReduceExpression(eq, exprID);
		SameOperatorSimplification(reduction);
	}
	public static void SameOperatorSimplification(StandardEquation eq) {
		String exprID = "0";
		SameOperatorSimplification(eq, exprID);
	}
	public static void SimplifyingReductions(SystemBody body, String targetEq, String exprID, int[] reuseVec) {
		StandardEquation eq = ValueConverter.toStandardEquation(body, targetEq);
		SimplifyingReductions(eq, exprID, reuseVec);
	}
	public static void SimplifyingReductions(SystemBody body, String targetEq, String exprID, String reuseVecStr) {
		int[] reuseVec = ValueConverter.toIntegerArray(reuseVecStr);
		SimplifyingReductions(body, targetEq, exprID, reuseVec);
	}
	public static void SimplifyingReductions(SystemBody body, String targetEq, int[] reuseVec) {
		String exprID = "0";
		SimplifyingReductions(body, targetEq, exprID, reuseVec);
	}
	public static void SimplifyingReductions(SystemBody body, String targetEq, String reuseVecStr) {
		String exprID = "0";
		int[] reuseVec = ValueConverter.toIntegerArray(reuseVecStr);
		SimplifyingReductions(body, targetEq, exprID, reuseVec);
	}
	public static void SimplifyingReductions(StandardEquation eq, String exprID, int[] reuseVec) {
		ReduceExpression reduction = ValueConverter.toReduceExpression(eq, exprID);
		SimplifyingReductions(reduction, reuseVec);
	}
	public static void SimplifyingReductions(StandardEquation eq, String exprID, String reuseVecStr) {
		int[] reuseVec = ValueConverter.toIntegerArray(reuseVecStr);
		SimplifyingReductions(eq, exprID, reuseVec);
	}
	public static void SimplifyingReductions(StandardEquation eq, int[] reuseVec) {
		String exprID = "0";
		SimplifyingReductions(eq, exprID, reuseVec);
	}
	public static void SimplifyingReductions(StandardEquation eq, String reuseVecStr) {
		String exprID = "0";
		int[] reuseVec = ValueConverter.toIntegerArray(reuseVecStr);
		SimplifyingReductions(eq, exprID, reuseVec);
	}
	public static void SimplifyingReductions(ReduceExpression reduction, String reuseVecStr) {
		int[] reuseVec = ValueConverter.toIntegerArray(reuseVecStr);
		SimplifyingReductions(reduction, reuseVec);
	}
}
