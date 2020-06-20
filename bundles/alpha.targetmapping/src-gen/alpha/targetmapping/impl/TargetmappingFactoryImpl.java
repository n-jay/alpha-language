/**
 */
package alpha.targetmapping.impl;

import alpha.targetmapping.*;

import fr.irisa.cairn.jnimap.isl.ISLASTLoopType;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TargetmappingFactoryImpl extends EFactoryImpl implements TargetmappingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TargetmappingFactory init() {
		try {
			TargetmappingFactory theTargetmappingFactory = (TargetmappingFactory)EPackage.Registry.INSTANCE.getEFactory(TargetmappingPackage.eNS_URI);
			if (theTargetmappingFactory != null) {
				return theTargetmappingFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TargetmappingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetmappingFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TargetmappingPackage.TARGET_MAPPING: return createTargetMapping();
			case TargetmappingPackage.SPACE_TIME_MAPPING: return createSpaceTimeMapping();
			case TargetmappingPackage.MEMORY_MAPPING: return createMemoryMapping();
			case TargetmappingPackage.MEMORY_SPACE: return createMemorySpace();
			case TargetmappingPackage.CONTEXT_EXPRESSION: return createContextExpression();
			case TargetmappingPackage.SET_EXPRESSION: return createSetExpression();
			case TargetmappingPackage.SEQUENCE_EXPRESSION: return createSequenceExpression();
			case TargetmappingPackage.FILTER_EXPRESSION: return createFilterExpression();
			case TargetmappingPackage.SCHEDULE_TARGET_RESTRICT_DOMAIN: return createScheduleTargetRestrictDomain();
			case TargetmappingPackage.GUARD_EXPRESSION: return createGuardExpression();
			case TargetmappingPackage.MARK_EXPRESSION: return createMarkExpression();
			case TargetmappingPackage.BAND_EXPRESSION: return createBandExpression();
			case TargetmappingPackage.BAND_PIECE: return createBandPiece();
			case TargetmappingPackage.LOOP_TYPE_SPECIFICATION: return createLoopTypeSpecification();
			case TargetmappingPackage.ISOLATE_SPECIFICATION: return createIsolateSpecification();
			case TargetmappingPackage.BAND_PIECE_FOR_REDUCTION_BODY: return createBandPieceForReductionBody();
			case TargetmappingPackage.EXTENSION_EXPRESSION: return createExtensionExpression();
			case TargetmappingPackage.EXTENSION_TARGET: return createExtensionTarget();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case TargetmappingPackage.ISLAST_LOOP_TYPE:
				return createISLASTLoopTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case TargetmappingPackage.ISLAST_LOOP_TYPE:
				return convertISLASTLoopTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetMapping createTargetMapping() {
		TargetMappingImpl targetMapping = new TargetMappingImpl();
		return targetMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpaceTimeMapping createSpaceTimeMapping() {
		SpaceTimeMappingImpl spaceTimeMapping = new SpaceTimeMappingImpl();
		return spaceTimeMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryMapping createMemoryMapping() {
		MemoryMappingImpl memoryMapping = new MemoryMappingImpl();
		return memoryMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemorySpace createMemorySpace() {
		MemorySpaceImpl memorySpace = new MemorySpaceImpl();
		return memorySpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextExpression createContextExpression() {
		ContextExpressionImpl contextExpression = new ContextExpressionImpl();
		return contextExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetExpression createSetExpression() {
		SetExpressionImpl setExpression = new SetExpressionImpl();
		return setExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceExpression createSequenceExpression() {
		SequenceExpressionImpl sequenceExpression = new SequenceExpressionImpl();
		return sequenceExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterExpression createFilterExpression() {
		FilterExpressionImpl filterExpression = new FilterExpressionImpl();
		return filterExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScheduleTargetRestrictDomain createScheduleTargetRestrictDomain() {
		ScheduleTargetRestrictDomainImpl scheduleTargetRestrictDomain = new ScheduleTargetRestrictDomainImpl();
		return scheduleTargetRestrictDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuardExpression createGuardExpression() {
		GuardExpressionImpl guardExpression = new GuardExpressionImpl();
		return guardExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarkExpression createMarkExpression() {
		MarkExpressionImpl markExpression = new MarkExpressionImpl();
		return markExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BandExpression createBandExpression() {
		BandExpressionImpl bandExpression = new BandExpressionImpl();
		return bandExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BandPiece createBandPiece() {
		BandPieceImpl bandPiece = new BandPieceImpl();
		return bandPiece;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoopTypeSpecification createLoopTypeSpecification() {
		LoopTypeSpecificationImpl loopTypeSpecification = new LoopTypeSpecificationImpl();
		return loopTypeSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsolateSpecification createIsolateSpecification() {
		IsolateSpecificationImpl isolateSpecification = new IsolateSpecificationImpl();
		return isolateSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BandPieceForReductionBody createBandPieceForReductionBody() {
		BandPieceForReductionBodyImpl bandPieceForReductionBody = new BandPieceForReductionBodyImpl();
		return bandPieceForReductionBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionExpression createExtensionExpression() {
		ExtensionExpressionImpl extensionExpression = new ExtensionExpressionImpl();
		return extensionExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionTarget createExtensionTarget() {
		ExtensionTargetImpl extensionTarget = new ExtensionTargetImpl();
		return extensionTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISLASTLoopType createISLASTLoopTypeFromString(EDataType eDataType, String initialValue) {
		return (ISLASTLoopType)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertISLASTLoopTypeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetmappingPackage getTargetmappingPackage() {
		return (TargetmappingPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TargetmappingPackage getPackage() {
		return TargetmappingPackage.eINSTANCE;
	}

} //TargetmappingFactoryImpl
