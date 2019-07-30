package alpha.model;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.Stack;

import org.eclipse.emf.ecore.util.EcoreUtil;

import alpha.model.factory.AlphaUserFactory;
import alpha.model.issue.AlphaIssue;
import alpha.model.issue.AlphaIssue.TYPE;
import alpha.model.issue.AlphaIssueFactory;
import alpha.model.issue.CalculatorExpressionIssue;
import alpha.model.util.AbstractAlphaCompleteVisitor;
import alpha.model.util.AlphaUtil;
import fr.irisa.cairn.jnimap.isl.ISLDimType;
import fr.irisa.cairn.jnimap.isl.ISLFactory;
import fr.irisa.cairn.jnimap.isl.ISLMap;
import fr.irisa.cairn.jnimap.isl.ISLSet;
import fr.irisa.cairn.jnimap.isl.ISL_FORMAT;

/**
 * This class is responsible for computing ISL representation of the
 * domain/function in Alpha programs. The main role is to keep track of the
 * context information for completing the domain/function in ArrayNotation.
 * 
 * The DOMAIN_CALC_MODE is used to configure the visiting pattern. The intended
 * use case is as follows:
 * <ol>
 * <li>Compute the interface domains for all AlphaSystems
 * <li>Compute the domains in the expressions for all AlphaSystems
 * </ol>
 * 
 * The split-phase computation is necessary primarily because of the
 * UseEquations that require parameter and variable domains to be accessible
 * when computing the context/expression domain.
 * 
 * @author tyuki
 *
 */
public class JNIDomainCalculator extends AbstractAlphaCompleteVisitor {

	/**
	 * Configures the visiting pattern:
	 * <ul>
	 * <li>ALL: full traversal
	 * <li>INTERFACE_ONLY: limited to parameter domain, variable declaration, and
	 * polyhedral object definitions
	 * <li>EXPRESSION_ONLY: limited to LHS of equations
	 * </ul>
	 * 
	 * 
	 * @author tyuki
	 *
	 */
	public enum DOMAIN_CALC_MODE {
		ALL, INTERFACE_ONLY, EXPRESSION_ONLY
	}

	private final DOMAIN_CALC_MODE mode;

	private List<AlphaIssue> issues = new LinkedList<>();

	private List<String> indexNameContext;
	private Stack<List<String>> contextHistory = new Stack<>();

	public static List<AlphaIssue> calculate(AlphaNode node) {
		return calculate(node, DOMAIN_CALC_MODE.ALL);
	}

	public static List<AlphaIssue> calculate(AlphaNode node, DOMAIN_CALC_MODE mode) {
		JNIDomainCalculator calc = new JNIDomainCalculator(mode);
		if (node instanceof AlphaVisitable) {
			((AlphaVisitable) node).accept(calc);
		}
		return calc.issues;
	}

	public JNIDomainCalculator(DOMAIN_CALC_MODE mode) {
		this.mode = mode;
	}
	
	@Override
	public void inAlphaSystem(AlphaSystem system) {
		if (mode == DOMAIN_CALC_MODE.ALL || mode == DOMAIN_CALC_MODE.INTERFACE_ONLY) {
			JNIDomain jniDomain = system.getParameterDomainExpr();
			if (jniDomain == null || jniDomain.getIslString() == null)
				return;

			try {
				ISLSet jniset = ISLFactory.islSet(AlphaUtil.replaceAlphaConstants(system, jniDomain.getIslString()));
				jniDomain.setISLSet(jniset);
			} catch (RuntimeException re) {
				issues.add(new CalculatorExpressionIssue(TYPE.ERROR, re.getMessage(), jniDomain, null));
			}

			if (system.getWhileDomainExpr() != null) {
				issues.addAll(CalculatorExpressionEvaluator.calculate(system.getWhileDomainExpr()));
			}

			resolveVariableDeclaration(system.getInputs());
			resolveVariableDeclaration(system.getOutputs());
			resolveVariableDeclaration(system.getLocals());
		}
		
		super.inAlphaSystem(system);
	}
	
	protected void resolveVariableDeclaration(List<Variable> variables) {
		for (Variable v : variables) {
			if (v.getDomainExpr() == null) {
				int index = variables.indexOf(v);
				Optional<Variable> definedVar = variables.subList(index, variables.size()).stream().filter(w->w.getDomainExpr() != null).findFirst();
				
				if (definedVar.isPresent()) {
					v.setDomainExpr(EcoreUtil.copy(definedVar.get().getDomainExpr()));
				}
			}
		}
	}
	
	@Override
	public void outAlphaSystem(AlphaSystem system) {
		if (mode == DOMAIN_CALC_MODE.ALL || mode == DOMAIN_CALC_MODE.EXPRESSION_ONLY) {
			completeSystemBody(system);
		}
		
		super.outAlphaSystem(system);
	}
	

