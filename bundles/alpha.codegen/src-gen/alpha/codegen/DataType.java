/**
 */
package alpha.codegen;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * * Represents a data type which may or may not be a pointer.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.codegen.DataType#getBaseType <em>Base Type</em>}</li>
 *   <li>{@link alpha.codegen.DataType#getIndirectionLevel <em>Indirection Level</em>}</li>
 * </ul>
 *
 * @see alpha.codegen.CodegenPackage#getDataType()
 * @model
 * @generated
 */
public interface DataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Type</b></em>' attribute.
	 * The literals are from the enumeration {@link alpha.codegen.BaseDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * The underlying data type being represented.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Base Type</em>' attribute.
	 * @see alpha.codegen.BaseDataType
	 * @see #setBaseType(BaseDataType)
	 * @see alpha.codegen.CodegenPackage#getDataType_BaseType()
	 * @model unique="false"
	 * @generated
	 */
	BaseDataType getBaseType();

	/**
	 * Sets the value of the '{@link alpha.codegen.DataType#getBaseType <em>Base Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Type</em>' attribute.
	 * @see alpha.codegen.BaseDataType
	 * @see #getBaseType()
	 * @generated
	 */
	void setBaseType(BaseDataType value);

	/**
	 * Returns the value of the '<em><b>Indirection Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * The level of indirection for the type.
	 * If this is zero (or negative), then this type is not a pointer.
	 * Otherwise, this type is a pointer with <code>indirectionLevel</code> stars.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Indirection Level</em>' attribute.
	 * @see #setIndirectionLevel(int)
	 * @see alpha.codegen.CodegenPackage#getDataType_IndirectionLevel()
	 * @model unique="false"
	 * @generated
	 */
	int getIndirectionLevel();

	/**
	 * Sets the value of the '{@link alpha.codegen.DataType#getIndirectionLevel <em>Indirection Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Indirection Level</em>' attribute.
	 * @see #getIndirectionLevel()
	 * @generated
	 */
	void setIndirectionLevel(int value);

} // DataType
