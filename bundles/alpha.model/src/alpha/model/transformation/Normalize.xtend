package alpha.model.transformation

import alpha.model.AlphaExpressionVisitable
import alpha.model.AlphaVisitable
import alpha.model.BinaryExpression
import alpha.model.DependenceExpression
import alpha.model.IndexExpression
import alpha.model.RestrictExpression
import alpha.model.util.AbstractAlphaCompleteVisitor
import org.eclipse.emf.ecore.util.EcoreUtil
import alpha.model.AlphaExpression
import alpha.model.UnaryExpression
import alpha.model.MultiArgExpression
import java.util.ArrayList
import alpha.model.CaseExpression
import alpha.model.AlphaInternalStateConstructor
import alpha.model.ModelPackage

import static alpha.model.factory.AlphaUserFactory.createJNIDomain
import static alpha.model.factory.AlphaUserFactory.createJNIFunction
import static alpha.model.factory.AlphaUserFactory.createDependenceExpression
import static alpha.model.factory.AlphaUserFactory.createRestrictExpression
import static alpha.model.factory.AlphaUserFactory.createUnaryExpression
import static alpha.model.factory.AlphaUserFactory.createBinaryExpression
import static alpha.model.util.AlphaExpressionUtil.parentContext
import alpha.model.AlphaCompleteVisitable
import fr.irisa.cairn.jnimap.isl.jni.JNIISLSet

/**
 * Normalization of Alpha programs.
 * 
 * Each StandardEquation in an Alpha program should satisfy the following in its normal form:
 *   - the parent of CaseExpression should be StandardEquation or ReduceExpression
 *   - the parent of RestrictExpression should be CaseExpression or ReduceExpression
 *   - the child of DependenceExpression should be VariableExpression or ConstantExpression
 *  
 * The same applies to each input expression in an UseEquation.
 * 
 * The normalization rules defined and implemented here should transform any input Alpha program into its normal form.
 * The rules have mainly two objectives:
 *   - DependenceExpressions are propagated downwards
 *   - RestrictExpressions are propagated upwards (except when its child is a CaseExpression)
 * 
 * Due to the direction of propagation, most rules for dependences matches with dependence as the parent, 
 * but many rules involving restrict matches with other expressions as parents (e.g., binOp or unaryOp).
 * 
 * Note that the implementation in this class may not be complete yet, especially w.r.t. the new expressions.
 * In addition, this implementation do not use term-rewriting, and relies on bottom-up traversal
 * of the AST with occasional repeated traversal of sub-trees. This may create situations where multiple
 * calls are required to reach the normal form (which is a bug and should be fixed). 
 * 
 * 
 * There is also a two-level notion of the normal form resulting from the extensions to Alpha
 * The extensions are mostly aimed at improving the readability of Alpha programs by adding short-hands for
 * describing polyhedral objects and adding structure. The "shallow" normalize, which is the default behavior,
 * keeps most of the extended syntax elements intact. Specifically: 
 *  - uses of polyhedral objects defined at the top of a system are preserved
 *  - CalculatorExpressions in equations are also kept  
 *  - named CaseExpressions are not flattened
 *  - AutoRestrictExpressions are preserved
 * 
 * The "deep" normalize will remove the extended syntax by replacing polyhedral objects and auto keywords
 *  with explicit (and self-contained) polyhedral domains/functions. CaseExpressions are completely flattened
 *  and names are removed. This form is suited for compatibility with AlphaZ@CSU and 
 *  for back-end processing (e.g., code generator) where readability is not important.  
 * 
 */
class Normalize extends AbstractAlphaCompleteVisitor {

