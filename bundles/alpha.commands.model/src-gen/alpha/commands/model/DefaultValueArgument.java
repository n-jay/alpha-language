/**
 */
package alpha.commands.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Default Value Argument</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.commands.model.DefaultValueArgument#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see alpha.commands.model.ModelPackage#getDefaultValueArgument()
 * @model
 * @generated
 */
public interface DefaultValueArgument extends CommandArgumentSpecialization {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see alpha.commands.model.ModelPackage#getDefaultValueArgument_Value()
	 * @model unique="false"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link alpha.commands.model.DefaultValueArgument#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // DefaultValueArgument
