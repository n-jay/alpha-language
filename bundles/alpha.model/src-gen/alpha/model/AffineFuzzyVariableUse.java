/**
 */
package alpha.model;

import fr.irisa.cairn.jnimap.isl.ISLMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Affine Fuzzy Variable Use</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.model.AffineFuzzyVariableUse#getUseFunction <em>Use Function</em>}</li>
 * </ul>
 *
 * @see alpha.model.ModelPackage#getAffineFuzzyVariableUse()
 * @model
 * @generated
 */
public interface AffineFuzzyVariableUse extends FuzzyVariableUse {
	/**
	 * Returns the value of the '<em><b>Use Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Function</em>' containment reference.
	 * @see #setUseFunction(JNIFunctionInArrayNotation)
	 * @see alpha.model.ModelPackage#getAffineFuzzyVariableUse_UseFunction()
	 * @model containment="true"
	 * @generated
	 */
	JNIFunctionInArrayNotation getUseFunction();

	/**
	 * Sets the value of the '{@link alpha.model.AffineFuzzyVariableUse#getUseFunction <em>Use Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Function</em>' containment reference.
	 * @see #getUseFunction()
	 * @generated
	 */
	void setUseFunction(JNIFunctionInArrayNotation value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="alpha.model.JNIISLMap" unique="false"
	 * @generated
	 */
	ISLMap getDependenceRelation();

} // AffineFuzzyVariableUse
