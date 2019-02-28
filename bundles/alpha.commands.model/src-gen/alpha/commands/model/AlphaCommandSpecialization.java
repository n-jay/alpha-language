/**
 */
package alpha.commands.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alpha Command Specialization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.commands.model.AlphaCommandSpecialization#getCommand <em>Command</em>}</li>
 *   <li>{@link alpha.commands.model.AlphaCommandSpecialization#getArguments <em>Arguments</em>}</li>
 * </ul>
 *
 * @see alpha.commands.model.ModelPackage#getAlphaCommandSpecialization()
 * @model
 * @generated
 */
public interface AlphaCommandSpecialization extends EObject {
	/**
	 * Returns the value of the '<em><b>Command</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link alpha.commands.model.AlphaCommand#getSpecializations <em>Specializations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Command</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command</em>' container reference.
	 * @see #setCommand(AlphaCommand)
	 * @see alpha.commands.model.ModelPackage#getAlphaCommandSpecialization_Command()
	 * @see alpha.commands.model.AlphaCommand#getSpecializations
	 * @model opposite="specializations" transient="false"
	 * @generated
	 */
	AlphaCommand getCommand();

	/**
	 * Sets the value of the '{@link alpha.commands.model.AlphaCommandSpecialization#getCommand <em>Command</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command</em>' container reference.
	 * @see #getCommand()
	 * @generated
	 */
	void setCommand(AlphaCommand value);

	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link alpha.commands.model.CommandArgumentSpecialization}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arguments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' containment reference list.
	 * @see alpha.commands.model.ModelPackage#getAlphaCommandSpecialization_Arguments()
	 * @model containment="true"
	 * @generated
	 */
	EList<CommandArgumentSpecialization> getArguments();

} // AlphaCommandSpecialization
