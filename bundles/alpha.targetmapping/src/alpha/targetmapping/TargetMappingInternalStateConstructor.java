package alpha.targetmapping;

import java.util.LinkedList;
import java.util.List;

import alpha.model.issue.AlphaIssue;
import alpha.model.issue.UnhandledExceptionIssue;

public class TargetMappingInternalStateConstructor {

	public static List<AlphaIssue> compute(TargetMapping tm) {
		List<AlphaIssue> issues = new LinkedList<>();
		try {
			//default value for target body is given here
			//  Xtext parser guarantees that TargetMappingForSystemBody is created, even if
			//  target body is not specified in input. However, the cross-reference is not 
			//  set appropriately in this case. This case is handled in 
			//  InternalStateConstructor, which should be always called right after parsing.
			for (TargetMappingForSystemBody tmsb : tm.getSystemBodyTMs()) {
				if (tmsb.getTargetBody() == null && tm.getTargetSystem().getSystemBodies().size() > 0) {
					tmsb.setTargetBody(tm.getTargetSystem().getSystemBodies().get(0));
				}
			}
			
			issues.addAll(JNIDomainCalculatorForTM.calculate(tm));
//			issues.addAll(JNIDomainCalculator.calculate(root, DOMAIN_CALC_MODE.EXPRESSION_ONLY));
//			issues.addAll(ExpressionDomainCalculator.calculate(root));
//			issues.addAll(ContextDomainCalculator.calculate(root));
//			issues.addAll(AlphaNameUniquenessChecker.check(root));
//			issues.addAll(UniquenessAndCompletenessCheck.check(root));
	
			return issues;
		} catch (RuntimeException re) {
			re.printStackTrace();
			issues.add(new UnhandledExceptionIssue(tm, TargetmappingPackage.Literals.TARGET_MAPPING__SYSTEM_BODY_TMS, re));
			return issues;
		}
	}

}
