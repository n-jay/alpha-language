/**
 */
package alpha.targetmapping;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see alpha.targetmapping.TargetmappingPackage
 * @generated
 */
public interface TargetmappingFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TargetmappingFactory eINSTANCE = alpha.targetmapping.impl.TargetmappingFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Target Mapping Visitor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Target Mapping Visitor</em>'.
	 * @generated
	 */
	TargetMappingVisitor createTargetMappingVisitor();

	/**
	 * Returns a new object of class '<em>Target Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Target Mapping</em>'.
	 * @generated
	 */
	TargetMapping createTargetMapping();

	/**
	 * Returns a new object of class '<em>Space Time Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Space Time Mapping</em>'.
	 * @generated
	 */
	SpaceTimeMapping createSpaceTimeMapping();

	/**
	 * Returns a new object of class '<em>Memory Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Memory Mapping</em>'.
	 * @generated
	 */
	MemoryMapping createMemoryMapping();

	/**
	 * Returns a new object of class '<em>Memory Space</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Memory Space</em>'.
	 * @generated
	 */
	MemorySpace createMemorySpace();

	/**
	 * Returns a new object of class '<em>Context Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Context Expression</em>'.
	 * @generated
	 */
	ContextExpression createContextExpression();

	/**
	 * Returns a new object of class '<em>Set Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Expression</em>'.
	 * @generated
	 */
	SetExpression createSetExpression();

	/**
	 * Returns a new object of class '<em>Sequence Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sequence Expression</em>'.
	 * @generated
	 */
	SequenceExpression createSequenceExpression();

	/**
	 * Returns a new object of class '<em>Filter Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Filter Expression</em>'.
	 * @generated
	 */
	FilterExpression createFilterExpression();

	/**
	 * Returns a new object of class '<em>Schedule Target Restrict Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Schedule Target Restrict Domain</em>'.
	 * @generated
	 */
	ScheduleTargetRestrictDomain createScheduleTargetRestrictDomain();

	/**
	 * Returns a new object of class '<em>Guard Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Guard Expression</em>'.
	 * @generated
	 */
	GuardExpression createGuardExpression();

	/**
	 * Returns a new object of class '<em>Mark Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mark Expression</em>'.
	 * @generated
	 */
	MarkExpression createMarkExpression();

	/**
	 * Returns a new object of class '<em>Band Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Band Expression</em>'.
	 * @generated
	 */
	BandExpression createBandExpression();

	/**
	 * Returns a new object of class '<em>Band Piece</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Band Piece</em>'.
	 * @generated
	 */
	BandPiece createBandPiece();

	/**
	 * Returns a new object of class '<em>Loop Type Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Loop Type Specification</em>'.
	 * @generated
	 */
	LoopTypeSpecification createLoopTypeSpecification();

	/**
	 * Returns a new object of class '<em>Isolate Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Isolate Specification</em>'.
	 * @generated
	 */
	IsolateSpecification createIsolateSpecification();

	/**
	 * Returns a new object of class '<em>Band Piece For Reduction Body</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Band Piece For Reduction Body</em>'.
	 * @generated
	 */
	BandPieceForReductionBody createBandPieceForReductionBody();

	/**
	 * Returns a new object of class '<em>Extension Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Extension Expression</em>'.
	 * @generated
	 */
	ExtensionExpression createExtensionExpression();

	/**
	 * Returns a new object of class '<em>Extension Target</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Extension Target</em>'.
	 * @generated
	 */
	ExtensionTarget createExtensionTarget();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TargetmappingPackage getTargetmappingPackage();

} //TargetmappingFactory
