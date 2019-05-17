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
public interface AlphaRoot extends AlphaNode, AlphaVisitable {
	/**
	 * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
	 * The list contents are of type {@link alpha.model.Imports}.
	 * <!-- begin-user-doc -->
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
	 * @generated
	 */
	EList<AlphaConstant> getConstants();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	EList<ExternalFunction> getExternalFunctions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	EList<AlphaPackage> getPackages();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	EList<AlphaSystem> getSystems();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" nameUnique="false"
	 * @generated
	 */
	AlphaSystem getSystem(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model visitorUnique="false"
	 * @generated
	 */
	void accept(AlphaVisitor visitor);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" nodeIDUnique="false" nodeIDMany="true"
	 * @generated
	 */
	AlphaNode getNode(EList<Integer> nodeID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" nodeIDUnique="false"
	 * @generated
	 */
	AlphaNode getNode(String nodeID);

} // AlphaRoot
