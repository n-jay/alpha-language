/**
 */
package alpha.model.matrix;

import fr.irisa.cairn.jnimap.isl.ISLMultiAff;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Matrix</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Matrix is simply a 2D array of Long, represented as a list of MatrixRows.
 * This representation is designed for representing functions, and hence each
 * row represents the output dimension of a function.
 * The number of columns are parameters+indices+1 for constant. Optionally, the constant
 * column may be omitted to only reprsent the linear part of the function.
 * 
 * The utility of making it a class is in the book keeping of dimensions (space).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.model.matrix.Matrix#getSpace <em>Space</em>}</li>
 *   <li>{@link alpha.model.matrix.Matrix#getRows <em>Rows</em>}</li>
 *   <li>{@link alpha.model.matrix.Matrix#isLinearPartOnly <em>Linear Part Only</em>}</li>
 * </ul>
 *
 * @see alpha.model.matrix.MatrixPackage#getMatrix()
 * @model
 * @generated
 */
public interface Matrix extends EObject {
	/**
	 * Returns the value of the '<em><b>Space</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Space</em>' containment reference.
	 * @see #setSpace(Space)
	 * @see alpha.model.matrix.MatrixPackage#getMatrix_Space()
	 * @model containment="true"
	 * @generated
	 */
	Space getSpace();

	/**
	 * Sets the value of the '{@link alpha.model.matrix.Matrix#getSpace <em>Space</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Space</em>' containment reference.
	 * @see #getSpace()
	 * @generated
	 */
	void setSpace(Space value);

	/**
	 * Returns the value of the '<em><b>Rows</b></em>' containment reference list.
	 * The list contents are of type {@link alpha.model.matrix.MatrixRow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rows</em>' containment reference list.
	 * @see alpha.model.matrix.MatrixPackage#getMatrix_Rows()
	 * @model containment="true"
	 * @generated
	 */
	EList<MatrixRow> getRows();

	/**
	 * Returns the value of the '<em><b>Linear Part Only</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linear Part Only</em>' attribute.
	 * @see #setLinearPartOnly(boolean)
	 * @see alpha.model.matrix.MatrixPackage#getMatrix_LinearPartOnly()
	 * @model default="false" unique="false"
	 * @generated
	 */
	boolean isLinearPartOnly();

	/**
	 * Sets the value of the '{@link alpha.model.matrix.Matrix#isLinearPartOnly <em>Linear Part Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linear Part Only</em>' attribute.
	 * @see #isLinearPartOnly()
	 * @generated
	 */
	void setLinearPartOnly(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	boolean isConsistent();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" rUnique="false" cUnique="false"
	 * @generated
	 */
	long getValue(int r, int c);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model rUnique="false" cUnique="false" vUnique="false"
	 * @generated
	 */
	void setValue(int r, int c, long v);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	int getNbRows();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	int getNbColumns();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	int getNbParams();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	int getNbIndices();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	EList<String> getParamNames();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	EList<String> getIndexNames();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 * @generated
	 */
	String toString();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Converts {@link Matrix} to 2D long array.
	 * <!-- end-model-doc -->
	 * @model dataType="alpha.model.matrix.LongMatrix" unique="false"
	 * @generated
	 */
	long[][] toArray();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Converts {@link Matrix} to MultiAff.
	 * 
	 * @param mat
	 * @return
	 * <!-- end-model-doc -->
	 * @model dataType="alpha.model.matrix.JNIISLMultiAff" unique="false"
	 * @generated
	 */
	ISLMultiAff toMultiAff();

} // Matrix
