package alpha.model;

import java.util.LinkedList;
import java.util.List;

import alpha.model.JNIDomainCalculator.DOMAIN_CALC_MODE;
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
		List<AlphaIssue> issues = JNIDomainCalculator.calculate(root, DOMAIN_CALC_MODE.INTERFACE_ONLY);
		issues.addAll(JNIDomainCalculator.calculate(root, DOMAIN_CALC_MODE.EXPRESSION_ONLY));
		
		issues.addAll(ExpressionDomainCalculator.calculate(root));
		issues.addAll(ContextDomainCalculator.calculate(root));
		issues.addAll(AlphaNameUniquenessChecker.check(root));
		issues.addAll(UniquenessAndCompletenessCheck.check(root));
		
		return issues;
	}
	
	public static List<AlphaIssue> compute(List<AlphaRoot> roots) {
		List<AlphaIssue> issues = new LinkedList<>();

		for (AlphaRoot root : roots) {
			issues.addAll(JNIDomainCalculator.calculate(root, DOMAIN_CALC_MODE.INTERFACE_ONLY));
		}
				
		for (AlphaRoot root : roots) {
			issues.addAll(JNIDomainCalculator.calculate(root, DOMAIN_CALC_MODE.EXPRESSION_ONLY));
			
			issues.addAll(ExpressionDomainCalculator.calculate(root));
			issues.addAll(ContextDomainCalculator.calculate(root));
			issues.addAll(AlphaNameUniquenessChecker.check(root));
			issues.addAll(UniquenessAndCompletenessCheck.check(root));
		}
		
		return issues;
	}
}
