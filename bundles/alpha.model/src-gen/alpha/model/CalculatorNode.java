/**
 */
package alpha.model;

import fr.irisa.cairn.jnimap.runtime.JNIObject;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Calculator Node</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see alpha.model.ModelPackage#getCalculatorNode()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface CalculatorNode extends EObject {
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

} // CalculatorNode
