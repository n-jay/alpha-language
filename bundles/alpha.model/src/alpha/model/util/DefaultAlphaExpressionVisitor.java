package alpha.model.util;

import alpha.model.AlphaExpression;
import alpha.model.AlphaExpressionVisitable;
import alpha.model.AlphaExpressionVisitor;
import alpha.model.ArgReduceExpression;
import alpha.model.AutoRestrictExpression;
import alpha.model.BinaryExpression;
import alpha.model.BooleanExpression;
import alpha.model.CaseExpression;
import alpha.model.ConstantExpression;
import alpha.model.ConvolutionExpression;
import alpha.model.DependenceExpression;
import alpha.model.ExternalArgReduceExpression;
import alpha.model.ExternalMultiArgExpression;
import alpha.model.ExternalReduceExpression;
import alpha.model.IfExpression;
import alpha.model.IndexExpression;
import alpha.model.IntegerExpression;
import alpha.model.MultiArgExpression;
import alpha.model.RealExpression;
import alpha.model.ReduceExpression;
import alpha.model.RestrictExpression;
import alpha.model.SelectExpression;
import alpha.model.UnaryExpression;
import alpha.model.VariableExpression;

public interface DefaultAlphaExpressionVisitor extends AlphaExpressionVisitor {

	/*
	 * Helper to avoid repeating null check all over the place.
	 */
	default void accept(AlphaExpressionVisitable expr) {
		if (expr != null) expr.accept(this);
	}
	
	@Override
	default void visitRestrictExpression(RestrictExpression re) {
		accept(re.getExpr());
	}

	@Override
	default void visitAutoRestrictExpression(AutoRestrictExpression are) {
		accept(are);
	}

	@Override
	default void visitCaseExpression(CaseExpression ce) {
		if (ce.getExprs() != null) {
			for (AlphaExpression expr : ce.getExprs()) {
				accept(expr);
			}
		}
	}

	@Override
	default void visitIfExpression(IfExpression ie) {
		
		accept(ie.getCondExpr());
		accept(ie.getThenExpr());
		accept(ie.getElseExpr());
		
	}

	@Override
	default void visitDependenceExpression(DependenceExpression de) {
		accept(de.getExpr());
	}

	@Override
	default void visitReduceExpression(ReduceExpression re) {
		accept(re.getBody());
	}
	
	@Override
	default void visitArgReduceExpression(ArgReduceExpression are) {
		accept(are.getBody());
	}

	@Override
	default void visitConvolutionExpression(ConvolutionExpression ce) {
		accept(ce.getKernelExpression());
		accept(ce.getDataExpression());
	}
	
	@Override
	default void visitUnaryExpression(UnaryExpression ue) {
		accept(ue.getExpr());
	}

	@Override
	default void visitBinaryExpression(BinaryExpression be) {
		accept(be.getLeft());
		accept(be.getRight());
	}

	@Override
	default void visitMultiArgExpression(MultiArgExpression mae) {
		
		if (mae.getExprs() != null) {
			for (AlphaExpression expr : mae.getExprs()) {
				accept(expr);
			}
		}
	}
	
	@Override
	default void visitSelectExpression(SelectExpression se) {
		accept(se.getExpr());
	}

	@Override
	default void visitIndexExpression(IndexExpression ie) {}

	@Override
	default void visitVariableExpression(VariableExpression ve) {}

	@Override
	default void visitConstantExpression(ConstantExpression ce) {}

	@Override
	default void visitIntegerExpression(IntegerExpression ie) {
		visitConstantExpression(ie);
	}

	@Override
	default void visitRealExpression(RealExpression re) {
		visitConstantExpression(re);
	}

	@Override
	default void visitBooleanExpression(BooleanExpression be) {
		visitConstantExpression(be);
	}

	@Override
	default void visitExternalMultiArgExpression(ExternalMultiArgExpression emae) {
		if (emae.getExprs() != null) {
			for (AlphaExpression expr : emae.getExprs()) {
				accept(expr);
			}
		}
	}

	@Override
	default void visitExternalReduceExpression(ExternalReduceExpression ere) {
		accept(ere.getBody());
	}

	@Override
	default void visitExternalArgReduceExpression(ExternalArgReduceExpression eare) {
		accept(eare.getBody());
	}
}
