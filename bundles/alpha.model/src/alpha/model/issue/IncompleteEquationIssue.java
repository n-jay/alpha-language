package alpha.model.issue;

import alpha.model.StandardEquation;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLSet;

public class IncompleteEquationIssue extends AbstractAlphaIssue {
	
	private final StandardEquation equation;
	private final JNIISLSet domain;

	public IncompleteEquationIssue(StandardEquation eq, JNIISLSet domain, JNIISLSet paramDomain) {
		super(TYPE.ERROR, 
				String.format("Equation for %s is not defined with parameters %s for %s", eq.getVariable().getName(), paramDomain.toString(), domain.toString()), 
				eq, null);
		equation = eq;
		this.domain = domain;
	}

}
