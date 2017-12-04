/**
 */
package alpha.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.model.ExternalFunction#getName <em>Name</em>}</li>
 *   <li>{@link alpha.model.ExternalFunction#getCardinarity <em>Cardinarity</em>}</li>
 * </ul>
 *
 * @see alpha.model.ModelPackage#getExternalFunction()
 * @model
 * @generated
 */
public interface ExternalFunction extends AlphaElement {
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
	 * @see alpha.model.ModelPackage#getExternalFunction_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link alpha.model.ExternalFunction#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Cardinarity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardinarity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinarity</em>' attribute.
	 * @see #setCardinarity(int)
	 * @see alpha.model.ModelPackage#getExternalFunction_Cardinarity()
	 * @model unique="false"
	 * @generated
	 */
	int getCardinarity();

	/**
	 * Sets the value of the '{@link alpha.model.ExternalFunction#getCardinarity <em>Cardinarity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinarity</em>' attribute.
	 * @see #getCardinarity()
	 * @generated
	 */
	void setCardinarity(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model visitorUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='visitor.visitExternalFunction(this);'"
	 * @generated
	 */
	void accept(AlphaVisitor visitor);

} // ExternalFunction
