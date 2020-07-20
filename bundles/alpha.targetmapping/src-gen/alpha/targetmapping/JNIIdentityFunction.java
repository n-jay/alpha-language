/**
 */
package alpha.targetmapping;

import alpha.model.JNIFunction;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JNI Identity Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * An additional type of function that is interpreted with identity
 * once the context is known. In Alpha, it is not possible to have
 * such "identity given context" because the Show notation requires
 * all polyhedral objects to be interpreted without any context information.
 * (It also has little use for writing Alpha)
 * 
 * JNIIdentityFunction was introduced in TargetMapping, because there are
 * situations where identity schedule/memory map would be given. In particular,
 * schedule of tile/point loops after tiling is often untouched. In such cases,
 * the grammar allows the schedule to be unspecified, which will leave the
 * schedule as null. A post-processing hook in the parser automatically creates
 * JNIIdentityFunction so that null objects are avoided to prevent having
 * != null checks everywhere.
 * <!-- end-model-doc -->
 *
 *
 * @see alpha.targetmapping.TargetmappingPackage#getJNIIdentityFunction()
 * @model
 * @generated
 */
public interface JNIIdentityFunction extends JNIFunction {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 * @generated
	 */
	String plainToString();

} // JNIIdentityFunction
