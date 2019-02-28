/**
 */
package alpha.model.matrix;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Row</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.model.matrix.MatrixRow#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see alpha.model.matrix.MatrixPackage#getMatrixRow()
 * @model
 * @generated
 */
public interface MatrixRow extends EObject {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Long}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' attribute list.
	 * @see alpha.model.matrix.MatrixPackage#getMatrixRow_Values()
	 * @model unique="false"
	 * @generated
	 */
	EList<Long> getValues();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" cUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (this.getValues().get(c)).longValue();'"
	 * @generated
	 */
	long getValue(int c);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model cUnique="false" vUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='this.getValues().set(c, &lt;%java.lang.Long%&gt;.valueOf(v));'"
	 * @generated
	 */
	void setValue(int c, long v);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final &lt;%org.eclipse.xtext.xbase.lib.Functions.Function1%&gt;&lt;&lt;%java.lang.Long%&gt;, &lt;%java.lang.CharSequence%&gt;&gt; _function = new &lt;%org.eclipse.xtext.xbase.lib.Functions.Function1%&gt;&lt;&lt;%java.lang.Long%&gt;, &lt;%java.lang.CharSequence%&gt;&gt;()\n{\n\tpublic &lt;%java.lang.CharSequence%&gt; apply(final &lt;%java.lang.Long%&gt; v)\n\t{\n\t\treturn v.toString();\n\t}\n};\nreturn &lt;%org.eclipse.xtext.xbase.lib.IterableExtensions%&gt;.&lt;&lt;%java.lang.Long%&gt;&gt;join(this.getValues(), \"[ \", \" \", \" ]\", _function);'"
	 * @generated
	 */
	String toString();

} // MatrixRow
