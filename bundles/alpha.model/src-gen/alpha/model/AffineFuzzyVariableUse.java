/**
 */
package alpha.model;

import fr.irisa.cairn.jnimap.isl.jni.JNIISLMap;

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
	 * <p>
	 * If the meaning of the '<em>Use Function</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%fr.irisa.cairn.jnimap.isl.jni.JNIISLMap%&gt; _xifexpression = null;\nif ((((this.getUseFunction() != null) &amp;&amp; (this.getFuzzyVariable() != null)) &amp;&amp; (this.getFuzzyVariable().getRelation() != null)))\n{\n\t_xifexpression = this.getUseFunction().getISLMultiAff().toMap().applyRange(this.getFuzzyVariable().getRelation());\n}\nelse\n{\n\t_xifexpression = null;\n}\nreturn _xifexpression;'"
	 * @generated
	 */
	JNIISLMap getDependenceRelation();

} // AffineFuzzyVariableUse
