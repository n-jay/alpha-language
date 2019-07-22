package alpha.commands;

import alpha.model.AlphaCompleteVisitable;
import alpha.model.AlphaExpression;
import alpha.model.AlphaRoot;

/*PROTECTED REGION ID(TransformationsBase_Imports) ENABLED START*/
//Add custom imports here
/*PROTECTED REGION END*/

import alpha.model.AlphaSystem;
import alpha.model.AlphaVisitable;
import alpha.model.AutoRestrictExpression;
import alpha.model.RestrictExpression;
import alpha.model.StandardEquation;
import alpha.model.SystemBody;
import alpha.model.Variable;
import fr.irisa.cairn.jnimap.isl.ISLMultiAff;


public class TransformationsBase {
	public static void ChangeOfBasis(AlphaSystem system, Variable var, ISLMultiAff f) {
		/*PROTECTED REGION ID(Transformations.ChangeOfBasis_) ENABLED START*/
		alpha.model.transformation.ChangeOfBasis.apply(system, var, f);
		/*PROTECTED REGION END*/
	}
	public static void Normalize(AlphaVisitable node) {
		/*PROTECTED REGION ID(Transformations.Normalize_) ENABLED START*/
		alpha.model.transformation.Normalize.apply(node);
		/*PROTECTED REGION END*/
	}
	public static void Normalize(AlphaExpression expr) {
		/*PROTECTED REGION ID(Transformations.Normalize__1) ENABLED START*/
		alpha.model.transformation.Normalize.apply(expr);
		/*PROTECTED REGION END*/
	}
	public static void DeepNormalize(AlphaVisitable node) {
		/*PROTECTED REGION ID(Transformations.DeepNormalize_) ENABLED START*/
		alpha.model.transformation.Normalize.apply(node, true);
		/*PROTECTED REGION END*/
	}
	public static void DeepNormalize(AlphaExpression expr) {
		/*PROTECTED REGION ID(Transformations.DeepNormalize__1) ENABLED START*/
		alpha.model.transformation.Normalize.apply(expr, true);
		/*PROTECTED REGION END*/
	}
	public static void PropagateSimpleEquations(AlphaSystem system) {
		/*PROTECTED REGION ID(Transformations.PropagateSimpleEquations_) ENABLED START*/
		alpha.model.transformation.PropagateSimpleEquations.apply(system);
		/*PROTECTED REGION END*/
	}
	public static void PropagateSimpleEquations(SystemBody body) {
		/*PROTECTED REGION ID(Transformations.PropagateSimpleEquations_PSE) ENABLED START*/
		alpha.model.transformation.PropagateSimpleEquations.apply(body);
		/*PROTECTED REGION END*/
	}
	public static void LiftAutoRestrict(AlphaCompleteVisitable node) {
		/*PROTECTED REGION ID(Transformations.LiftAutoRestrict_) ENABLED START*/
		alpha.model.transformation.LiftAutoRestrict.apply(node);
		/*PROTECTED REGION END*/
	}
	public static void LiftAutoRestrict(AutoRestrictExpression are) {
		/*PROTECTED REGION ID(Transformations.LiftAutoRestrict__1) ENABLED START*/
		alpha.model.transformation.LiftAutoRestrict.apply(are);
		/*PROTECTED REGION END*/
	}
	public static void RemoveUnusedEquations(AlphaRoot root) {
		/*PROTECTED REGION ID(Transformations.RemoveUnusedEquations_) ENABLED START*/
		alpha.model.transformation.RemoveUnusedEquations.apply(root);
		/*PROTECTED REGION END*/
	}
	public static void RemoveUnusedEquations(AlphaSystem system) {
		/*PROTECTED REGION ID(Transformations.RemoveUnusedEquations__1) ENABLED START*/
		alpha.model.transformation.RemoveUnusedEquations.apply(system);
		/*PROTECTED REGION END*/
	}
	public static void SimplifyExpressions(AlphaVisitable node) {
		/*PROTECTED REGION ID(Transformations.SimplifyExpressions_) ENABLED START*/
		alpha.model.transformation.SimplifyExpressions.apply(node);
		/*PROTECTED REGION END*/
	}
	public static void SplitUnionIntoCase(AlphaSystem system) {
		/*PROTECTED REGION ID(Transformations.SplitUnionIntoCase_) ENABLED START*/
		alpha.model.transformation.SplitUnionIntoCase.apply(system);
		/*PROTECTED REGION END*/
	}
	public static void SplitUnionIntoCase(SystemBody body) {
		/*PROTECTED REGION ID(Transformations.SplitUnionIntoCase_SUIC) ENABLED START*/
		alpha.model.transformation.SplitUnionIntoCase.apply(body);
		/*PROTECTED REGION END*/
	}
	public static void SplitUnionIntoCase(RestrictExpression re) {
		/*PROTECTED REGION ID(Transformations.SplitUnionIntoCase__3) ENABLED START*/
		alpha.model.transformation.SplitUnionIntoCase.apply(re);
		/*PROTECTED REGION END*/
	}
	public static void SplitUnionIntoCase(AutoRestrictExpression re) {
		/*PROTECTED REGION ID(Transformations.SplitUnionIntoCase__4) ENABLED START*/
		alpha.model.transformation.SplitUnionIntoCase.apply(re);
		/*PROTECTED REGION END*/
	}
	public static void SubstituteByDef(AlphaSystem system, Variable inlineVar) {
		/*PROTECTED REGION ID(Transformations.SubstituteByDef_) ENABLED START*/
		alpha.model.transformation.SubstituteByDef.apply(system, inlineVar);
		/*PROTECTED REGION END*/
	}
	public static void SubstituteByDef(SystemBody body, Variable inlineVar) {
		/*PROTECTED REGION ID(Transformations.SubstituteByDef__1) ENABLED START*/
		alpha.model.transformation.SubstituteByDef.apply(body, inlineVar);
		/*PROTECTED REGION END*/
	}
	public static void SubstituteByDef(StandardEquation targetEq, Variable inlineVar) {
		/*PROTECTED REGION ID(Transformations.SubstituteByDef__2) ENABLED START*/
		alpha.model.transformation.SubstituteByDef.apply(targetEq, inlineVar);
		/*PROTECTED REGION END*/
	}
	public static void SubstituteByDef(AlphaExpression targetExpr, Variable inlineVar) {
		/*PROTECTED REGION ID(Transformations.SubstituteByDef__3) ENABLED START*/
		alpha.model.transformation.SubstituteByDef.apply(targetExpr, inlineVar);
		/*PROTECTED REGION END*/
	}
}
