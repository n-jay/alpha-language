/**
 */
package alpha.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alpha Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.model.AlphaRoot#getImports <em>Imports</em>}</li>
 *   <li>{@link alpha.model.AlphaRoot#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see alpha.model.ModelPackage#getAlphaRoot()
 * @model
 * @generated
 */
public interface AlphaRoot extends AlphaVisitable {
	/**
	 * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
	 * The list contents are of type {@link alpha.model.Imports}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' containment reference list.
	 * @see alpha.model.ModelPackage#getAlphaRoot_Imports()
	 * @model containment="true"
	 * @generated
	 */
	EList<Imports> getImports();

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link alpha.model.AlphaElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see alpha.model.ModelPackage#getAlphaRoot_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<AlphaElement> getElements();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return &lt;%org.eclipse.emf.common.util.ECollections%&gt;.&lt;&lt;%alpha.model.AlphaConstant%&gt;&gt;asEList(((&lt;%alpha.model.AlphaConstant%&gt;[])org.eclipse.xtext.xbase.lib.Conversions.unwrapArray(&lt;%com.google.common.collect.Iterables%&gt;.&lt;&lt;%alpha.model.AlphaConstant%&gt;&gt;filter(this.getElements(), &lt;%alpha.model.AlphaConstant%&gt;.class), &lt;%alpha.model.AlphaConstant%&gt;.class)));'"
	 * @generated
	 */
	EList<AlphaConstant> getConstants();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return &lt;%org.eclipse.emf.common.util.ECollections%&gt;.&lt;&lt;%alpha.model.ExternalFunction%&gt;&gt;asEList(((&lt;%alpha.model.ExternalFunction%&gt;[])org.eclipse.xtext.xbase.lib.Conversions.unwrapArray(&lt;%com.google.common.collect.Iterables%&gt;.&lt;&lt;%alpha.model.ExternalFunction%&gt;&gt;filter(this.getElements(), &lt;%alpha.model.ExternalFunction%&gt;.class), &lt;%alpha.model.ExternalFunction%&gt;.class)));'"
	 * @generated
	 */
	EList<ExternalFunction> getExternalFunctions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return &lt;%org.eclipse.emf.common.util.ECollections%&gt;.&lt;&lt;%alpha.model.AlphaPackage%&gt;&gt;asEList(((&lt;%alpha.model.AlphaPackage%&gt;[])org.eclipse.xtext.xbase.lib.Conversions.unwrapArray(&lt;%com.google.common.collect.Iterables%&gt;.&lt;&lt;%alpha.model.AlphaPackage%&gt;&gt;filter(this.getElements(), &lt;%alpha.model.AlphaPackage%&gt;.class), &lt;%alpha.model.AlphaPackage%&gt;.class)));'"
	 * @generated
	 */
	EList<AlphaPackage> getPackages();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return &lt;%org.eclipse.emf.common.util.ECollections%&gt;.&lt;&lt;%alpha.model.AlphaSystem%&gt;&gt;asEList(((&lt;%alpha.model.AlphaSystem%&gt;[])org.eclipse.xtext.xbase.lib.Conversions.unwrapArray(&lt;%com.google.common.collect.Iterables%&gt;.&lt;&lt;%alpha.model.AlphaSystem%&gt;&gt;filter(this.getElements(), &lt;%alpha.model.AlphaSystem%&gt;.class), &lt;%alpha.model.AlphaSystem%&gt;.class)));'"
	 * @generated
	 */
	EList<AlphaSystem> getSystems();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" nameUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='boolean _contains = name.contains(\".\");\nif (_contains)\n{\n\tfinal &lt;%org.eclipse.xtext.naming.IQualifiedNameProvider%&gt; provider = new &lt;%org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider%&gt;();\n\tfinal &lt;%org.eclipse.xtext.xbase.lib.Functions.Function1%&gt;&lt;&lt;%alpha.model.AlphaSystem%&gt;, &lt;%java.lang.Boolean%&gt;&gt; _function = new &lt;%org.eclipse.xtext.xbase.lib.Functions.Function1%&gt;&lt;&lt;%alpha.model.AlphaSystem%&gt;, &lt;%java.lang.Boolean%&gt;&gt;()\n\t{\n\t\tpublic &lt;%java.lang.Boolean%&gt; apply(final &lt;%alpha.model.AlphaSystem%&gt; s)\n\t\t{\n\t\t\treturn &lt;%java.lang.Boolean%&gt;.valueOf(provider.getFullyQualifiedName(s).toString().contentEquals(name));\n\t\t}\n\t};\n\tfinal &lt;%java.util.Iterator%&gt;&lt;&lt;%alpha.model.AlphaSystem%&gt;&gt; matching = &lt;%org.eclipse.xtext.xbase.lib.IteratorExtensions%&gt;.&lt;&lt;%alpha.model.AlphaSystem%&gt;&gt;filter(&lt;%com.google.common.collect.Iterators%&gt;.&lt;&lt;%alpha.model.AlphaSystem%&gt;&gt;filter(this.eAllContents(), &lt;%alpha.model.AlphaSystem%&gt;.class), _function);\n\tint _size = &lt;%org.eclipse.xtext.xbase.lib.IteratorExtensions%&gt;.size(matching);\n\tboolean _greaterThan = (_size &gt; 0);\n\tif (_greaterThan)\n\t{\n\t\treturn &lt;%org.eclipse.xtext.xbase.lib.IteratorExtensions%&gt;.&lt;&lt;%alpha.model.AlphaSystem%&gt;&gt;head(matching);\n\t}\n}\nelse\n{\n\tfinal &lt;%org.eclipse.xtext.xbase.lib.Functions.Function1%&gt;&lt;&lt;%alpha.model.AlphaSystem%&gt;, &lt;%java.lang.Boolean%&gt;&gt; _function_1 = new &lt;%org.eclipse.xtext.xbase.lib.Functions.Function1%&gt;&lt;&lt;%alpha.model.AlphaSystem%&gt;, &lt;%java.lang.Boolean%&gt;&gt;()\n\t{\n\t\tpublic &lt;%java.lang.Boolean%&gt; apply(final &lt;%alpha.model.AlphaSystem%&gt; s)\n\t\t{\n\t\t\treturn &lt;%java.lang.Boolean%&gt;.valueOf(s.getName().contentEquals(name));\n\t\t}\n\t};\n\tfinal &lt;%java.util.Iterator%&gt;&lt;&lt;%alpha.model.AlphaSystem%&gt;&gt; matching_1 = &lt;%org.eclipse.xtext.xbase.lib.IteratorExtensions%&gt;.&lt;&lt;%alpha.model.AlphaSystem%&gt;&gt;filter(&lt;%com.google.common.collect.Iterators%&gt;.&lt;&lt;%alpha.model.AlphaSystem%&gt;&gt;filter(this.eAllContents(), &lt;%alpha.model.AlphaSystem%&gt;.class), _function_1);\n\tint _size_1 = &lt;%org.eclipse.xtext.xbase.lib.IteratorExtensions%&gt;.size(matching_1);\n\tboolean _greaterThan_1 = (_size_1 &gt; 0);\n\tif (_greaterThan_1)\n\t{\n\t\treturn &lt;%org.eclipse.xtext.xbase.lib.IteratorExtensions%&gt;.&lt;&lt;%alpha.model.AlphaSystem%&gt;&gt;head(matching_1);\n\t}\n}\nthrow new &lt;%java.lang.RuntimeException%&gt;(((\"System \" + name) + \" was not found.\"));'"
	 * @generated
	 */
	AlphaSystem getSystem(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model visitorUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='visitor.visitAlphaRoot(this);'"
	 * @generated
	 */
	void accept(AlphaVisitor visitor);

} // AlphaRoot
