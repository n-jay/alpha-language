/**
 */
package alpha.model;

import fr.irisa.cairn.jnimap.isl.jni.JNIISLMap;

import fr.irisa.cairn.jnimap.runtime.JNIObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JNI Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.model.JNIRelation#getIslString <em>Isl String</em>}</li>
 *   <li>{@link alpha.model.JNIRelation#getZ__internal_cache_islMap <em>Zinternal cache isl Map</em>}</li>
 * </ul>
 *
 * @see alpha.model.ModelPackage#getJNIRelation()
 * @model
 * @generated
 */
public interface JNIRelation extends CalculatorExpression {
	/**
	 * Returns the value of the '<em><b>Isl String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Isl String</em>' attribute.
	 * @see #setIslString(String)
	 * @see alpha.model.ModelPackage#getJNIRelation_IslString()
	 * @model unique="false" dataType="alpha.model.String"
	 * @generated
	 */
	String getIslString();

	/**
	 * Sets the value of the '{@link alpha.model.JNIRelation#getIslString <em>Isl String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Isl String</em>' attribute.
	 * @see #getIslString()
	 * @generated
	 */
	void setIslString(String value);

	/**
	 * Returns the value of the '<em><b>Zinternal cache isl Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zinternal cache isl Map</em>' attribute.
	 * @see #setZ__internal_cache_islMap(JNIISLMap)
	 * @see alpha.model.ModelPackage#getJNIRelation_Z__internal_cache_islMap()
	 * @model unique="false" dataType="alpha.model.JNIISLMap"
	 * @generated
	 */
	JNIISLMap getZ__internal_cache_islMap();

	/**
	 * Sets the value of the '{@link alpha.model.JNIRelation#getZ__internal_cache_islMap <em>Zinternal cache isl Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zinternal cache isl Map</em>' attribute.
	 * @see #getZ__internal_cache_islMap()
	 * @generated
	 */
	void setZ__internal_cache_islMap(JNIISLMap value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="alpha.model.JNIISLMap" unique="false"
	 * @generated
	 */
	JNIISLMap getISLMap();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model islMapDataType="alpha.model.JNIISLMap" islMapUnique="false"
	 * @generated
	 */
	void setISLMap(JNIISLMap islMap);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	POLY_OBJECT_TYPE getType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="alpha.model.JNIObject" unique="false"
	 * @generated
	 */
	JNIObject getISLObject();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="alpha.model.String" unique="false"
	 * @generated
	 */
	String toString();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="alpha.model.String" unique="false"
	 * @generated
	 */
	String plainToString();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model visitorUnique="false"
	 * @generated
	 */
	void accept(CalculatorExpressionVisitor visitor);

} // JNIRelation
