/**
 */
package alpha.model;

import fr.irisa.cairn.jnimap.isl.jni.JNIISLMap;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLSet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuzzy Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.model.FuzzyVariable#getRangeExpr <em>Range Expr</em>}</li>
 * </ul>
 *
 * @see alpha.model.ModelPackage#getFuzzyVariable()
 * @model
 * @generated
 */
public interface FuzzyVariable extends Variable {
	/**
	 * Returns the value of the '<em><b>Range Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Range Expr</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range Expr</em>' containment reference.
	 * @see #setRangeExpr(CalculatorExpression)
	 * @see alpha.model.ModelPackage#getFuzzyVariable_RangeExpr()
	 * @model containment="true"
	 * @generated
	 */
	CalculatorExpression getRangeExpr();

	/**
	 * Sets the value of the '{@link alpha.model.FuzzyVariable#getRangeExpr <em>Range Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range Expr</em>' containment reference.
	 * @see #getRangeExpr()
	 * @generated
	 */
	void setRangeExpr(CalculatorExpression value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="alpha.model.JNIISLSet" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%fr.irisa.cairn.jnimap.isl.jni.JNIISLSet%&gt; _xifexpression = null;\n&lt;%alpha.model.POLY_OBJECT_TYPE%&gt; _type = this.getRangeExpr().getType();\nboolean _notEquals = (!&lt;%com.google.common.base.Objects%&gt;.equal(_type, &lt;%alpha.model.POLY_OBJECT_TYPE%&gt;.SET));\nif (_notEquals)\n{\n\t_xifexpression = null;\n}\nelse\n{\n\t&lt;%fr.irisa.cairn.jnimap.runtime.JNIObject%&gt; _iSLObject = this.getRangeExpr().getISLObject();\n\t_xifexpression = ((&lt;%fr.irisa.cairn.jnimap.isl.jni.JNIISLSet%&gt;) _iSLObject);\n}\nreturn _xifexpression;'"
	 * @generated
	 */
	JNIISLSet getRange();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="alpha.model.JNIISLMap" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%fr.irisa.cairn.jnimap.isl.jni.JNIISLMap%&gt; _xblockexpression = null;\n{\n\tfinal &lt;%fr.irisa.cairn.jnimap.isl.jni.JNIISLSet%&gt; dom = this.getDomain();\n\tfinal &lt;%fr.irisa.cairn.jnimap.isl.jni.JNIISLSet%&gt; ran = this.getRange();\n\t&lt;%fr.irisa.cairn.jnimap.isl.jni.JNIISLMap%&gt; _xifexpression = null;\n\tif (((dom == null) || (ran == null)))\n\t{\n\t\t_xifexpression = null;\n\t}\n\telse\n\t{\n\t\t_xifexpression = dom.product(ran).unwrap();\n\t}\n\t_xblockexpression = _xifexpression;\n}\nreturn _xblockexpression;'"
	 * @generated
	 */
	JNIISLMap getRelation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model visitorUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='visitor.visitFuzzyVariable(this);'"
	 * @generated
	 */
	void accept(AlphaVisitor visitor);

} // FuzzyVariable
