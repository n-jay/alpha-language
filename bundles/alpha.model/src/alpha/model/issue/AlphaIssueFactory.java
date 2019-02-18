package alpha.model.issue;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import alpha.model.AlphaExpression;
import alpha.model.AlphaSystem;
import alpha.model.AutoRestrictExpression;
import alpha.model.CalculatorExpression;
import alpha.model.FuzzyFunction;
import alpha.model.ModelPackage;
import alpha.model.POLY_OBJECT_TYPE;
import alpha.model.RestrictExpression;
import alpha.model.SelectExpression;
import alpha.model.StandardEquation;
import alpha.model.SystemBody;
import alpha.model.UseEquation;
import alpha.model.Variable;
import alpha.model.issue.AlphaIssue.TYPE;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLSet;

/**
 * Convenience methods for creating various types of AlphaIssues.
 * 
 * @author tyuki
 *
 */
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
	
	public static InvalidSyntaxIssue multipleUnrestrictedSystemBody(SystemBody body) {
		return new InvalidSyntaxIssue(TYPE.ERROR, "At most one SystemBody can be free (without when clause).", body, null);
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
	
	


	public static DomainConsistencyIssue incompatibleContextAndExpressionDomain(EObject source) {
		return new DomainConsistencyIssue(TYPE.ERROR, "The context domain and expression domain are incompatible.", source, null);
	}
	public static DomainConsistencyIssue incompleteEquation(StandardEquation eq, JNIISLSet paramDomain, JNIISLSet domain) {
		return new DomainConsistencyIssue(TYPE.ERROR, 
				String.format("Equation for %s is not defined with parameters %s for %s", eq.getVariable().getName(), paramDomain.toString(), domain.toString()), 
				eq.getExpr(), null);
	}
	public static DomainConsistencyIssue incompleteUseEquation(Variable v, AlphaExpression expr, JNIISLSet domain) {
		return new DomainConsistencyIssue(TYPE.ERROR, 
				String.format("UseEquation(s) for %s does not define the variable for %s", v.getName(), domain.toString()), 
				expr, null);
	}
	public static DomainConsistencyIssue incompleteSystem(AlphaSystem system, JNIISLSet domain) {
		return new DomainConsistencyIssue(TYPE.ERROR, 
				String.format("SystemBodies for %s does not cover the entire parameter domain. Missing: %s", system.getName(), domain.toString()), 
				system, null);
	}
	
	public static DomainConsistencyIssue overlappingCaseBranch(AlphaExpression branch, JNIISLSet overlap) {
		return new DomainConsistencyIssue(TYPE.ERROR, 
				String.format("Context domain of cases brances are overlapped: %s", overlap.toString()), 
				branch, null);
	}
	
	public static DomainConsistencyIssue overlappingUseEquations(AlphaExpression branch, JNIISLSet overlap) {
		return new DomainConsistencyIssue(TYPE.ERROR, 
				String.format("The UseEquations define overlapping domains of the output: %s", overlap.toString()), 
				branch, null);
	}
	
	public static DomainConsistencyIssue overlappingSystemBodies(SystemBody body, JNIISLSet overlap) {
		return new DomainConsistencyIssue(TYPE.ERROR, 
				String.format("The SystemBodies define overlapping domains of the output: %s", overlap.toString()), 
				body, null);
	}
	
	public static DomainConsistencyIssue emptyAutoRestrict(AutoRestrictExpression auto ) {
		return new DomainConsistencyIssue(TYPE.WARNING, "The inferrerd AutoRestrict domain is empty.", auto, null);
	}
	public static DomainConsistencyIssue emptySystemBody(SystemBody body ) {
		return new DomainConsistencyIssue(TYPE.WARNING, "The inferrerd SystemBody domain is empty.", body, null);
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
