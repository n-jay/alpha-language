/**
 */
package alpha.targetmapping;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extension Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.targetmapping.ExtensionExpression#getExtensionTargets <em>Extension Targets</em>}</li>
 *   <li>{@link alpha.targetmapping.ExtensionExpression#getChild <em>Child</em>}</li>
 * </ul>
 *
 * @see alpha.targetmapping.TargetmappingPackage#getExtensionExpression()
 * @model
 * @generated
 */
public interface ExtensionExpression extends ScheduleTreeExpression, ScopingEntity {
	/**
	 * Returns the value of the '<em><b>Extension Targets</b></em>' containment reference list.
	 * The list contents are of type {@link alpha.targetmapping.ExtensionTarget}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension Targets</em>' containment reference list.
	 * @see alpha.targetmapping.TargetmappingPackage#getExtensionExpression_ExtensionTargets()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExtensionTarget> getExtensionTargets();

	/**
	 * Returns the value of the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child</em>' containment reference.
	 * @see #setChild(ScheduleTreeExpression)
	 * @see alpha.targetmapping.TargetmappingPackage#getExtensionExpression_Child()
	 * @model containment="true"
	 * @generated
	 */
	ScheduleTreeExpression getChild();

	/**
	 * Sets the value of the '{@link alpha.targetmapping.ExtensionExpression#getChild <em>Child</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child</em>' containment reference.
	 * @see #getChild()
	 * @generated
	 */
	void setChild(ScheduleTreeExpression value);

} // ExtensionExpression
