package alpha.targetmapping.issue;

import alpha.model.issue.AlphaIssue.TYPE;
import alpha.model.issue.InvalidSyntaxIssue;
import alpha.targetmapping.TargetMappingForSystemBody;
import alpha.targetmapping.TargetmappingPackage;

public class TargetMappingIssueFactory {
	
	public static InvalidSyntaxIssue unresolvedTargetBody(TargetMappingForSystemBody tm) {
		return new InvalidSyntaxIssue(TYPE.ERROR, "Unresolved target SystemBody", tm, TargetmappingPackage.Literals.TARGET_MAPPING_FOR_SYSTEM_BODY__TARGET_BODY);
	}

}