	/**
	 * This method inspects parameter domain specifications of all SystemBodies in an AlphaSystem.
	 * The main purpose is to compute the else-domain: the domain for SystemBody without specified context.
	 * 
	 * Computing the above takes similar steps as the AutoRestrictExpression. Only one of the 
	 * SytemBodies are allowed to have unspecified domain. 
	 * 
	 * @param system
	 */
	private void completeSystemBody(AlphaSystem system) {
		if (system.getParameterDomain() == null) return;
		
		List<SystemBody> definedBodies = new LinkedList<>();
		List<SystemBody> undefinedBodies = new LinkedList<>();
		
		//first pass for syntactic checks
		for (SystemBody body : system.getSystemBodies()) {
			if (body.getParameterDomainExpr() != null) {
				definedBodies.add(body);
			} else {
				undefinedBodies.add(body);
			}
		}
		if (undefinedBodies.size() > 1) {
			for (SystemBody body : undefinedBodies) {
				issues.add(AlphaIssueFactory.multipleUnrestrictedSystemBody(body));
			}
			return;
		}
		
		//then compute the else-domain
		ISLSet unionBodies = null;
		for (SystemBody body : definedBodies) {
			if (unionBodies == null) {
				unionBodies = body.getParameterDomain();
			} else {
				unionBodies = unionBodies.union(body.getParameterDomain());
			}
		}

		if (undefinedBodies.size() == 1) {
			SystemBody elseBody = undefinedBodies.get(0);
			ISLSet elseDomain = unionBodies==null?system.getParameterDomain():system.getParameterDomain().subtract(unionBodies);
			JNIDomain domain = AlphaUserFactory.createJNISystemBodyDomain(elseDomain);
			elseBody.setParameterDomainExpr(domain);
		}
	}
	
	@Override
	public void inSystemBody(SystemBody sysBody) {
		if (sysBody.getParameterDomainExpr() != null) {
			issues.addAll(CalculatorExpressionEvaluator.calculate(sysBody.getParameterDomainExpr()));
		}
	}

	@Override
	public void inVariable(Variable variable) {
		CalculatorExpression expr = variable.getDomainExpr();
		if (expr == null)
			return;

		AlphaSystem system = AlphaUtil.getContainerSystem(variable);
		if (system == null)
			return;

		issues.addAll(CalculatorExpressionEvaluator.calculate(expr));
	}
	
	@Override
	public void inFuzzyVariable(FuzzyVariable variable) {
		CalculatorExpression expr = variable.getRangeExpr();
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
		
		//indexNameContext = null means there is no context information
		// this is the case when the StandardEquation do not have index names defined
		// an exception is when the variable has a scalar domain; then there is no index name to define and an empty list is valid 
		if (se.getIndexNames().isEmpty() && se.getVariable().getDomain().getNbIndices() > 0) {
			indexNameContext = null;
		}
	}

	@Override
	public void visitStandardEquation(StandardEquation se) {
		if (mode == DOMAIN_CALC_MODE.ALL || mode == DOMAIN_CALC_MODE.EXPRESSION_ONLY) {
			super.visitStandardEquation(se);
		}
	}

	@Override
	public void outStandardEquation(StandardEquation se) {
		indexNameContext = null;
	}

	@Override
	public void visitUseEquation(UseEquation ue) {
		if (mode == DOMAIN_CALC_MODE.ALL || mode == DOMAIN_CALC_MODE.EXPRESSION_ONLY) {
			// TODO handling of while is not finalized
			indexNameContext = AlphaUtil.getWhileIndexNames(ue);

			int initialIssueCount = issues.size();
			
			//System may not be set due to parsing error 
			if (ue.getSystem() == null)
				return;

			// compute the instantiation domain and its indices are the base set of indices
			if (ue.getInstantiationDomainExpr() != null) {
				issues.addAll(CalculatorExpressionEvaluator.calculate(ue.getInstantiationDomainExpr()));

				if (ue.getInstantiationDomainExpr().getType() != POLY_OBJECT_TYPE.SET) {
					issues.add(AlphaIssueFactory.expectingSet(ue,
							ModelPackage.Literals.USE_EQUATION__INSTANTIATION_DOMAIN_EXPR));
					return;
				}
				indexNameContext.addAll(ue.getInstantiationDomain().getIndexNames());
			}

			if (ue.getCallParamsExpr() != null) {
				issues.addAll(CalculatorExpressionEvaluator.calculate(ue.getCallParamsExpr(), indexNameContext));

				if (ue.getCallParamsExpr().getType() != POLY_OBJECT_TYPE.FUNCTION) {
					issues.add(AlphaIssueFactory.expectingFunction(ue, null));
					return;
				}
			}
			
			//FIXME
			// If the parameter domain is null, it is highly likely that the system just got resolved
			// (Need a better way to check if the system was just resolved, 
			//  since calling eIsProxy always returns false when the system can be resolved, 
			//  because getSystem invokes proxy resolution.) 
			if (ue.getSystem().getParameterDomain() == null) {
				JNIDomainCalculator.calculate(ue.getSystem(), DOMAIN_CALC_MODE.INTERFACE_ONLY);
			}

			if (ue.getSystem().getParameterDomain().getNbParams() != ue.getCallParams().getNbOutputs()) {
				issues.add(AlphaIssueFactory.subsystemWithIncompatibleParameters(ue));
			}

			if (ue.getInputExprs().size() != ue.getSystem().getInputs().size()) {
				issues.add(AlphaIssueFactory.subsystemWithIncompatibleInputs(ue));
			}

			if (ue.getOutputExprs().size() != ue.getSystem().getOutputs().size()) {
				issues.add(AlphaIssueFactory.subsystemWithIncompatibleOutputs(ue));
			}

			// visit the in/out expressions only if prior checks pass
			if (issues.size() == initialIssueCount) {
				// for each input/output, the base indices are extended according to the
				// dimensionality of the input/output in the callee
				visitChildrenWithAppropriateIndexNames(ue, ue.getInputExprs(), ue.getSystem().getInputs());
				visitChildrenWithAppropriateIndexNames(ue, ue.getOutputExprs(), ue.getSystem().getOutputs());
			}

			indexNameContext = null;
		}
	}

