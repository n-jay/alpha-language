/**
 */
package alpha.targetmapping.impl;

import alpha.model.impl.JNIFunctionImpl;

import alpha.targetmapping.JNIIdentityFunction;
import alpha.targetmapping.TargetmappingPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>JNI Identity Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class JNIIdentityFunctionImpl extends JNIFunctionImpl implements JNIIdentityFunction {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JNIIdentityFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TargetmappingPackage.Literals.JNI_IDENTITY_FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String plainToString() {
		return "Id";
	}

} //JNIIdentityFunctionImpl
