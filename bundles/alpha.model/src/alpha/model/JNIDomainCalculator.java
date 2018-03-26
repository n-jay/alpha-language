package alpha.model;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import alpha.model.issue.AlphaIssue;
import alpha.model.issue.AlphaIssue.TYPE;
import alpha.model.issue.AlphaIssueFactory;
import alpha.model.issue.CalculatorExpressionIssue;
import alpha.model.util.AbstractAlphaCompleteVisitor;
import alpha.model.util.AlphaUtil;
import fr.irisa.cairn.jnimap.isl.jni.ISLFactory;
import fr.irisa.cairn.jnimap.isl.jni.ISL_FORMAT;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLMap;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLSet;

public class JNIDomainCalculator extends AbstractAlphaCompleteVisitor {
	
	private List<AlphaIssue> issues = new LinkedList<>();

	private List<String> indexNameContext;
	private Stack<List<String>> contextHistory = new Stack<>();

	public static List<AlphaIssue> calculate(AlphaNode node) {
		JNIDomainCalculator calc = new JNIDomainCalculator();
		if (node instanceof AlphaVisitable) {
			((AlphaVisitable) node).accept(calc);
		}
		return calc.issues;
	}

	@Override
	public void visitAlphaSystem(AlphaSystem system) {

		JNIDomain jniDomain = system.getParameterDomain();
		if (jniDomain == null || jniDomain.getIslString() == null)
			return;

		try {
			JNIISLSet jniset = ISLFactory.islSet(AlphaUtil.replaceAlphaConstants(system, jniDomain.getIslString()));
			jniDomain.setISLSet(jniset);
		} catch (RuntimeException re) {
			issues.add(new CalculatorExpressionIssue(TYPE.ERROR, re.getMessage(), jniDomain,
					ModelPackage.Literals.ALPHA_SYSTEM__PARAMETER_DOMAIN));
		}

		if (system.getWhileDomain() != null) {
			issues.addAll(CalculatorExpressionEvaluator.calculate(system.getWhileDomain()));
		}

		super.visitAlphaSystem(system);
	}

	@Override
	public void visitVariable(Variable variable) {

		CalculatorExpression expr = variable.getDomainExpr();
		if (expr == null)
			return;

		AlphaSystem system = AlphaUtil.getContainerSystem(variable);
		if (system == null)
			return;

		issues.addAll(CalculatorExpressionEvaluator.calculate(expr));
	}

	@Override
	public void visitPolyhedralObject(PolyhedralObject pobj) {
		if (pobj.getExpr() != null)
			issues.addAll(CalculatorExpressionEvaluator.calculate(pobj.getExpr()));
	}
	
	/*
	 * Following code is for calculating CalcuatorExpression within AlphaExpression
	 * Some of these expressions are in ArrayNotation, and requires the index names
	 * to be known from the context.
	 * 
	 * The context is initialized at StandardEquation/UseEquation and it may be
	 * extended with ReduceExpression (and its variants).
	 * 
	 * Some expressions may "rename" the context and allow ArrayNotation to
	 * continue: RestrictExpression SelectExpression
	 * 
	 * Another twist is when while expressions are in use. The indices in while are
	 * implicitly added as the first dimensions of the equations.
	 */

	@Override
	public void inStandardEquation(StandardEquation se) {
		indexNameContext = AlphaUtil.getWhileIndexNames(se);
		indexNameContext.addAll(se.getIndexNames());
	}

	@Override
	public void outStandardEquation(StandardEquation se) {
		indexNameContext = null;
	}

