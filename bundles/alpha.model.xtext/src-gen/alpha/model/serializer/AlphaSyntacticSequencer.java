/*
 * generated by Xtext 2.13.0
 */
package alpha.model.serializer;

import alpha.model.services.AlphaGrammarAccess;
import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class AlphaSyntacticSequencer extends AbstractSyntacticSequencer {

	protected AlphaGrammarAccess grammarAccess;
	protected AbstractElementAlias match_AlphaSystem_LetKeyword_9_0_q;
	protected AbstractElementAlias match_AlphaTerminalExpression_LeftParenthesisKeyword_0_0_a;
	protected AbstractElementAlias match_AlphaTerminalExpression_LeftParenthesisKeyword_0_0_p;
	protected AbstractElementAlias match_CalculatorExpressionTerminal_LeftParenthesisKeyword_6_0_a;
	protected AbstractElementAlias match_CalculatorExpressionTerminal_LeftParenthesisKeyword_6_0_p;
	protected AbstractElementAlias match_FuzzyVariable_SemicolonKeyword_3_q;
	protected AbstractElementAlias match_InputVariable_SemicolonKeyword_3_q;
	protected AbstractElementAlias match_LocalVariable_SemicolonKeyword_3_q;
	protected AbstractElementAlias match_OutputVariable_SemicolonKeyword_3_q;
	protected AbstractElementAlias match_UseEquation_WithKeyword_0_2_0_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (AlphaGrammarAccess) access;
		match_AlphaSystem_LetKeyword_9_0_q = new TokenAlias(false, true, grammarAccess.getAlphaSystemAccess().getLetKeyword_9_0());
		match_AlphaTerminalExpression_LeftParenthesisKeyword_0_0_a = new TokenAlias(true, true, grammarAccess.getAlphaTerminalExpressionAccess().getLeftParenthesisKeyword_0_0());
		match_AlphaTerminalExpression_LeftParenthesisKeyword_0_0_p = new TokenAlias(true, false, grammarAccess.getAlphaTerminalExpressionAccess().getLeftParenthesisKeyword_0_0());
		match_CalculatorExpressionTerminal_LeftParenthesisKeyword_6_0_a = new TokenAlias(true, true, grammarAccess.getCalculatorExpressionTerminalAccess().getLeftParenthesisKeyword_6_0());
		match_CalculatorExpressionTerminal_LeftParenthesisKeyword_6_0_p = new TokenAlias(true, false, grammarAccess.getCalculatorExpressionTerminalAccess().getLeftParenthesisKeyword_6_0());
		match_FuzzyVariable_SemicolonKeyword_3_q = new TokenAlias(false, true, grammarAccess.getFuzzyVariableAccess().getSemicolonKeyword_3());
		match_InputVariable_SemicolonKeyword_3_q = new TokenAlias(false, true, grammarAccess.getInputVariableAccess().getSemicolonKeyword_3());
		match_LocalVariable_SemicolonKeyword_3_q = new TokenAlias(false, true, grammarAccess.getLocalVariableAccess().getSemicolonKeyword_3());
		match_OutputVariable_SemicolonKeyword_3_q = new TokenAlias(false, true, grammarAccess.getOutputVariableAccess().getSemicolonKeyword_3());
		match_UseEquation_WithKeyword_0_2_0_q = new TokenAlias(false, true, grammarAccess.getUseEquationAccess().getWithKeyword_0_2_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_AlphaSystem_LetKeyword_9_0_q.equals(syntax))
				emit_AlphaSystem_LetKeyword_9_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_AlphaTerminalExpression_LeftParenthesisKeyword_0_0_a.equals(syntax))
				emit_AlphaTerminalExpression_LeftParenthesisKeyword_0_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_AlphaTerminalExpression_LeftParenthesisKeyword_0_0_p.equals(syntax))
				emit_AlphaTerminalExpression_LeftParenthesisKeyword_0_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_CalculatorExpressionTerminal_LeftParenthesisKeyword_6_0_a.equals(syntax))
				emit_CalculatorExpressionTerminal_LeftParenthesisKeyword_6_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_CalculatorExpressionTerminal_LeftParenthesisKeyword_6_0_p.equals(syntax))
				emit_CalculatorExpressionTerminal_LeftParenthesisKeyword_6_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_FuzzyVariable_SemicolonKeyword_3_q.equals(syntax))
				emit_FuzzyVariable_SemicolonKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_InputVariable_SemicolonKeyword_3_q.equals(syntax))
				emit_InputVariable_SemicolonKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_LocalVariable_SemicolonKeyword_3_q.equals(syntax))
				emit_LocalVariable_SemicolonKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_OutputVariable_SemicolonKeyword_3_q.equals(syntax))
				emit_OutputVariable_SemicolonKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_UseEquation_WithKeyword_0_2_0_q.equals(syntax))
				emit_UseEquation_WithKeyword_0_2_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     'let'?
	 *
	 * This ambiguous syntax occurs at:
	 *     definedObjects+=PolyhedralObject (ambiguity) '.' (rule end)
	 *     fuzzyVariables+=FuzzyVariable (ambiguity) '.' (rule end)
	 *     inputs+=InputVariable (ambiguity) '.' (rule end)
	 *     locals+=LocalVariable (ambiguity) '.' (rule end)
	 *     outputs+=OutputVariable (ambiguity) '.' (rule end)
	 *     parameterDomainExpr=JNIParamDomain (ambiguity) '.' (rule end)
	 *     testExpression=AlphaExpression ')' (ambiguity) '.' (rule end)
	 */
	protected void emit_AlphaSystem_LetKeyword_9_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '('*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) 'argreduce' '(' externalFunction=[ExternalFunction|ID]
	 *     (rule start) (ambiguity) 'argreduce' '(' operator=AREDUCTION_OP
	 *     (rule start) (ambiguity) 'auto' ':' expr=AlphaExpression
	 *     (rule start) (ambiguity) 'case' '{' exprs+=AlphaExpression
	 *     (rule start) (ambiguity) 'case' name=ID
	 *     (rule start) (ambiguity) 'conv' '(' kernelDomainExpr=CalculatorExpression
	 *     (rule start) (ambiguity) 'if' condExpr=AlphaExpression
	 *     (rule start) (ambiguity) 'reduce' '(' externalFunction=[ExternalFunction|ID]
	 *     (rule start) (ambiguity) 'reduce' '(' operator=AREDUCTION_OP
	 *     (rule start) (ambiguity) 'select' relationExpr=CalculatorExpression
	 *     (rule start) (ambiguity) 'val' functionExpr=JNIFunction
	 *     (rule start) (ambiguity) '{' domainExpr=CalculatorExpression
	 *     (rule start) (ambiguity) domainExpr=JNIDomain
	 *     (rule start) (ambiguity) domainExpr=JNIDomainInArrayNotation
	 *     (rule start) (ambiguity) expr=VariableExpression
	 *     (rule start) (ambiguity) externalFunction=[ExternalFunction|ID]
	 *     (rule start) (ambiguity) functionExpr=JNIFunction
	 *     (rule start) (ambiguity) functionExpr=JNIFunctionInArrayNotation
	 *     (rule start) (ambiguity) functionExpr=JNIFuzzyFunction
	 *     (rule start) (ambiguity) operator=AREDUCTION_OP
	 *     (rule start) (ambiguity) operator=AUnaryOP
	 *     (rule start) (ambiguity) value=BOOLEAN
	 *     (rule start) (ambiguity) value=FLOAT
	 *     (rule start) (ambiguity) value=INT
	 *     (rule start) (ambiguity) variable=[Variable|ID]
	 *     (rule start) (ambiguity) {BinaryExpression.left=}
	 */
	protected void emit_AlphaTerminalExpression_LeftParenthesisKeyword_0_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '('+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) 'auto' ':' expr=AlphaExpression
	 *     (rule start) (ambiguity) 'if' condExpr=AlphaExpression
	 *     (rule start) (ambiguity) '{' domainExpr=CalculatorExpression
	 *     (rule start) (ambiguity) domainExpr=JNIDomain
	 *     (rule start) (ambiguity) domainExpr=JNIDomainInArrayNotation
	 *     (rule start) (ambiguity) operator=AUnaryOP
	 *     (rule start) (ambiguity) {BinaryExpression.left=}
	 */
	protected void emit_AlphaTerminalExpression_LeftParenthesisKeyword_0_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '('*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) '[' upperBounds+=IndexName
	 *     (rule start) (ambiguity) '{' variable=[Variable|ID]
	 *     (rule start) (ambiguity) alphaString=AAlphaFunction
	 *     (rule start) (ambiguity) islString=AISLRelation
	 *     (rule start) (ambiguity) islString=AISLSet
	 *     (rule start) (ambiguity) object=[PolyhedralObject|ID]
	 *     (rule start) (ambiguity) operator=AUnaryCalcOp
	 *     (rule start) (ambiguity) {BinaryCalculatorExpression.left=}
	 */
	protected void emit_CalculatorExpressionTerminal_LeftParenthesisKeyword_6_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '('+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) operator=AUnaryCalcOp
	 *     (rule start) (ambiguity) {BinaryCalculatorExpression.left=}
	 */
	protected void emit_CalculatorExpressionTerminal_LeftParenthesisKeyword_6_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     domainExpr=CalculatorExpression (ambiguity) (rule end)
	 *     name=ID ':' (ambiguity) (rule end)
	 */
	protected void emit_FuzzyVariable_SemicolonKeyword_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     domainExpr=CalculatorExpression (ambiguity) (rule end)
	 *     name=ID ':' (ambiguity) (rule end)
	 */
	protected void emit_InputVariable_SemicolonKeyword_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     domainExpr=CalculatorExpression (ambiguity) (rule end)
	 *     name=ID ':' (ambiguity) (rule end)
	 */
	protected void emit_LocalVariable_SemicolonKeyword_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     domainExpr=CalculatorExpression (ambiguity) (rule end)
	 *     name=ID ':' (ambiguity) (rule end)
	 */
	protected void emit_OutputVariable_SemicolonKeyword_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'with'?
	 *
	 * This ambiguous syntax occurs at:
	 *     instantiationDomainExpr=CalculatorExpression (ambiguity) ':' '(' ')' '=' system=[AlphaSystem|QualifiedName]
	 *     instantiationDomainExpr=CalculatorExpression (ambiguity) ':' '(' outputExprs+=AlphaExpression
	 */
	protected void emit_UseEquation_WithKeyword_0_2_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
