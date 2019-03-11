package alpha.commands;

/*PROTECTED REGION ID(ReductionsBase_Imports) ENABLED START*/
//Add custom imports here
/*PROTECTED REGION END*/

import alpha.model.AlphaSystem;
import alpha.model.SystemBody;
import alpha.model.StandardEquation;
import alpha.model.AbstractReduceExpression;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLMultiAff;
import alpha.model.DependenceExpression;
import alpha.model.AlphaVisitable;
import alpha.model.ReduceExpression;


public class ReductionsBase {
	public static void ReductionComposition(AlphaSystem system) {
		/*PROTECTED REGION ID(Reductions.ReductionComposition_) ENABLED START*/
		alpha.model.transformation.reduction.ReductionComposition.apply(system);
		/*PROTECTED REGION END*/
	}
	public static void ReductionComposition(SystemBody body) {
		/*PROTECTED REGION ID(Reductions.ReductionComposition__1) ENABLED START*/
		alpha.model.transformation.reduction.ReductionComposition.apply(body);
		/*PROTECTED REGION END*/
	}
	public static void ReductionComposition(AbstractReduceExpression reduction) {
		/*PROTECTED REGION ID(Reductions.ReductionComposition_RComp1) ENABLED START*/
		alpha.model.transformation.reduction.ReductionComposition.apply(reduction);
		/*PROTECTED REGION END*/
	}
	public static void ReductionDecomposition(AbstractReduceExpression reduction, JNIISLMultiAff f1, JNIISLMultiAff f2) {
		/*PROTECTED REGION ID(Reductions.ReductionDecomposition_RDecomp1) ENABLED START*/
		alpha.model.transformation.reduction.ReductionDecomposition.apply(reduction, f1, f2);
		/*PROTECTED REGION END*/
	}
	public static void FactorOutFromReduction(DependenceExpression expr) {
		/*PROTECTED REGION ID(Reductions.FactorOutFromReduction_RFactor1) ENABLED START*/
		alpha.model.transformation.reduction.FactorOutFromReduction.apply(expr);
		/*PROTECTED REGION END*/
	}
	public static void NormalizeReduction(AlphaVisitable node) {
		/*PROTECTED REGION ID(Reductions.NormalizeReduction_) ENABLED START*/
		alpha.model.transformation.reduction.NormalizeReduction.apply(node);
		/*PROTECTED REGION END*/
	}
	public static void NormalizeReduction(AbstractReduceExpression reduction) {
		/*PROTECTED REGION ID(Reductions.NormalizeReduction_NR1) ENABLED START*/
		alpha.model.transformation.reduction.NormalizeReduction.apply(reduction);
		/*PROTECTED REGION END*/
	}
	public static void SimplifyingReductions(ReduceExpression reduction, JNIISLMultiAff reuseDep) {
		/*PROTECTED REGION ID(Reductions.SimplifyingReductions_SR1) ENABLED START*/
		alpha.model.transformation.reduction.SimplifyingReductions.apply(reduction, reuseDep);
		/*PROTECTED REGION END*/
	}
}
