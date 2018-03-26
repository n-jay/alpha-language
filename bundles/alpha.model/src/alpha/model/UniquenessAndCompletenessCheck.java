package alpha.model;

import static alpha.model.util.AlphaUtil.callISLwithErrorHandling;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import alpha.model.issue.AlphaIssue;
import alpha.model.issue.AlphaIssueFactory;
import alpha.model.issue.UnexpectedISLErrorIssue;
import alpha.model.util.AbstractAlphaCompleteVisitor;
import alpha.model.util.AlphaUtil;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLSet;

/**
 * Uniqueness and Completeness check is a basic analysis of Alpha programs to
 * ensure that all computations are defined once and only once.
 * 
 * Assumes that the uniqueness at the syntactic level (duplicate equations, etc.)
 * are checked by NameUniquenessChecker.
 * 
 * The properties to be checked are:
 *   - expression domain of the root expression should cover the variable domain
 *   - branches of case expressions should have disjoint domains
 * 
 * @author tyuki
 *
 */
public class UniquenessAndCompletenessCheck extends AbstractAlphaCompleteVisitor {
	
	private List<AlphaIssue> issues = new LinkedList<>();

	public static List<AlphaIssue> check(List<AlphaRoot> roots) {
		UniquenessAndCompletenessCheck checker = new UniquenessAndCompletenessCheck();
		
		for (AlphaRoot root : roots ) {
			checker.accept(root);
		}
		
		return checker.issues;
	}

	public static List<AlphaIssue> check(AlphaRoot root) {
		return check(Arrays.asList(root));
	}
	
	@Override
	public void inStandardEquation(StandardEquation se) {
		JNIISLSet defDom = se.getExpr().getExpressionDomain();
		JNIISLSet varDom = se.getVariable().getDomain();
		if (defDom == null || varDom == null) return;

		callISLwithErrorHandling(()->{
			JNIISLSet undefDom = varDom.copy().subtract(defDom);
			
			if (!undefDom.isEmpty()) {
				JNIISLSet systemParam = AlphaUtil.getContainerSystem(se).getParameterDomain().getISLSet();
				JNIISLSet undefDomParam = undefDom.copy().paramSet().gist(systemParam);
				JNIISLSet undefDomGist = undefDom.gist(varDom);

				issues.add(AlphaIssueFactory.incompleteEquation(se, undefDomGist, undefDomParam));
			}
		}, (err)->{issues.add(new UnexpectedISLErrorIssue(err, se, null));});
		
	}
	
	@Override
	public void inCaseExpression(CaseExpression ce) {
		if (AlphaUtil.testNonNullContextDomain(AlphaUtil.getChildrenOfType(ce, AlphaExpression.class))) {
			
			JNIISLSet childrenDomain = null;
			
			for (AlphaExpression expr : ce.getExprs()) {
				if (childrenDomain == null) {
					childrenDomain = expr.getContextDomain();
				} else {
					if (!childrenDomain.isDisjoint(expr.getContextDomain())) {
						
						issues.add(AlphaIssueFactory.overlappingCaseBranch(expr, expr.getContextDomain().intersect(childrenDomain.copy())));
					}
					childrenDomain = childrenDomain.union(expr.getContextDomain());
				}
			}
		}
	}
	

//	private void registerIssue(String msg, Object expr) {
//		
//	}
//	
//	private void runISLoperations(AlphaExpression expr, Runnable r) {
//		if (AlphaUtil.testNonNullExpressionDomain(AlphaUtil.getChildrenOfType(expr, AlphaExpression.class))) 
//				callISLwithErrorHandling(r, (err)->registerIssue(err, expr));
//	}
}
