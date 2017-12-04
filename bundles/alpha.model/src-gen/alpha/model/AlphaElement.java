/**
 */
package alpha.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alpha Element</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see alpha.model.ModelPackage#getAlphaElement()
 * @model abstract="true"
 * @generated
 */
public interface AlphaElement extends AlphaVisitable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model visitorUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='visitor.visitAlphaElement(this);'"
	 * @generated
	 */
	void accept(AlphaVisitor visitor);

} // AlphaElement
