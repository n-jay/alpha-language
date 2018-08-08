/**
 */
package alpha.model.matrix;

import fr.irisa.cairn.jnimap.isl.jni.JNIISLSpace;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Space</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.model.matrix.Space#getParamNames <em>Param Names</em>}</li>
 *   <li>{@link alpha.model.matrix.Space#getIndexNames <em>Index Names</em>}</li>
 * </ul>
 *
 * @see alpha.model.matrix.MatrixPackage#getSpace()
 * @model
 * @generated
 */
public interface Space extends EObject {
	/**
	 * Returns the value of the '<em><b>Param Names</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Param Names</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Param Names</em>' attribute list.
	 * @see alpha.model.matrix.MatrixPackage#getSpace_ParamNames()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getParamNames();

	/**
	 * Returns the value of the '<em><b>Index Names</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index Names</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index Names</em>' attribute list.
	 * @see alpha.model.matrix.MatrixPackage#getSpace_IndexNames()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getIndexNames();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return ((&lt;%java.lang.Object%&gt;[])org.eclipse.xtext.xbase.lib.Conversions.unwrapArray(this.getParamNames(), &lt;%java.lang.Object%&gt;.class)).length;'"
	 * @generated
	 */
	int getNbParams();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return ((&lt;%java.lang.Object%&gt;[])org.eclipse.xtext.xbase.lib.Conversions.unwrapArray(this.getIndexNames(), &lt;%java.lang.Object%&gt;.class)).length;'"
	 * @generated
	 */
	int getNbIndices();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * ISLSpace for creating Aff. For isl_aff, set space is expected.
	 * <!-- end-model-doc -->
	 * @model dataType="alpha.model.matrix.JNIISLSpace" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%fr.irisa.cairn.jnimap.isl.jni.JNIISLSpace%&gt; space = &lt;%fr.irisa.cairn.jnimap.isl.jni.JNIISLSpace%&gt;.allocSet(this.getNbParams(), this.getNbIndices());\nint _nbParams = this.getNbParams();\n&lt;%org.eclipse.xtext.xbase.lib.ExclusiveRange%&gt; _doubleDotLessThan = new &lt;%org.eclipse.xtext.xbase.lib.ExclusiveRange%&gt;(0, _nbParams, true);\nfor (final &lt;%java.lang.Integer%&gt; i : _doubleDotLessThan)\n{\n\tspace = space.setName(&lt;%fr.irisa.cairn.jnimap.isl.jni.JNIISLDimType%&gt;.isl_dim_param, (i).intValue(), this.getParamNames().get((i).intValue()));\n}\nint _nbIndices = this.getNbIndices();\n&lt;%org.eclipse.xtext.xbase.lib.ExclusiveRange%&gt; _doubleDotLessThan_1 = new &lt;%org.eclipse.xtext.xbase.lib.ExclusiveRange%&gt;(0, _nbIndices, true);\nfor (final &lt;%java.lang.Integer%&gt; i_1 : _doubleDotLessThan_1)\n{\n\tspace = space.setName(&lt;%fr.irisa.cairn.jnimap.isl.jni.JNIISLDimType%&gt;.isl_dim_set, (i_1).intValue(), this.getIndexNames().get((i_1).intValue()));\n}\nreturn space;'"
	 * @generated
	 */
	JNIISLSpace toJNIISLSetSpace();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * ISLSpace for creating MultiAff. For isl_multi_aff, map space is expected.
	 * <!-- end-model-doc -->
	 * @model dataType="alpha.model.matrix.JNIISLSpace" unique="false" nbExprsUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%fr.irisa.cairn.jnimap.isl.jni.JNIISLSpace%&gt; space = &lt;%fr.irisa.cairn.jnimap.isl.jni.JNIISLSpace%&gt;.alloc(this.getNbParams(), this.getNbIndices(), nbExprs);\nint _nbParams = this.getNbParams();\n&lt;%org.eclipse.xtext.xbase.lib.ExclusiveRange%&gt; _doubleDotLessThan = new &lt;%org.eclipse.xtext.xbase.lib.ExclusiveRange%&gt;(0, _nbParams, true);\nfor (final &lt;%java.lang.Integer%&gt; i : _doubleDotLessThan)\n{\n\tspace = space.setName(&lt;%fr.irisa.cairn.jnimap.isl.jni.JNIISLDimType%&gt;.isl_dim_param, (i).intValue(), this.getParamNames().get((i).intValue()));\n}\nint _nbIndices = this.getNbIndices();\n&lt;%org.eclipse.xtext.xbase.lib.ExclusiveRange%&gt; _doubleDotLessThan_1 = new &lt;%org.eclipse.xtext.xbase.lib.ExclusiveRange%&gt;(0, _nbIndices, true);\nfor (final &lt;%java.lang.Integer%&gt; i_1 : _doubleDotLessThan_1)\n{\n\tspace = space.setName(&lt;%fr.irisa.cairn.jnimap.isl.jni.JNIISLDimType%&gt;.isl_dim_out, (i_1).intValue(), this.getIndexNames().get((i_1).intValue()));\n}\nreturn space;'"
	 * @generated
	 */
	JNIISLSpace toJNIISLMultiAffSpace(int nbExprs);

} // Space
