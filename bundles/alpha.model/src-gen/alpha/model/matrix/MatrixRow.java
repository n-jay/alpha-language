/**
 */
package alpha.model.matrix;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Row</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.model.matrix.MatrixRow#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see alpha.model.matrix.MatrixPackage#getMatrixRow()
 * @model
 * @generated
 */
public interface MatrixRow extends EObject {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Long}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' attribute list.
	 * @see alpha.model.matrix.MatrixPackage#getMatrixRow_Values()
	 * @model unique="false"
	 * @generated
	 */
	EList<Long> getValues();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" cUnique="false"
	 * @generated
	 */
	long getValue(int c);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model cUnique="false" vUnique="false"
	 * @generated
	 */
	void setValue(int c, long v);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 * @generated
	 */
	String toString();

} // MatrixRow