	/*
	 *  Rules collected from AlphaZ implementation using Tom/Gom
	 *  Removal of identity functions and empty case branches were
	 *  implemented separately.
	 * 
	 *  debug("rule1", "dep@(A op B) -> dep@A op dep@B", "");
	 *  debug("rule2a", "((dom : A) op B) -> dom : (A op B)", "");
	 *  debug("rule2b", "(A op (dom : B)) -> dom : (A op B)", "");
	 *  debug("rule3", "depA@depB@E -> (depB o depA)@E", "");
	 *  debug("rule4", "domA : domB : E -> (domA intersection domB)@E", "");	
	 *  debug("rule5", "dep@(dom : E)-> dom.preimage(dep) : (dep@E)", "");
	 *  debug("rule6", "dep@(op E)-> op (dep@E)", "");
	 *  debug("rule7", "(op dom : E)-> dom : (op E)", "");	
	 *  debug("rule8a", "dep @ f(op, E)-> f(op, dep@E)", "");
	 *  debug("rule8b", "dep @ exf(op, E)-> exf(op, dep@E)", "");
	 *  debug("rule9", "dep@(val(f) -> val(f o dep)", "");
	 * 	debug("rule10", "case E1; case E2 esac; E3; esac -> case E1; E2; E3; esac", "");
	 *	debug("rule11a", "case E1; esac op E2 -> case E1 op E2; esac", "");
	 *	debug("rule11b", "E1 op case E2; esac -> case E1 op E2; esac", "");
	 *	debug("rule12", "op case E; esac -> case op E; esac", "");
	 *	debug("rule13", "f(op, case E; esac) -> case f(op, E) esac;", "");
	 *  debug("rule14", "dep case E; esac -> case dep E; esac", "");
	 *	debug("rule15", "dom : case E; esac -> case dom : E; esac", "");
	  	debug("rule16", "dep @ if (cond, then, else) -> if(dep@cond, dep@then, dep@else) ", "");
	  	debug("rule17a", "if(dom : cond, then, else) -> dom : if (cond, then, else)", "");
	  	debug("rule17b", "if(cond, dom : then, else) -> dom : if (cond, then, else)", "");
	  	debug("rule17c", "if(cond, then, dom : else) -> dom : if (cond, then, else)", "");
	  	debug("rule18a", "if(case E; esac, then, else) -> esac if (E, then, else); case", "");
	  	debug("rule18b", "if(cond, case E; esac, else) -> esac if (cond, E, else); case", "");
	  	debug("rule18c", "if(cond, then, case E; esac) -> esac if (cond, then, E); case", "");
	 *	debug("rule19", "exFunc(op, dom : E) -> dom : exFunc(op, E)", "");
	 */


	public static def void apply(AlphaCompleteVisitable acv) {
		if (acv instanceof AlphaVisitable) {
			apply(acv as AlphaVisitable)
		} else if (acv instanceof AlphaExpressionVisitable) {
			apply(acv as AlphaExpressionVisitable)
		} else {
			throw new RuntimeException("This should be unreachable code. Got: " + acv);
		}
	}
	
	public static def void apply(AlphaVisitable av) {
		val visitor = new Normalize();
		av.accept(visitor);
	}
	public static def void apply(AlphaExpressionVisitable aev) {
		val visitor = new Normalize();
		aev.accept(visitor);
	}
	
	override outDependenceExpression(DependenceExpression de) {
		// xtend dispatch to match based on child expression type
		dependenceExpressionRules(de, de.expr);

		// f @ E = E if f = I
		if (de.function.isIdentity) {
			EcoreUtil.replace(de, de.expr);
		}
	}

	// f1 @ f2 @ E -> (f2 o f1) @ E 
	protected def dispatch dependenceExpressionRules(DependenceExpression de, DependenceExpression innerDep) {
		val composedF = innerDep.function.pullback(de.function)
		de.functionExpr = createJNIFunction(composedF)
		EcoreUtil.replace(de.expr, innerDep.expr);
	}

	// f1 @ val(f2) -> val(f2 o f1)
	protected def dispatch dependenceExpressionRules(DependenceExpression de, IndexExpression innerIE) {
		val composedF = innerIE.function.pullback(de.function)
		innerIE.functionExpr = createJNIFunction(composedF)
		EcoreUtil.replace(de, innerIE);
	}

	// f @ D : E -> f-1(D) : E
	protected def dispatch dependenceExpressionRules(DependenceExpression de, RestrictExpression innerRE) {
		val preimage = innerRE.restrictDomain.preimage(de.function)
		innerRE.domainExpr = createJNIDomain(preimage)
		EcoreUtil.replace(de, innerRE);
	}

	// f @ (A op B) -> (f @ A op f @ B)
	protected def dispatch dependenceExpressionRules(DependenceExpression de, BinaryExpression binExpr) {
		EcoreUtil.replace(de, binExpr);

		val newL = createDependenceExpression(de.function, binExpr.left)
		val newR = createDependenceExpression(de.function, binExpr.right)

		binExpr.left = newL
		binExpr.right = newR

		// the updated expression must be revisited 
		apply(binExpr);
	}

	// f @ (op E) -> (op f@E)
	protected def dispatch dependenceExpressionRules(DependenceExpression de, UnaryExpression unaryExpr) {
		EcoreUtil.replace(de, unaryExpr)
		val newExpr = createDependenceExpression(de.function, unaryExpr.expr)
		unaryExpr.expr = newExpr

		// the updated expression must be revisited 
		apply(unaryExpr);
	}

