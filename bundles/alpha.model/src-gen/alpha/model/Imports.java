/**
 */
package alpha.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Imports</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.model.Imports#getImportedNamespace <em>Imported Namespace</em>}</li>
 * </ul>
 *
 * @see alpha.model.ModelPackage#getImports()
 * @model
 * @generated
 */
public interface Imports extends AlphaNode, AlphaVisitable {
	/**
	 * Returns the value of the '<em><b>Imported Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported Namespace</em>' attribute.
	 * @see #setImportedNamespace(String)
	 * @see alpha.model.ModelPackage#getImports_ImportedNamespace()
	 * @model unique="false" dataType="alpha.model.String"
	 * @generated
	 */
	String getImportedNamespace();

	/**
	 * Sets the value of the '{@link alpha.model.Imports#getImportedNamespace <em>Imported Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imported Namespace</em>' attribute.
	 * @see #getImportedNamespace()
	 * @generated
	 */
	void setImportedNamespace(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model visitorUnique="false"
	 * @generated
	 */
	void accept(AlphaVisitor visitor);

} // Imports
