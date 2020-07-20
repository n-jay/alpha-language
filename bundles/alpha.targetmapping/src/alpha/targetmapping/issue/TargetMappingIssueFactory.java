package alpha.targetmapping.issue;

import alpha.model.issue.AlphaIssue.TYPE;
import alpha.model.issue.InvalidSyntaxIssue;
import alpha.targetmapping.AbstractBandExpression;
import alpha.targetmapping.TargetMappingForSystemBody;
import alpha.targetmapping.TargetmappingPackage;

public class TargetMappingIssueFactory {
	
	public static InvalidSyntaxIssue unresolvedTargetBody(TargetMappingForSystemBody tm) {
		return new InvalidSyntaxIssue(TYPE.ERROR, "Unresolved target SystemBody", tm, TargetmappingPackage.Literals.TARGET_MAPPING_FOR_SYSTEM_BODY__TARGET_BODY);
	}
	
	public static ScheduleConsistencyIssue mismatchedPartialSchedules(AbstractBandExpression abe) {
		return new ScheduleConsistencyIssue(TYPE.ERROR, "Partial schedule dimensions do not match.", abe, TargetmappingPackage.Literals.ABSTRACT_BAND_EXPRESSION__BAND_PIECES);
	}
	
	public static ScheduleConsistencyIssue mismatchedScheduleDimNames(AbstractBandExpression abe) {
		return new ScheduleConsistencyIssue(TYPE.ERROR, "The number of schedule dimension names does not match the partial schedules.", abe, TargetmappingPackage.Literals.ABSTRACT_BAND_EXPRESSION__SCHEDULE_DIMENSION_NAMES);
	}
}
