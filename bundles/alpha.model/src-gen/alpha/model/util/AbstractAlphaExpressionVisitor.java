package alpha.model.util;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import alpha.model.AlphaExpression;
import alpha.model.AlphaExpressionVisitable;
import alpha.model.AlphaExpressionVisitor;
import alpha.model.AutoRestrictExpression;
import alpha.model.BinaryExpression;
import alpha.model.BooleanExpression;
import alpha.model.CaseExpression;
import alpha.model.ConstantExpression;
import alpha.model.DependenceExpression;
import alpha.model.ExternalMultiArgExpression;
import alpha.model.ExternalReduceExpression;
import alpha.model.IfExpression;
import alpha.model.IndexExpression;
import alpha.model.IntegerExpression;
import alpha.model.MultiArgExpression;
import alpha.model.RealExpression;
import alpha.model.ReduceExpression;
import alpha.model.RestrictExpression;
import alpha.model.UnaryExpression;
import alpha.model.VariableExpression;

public abstract class AbstractAlphaExpressionVisitor extends EObjectImpl implements AlphaExpressionVisitor {

	/*
	 * Helper to avoid repeating null check all over the place.
	 */
	private void accept(AlphaExpressionVisitable expr) {
		if (expr != null) expr.accept(this);
	}
	
	@Override
	public void visitRestrictExpression(RestrictExpression re) {
		accept(re.getExpr());
	}

	@Override
	public void visitAutoRestrictExpression(AutoRestrictExpression are) {
		accept(are);
	}

	@Override
	public void visitCaseExpression(CaseExpression ce) {
		if (ce.getExprs() != null) {
			for (AlphaExpression expr : ce.getExprs()) {
				accept(expr);
			}
		}
	}

	@Override
	public void visitIfExpression(IfExpression ie) {
		
		accept(ie.getCondExpr());
		accept(ie.getThenExpr());
		accept(ie.getElseExpr());
		
	}

	@Override
	public void visitDependenceExpression(DependenceExpression de) {
		accept(de.getExpr());
	}

	@Override
	public void visitReduceExpression(ReduceExpression re) {
		accept(re.getBody());
	}

	@Override
	public void visitUnaryExpression(UnaryExpression ue) {
		accept(ue.getExpr());
	}

	@Override
	public void visitBinaryExpression(BinaryExpression be) {
		accept(be.getLeft());
		accept(be.getRight());
	}

	@Override
	public void visitMultiArgExpression(MultiArgExpression mae) {
		
		if (mae.getExprs() != null) {
			for (AlphaExpression expr : mae.getExprs()) {
				accept(expr);
			}
		}
	}

	@Override
	public void visitIndexExpression(IndexExpression ie) {}

	@Override
	public void visitVariableExpression(VariableExpression ve) {}

	@Override
	public void visitConstantExpression(ConstantExpression ce) {}

	@Override
	public void visitIntegerExpression(IntegerExpression ie) {
		visitConstantExpression(ie);
	}

	@Override
	public void visitRealExpression(RealExpression re) {
		visitConstantExpression(re);
	}

	@Override
	public void visitBooleanExpression(BooleanExpression be) {
		visitConstantExpression(be);
	}

	@Override
	public void visitExternalMultiArgExpression(ExternalMultiArgExpression emae) {
		if (emae.getExprs() != null) {
			for (AlphaExpression expr : emae.getExprs()) {
				accept(expr);
			}
		}
	}

	@Override
	public void visitExternalReduceExpression(ExternalReduceExpression ere) {
		accept(ere.getBody());
	}

}
