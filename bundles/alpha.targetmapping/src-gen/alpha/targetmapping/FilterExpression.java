/**
 */
package alpha.targetmapping;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filter Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.targetmapping.FilterExpression#getFilterDomains <em>Filter Domains</em>}</li>
 *   <li>{@link alpha.targetmapping.FilterExpression#getChild <em>Child</em>}</li>
 * </ul>
 *
 * @see alpha.targetmapping.TargetmappingPackage#getFilterExpression()
 * @model
 * @generated
 */
public interface FilterExpression extends ScheduleTreeExpression, ScopingEntity {
	/**
	 * Returns the value of the '<em><b>Filter Domains</b></em>' containment reference list.
	 * The list contents are of type {@link alpha.targetmapping.ScheduleTargetRestrictDomain}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter Domains</em>' containment reference list.
	 * @see alpha.targetmapping.TargetmappingPackage#getFilterExpression_FilterDomains()
	 * @model containment="true"
	 * @generated
	 */
	EList<ScheduleTargetRestrictDomain> getFilterDomains();

	/**
	 * Returns the value of the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child</em>' containment reference.
	 * @see #setChild(ScheduleTreeExpression)
	 * @see alpha.targetmapping.TargetmappingPackage#getFilterExpression_Child()
	 * @model containment="true"
	 * @generated
	 */
	ScheduleTreeExpression getChild();

	/**
	 * Sets the value of the '{@link alpha.targetmapping.FilterExpression#getChild <em>Child</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child</em>' containment reference.
	 * @see #getChild()
	 * @generated
	 */
	void setChild(ScheduleTreeExpression value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model visitorUnique="false"
	 * @generated
	 */
	void accept(TargetMappingVisitor visitor);

} // FilterExpression
