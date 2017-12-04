package alpha.model;

import alpha.model.util.AbstractAlphaCompleteVisitor;
import alpha.model.util.AlphaUtil;
import fr.irisa.cairn.jnimap.isl.jni.ISLFactory;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLSet;

public class JNIDomainCalculator extends AbstractAlphaCompleteVisitor {

	public static final JNIDomainCalculator INSTANCE = new JNIDomainCalculator();
	
	
	public void calculate(AlphaNode node) {
		if (node instanceof AlphaVisitable) {
			((AlphaVisitable) node).accept(INSTANCE);
		} 
		
	}
	
	@Override
	public void visitAlphaSystem(AlphaSystem system) {
		
		JNIDomain jniDomain = system.getParameterDomain();
		if (jniDomain == null || jniDomain.getIslString() == null) return;
		
		try {
			JNIISLSet jniset = ISLFactory.islSet(jniDomain.getIslString());
			jniDomain.setIslSet(jniset);
		} catch (RuntimeException re) {
			jniDomain.setErrorMessage(re.getMessage());
		}
		
		if (system.getWhileDomain() != null) {
			system.getWhileDomain().accept(CalculatorExpressionEvaluator.INSTANCE);	
		}

		super.visitAlphaSystem(system);
	}
	
	@Override
	public void visitVariable(Variable variable) {
		
		CalculatorExpression expr = variable.getDomainExpr();
		if (expr == null) return;

		AlphaSystem system = AlphaUtil.getContainerSystem(variable);
		if (system == null) return;
		
		expr.accept(CalculatorExpressionEvaluator.INSTANCE);
	}
	
	@Override
	public void visitPolyhedralObject(PolyhedralObject pobj) {
		if (pobj.getExpr() != null)
			pobj.getExpr().accept(CalculatorExpressionEvaluator.INSTANCE);
	}

}
