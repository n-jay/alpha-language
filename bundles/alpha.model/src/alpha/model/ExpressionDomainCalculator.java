package alpha.model;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import alpha.model.util.AbstractAlphaExpressionVisitor;

public class ExpressionDomainCalculator extends AbstractAlphaExpressionVisitor {

	
	@Override
	public void outVariableExpression(VariableExpression ve) {
		ve.setExpressionDomain(ve.getVariable().getDomain().copy());

	}
}
