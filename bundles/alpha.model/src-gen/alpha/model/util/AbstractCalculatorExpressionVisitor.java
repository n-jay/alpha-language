package alpha.model.util;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import alpha.model.AlphaVisitor;
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

public abstract class AbstractCalculatorExpressionVisitor extends EObjectImpl implements CalculatorExpressionVisitor {

	@Override
	public void visitCalculatorExpression(CalculatorExpression expr) {
		
	}

	@Override
	public void visitUnaryCalculatorExpression(UnaryCalculatorExpression expr) {
		if (expr.getExpr() != null)
			expr.getExpr().accept(this);
	}

	@Override
	public void visitBinaryCalculatorExpression(BinaryCalculatorExpression expr) {
		if (expr.getLeft() != null)
			expr.getLeft().accept(this);
		if (expr.getRight() != null)
			expr.getRight().accept(this);
	}

	@Override
	public void visitJNIDomain(JNIDomain jniDomain) {}

	@Override
	public void visitJNIRelation(JNIRelation jniRelation) {}

	@Override
	public void visitJNIFunction(JNIFunction jniFunction) {}
	
	@Override
	public void visitVariableDomain(VariableDomain vdom) {}

	@Override
	public void visitRectangularDomain(RectangularDomain rdom) {}

	@Override
	public void visitDefinedObject(DefinedObject dobj) {}
}
