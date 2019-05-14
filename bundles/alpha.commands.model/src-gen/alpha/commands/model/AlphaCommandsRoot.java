/**
 */
package alpha.commands.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alpha Commands Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.commands.model.AlphaCommandsRoot#getCategories <em>Categories</em>}</li>
 * </ul>
 *
 * @see alpha.commands.model.ModelPackage#getAlphaCommandsRoot()
 * @model
 * @generated
 */
public interface AlphaCommandsRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Categories</b></em>' containment reference list.
	 * The list contents are of type {@link alpha.commands.model.AlphaCommandCategory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categories</em>' containment reference list.
	 * @see alpha.commands.model.ModelPackage#getAlphaCommandsRoot_Categories()
	 * @model containment="true"
	 * @generated
	 */
	EList<AlphaCommandCategory> getCategories();

} // AlphaCommandsRoot
