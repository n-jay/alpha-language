/**
 */
package alpha.commands.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Argument Renaming</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.commands.model.ArgumentRenaming#getBindTarget <em>Bind Target</em>}</li>
 *   <li>{@link alpha.commands.model.ArgumentRenaming#getBindSource <em>Bind Source</em>}</li>
 * </ul>
 *
 * @see alpha.commands.model.ModelPackage#getArgumentRenaming()
 * @model
 * @generated
 */
public interface ArgumentRenaming extends EObject {
	/**
	 * Returns the value of the '<em><b>Bind Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bind Target</em>' reference.
	 * @see #setBindTarget(AlphaCommandArgument)
	 * @see alpha.commands.model.ModelPackage#getArgumentRenaming_BindTarget()
	 * @model
	 * @generated
	 */
	AlphaCommandArgument getBindTarget();

	/**
	 * Sets the value of the '{@link alpha.commands.model.ArgumentRenaming#getBindTarget <em>Bind Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bind Target</em>' reference.
	 * @see #getBindTarget()
	 * @generated
	 */
	void setBindTarget(AlphaCommandArgument value);

	/**
	 * Returns the value of the '<em><b>Bind Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bind Source</em>' reference.
	 * @see #setBindSource(AlphaCommandArgument)
	 * @see alpha.commands.model.ModelPackage#getArgumentRenaming_BindSource()
	 * @model
	 * @generated
	 */
	AlphaCommandArgument getBindSource();

	/**
	 * Sets the value of the '{@link alpha.commands.model.ArgumentRenaming#getBindSource <em>Bind Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bind Source</em>' reference.
	 * @see #getBindSource()
	 * @generated
	 */
	void setBindSource(AlphaCommandArgument value);

} // ArgumentRenaming
