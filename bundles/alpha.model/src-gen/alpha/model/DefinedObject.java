/**
 */
package alpha.model;

import fr.irisa.cairn.jnimap.runtime.JNIObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Defined Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  Reference to an already defined object in the calculator section
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.model.DefinedObject#getObject <em>Object</em>}</li>
 *   <li>{@link alpha.model.DefinedObject#isZ__internalCycleDetector <em>Zinternal Cycle Detector</em>}</li>
 * </ul>
 *
 * @see alpha.model.ModelPackage#getDefinedObject()
 * @model
 * @generated
 */
public interface DefinedObject extends CalculatorExpression {
	/**
	 * Returns the value of the '<em><b>Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' reference.
	 * @see #setObject(PolyhedralObject)
	 * @see alpha.model.ModelPackage#getDefinedObject_Object()
	 * @model
	 * @generated
	 */
	PolyhedralObject getObject();

	/**
	 * Sets the value of the '{@link alpha.model.DefinedObject#getObject <em>Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' reference.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(PolyhedralObject value);

	/**
	 * Returns the value of the '<em><b>Zinternal Cycle Detector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zinternal Cycle Detector</em>' attribute.
	 * @see #setZ__internalCycleDetector(boolean)
	 * @see alpha.model.ModelPackage#getDefinedObject_Z__internalCycleDetector()
	 * @model unique="false"
	 * @generated
	 */
	boolean isZ__internalCycleDetector();

	/**
	 * Sets the value of the '{@link alpha.model.DefinedObject#isZ__internalCycleDetector <em>Zinternal Cycle Detector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zinternal Cycle Detector</em>' attribute.
	 * @see #isZ__internalCycleDetector()
	 * @generated
	 */
	void setZ__internalCycleDetector(boolean value);

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
	 * @model unique="false"
	 * @generated
	 */
	String plainToString();

} // DefinedObject
