/*
 * generated by Xtext 2.12.0
 */
package alpha.ide.contentassist.antlr;

import alpha.ide.contentassist.antlr.internal.InternalAlphaParser;
import alpha.services.AlphaGrammarAccess;
import com.google.inject.Inject;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class AlphaParser extends AbstractContentAssistParser {

	@Inject
	private AlphaGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalAlphaParser createParser() {
		InternalAlphaParser result = new InternalAlphaParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getAbstractElementAccess().getAlternatives(), "rule__AbstractElement__Alternatives");
					put(grammarAccess.getADomainExpressionAccess().getAlternatives(), "rule__ADomainExpression__Alternatives");
					put(grammarAccess.getADomainTerminalAccess().getAlternatives(), "rule__ADomainTerminal__Alternatives");
					put(grammarAccess.getISLStringAccess().getAlternatives(), "rule__ISLString__Alternatives");
					put(grammarAccess.getAAlphaExpressionAccess().getAlternatives(), "rule__AAlphaExpression__Alternatives");
					put(grammarAccess.getAAlphabetsTerminalExpressionAccess().getAlternatives(), "rule__AAlphabetsTerminalExpression__Alternatives");
					put(grammarAccess.getAOrExpressionAccess().getOperatorAlternatives_1_1_0(), "rule__AOrExpression__OperatorAlternatives_1_1_0");
					put(grammarAccess.getAAndExpressionAccess().getOperatorAlternatives_1_1_0(), "rule__AAndExpression__OperatorAlternatives_1_1_0");
					put(grammarAccess.getAAdditiveExpressionAccess().getOpAlternatives_1_1_0(), "rule__AAdditiveExpression__OpAlternatives_1_1_0");
					put(grammarAccess.getAMultiplicativeExpressionAccess().getOpAlternatives_1_1_0(), "rule__AMultiplicativeExpression__OpAlternatives_1_1_0");
					put(grammarAccess.getAMinMaxExpressionAccess().getOpAlternatives_1_1_0(), "rule__AMinMaxExpression__OpAlternatives_1_1_0");
					put(grammarAccess.getAUnaryOrTerminalExpressionAccess().getAlternatives(), "rule__AUnaryOrTerminalExpression__Alternatives");
					put(grammarAccess.getAUnaryExpressionAccess().getAlternatives(), "rule__AUnaryExpression__Alternatives");
					put(grammarAccess.getAIndexExpressionAccess().getAlternatives(), "rule__AIndexExpression__Alternatives");
					put(grammarAccess.getAReduceExpressionAccess().getProjectionAlternatives_4_0(), "rule__AReduceExpression__ProjectionAlternatives_4_0");
					put(grammarAccess.getAArgReduceExpressionAccess().getProjectionAlternatives_4_0(), "rule__AArgReduceExpression__ProjectionAlternatives_4_0");
					put(grammarAccess.getAConstantExpressionAccess().getAlternatives(), "rule__AConstantExpression__Alternatives");
					put(grammarAccess.getAMultiArgExpressionAccess().getAlternatives(), "rule__AMultiArgExpression__Alternatives");
					put(grammarAccess.getIndexAffineExpressionAccess().getAlternatives_1_0(), "rule__IndexAffineExpression__Alternatives_1_0");
					put(grammarAccess.getIndexAffineExpressionTerminalAccess().getAlternatives_1(), "rule__IndexAffineExpressionTerminal__Alternatives_1");
					put(grammarAccess.getAReductionOperatorAccess().getAlternatives(), "rule__AReductionOperator__Alternatives");
					put(grammarAccess.getARITHMETIC_OPAccess().getAlternatives(), "rule__ARITHMETIC_OP__Alternatives");
					put(grammarAccess.getLOGICAL_OPAccess().getAlternatives(), "rule__LOGICAL_OP__Alternatives");
					put(grammarAccess.getREDUCTION_OPAccess().getAlternatives(), "rule__REDUCTION_OP__Alternatives");
					put(grammarAccess.getARITHMETIC_REDUCTION_OPAccess().getAlternatives(), "rule__ARITHMETIC_REDUCTION_OP__Alternatives");
					put(grammarAccess.getLOGICAL_REDUCTION_OPAccess().getAlternatives(), "rule__LOGICAL_REDUCTION_OP__Alternatives");
					put(grammarAccess.getARITHMETIC_NONREDUCTION_OPAccess().getAlternatives(), "rule__ARITHMETIC_NONREDUCTION_OP__Alternatives");
					put(grammarAccess.getRELATIONAL_OPAccess().getAlternatives(), "rule__RELATIONAL_OP__Alternatives");
					put(grammarAccess.getAPackageDeclarationAccess().getGroup(), "rule__APackageDeclaration__Group__0");
					put(grammarAccess.getAImportAccess().getGroup(), "rule__AImport__Group__0");
					put(grammarAccess.getAExternalFunctionDeclarationAccess().getGroup(), "rule__AExternalFunctionDeclaration__Group__0");
					put(grammarAccess.getAExternalFunctionAccess().getGroup(), "rule__AExternalFunction__Group__0");
					put(grammarAccess.getAAffineSystemAccess().getGroup(), "rule__AAffineSystem__Group__0");
					put(grammarAccess.getAAffineSystemAccess().getGroup_3(), "rule__AAffineSystem__Group_3__0");
					put(grammarAccess.getAAffineSystemAccess().getGroup_4(), "rule__AAffineSystem__Group_4__0");
					put(grammarAccess.getAAffineSystemAccess().getGroup_5(), "rule__AAffineSystem__Group_5__0");
					put(grammarAccess.getAAffineSystemAccess().getGroup_6(), "rule__AAffineSystem__Group_6__0");
					put(grammarAccess.getAAffineSystemAccess().getGroup_7(), "rule__AAffineSystem__Group_7__0");
					put(grammarAccess.getAVariableDeclarationAccess().getGroup(), "rule__AVariableDeclaration__Group__0");
					put(grammarAccess.getAVariableListAccess().getGroup(), "rule__AVariableList__Group__0");
					put(grammarAccess.getAVariableListAccess().getGroup_1(), "rule__AVariableList__Group_1__0");
					put(grammarAccess.getAFuzzyVariableDeclarationAccess().getGroup(), "rule__AFuzzyVariableDeclaration__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
					put(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup(), "rule__QualifiedNameWithWildcard__Group__0");
					put(grammarAccess.getIndexNameAccess().getGroup(), "rule__IndexName__Group__0");
					put(grammarAccess.getAIndexListAccess().getGroup(), "rule__AIndexList__Group__0");
					put(grammarAccess.getAIndexListAccess().getGroup_1(), "rule__AIndexList__Group_1__0");
					put(grammarAccess.getAIndexListAccess().getGroup_1_1(), "rule__AIndexList__Group_1_1__0");
					put(grammarAccess.getAISLDomainAccess().getGroup(), "rule__AISLDomain__Group__0");
					put(grammarAccess.getAISLDomainAccess().getGroup_1(), "rule__AISLDomain__Group_1__0");
					put(grammarAccess.getAVariableDomainAccess().getGroup(), "rule__AVariableDomain__Group__0");
					put(grammarAccess.getADomainProductAccess().getGroup(), "rule__ADomainProduct__Group__0");
					put(grammarAccess.getADomainAccess().getGroup(), "rule__ADomain__Group__0");
					put(grammarAccess.getADomainAccess().getGroup_1(), "rule__ADomain__Group_1__0");
					put(grammarAccess.getAParamDomainAccess().getGroup(), "rule__AParamDomain__Group__0");
					put(grammarAccess.getARelationAccess().getGroup(), "rule__ARelation__Group__0");
					put(grammarAccess.getAEquationAccess().getGroup(), "rule__AEquation__Group__0");
					put(grammarAccess.getAEquationAccess().getGroup_1(), "rule__AEquation__Group_1__0");
					put(grammarAccess.getAUseEquationAccess().getGroup(), "rule__AUseEquation__Group__0");
					put(grammarAccess.getAUseEquationAccess().getGroup_2(), "rule__AUseEquation__Group_2__0");
					put(grammarAccess.getAUseEquationAccess().getGroup_5(), "rule__AUseEquation__Group_5__0");
					put(grammarAccess.getAUseEquationAccess().getGroup_5_1(), "rule__AUseEquation__Group_5_1__0");
					put(grammarAccess.getAUseEquationAccess().getGroup_13(), "rule__AUseEquation__Group_13__0");
					put(grammarAccess.getAUseEquationAccess().getGroup_13_1(), "rule__AUseEquation__Group_13_1__0");
					put(grammarAccess.getAParanthesizedAlphabetsExpressionAccess().getGroup(), "rule__AParanthesizedAlphabetsExpression__Group__0");
					put(grammarAccess.getAOrExpressionAccess().getGroup(), "rule__AOrExpression__Group__0");
					put(grammarAccess.getAOrExpressionAccess().getGroup_1(), "rule__AOrExpression__Group_1__0");
					put(grammarAccess.getAAndExpressionAccess().getGroup(), "rule__AAndExpression__Group__0");
					put(grammarAccess.getAAndExpressionAccess().getGroup_1(), "rule__AAndExpression__Group_1__0");
					put(grammarAccess.getARelationalExpressionAccess().getGroup(), "rule__ARelationalExpression__Group__0");
					put(grammarAccess.getARelationalExpressionAccess().getGroup_1(), "rule__ARelationalExpression__Group_1__0");
					put(grammarAccess.getAAdditiveExpressionAccess().getGroup(), "rule__AAdditiveExpression__Group__0");
					put(grammarAccess.getAAdditiveExpressionAccess().getGroup_1(), "rule__AAdditiveExpression__Group_1__0");
					put(grammarAccess.getAMultiplicativeExpressionAccess().getGroup(), "rule__AMultiplicativeExpression__Group__0");
					put(grammarAccess.getAMultiplicativeExpressionAccess().getGroup_1(), "rule__AMultiplicativeExpression__Group_1__0");
					put(grammarAccess.getAMinMaxExpressionAccess().getGroup(), "rule__AMinMaxExpression__Group__0");
					put(grammarAccess.getAMinMaxExpressionAccess().getGroup_1(), "rule__AMinMaxExpression__Group_1__0");
					put(grammarAccess.getANotExpressionAccess().getGroup(), "rule__ANotExpression__Group__0");
					put(grammarAccess.getANegateExpressionAccess().getGroup(), "rule__ANegateExpression__Group__0");
					put(grammarAccess.getACaseExpressionAccess().getGroup(), "rule__ACaseExpression__Group__0");
					put(grammarAccess.getACaseExpressionAccess().getGroup_3(), "rule__ACaseExpression__Group_3__0");
					put(grammarAccess.getADependenceExpressionAccess().getGroup(), "rule__ADependenceExpression__Group__0");
					put(grammarAccess.getADependenceInArrayNotationAccess().getGroup(), "rule__ADependenceInArrayNotation__Group__0");
					put(grammarAccess.getAIfExpressionAccess().getGroup(), "rule__AIfExpression__Group__0");
					put(grammarAccess.getAIndexExpressionAccess().getGroup_0(), "rule__AIndexExpression__Group_0__0");
					put(grammarAccess.getAIndexExpressionAccess().getGroup_1(), "rule__AIndexExpression__Group_1__0");
					put(grammarAccess.getAReduceExpressionAccess().getGroup(), "rule__AReduceExpression__Group__0");
					put(grammarAccess.getAArgReduceExpressionAccess().getGroup(), "rule__AArgReduceExpression__Group__0");
					put(grammarAccess.getARestrictExpressionAccess().getGroup(), "rule__ARestrictExpression__Group__0");
					put(grammarAccess.getAMultiArgArithmeticExpressionAccess().getGroup(), "rule__AMultiArgArithmeticExpression__Group__0");
					put(grammarAccess.getAMultiArgArithmeticExpressionAccess().getGroup_3(), "rule__AMultiArgArithmeticExpression__Group_3__0");
					put(grammarAccess.getAMultiArgLogicalExpressionAccess().getGroup(), "rule__AMultiArgLogicalExpression__Group__0");
					put(grammarAccess.getAMultiArgLogicalExpressionAccess().getGroup_3(), "rule__AMultiArgLogicalExpression__Group_3__0");
					put(grammarAccess.getAExternalFunctionCallAccess().getGroup(), "rule__AExternalFunctionCall__Group__0");
					put(grammarAccess.getAExternalFunctionCallAccess().getGroup_2(), "rule__AExternalFunctionCall__Group_2__0");
					put(grammarAccess.getAExternalFunctionCallAccess().getGroup_2_1(), "rule__AExternalFunctionCall__Group_2_1__0");
					put(grammarAccess.getIndexAffineExpressionAccess().getGroup(), "rule__IndexAffineExpression__Group__0");
					put(grammarAccess.getIndexAffineExpressionAccess().getGroup_1(), "rule__IndexAffineExpression__Group_1__0");
					put(grammarAccess.getIndexAffineExpressionTerminalAccess().getGroup(), "rule__IndexAffineExpressionTerminal__Group__0");
					put(grammarAccess.getIndexAffineExpressionTerminalAccess().getGroup_1_1(), "rule__IndexAffineExpressionTerminal__Group_1_1__0");
					put(grammarAccess.getAIndexAffineExpressionListAccess().getGroup(), "rule__AIndexAffineExpressionList__Group__0");
					put(grammarAccess.getAIndexAffineExpressionListAccess().getGroup_1(), "rule__AIndexAffineExpressionList__Group_1__0");
					put(grammarAccess.getAIndexAffineExpressionListAccess().getGroup_1_1(), "rule__AIndexAffineExpressionList__Group_1_1__0");
					put(grammarAccess.getAFunctionAccess().getGroup(), "rule__AFunction__Group__0");
					put(grammarAccess.getAFunctionInArrayNotationAccess().getGroup(), "rule__AFunctionInArrayNotation__Group__0");
					put(grammarAccess.getAStartAccess().getElementsAssignment(), "rule__AStart__ElementsAssignment");
					put(grammarAccess.getAPackageDeclarationAccess().getNameAssignment_1(), "rule__APackageDeclaration__NameAssignment_1");
					put(grammarAccess.getAPackageDeclarationAccess().getElementsAssignment_3(), "rule__APackageDeclaration__ElementsAssignment_3");
					put(grammarAccess.getAImportAccess().getImportedNamespaceAssignment_1(), "rule__AImport__ImportedNamespaceAssignment_1");
					put(grammarAccess.getAExternalFunctionAccess().getNameAssignment_0(), "rule__AExternalFunction__NameAssignment_0");
					put(grammarAccess.getAExternalFunctionAccess().getInputCardinarityAssignment_2(), "rule__AExternalFunction__InputCardinarityAssignment_2");
					put(grammarAccess.getAAffineSystemAccess().getNameAssignment_1(), "rule__AAffineSystem__NameAssignment_1");
					put(grammarAccess.getAAffineSystemAccess().getParametersAssignment_2(), "rule__AAffineSystem__ParametersAssignment_2");
					put(grammarAccess.getAAffineSystemAccess().getInputDeclarationsAssignment_3_1(), "rule__AAffineSystem__InputDeclarationsAssignment_3_1");
					put(grammarAccess.getAAffineSystemAccess().getOutputDeclarationsAssignment_4_1(), "rule__AAffineSystem__OutputDeclarationsAssignment_4_1");
					put(grammarAccess.getAAffineSystemAccess().getLocalvarDeclarationsAssignment_5_1(), "rule__AAffineSystem__LocalvarDeclarationsAssignment_5_1");
					put(grammarAccess.getAAffineSystemAccess().getFuzzyVariablesAssignment_6_1(), "rule__AAffineSystem__FuzzyVariablesAssignment_6_1");
					put(grammarAccess.getAAffineSystemAccess().getUseEquationsAssignment_7_1(), "rule__AAffineSystem__UseEquationsAssignment_7_1");
					put(grammarAccess.getAAffineSystemAccess().getEquationsAssignment_7_2(), "rule__AAffineSystem__EquationsAssignment_7_2");
					put(grammarAccess.getAVariableDeclarationAccess().getVarListAssignment_0(), "rule__AVariableDeclaration__VarListAssignment_0");
					put(grammarAccess.getAVariableDeclarationAccess().getDomainAssignment_1(), "rule__AVariableDeclaration__DomainAssignment_1");
					put(grammarAccess.getAVariableListAccess().getVarsAssignment_0(), "rule__AVariableList__VarsAssignment_0");
					put(grammarAccess.getAVariableListAccess().getVarsAssignment_1_1(), "rule__AVariableList__VarsAssignment_1_1");
					put(grammarAccess.getAVariableAccess().getNameAssignment(), "rule__AVariable__NameAssignment");
					put(grammarAccess.getAFuzzyVariableDeclarationAccess().getVarListAssignment_0(), "rule__AFuzzyVariableDeclaration__VarListAssignment_0");
					put(grammarAccess.getAFuzzyVariableDeclarationAccess().getRelationAssignment_1(), "rule__AFuzzyVariableDeclaration__RelationAssignment_1");
					put(grammarAccess.getAIndexDimensionAccess().getNameAssignment(), "rule__AIndexDimension__NameAssignment");
					put(grammarAccess.getAIndexListAccess().getIdsAssignment_1_0(), "rule__AIndexList__IdsAssignment_1_0");
					put(grammarAccess.getAIndexListAccess().getIdsAssignment_1_1_1(), "rule__AIndexList__IdsAssignment_1_1_1");
					put(grammarAccess.getAISLDomainAccess().getDimsAssignment_1_1(), "rule__AISLDomain__DimsAssignment_1_1");
					put(grammarAccess.getAISLDomainAccess().getConstraintStringAssignment_3(), "rule__AISLDomain__ConstraintStringAssignment_3");
					put(grammarAccess.getAVariableDomainAccess().getVarAssignment_2(), "rule__AVariableDomain__VarAssignment_2");
					put(grammarAccess.getADomainProductAccess().getExtensionAssignment_0(), "rule__ADomainProduct__ExtensionAssignment_0");
					put(grammarAccess.getADomainProductAccess().getBaseAssignment_2(), "rule__ADomainProduct__BaseAssignment_2");
					put(grammarAccess.getADomainAccess().getDimsAssignment_1_1(), "rule__ADomain__DimsAssignment_1_1");
					put(grammarAccess.getADomainAccess().getConstraintStringAssignment_3(), "rule__ADomain__ConstraintStringAssignment_3");
					put(grammarAccess.getAParamDomainAccess().getDimsAssignment_1(), "rule__AParamDomain__DimsAssignment_1");
					put(grammarAccess.getAParamDomainAccess().getConstraintStringAssignment_6(), "rule__AParamDomain__ConstraintStringAssignment_6");
					put(grammarAccess.getARelationAccess().getInDimsAssignment_2(), "rule__ARelation__InDimsAssignment_2");
					put(grammarAccess.getARelationAccess().getOutDimsAssignment_6(), "rule__ARelation__OutDimsAssignment_6");
					put(grammarAccess.getARelationAccess().getConstraintStrAssignment_8(), "rule__ARelation__ConstraintStrAssignment_8");
					put(grammarAccess.getAEquationAccess().getVarAssignment_0(), "rule__AEquation__VarAssignment_0");
					put(grammarAccess.getAEquationAccess().getIndexesAssignment_1_1(), "rule__AEquation__IndexesAssignment_1_1");
					put(grammarAccess.getAEquationAccess().getExprAssignment_3(), "rule__AEquation__ExprAssignment_3");
					put(grammarAccess.getAUseEquationAccess().getInstantiationDomainAssignment_1(), "rule__AUseEquation__InstantiationDomainAssignment_1");
					put(grammarAccess.getAUseEquationAccess().getSubsystemDimsAssignment_2_2(), "rule__AUseEquation__SubsystemDimsAssignment_2_2");
					put(grammarAccess.getAUseEquationAccess().getOutputExprsAssignment_5_0(), "rule__AUseEquation__OutputExprsAssignment_5_0");
					put(grammarAccess.getAUseEquationAccess().getOutputExprsAssignment_5_1_1(), "rule__AUseEquation__OutputExprsAssignment_5_1_1");
					put(grammarAccess.getAUseEquationAccess().getSystemAssignment_8(), "rule__AUseEquation__SystemAssignment_8");
					put(grammarAccess.getAUseEquationAccess().getCallParamsAssignment_10(), "rule__AUseEquation__CallParamsAssignment_10");
					put(grammarAccess.getAUseEquationAccess().getInputExprsAssignment_13_0(), "rule__AUseEquation__InputExprsAssignment_13_0");
					put(grammarAccess.getAUseEquationAccess().getInputExprsAssignment_13_1_1(), "rule__AUseEquation__InputExprsAssignment_13_1_1");
					put(grammarAccess.getAOrExpressionAccess().getOperatorAssignment_1_1(), "rule__AOrExpression__OperatorAssignment_1_1");
					put(grammarAccess.getAOrExpressionAccess().getRightAssignment_1_2(), "rule__AOrExpression__RightAssignment_1_2");
					put(grammarAccess.getAAndExpressionAccess().getOperatorAssignment_1_1(), "rule__AAndExpression__OperatorAssignment_1_1");
					put(grammarAccess.getAAndExpressionAccess().getRightAssignment_1_2(), "rule__AAndExpression__RightAssignment_1_2");
					put(grammarAccess.getARelationalExpressionAccess().getOperatorAssignment_1_1(), "rule__ARelationalExpression__OperatorAssignment_1_1");
					put(grammarAccess.getARelationalExpressionAccess().getRightAssignment_1_2(), "rule__ARelationalExpression__RightAssignment_1_2");
					put(grammarAccess.getAAdditiveExpressionAccess().getOpAssignment_1_1(), "rule__AAdditiveExpression__OpAssignment_1_1");
					put(grammarAccess.getAAdditiveExpressionAccess().getRightAssignment_1_2(), "rule__AAdditiveExpression__RightAssignment_1_2");
					put(grammarAccess.getAMultiplicativeExpressionAccess().getOpAssignment_1_1(), "rule__AMultiplicativeExpression__OpAssignment_1_1");
					put(grammarAccess.getAMultiplicativeExpressionAccess().getRightAssignment_1_2(), "rule__AMultiplicativeExpression__RightAssignment_1_2");
					put(grammarAccess.getAMinMaxExpressionAccess().getOpAssignment_1_1(), "rule__AMinMaxExpression__OpAssignment_1_1");
					put(grammarAccess.getAMinMaxExpressionAccess().getRightAssignment_1_2(), "rule__AMinMaxExpression__RightAssignment_1_2");
					put(grammarAccess.getANotExpressionAccess().getOpAssignment_0(), "rule__ANotExpression__OpAssignment_0");
					put(grammarAccess.getANotExpressionAccess().getExprAssignment_1(), "rule__ANotExpression__ExprAssignment_1");
					put(grammarAccess.getANegateExpressionAccess().getOpAssignment_0(), "rule__ANegateExpression__OpAssignment_0");
					put(grammarAccess.getANegateExpressionAccess().getExprAssignment_1(), "rule__ANegateExpression__ExprAssignment_1");
					put(grammarAccess.getACaseExpressionAccess().getNameAssignment_1(), "rule__ACaseExpression__NameAssignment_1");
					put(grammarAccess.getACaseExpressionAccess().getExprsAssignment_3_0(), "rule__ACaseExpression__ExprsAssignment_3_0");
					put(grammarAccess.getADependenceExpressionAccess().getFuncAssignment_0(), "rule__ADependenceExpression__FuncAssignment_0");
					put(grammarAccess.getADependenceExpressionAccess().getExprAssignment_2(), "rule__ADependenceExpression__ExprAssignment_2");
					put(grammarAccess.getADependenceInArrayNotationAccess().getVarAssignment_0(), "rule__ADependenceInArrayNotation__VarAssignment_0");
					put(grammarAccess.getADependenceInArrayNotationAccess().getDepAssignment_2(), "rule__ADependenceInArrayNotation__DepAssignment_2");
					put(grammarAccess.getAIfExpressionAccess().getCondAssignment_1(), "rule__AIfExpression__CondAssignment_1");
					put(grammarAccess.getAIfExpressionAccess().getThenAssignment_3(), "rule__AIfExpression__ThenAssignment_3");
					put(grammarAccess.getAIfExpressionAccess().getElseAssignment_5(), "rule__AIfExpression__ElseAssignment_5");
					put(grammarAccess.getAIndexExpressionAccess().getFuncAssignment_0_1(), "rule__AIndexExpression__FuncAssignment_0_1");
					put(grammarAccess.getAIndexExpressionAccess().getIndexesAssignment_1_1(), "rule__AIndexExpression__IndexesAssignment_1_1");
					put(grammarAccess.getAIndexExpressionAccess().getFuncAssignment_1_3(), "rule__AIndexExpression__FuncAssignment_1_3");
					put(grammarAccess.getAReduceExpressionAccess().getOpAssignment_2(), "rule__AReduceExpression__OpAssignment_2");
					put(grammarAccess.getAReduceExpressionAccess().getProjectionAssignment_4(), "rule__AReduceExpression__ProjectionAssignment_4");
					put(grammarAccess.getAReduceExpressionAccess().getExprAssignment_6(), "rule__AReduceExpression__ExprAssignment_6");
					put(grammarAccess.getAArgReduceExpressionAccess().getOpAssignment_2(), "rule__AArgReduceExpression__OpAssignment_2");
					put(grammarAccess.getAArgReduceExpressionAccess().getProjectionAssignment_4(), "rule__AArgReduceExpression__ProjectionAssignment_4");
					put(grammarAccess.getAArgReduceExpressionAccess().getExprAssignment_6(), "rule__AArgReduceExpression__ExprAssignment_6");
					put(grammarAccess.getARestrictExpressionAccess().getDomainAssignment_0(), "rule__ARestrictExpression__DomainAssignment_0");
					put(grammarAccess.getARestrictExpressionAccess().getExprAssignment_2(), "rule__ARestrictExpression__ExprAssignment_2");
					put(grammarAccess.getAVariableExpressionAccess().getVarAssignment(), "rule__AVariableExpression__VarAssignment");
					put(grammarAccess.getABooleanExpressionAccess().getValueAssignment(), "rule__ABooleanExpression__ValueAssignment");
					put(grammarAccess.getAIntegerExpressionAccess().getValueAssignment(), "rule__AIntegerExpression__ValueAssignment");
					put(grammarAccess.getARealExpressionAccess().getValueAssignment(), "rule__ARealExpression__ValueAssignment");
					put(grammarAccess.getAMultiArgArithmeticExpressionAccess().getOpAssignment_0(), "rule__AMultiArgArithmeticExpression__OpAssignment_0");
					put(grammarAccess.getAMultiArgArithmeticExpressionAccess().getExprsAssignment_2(), "rule__AMultiArgArithmeticExpression__ExprsAssignment_2");
					put(grammarAccess.getAMultiArgArithmeticExpressionAccess().getExprsAssignment_3_1(), "rule__AMultiArgArithmeticExpression__ExprsAssignment_3_1");
					put(grammarAccess.getAMultiArgLogicalExpressionAccess().getOpAssignment_0(), "rule__AMultiArgLogicalExpression__OpAssignment_0");
					put(grammarAccess.getAMultiArgLogicalExpressionAccess().getExprsAssignment_2(), "rule__AMultiArgLogicalExpression__ExprsAssignment_2");
					put(grammarAccess.getAMultiArgLogicalExpressionAccess().getExprsAssignment_3_1(), "rule__AMultiArgLogicalExpression__ExprsAssignment_3_1");
					put(grammarAccess.getAExternalFunctionCallAccess().getFuncAssignment_0(), "rule__AExternalFunctionCall__FuncAssignment_0");
					put(grammarAccess.getAExternalFunctionCallAccess().getExprsAssignment_2_0(), "rule__AExternalFunctionCall__ExprsAssignment_2_0");
					put(grammarAccess.getAExternalFunctionCallAccess().getExprsAssignment_2_1_1(), "rule__AExternalFunctionCall__ExprsAssignment_2_1_1");
					put(grammarAccess.getAIndexAffineExpressionListAccess().getExprsAssignment_1_0(), "rule__AIndexAffineExpressionList__ExprsAssignment_1_0");
					put(grammarAccess.getAIndexAffineExpressionListAccess().getExprsAssignment_1_1_1(), "rule__AIndexAffineExpressionList__ExprsAssignment_1_1_1");
					put(grammarAccess.getAFunctionAccess().getIndexesAssignment_1(), "rule__AFunction__IndexesAssignment_1");
					put(grammarAccess.getAFunctionAccess().getFuncAssignment_3(), "rule__AFunction__FuncAssignment_3");
					put(grammarAccess.getAFunctionInArrayNotationAccess().getNewIdsAssignment_1(), "rule__AFunctionInArrayNotation__NewIdsAssignment_1");
					put(grammarAccess.getAReductionOperatorAccess().getOpAssignment_0(), "rule__AReductionOperator__OpAssignment_0");
					put(grammarAccess.getAReductionOperatorAccess().getBuiltinAssignment_1(), "rule__AReductionOperator__BuiltinAssignment_1");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public AlphaGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(AlphaGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
