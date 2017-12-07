package alpha.model.util;

import alpha.model.BinaryCalculatorExpression;
import alpha.model.CalculatorExpression;
import alpha.model.CalculatorExpressionVisitor;
import alpha.model.DefinedObject;
import alpha.model.JNIDomain;
import alpha.model.JNIFunction;
import alpha.model.JNIRelation;
import alpha.model.RectangularDomain;
import alpha.model.UnaryCalculatorExpression;
import alpha.model.VariableDomain;

public interface DefaultCalculatorExpressionVisitor extends CalculatorExpressionVisitor {

	@Override
	default void visitCalculatorExpression(CalculatorExpression expr) {}

	@Override
	default void visitUnaryCalculatorExpression(UnaryCalculatorExpression expr) {
		if (expr.getExpr() != null)
			expr.getExpr().accept(this);
	}

	@Override
	default void visitBinaryCalculatorExpression(BinaryCalculatorExpression expr) {
		if (expr.getLeft() != null)
			expr.getLeft().accept(this);
		if (expr.getRight() != null)
			expr.getRight().accept(this);
	}

	@Override
	default void visitJNIDomain(JNIDomain jniDomain) {}

	@Override
	default void visitJNIRelation(JNIRelation jniRelation) {}

	@Override
	default void visitJNIFunction(JNIFunction jniFunction) {}
	
	@Override
	default void visitVariableDomain(VariableDomain vdom) {}

	@Override
	default void visitRectangularDomain(RectangularDomain rdom) {}

	@Override
	default void visitDefinedObject(DefinedObject dobj) {}
}