	// f @ op(E1, E2, ...) -> op(f@E1, f@E2, ...)
	// where f can be pre-defined ops or external function
	protected def dispatch dependenceExpressionRules(DependenceExpression de, MultiArgExpression mae) {
		propagateDownwards(de, mae)

		// the updated expression must be revisited 
		apply(mae);
	}

	// f @ case {E1; E2; ...} -> case {f@E1; f@E2; ...}
	protected def dispatch dependenceExpressionRules(DependenceExpression de, CaseExpression ce) {
		propagateDownwards(de, ce)

		// the updated expression must be revisited 
		apply(ce);
	}

	protected def dispatch dependenceExpressionRules(DependenceExpression de, AlphaExpression expr) {
		// Nothing when there is no matching rule
	}

	override outRestrictExpression(RestrictExpression re) {
		restrictExpressionRules(re, re.expr)
		
		if (re.eContainer === null) return;

		// expr(D : E) -> E if context domain of expr(D : E) and D : E are the same (i.e., restrict has no effect)
		val ctx = parentContext(re, re.eContainer as AlphaCompleteVisitable, null) 
		if (ctx !== null && ctx.isEqual(re.contextDomain)) {
//			EcoreUtil.replace(re, re.expr);
		}
	}

	// D1 : D2 : E -> (D1 and D2) : E
	protected def dispatch restrictExpressionRules(RestrictExpression re, RestrictExpression innerRE) {
		val intersection = re.restrictDomain.intersect(innerRE.restrictDomain)
		re.domainExpr = createJNIDomain(intersection)
		EcoreUtil.replace(re.expr, innerRE.expr);
	}

	// D : case { E1; E2; ... } -> case { D:E1; D:E2; ... }
	// FIXME not really sure if this rule is useful; seems redundant with the removal of restrict based on context domain
	protected def dispatch restrictExpressionRules(RestrictExpression re, CaseExpression ce) {
		propagateDownwards(re, ce)

		// the updated expression must be revisited 
		AlphaInternalStateConstructor.recomputeContextDomain(ce);
		apply(ce);
	}

	protected def dispatch restrictExpressionRules(RestrictExpression re, AlphaExpression expr) {
		// Nothing if there is no matching rule
	}

	override outBinaryExpression(BinaryExpression be) {
		binaryExpressionRules(be, be.left)
		binaryExpressionRules(be, be.right)
	}

	// (D : A op B) -> D : (A op B)
	// and
	// (A op D : B) -> D : (A op B)
	protected def dispatch binaryExpressionRules(BinaryExpression be, RestrictExpression re) {
		EcoreUtil.replace(re, re.expr);
		EcoreUtil.replace(be, re);
		re.expr = be
	}
	
	// case { E1; E2; ... } op E -> case { E1 op E; E2 op E; ... }
	// and
	// E op case { E1; E2; ... } -> case { E op E1; E op E2; ... }
	protected def dispatch binaryExpressionRules(BinaryExpression be, CaseExpression ce) {
		val isLeft = ce.eContainmentFeature == ModelPackage.Literals.BINARY_EXPRESSION__LEFT
		val otherExpr = if (isLeft) be.right else be.left

		EcoreUtil.replace(be, ce)

		val children = new ArrayList<AlphaExpression>(ce.exprs.size)
		ce.exprs.forEach[e|children.add(e)]
		
		ce.exprs.clear
		
		if (isLeft)
			children.forEach[e|ce.exprs.add(createBinaryExpression(be.operator, e, EcoreUtil.copy(otherExpr)))]
		else
			children.forEach[e|ce.exprs.add(createBinaryExpression(be.operator, EcoreUtil.copy(otherExpr), e))]

		// the updated expression must be revisited 
		AlphaInternalStateConstructor.recomputeContextDomain(ce);
		apply(ce);
	}

	protected def dispatch binaryExpressionRules(BinaryExpression be, AlphaExpression expr) {
		// Nothing if there is no matching rule
	}

	override outUnaryExpression(UnaryExpression ue) {
		unaryExpressionRules(ue, ue.expr)
	}

	// (op D : E) -> D : (op E)
	protected def dispatch unaryExpressionRules(UnaryExpression ue, RestrictExpression innerRE) {
		val E = innerRE.expr
		EcoreUtil.replace(ue, innerRE)
		innerRE.expr = ue
		ue.expr = E
	}
	
	//op case { E1; E2; ... }-> case { op E1; op E2; ... }
	protected def dispatch unaryExpressionRules(UnaryExpression ue, CaseExpression ce) {
		propagateDownwards(ue, ce)
		
		// the updated expression must be revisited 
		apply(ce);
	}

