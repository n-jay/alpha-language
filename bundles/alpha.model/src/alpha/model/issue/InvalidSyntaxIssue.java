package alpha.model.issue;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * InvalidSyntaxIssue indicates sub-programs that is a valid syntax according to
 * the Xtext grammar, but are disallowed. Examples are:<ul>
 *   <li>Multiple {@link AutoRestrictExpression} within branches of a {@link CaseExpression}</li>
 *   <li>Inconsistent number inputs/outputs between an {@link UseEquation} and the callee subsystem</li>
 * </ul>
 * 
 * @author tyuki
 *
 */
public class InvalidSyntaxIssue extends AbstractAlphaIssue {

	public InvalidSyntaxIssue(TYPE type, String message, EObject source, EStructuralFeature feature) {
		super(type, message, source, feature);
	}

}
