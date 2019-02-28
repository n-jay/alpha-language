/**
 */
package alpha.commands.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alpha Command Signature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.commands.model.AlphaCommandSignature#getArguments <em>Arguments</em>}</li>
 *   <li>{@link alpha.commands.model.AlphaCommandSignature#getReturnType <em>Return Type</em>}</li>
 * </ul>
 *
 * @see alpha.commands.model.ModelPackage#getAlphaCommandSignature()
 * @model
 * @generated
 */
public interface AlphaCommandSignature extends EObject {
	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link alpha.commands.model.AlphaCommandArgument}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arguments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' containment reference list.
	 * @see alpha.commands.model.ModelPackage#getAlphaCommandSignature_Arguments()
	 * @model containment="true"
	 * @generated
	 */
	EList<AlphaCommandArgument> getArguments();

	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' attribute.
	 * The default value is <code>"void"</code>.
	 * The literals are from the enumeration {@link alpha.commands.model.ArgumentType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' attribute.
	 * @see alpha.commands.model.ArgumentType
	 * @see #setReturnType(ArgumentType)
	 * @see alpha.commands.model.ModelPackage#getAlphaCommandSignature_ReturnType()
	 * @model default="void" unique="false"
	 * @generated
	 */
	ArgumentType getReturnType();

	/**
	 * Sets the value of the '{@link alpha.commands.model.AlphaCommandSignature#getReturnType <em>Return Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' attribute.
	 * @see alpha.commands.model.ArgumentType
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(ArgumentType value);

} // AlphaCommandSignature
