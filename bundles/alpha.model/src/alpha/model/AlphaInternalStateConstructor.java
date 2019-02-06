package alpha.model;

import java.util.Arrays;
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
		try {
			List<AlphaIssue> issues = JNIDomainCalculator.calculate(root, DOMAIN_CALC_MODE.INTERFACE_ONLY);
			issues.addAll(JNIDomainCalculator.calculate(root, DOMAIN_CALC_MODE.EXPRESSION_ONLY));
			issues.addAll(ExpressionDomainCalculator.calculate(root));
			issues.addAll(ContextDomainCalculator.calculate(root));
			issues.addAll(AlphaNameUniquenessChecker.check(root));
			issues.addAll(UniquenessAndCompletenessCheck.check(root));
	
			return issues;
		} catch (RuntimeException re) {
			re.printStackTrace();
			throw re;
		}
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

	/**
	 * Recomputes expression/context domain. See {@link #recomputeContextDomain(List)}.
	 * 
	 * @param nodes
	 * @return
	 */
	public static List<AlphaIssue> recomputeContextDomain(AlphaCompleteVisitable... nodes) {
		return recomputeContextDomain(Arrays.asList(nodes));
	}

	/**
	 * Recomputes expression/context domain. It is necessary after transformations
	 * of the Alpha programs to recompute the expression/context domain.
	 * 
	 * @param nodes
	 * @return
	 */
	public static List<AlphaIssue> recomputeContextDomain(List<AlphaCompleteVisitable> nodes) {
		List<AlphaIssue> issues = new LinkedList<>();

		for (AlphaCompleteVisitable node : nodes) {
			issues.addAll(ExpressionDomainCalculator.calculate(node));
			issues.addAll(ContextDomainCalculator.calculate(node));
		}

		return issues;
	}
}