	private void visitChildrenWithAppropriateIndexNames(UseEquation ue, List<AlphaExpression> exprs,
			List<? extends Variable> variables) {
		for (int i = 0; i < exprs.size(); i++) {
			Variable calleeVar = variables.get(i);
			int ndim = calleeVar.getDomain().getNbIndices();

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
		issues.addAll(CalculatorExpressionEvaluator.calculate(re.getProjectionExpr(), indexNameContext));

		List<String> copy = (indexNameContext == null) ? null : new LinkedList<>(indexNameContext);
		contextHistory.push(indexNameContext);

		if (indexNameContext != null && re.getProjectionExpr() instanceof JNIFunctionInArrayNotation) {
			indexNameContext = copy;
			indexNameContext.addAll(((JNIFunctionInArrayNotation) re.getProjectionExpr()).getArrayNotation());
		} else if (re.getProjection() != null) {
			indexNameContext = re.getProjection().getSpace().getInputNames();
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
		issues.addAll(CalculatorExpressionEvaluator.calculate(ce.getKernelDomainExpr(), indexNameContext));

		List<String> copy = (indexNameContext == null) ? null : new LinkedList<>(indexNameContext);
		contextHistory.push(indexNameContext);

		if (ce.getKernelDomainExpr().getType() != POLY_OBJECT_TYPE.SET) {
			AlphaIssueFactory.expectingSet(ce, null);
			indexNameContext = null;
			return;
		}

		indexNameContext = copy;
		ISLSet set = ce.getKernelDomain();
		if (indexNameContext != null && set != null) {
			indexNameContext.addAll(set.getIndexNames());
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
		issues.addAll(CalculatorExpressionEvaluator.calculate(de.getFunctionExpr(), indexNameContext));

		if (jniFunctionNotInArrayNotation(de.getFunctionExpr())) {
			contextHistory.push(indexNameContext);
			indexNameContext = null;
		}
	}
	
	@Override
	public void inFuzzyDependenceExpression(FuzzyDependenceExpression fde) {
		
		issues.addAll(FuzzyFunctionEvaluator.calculate(fde.getFuzzyFunction(), indexNameContext));

//		if (jniFunctionNotInArrayNotation(de.getFunctionExpr())) {
//			contextHistory.push(indexNameContext);
//			indexNameContext = null;TODO
//		}
	}

	@Override
	public void outDependenceExpression(DependenceExpression de) {
		if (jniFunctionNotInArrayNotation(de.getFunctionExpr())) {
			indexNameContext = contextHistory.pop();
		}
	}

	@Override
	public void inIndexExpression(IndexExpression ie) {
		issues.addAll(CalculatorExpressionEvaluator.calculate(ie.getFunctionExpr(), indexNameContext));
	}
	
	@Override
	public void inPolynomialIndexExpression(PolynomialIndexExpression pie) {
		issues.addAll(CalculatorExpressionEvaluator.calculate(pie.getPolynomialExpr(), indexNameContext));
	}
	
	@Override
	public void inFuzzyIndexExpression(FuzzyIndexExpression fie) {
		issues.addAll(FuzzyFunctionEvaluator.calculate(fie.getFuzzyFunction(), indexNameContext));
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

		// Only when the dimensions match the context, new indices can replace the
		// context for Array Notation
		if (re.getRestrictDomain() != null && 
				(indexNameContext == null || re.getRestrictDomain().getNbIndices() == indexNameContext.size())) {
			indexNameContext = re.getRestrictDomain().getIndexNames();
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

		ISLMap map = se.getSelectRelation();
		// FIXME : following is a hack because I tried ISL to use names with apostrophes, which has a separate meaning
		String[] mapStr = map.toString(ISL_FORMAT.ISL).split("->");
		if (mapStr.length != 3)
			throw new RuntimeException("Unexpected map: " + map);
		String[] indexNames = mapStr[2].substring(mapStr[2].indexOf('[') + 1, mapStr[2].indexOf(']')).split(",");

		// Only when the dimensions match the context, new indices can replace the
		// context for Array Notation
		if (indexNameContext == null || map.getDomain().getNbIndices() == indexNameContext.size()) {
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
