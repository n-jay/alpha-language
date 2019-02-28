package alpha.commands.groovy

import alpha.model.AlphaRoot
import alpha.model.AlphaRoot
import java.util.List
import alpha.model.AlphaVisitable
import alpha.model.AlphaRoot
import alpha.model.AlphaSystem
import alpha.model.SystemBody
import alpha.model.Equation
import alpha.model.AlphaExpression
import java.util.List
import alpha.model.AlphaRoot
import alpha.model.AlphaSystem
import alpha.model.Variable
import fr.irisa.cairn.jnimap.isl.jni.JNIISLMultiAff
import fr.irisa.cairn.jnimap.isl.jni.JNIISLSet
import alpha.model.SystemBody
import alpha.model.StandardEquation
import alpha.model.AlphaRoot
import fr.irisa.cairn.jnimap.isl.jni.JNIISLMultiAff
import alpha.model.AlphaSystem
import alpha.model.SystemBody
import alpha.model.StandardEquation
import alpha.model.AlphaExpression

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
	Equation GetEquation(SystemBody body, String varName) {
		alpha.commands.Utility.GetEquation(body, varName)
	}
	AlphaExpression GetExpression(Equation eq, int[] exprID) {
		alpha.commands.Utility.GetExpression(eq, exprID)
	}
	AlphaExpression GetExpression(SystemBody body, String varName, int[] exprID) {
		alpha.commands.Utility.GetExpression(body, varName, exprID)
	}
	AlphaExpression GetExpression(AlphaSystem system, int bodyID, String varName, int[] exprID) {
		alpha.commands.Utility.GetExpression(system, bodyID, varName, exprID)
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
	void SubstituteByDef(SystemBody body, StandardEquation targetEq, StandardEquation inlineEq) {
		alpha.commands.Transformations.SubstituteByDef(body, targetEq, inlineEq)
	}
	void SubstituteByDef(SystemBody body, String s_targetEq, String s_inlineEq) {
		alpha.commands.Transformations.SubstituteByDef(body, s_targetEq, s_inlineEq)
	}
	void SerializeReduction(AlphaRoot root, String systemName, int bodyID, String eqName, String exprID, JNIISLMultiAff schedule) {
		alpha.commands.Reductions.SerializeReduction(root, systemName, bodyID, eqName, exprID, schedule)
	}
	void SerializeReduction(AlphaRoot root, String systemName, int bodyID, String eqName, String exprID, String fStr) {
		alpha.commands.Reductions.SerializeReduction(root, systemName, bodyID, eqName, exprID, fStr)
	}
	void SerializeReduction(AlphaSystem system, int bodyID, String eqName, String exprID, JNIISLMultiAff schedule) {
		alpha.commands.Reductions.SerializeReduction(system, bodyID, eqName, exprID, schedule)
	}
	void SerializeReduction(AlphaSystem system, String eqName, String exprID, JNIISLMultiAff schedule) {
		alpha.commands.Reductions.SerializeReduction(system, eqName, exprID, schedule)
	}
	void SerializeReduction(AlphaSystem system, int bodyID, String eqName, String exprID, String fStr) {
		alpha.commands.Reductions.SerializeReduction(system, bodyID, eqName, exprID, fStr)
	}
	void SerializeReduction(AlphaSystem system, String eqName, String exprID, String fStr) {
		alpha.commands.Reductions.SerializeReduction(system, eqName, exprID, fStr)
	}
	void SerializeReduction(SystemBody systemBody, StandardEquation eq, AlphaExpression expr, JNIISLMultiAff schedule) {
		alpha.commands.Reductions.SerializeReduction(systemBody, eq, expr, schedule)
	}
	void SerializeReduction(SystemBody systemBody, String eqName, String exprID, JNIISLMultiAff schedule) {
		alpha.commands.Reductions.SerializeReduction(systemBody, eqName, exprID, schedule)
	}
	void SerializeReduction(SystemBody systemBody, String eqName, String exprID, String fStr) {
		alpha.commands.Reductions.SerializeReduction(systemBody, eqName, exprID, fStr)
	}

}
