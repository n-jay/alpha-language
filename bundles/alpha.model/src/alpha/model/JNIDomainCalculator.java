package alpha.model;

import java.util.LinkedList;
import java.util.List;

import alpha.model.issue.CalculatorExpressionIssue;
import alpha.model.issue.AlphaIssue.TYPE;
import alpha.model.util.AbstractAlphaVisitor;
import alpha.model.util.AlphaUtil;
import fr.irisa.cairn.jnimap.isl.jni.ISLFactory;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLSet;

public class JNIDomainCalculator extends AbstractAlphaVisitor {

//	public static final JNIDomainCalculator INSTANCE = 
	private List<CalculatorExpressionIssue> issues = new LinkedList<>();
	
	public static List<CalculatorExpressionIssue> calculate(AlphaNode node) {
		JNIDomainCalculator calc = new JNIDomainCalculator();
		if (node instanceof AlphaVisitable) {
			((AlphaVisitable) node).accept(calc);
		}
		return calc.issues;
	}
	
	@Override
	public void visitAlphaSystem(AlphaSystem system) {
		
		JNIDomain jniDomain = system.getParameterDomain();
		if (jniDomain == null || jniDomain.getIslString() == null) return;
		
		try {
			JNIISLSet jniset = ISLFactory.islSet(AlphaUtil.replaceAlphaConstants(system, jniDomain.getIslString()));
			jniDomain.setIslSet(jniset);
		} catch (RuntimeException re) {
			issues.add(new CalculatorExpressionIssue(TYPE.ERROR, re.getMessage(), jniDomain, ModelPackage.Literals.ALPHA_SYSTEM__PARAMETER_DOMAIN));
		}
		
		if (system.getWhileDomain() != null) {
			issues.addAll(CalculatorExpressionEvaluator.calculate(system.getWhileDomain()));
		}

		super.visitAlphaSystem(system);
	}
	
	@Override
	public void visitVariable(Variable variable) {
		
		CalculatorExpression expr = variable.getDomainExpr();
		if (expr == null) return;

		AlphaSystem system = AlphaUtil.getContainerSystem(variable);
		if (system == null) return;
		
		issues.addAll(CalculatorExpressionEvaluator.calculate(expr));
	}
	
	@Override
	public void visitPolyhedralObject(PolyhedralObject pobj) {
		if (pobj.getExpr() != null)
			issues.addAll(CalculatorExpressionEvaluator.calculate(pobj.getExpr()));
	}

}
