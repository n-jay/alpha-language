/**
 */
package alpha.model;

import fr.irisa.cairn.jnimap.isl.jni.JNIISLPWQPolynomial;

import fr.irisa.cairn.jnimap.runtime.JNIObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JNI Polynomial</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.model.JNIPolynomial#getIslString <em>Isl String</em>}</li>
 *   <li>{@link alpha.model.JNIPolynomial#getZ__internal_cache_islPWQP <em>Zinternal cache isl PWQP</em>}</li>
 * </ul>
 *
 * @see alpha.model.ModelPackage#getJNIPolynomial()
 * @model
 * @generated
 */
public interface JNIPolynomial extends CalculatorExpression {
	/**
	 * Returns the value of the '<em><b>Isl String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Isl String</em>' attribute.
	 * @see #setIslString(String)
	 * @see alpha.model.ModelPackage#getJNIPolynomial_IslString()
	 * @model unique="false" dataType="alpha.model.String"
	 * @generated
	 */
	String getIslString();

	/**
	 * Sets the value of the '{@link alpha.model.JNIPolynomial#getIslString <em>Isl String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Isl String</em>' attribute.
	 * @see #getIslString()
	 * @generated
	 */
	void setIslString(String value);

	/**
	 * Returns the value of the '<em><b>Zinternal cache isl PWQP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zinternal cache isl PWQP</em>' attribute.
	 * @see #setZ__internal_cache_islPWQP(JNIISLPWQPolynomial)
	 * @see alpha.model.ModelPackage#getJNIPolynomial_Z__internal_cache_islPWQP()
	 * @model unique="false" dataType="alpha.model.JNIISLPWQPolynomial"
	 * @generated
	 */
	JNIISLPWQPolynomial getZ__internal_cache_islPWQP();

	/**
	 * Sets the value of the '{@link alpha.model.JNIPolynomial#getZ__internal_cache_islPWQP <em>Zinternal cache isl PWQP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zinternal cache isl PWQP</em>' attribute.
	 * @see #getZ__internal_cache_islPWQP()
	 * @generated
	 */
	void setZ__internal_cache_islPWQP(JNIISLPWQPolynomial value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="alpha.model.JNIISLPWQPolynomial" unique="false"
	 * @generated
	 */
	JNIISLPWQPolynomial getISLPWQPolynomial();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model islQPDataType="alpha.model.JNIISLPWQPolynomial" islQPUnique="false"
	 * @generated
	 */
	void setISLPWQPolynomial(JNIISLPWQPolynomial islQP);

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
	 * @model visitorUnique="false"
	 * @generated
	 */
	void accept(CalculatorExpressionVisitor visitor);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="alpha.model.String" unique="false"
	 * @generated
	 */
	String plainToString();

} // JNIPolynomial
