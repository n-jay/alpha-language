/**
 */
package alpha.model;

import fr.irisa.cairn.jnimap.isl.jni.JNIISLSet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alpha System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.model.AlphaSystem#getName <em>Name</em>}</li>
 *   <li>{@link alpha.model.AlphaSystem#getParameterDomainExpr <em>Parameter Domain Expr</em>}</li>
 *   <li>{@link alpha.model.AlphaSystem#getDefinedObjects <em>Defined Objects</em>}</li>
 *   <li>{@link alpha.model.AlphaSystem#getInputs <em>Inputs</em>}</li>
 *   <li>{@link alpha.model.AlphaSystem#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link alpha.model.AlphaSystem#getLocals <em>Locals</em>}</li>
 *   <li>{@link alpha.model.AlphaSystem#getWhileDomainExpr <em>While Domain Expr</em>}</li>
 *   <li>{@link alpha.model.AlphaSystem#getTestExpression <em>Test Expression</em>}</li>
 *   <li>{@link alpha.model.AlphaSystem#getSystemBodies <em>System Bodies</em>}</li>
 * </ul>
 *
 * @see alpha.model.ModelPackage#getAlphaSystem()
 * @model
 * @generated
 */
public interface AlphaSystem extends AlphaElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see alpha.model.ModelPackage#getAlphaSystem_Name()
	 * @model unique="false" dataType="alpha.model.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link alpha.model.AlphaSystem#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Parameter Domain Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Domain Expr</em>' containment reference.
	 * @see #setParameterDomainExpr(JNIDomain)
	 * @see alpha.model.ModelPackage#getAlphaSystem_ParameterDomainExpr()
	 * @model containment="true"
	 * @generated
	 */
	JNIDomain getParameterDomainExpr();

	/**
	 * Sets the value of the '{@link alpha.model.AlphaSystem#getParameterDomainExpr <em>Parameter Domain Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Domain Expr</em>' containment reference.
	 * @see #getParameterDomainExpr()
	 * @generated
	 */
	void setParameterDomainExpr(JNIDomain value);

	/**
	 * Returns the value of the '<em><b>Defined Objects</b></em>' containment reference list.
	 * The list contents are of type {@link alpha.model.PolyhedralObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defined Objects</em>' containment reference list.
	 * @see alpha.model.ModelPackage#getAlphaSystem_DefinedObjects()
	 * @model containment="true"
	 * @generated
	 */
	EList<PolyhedralObject> getDefinedObjects();

	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' containment reference list.
	 * The list contents are of type {@link alpha.model.Variable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' containment reference list.
	 * @see alpha.model.ModelPackage#getAlphaSystem_Inputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getInputs();

	/**
	 * Returns the value of the '<em><b>Outputs</b></em>' containment reference list.
	 * The list contents are of type {@link alpha.model.Variable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputs</em>' containment reference list.
	 * @see alpha.model.ModelPackage#getAlphaSystem_Outputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getOutputs();

	/**
	 * Returns the value of the '<em><b>Locals</b></em>' containment reference list.
	 * The list contents are of type {@link alpha.model.Variable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locals</em>' containment reference list.
	 * @see alpha.model.ModelPackage#getAlphaSystem_Locals()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getLocals();

	/**
	 * Returns the value of the '<em><b>While Domain Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>While Domain Expr</em>' containment reference.
	 * @see #setWhileDomainExpr(CalculatorExpression)
	 * @see alpha.model.ModelPackage#getAlphaSystem_WhileDomainExpr()
	 * @model containment="true"
	 * @generated
	 */
	CalculatorExpression getWhileDomainExpr();

	/**
	 * Sets the value of the '{@link alpha.model.AlphaSystem#getWhileDomainExpr <em>While Domain Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>While Domain Expr</em>' containment reference.
	 * @see #getWhileDomainExpr()
	 * @generated
	 */
	void setWhileDomainExpr(CalculatorExpression value);

	/**
	 * Returns the value of the '<em><b>Test Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Expression</em>' containment reference.
	 * @see #setTestExpression(AlphaExpression)
	 * @see alpha.model.ModelPackage#getAlphaSystem_TestExpression()
	 * @model containment="true"
	 * @generated
	 */
	AlphaExpression getTestExpression();

	/**
	 * Sets the value of the '{@link alpha.model.AlphaSystem#getTestExpression <em>Test Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test Expression</em>' containment reference.
	 * @see #getTestExpression()
	 * @generated
	 */
	void setTestExpression(AlphaExpression value);

	/**
	 * Returns the value of the '<em><b>System Bodies</b></em>' containment reference list.
	 * The list contents are of type {@link alpha.model.SystemBody}.
	 * It is bidirectional and its opposite is '{@link alpha.model.SystemBody#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Bodies</em>' containment reference list.
	 * @see alpha.model.ModelPackage#getAlphaSystem_SystemBodies()
	 * @see alpha.model.SystemBody#getSystem
	 * @model opposite="system" containment="true"
	 * @generated
	 */
	EList<SystemBody> getSystemBodies();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	EList<Variable> getVariables();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="alpha.model.JNIISLSet" unique="false"
	 * @generated
	 */
	JNIISLSet getParameterDomain();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="alpha.model.JNIISLSet" unique="false"
	 * @generated
	 */
	JNIISLSet getWhileDomain();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" varNameDataType="alpha.model.String" varNameUnique="false"
	 * @generated
	 */
	Variable getVariable(String varName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="alpha.model.String" unique="false"
	 * @generated
	 */
	String getFullyQualifiedName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model visitorUnique="false"
	 * @generated
	 */
	void accept(AlphaVisitor visitor);

} // AlphaSystem
