package alpha.commands.groovy

import alpha.model.AlphaRoot
import alpha.model.AlphaRoot
import java.util.List
import alpha.model.AlphaVisitable
import alpha.model.AlphaSystem
import alpha.model.AlphaRoot
import alpha.model.AlphaSystem
import alpha.model.SystemBody
import alpha.model.StandardEquation
import alpha.model.AlphaExpression
import alpha.model.AlphaRoot
import java.util.List
import alpha.model.Equation
import alpha.model.AlphaVisitable
import alpha.model.AlphaSystem
import alpha.model.SystemBody
import alpha.model.AlphaRoot
import alpha.model.Variable
import fr.irisa.cairn.jnimap.isl.jni.JNIISLMultiAff
import fr.irisa.cairn.jnimap.isl.jni.JNIISLSet
import alpha.model.StandardEquation
import alpha.model.AlphaSystem
import alpha.model.SystemBody
import alpha.model.StandardEquation
import alpha.model.AbstractReduceExpression
import fr.irisa.cairn.jnimap.isl.jni.JNIISLMultiAff
import alpha.model.DependenceExpression
import alpha.model.AlphaVisitable
import alpha.model.ReduceExpression

abstract class AlphaScript extends AbstractAlphaScript {

	AlphaRoot ReadAlpha(String file) {
		alpha.commands.Core.ReadAlpha(file)
	}
	List<AlphaRoot> ReadAlphaBundle(String file) {
		alpha.commands.Core.ReadAlphaBundle(file)
	}
	void Show(AlphaVisitable node) {
		alpha.commands.Core.Show(node)
	}
	void AShow(AlphaVisitable node) {
		alpha.commands.Core.AShow(node)
	}
	void Save(AlphaRoot root, String filename) {
		alpha.commands.Core.Save(root, filename)
	}
	void ASave(AlphaRoot root, String filename) {
		alpha.commands.Core.ASave(root, filename)
	}
	void Normalize(AlphaVisitable node) {
		alpha.commands.Core.Normalize(node)
	}
	void DeepNormalize(AlphaVisitable node) {
		alpha.commands.Core.DeepNormalize(node)
	}
	void CheckProgram(AlphaRoot root) {
		alpha.commands.Core.CheckProgram(root)
	}
	void PrintAST(AlphaRoot root) {
		alpha.commands.Core.PrintAST(root)
	}
	void PrintAST(AlphaSystem system) {
		alpha.commands.Core.PrintAST(system)
	}
	void WriteToFile(String filepath, String content) {
		alpha.commands.Utility.WriteToFile(filepath, content)
	}
	AlphaRoot GetRoot(List<AlphaRoot> bundle, String systemName) {
		alpha.commands.Utility.GetRoot(bundle, systemName)
	}
	AlphaSystem GetSystem(AlphaRoot root, String systemName) {
		alpha.commands.Utility.GetSystem(root, systemName)
	}
	SystemBody GetSystemBody(AlphaSystem system, int bodyID) {
		alpha.commands.Utility.GetSystemBody(system, bodyID)
	}
	SystemBody GetSystemBody(AlphaSystem system) {
		alpha.commands.Utility.GetSystemBody(system)
	}
	StandardEquation GetEquation(SystemBody body, String varName) {
		alpha.commands.Utility.GetEquation(body, varName)
	}
	AlphaExpression GetExpression(Equation eq, String exprID) {
		alpha.commands.Utility.GetExpression(eq, exprID)
	}
	AlphaExpression GetExpression(Equation eq) {
		alpha.commands.Utility.GetExpression(eq)
	}
	AlphaExpression GetExpression(SystemBody body, String varName, String exprID) {
		alpha.commands.Utility.GetExpression(body, varName, exprID)
	}
	AlphaExpression GetExpression(SystemBody body, String varName) {
		alpha.commands.Utility.GetExpression(body, varName)
	}
	AlphaExpression GetExpression(AlphaSystem system, int bodyID, String varName, String exprID) {
		alpha.commands.Utility.GetExpression(system, bodyID, varName, exprID)
	}
	AlphaExpression GetExpression(AlphaSystem system, String varName, String exprID) {
		alpha.commands.Utility.GetExpression(system, varName, exprID)
	}
	AlphaExpression GetExpression(AlphaSystem system, int bodyID, String varName) {
		alpha.commands.Utility.GetExpression(system, bodyID, varName)
	}
	AlphaExpression GetExpression(AlphaSystem system, String varName) {
		alpha.commands.Utility.GetExpression(system, varName)
	}
	void RenameVariable(AlphaSystem system, String oldName, String newName) {
		alpha.commands.Utility.RenameVariable(system, oldName, newName)
	}
	void SimplifyExpressions(AlphaVisitable node) {
		alpha.commands.Transformations.SimplifyExpressions(node)
	}
	void PropagateSimpleEquations(AlphaSystem system) {
		alpha.commands.Transformations.PropagateSimpleEquations(system)
	}
	void PropagateSimpleEquations(AlphaSystem system, int bodyID) {
		alpha.commands.Transformations.PropagateSimpleEquations(system, bodyID)
	}
	void PropagateSimpleEquations(SystemBody body) {
		alpha.commands.Transformations.PropagateSimpleEquations(body)
	}
	void RemoveUnusedEquations(AlphaRoot root) {
		alpha.commands.Transformations.RemoveUnusedEquations(root)
	}
	void RemoveUnusedEquations(AlphaSystem system) {
		alpha.commands.Transformations.RemoveUnusedEquations(system)
	}
	void ChangeOfBasis(AlphaSystem system, Variable var, JNIISLMultiAff f) {
		alpha.commands.Transformations.ChangeOfBasis(system, var, f)
	}
	void ChangeOfBasis(AlphaSystem system, String varName, String fStr) {
		alpha.commands.Transformations.ChangeOfBasis(system, varName, fStr)
	}
	void Split(AlphaSystem system, Variable var, JNIISLSet splitDom) {
		alpha.commands.Transformations.Split(system, var, splitDom)
	}
	void Split(AlphaSystem system, String varName, String s_splitDom) {
		alpha.commands.Transformations.Split(system, varName, s_splitDom)
	}
	void SubstituteByDef(AlphaSystem system, Variable inlineVar) {
		alpha.commands.Transformations.SubstituteByDef(system, inlineVar)
	}
	void SubstituteByDef(AlphaSystem system, String inlineVarStr) {
		alpha.commands.Transformations.SubstituteByDef(system, inlineVarStr)
	}
	void SubstituteByDef(SystemBody body, Variable inlineVar) {
		alpha.commands.Transformations.SubstituteByDef(body, inlineVar)
	}
	void SubstituteByDef(SystemBody body, String inlineVarStr) {
		alpha.commands.Transformations.SubstituteByDef(body, inlineVarStr)
	}
	void SubstituteByDef(SystemBody body, StandardEquation targetEq, Variable inlineVar) {
		alpha.commands.Transformations.SubstituteByDef(body, targetEq, inlineVar)
	}
	void SubstituteByDef(SystemBody body, String s_targetEq, String inlineVarStr) {
		alpha.commands.Transformations.SubstituteByDef(body, s_targetEq, inlineVarStr)
	}
	void ReductionComposition(AlphaSystem system) {
		alpha.commands.Reductions.ReductionComposition(system)
	}
	void ReductionComposition(SystemBody body) {
		alpha.commands.Reductions.ReductionComposition(body)
	}
	void ReductionComposition(SystemBody body, String targetEq, String exprID) {
		alpha.commands.Reductions.ReductionComposition(body, targetEq, exprID)
	}
	void ReductionComposition(SystemBody body, String targetEq) {
		alpha.commands.Reductions.ReductionComposition(body, targetEq)
	}
	void ReductionComposition(StandardEquation eq, String exprID) {
		alpha.commands.Reductions.ReductionComposition(eq, exprID)
	}
	void ReductionComposition(StandardEquation eq) {
		alpha.commands.Reductions.ReductionComposition(eq)
	}
	void ReductionComposition(AbstractReduceExpression reduction) {
		alpha.commands.Reductions.ReductionComposition(reduction)
	}
	void ReducionDecomposition(SystemBody body, String targetEq, String exprID, JNIISLMultiAff f1, JNIISLMultiAff f2) {
		alpha.commands.Reductions.ReducionDecomposition(body, targetEq, exprID, f1, f2)
	}
	void ReducionDecomposition(SystemBody body, String targetEq, String exprID, String f1Str, String f2Str) {
		alpha.commands.Reductions.ReducionDecomposition(body, targetEq, exprID, f1Str, f2Str)
	}
	void ReducionDecomposition(StandardEquation eq, String exprID, JNIISLMultiAff f1, JNIISLMultiAff f2) {
		alpha.commands.Reductions.ReducionDecomposition(eq, exprID, f1, f2)
	}
	void ReducionDecomposition(StandardEquation eq, JNIISLMultiAff f1, JNIISLMultiAff f2) {
		alpha.commands.Reductions.ReducionDecomposition(eq, f1, f2)
	}
	void ReducionDecomposition(StandardEquation eq, String exprID, String f1Str, String f2Str) {
		alpha.commands.Reductions.ReducionDecomposition(eq, exprID, f1Str, f2Str)
	}
	void ReducionDecomposition(StandardEquation eq, String f1Str, String f2Str) {
		alpha.commands.Reductions.ReducionDecomposition(eq, f1Str, f2Str)
	}
	void ReductionDecomposition(AbstractReduceExpression reduction, JNIISLMultiAff f1, JNIISLMultiAff f2) {
		alpha.commands.Reductions.ReductionDecomposition(reduction, f1, f2)
	}
	void ReductionDecomposition(AbstractReduceExpression reduction, String f1Str, String f2Str) {
		alpha.commands.Reductions.ReductionDecomposition(reduction, f1Str, f2Str)
	}
	void FactorOutFromReduction(SystemBody body, String targetEq, String exprID) {
		alpha.commands.Reductions.FactorOutFromReduction(body, targetEq, exprID)
	}
	void FactorOutFromReduction(SystemBody body, String targetEq) {
		alpha.commands.Reductions.FactorOutFromReduction(body, targetEq)
	}
	void FactorOutFromReduction(StandardEquation eq, String exprID) {
		alpha.commands.Reductions.FactorOutFromReduction(eq, exprID)
	}
	void FactorOutFromReduction(StandardEquation eq) {
		alpha.commands.Reductions.FactorOutFromReduction(eq)
	}
	void FactorOutFromReduction(DependenceExpression expr) {
		alpha.commands.Reductions.FactorOutFromReduction(expr)
	}
	void NormalizeReduction(AlphaVisitable node) {
		alpha.commands.Reductions.NormalizeReduction(node)
	}
	void NormalizeReduction(SystemBody body, String targetEq, String exprID) {
		alpha.commands.Reductions.NormalizeReduction(body, targetEq, exprID)
	}
	void NormalizeReduction(SystemBody body, String targetEq) {
		alpha.commands.Reductions.NormalizeReduction(body, targetEq)
	}
	void NormalizeReduction(StandardEquation eq, String exprID) {
		alpha.commands.Reductions.NormalizeReduction(eq, exprID)
	}
	void NormalizeReduction(StandardEquation eq) {
		alpha.commands.Reductions.NormalizeReduction(eq)
	}
	void NormalizeReduction(AbstractReduceExpression reduction) {
		alpha.commands.Reductions.NormalizeReduction(reduction)
	}
	void SimplifyingReductions(SystemBody body, String targetEq, String exprID, JNIISLMultiAff reuseDep) {
		alpha.commands.Reductions.SimplifyingReductions(body, targetEq, exprID, reuseDep)
	}
	void SimplifyingReductions(SystemBody body, String targetEq, String exprID, String reuseDepStr) {
		alpha.commands.Reductions.SimplifyingReductions(body, targetEq, exprID, reuseDepStr)
	}
	void SimplifyingReductions(SystemBody body, String targetEq, JNIISLMultiAff reuseDep) {
		alpha.commands.Reductions.SimplifyingReductions(body, targetEq, reuseDep)
	}
	void SimplifyingReductions(SystemBody body, String targetEq, String reuseDepStr) {
		alpha.commands.Reductions.SimplifyingReductions(body, targetEq, reuseDepStr)
	}
	void SimplifyingReductions(StandardEquation eq, String exprID, JNIISLMultiAff reuseDep) {
		alpha.commands.Reductions.SimplifyingReductions(eq, exprID, reuseDep)
	}
	void SimplifyingReductions(StandardEquation eq, String exprID, String reuseDepStr) {
		alpha.commands.Reductions.SimplifyingReductions(eq, exprID, reuseDepStr)
	}
	void SimplifyingReductions(StandardEquation eq, JNIISLMultiAff reuseDep) {
		alpha.commands.Reductions.SimplifyingReductions(eq, reuseDep)
	}
	void SimplifyingReductions(StandardEquation eq, String reuseDepStr) {
		alpha.commands.Reductions.SimplifyingReductions(eq, reuseDepStr)
	}
	void SimplifyingReductions(ReduceExpression reduction, JNIISLMultiAff reuseDep) {
		alpha.commands.Reductions.SimplifyingReductions(reduction, reuseDep)
	}
	void SimplifyingReductions(ReduceExpression reduction, String reuseDepStr) {
		alpha.commands.Reductions.SimplifyingReductions(reduction, reuseDepStr)
	}

}
