package alpha.targetmapping.issue;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;


/**
 * ScheduleConsistencyIssue indicates that the schedules given to
 * a band is not consistent with each other. The primary cause is
 * the number of dimensions being different.
 * 
 * @author tyuki
 *
 */
public class ScheduleConsistencyIssue extends AbstractTargetMappingIssue {

	public ScheduleConsistencyIssue(TYPE type, String message, EObject source, EStructuralFeature feature) {
		super(type, message, source, feature);
	}
}
