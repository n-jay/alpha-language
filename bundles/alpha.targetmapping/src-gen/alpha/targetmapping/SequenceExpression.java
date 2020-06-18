/**
 */
package alpha.targetmapping;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.targetmapping.SequenceExpression#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @see alpha.targetmapping.TargetmappingPackage#getSequenceExpression()
 * @model
 * @generated
 */
public interface SequenceExpression extends ScheduleTreeExpression {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link alpha.targetmapping.ScheduleTreeExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see alpha.targetmapping.TargetmappingPackage#getSequenceExpression_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<ScheduleTreeExpression> getChildren();

} // SequenceExpression
