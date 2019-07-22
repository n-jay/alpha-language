/**
 */
package alpha.model.matrix;

import fr.irisa.cairn.jnimap.isl.ISLSpace;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Space</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.model.matrix.Space#getParamNames <em>Param Names</em>}</li>
 *   <li>{@link alpha.model.matrix.Space#getIndexNames <em>Index Names</em>}</li>
 * </ul>
 *
 * @see alpha.model.matrix.MatrixPackage#getSpace()
 * @model
 * @generated
 */
public interface Space extends EObject {
	/**
	 * Returns the value of the '<em><b>Param Names</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Param Names</em>' attribute list.
	 * @see alpha.model.matrix.MatrixPackage#getSpace_ParamNames()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getParamNames();

	/**
	 * Returns the value of the '<em><b>Index Names</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index Names</em>' attribute list.
	 * @see alpha.model.matrix.MatrixPackage#getSpace_IndexNames()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getIndexNames();

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
	 * <!-- begin-model-doc -->
	 * *
	 * ISLSpace for creating Aff. For isl_aff, set space is expected.
	 * <!-- end-model-doc -->
	 * @model dataType="alpha.model.matrix.JNIISLSpace" unique="false"
	 * @generated
	 */
	ISLSpace toJNIISLSetSpace();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * ISLSpace for creating MultiAff. For isl_multi_aff, map space is expected.
	 * <!-- end-model-doc -->
	 * @model dataType="alpha.model.matrix.JNIISLSpace" unique="false" nbExprsUnique="false"
	 * @generated
	 */
	ISLSpace toJNIISLMultiAffSpace(int nbExprs);

} // Space
