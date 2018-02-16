package alpha.model;

import java.util.List;

import alpha.model.issue.AlphaIssue;

/**
 * This class serves as the interface to various visitors for constructing the
 * polyhedral representation in Alpha programs. The Alpha program requires the
 * expression domain and the context domain to be calculated before performing
 * further analysis and transformation.
 * 
 * The main purpose of this class is to provide a single function call that
 * handles all the pre-processing calculation.
 * 
 * @author tyuki
 *
 */
public class AlphaInternalStateConstructor {

	
	public static List<AlphaIssue> compute(AlphaRoot root) {
		List<AlphaIssue> issues = JNIDomainCalculator.calculate(root);
		
		issues.addAll(ExpressionDomainCalculator.calculate(root));
		issues.addAll(ContextDomainCalculator.calculate(root));
		issues.addAll(AlphaNameUniquenessChecker.check(root));
		
		return issues;
	}
	
	public static void compute(List<AlphaRoot> roots) {
		for (AlphaRoot root : roots) {
			JNIDomainCalculator.calculate(root);
		}
	}
}
