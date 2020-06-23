/**
 */
package alpha.targetmapping;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Band Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.targetmapping.BandExpression#getBandPieces <em>Band Pieces</em>}</li>
 *   <li>{@link alpha.targetmapping.BandExpression#getChild <em>Child</em>}</li>
 *   <li>{@link alpha.targetmapping.BandExpression#isTile <em>Tile</em>}</li>
 *   <li>{@link alpha.targetmapping.BandExpression#isParallel <em>Parallel</em>}</li>
 *   <li>{@link alpha.targetmapping.BandExpression#getLoopTypeSpecifications <em>Loop Type Specifications</em>}</li>
 *   <li>{@link alpha.targetmapping.BandExpression#getIsolateSpecification <em>Isolate Specification</em>}</li>
 * </ul>
 *
 * @see alpha.targetmapping.TargetmappingPackage#getBandExpression()
 * @model
 * @generated
 */
public interface BandExpression extends ScheduleTreeExpression {
	/**
	 * Returns the value of the '<em><b>Band Pieces</b></em>' containment reference list.
	 * The list contents are of type {@link alpha.targetmapping.BandPiece}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Band Pieces</em>' containment reference list.
	 * @see alpha.targetmapping.TargetmappingPackage#getBandExpression_BandPieces()
	 * @model containment="true"
	 * @generated
	 */
	EList<BandPiece> getBandPieces();

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
	 * Returns the value of the '<em><b>Tile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tile</em>' attribute.
	 * @see #setTile(boolean)
	 * @see alpha.targetmapping.TargetmappingPackage#getBandExpression_Tile()
	 * @model unique="false"
	 * @generated
	 */
	boolean isTile();

	/**
	 * Sets the value of the '{@link alpha.targetmapping.BandExpression#isTile <em>Tile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tile</em>' attribute.
	 * @see #isTile()
	 * @generated
	 */
	void setTile(boolean value);

	/**
	 * Returns the value of the '<em><b>Parallel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parallel</em>' attribute.
	 * @see #setParallel(boolean)
	 * @see alpha.targetmapping.TargetmappingPackage#getBandExpression_Parallel()
	 * @model unique="false"
	 * @generated
	 */
	boolean isParallel();

	/**
	 * Sets the value of the '{@link alpha.targetmapping.BandExpression#isParallel <em>Parallel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parallel</em>' attribute.
	 * @see #isParallel()
	 * @generated
	 */
	void setParallel(boolean value);

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model visitorUnique="false"
	 * @generated
	 */
	void accept(TargetMappingVisitor visitor);

} // BandExpression