	@Override
	public void visitUseEquation(UseEquation ue) {
		//TODO handling of while is not finalized
		indexNameContext = AlphaUtil.getWhileIndexNames(ue);
		
		int initialIssueCount = issues.size();
		
		//compute the instantiation domain and its indices are the base set of indices
		if (ue.getInstantiationDomainExpr() != null) {
			issues.addAll(CalculatorExpressionEvaluator.calculate(ue.getInstantiationDomainExpr()));

			if (ue.getInstantiationDomainExpr().getType() != POLY_OBJECT_TYPE.SET) {
				issues.add(AlphaIssueFactory.expectingSet(ue, ModelPackage.Literals.USE_EQUATION__INSTANTIATION_DOMAIN_EXPR));
				return;
			}
			indexNameContext.addAll(ue.getInstantiationDomain().getIndicesNames());
		}
		
		if (ue.getCallParams() != null) {
			issues.addAll(CalculatorExpressionEvaluator.calculate(ue.getCallParams(), indexNameContext));
			
			if (ue.getCallParams().getType() != POLY_OBJECT_TYPE.FUNCTION) {
				issues.add(AlphaIssueFactory.expectingFunction(ue, ModelPackage.Literals.USE_EQUATION__CALL_PARAMS));
				return;
			}
		}

		if (ue.getSystem().getParameterDomain().getISLSet().getNbParams() != ue.getCallParams().getISLMultiAff().getNbAff()) {
			issues.add(AlphaIssueFactory.subsystemWithIncompatibleParameters(ue));
		}
		
		if (ue.getInputExprs().size() != ue.getSystem().getInputs().size()) {
			issues.add(AlphaIssueFactory.subsystemWithIncompatibleInputs(ue));
		}

		if (ue.getOutputExprs().size() != ue.getSystem().getOutputs().size()) {
			issues.add(AlphaIssueFactory.subsystemWithIncompatibleOutputs(ue));
		}
		
		//visit the in/out expressions only if prior checks pass
		if (issues.size() == initialIssueCount) {
			//for each input/output, the base indices are extended according to the dimensionality of the input/output in the callee
			visitChildrenWithAppropriateIndexNames(ue, ue.getInputExprs(), ue.getSystem().getInputs());
			visitChildrenWithAppropriateIndexNames(ue, ue.getOutputExprs(), ue.getSystem().getOutputs());
		}
		
		
		indexNameContext = null;
	}
	
	private void visitChildrenWithAppropriateIndexNames(UseEquation ue, List<AlphaExpression> exprs, List<? extends Variable> variables) {
		for (int i = 0; i < exprs.size(); i++) {
			Variable calleeVar = variables.get(i);
			int ndim = calleeVar.getDomain().getNbDims();
			
			boolean arrayNotation = ue.getSubsystemDims() != null && ndim <= ue.getSubsystemDims().size(); 
			
			if (arrayNotation) {
				indexNameContext.addAll(ue.getSubsystemDims().subList(0, ndim));
			}
			
			exprs.get(i).accept(this);
			
			if (arrayNotation) {
				indexNameContext.removeAll(ue.getSubsystemDims());
			}
		}
		
	}
	
	@Override
	public void inAbstractReduceExpression(AbstractReduceExpression re) {
		/*
		 * Current implementation compute the CalculatorExpression first. The context
		 * for the projection function is actually the surrounding context of the
		 * ReduceExpression. The array notation here specifies the index name(s) to be
		 * projected out with the projection function.
		 * 
		 * For the body of the reduction and onwards, the index names including those
		 * specified by the array notation should be used.
		 */
		issues.addAll(CalculatorExpressionEvaluator.calculate(re.getProjection(), indexNameContext));
		
		List<String> copy = (indexNameContext == null) ? null : new LinkedList<>(indexNameContext);
		contextHistory.push(indexNameContext);
		
		if (indexNameContext != null && re.getProjection() instanceof JNIFunctionInArrayNotation) {
			indexNameContext = copy;
			indexNameContext.addAll(((JNIFunctionInArrayNotation) re.getProjection()).getArrayNotation());
		} else {
			indexNameContext = null;
		}
	}

	@Override
	public void outAbstractReduceExpression(AbstractReduceExpression re) {
		indexNameContext = contextHistory.pop();
	}
	
	@Override
	public void inConvolutionExpression(ConvolutionExpression ce) {
		issues.addAll(CalculatorExpressionEvaluator.calculate(ce.getKernelDomain(), indexNameContext));
		
		List<String> copy = (indexNameContext == null) ? null : new LinkedList<>(indexNameContext);
		contextHistory.push(indexNameContext);
		
		if (ce.getKernelDomain().getType() != POLY_OBJECT_TYPE.SET) {
			AlphaIssueFactory.expectingSet(ce, ModelPackage.Literals.CONVOLUTION_EXPRESSION__KERNEL_DOMAIN);
			indexNameContext = null;
			return;
		}

		JNIISLSet set = (JNIISLSet)ce.getKernelDomain().getISLObject();
		if (indexNameContext == null) {
			indexNameContext = null;
		} else {
			indexNameContext = copy;
			indexNameContext.addAll(set.getIndicesNames());
		}
	}
	
