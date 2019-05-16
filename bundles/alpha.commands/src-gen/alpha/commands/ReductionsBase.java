package alpha.commands;

/*PROTECTED REGION ID(ReductionsBase_Imports) ENABLED START*/
import alpha.model.BinaryExpression;
import alpha.model.MultiArgExpression;
/*PROTECTED REGION END*/

import alpha.model.SystemBody;
import alpha.model.transformation.reduction.SameOperatorSimplification;
import alpha.model.AbstractReduceExpression;
import alpha.model.DependenceExpression;
import alpha.model.AlphaExpression;
import alpha.model.AlphaVisitable;
import alpha.model.AlphaSystem;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLMultiAff;
import alpha.model.ReduceExpression;


public class ReductionsBase {
	public static void Distributivity(AbstractReduceExpression are) {
		/*PROTECTED REGION ID(Reductions.Distributivity_Dist1) ENABLED START*/
		alpha.model.transformation.reduction.Distributivity.apply(are);
		/*PROTECTED REGION END*/
	}
	public static void FactorOutFromReduction(DependenceExpression expr) {
		/*PROTECTED REGION ID(Reductions.FactorOutFromReduction_RFactor1) ENABLED START*/
		alpha.model.transformation.reduction.FactorOutFromReduction.apply(expr);
		/*PROTECTED REGION END*/
	}
	public static void HigherOrderOperator(AbstractReduceExpression are) {
		/*PROTECTED REGION ID(Reductions.HigherOrderOperator_HOO1) ENABLED START*/
		alpha.model.transformation.reduction.HigherOrderOperator.apply(are);
		/*PROTECTED REGION END*/
	}
	public static void HoistOutOfReduction(AlphaExpression expr) {
		/*PROTECTED REGION ID(Reductions.HoistOutOfReduction_Hoist1) ENABLED START*/
		if (expr instanceof BinaryExpression) {
			alpha.model.transformation.reduction.HoistOutOfReduction.apply((BinaryExpression)expr);
		}
		if (expr instanceof MultiArgExpression) {
			alpha.model.transformation.reduction.HoistOutOfReduction.apply((MultiArgExpression)expr);
		}
		throw new IllegalArgumentException("[HoistOutOfReduction] Expecting Binary or MultiArgExpression");
		/*PROTECTED REGION END*/
	}
	public static void Idempotence(AbstractReduceExpression are) {
		/*PROTECTED REGION ID(Reductions.Idempotence_Idem1) ENABLED START*/
		alpha.model.transformation.reduction.Idempotence.apply(are);
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
	public static void PermutationCaseReduce(AlphaSystem system) {
		/*PROTECTED REGION ID(Reductions.PermutationCaseReduce_) ENABLED START*/
		alpha.model.transformation.reduction.PermutationCaseReduce.apply(system);
		/*PROTECTED REGION END*/
	}
	public static void PermutationCaseReduce(SystemBody body) {
		/*PROTECTED REGION ID(Reductions.PermutationCaseReduce__1) ENABLED START*/
		alpha.model.transformation.reduction.PermutationCaseReduce.apply(body);
		/*PROTECTED REGION END*/
	}
	public static void PermutationCaseReduce(AbstractReduceExpression are) {
		/*PROTECTED REGION ID(Reductions.PermutationCaseReduce_PCR1) ENABLED START*/
		alpha.model.transformation.reduction.PermutationCaseReduce.apply(are);
		/*PROTECTED REGION END*/
	}
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
	public static void SameOperatorSimplification(AbstractReduceExpression reduction) {
		/*PROTECTED REGION ID(Reductions.SameOperatorSimplification_SameOp1) ENABLED START*/
		SameOperatorSimplification.apply(reduction);
		/*PROTECTED REGION END*/
	}
	public static void SimplifyingReductions(ReduceExpression reduction, JNIISLMultiAff reuseDep) {
		/*PROTECTED REGION ID(Reductions.SimplifyingReductions_SR1) ENABLED START*/
		alpha.model.transformation.reduction.SimplifyingReductions.apply(reduction, reuseDep);
		/*PROTECTED REGION END*/
	}
}
