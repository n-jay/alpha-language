/**
 */
package alpha.model.matrix.impl;

import alpha.model.matrix.*;

import fr.irisa.cairn.jnimap.isl.jni.JNIISLMultiAff;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLSpace;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MatrixFactoryImpl extends EFactoryImpl implements MatrixFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MatrixFactory init() {
		try {
			MatrixFactory theMatrixFactory = (MatrixFactory)EPackage.Registry.INSTANCE.getEFactory(MatrixPackage.eNS_URI);
			if (theMatrixFactory != null) {
				return theMatrixFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MatrixFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatrixFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MatrixPackage.MATRIX: return createMatrix();
			case MatrixPackage.MATRIX_ROW: return createMatrixRow();
			case MatrixPackage.SPACE: return createSpace();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case MatrixPackage.JNIISL_SPACE:
				return createJNIISLSpaceFromString(eDataType, initialValue);
			case MatrixPackage.JNIISL_MULTI_AFF:
				return createJNIISLMultiAffFromString(eDataType, initialValue);
			case MatrixPackage.LONG_MATRIX:
				return createLongMatrixFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case MatrixPackage.JNIISL_SPACE:
				return convertJNIISLSpaceToString(eDataType, instanceValue);
			case MatrixPackage.JNIISL_MULTI_AFF:
				return convertJNIISLMultiAffToString(eDataType, instanceValue);
			case MatrixPackage.LONG_MATRIX:
				return convertLongMatrixToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Matrix createMatrix() {
		MatrixImpl matrix = new MatrixImpl();
		return matrix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatrixRow createMatrixRow() {
		MatrixRowImpl matrixRow = new MatrixRowImpl();
		return matrixRow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Space createSpace() {
		SpaceImpl space = new SpaceImpl();
		return space;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JNIISLSpace createJNIISLSpaceFromString(EDataType eDataType, String initialValue) {
		return (JNIISLSpace)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJNIISLSpaceToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JNIISLMultiAff createJNIISLMultiAffFromString(EDataType eDataType, String initialValue) {
		return (JNIISLMultiAff)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJNIISLMultiAffToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long[][] createLongMatrixFromString(EDataType eDataType, String initialValue) {
		return (long[][])super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLongMatrixToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatrixPackage getMatrixPackage() {
		return (MatrixPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MatrixPackage getPackage() {
		return MatrixPackage.eINSTANCE;
	}

} //MatrixFactoryImpl
