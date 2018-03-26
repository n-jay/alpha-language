package alpha.model

import alpha.model.issue.AlphaIssue
import alpha.model.issue.AlphaIssueFactory
import alpha.model.issue.UnexpectedISLErrorIssue
import alpha.model.util.AbstractAlphaExpressionVisitor
import alpha.model.util.AbstractAlphaVisitor
import alpha.model.util.AlphaUtil
import fr.irisa.cairn.jnimap.isl.jni.JNIISLAff
import fr.irisa.cairn.jnimap.isl.jni.JNIISLDimType
import fr.irisa.cairn.jnimap.isl.jni.JNIISLMap
import fr.irisa.cairn.jnimap.isl.jni.JNIISLSet
import java.util.LinkedList
import java.util.List
import java.util.function.Supplier
import org.eclipse.emf.ecore.EObject

import static alpha.model.util.AlphaUtil.callISLwithErrorHandling
import fr.irisa.cairn.jnimap.isl.jni.JNIISLMultiAff

class ContextDomainCalculator extends AbstractAlphaExpressionVisitor {

	private List<AlphaIssue> issues = new LinkedList

	public static def List<AlphaIssue> calculate(AlphaVisitable node) {
		val calc = new ContextDomainCalculator();

		node.accept(new AbstractAlphaVisitor() {

			override visitStandardEquation(StandardEquation se) {
				se.getExpr().accept(calc);
			}

			override visitUseEquation(UseEquation ue) {
				ue.inputExprs.forEach[a|a.accept(calc)]
				ue.outputExprs.forEach[a|a.accept(calc)]
			}
		});

		return calc.issues;
	}

	public static def List<AlphaIssue> calculate(AlphaExpression expr) {
		val calc = new ContextDomainCalculator();

		expr.accept(calc);

		return calc.issues;
	}

	private def void registerIssue(String errMsg, AlphaNode node) {
		issues.add(new UnexpectedISLErrorIssue(errMsg, node.eContainer(), node.eContainingFeature()));
	}
	
	override inAutoRestrictExpression(AutoRestrictExpression are) {
		if (are.eContainer === null) throw new RuntimeException("Uncontained AlphaExpression");
		if (are.expressionDomain === null) return;
		
		if (!(are.eContainer instanceof CaseExpression)) {
			//throw new RuntimeException("AutoRestrict can only be direct child of CaseExpression.");
			issues.add(AlphaIssueFactory.autoRestrictNotInCase(are));
			return;
		}
		
		val parentCase = are.eContainer as CaseExpression;
		if (AlphaUtil.getChildrenOfType(parentCase, AutoRestrictExpression).count > 1) {
			issues.add(AlphaIssueFactory.multipleAutoRestrict(are));
			return;
		}
		
		if (!AlphaUtil.testNonNullExpressionDomain(parentCase.exprs.stream)) {
			return;
		}
		
		val parentContext = are.parentContext(parentCase);
		if (parentContext === null) return;

		var JNIISLSet inferredDomain
		
		if (parentCase.exprs.length == 1) {
			inferredDomain = parentContext.intersect(are.expressionDomain)
		} else {
			val otherExprDomain = parentCase.exprs.filter[e|!(e instanceof AutoRestrictExpression)].map[expressionDomain].reduce[p1, p2|p1.union(p2)]
			inferredDomain = parentContext.subtract(otherExprDomain).intersect(are.expressionDomain)
		}
		
		if (inferredDomain.isEmpty) {
			issues.add(AlphaIssueFactory.emptyAutoRestrict(are));
		}
		
		are.inferredDomain =  inferredDomain;
		are.contextDomain = inferredDomain.copy;
	}