	protected def dispatch unaryExpressionRules(UnaryExpression ue, AlphaExpression expr) {
		// Nothing if there is no matching rule
	}
	
	override outMultiArgExpression(MultiArgExpression mae) {
		
		//keep track of the original container to restart the traversal
		val container = mae.eContainer as AlphaCompleteVisitable
	
		var changed = false
		for (var i=0; i < mae.exprs.size && !changed; i++) {
			changed = multiArgExpressionRules(mae, mae.exprs.get(i))
		}
		if (changed) {
			AlphaInternalStateConstructor.recomputeContextDomain(container)
			apply(container);
			return;
		}
		
		//originally rule 19
		//  f(op, D : E) -> D : f(op, E)
		//extended to propagate all restrict expressions in the operand all at once
		//  f(op, D1 : E1, D2 : E2) -> (D1 and D2 ...) : f(op, E1, E2, ...)
		if (mae.exprs.exists[e|e instanceof RestrictExpression]) {
			var intersection = mae.exprs.filter(RestrictExpression).map[e|e.restrictDomain].reduce[d1, d2|d1.intersect(d2)]
			val hoistedRE = createRestrictExpression(intersection)
			EcoreUtil.replace(mae, hoistedRE)
			hoistedRE.expr = mae
			mae.exprs.filter(RestrictExpression).forEach[e|EcoreUtil.replace(e, e.expr)]
			
			AlphaInternalStateConstructor.recomputeContextDomain(hoistedRE)
			apply(hoistedRE);
			return;
		}
	}
	
	// f(op, case { E1; E2; ... }) -> case { f(op, E1); f(op, E2); ...}
	protected def dispatch multiArgExpressionRules(MultiArgExpression mae, CaseExpression ce) {
		val index = mae.exprs.indexOf(ce)
		if (index <= -1) throw new RuntimeException("Unexpected case at normalize rule for multi-arg expressions. The child index cannot be found. ");
		
		val children = new ArrayList<AlphaExpression>(ce.exprs.size)
		ce.exprs.forEach[e|children.add(e)]
		ce.exprs.clear
		
		//each branch of the case is replaced with the multi-arg expression
		// where the operand corresponding to case is replaced with the case branch
		children.forEach[e|
			val newMAE = EcoreUtil.copy(mae)
			EcoreUtil.replace(newMAE.exprs.get(index), e) 
			ce.exprs.add(newMAE)
		]
		EcoreUtil.replace(mae, ce)
		
		return true
	}

	protected def dispatch multiArgExpressionRules(MultiArgExpression mae, AlphaExpression expr) {
		// Nothing if there is no matching rule
		return false
	}

	override outCaseExpression(CaseExpression ce) {
//		debug("rule10", "case E1; case E2 esac; E3; esac -> case E1; E2; E3; esac", "");
	}

	protected def dispatch caseExpressionRules(CaseExpression ce, AlphaExpression expr) {
		// Nothing if there is no matching rule
	}
	
	/**
	 * Helper function to propagate dependence/restrict expressions downwards.
	 * 
	 * It is a recurring pattern for several expressions to take the function/domain
	 * in the outer dependence/restrict surrounding case/multi-arg expressions and
	 * apply them to all of their children. This method centralizes this operation
	 * to avoid redundant code.
	 * 
	 */
	private def propagateDownwards(AlphaExpression outer, AlphaExpression inner) {
		EcoreUtil.replace(outer, inner);

		val exprsEList = getChildrenEList(inner)
		val children = new ArrayList<AlphaExpression>(exprsEList.size)
		
		// keep the children to a non-containment list to avoid concurrent modification exception
		exprsEList.forEach[e|children.add(e)]
		exprsEList.clear

		children.forEach[e|exprsEList.add(wrapExpression(outer, e))]
	}
	
	private def dispatch getChildrenEList(CaseExpression ce) {
		ce.exprs
	}
	private def dispatch getChildrenEList(MultiArgExpression mae) {
		mae.exprs
	}
	
	private def dispatch wrapExpression(RestrictExpression wrapper, AlphaExpression expr) {
		return createRestrictExpression(wrapper.restrictDomain, expr)
	}
	private def dispatch wrapExpression(DependenceExpression wrapper, AlphaExpression expr) {
		return createDependenceExpression(wrapper.function, expr)
	}
	private def dispatch wrapExpression(UnaryExpression wrapper, AlphaExpression expr) {
		return createUnaryExpression(wrapper.operator, expr)
	}
}
