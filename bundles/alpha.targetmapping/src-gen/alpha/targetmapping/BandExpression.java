/**
 */
package alpha.targetmapping;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Band Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * LoopTypes and Isolate are used to specify finer-grained control
 * over generated loops. Some of the loop types correspond to those
 * in ISL, which is reflected at code generation. Other loop types
 * only result in annotations in the resulting AST, to be used
 * during post-processing passes.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.targetmapping.BandExpression#getLoopTypeSpecifications <em>Loop Type Specifications</em>}</li>
 *   <li>{@link alpha.targetmapping.BandExpression#getIsolateSpecification <em>Isolate Specification</em>}</li>
 *   <li>{@link alpha.targetmapping.BandExpression#getChild <em>Child</em>}</li>
 * </ul>
 *
 * @see alpha.targetmapping.TargetmappingPackage#getBandExpression()
 * @model
 * @generated
 */
public interface BandExpression extends AbstractBandExpression {
	/**
	 * Returns the value of the '<em><b>Loop Type Specifications</b></em>' containment reference list.
	 * The list contents are of type {@link alpha.targetmapping.LoopTypeSpecification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loop Type Specifications</em>' containment reference list.
	 * @see alpha.targetmapping.TargetmappingPackage#getBandExpression_LoopTypeSpecifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<LoopTypeSpecification> getLoopTypeSpecifications();

	/**
	 * Returns the value of the '<em><b>Isolate Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Isolate Specification</em>' containment reference.
	 * @see #setIsolateSpecification(IsolateSpecification)
	 * @see alpha.targetmapping.TargetmappingPackage#getBandExpression_IsolateSpecification()
	 * @model containment="true"
	 * @generated
	 */
	IsolateSpecification getIsolateSpecification();

	/**
	 * Sets the value of the '{@link alpha.targetmapping.BandExpression#getIsolateSpecification <em>Isolate Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Isolate Specification</em>' containment reference.
	 * @see #getIsolateSpecification()
	 * @generated
	 */
	void setIsolateSpecification(IsolateSpecification value);

	/**
	 * Returns the value of the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child</em>' containment reference.
	 * @see #setChild(ScheduleTreeExpression)
	 * @see alpha.targetmapping.TargetmappingPackage#getBandExpression_Child()
	 * @model containment="true"
	 * @generated
	 */
	ScheduleTreeExpression getChild();

	/**
	 * Sets the value of the '{@link alpha.targetmapping.BandExpression#getChild <em>Child</em>}' containment reference.
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

} // BandExpression
