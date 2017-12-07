package alpha.model.util;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import alpha.model.StandardEquation;
import alpha.model.UseEquation;

public abstract class AbstractAlphaCompleteVisitor extends EObjectImpl implements DefaultAlphaVisitor, DefaultAlphaExpressionVisitor {
	
	
	@Override
	public void visitStandardEquation(StandardEquation se) {
		inStandardEquation(se);
		DefaultAlphaExpressionVisitor.super.accept(se.getExpr());
		outStandardEquation(se);
	}
	
	@Override
	public void visitUseEquation(UseEquation ue) {
		inUseEquation(ue);
		ue.getInputExprs().forEach(a->DefaultAlphaExpressionVisitor.super.accept(a));
		ue.getOutputExprs().forEach(a->DefaultAlphaExpressionVisitor.super.accept(a));
		outUseEquation(ue);
	}

}
