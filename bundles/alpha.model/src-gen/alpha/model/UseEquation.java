/**
 */
package alpha.model;

import fr.irisa.cairn.jnimap.isl.jni.JNIISLSet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Use Equation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.model.UseEquation#getSystem <em>System</em>}</li>
 *   <li>{@link alpha.model.UseEquation#getInstantiationDomainExpr <em>Instantiation Domain Expr</em>}</li>
 *   <li>{@link alpha.model.UseEquation#getCallParams <em>Call Params</em>}</li>
 *   <li>{@link alpha.model.UseEquation#getSubsystemDims <em>Subsystem Dims</em>}</li>
 *   <li>{@link alpha.model.UseEquation#getInputExprs <em>Input Exprs</em>}</li>
 *   <li>{@link alpha.model.UseEquation#getOutputExprs <em>Output Exprs</em>}</li>
 * </ul>
 *
 * @see alpha.model.ModelPackage#getUseEquation()
 * @model
 * @generated
 */
public interface UseEquation extends AlphaVisitable {
	/**
	 * Returns the value of the '<em><b>System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System</em>' reference.
	 * @see #setSystem(AlphaSystem)
	 * @see alpha.model.ModelPackage#getUseEquation_System()
	 * @model
	 * @generated
	 */
	AlphaSystem getSystem();

	/**
	 * Sets the value of the '{@link alpha.model.UseEquation#getSystem <em>System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System</em>' reference.
	 * @see #getSystem()
	 * @generated
	 */
	void setSystem(AlphaSystem value);

	/**
	 * Returns the value of the '<em><b>Instantiation Domain Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instantiation Domain Expr</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instantiation Domain Expr</em>' containment reference.
	 * @see #setInstantiationDomainExpr(CalculatorExpression)
	 * @see alpha.model.ModelPackage#getUseEquation_InstantiationDomainExpr()
	 * @model containment="true"
	 * @generated
	 */
	CalculatorExpression getInstantiationDomainExpr();

	/**
	 * Sets the value of the '{@link alpha.model.UseEquation#getInstantiationDomainExpr <em>Instantiation Domain Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instantiation Domain Expr</em>' containment reference.
	 * @see #getInstantiationDomainExpr()
	 * @generated
	 */
	void setInstantiationDomainExpr(CalculatorExpression value);

	/**
	 * Returns the value of the '<em><b>Call Params</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Call Params</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Call Params</em>' containment reference.
	 * @see #setCallParams(JNIFunctionInArrayNotation)
	 * @see alpha.model.ModelPackage#getUseEquation_CallParams()
	 * @model containment="true"
	 * @generated
	 */
	JNIFunctionInArrayNotation getCallParams();

	/**
	 * Sets the value of the '{@link alpha.model.UseEquation#getCallParams <em>Call Params</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Call Params</em>' containment reference.
	 * @see #getCallParams()
	 * @generated
	 */
	void setCallParams(JNIFunctionInArrayNotation value);

	/**
	 * Returns the value of the '<em><b>Subsystem Dims</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subsystem Dims</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subsystem Dims</em>' attribute list.
	 * @see alpha.model.ModelPackage#getUseEquation_SubsystemDims()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getSubsystemDims();

	/**
	 * Returns the value of the '<em><b>Input Exprs</b></em>' containment reference list.
	 * The list contents are of type {@link alpha.model.AlphaExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Exprs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Exprs</em>' containment reference list.
	 * @see alpha.model.ModelPackage#getUseEquation_InputExprs()
	 * @model containment="true"
	 * @generated
	 */
	EList<AlphaExpression> getInputExprs();

	/**
	 * Returns the value of the '<em><b>Output Exprs</b></em>' containment reference list.
	 * The list contents are of type {@link alpha.model.AlphaExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Exprs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Exprs</em>' containment reference list.
	 * @see alpha.model.ModelPackage#getUseEquation_OutputExprs()
	 * @model containment="true"
	 * @generated
	 */
	EList<AlphaExpression> getOutputExprs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="alpha.model.JNIISLSet" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='if ((((this.getInstantiationDomainExpr() != null) &amp;&amp; &lt;%com.google.common.base.Objects%&gt;.equal(this.getInstantiationDomainExpr().getType(), &lt;%alpha.model.POLY_OBJECT_TYPE%&gt;.SET)) &amp;&amp; (this.getInstantiationDomainExpr().getISLObject() != null)))\n{\n\t&lt;%fr.irisa.cairn.jnimap.runtime.JNIObject%&gt; _iSLObject = this.getInstantiationDomainExpr().getISLObject();\n\treturn ((&lt;%fr.irisa.cairn.jnimap.isl.jni.JNIISLSet%&gt;) _iSLObject);\n}\nreturn null;'"
	 * @generated
	 */
	JNIISLSet getInstantiationDomain();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model visitorUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='visitor.visitUseEquation(this);'"
	 * @generated
	 */
	void accept(AlphaVisitor visitor);

} // UseEquation
