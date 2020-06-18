/**
 */
package alpha.targetmapping;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Memory Space</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.targetmapping.MemorySpace#getName <em>Name</em>}</li>
 *   <li>{@link alpha.targetmapping.MemorySpace#getMemoryMaps <em>Memory Maps</em>}</li>
 * </ul>
 *
 * @see alpha.targetmapping.TargetmappingPackage#getMemorySpace()
 * @model
 * @generated
 */
public interface MemorySpace extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see alpha.targetmapping.TargetmappingPackage#getMemorySpace_Name()
	 * @model unique="false" id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link alpha.targetmapping.MemorySpace#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Memory Maps</b></em>' containment reference list.
	 * The list contents are of type {@link alpha.targetmapping.MemoryMapping}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory Maps</em>' containment reference list.
	 * @see alpha.targetmapping.TargetmappingPackage#getMemorySpace_MemoryMaps()
	 * @model containment="true"
	 * @generated
	 */
	EList<MemoryMapping> getMemoryMaps();

} // MemorySpace
