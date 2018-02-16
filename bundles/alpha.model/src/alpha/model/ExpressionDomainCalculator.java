package alpha.model;

import static alpha.model.util.AlphaUtil.callISLwithErrorHandling;

import java.util.LinkedList;
import java.util.List;

import alpha.model.issue.AlphaIssue;
import alpha.model.issue.AlphaIssue.TYPE;
import alpha.model.issue.ExpressionDomainIssue;
import alpha.model.util.AbstractAlphaExpressionVisitor;
import alpha.model.util.AbstractAlphaVisitor;
import alpha.model.util.AlphaUtil;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLMap;
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
	
	private void registerIssue(String islErr, AlphaNode node) {
		issues.add(new ExpressionDomainIssue(TYPE.ERROR, islErr, node.eContainer(), node.eContainingFeature()));
	}
	
	private boolean checkCalcExprType(CalculatorExpression cexpr, POLY_OBJECT_TYPE expected) {
		if (cexpr.getType() != expected) {
			String name = cexpr.eContainer().eClass().getName();
			issues.add(new ExpressionDomainIssue(
					TYPE.ERROR, "Calculator Expression for a " + name + " must evaluate to "+expected.getName()+".",
					cexpr.eContainer(), cexpr.eContainingFeature()));
			return false;
		}
		
		return true;
	}
	
	@Override
	public void outBinaryExpression(BinaryExpression be) {
		//Expression domain of a binary expression is the intersection of the two
		runISLoperations(be, ()->{
				be.setExpressionDomain(be.getLeft().getExpressionDomain().intersect(be.getRight().getExpressionDomain()));
			});
	}
	
	@Override
	public void outCaseExpression(CaseExpression ce) {
		runISLoperations(ce, ()->{
				JNIISLSet union = ce.getExprs().stream().map(a->a.getExpressionDomain())
						.reduce((a,b)->a.union(b)).get();
					ce.setExpressionDomain(union);
			});
	}
	
	@Override
	public void outConstantExpression(ConstantExpression ce) {
		ce.setExpressionDomain(AlphaUtil.getScalarDomain(ce));
	}
	
	@Override
	public void outDependenceExpression(DependenceExpression de) {
		if (de.getFunction().getISLMultiAff() != null)
			runISLoperations(de, ()->{
				JNIISLSet set = de.getExpr().getExpressionDomain().preimage(de.getFunction().getISLMultiAff());
				de.setExpressionDomain(set);
			});
	}
	
	@Override
	public void outIfExpression(IfExpression ie) {
		runISLoperations(ie, ()->{
			JNIISLSet set = ie.getCondExpr().getExpressionDomain();
			set = set.intersect(ie.getThenExpr().getExpressionDomain());
			set = set.intersect(ie.getElseExpr().getExpressionDomain());
			ie.setExpressionDomain(set);
		});
	}
	
	@Override
	public void outIndexExpression(IndexExpression ie) {
		if (ie.getFunction().getISLMultiAff() != null)
			runISLoperations(ie, ()->{
				ie.setExpressionDomain(JNIISLSet.buildUniverse(ie.getFunction().getISLMultiAff().getDomainSpace()));
			});
	}
	
	@Override
	public void outMultiArgExpression(MultiArgExpression mae) {
		runISLoperations(mae, ()->{
				JNIISLSet intersection = mae.getExprs().stream().map(e->e.getExpressionDomain())
				.reduce((a,b)->a.intersect(b)).get();
				mae.setExpressionDomain(intersection);
		});
	}
	
	@Override
	public void outAbstractReduceExpression(AbstractReduceExpression re) {
		runISLoperations(re, ()->{
			JNIISLSet proj = re.getBody().getExpressionDomain().apply(re.getProjection().getISLMultiAff().toMap());
			re.setExpressionDomain(proj);
		});
	}
	
	@Override
	public void outRestrictExpression(RestrictExpression re) {
		if (checkCalcExprType(re.getDomainExpr(), POLY_OBJECT_TYPE.SET))
			runISLoperations(re, ()->{
				re.setExpressionDomain(re.getExpr().getExpressionDomain().intersect((JNIISLSet)re.getDomainExpr().getISLObject()));
			});
	}

	@Override
	public void outUnaryExpression(UnaryExpression ue) {
		runISLoperations(ue, ()->{
			ue.setExpressionDomain(ue.getExpr().getExpressionDomain());
		});
	}
	
	@Override
	public void outVariableExpression(VariableExpression ve) {
		ve.setExpressionDomain(ve.getVariable().getDomain());
	}

	@Override
	public void outSelectExpression(SelectExpression se) {
		if (se.getSelectRelation() != null)
			runISLoperations(se, ()->{
				JNIISLSet set = se.getExpr().getExpressionDomain().apply(se.getSelectRelation().reverse());
				se.setExpressionDomain(set);
			});
	}

	@Override
	public void outAutoRestrictExpression(AutoRestrictExpression are) {
		runISLoperations(are, ()->{
			JNIISLSet set = are.getExpr().getExpressionDomain();
			are.setExpressionDomain(set);
		});
	}
//	void outConvolutionExpression(ConvolutionExpression ce);
	
	
	private void runISLoperations(AlphaExpression expr, Runnable r) {
		if (AlphaUtil.testNonNullExpressionDomain(AlphaUtil.getChildrenOfType(expr, AlphaExpression.class))) 
				callISLwithErrorHandling(r, (err)->registerIssue(err, expr));
	}
}
