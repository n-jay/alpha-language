/**
 */
package alpha.commands.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Override Argument</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.commands.model.OverrideArgument#getName <em>Name</em>}</li>
 *   <li>{@link alpha.commands.model.OverrideArgument#getArgumentType <em>Argument Type</em>}</li>
 * </ul>
 *
 * @see alpha.commands.model.ModelPackage#getOverrideArgument()
 * @model
 * @generated
 */
public interface OverrideArgument extends CommandArgumentSpecialization {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see alpha.commands.model.ModelPackage#getOverrideArgument_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link alpha.commands.model.OverrideArgument#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Argument Type</b></em>' attribute.
	 * The literals are from the enumeration {@link alpha.commands.model.ArgumentType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Argument Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument Type</em>' attribute.
	 * @see alpha.commands.model.ArgumentType
	 * @see #setArgumentType(ArgumentType)
	 * @see alpha.commands.model.ModelPackage#getOverrideArgument_ArgumentType()
	 * @model unique="false"
	 * @generated
	 */
	ArgumentType getArgumentType();

	/**
	 * Sets the value of the '{@link alpha.commands.model.OverrideArgument#getArgumentType <em>Argument Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argument Type</em>' attribute.
	 * @see alpha.commands.model.ArgumentType
	 * @see #getArgumentType()
	 * @generated
	 */
	void setArgumentType(ArgumentType value);

} // OverrideArgument