	override inAlphaExpression(AlphaExpression ae) {
		if (ae.eContainer === null) throw new RuntimeException("Uncontained AlphaExpression");
		if (ae.expressionDomain === null) return;

		val parentContext = ae.parentContext(ae.eContainer as AlphaNode)

		if (parentContext === null) {
			// If parent context domain is not define, then do not report this as an issue, 
			//  but gracefully continue without computing context domain
			// Only the source of the error should report it. 
			return;
		}

		val processedContext = ae.eContainer.processContext(parentContext)
		
		if (processedContext === null) return;
		
		val context = runISLoperations(ae, [processedContext.intersect(ae.expressionDomain)]);

		ae.contextDomain = context
	}

	private dispatch def parentContext(AlphaExpression child, StandardEquation parent) {
		parent.variable.domain
	}

	//For UseEquations, the context depends on the location of the child
	// the instantiation domain is extended by the number of dimension with the corresponding input/output in the callee subsystem
	//  
	private dispatch def parentContext(AlphaExpression child, UseEquation parent) {
		if (checkCalcExprType(parent.instantiationDomainExpr, POLY_OBJECT_TYPE.SET)) {
			
			val inputLoc = parent.inputExprs.indexOf(child);
			val outputLoc = parent.outputExprs.indexOf(child)
			if (inputLoc == -1 && outputLoc == -1) return null
			
			var calleeVar = if (inputLoc!=-1) parent.system.inputs.get(inputLoc) else parent.system.outputs.get(outputLoc)
			
			return extendCalleeDomainByInstantiationDomain(parent.instantiationDomain, parent.callParams.ISLMultiAff, calleeVar.domain)
			
		} else {
			return null
		}
	}
	
	
	
	private def JNIISLSet extendCalleeDomainByInstantiationDomain(JNIISLSet instantiationDomain, JNIISLMultiAff callParams, JNIISLSet calleeVarDom) {
		val map = JNIISLMap.fromRange(calleeVarDom)
		val nparam = map.getNbParams()
		val p2s = map.moveDims(JNIISLDimType.isl_dim_in, 0, JNIISLDimType.isl_dim_param, 0, nparam)
		val p2sEx = p2s.alignParams(instantiationDomain.space)
		val paramCallRel = callParams.toMap.intersectDomain(instantiationDomain)
		val ctxMap = paramCallRel.applyRange(p2sEx)
		
		return ctxMap.toSet
	}

	//default case, just pass the context of the parent
	private dispatch def parentContext(AlphaExpression child, AlphaExpression parent) {
		parent.contextDomain
	}

	private dispatch def processContext(DependenceExpression expr, JNIISLSet context) {
		return runISLoperations(expr, [context.apply(expr.function.ISLMultiAff.toMap)]);
	}
	
	private dispatch def processContext(SelectExpression expr, JNIISLSet context) {
		return runISLoperations(expr, [context.apply(expr.selectRelation)]);
	}

	private dispatch def processContext(ReduceExpression expr, JNIISLSet context) {
		return runISLoperations(expr, [context.preimage(expr.projection.ISLMultiAff)]);
	}

	private dispatch def processContext(ArgReduceExpression expr, JNIISLSet context) {
		return runISLoperations(expr, [context.preimage(expr.projection.ISLMultiAff)]);
	}

	// default is not do anything
	private dispatch def processContext(AlphaNode expr, JNIISLSet context) {
		return context
	}
	private dispatch def processContext(EObject expr, JNIISLSet context) {
		return null;
	}
	
	
	private def <T> T runISLoperations(AlphaExpression expr, Supplier<T> r) {
		if (AlphaUtil.testNonNullExpressionDomain(AlphaUtil.getChildrenOfType(expr, AlphaExpression))) 
				return callISLwithErrorHandling(r, [err|registerIssue(err, expr)]);
	}
	
	
	private def boolean checkCalcExprType(CalculatorExpression cexpr, POLY_OBJECT_TYPE expected) {
		if (cexpr.getType() != expected) {
			issues.add(AlphaIssueFactory.unmatchedCalcExprType(cexpr, expected));
			return false;
		}
		
		return true;
	}
}
