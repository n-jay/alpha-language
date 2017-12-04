/**
 */
package alpha.model;

import fr.irisa.cairn.jnimap.runtime.JNIObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  VariableDomain refers to the domain of declared variables
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.model.VariableDomain#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @see alpha.model.ModelPackage#getVariableDomain()
 * @model
 * @generated
 */
public interface VariableDomain extends CalculatorExpression {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' reference.
	 * @see #setVariable(Variable)
	 * @see alpha.model.ModelPackage#getVariableDomain_Variable()
	 * @model
	 * @generated
	 */
	Variable getVariable();

	/**
	 * Sets the value of the '{@link alpha.model.VariableDomain#getVariable <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(Variable value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return &lt;%alpha.model.POLY_OBJECT_TYPE%&gt;.SET;'"
	 * @generated
	 */
	POLY_OBJECT_TYPE getType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="alpha.model.JNIObject" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%fr.irisa.cairn.jnimap.isl.jni.JNIISLSet%&gt; _xifexpression = null;\n&lt;%alpha.model.Variable%&gt; _variable = this.getVariable();\nboolean _tripleNotEquals = (_variable != null);\nif (_tripleNotEquals)\n{\n\t_xifexpression = this.getVariable().getDomain();\n}\nelse\n{\n\t_xifexpression = null;\n}\nreturn _xifexpression;'"
	 * @generated
	 */
	JNIObject getISLObject();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model visitorUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='visitor.visitVariableDomain(this);'"
	 * @generated
	 */
	void accept(CalculatorExpressionVisitor visitor);

} // VariableDomain
