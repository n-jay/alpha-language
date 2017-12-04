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
 *
 * @see alpha.model.ModelPackage#getFuzzyVariable()
 * @model
 * @generated
 */
public interface FuzzyVariable extends Variable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="alpha.model.JNIISLSet" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%alpha.model.POLY_OBJECT_TYPE%&gt; _type = this.getDomainExpr().getType();\nboolean _notEquals = (!&lt;%com.google.common.base.Objects%&gt;.equal(_type, &lt;%alpha.model.POLY_OBJECT_TYPE%&gt;.MAP));\nif (_notEquals)\n{\n\treturn null;\n}\n&lt;%fr.irisa.cairn.jnimap.runtime.JNIObject%&gt; _iSLObject = this.getDomainExpr().getISLObject();\nreturn ((&lt;%fr.irisa.cairn.jnimap.isl.jni.JNIISLMap%&gt;) _iSLObject).copy().domain();'"
	 * @generated
	 */
	JNIISLSet getDomain();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="alpha.model.JNIISLMap" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%alpha.model.POLY_OBJECT_TYPE%&gt; _type = this.getDomainExpr().getType();\nboolean _notEquals = (!&lt;%com.google.common.base.Objects%&gt;.equal(_type, &lt;%alpha.model.POLY_OBJECT_TYPE%&gt;.MAP));\nif (_notEquals)\n{\n\treturn null;\n}\n&lt;%fr.irisa.cairn.jnimap.runtime.JNIObject%&gt; _iSLObject = this.getDomainExpr().getISLObject();\nreturn ((&lt;%fr.irisa.cairn.jnimap.isl.jni.JNIISLMap%&gt;) _iSLObject);'"
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
