/**
 */
package alpha.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alpha Visitable</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see alpha.model.ModelPackage#getAlphaVisitable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface AlphaVisitable extends AlphaNode {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model visitorUnique="false"
	 * @generated
	 */
	void accept(AlphaVisitor visitor);

} // AlphaVisitable
