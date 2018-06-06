package alpha.model.issue;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import alpha.model.AlphaExpression;
import alpha.model.AutoRestrictExpression;
import alpha.model.CalculatorExpression;
import alpha.model.FuzzyFunction;
import alpha.model.ModelPackage;
import alpha.model.POLY_OBJECT_TYPE;
import alpha.model.RestrictExpression;
import alpha.model.SelectExpression;
import alpha.model.StandardEquation;
import alpha.model.UseEquation;
import alpha.model.issue.AlphaIssue.TYPE;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLSet;

public class AlphaIssueFactory {



	public static InvalidSyntaxIssue duplicateSystem(EObject source) {
		return new InvalidSyntaxIssue(TYPE.ERROR, "Duplicate System", source, ModelPackage.Literals.ALPHA_SYSTEM__NAME);
	}
	
	public static InvalidSyntaxIssue duplicateExternalFunction(EObject source) {
		return new InvalidSyntaxIssue(TYPE.ERROR, "Duplicate External Function", source, ModelPackage.Literals.EXTERNAL_FUNCTION__NAME);
	}

	public static InvalidSyntaxIssue duplicateAlphaConstant(EObject source) {
		return new InvalidSyntaxIssue(TYPE.ERROR, "Duplicate constant", source, ModelPackage.Literals.ALPHA_CONSTANT__NAME);
	}
	
	public static InvalidSyntaxIssue duplicatePolyObject(EObject source) {
		return new InvalidSyntaxIssue(TYPE.ERROR, "Duplicate Name", source, ModelPackage.Literals.POLYHEDRAL_OBJECT__NAME);
	}

	public static InvalidSyntaxIssue duplicateStandardEquation(EObject source) {
		return new InvalidSyntaxIssue(TYPE.ERROR, "This StandardEquation defined a variable that is defined by another equation.", source, ModelPackage.Literals.STANDARD_EQUATION__VARIABLE);
	}

	public static InvalidSyntaxIssue duplicateUseEquation(EObject source) {
		return new InvalidSyntaxIssue(TYPE.ERROR, "This UseEquation defines a variable that is defined by another equation.", source, ModelPackage.Literals.USE_EQUATION__OUTPUT_EXPRS);
	}

	public static InvalidSyntaxIssue duplicateVariable(EObject source) {
		return new InvalidSyntaxIssue(TYPE.ERROR, "Duplicate Name", source, ModelPackage.Literals.VARIABLE__NAME);
	}
	
	public static InvalidSyntaxIssue autoRestrictNotInCase(AutoRestrictExpression auto) {
		return new InvalidSyntaxIssue(TYPE.ERROR, "AutoRestrict can only be a direct child of CaseExpression (in current version)", auto, null);
	}
	
	public static InvalidSyntaxIssue multipleAutoRestrict(AutoRestrictExpression auto) {
		return new InvalidSyntaxIssue(TYPE.ERROR, "More than one AutoRestrict is not allowed in a CaseExpression.", auto, null);
	}
	
	public static InvalidSyntaxIssue subsystemWithIncompatibleParameters(UseEquation ue) {
		return new InvalidSyntaxIssue(TYPE.ERROR, "Number of parameters does not match the callee.", ue, ModelPackage.Literals.USE_EQUATION__SYSTEM);
	}
	
	public static InvalidSyntaxIssue subsystemWithIncompatibleInputs(UseEquation ue) {
		return new InvalidSyntaxIssue(TYPE.ERROR, "Number of inputs does not match the callee.", ue, ModelPackage.Literals.USE_EQUATION__INPUT_EXPRS);
	}
	
	public static InvalidSyntaxIssue subsystemWithIncompatibleOutputs(UseEquation ue) {
		return new InvalidSyntaxIssue(TYPE.ERROR, "Number of outputs does not match the callee.", ue, ModelPackage.Literals.USE_EQUATION__OUTPUT_EXPRS);
	}


	public static CalculatorExpressionIssue expectingSet(UseEquation expr, EStructuralFeature feature) {
		return new CalculatorExpressionIssue(TYPE.ERROR, "Expecting calculator expression to evaluate as set/domain", expr, feature);
	}
	public static CalculatorExpressionIssue expectingSet(AlphaExpression expr, EStructuralFeature feature) {
		return new CalculatorExpressionIssue(TYPE.ERROR, "Expecting calculator expression to evaluate as set/domain", expr, feature);
	}
	public static CalculatorExpressionIssue expectingMap(AlphaExpression expr, EStructuralFeature feature) {
		return new CalculatorExpressionIssue(TYPE.ERROR, "Expecting calculator expression to evaluate as map/relation", expr, feature);
	}
	public static CalculatorExpressionIssue expectingFunction(UseEquation ue, EStructuralFeature feature) {
		return new CalculatorExpressionIssue(TYPE.ERROR, "Expecting calculator expression to evaluate as function", ue, feature);
	}
	public static CalculatorExpressionIssue unmatchedCalcExprType(CalculatorExpression cexpr, POLY_OBJECT_TYPE expected) {
		String name = cexpr.eContainer().eClass().getName();
		return new CalculatorExpressionIssue(
				TYPE.ERROR, "Calculator Expression for a " + name + " must evaluate to "+expected.getName()+".",
				cexpr.eContainer(), cexpr.eContainingFeature());
	}
	
	public static CalculatorExpressionIssue unwrappedFuzzyFunction(FuzzyFunction ff) {
		//TODO
		return new CalculatorExpressionIssue(TYPE.ERROR, "Fuzzy function is not wrapped", ff.eContainer(), null);
	}
	
	
	
	public static DomainConsistencyIssue incompleteEquation(StandardEquation eq, JNIISLSet paramDomain, JNIISLSet domain) {
		return new DomainConsistencyIssue(TYPE.ERROR, 
				String.format("Equation for %s is not defined with parameters %s for %s", eq.getVariable().getName(), paramDomain.toString(), domain.toString()), 
				eq.getExpr(), null);
	}
	
	public static DomainConsistencyIssue overlappingCaseBranch(AlphaExpression branch, JNIISLSet overlap) {
		return new DomainConsistencyIssue(TYPE.ERROR, 
				String.format("Context domain of cases brances are overlapped: %s", overlap.toString()), 
				branch, null);
	}
	
	public static DomainConsistencyIssue emptyAutoRestrict(AutoRestrictExpression auto ) {
		return new DomainConsistencyIssue(TYPE.WARNING, "The inferrerd AutoRestrict domain is empty.", auto, null);
	}
	
	public static DomainConsistencyIssue umatchedRestrictDomainDimensions(RestrictExpression re) {
		return new DomainConsistencyIssue(TYPE.ERROR,
				"Dimensionality of the restrict domain does not match its context.", re,
				ModelPackage.Literals.RESTRICT_EXPRESSION__DOMAIN_EXPR);
	}
	
	public static DomainConsistencyIssue unmatchedSelectRelationDimensions(SelectExpression se) {
		return new DomainConsistencyIssue(TYPE.ERROR,
				"Dimensionality of the select relation does not match its context.", se,
				ModelPackage.Literals.SELECT_EXPRESSION__RELATION_EXPR);
	}
	
}
