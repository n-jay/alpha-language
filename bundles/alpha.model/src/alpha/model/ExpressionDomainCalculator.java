package alpha.model;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import alpha.model.issue.AlphaIssue;
import alpha.model.issue.AlphaIssue.TYPE;
import alpha.model.issue.ExpressionDomainIssue;
import alpha.model.util.AbstractAlphaExpressionVisitor;
import alpha.model.util.AbstractAlphaVisitor;
import alpha.model.util.AlphaUtil;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLSet;

public class ExpressionDomainCalculator extends AbstractAlphaExpressionVisitor {
	
	private List<AlphaIssue> issues = new LinkedList<>();
	
	public static List<AlphaIssue> calculate(AlphaVisitable node) {
		ExpressionDomainCalculator calc = new ExpressionDomainCalculator();
		
		node.accept(new AbstractAlphaVisitor() {
			@Override
			public void visitStandardEquation(StandardEquation se) {
				se.getExpr().accept(calc);
			}
			
			@Override
			public void visitUseEquation(UseEquation ue) {
				ue.getInputExprs().stream().forEach(a->a.accept(calc));
				ue.getOutputExprs().stream().forEach(a->a.accept(calc));
			}
		});
		
		return calc.issues;
	}
	
	public static List<AlphaIssue> calculate(AlphaExpression expr) {
		ExpressionDomainCalculator calc = new ExpressionDomainCalculator();
		
		expr.accept(calc);
		
		return calc.issues;
	}
	
	/**
	 * Helper method that checks the given list of expressions and its expression domains are defined.
	 * 
	 * @param exprs
	 * @return
	 */
	private boolean checkNotNull(List<AlphaExpression> exprs) {
		for (AlphaExpression expr : exprs) {
			if (expr == null || expr.getExpressionDomain() == null)
				return false;
		}
		
		return true;
	}
	private boolean checkNotNull(AlphaExpression ... exprs) {
		return checkNotNull(Arrays.asList(exprs));
	}

	
	@Override
	public void outVariableExpression(VariableExpression ve) {
		ve.setExpressionDomain(ve.getVariable().getDomain());
	}
	
	@Override
	public void outConstantExpression(ConstantExpression ce) {
		ce.setExpressionDomain(AlphaUtil.getScalarDomain(ce));
	}
	
	@Override
	public void outUnaryExpression(UnaryExpression ue) {
		if (checkNotNull(ue.getExpr()))
			ue.setExpressionDomain(ue.getExpr().getExpressionDomain());
	}
	
	@Override
	public void outBinaryExpression(BinaryExpression be) {
		//Expression domain of a binary expression is the intersection of the two
		if (checkNotNull(be.getLeft(), be.getRight()))
			be.setExpressionDomain(be.getLeft().getExpressionDomain().intersect(be.getRight().getExpressionDomain()));
	}
	
	@Override
	public void outCaseExpression(CaseExpression ce) {
		if (checkNotNull(ce.getExprs())) {
			JNIISLSet union = ce.getExprs().stream().map(a->a.getExpressionDomain())
				.reduce((a,b)->a.union(b)).get();
			ce.setExpressionDomain(union);
		}
	}
	
	@Override
	public void outIfExpression(IfExpression ie) {
		if (checkNotNull(ie.getCondExpr(), ie.getThenExpr(), ie.getElseExpr())) {
			JNIISLSet set = ie.getCondExpr().getExpressionDomain();
			set = set.intersect(ie.getThenExpr().getExpressionDomain());
			set = set.intersect(ie.getElseExpr().getExpressionDomain());
			ie.setExpressionDomain(set);
		}
	}
	
	@Override
	public void outIndexExpression(IndexExpression ie) {
		ie.setExpressionDomain(JNIISLSet.buildUniverse(ie.getFunction().getISLMultiAff().getSpace()));
	}
	
	@Override
	public void outMultiArgExpression(MultiArgExpression mae) {
		if (checkNotNull(mae.getExprs())) {
			JNIISLSet intersection = mae.getExprs().stream().map(e->e.getExpressionDomain())
			.reduce((a,b)->a.intersect(b)).get();
			mae.setExpressionDomain(intersection);
		}
	}
	
	@Override
	public void outReduceExpression(ReduceExpression re) {
		if (checkNotNull(re.getBody())) {
			JNIISLSet proj = re.getBody().getExpressionDomain().apply(re.getProjection().getISLMultiAff().toMap());
			re.setExpressionDomain(proj);
		}
	}
	
	@Override
	public void outRestrictExpression(RestrictExpression re) {
		if (checkNotNull(re.getExpr())) {
			if (re.getDomainExpr().getType() != POLY_OBJECT_TYPE.SET) {
				issues.add(new ExpressionDomainIssue(
						TYPE.ERROR, "Calculator expression for a RestrictExpression must evaluat to set/domain.",
						re, ModelPackage.Literals.RESTRICT_EXPRESSION__DOMAIN_EXPR));
			} else {
				re.setExpressionDomain(re.getExpr().getExpressionDomain().intersect((JNIISLSet)re.getDomainExpr().getISLObject()));
			}
		
		}
	}
}