	@Override
	public void outConvolutionExpression(ConvolutionExpression ce) {
		indexNameContext = contextHistory.pop();
	}
	
	/**
	 * Helper function to test that JNIFunction is in pure syntax. It is a bit
	 * unclean due to !instanceof JNIFunctionInArrayNotation that only works because
	 * there are two possibilities for JNIFunction
	 * 
	 * @param f
	 * @return
	 */
	private boolean jniFunctionNotInArrayNotation(JNIFunction f) {
		return f != null && !(f instanceof JNIFunctionInArrayNotation);
	}

	@Override
	public void inDependenceExpression(DependenceExpression de) {
		issues.addAll(CalculatorExpressionEvaluator.calculate(de.getFunction(), indexNameContext));

		if (jniFunctionNotInArrayNotation(de.getFunction())) {
			contextHistory.push(indexNameContext);
			indexNameContext = null;
		}
	}

	@Override
	public void outDependenceExpression(DependenceExpression de) {
		if (jniFunctionNotInArrayNotation(de.getFunction())) {
			indexNameContext = contextHistory.pop();
		}
	}

	@Override
	public void inIndexExpression(IndexExpression ie) {
		issues.addAll(CalculatorExpressionEvaluator.calculate(ie.getFunction(), indexNameContext));
	}

	
	@Override
	public void inRestrictExpression(RestrictExpression re) {
		issues.addAll(CalculatorExpressionEvaluator.calculate(re.getDomainExpr(), indexNameContext));


		List<String> copy = (indexNameContext == null) ? null : new LinkedList<>(indexNameContext);
		contextHistory.push(indexNameContext);
		
		if (re.getDomainExpr().getType() != POLY_OBJECT_TYPE.SET) {
			issues.add(AlphaIssueFactory.expectingSet(re, ModelPackage.Literals.RESTRICT_EXPRESSION__DOMAIN_EXPR));
			indexNameContext = null;
			return;
		}

		//Only when the dimensions match the context, new indices can replace the context for Array Notation
		if (indexNameContext == null || re.getRestrictDomain() != null && re.getRestrictDomain().getNbDims() == indexNameContext.size()) {
			indexNameContext = re.getRestrictDomain().getIndicesNames();
		} else {
			indexNameContext = copy;

			issues.add(AlphaIssueFactory.umatchedRestrictDomainDimensions(re));
		}
	}

	@Override
	public void outRestrictExpression(RestrictExpression re) {
		indexNameContext = contextHistory.pop();
	}

	@Override
	public void inSelectExpression(SelectExpression se) {
		issues.addAll(CalculatorExpressionEvaluator.calculate(se.getRelationExpr(), indexNameContext));

		List<String> copy = (indexNameContext == null) ? null : new LinkedList<>(indexNameContext);
		contextHistory.push(indexNameContext);
		
		if (se.getRelationExpr().getType() != POLY_OBJECT_TYPE.MAP) {
			issues.add(AlphaIssueFactory.expectingMap(se, ModelPackage.Literals.SELECT_EXPRESSION__RELATION_EXPR));
			indexNameContext = null;
			return;
		}

		JNIISLMap map = se.getSelectRelation();
		// FIXME : following is a hack because ISL is buggy w.r.t. get_dim_name
		String[] mapStr = map.toString(ISL_FORMAT.ISL).split("->");
		if (mapStr.length != 3)
			throw new RuntimeException("Unexpected map: " + map);
		String[] indexNames = mapStr[2].substring(mapStr[2].indexOf('[') + 1, mapStr[2].indexOf(']')).split(",");

		//Only when the dimensions match the context, new indices can replace the context for Array Notation
		if (indexNameContext == null || map.getDomain().getNbDims() == indexNameContext.size()) {
			indexNameContext = Arrays.asList(indexNames);
		} else {
			indexNameContext = copy;

			issues.add(AlphaIssueFactory.unmatchedSelectRelationDimensions(se));
		}

	}

	@Override
	public void outSelectExpression(SelectExpression se) {
		indexNameContext = contextHistory.pop();
	}
}
