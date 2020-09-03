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
	 * Returns a new object of class '<em>Target Mapping For System Body</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Target Mapping For System Body</em>'.
	 * @generated
	 */
	TargetMappingForSystemBody createTargetMappingForSystemBody();

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
	 * Returns a new object of class '<em>ISL Loop Type Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ISL Loop Type Specification</em>'.
	 * @generated
	 */
	ISLLoopTypeSpecification createISLLoopTypeSpecification();

	/**
	 * Returns a new object of class '<em>Alpha Loop Type Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Alpha Loop Type Specification</em>'.
	 * @generated
	 */
	AlphaLoopTypeSpecification createAlphaLoopTypeSpecification();

	/**
	 * Returns a new object of class '<em>Isolate Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Isolate Specification</em>'.
	 * @generated
	 */
	IsolateSpecification createIsolateSpecification();

	/**
	 * Returns a new object of class '<em>Tile Band Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tile Band Expression</em>'.
	 * @generated
	 */
	TileBandExpression createTileBandExpression();

	/**
	 * Returns a new object of class '<em>Tile Loop Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tile Loop Specification</em>'.
	 * @generated
	 */
	TileLoopSpecification createTileLoopSpecification();

	/**
	 * Returns a new object of class '<em>Point Loop Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Point Loop Specification</em>'.
	 * @generated
	 */
	PointLoopSpecification createPointLoopSpecification();

	/**
	 * Returns a new object of class '<em>Full Tile Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Full Tile Specification</em>'.
	 * @generated
	 */
	FullTileSpecification createFullTileSpecification();

	/**
	 * Returns a new object of class '<em>Fixed Tile Size</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fixed Tile Size</em>'.
	 * @generated
	 */
	FixedTileSize createFixedTileSize();

	/**
	 * Returns a new object of class '<em>Parametric Tile Size</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parametric Tile Size</em>'.
	 * @generated
	 */
	ParametricTileSize createParametricTileSize();

	/**
	 * Returns a new object of class '<em>Compile Time Constant Tile Size</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compile Time Constant Tile Size</em>'.
	 * @generated
	 */
	CompileTimeConstantTileSize createCompileTimeConstantTileSize();

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
	 * Returns a new object of class '<em>JNI Identity Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JNI Identity Function</em>'.
	 * @generated
	 */
	JNIIdentityFunction createJNIIdentityFunction();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TargetmappingPackage getTargetmappingPackage();

} //TargetmappingFactory
