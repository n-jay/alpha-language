/**
 */
package alpha.targetmapping;

import alpha.model.ModelPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see alpha.targetmapping.TargetmappingFactory
 * @model kind="package"
 * @generated
 */
public interface TargetmappingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "targetmapping";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "alpha.targetmapping";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "targetmapping";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TargetmappingPackage eINSTANCE = alpha.targetmapping.impl.TargetmappingPackageImpl.init();

	/**
	 * The meta object id for the '{@link alpha.targetmapping.ScopingEntity <em>Scoping Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alpha.targetmapping.ScopingEntity
	 * @see alpha.targetmapping.impl.TargetmappingPackageImpl#getScopingEntity()
	 * @generated
	 */
	int SCOPING_ENTITY = 0;

	/**
	 * The number of structural features of the '<em>Scoping Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPING_ENTITY_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link alpha.targetmapping.impl.TargetMappingImpl <em>Target Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alpha.targetmapping.impl.TargetMappingImpl
	 * @see alpha.targetmapping.impl.TargetmappingPackageImpl#getTargetMapping()
	 * @generated
	 */
	int TARGET_MAPPING = 1;

	/**
	 * The feature id for the '<em><b>Target System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_MAPPING__TARGET_SYSTEM = SCOPING_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Schedule Tree</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_MAPPING__SCHEDULE_TREE = SCOPING_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Memory Spaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_MAPPING__MEMORY_SPACES = SCOPING_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Target Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_MAPPING_FEATURE_COUNT = SCOPING_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link alpha.targetmapping.impl.AbstractMappingImpl <em>Abstract Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alpha.targetmapping.impl.AbstractMappingImpl
	 * @see alpha.targetmapping.impl.TargetmappingPackageImpl#getAbstractMapping()
	 * @generated
	 */
	int ABSTRACT_MAPPING = 2;

	/**
	 * The feature id for the '<em><b>Schedule Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MAPPING__SCHEDULE_TARGET = 0;

	/**
	 * The feature id for the '<em><b>Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MAPPING__MAPPING = 1;

	/**
	 * The number of structural features of the '<em>Abstract Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MAPPING_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link alpha.targetmapping.impl.SpaceTimeMappingImpl <em>Space Time Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alpha.targetmapping.impl.SpaceTimeMappingImpl
	 * @see alpha.targetmapping.impl.TargetmappingPackageImpl#getSpaceTimeMapping()
	 * @generated
	 */
	int SPACE_TIME_MAPPING = 3;

	/**
	 * The feature id for the '<em><b>Schedule Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_TIME_MAPPING__SCHEDULE_TARGET = ABSTRACT_MAPPING__SCHEDULE_TARGET;

	/**
	 * The feature id for the '<em><b>Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_TIME_MAPPING__MAPPING = ABSTRACT_MAPPING__MAPPING;

	/**
	 * The number of structural features of the '<em>Space Time Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_TIME_MAPPING_FEATURE_COUNT = ABSTRACT_MAPPING_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link alpha.targetmapping.impl.MemoryMappingImpl <em>Memory Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alpha.targetmapping.impl.MemoryMappingImpl
	 * @see alpha.targetmapping.impl.TargetmappingPackageImpl#getMemoryMapping()
	 * @generated
	 */
	int MEMORY_MAPPING = 4;

	/**
	 * The feature id for the '<em><b>Schedule Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_MAPPING__SCHEDULE_TARGET = ABSTRACT_MAPPING__SCHEDULE_TARGET;

	/**
	 * The feature id for the '<em><b>Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_MAPPING__MAPPING = ABSTRACT_MAPPING__MAPPING;

	/**
	 * The feature id for the '<em><b>Memory Space Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_MAPPING__MEMORY_SPACE_NAME = ABSTRACT_MAPPING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Memory Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_MAPPING_FEATURE_COUNT = ABSTRACT_MAPPING_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link alpha.targetmapping.impl.MemorySpaceImpl <em>Memory Space</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alpha.targetmapping.impl.MemorySpaceImpl
	 * @see alpha.targetmapping.impl.TargetmappingPackageImpl#getMemorySpace()
	 * @generated
	 */
	int MEMORY_SPACE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_SPACE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Memory Maps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_SPACE__MEMORY_MAPS = 1;

	/**
	 * The number of structural features of the '<em>Memory Space</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_SPACE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link alpha.targetmapping.impl.ScheduleTreeExpressionImpl <em>Schedule Tree Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alpha.targetmapping.impl.ScheduleTreeExpressionImpl
	 * @see alpha.targetmapping.impl.TargetmappingPackageImpl#getScheduleTreeExpression()
	 * @generated
	 */
	int SCHEDULE_TREE_EXPRESSION = 6;

	/**
	 * The number of structural features of the '<em>Schedule Tree Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_TREE_EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link alpha.targetmapping.impl.ContextExpressionImpl <em>Context Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alpha.targetmapping.impl.ContextExpressionImpl
	 * @see alpha.targetmapping.impl.TargetmappingPackageImpl#getContextExpression()
	 * @generated
	 */
	int CONTEXT_EXPRESSION = 7;

	/**
	 * The feature id for the '<em><b>Context Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_EXPRESSION__CONTEXT_DOMAIN = SCHEDULE_TREE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_EXPRESSION__CHILD = SCHEDULE_TREE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Context Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_EXPRESSION_FEATURE_COUNT = SCHEDULE_TREE_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link alpha.targetmapping.impl.SetExpressionImpl <em>Set Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alpha.targetmapping.impl.SetExpressionImpl
	 * @see alpha.targetmapping.impl.TargetmappingPackageImpl#getSetExpression()
	 * @generated
	 */
	int SET_EXPRESSION = 8;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_EXPRESSION__CHILDREN = SCHEDULE_TREE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Set Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_EXPRESSION_FEATURE_COUNT = SCHEDULE_TREE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link alpha.targetmapping.impl.SequenceExpressionImpl <em>Sequence Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alpha.targetmapping.impl.SequenceExpressionImpl
	 * @see alpha.targetmapping.impl.TargetmappingPackageImpl#getSequenceExpression()
	 * @generated
	 */
	int SEQUENCE_EXPRESSION = 9;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_EXPRESSION__CHILDREN = SCHEDULE_TREE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sequence Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_EXPRESSION_FEATURE_COUNT = SCHEDULE_TREE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link alpha.targetmapping.impl.FilterExpressionImpl <em>Filter Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alpha.targetmapping.impl.FilterExpressionImpl
	 * @see alpha.targetmapping.impl.TargetmappingPackageImpl#getFilterExpression()
	 * @generated
	 */
	int FILTER_EXPRESSION = 10;

	/**
	 * The feature id for the '<em><b>Filter Domains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_EXPRESSION__FILTER_DOMAINS = SCHEDULE_TREE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_EXPRESSION__CHILD = SCHEDULE_TREE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Filter Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_EXPRESSION_FEATURE_COUNT = SCHEDULE_TREE_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link alpha.targetmapping.impl.ScheduleTargetRestrictDomainImpl <em>Schedule Target Restrict Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alpha.targetmapping.impl.ScheduleTargetRestrictDomainImpl
	 * @see alpha.targetmapping.impl.TargetmappingPackageImpl#getScheduleTargetRestrictDomain()
	 * @generated
	 */
	int SCHEDULE_TARGET_RESTRICT_DOMAIN = 11;

	/**
	 * The feature id for the '<em><b>Schedule Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_TARGET_RESTRICT_DOMAIN__SCHEDULE_TARGET = 0;

	/**
	 * The feature id for the '<em><b>Index Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_TARGET_RESTRICT_DOMAIN__INDEX_NAMES = 1;

	/**
	 * The feature id for the '<em><b>Restrict Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_TARGET_RESTRICT_DOMAIN__RESTRICT_DOMAIN = 2;

	/**
	 * The number of structural features of the '<em>Schedule Target Restrict Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_TARGET_RESTRICT_DOMAIN_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link alpha.targetmapping.impl.GuardExpressionImpl <em>Guard Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alpha.targetmapping.impl.GuardExpressionImpl
	 * @see alpha.targetmapping.impl.TargetmappingPackageImpl#getGuardExpression()
	 * @generated
	 */
	int GUARD_EXPRESSION = 12;

	/**
	 * The feature id for the '<em><b>Guard Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD_EXPRESSION__GUARD_DOMAIN = SCHEDULE_TREE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD_EXPRESSION__CHILD = SCHEDULE_TREE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Guard Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD_EXPRESSION_FEATURE_COUNT = SCHEDULE_TREE_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link alpha.targetmapping.impl.MarkExpressionImpl <em>Mark Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alpha.targetmapping.impl.MarkExpressionImpl
	 * @see alpha.targetmapping.impl.TargetmappingPackageImpl#getMarkExpression()
	 * @generated
	 */
	int MARK_EXPRESSION = 13;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARK_EXPRESSION__IDENTIFIER = SCHEDULE_TREE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARK_EXPRESSION__CHILD = SCHEDULE_TREE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Mark Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARK_EXPRESSION_FEATURE_COUNT = SCHEDULE_TREE_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link alpha.targetmapping.impl.BandExpressionImpl <em>Band Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alpha.targetmapping.impl.BandExpressionImpl
	 * @see alpha.targetmapping.impl.TargetmappingPackageImpl#getBandExpression()
	 * @generated
	 */
	int BAND_EXPRESSION = 14;

	/**
	 * The feature id for the '<em><b>Band Pieces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAND_EXPRESSION__BAND_PIECES = SCHEDULE_TREE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAND_EXPRESSION__CHILD = SCHEDULE_TREE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAND_EXPRESSION__TILE = SCHEDULE_TREE_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parallel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAND_EXPRESSION__PARALLEL = SCHEDULE_TREE_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Loop Type Specifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAND_EXPRESSION__LOOP_TYPE_SPECIFICATIONS = SCHEDULE_TREE_EXPRESSION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Isolate Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAND_EXPRESSION__ISOLATE_SPECIFICATION = SCHEDULE_TREE_EXPRESSION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Band Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAND_EXPRESSION_FEATURE_COUNT = SCHEDULE_TREE_EXPRESSION_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link alpha.targetmapping.impl.BandPieceImpl <em>Band Piece</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alpha.targetmapping.impl.BandPieceImpl
	 * @see alpha.targetmapping.impl.TargetmappingPackageImpl#getBandPiece()
	 * @generated
	 */
	int BAND_PIECE = 15;

	/**
	 * The feature id for the '<em><b>Piece Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAND_PIECE__PIECE_DOMAIN = 0;

	/**
	 * The feature id for the '<em><b>Partial Schedule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAND_PIECE__PARTIAL_SCHEDULE = 1;

	/**
	 * The number of structural features of the '<em>Band Piece</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAND_PIECE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link alpha.targetmapping.impl.LoopTypeSpecificationImpl <em>Loop Type Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alpha.targetmapping.impl.LoopTypeSpecificationImpl
	 * @see alpha.targetmapping.impl.TargetmappingPackageImpl#getLoopTypeSpecification()
	 * @generated
	 */
	int LOOP_TYPE_SPECIFICATION = 16;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_TYPE_SPECIFICATION__DIMENSION = 0;

	/**
	 * The feature id for the '<em><b>Loop Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_TYPE_SPECIFICATION__LOOP_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Loop Type Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_TYPE_SPECIFICATION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link alpha.targetmapping.impl.IsolateSpecificationImpl <em>Isolate Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alpha.targetmapping.impl.IsolateSpecificationImpl
	 * @see alpha.targetmapping.impl.TargetmappingPackageImpl#getIsolateSpecification()
	 * @generated
	 */
	int ISOLATE_SPECIFICATION = 17;

	/**
	 * The feature id for the '<em><b>Isolate Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISOLATE_SPECIFICATION__ISOLATE_DOMAIN = 0;

	/**
	 * The feature id for the '<em><b>Loop Type Specifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISOLATE_SPECIFICATION__LOOP_TYPE_SPECIFICATIONS = 1;

	/**
	 * The number of structural features of the '<em>Isolate Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISOLATE_SPECIFICATION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link alpha.targetmapping.impl.BandPieceForReductionBodyImpl <em>Band Piece For Reduction Body</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alpha.targetmapping.impl.BandPieceForReductionBodyImpl
	 * @see alpha.targetmapping.impl.TargetmappingPackageImpl#getBandPieceForReductionBody()
	 * @generated
	 */
	int BAND_PIECE_FOR_REDUCTION_BODY = 18;

	/**
	 * The feature id for the '<em><b>Piece Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAND_PIECE_FOR_REDUCTION_BODY__PIECE_DOMAIN = BAND_PIECE__PIECE_DOMAIN;

	/**
	 * The feature id for the '<em><b>Partial Schedule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAND_PIECE_FOR_REDUCTION_BODY__PARTIAL_SCHEDULE = BAND_PIECE__PARTIAL_SCHEDULE;

	/**
	 * The feature id for the '<em><b>Reduction Initialization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAND_PIECE_FOR_REDUCTION_BODY__REDUCTION_INITIALIZATION = BAND_PIECE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Band Piece For Reduction Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAND_PIECE_FOR_REDUCTION_BODY_FEATURE_COUNT = BAND_PIECE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link alpha.targetmapping.impl.ExtensionExpressionImpl <em>Extension Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alpha.targetmapping.impl.ExtensionExpressionImpl
	 * @see alpha.targetmapping.impl.TargetmappingPackageImpl#getExtensionExpression()
	 * @generated
	 */
	int EXTENSION_EXPRESSION = 19;

	/**
	 * The feature id for the '<em><b>Extension Targets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_EXPRESSION__EXTENSION_TARGETS = SCHEDULE_TREE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_EXPRESSION__CHILD = SCHEDULE_TREE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Extension Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_EXPRESSION_FEATURE_COUNT = SCHEDULE_TREE_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link alpha.targetmapping.impl.ExtensionTargetImpl <em>Extension Target</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alpha.targetmapping.impl.ExtensionTargetImpl
	 * @see alpha.targetmapping.impl.TargetmappingPackageImpl#getExtensionTarget()
	 * @generated
	 */
	int EXTENSION_TARGET = 20;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_TARGET__SOURCE = ModelPackage.ALPHA_SCHEDULE_TARGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Index Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_TARGET__INDEX_NAMES = ModelPackage.ALPHA_SCHEDULE_TARGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_TARGET__NAME = ModelPackage.ALPHA_SCHEDULE_TARGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Extension Map</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_TARGET__EXTENSION_MAP = ModelPackage.ALPHA_SCHEDULE_TARGET_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Extension Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_TARGET_FEATURE_COUNT = ModelPackage.ALPHA_SCHEDULE_TARGET_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '<em>ISLAST Loop Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.cairn.jnimap.isl.ISLASTLoopType
	 * @see alpha.targetmapping.impl.TargetmappingPackageImpl#getISLASTLoopType()
	 * @generated
	 */
	int ISLAST_LOOP_TYPE = 21;


	/**
	 * Returns the meta object for class '{@link alpha.targetmapping.ScopingEntity <em>Scoping Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scoping Entity</em>'.
	 * @see alpha.targetmapping.ScopingEntity
	 * @generated
	 */
	EClass getScopingEntity();

	/**
	 * Returns the meta object for class '{@link alpha.targetmapping.TargetMapping <em>Target Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target Mapping</em>'.
	 * @see alpha.targetmapping.TargetMapping
	 * @generated
	 */
	EClass getTargetMapping();

	/**
	 * Returns the meta object for the reference '{@link alpha.targetmapping.TargetMapping#getTargetSystem <em>Target System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target System</em>'.
	 * @see alpha.targetmapping.TargetMapping#getTargetSystem()
	 * @see #getTargetMapping()
	 * @generated
	 */
	EReference getTargetMapping_TargetSystem();

	/**
	 * Returns the meta object for the containment reference '{@link alpha.targetmapping.TargetMapping#getScheduleTree <em>Schedule Tree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Schedule Tree</em>'.
	 * @see alpha.targetmapping.TargetMapping#getScheduleTree()
	 * @see #getTargetMapping()
	 * @generated
	 */
	EReference getTargetMapping_ScheduleTree();

	/**
	 * Returns the meta object for the containment reference list '{@link alpha.targetmapping.TargetMapping#getMemorySpaces <em>Memory Spaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Memory Spaces</em>'.
	 * @see alpha.targetmapping.TargetMapping#getMemorySpaces()
	 * @see #getTargetMapping()
	 * @generated
	 */
	EReference getTargetMapping_MemorySpaces();

	/**
	 * Returns the meta object for class '{@link alpha.targetmapping.AbstractMapping <em>Abstract Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Mapping</em>'.
	 * @see alpha.targetmapping.AbstractMapping
	 * @generated
	 */
	EClass getAbstractMapping();

	/**
	 * Returns the meta object for the reference '{@link alpha.targetmapping.AbstractMapping#getScheduleTarget <em>Schedule Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Schedule Target</em>'.
	 * @see alpha.targetmapping.AbstractMapping#getScheduleTarget()
	 * @see #getAbstractMapping()
	 * @generated
	 */
	EReference getAbstractMapping_ScheduleTarget();

	/**
	 * Returns the meta object for the containment reference '{@link alpha.targetmapping.AbstractMapping#getMapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mapping</em>'.
	 * @see alpha.targetmapping.AbstractMapping#getMapping()
	 * @see #getAbstractMapping()
	 * @generated
	 */
	EReference getAbstractMapping_Mapping();

	/**
	 * Returns the meta object for class '{@link alpha.targetmapping.SpaceTimeMapping <em>Space Time Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Space Time Mapping</em>'.
	 * @see alpha.targetmapping.SpaceTimeMapping
	 * @generated
	 */
	EClass getSpaceTimeMapping();

	/**
	 * Returns the meta object for class '{@link alpha.targetmapping.MemoryMapping <em>Memory Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Memory Mapping</em>'.
	 * @see alpha.targetmapping.MemoryMapping
	 * @generated
	 */
	EClass getMemoryMapping();

	/**
	 * Returns the meta object for the attribute '{@link alpha.targetmapping.MemoryMapping#getMemorySpaceName <em>Memory Space Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Memory Space Name</em>'.
	 * @see alpha.targetmapping.MemoryMapping#getMemorySpaceName()
	 * @see #getMemoryMapping()
	 * @generated
	 */
	EAttribute getMemoryMapping_MemorySpaceName();

	/**
	 * Returns the meta object for class '{@link alpha.targetmapping.MemorySpace <em>Memory Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Memory Space</em>'.
	 * @see alpha.targetmapping.MemorySpace
	 * @generated
	 */
	EClass getMemorySpace();

	/**
	 * Returns the meta object for the attribute '{@link alpha.targetmapping.MemorySpace#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see alpha.targetmapping.MemorySpace#getName()
	 * @see #getMemorySpace()
	 * @generated
	 */
	EAttribute getMemorySpace_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link alpha.targetmapping.MemorySpace#getMemoryMaps <em>Memory Maps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Memory Maps</em>'.
	 * @see alpha.targetmapping.MemorySpace#getMemoryMaps()
	 * @see #getMemorySpace()
	 * @generated
	 */
	EReference getMemorySpace_MemoryMaps();

	/**
	 * Returns the meta object for class '{@link alpha.targetmapping.ScheduleTreeExpression <em>Schedule Tree Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schedule Tree Expression</em>'.
	 * @see alpha.targetmapping.ScheduleTreeExpression
	 * @generated
	 */
	EClass getScheduleTreeExpression();

	/**
	 * Returns the meta object for class '{@link alpha.targetmapping.ContextExpression <em>Context Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context Expression</em>'.
	 * @see alpha.targetmapping.ContextExpression
	 * @generated
	 */
	EClass getContextExpression();

	/**
	 * Returns the meta object for the containment reference '{@link alpha.targetmapping.ContextExpression#getContextDomain <em>Context Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Context Domain</em>'.
	 * @see alpha.targetmapping.ContextExpression#getContextDomain()
	 * @see #getContextExpression()
	 * @generated
	 */
	EReference getContextExpression_ContextDomain();

	/**
	 * Returns the meta object for the containment reference '{@link alpha.targetmapping.ContextExpression#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Child</em>'.
	 * @see alpha.targetmapping.ContextExpression#getChild()
	 * @see #getContextExpression()
	 * @generated
	 */
	EReference getContextExpression_Child();

	/**
	 * Returns the meta object for class '{@link alpha.targetmapping.SetExpression <em>Set Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Expression</em>'.
	 * @see alpha.targetmapping.SetExpression
	 * @generated
	 */
	EClass getSetExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link alpha.targetmapping.SetExpression#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see alpha.targetmapping.SetExpression#getChildren()
	 * @see #getSetExpression()
	 * @generated
	 */
	EReference getSetExpression_Children();

	/**
	 * Returns the meta object for class '{@link alpha.targetmapping.SequenceExpression <em>Sequence Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Expression</em>'.
	 * @see alpha.targetmapping.SequenceExpression
	 * @generated
	 */
	EClass getSequenceExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link alpha.targetmapping.SequenceExpression#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see alpha.targetmapping.SequenceExpression#getChildren()
	 * @see #getSequenceExpression()
	 * @generated
	 */
	EReference getSequenceExpression_Children();

	/**
	 * Returns the meta object for class '{@link alpha.targetmapping.FilterExpression <em>Filter Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter Expression</em>'.
	 * @see alpha.targetmapping.FilterExpression
	 * @generated
	 */
	EClass getFilterExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link alpha.targetmapping.FilterExpression#getFilterDomains <em>Filter Domains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Filter Domains</em>'.
	 * @see alpha.targetmapping.FilterExpression#getFilterDomains()
	 * @see #getFilterExpression()
	 * @generated
	 */
	EReference getFilterExpression_FilterDomains();

	/**
	 * Returns the meta object for the containment reference '{@link alpha.targetmapping.FilterExpression#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Child</em>'.
	 * @see alpha.targetmapping.FilterExpression#getChild()
	 * @see #getFilterExpression()
	 * @generated
	 */
	EReference getFilterExpression_Child();

	/**
	 * Returns the meta object for class '{@link alpha.targetmapping.ScheduleTargetRestrictDomain <em>Schedule Target Restrict Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schedule Target Restrict Domain</em>'.
	 * @see alpha.targetmapping.ScheduleTargetRestrictDomain
	 * @generated
	 */
	EClass getScheduleTargetRestrictDomain();

	/**
	 * Returns the meta object for the reference '{@link alpha.targetmapping.ScheduleTargetRestrictDomain#getScheduleTarget <em>Schedule Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Schedule Target</em>'.
	 * @see alpha.targetmapping.ScheduleTargetRestrictDomain#getScheduleTarget()
	 * @see #getScheduleTargetRestrictDomain()
	 * @generated
	 */
	EReference getScheduleTargetRestrictDomain_ScheduleTarget();

	/**
	 * Returns the meta object for the attribute list '{@link alpha.targetmapping.ScheduleTargetRestrictDomain#getIndexNames <em>Index Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Index Names</em>'.
	 * @see alpha.targetmapping.ScheduleTargetRestrictDomain#getIndexNames()
	 * @see #getScheduleTargetRestrictDomain()
	 * @generated
	 */
	EAttribute getScheduleTargetRestrictDomain_IndexNames();

	/**
	 * Returns the meta object for the containment reference '{@link alpha.targetmapping.ScheduleTargetRestrictDomain#getRestrictDomain <em>Restrict Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Restrict Domain</em>'.
	 * @see alpha.targetmapping.ScheduleTargetRestrictDomain#getRestrictDomain()
	 * @see #getScheduleTargetRestrictDomain()
	 * @generated
	 */
	EReference getScheduleTargetRestrictDomain_RestrictDomain();

	/**
	 * Returns the meta object for class '{@link alpha.targetmapping.GuardExpression <em>Guard Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Guard Expression</em>'.
	 * @see alpha.targetmapping.GuardExpression
	 * @generated
	 */
	EClass getGuardExpression();

	/**
	 * Returns the meta object for the containment reference '{@link alpha.targetmapping.GuardExpression#getGuardDomain <em>Guard Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Guard Domain</em>'.
	 * @see alpha.targetmapping.GuardExpression#getGuardDomain()
	 * @see #getGuardExpression()
	 * @generated
	 */
	EReference getGuardExpression_GuardDomain();

	/**
	 * Returns the meta object for the containment reference '{@link alpha.targetmapping.GuardExpression#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Child</em>'.
	 * @see alpha.targetmapping.GuardExpression#getChild()
	 * @see #getGuardExpression()
	 * @generated
	 */
	EReference getGuardExpression_Child();

	/**
	 * Returns the meta object for class '{@link alpha.targetmapping.MarkExpression <em>Mark Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mark Expression</em>'.
	 * @see alpha.targetmapping.MarkExpression
	 * @generated
	 */
	EClass getMarkExpression();

	/**
	 * Returns the meta object for the attribute '{@link alpha.targetmapping.MarkExpression#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see alpha.targetmapping.MarkExpression#getIdentifier()
	 * @see #getMarkExpression()
	 * @generated
	 */
	EAttribute getMarkExpression_Identifier();

	/**
	 * Returns the meta object for the containment reference '{@link alpha.targetmapping.MarkExpression#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Child</em>'.
	 * @see alpha.targetmapping.MarkExpression#getChild()
	 * @see #getMarkExpression()
	 * @generated
	 */
	EReference getMarkExpression_Child();

	/**
	 * Returns the meta object for class '{@link alpha.targetmapping.BandExpression <em>Band Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Band Expression</em>'.
	 * @see alpha.targetmapping.BandExpression
	 * @generated
	 */
	EClass getBandExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link alpha.targetmapping.BandExpression#getBandPieces <em>Band Pieces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Band Pieces</em>'.
	 * @see alpha.targetmapping.BandExpression#getBandPieces()
	 * @see #getBandExpression()
	 * @generated
	 */
	EReference getBandExpression_BandPieces();

	/**
	 * Returns the meta object for the containment reference '{@link alpha.targetmapping.BandExpression#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Child</em>'.
	 * @see alpha.targetmapping.BandExpression#getChild()
	 * @see #getBandExpression()
	 * @generated
	 */
	EReference getBandExpression_Child();

	/**
	 * Returns the meta object for the attribute '{@link alpha.targetmapping.BandExpression#isTile <em>Tile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tile</em>'.
	 * @see alpha.targetmapping.BandExpression#isTile()
	 * @see #getBandExpression()
	 * @generated
	 */
	EAttribute getBandExpression_Tile();

	/**
	 * Returns the meta object for the attribute '{@link alpha.targetmapping.BandExpression#isParallel <em>Parallel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parallel</em>'.
	 * @see alpha.targetmapping.BandExpression#isParallel()
	 * @see #getBandExpression()
	 * @generated
	 */
	EAttribute getBandExpression_Parallel();

	/**
	 * Returns the meta object for the containment reference list '{@link alpha.targetmapping.BandExpression#getLoopTypeSpecifications <em>Loop Type Specifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Loop Type Specifications</em>'.
	 * @see alpha.targetmapping.BandExpression#getLoopTypeSpecifications()
	 * @see #getBandExpression()
	 * @generated
	 */
	EReference getBandExpression_LoopTypeSpecifications();

	/**
	 * Returns the meta object for the containment reference '{@link alpha.targetmapping.BandExpression#getIsolateSpecification <em>Isolate Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Isolate Specification</em>'.
	 * @see alpha.targetmapping.BandExpression#getIsolateSpecification()
	 * @see #getBandExpression()
	 * @generated
	 */
	EReference getBandExpression_IsolateSpecification();

	/**
	 * Returns the meta object for class '{@link alpha.targetmapping.BandPiece <em>Band Piece</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Band Piece</em>'.
	 * @see alpha.targetmapping.BandPiece
	 * @generated
	 */
	EClass getBandPiece();

	/**
	 * Returns the meta object for the containment reference '{@link alpha.targetmapping.BandPiece#getPieceDomain <em>Piece Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Piece Domain</em>'.
	 * @see alpha.targetmapping.BandPiece#getPieceDomain()
	 * @see #getBandPiece()
	 * @generated
	 */
	EReference getBandPiece_PieceDomain();

	/**
	 * Returns the meta object for the containment reference '{@link alpha.targetmapping.BandPiece#getPartialSchedule <em>Partial Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Partial Schedule</em>'.
	 * @see alpha.targetmapping.BandPiece#getPartialSchedule()
	 * @see #getBandPiece()
	 * @generated
	 */
	EReference getBandPiece_PartialSchedule();

	/**
	 * Returns the meta object for class '{@link alpha.targetmapping.LoopTypeSpecification <em>Loop Type Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loop Type Specification</em>'.
	 * @see alpha.targetmapping.LoopTypeSpecification
	 * @generated
	 */
	EClass getLoopTypeSpecification();

	/**
	 * Returns the meta object for the attribute '{@link alpha.targetmapping.LoopTypeSpecification#getDimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dimension</em>'.
	 * @see alpha.targetmapping.LoopTypeSpecification#getDimension()
	 * @see #getLoopTypeSpecification()
	 * @generated
	 */
	EAttribute getLoopTypeSpecification_Dimension();

	/**
	 * Returns the meta object for the attribute '{@link alpha.targetmapping.LoopTypeSpecification#getLoopType <em>Loop Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loop Type</em>'.
	 * @see alpha.targetmapping.LoopTypeSpecification#getLoopType()
	 * @see #getLoopTypeSpecification()
	 * @generated
	 */
	EAttribute getLoopTypeSpecification_LoopType();

	/**
	 * Returns the meta object for class '{@link alpha.targetmapping.IsolateSpecification <em>Isolate Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Isolate Specification</em>'.
	 * @see alpha.targetmapping.IsolateSpecification
	 * @generated
	 */
	EClass getIsolateSpecification();

	/**
	 * Returns the meta object for the containment reference '{@link alpha.targetmapping.IsolateSpecification#getIsolateDomain <em>Isolate Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Isolate Domain</em>'.
	 * @see alpha.targetmapping.IsolateSpecification#getIsolateDomain()
	 * @see #getIsolateSpecification()
	 * @generated
	 */
	EReference getIsolateSpecification_IsolateDomain();

	/**
	 * Returns the meta object for the containment reference list '{@link alpha.targetmapping.IsolateSpecification#getLoopTypeSpecifications <em>Loop Type Specifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Loop Type Specifications</em>'.
	 * @see alpha.targetmapping.IsolateSpecification#getLoopTypeSpecifications()
	 * @see #getIsolateSpecification()
	 * @generated
	 */
	EReference getIsolateSpecification_LoopTypeSpecifications();

	/**
	 * Returns the meta object for class '{@link alpha.targetmapping.BandPieceForReductionBody <em>Band Piece For Reduction Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Band Piece For Reduction Body</em>'.
	 * @see alpha.targetmapping.BandPieceForReductionBody
	 * @generated
	 */
	EClass getBandPieceForReductionBody();

	/**
	 * Returns the meta object for the attribute '{@link alpha.targetmapping.BandPieceForReductionBody#getReductionInitialization <em>Reduction Initialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reduction Initialization</em>'.
	 * @see alpha.targetmapping.BandPieceForReductionBody#getReductionInitialization()
	 * @see #getBandPieceForReductionBody()
	 * @generated
	 */
	EAttribute getBandPieceForReductionBody_ReductionInitialization();

	/**
	 * Returns the meta object for class '{@link alpha.targetmapping.ExtensionExpression <em>Extension Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extension Expression</em>'.
	 * @see alpha.targetmapping.ExtensionExpression
	 * @generated
	 */
	EClass getExtensionExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link alpha.targetmapping.ExtensionExpression#getExtensionTargets <em>Extension Targets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extension Targets</em>'.
	 * @see alpha.targetmapping.ExtensionExpression#getExtensionTargets()
	 * @see #getExtensionExpression()
	 * @generated
	 */
	EReference getExtensionExpression_ExtensionTargets();

	/**
	 * Returns the meta object for the containment reference '{@link alpha.targetmapping.ExtensionExpression#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Child</em>'.
	 * @see alpha.targetmapping.ExtensionExpression#getChild()
	 * @see #getExtensionExpression()
	 * @generated
	 */
	EReference getExtensionExpression_Child();

	/**
	 * Returns the meta object for class '{@link alpha.targetmapping.ExtensionTarget <em>Extension Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extension Target</em>'.
	 * @see alpha.targetmapping.ExtensionTarget
	 * @generated
	 */
	EClass getExtensionTarget();

	/**
	 * Returns the meta object for the reference '{@link alpha.targetmapping.ExtensionTarget#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see alpha.targetmapping.ExtensionTarget#getSource()
	 * @see #getExtensionTarget()
	 * @generated
	 */
	EReference getExtensionTarget_Source();

	/**
	 * Returns the meta object for the attribute list '{@link alpha.targetmapping.ExtensionTarget#getIndexNames <em>Index Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Index Names</em>'.
	 * @see alpha.targetmapping.ExtensionTarget#getIndexNames()
	 * @see #getExtensionTarget()
	 * @generated
	 */
	EAttribute getExtensionTarget_IndexNames();

	/**
	 * Returns the meta object for the attribute '{@link alpha.targetmapping.ExtensionTarget#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see alpha.targetmapping.ExtensionTarget#getName()
	 * @see #getExtensionTarget()
	 * @generated
	 */
	EAttribute getExtensionTarget_Name();

	/**
	 * Returns the meta object for the containment reference '{@link alpha.targetmapping.ExtensionTarget#getExtensionMap <em>Extension Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extension Map</em>'.
	 * @see alpha.targetmapping.ExtensionTarget#getExtensionMap()
	 * @see #getExtensionTarget()
	 * @generated
	 */
	EReference getExtensionTarget_ExtensionMap();

	/**
	 * Returns the meta object for data type '{@link fr.irisa.cairn.jnimap.isl.ISLASTLoopType <em>ISLAST Loop Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ISLAST Loop Type</em>'.
	 * @see fr.irisa.cairn.jnimap.isl.ISLASTLoopType
	 * @model instanceClass="fr.irisa.cairn.jnimap.isl.ISLASTLoopType"
	 * @generated
	 */
	EDataType getISLASTLoopType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TargetmappingFactory getTargetmappingFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link alpha.targetmapping.ScopingEntity <em>Scoping Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alpha.targetmapping.ScopingEntity
		 * @see alpha.targetmapping.impl.TargetmappingPackageImpl#getScopingEntity()
		 * @generated
		 */
		EClass SCOPING_ENTITY = eINSTANCE.getScopingEntity();

		/**
		 * The meta object literal for the '{@link alpha.targetmapping.impl.TargetMappingImpl <em>Target Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alpha.targetmapping.impl.TargetMappingImpl
		 * @see alpha.targetmapping.impl.TargetmappingPackageImpl#getTargetMapping()
		 * @generated
		 */
		EClass TARGET_MAPPING = eINSTANCE.getTargetMapping();

		/**
		 * The meta object literal for the '<em><b>Target System</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET_MAPPING__TARGET_SYSTEM = eINSTANCE.getTargetMapping_TargetSystem();

		/**
		 * The meta object literal for the '<em><b>Schedule Tree</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET_MAPPING__SCHEDULE_TREE = eINSTANCE.getTargetMapping_ScheduleTree();

		/**
		 * The meta object literal for the '<em><b>Memory Spaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET_MAPPING__MEMORY_SPACES = eINSTANCE.getTargetMapping_MemorySpaces();

		/**
		 * The meta object literal for the '{@link alpha.targetmapping.impl.AbstractMappingImpl <em>Abstract Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alpha.targetmapping.impl.AbstractMappingImpl
		 * @see alpha.targetmapping.impl.TargetmappingPackageImpl#getAbstractMapping()
		 * @generated
		 */
		EClass ABSTRACT_MAPPING = eINSTANCE.getAbstractMapping();

		/**
		 * The meta object literal for the '<em><b>Schedule Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_MAPPING__SCHEDULE_TARGET = eINSTANCE.getAbstractMapping_ScheduleTarget();

		/**
		 * The meta object literal for the '<em><b>Mapping</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_MAPPING__MAPPING = eINSTANCE.getAbstractMapping_Mapping();

		/**
		 * The meta object literal for the '{@link alpha.targetmapping.impl.SpaceTimeMappingImpl <em>Space Time Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alpha.targetmapping.impl.SpaceTimeMappingImpl
		 * @see alpha.targetmapping.impl.TargetmappingPackageImpl#getSpaceTimeMapping()
		 * @generated
		 */
		EClass SPACE_TIME_MAPPING = eINSTANCE.getSpaceTimeMapping();

		/**
		 * The meta object literal for the '{@link alpha.targetmapping.impl.MemoryMappingImpl <em>Memory Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alpha.targetmapping.impl.MemoryMappingImpl
		 * @see alpha.targetmapping.impl.TargetmappingPackageImpl#getMemoryMapping()
		 * @generated
		 */
		EClass MEMORY_MAPPING = eINSTANCE.getMemoryMapping();

		/**
		 * The meta object literal for the '<em><b>Memory Space Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMORY_MAPPING__MEMORY_SPACE_NAME = eINSTANCE.getMemoryMapping_MemorySpaceName();

		/**
		 * The meta object literal for the '{@link alpha.targetmapping.impl.MemorySpaceImpl <em>Memory Space</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alpha.targetmapping.impl.MemorySpaceImpl
		 * @see alpha.targetmapping.impl.TargetmappingPackageImpl#getMemorySpace()
		 * @generated
		 */
		EClass MEMORY_SPACE = eINSTANCE.getMemorySpace();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMORY_SPACE__NAME = eINSTANCE.getMemorySpace_Name();

		/**
		 * The meta object literal for the '<em><b>Memory Maps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMORY_SPACE__MEMORY_MAPS = eINSTANCE.getMemorySpace_MemoryMaps();

		/**
		 * The meta object literal for the '{@link alpha.targetmapping.impl.ScheduleTreeExpressionImpl <em>Schedule Tree Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alpha.targetmapping.impl.ScheduleTreeExpressionImpl
		 * @see alpha.targetmapping.impl.TargetmappingPackageImpl#getScheduleTreeExpression()
		 * @generated
		 */
		EClass SCHEDULE_TREE_EXPRESSION = eINSTANCE.getScheduleTreeExpression();

		/**
		 * The meta object literal for the '{@link alpha.targetmapping.impl.ContextExpressionImpl <em>Context Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alpha.targetmapping.impl.ContextExpressionImpl
		 * @see alpha.targetmapping.impl.TargetmappingPackageImpl#getContextExpression()
		 * @generated
		 */
		EClass CONTEXT_EXPRESSION = eINSTANCE.getContextExpression();

		/**
		 * The meta object literal for the '<em><b>Context Domain</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_EXPRESSION__CONTEXT_DOMAIN = eINSTANCE.getContextExpression_ContextDomain();

		/**
		 * The meta object literal for the '<em><b>Child</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_EXPRESSION__CHILD = eINSTANCE.getContextExpression_Child();

		/**
		 * The meta object literal for the '{@link alpha.targetmapping.impl.SetExpressionImpl <em>Set Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alpha.targetmapping.impl.SetExpressionImpl
		 * @see alpha.targetmapping.impl.TargetmappingPackageImpl#getSetExpression()
		 * @generated
		 */
		EClass SET_EXPRESSION = eINSTANCE.getSetExpression();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_EXPRESSION__CHILDREN = eINSTANCE.getSetExpression_Children();

		/**
		 * The meta object literal for the '{@link alpha.targetmapping.impl.SequenceExpressionImpl <em>Sequence Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alpha.targetmapping.impl.SequenceExpressionImpl
		 * @see alpha.targetmapping.impl.TargetmappingPackageImpl#getSequenceExpression()
		 * @generated
		 */
		EClass SEQUENCE_EXPRESSION = eINSTANCE.getSequenceExpression();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_EXPRESSION__CHILDREN = eINSTANCE.getSequenceExpression_Children();

		/**
		 * The meta object literal for the '{@link alpha.targetmapping.impl.FilterExpressionImpl <em>Filter Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alpha.targetmapping.impl.FilterExpressionImpl
		 * @see alpha.targetmapping.impl.TargetmappingPackageImpl#getFilterExpression()
		 * @generated
		 */
		EClass FILTER_EXPRESSION = eINSTANCE.getFilterExpression();

		/**
		 * The meta object literal for the '<em><b>Filter Domains</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER_EXPRESSION__FILTER_DOMAINS = eINSTANCE.getFilterExpression_FilterDomains();

		/**
		 * The meta object literal for the '<em><b>Child</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER_EXPRESSION__CHILD = eINSTANCE.getFilterExpression_Child();

		/**
		 * The meta object literal for the '{@link alpha.targetmapping.impl.ScheduleTargetRestrictDomainImpl <em>Schedule Target Restrict Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alpha.targetmapping.impl.ScheduleTargetRestrictDomainImpl
		 * @see alpha.targetmapping.impl.TargetmappingPackageImpl#getScheduleTargetRestrictDomain()
		 * @generated
		 */
		EClass SCHEDULE_TARGET_RESTRICT_DOMAIN = eINSTANCE.getScheduleTargetRestrictDomain();

		/**
		 * The meta object literal for the '<em><b>Schedule Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULE_TARGET_RESTRICT_DOMAIN__SCHEDULE_TARGET = eINSTANCE.getScheduleTargetRestrictDomain_ScheduleTarget();

		/**
		 * The meta object literal for the '<em><b>Index Names</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULE_TARGET_RESTRICT_DOMAIN__INDEX_NAMES = eINSTANCE.getScheduleTargetRestrictDomain_IndexNames();

		/**
		 * The meta object literal for the '<em><b>Restrict Domain</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULE_TARGET_RESTRICT_DOMAIN__RESTRICT_DOMAIN = eINSTANCE.getScheduleTargetRestrictDomain_RestrictDomain();

		/**
		 * The meta object literal for the '{@link alpha.targetmapping.impl.GuardExpressionImpl <em>Guard Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alpha.targetmapping.impl.GuardExpressionImpl
		 * @see alpha.targetmapping.impl.TargetmappingPackageImpl#getGuardExpression()
		 * @generated
		 */
		EClass GUARD_EXPRESSION = eINSTANCE.getGuardExpression();

		/**
		 * The meta object literal for the '<em><b>Guard Domain</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUARD_EXPRESSION__GUARD_DOMAIN = eINSTANCE.getGuardExpression_GuardDomain();

		/**
		 * The meta object literal for the '<em><b>Child</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUARD_EXPRESSION__CHILD = eINSTANCE.getGuardExpression_Child();

		/**
		 * The meta object literal for the '{@link alpha.targetmapping.impl.MarkExpressionImpl <em>Mark Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alpha.targetmapping.impl.MarkExpressionImpl
		 * @see alpha.targetmapping.impl.TargetmappingPackageImpl#getMarkExpression()
		 * @generated
		 */
		EClass MARK_EXPRESSION = eINSTANCE.getMarkExpression();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARK_EXPRESSION__IDENTIFIER = eINSTANCE.getMarkExpression_Identifier();

		/**
		 * The meta object literal for the '<em><b>Child</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARK_EXPRESSION__CHILD = eINSTANCE.getMarkExpression_Child();

		/**
		 * The meta object literal for the '{@link alpha.targetmapping.impl.BandExpressionImpl <em>Band Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alpha.targetmapping.impl.BandExpressionImpl
		 * @see alpha.targetmapping.impl.TargetmappingPackageImpl#getBandExpression()
		 * @generated
		 */
		EClass BAND_EXPRESSION = eINSTANCE.getBandExpression();

		/**
		 * The meta object literal for the '<em><b>Band Pieces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAND_EXPRESSION__BAND_PIECES = eINSTANCE.getBandExpression_BandPieces();

		/**
		 * The meta object literal for the '<em><b>Child</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAND_EXPRESSION__CHILD = eINSTANCE.getBandExpression_Child();

		/**
		 * The meta object literal for the '<em><b>Tile</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BAND_EXPRESSION__TILE = eINSTANCE.getBandExpression_Tile();

		/**
		 * The meta object literal for the '<em><b>Parallel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BAND_EXPRESSION__PARALLEL = eINSTANCE.getBandExpression_Parallel();

		/**
		 * The meta object literal for the '<em><b>Loop Type Specifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAND_EXPRESSION__LOOP_TYPE_SPECIFICATIONS = eINSTANCE.getBandExpression_LoopTypeSpecifications();

		/**
		 * The meta object literal for the '<em><b>Isolate Specification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAND_EXPRESSION__ISOLATE_SPECIFICATION = eINSTANCE.getBandExpression_IsolateSpecification();

		/**
		 * The meta object literal for the '{@link alpha.targetmapping.impl.BandPieceImpl <em>Band Piece</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alpha.targetmapping.impl.BandPieceImpl
		 * @see alpha.targetmapping.impl.TargetmappingPackageImpl#getBandPiece()
		 * @generated
		 */
		EClass BAND_PIECE = eINSTANCE.getBandPiece();

		/**
		 * The meta object literal for the '<em><b>Piece Domain</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAND_PIECE__PIECE_DOMAIN = eINSTANCE.getBandPiece_PieceDomain();

		/**
		 * The meta object literal for the '<em><b>Partial Schedule</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAND_PIECE__PARTIAL_SCHEDULE = eINSTANCE.getBandPiece_PartialSchedule();

		/**
		 * The meta object literal for the '{@link alpha.targetmapping.impl.LoopTypeSpecificationImpl <em>Loop Type Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alpha.targetmapping.impl.LoopTypeSpecificationImpl
		 * @see alpha.targetmapping.impl.TargetmappingPackageImpl#getLoopTypeSpecification()
		 * @generated
		 */
		EClass LOOP_TYPE_SPECIFICATION = eINSTANCE.getLoopTypeSpecification();

		/**
		 * The meta object literal for the '<em><b>Dimension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOOP_TYPE_SPECIFICATION__DIMENSION = eINSTANCE.getLoopTypeSpecification_Dimension();

		/**
		 * The meta object literal for the '<em><b>Loop Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOOP_TYPE_SPECIFICATION__LOOP_TYPE = eINSTANCE.getLoopTypeSpecification_LoopType();

		/**
		 * The meta object literal for the '{@link alpha.targetmapping.impl.IsolateSpecificationImpl <em>Isolate Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alpha.targetmapping.impl.IsolateSpecificationImpl
		 * @see alpha.targetmapping.impl.TargetmappingPackageImpl#getIsolateSpecification()
		 * @generated
		 */
		EClass ISOLATE_SPECIFICATION = eINSTANCE.getIsolateSpecification();

		/**
		 * The meta object literal for the '<em><b>Isolate Domain</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISOLATE_SPECIFICATION__ISOLATE_DOMAIN = eINSTANCE.getIsolateSpecification_IsolateDomain();

		/**
		 * The meta object literal for the '<em><b>Loop Type Specifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISOLATE_SPECIFICATION__LOOP_TYPE_SPECIFICATIONS = eINSTANCE.getIsolateSpecification_LoopTypeSpecifications();

		/**
		 * The meta object literal for the '{@link alpha.targetmapping.impl.BandPieceForReductionBodyImpl <em>Band Piece For Reduction Body</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alpha.targetmapping.impl.BandPieceForReductionBodyImpl
		 * @see alpha.targetmapping.impl.TargetmappingPackageImpl#getBandPieceForReductionBody()
		 * @generated
		 */
		EClass BAND_PIECE_FOR_REDUCTION_BODY = eINSTANCE.getBandPieceForReductionBody();

		/**
		 * The meta object literal for the '<em><b>Reduction Initialization</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BAND_PIECE_FOR_REDUCTION_BODY__REDUCTION_INITIALIZATION = eINSTANCE.getBandPieceForReductionBody_ReductionInitialization();

		/**
		 * The meta object literal for the '{@link alpha.targetmapping.impl.ExtensionExpressionImpl <em>Extension Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alpha.targetmapping.impl.ExtensionExpressionImpl
		 * @see alpha.targetmapping.impl.TargetmappingPackageImpl#getExtensionExpression()
		 * @generated
		 */
		EClass EXTENSION_EXPRESSION = eINSTANCE.getExtensionExpression();

		/**
		 * The meta object literal for the '<em><b>Extension Targets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION_EXPRESSION__EXTENSION_TARGETS = eINSTANCE.getExtensionExpression_ExtensionTargets();

		/**
		 * The meta object literal for the '<em><b>Child</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION_EXPRESSION__CHILD = eINSTANCE.getExtensionExpression_Child();

		/**
		 * The meta object literal for the '{@link alpha.targetmapping.impl.ExtensionTargetImpl <em>Extension Target</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alpha.targetmapping.impl.ExtensionTargetImpl
		 * @see alpha.targetmapping.impl.TargetmappingPackageImpl#getExtensionTarget()
		 * @generated
		 */
		EClass EXTENSION_TARGET = eINSTANCE.getExtensionTarget();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION_TARGET__SOURCE = eINSTANCE.getExtensionTarget_Source();

		/**
		 * The meta object literal for the '<em><b>Index Names</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENSION_TARGET__INDEX_NAMES = eINSTANCE.getExtensionTarget_IndexNames();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENSION_TARGET__NAME = eINSTANCE.getExtensionTarget_Name();

		/**
		 * The meta object literal for the '<em><b>Extension Map</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION_TARGET__EXTENSION_MAP = eINSTANCE.getExtensionTarget_ExtensionMap();

		/**
		 * The meta object literal for the '<em>ISLAST Loop Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.irisa.cairn.jnimap.isl.ISLASTLoopType
		 * @see alpha.targetmapping.impl.TargetmappingPackageImpl#getISLASTLoopType()
		 * @generated
		 */
		EDataType ISLAST_LOOP_TYPE = eINSTANCE.getISLASTLoopType();

	}

} //TargetmappingPackage
