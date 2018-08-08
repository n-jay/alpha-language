/**
 */
package alpha.model.matrix;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see alpha.model.matrix.MatrixFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel operationReflection='false' loadInitialization='false' literalsInterface='true' basePackage='alpha.model'"
 * @generated
 */
public interface MatrixPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "matrix";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "alpha.model.matrix";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "matrix";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MatrixPackage eINSTANCE = alpha.model.matrix.impl.MatrixPackageImpl.init();

	/**
	 * The meta object id for the '{@link alpha.model.matrix.impl.MatrixImpl <em>Matrix</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alpha.model.matrix.impl.MatrixImpl
	 * @see alpha.model.matrix.impl.MatrixPackageImpl#getMatrix()
	 * @generated
	 */
	int MATRIX = 0;

	/**
	 * The feature id for the '<em><b>Space</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX__SPACE = 0;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX__ROWS = 1;

	/**
	 * The number of structural features of the '<em>Matrix</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link alpha.model.matrix.impl.MatrixRowImpl <em>Row</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alpha.model.matrix.impl.MatrixRowImpl
	 * @see alpha.model.matrix.impl.MatrixPackageImpl#getMatrixRow()
	 * @generated
	 */
	int MATRIX_ROW = 1;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX_ROW__VALUES = 0;

	/**
	 * The number of structural features of the '<em>Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX_ROW_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link alpha.model.matrix.impl.SpaceImpl <em>Space</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alpha.model.matrix.impl.SpaceImpl
	 * @see alpha.model.matrix.impl.MatrixPackageImpl#getSpace()
	 * @generated
	 */
	int SPACE = 2;

	/**
	 * The feature id for the '<em><b>Param Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE__PARAM_NAMES = 0;

	/**
	 * The feature id for the '<em><b>Index Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE__INDEX_NAMES = 1;

	/**
	 * The number of structural features of the '<em>Space</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '<em>JNIISL Space</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.cairn.jnimap.isl.jni.JNIISLSpace
	 * @see alpha.model.matrix.impl.MatrixPackageImpl#getJNIISLSpace()
	 * @generated
	 */
	int JNIISL_SPACE = 3;


	/**
	 * Returns the meta object for class '{@link alpha.model.matrix.Matrix <em>Matrix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Matrix</em>'.
	 * @see alpha.model.matrix.Matrix
	 * @generated
	 */
	EClass getMatrix();

	/**
	 * Returns the meta object for the containment reference '{@link alpha.model.matrix.Matrix#getSpace <em>Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Space</em>'.
	 * @see alpha.model.matrix.Matrix#getSpace()
	 * @see #getMatrix()
	 * @generated
	 */
	EReference getMatrix_Space();

	/**
	 * Returns the meta object for the containment reference list '{@link alpha.model.matrix.Matrix#getRows <em>Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rows</em>'.
	 * @see alpha.model.matrix.Matrix#getRows()
	 * @see #getMatrix()
	 * @generated
	 */
	EReference getMatrix_Rows();

	/**
	 * Returns the meta object for class '{@link alpha.model.matrix.MatrixRow <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Row</em>'.
	 * @see alpha.model.matrix.MatrixRow
	 * @generated
	 */
	EClass getMatrixRow();

	/**
	 * Returns the meta object for the attribute list '{@link alpha.model.matrix.MatrixRow#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Values</em>'.
	 * @see alpha.model.matrix.MatrixRow#getValues()
	 * @see #getMatrixRow()
	 * @generated
	 */
	EAttribute getMatrixRow_Values();

	/**
	 * Returns the meta object for class '{@link alpha.model.matrix.Space <em>Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Space</em>'.
	 * @see alpha.model.matrix.Space
	 * @generated
	 */
	EClass getSpace();

	/**
	 * Returns the meta object for the attribute list '{@link alpha.model.matrix.Space#getParamNames <em>Param Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Param Names</em>'.
	 * @see alpha.model.matrix.Space#getParamNames()
	 * @see #getSpace()
	 * @generated
	 */
	EAttribute getSpace_ParamNames();

	/**
	 * Returns the meta object for the attribute list '{@link alpha.model.matrix.Space#getIndexNames <em>Index Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Index Names</em>'.
	 * @see alpha.model.matrix.Space#getIndexNames()
	 * @see #getSpace()
	 * @generated
	 */
	EAttribute getSpace_IndexNames();

	/**
	 * Returns the meta object for data type '{@link fr.irisa.cairn.jnimap.isl.jni.JNIISLSpace <em>JNIISL Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>JNIISL Space</em>'.
	 * @see fr.irisa.cairn.jnimap.isl.jni.JNIISLSpace
	 * @model instanceClass="fr.irisa.cairn.jnimap.isl.jni.JNIISLSpace"
	 * @generated
	 */
	EDataType getJNIISLSpace();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MatrixFactory getMatrixFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link alpha.model.matrix.impl.MatrixImpl <em>Matrix</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alpha.model.matrix.impl.MatrixImpl
		 * @see alpha.model.matrix.impl.MatrixPackageImpl#getMatrix()
		 * @generated
		 */
		EClass MATRIX = eINSTANCE.getMatrix();

		/**
		 * The meta object literal for the '<em><b>Space</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATRIX__SPACE = eINSTANCE.getMatrix_Space();

		/**
		 * The meta object literal for the '<em><b>Rows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATRIX__ROWS = eINSTANCE.getMatrix_Rows();

		/**
		 * The meta object literal for the '{@link alpha.model.matrix.impl.MatrixRowImpl <em>Row</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alpha.model.matrix.impl.MatrixRowImpl
		 * @see alpha.model.matrix.impl.MatrixPackageImpl#getMatrixRow()
		 * @generated
		 */
		EClass MATRIX_ROW = eINSTANCE.getMatrixRow();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATRIX_ROW__VALUES = eINSTANCE.getMatrixRow_Values();

		/**
		 * The meta object literal for the '{@link alpha.model.matrix.impl.SpaceImpl <em>Space</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alpha.model.matrix.impl.SpaceImpl
		 * @see alpha.model.matrix.impl.MatrixPackageImpl#getSpace()
		 * @generated
		 */
		EClass SPACE = eINSTANCE.getSpace();

		/**
		 * The meta object literal for the '<em><b>Param Names</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPACE__PARAM_NAMES = eINSTANCE.getSpace_ParamNames();

		/**
		 * The meta object literal for the '<em><b>Index Names</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPACE__INDEX_NAMES = eINSTANCE.getSpace_IndexNames();

		/**
		 * The meta object literal for the '<em>JNIISL Space</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.irisa.cairn.jnimap.isl.jni.JNIISLSpace
		 * @see alpha.model.matrix.impl.MatrixPackageImpl#getJNIISLSpace()
		 * @generated
		 */
		EDataType JNIISL_SPACE = eINSTANCE.getJNIISLSpace();

	}

} //MatrixPackage
