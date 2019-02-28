/**
 */
package alpha.commands.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Argument Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.commands.model.ArgumentBinding#getBindTarget <em>Bind Target</em>}</li>
 *   <li>{@link alpha.commands.model.ArgumentBinding#getBindSource <em>Bind Source</em>}</li>
 * </ul>
 *
 * @see alpha.commands.model.ModelPackage#getArgumentBinding()
 * @model
 * @generated
 */
public interface ArgumentBinding extends EObject {
	/**
	 * Returns the value of the '<em><b>Bind Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bind Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bind Target</em>' reference.
	 * @see #setBindTarget(AlphaCommandArgument)
	 * @see alpha.commands.model.ModelPackage#getArgumentBinding_BindTarget()
	 * @model
	 * @generated
	 */
	AlphaCommandArgument getBindTarget();

	/**
	 * Sets the value of the '{@link alpha.commands.model.ArgumentBinding#getBindTarget <em>Bind Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bind Target</em>' reference.
	 * @see #getBindTarget()
	 * @generated
	 */
	void setBindTarget(AlphaCommandArgument value);

	/**
	 * Returns the value of the '<em><b>Bind Source</b></em>' reference list.
	 * The list contents are of type {@link alpha.commands.model.AlphaCommandArgument}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bind Source</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bind Source</em>' reference list.
	 * @see alpha.commands.model.ModelPackage#getArgumentBinding_BindSource()
	 * @model
	 * @generated
	 */
	EList<AlphaCommandArgument> getBindSource();

} // ArgumentBinding
