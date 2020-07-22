/**
 */
package alpha.targetmapping;

import alpha.model.AlphaSystem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Target Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Top-Level for TargetMapping
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.targetmapping.TargetMapping#getTargetSystem <em>Target System</em>}</li>
 *   <li>{@link alpha.targetmapping.TargetMapping#getSystemBodyTMs <em>System Body TMs</em>}</li>
 * </ul>
 *
 * @see alpha.targetmapping.TargetmappingPackage#getTargetMapping()
 * @model
 * @generated
 */
public interface TargetMapping extends TargetMappingNode, TargetMappingVisitable, ScopingEntity {
	/**
	 * Returns the value of the '<em><b>Target System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target System</em>' reference.
	 * @see #setTargetSystem(AlphaSystem)
	 * @see alpha.targetmapping.TargetmappingPackage#getTargetMapping_TargetSystem()
	 * @model
	 * @generated
	 */
	AlphaSystem getTargetSystem();

	/**
	 * Sets the value of the '{@link alpha.targetmapping.TargetMapping#getTargetSystem <em>Target System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target System</em>' reference.
	 * @see #getTargetSystem()
	 * @generated
	 */
	void setTargetSystem(AlphaSystem value);

	/**
	 * Returns the value of the '<em><b>System Body TMs</b></em>' containment reference list.
	 * The list contents are of type {@link alpha.targetmapping.TargetMappingForSystemBody}.
	 * It is bidirectional and its opposite is '{@link alpha.targetmapping.TargetMappingForSystemBody#getTargetMapping <em>Target Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Body TMs</em>' containment reference list.
	 * @see alpha.targetmapping.TargetmappingPackage#getTargetMapping_SystemBodyTMs()
	 * @see alpha.targetmapping.TargetMappingForSystemBody#getTargetMapping
	 * @model opposite="targetMapping" containment="true"
	 * @generated
	 */
	EList<TargetMappingForSystemBody> getSystemBodyTMs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model visitorUnique="false"
	 * @generated
	 */
	void accept(TargetMappingVisitor visitor);

} // TargetMapping
