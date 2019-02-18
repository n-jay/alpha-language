/**
 */
package alpha.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Equation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.model.Equation#getSystemBody <em>System Body</em>}</li>
 * </ul>
 *
 * @see alpha.model.ModelPackage#getEquation()
 * @model abstract="true"
 * @generated
 */
public interface Equation extends AlphaVisitable {
	/**
	 * Returns the value of the '<em><b>System Body</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link alpha.model.SystemBody#getEquations <em>Equations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Body</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Body</em>' container reference.
	 * @see #setSystemBody(SystemBody)
	 * @see alpha.model.ModelPackage#getEquation_SystemBody()
	 * @see alpha.model.SystemBody#getEquations
	 * @model opposite="equations" transient="false"
	 * @generated
	 */
	SystemBody getSystemBody();

	/**
	 * Sets the value of the '{@link alpha.model.Equation#getSystemBody <em>System Body</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Body</em>' container reference.
	 * @see #getSystemBody()
	 * @generated
	 */
	void setSystemBody(SystemBody value);

} // Equation
