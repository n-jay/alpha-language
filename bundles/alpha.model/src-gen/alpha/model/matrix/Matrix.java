/**
 */
package alpha.model.matrix;

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
 * The number of columns are parameters+indices+1 for constant.
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
	 * <p>
	 * If the meaning of the '<em>Space</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
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
	 * <p>
	 * If the meaning of the '<em>Rows</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rows</em>' containment reference list.
	 * @see alpha.model.matrix.MatrixPackage#getMatrix_Rows()
	 * @model containment="true"
	 * @generated
	 */
	EList<MatrixRow> getRows();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final int nbCols = this.getNbColumns();\n&lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%alpha.model.matrix.MatrixRow%&gt;&gt; _rows = this.getRows();\nfor (final &lt;%alpha.model.matrix.MatrixRow%&gt; r : _rows)\n{\n\tint _size = r.getValues().size();\n\tboolean _notEquals = (_size != nbCols);\n\tif (_notEquals)\n\t{\n\t\treturn false;\n\t}\n}\nreturn true;'"
	 * @generated
	 */
	boolean isConsistent();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" rUnique="false" cUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (this.getRows().get(r).getValues().get(c)).longValue();'"
	 * @generated
	 */
	long getValue(int r, int c);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model rUnique="false" cUnique="false" vUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='this.getRows().get(r).getValues().set(c, &lt;%java.lang.Long%&gt;.valueOf(v));'"
	 * @generated
	 */
	void setValue(int r, int c, long v);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return ((&lt;%java.lang.Object%&gt;[])org.eclipse.xtext.xbase.lib.Conversions.unwrapArray(this.getRows(), &lt;%java.lang.Object%&gt;.class)).length;'"
	 * @generated
	 */
	int getNbRows();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='int _nbParams = this.getNbParams();\nint _nbIndices = this.getNbIndices();\nint _plus = (_nbParams + _nbIndices);\nreturn (_plus + 1);'"
	 * @generated
	 */
	int getNbColumns();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getSpace().getNbParams();'"
	 * @generated
	 */
	int getNbParams();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getSpace().getNbIndices();'"
	 * @generated
	 */
	int getNbIndices();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getSpace().getParamNames();'"
	 * @generated
	 */
	EList<String> getParamNames();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getSpace().getIndexNames();'"
	 * @generated
	 */
	EList<String> getIndexNames();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return &lt;%org.eclipse.xtext.xbase.lib.IterableExtensions%&gt;.join(this.getRows(), \"\\n\");'"
	 * @generated
	 */
	String toString();

} // Matrix
