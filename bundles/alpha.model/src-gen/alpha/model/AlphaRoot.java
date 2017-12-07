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
 *   <li>{@link alpha.model.AlphaRoot#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see alpha.model.ModelPackage#getAlphaRoot()
 * @model
 * @generated
 */
public interface AlphaRoot extends AlphaVisitable {
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return &lt;%org.eclipse.emf.common.util.ECollections%&gt;.&lt;&lt;%alpha.model.Imports%&gt;&gt;asEList(((&lt;%alpha.model.Imports%&gt;[])org.eclipse.xtext.xbase.lib.Conversions.unwrapArray(&lt;%com.google.common.collect.Iterables%&gt;.&lt;&lt;%alpha.model.Imports%&gt;&gt;filter(this.getElements(), &lt;%alpha.model.Imports%&gt;.class), &lt;%alpha.model.Imports%&gt;.class)));'"
	 * @generated
	 */
	EList<Imports> getImports();

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
	 * @model visitorUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='visitor.visitAlphaRoot(this);'"
	 * @generated
	 */
	void accept(AlphaVisitor visitor);

} // AlphaRoot
