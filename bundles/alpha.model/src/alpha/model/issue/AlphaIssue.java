package alpha.model.issue;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

/**
 * AlphaIssue is intended to report errors during IR construction to Xtext editor.
 * 
 * It is eventually mapped to:<ul>
 *   <li>{@link AbstractDeclarativeValidator.error}</li>
 *   <li>{@link AbstractDeclarativeValidator.warning}</li> 
 * </ul>
 * depending on the TYPE.
 * 
 * 
 * @author tyuki
 *
 */
public interface AlphaIssue {
	public enum TYPE {
		WARNING,
		ERROR
	}

	public TYPE getType();
	public String getMessage();
	public EObject getSource();
	public EStructuralFeature getFeature();
}
