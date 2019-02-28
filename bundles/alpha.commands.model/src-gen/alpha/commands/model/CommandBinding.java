/**
 */
package alpha.commands.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Command Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.commands.model.CommandBinding#getBindTargetCommand <em>Bind Target Command</em>}</li>
 *   <li>{@link alpha.commands.model.CommandBinding#getArgumentBindings <em>Argument Bindings</em>}</li>
 *   <li>{@link alpha.commands.model.CommandBinding#getArgumentRenamings <em>Argument Renamings</em>}</li>
 * </ul>
 *
 * @see alpha.commands.model.ModelPackage#getCommandBinding()
 * @model
 * @generated
 */
public interface CommandBinding extends EObject {
	/**
	 * Returns the value of the '<em><b>Bind Target Command</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bind Target Command</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bind Target Command</em>' reference.
	 * @see #setBindTargetCommand(AlphaCommand)
	 * @see alpha.commands.model.ModelPackage#getCommandBinding_BindTargetCommand()
	 * @model
	 * @generated
	 */
	AlphaCommand getBindTargetCommand();

	/**
	 * Sets the value of the '{@link alpha.commands.model.CommandBinding#getBindTargetCommand <em>Bind Target Command</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bind Target Command</em>' reference.
	 * @see #getBindTargetCommand()
	 * @generated
	 */
	void setBindTargetCommand(AlphaCommand value);

	/**
	 * Returns the value of the '<em><b>Argument Bindings</b></em>' containment reference list.
	 * The list contents are of type {@link alpha.commands.model.ArgumentBinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Argument Bindings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument Bindings</em>' containment reference list.
	 * @see alpha.commands.model.ModelPackage#getCommandBinding_ArgumentBindings()
	 * @model containment="true"
	 * @generated
	 */
	EList<ArgumentBinding> getArgumentBindings();

	/**
	 * Returns the value of the '<em><b>Argument Renamings</b></em>' containment reference list.
	 * The list contents are of type {@link alpha.commands.model.ArgumentRenaming}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Argument Renamings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument Renamings</em>' containment reference list.
	 * @see alpha.commands.model.ModelPackage#getCommandBinding_ArgumentRenamings()
	 * @model containment="true"
	 * @generated
	 */
	EList<ArgumentRenaming> getArgumentRenamings();

} // CommandBinding
