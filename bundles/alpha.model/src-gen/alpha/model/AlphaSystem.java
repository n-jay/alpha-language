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
 *   <li>{@link alpha.model.AlphaSystem#getFuzzyVariables <em>Fuzzy Variables</em>}</li>
 *   <li>{@link alpha.model.AlphaSystem#getWhileDomainExpr <em>While Domain Expr</em>}</li>
 *   <li>{@link alpha.model.AlphaSystem#getTestExpression <em>Test Expression</em>}</li>
 *   <li>{@link alpha.model.AlphaSystem#getUseEquations <em>Use Equations</em>}</li>
 *   <li>{@link alpha.model.AlphaSystem#getEquations <em>Equations</em>}</li>
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
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see alpha.model.ModelPackage#getAlphaSystem_Name()
	 * @model unique="false"
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
	 * <p>
	 * If the meaning of the '<em>Parameter Domain Expr</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
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
	 * <p>
	 * If the meaning of the '<em>Defined Objects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defined Objects</em>' containment reference list.
	 * @see alpha.model.ModelPackage#getAlphaSystem_DefinedObjects()
	 * @model containment="true"
	 * @generated
	 */
	EList<PolyhedralObject> getDefinedObjects();

	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' containment reference list.
	 * The list contents are of type {@link alpha.model.InputVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inputs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' containment reference list.
	 * @see alpha.model.ModelPackage#getAlphaSystem_Inputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<InputVariable> getInputs();

	/**
	 * Returns the value of the '<em><b>Outputs</b></em>' containment reference list.
	 * The list contents are of type {@link alpha.model.OutputVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outputs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputs</em>' containment reference list.
	 * @see alpha.model.ModelPackage#getAlphaSystem_Outputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<OutputVariable> getOutputs();

	/**
	 * Returns the value of the '<em><b>Locals</b></em>' containment reference list.
	 * The list contents are of type {@link alpha.model.LocalVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locals</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locals</em>' containment reference list.
	 * @see alpha.model.ModelPackage#getAlphaSystem_Locals()
	 * @model containment="true"
	 * @generated
	 */
	EList<LocalVariable> getLocals();

	/**
	 * Returns the value of the '<em><b>Fuzzy Variables</b></em>' containment reference list.
	 * The list contents are of type {@link alpha.model.FuzzyVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fuzzy Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fuzzy Variables</em>' containment reference list.
	 * @see alpha.model.ModelPackage#getAlphaSystem_FuzzyVariables()
	 * @model containment="true"
	 * @generated
	 */
	EList<FuzzyVariable> getFuzzyVariables();

	/**
	 * Returns the value of the '<em><b>While Domain Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>While Domain Expr</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
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
	 * <p>
	 * If the meaning of the '<em>Test Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
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
	 * Returns the value of the '<em><b>Use Equations</b></em>' containment reference list.
	 * The list contents are of type {@link alpha.model.UseEquation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Equations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Equations</em>' containment reference list.
	 * @see alpha.model.ModelPackage#getAlphaSystem_UseEquations()
	 * @model containment="true"
	 * @generated
	 */
	EList<UseEquation> getUseEquations();

	/**
	 * Returns the value of the '<em><b>Equations</b></em>' containment reference list.
	 * The list contents are of type {@link alpha.model.StandardEquation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Equations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equations</em>' containment reference list.
	 * @see alpha.model.ModelPackage#getAlphaSystem_Equations()
	 * @model containment="true"
	 * @generated
	 */
	EList<StandardEquation> getEquations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%alpha.model.InputVariable%&gt;&gt; _inputs = this.getInputs();\n&lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%alpha.model.OutputVariable%&gt;&gt; _outputs = this.getOutputs();\n&lt;%java.lang.Iterable%&gt;&lt;&lt;%alpha.model.Variable%&gt;&gt; _plus = &lt;%com.google.common.collect.Iterables%&gt;.&lt;&lt;%alpha.model.Variable%&gt;&gt;concat(_inputs, _outputs);\n&lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%alpha.model.LocalVariable%&gt;&gt; _locals = this.getLocals();\nreturn &lt;%org.eclipse.emf.common.util.ECollections%&gt;.&lt;&lt;%alpha.model.Variable%&gt;&gt;unmodifiableEList(&lt;%org.eclipse.emf.common.util.ECollections%&gt;.&lt;&lt;%alpha.model.Variable%&gt;&gt;asEList(((&lt;%alpha.model.Variable%&gt;[])org.eclipse.xtext.xbase.lib.Conversions.unwrapArray(&lt;%com.google.common.collect.Iterables%&gt;.&lt;&lt;%alpha.model.Variable%&gt;&gt;concat(_plus, _locals), &lt;%alpha.model.Variable%&gt;.class))));'"
	 * @generated
	 */
	EList<Variable> getVariables();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model visitorUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='visitor.visitAlphaSystem(this);'"
	 * @generated
	 */
	void accept(AlphaVisitor visitor);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="alpha.model.JNIISLSet" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getParameterDomainExpr().getISLSet();'"
	 * @generated
	 */
	JNIISLSet getParameterDomain();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="alpha.model.JNIISLSet" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%fr.irisa.cairn.jnimap.isl.jni.JNIISLSet%&gt; _xifexpression = null;\nif (((this.getWhileDomainExpr() == null) || (!&lt;%com.google.common.base.Objects%&gt;.equal(this.getWhileDomainExpr().getType(), &lt;%alpha.model.POLY_OBJECT_TYPE%&gt;.SET))))\n{\n\t_xifexpression = null;\n}\nelse\n{\n\t&lt;%fr.irisa.cairn.jnimap.runtime.JNIObject%&gt; _iSLObject = this.getWhileDomainExpr().getISLObject();\n\t_xifexpression = ((&lt;%fr.irisa.cairn.jnimap.isl.jni.JNIISLSet%&gt;) _iSLObject).copy();\n}\nreturn _xifexpression;'"
	 * @generated
	 */
	JNIISLSet getWhileDomain();

} // AlphaSystem
