package alpha.model;

import static alpha.model.util.AlphaUtil.callISLwithErrorHandling;

import java.util.LinkedList;
import java.util.List;

import alpha.model.issue.AlphaIssue;
import alpha.model.issue.AlphaIssueFactory;
import alpha.model.issue.UnexpectedISLErrorIssue;
import alpha.model.util.AbstractAlphaExpressionVisitor;
import alpha.model.util.AlphaExpressionUtil;
import alpha.model.util.AlphaUtil;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLSet;

/**
 * Computes the expression domain for AlphaExpressions
 * 
 * @author tyuki
 *
 */
public class ExpressionDomainCalculator extends AbstractAlphaExpressionVisitor {
	
	private List<AlphaIssue> issues = new LinkedList<>();
	
	/**
	 * Recomputes the expression domain for all AlphaExpressions in the sub-tree rooted 
	 * by the given node. 
	 * 
	 * This method is a dispatcher for two possible instances of AlphaCompleteVisitable
	 * 
	 * @param expr
	 * @return
	 */
	public static List<AlphaIssue> calculate(AlphaCompleteVisitable expr) {
		if (expr instanceof AlphaVisitable) {
			return calculate((AlphaVisitable)expr);
		} else if (expr instanceof AlphaExpressionVisitable) {
			return calculate((AlphaExpressionVisitable)expr);
		}
		
		throw new RuntimeException("This should be unreachable code. Got: " + expr);
	}
	
	/**
	 * ExpressionDomainCalculator is a AlphaExpressionVisitor. 
	 * 
	 * @param node
	 * @return
	 */
	protected static List<AlphaIssue> calculate(AlphaVisitable node) {
		ExpressionDomainCalculator calc = new ExpressionDomainCalculator();
		
		calc.visit(node);
		
		return calc.issues;
	}
	
	protected static List<AlphaIssue> calculate(AlphaExpressionVisitable expr) {
		ExpressionDomainCalculator calc = new ExpressionDomainCalculator();
		
		expr.accept(calc);
		
		return calc.issues;
	}
	
	private void registerIssue(String islErr, AlphaNode node) {
		issues.add(new UnexpectedISLErrorIssue(islErr, node.eContainer(), node.eContainingFeature()));
	}
	
	private boolean checkCalcExprType(CalculatorExpression cexpr, POLY_OBJECT_TYPE expected) {
		if (cexpr.getType() != expected) {
			issues.add(AlphaIssueFactory.unmatchedCalcExprType(cexpr, expected));
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
		if (de.getFunction() != null)
			runISLoperations(de, ()->{
				JNIISLSet set = de.getExpr().getExpressionDomain().preimage(de.getFunction());
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
		if (ie.getFunction() != null)
			runISLoperations(ie, ()->{
				ie.setExpressionDomain(JNIISLSet.buildUniverse(ie.getFunction().getDomainSpace()));
			});
	}
	
	@Override
	public void outFuzzyIndexExpression(FuzzyIndexExpression fie) {
		if (fie.getDependenceRelation() != null)
			runISLoperations(fie, ()->{
				fie.setExpressionDomain(JNIISLSet.buildUniverse(fie.getDependenceRelation().getDomain().getSpace()));
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
			JNIISLSet proj = re.getBody().getExpressionDomain().apply(re.getProjection().toMap());
			re.setExpressionDomain(proj);
		});
	}
	
	@Override
	public void outRestrictExpression(RestrictExpression re) {
		if (checkCalcExprType(re.getDomainExpr(), POLY_OBJECT_TYPE.SET))
			runISLoperations(re, ()->{
				re.setExpressionDomain(re.getExpr().getExpressionDomain().intersect(re.getRestrictDomain()));
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
		if (AlphaExpressionUtil.testNonNullExpressionDomain(AlphaExpressionUtil.getChildrenOfType(expr, AlphaExpression.class))) 
				callISLwithErrorHandling(r, (err)->registerIssue(err, expr));
	}
}
