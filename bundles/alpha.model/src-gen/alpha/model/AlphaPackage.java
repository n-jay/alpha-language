/**
 */
package alpha.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alpha Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.model.AlphaPackage#getName <em>Name</em>}</li>
 *   <li>{@link alpha.model.AlphaPackage#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see alpha.model.ModelPackage#getAlphaPackage()
 * @model
 * @generated
 */
public interface AlphaPackage extends AlphaElement {
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
	 * @see alpha.model.ModelPackage#getAlphaPackage_Name()
	 * @model unique="false" id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link alpha.model.AlphaPackage#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see alpha.model.ModelPackage#getAlphaPackage_Elements()
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
	 * @model visitorUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='visitor.visitAlphaPackage(this);'"
	 * @generated
	 */
	void accept(AlphaVisitor visitor);

} // AlphaPackage
