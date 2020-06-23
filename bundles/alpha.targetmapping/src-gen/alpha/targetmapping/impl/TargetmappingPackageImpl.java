/**
 */
package alpha.targetmapping.impl;

import alpha.model.ModelPackage;

import alpha.targetmapping.BandExpression;
import alpha.targetmapping.BandPiece;
import alpha.targetmapping.BandPieceForReductionBody;
import alpha.targetmapping.ContextExpression;
import alpha.targetmapping.ExtensionExpression;
import alpha.targetmapping.ExtensionTarget;
import alpha.targetmapping.FilterExpression;
import alpha.targetmapping.GuardExpression;
import alpha.targetmapping.IsolateSpecification;
import alpha.targetmapping.LoopTypeSpecification;
import alpha.targetmapping.MarkExpression;
import alpha.targetmapping.ScheduleTargetRestrictDomain;
import alpha.targetmapping.ScheduleTreeExpression;
import alpha.targetmapping.ScopingEntity;
import alpha.targetmapping.SequenceExpression;
import alpha.targetmapping.SetExpression;
import alpha.targetmapping.TargetMapping;
import alpha.targetmapping.TargetMappingForSystemBody;
import alpha.targetmapping.TargetMappingNode;
import alpha.targetmapping.TargetMappingVisitable;
import alpha.targetmapping.TargetMappingVisitor;
import alpha.targetmapping.TargetmappingFactory;
import alpha.targetmapping.TargetmappingPackage;

import fr.irisa.cairn.jnimap.isl.ISLASTLoopType;
import fr.irisa.cairn.jnimap.isl.ISLMap;
import fr.irisa.cairn.jnimap.isl.ISLMultiAff;
import fr.irisa.cairn.jnimap.isl.ISLPWQPolynomial;
import fr.irisa.cairn.jnimap.isl.ISLSet;

import fr.irisa.cairn.jnimap.runtime.JNIObject;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TargetmappingPackageImpl extends EPackageImpl implements TargetmappingPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass targetMappingNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass targetMappingVisitableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass targetMappingVisitorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scopingEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass targetMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass targetMappingForSystemBodyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scheduleTreeExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filterExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scheduleTargetRestrictDomainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guardExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass markExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bandExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bandPieceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loopTypeSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isolateSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bandPieceForReductionBodyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extensionExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extensionTargetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType jniObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType jniislSetEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType jniislMapEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType jniislMultiAffEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType jniislpwqPolynomialEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType isL_FORMATEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType islastLoopTypeEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see alpha.targetmapping.TargetmappingPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TargetmappingPackageImpl() {
		super(eNS_URI, TargetmappingFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link TargetmappingPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TargetmappingPackage init() {
		if (isInited) return (TargetmappingPackage)EPackage.Registry.INSTANCE.getEPackage(TargetmappingPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTargetmappingPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TargetmappingPackageImpl theTargetmappingPackage = registeredTargetmappingPackage instanceof TargetmappingPackageImpl ? (TargetmappingPackageImpl)registeredTargetmappingPackage : new TargetmappingPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		ModelPackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theTargetmappingPackage.createPackageContents();

		// Initialize created meta-data
		theTargetmappingPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTargetmappingPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TargetmappingPackage.eNS_URI, theTargetmappingPackage);
		return theTargetmappingPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTargetMappingNode() {
		return targetMappingNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTargetMappingVisitable() {
		return targetMappingVisitableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTargetMappingVisitor() {
		return targetMappingVisitorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScopingEntity() {
		return scopingEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTargetMapping() {
		return targetMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTargetMapping_TargetSystem() {
		return (EReference)targetMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTargetMapping_SystemBodyTMs() {
		return (EReference)targetMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTargetMappingForSystemBody() {
		return targetMappingForSystemBodyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTargetMappingForSystemBody_TargetBody() {
		return (EReference)targetMappingForSystemBodyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTargetMappingForSystemBody_ScheduleTreeRoot() {
		return (EReference)targetMappingForSystemBodyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScheduleTreeExpression() {
		return scheduleTreeExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContextExpression() {
		return contextExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextExpression_ContextDomainExpr() {
		return (EReference)contextExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextExpression_Child() {
		return (EReference)contextExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetExpression() {
		return setExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetExpression_Children() {
		return (EReference)setExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequenceExpression() {
		return sequenceExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceExpression_Children() {
		return (EReference)sequenceExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFilterExpression() {
		return filterExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilterExpression_FilterDomains() {
		return (EReference)filterExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilterExpression_Child() {
		return (EReference)filterExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScheduleTargetRestrictDomain() {
		return scheduleTargetRestrictDomainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScheduleTargetRestrictDomain_ScheduleTarget() {
		return (EReference)scheduleTargetRestrictDomainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScheduleTargetRestrictDomain_IndexNames() {
		return (EAttribute)scheduleTargetRestrictDomainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScheduleTargetRestrictDomain_RestrictDomainExpr() {
		return (EReference)scheduleTargetRestrictDomainEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGuardExpression() {
		return guardExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGuardExpression_GuardDomainExpr() {
		return (EReference)guardExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGuardExpression_Child() {
		return (EReference)guardExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMarkExpression() {
		return markExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMarkExpression_Identifier() {
		return (EAttribute)markExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMarkExpression_Child() {
		return (EReference)markExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBandExpression() {
		return bandExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBandExpression_BandPieces() {
		return (EReference)bandExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBandExpression_Child() {
		return (EReference)bandExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBandExpression_Tile() {
		return (EAttribute)bandExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBandExpression_Parallel() {
		return (EAttribute)bandExpressionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBandExpression_LoopTypeSpecifications() {
		return (EReference)bandExpressionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBandExpression_IsolateSpecification() {
		return (EReference)bandExpressionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBandPiece() {
		return bandPieceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBandPiece_PieceDomain() {
		return (EReference)bandPieceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBandPiece_PartialScheduleExpr() {
		return (EReference)bandPieceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoopTypeSpecification() {
		return loopTypeSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoopTypeSpecification_Dimension() {
		return (EAttribute)loopTypeSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoopTypeSpecification_LoopType() {
		return (EAttribute)loopTypeSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIsolateSpecification() {
		return isolateSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIsolateSpecification_IsolateDomainExpr() {
		return (EReference)isolateSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIsolateSpecification_LoopTypeSpecifications() {
		return (EReference)isolateSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBandPieceForReductionBody() {
		return bandPieceForReductionBodyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBandPieceForReductionBody_ReductionInitialization() {
		return (EAttribute)bandPieceForReductionBodyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtensionExpression() {
		return extensionExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtensionExpression_ExtensionTargets() {
		return (EReference)extensionExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtensionExpression_Child() {
		return (EReference)extensionExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtensionTarget() {
		return extensionTargetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtensionTarget_Source() {
		return (EReference)extensionTargetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtensionTarget_Name() {
		return (EAttribute)extensionTargetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtensionTarget_IndexNames() {
		return (EAttribute)extensionTargetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtensionTarget_ExtensionMapExpr() {
		return (EReference)extensionTargetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getJNIObject() {
		return jniObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getJNIISLSet() {
		return jniislSetEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getJNIISLMap() {
		return jniislMapEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getJNIISLMultiAff() {
		return jniislMultiAffEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getJNIISLPWQPolynomial() {
		return jniislpwqPolynomialEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getISL_FORMAT() {
		return isL_FORMATEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getISLASTLoopType() {
		return islastLoopTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetmappingFactory getTargetmappingFactory() {
		return (TargetmappingFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		targetMappingNodeEClass = createEClass(TARGET_MAPPING_NODE);

		targetMappingVisitableEClass = createEClass(TARGET_MAPPING_VISITABLE);

		targetMappingVisitorEClass = createEClass(TARGET_MAPPING_VISITOR);

		scopingEntityEClass = createEClass(SCOPING_ENTITY);

		targetMappingEClass = createEClass(TARGET_MAPPING);
		createEReference(targetMappingEClass, TARGET_MAPPING__TARGET_SYSTEM);
		createEReference(targetMappingEClass, TARGET_MAPPING__SYSTEM_BODY_TMS);

		targetMappingForSystemBodyEClass = createEClass(TARGET_MAPPING_FOR_SYSTEM_BODY);
		createEReference(targetMappingForSystemBodyEClass, TARGET_MAPPING_FOR_SYSTEM_BODY__TARGET_BODY);
		createEReference(targetMappingForSystemBodyEClass, TARGET_MAPPING_FOR_SYSTEM_BODY__SCHEDULE_TREE_ROOT);

		scheduleTreeExpressionEClass = createEClass(SCHEDULE_TREE_EXPRESSION);

		contextExpressionEClass = createEClass(CONTEXT_EXPRESSION);
		createEReference(contextExpressionEClass, CONTEXT_EXPRESSION__CONTEXT_DOMAIN_EXPR);
		createEReference(contextExpressionEClass, CONTEXT_EXPRESSION__CHILD);

		setExpressionEClass = createEClass(SET_EXPRESSION);
		createEReference(setExpressionEClass, SET_EXPRESSION__CHILDREN);

		sequenceExpressionEClass = createEClass(SEQUENCE_EXPRESSION);
		createEReference(sequenceExpressionEClass, SEQUENCE_EXPRESSION__CHILDREN);

		filterExpressionEClass = createEClass(FILTER_EXPRESSION);
		createEReference(filterExpressionEClass, FILTER_EXPRESSION__FILTER_DOMAINS);
		createEReference(filterExpressionEClass, FILTER_EXPRESSION__CHILD);

		scheduleTargetRestrictDomainEClass = createEClass(SCHEDULE_TARGET_RESTRICT_DOMAIN);
		createEReference(scheduleTargetRestrictDomainEClass, SCHEDULE_TARGET_RESTRICT_DOMAIN__SCHEDULE_TARGET);
		createEAttribute(scheduleTargetRestrictDomainEClass, SCHEDULE_TARGET_RESTRICT_DOMAIN__INDEX_NAMES);
		createEReference(scheduleTargetRestrictDomainEClass, SCHEDULE_TARGET_RESTRICT_DOMAIN__RESTRICT_DOMAIN_EXPR);

		guardExpressionEClass = createEClass(GUARD_EXPRESSION);
		createEReference(guardExpressionEClass, GUARD_EXPRESSION__GUARD_DOMAIN_EXPR);
		createEReference(guardExpressionEClass, GUARD_EXPRESSION__CHILD);

		markExpressionEClass = createEClass(MARK_EXPRESSION);
		createEAttribute(markExpressionEClass, MARK_EXPRESSION__IDENTIFIER);
		createEReference(markExpressionEClass, MARK_EXPRESSION__CHILD);

		bandExpressionEClass = createEClass(BAND_EXPRESSION);
		createEReference(bandExpressionEClass, BAND_EXPRESSION__BAND_PIECES);
		createEReference(bandExpressionEClass, BAND_EXPRESSION__CHILD);
		createEAttribute(bandExpressionEClass, BAND_EXPRESSION__TILE);
		createEAttribute(bandExpressionEClass, BAND_EXPRESSION__PARALLEL);
		createEReference(bandExpressionEClass, BAND_EXPRESSION__LOOP_TYPE_SPECIFICATIONS);
		createEReference(bandExpressionEClass, BAND_EXPRESSION__ISOLATE_SPECIFICATION);

		bandPieceEClass = createEClass(BAND_PIECE);
		createEReference(bandPieceEClass, BAND_PIECE__PIECE_DOMAIN);
		createEReference(bandPieceEClass, BAND_PIECE__PARTIAL_SCHEDULE_EXPR);

		loopTypeSpecificationEClass = createEClass(LOOP_TYPE_SPECIFICATION);
		createEAttribute(loopTypeSpecificationEClass, LOOP_TYPE_SPECIFICATION__DIMENSION);
		createEAttribute(loopTypeSpecificationEClass, LOOP_TYPE_SPECIFICATION__LOOP_TYPE);

		isolateSpecificationEClass = createEClass(ISOLATE_SPECIFICATION);
		createEReference(isolateSpecificationEClass, ISOLATE_SPECIFICATION__ISOLATE_DOMAIN_EXPR);
		createEReference(isolateSpecificationEClass, ISOLATE_SPECIFICATION__LOOP_TYPE_SPECIFICATIONS);

		bandPieceForReductionBodyEClass = createEClass(BAND_PIECE_FOR_REDUCTION_BODY);
		createEAttribute(bandPieceForReductionBodyEClass, BAND_PIECE_FOR_REDUCTION_BODY__REDUCTION_INITIALIZATION);

		extensionExpressionEClass = createEClass(EXTENSION_EXPRESSION);
		createEReference(extensionExpressionEClass, EXTENSION_EXPRESSION__EXTENSION_TARGETS);
		createEReference(extensionExpressionEClass, EXTENSION_EXPRESSION__CHILD);

		extensionTargetEClass = createEClass(EXTENSION_TARGET);
		createEReference(extensionTargetEClass, EXTENSION_TARGET__SOURCE);
		createEAttribute(extensionTargetEClass, EXTENSION_TARGET__NAME);
		createEAttribute(extensionTargetEClass, EXTENSION_TARGET__INDEX_NAMES);
		createEReference(extensionTargetEClass, EXTENSION_TARGET__EXTENSION_MAP_EXPR);

		// Create data types
		jniObjectEDataType = createEDataType(JNI_OBJECT);
		jniislSetEDataType = createEDataType(JNIISL_SET);
		jniislMapEDataType = createEDataType(JNIISL_MAP);
		jniislMultiAffEDataType = createEDataType(JNIISL_MULTI_AFF);
		jniislpwqPolynomialEDataType = createEDataType(JNIISLPWQ_POLYNOMIAL);
		isL_FORMATEDataType = createEDataType(ISL_FORMAT);
		islastLoopTypeEDataType = createEDataType(ISLAST_LOOP_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ModelPackage theModelPackage = (ModelPackage)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		targetMappingEClass.getESuperTypes().add(this.getTargetMappingNode());
		targetMappingEClass.getESuperTypes().add(this.getTargetMappingVisitable());
		targetMappingEClass.getESuperTypes().add(this.getScopingEntity());
		targetMappingForSystemBodyEClass.getESuperTypes().add(this.getTargetMappingNode());
		targetMappingForSystemBodyEClass.getESuperTypes().add(this.getTargetMappingVisitable());
		targetMappingForSystemBodyEClass.getESuperTypes().add(this.getScopingEntity());
		scheduleTreeExpressionEClass.getESuperTypes().add(this.getTargetMappingNode());
		scheduleTreeExpressionEClass.getESuperTypes().add(this.getTargetMappingVisitable());
		contextExpressionEClass.getESuperTypes().add(this.getScheduleTreeExpression());
		setExpressionEClass.getESuperTypes().add(this.getScheduleTreeExpression());
		sequenceExpressionEClass.getESuperTypes().add(this.getScheduleTreeExpression());
		filterExpressionEClass.getESuperTypes().add(this.getScheduleTreeExpression());
		filterExpressionEClass.getESuperTypes().add(this.getScopingEntity());
		guardExpressionEClass.getESuperTypes().add(this.getScheduleTreeExpression());
		markExpressionEClass.getESuperTypes().add(this.getScheduleTreeExpression());
		bandExpressionEClass.getESuperTypes().add(this.getScheduleTreeExpression());
		bandPieceForReductionBodyEClass.getESuperTypes().add(this.getBandPiece());
		extensionExpressionEClass.getESuperTypes().add(this.getScheduleTreeExpression());
		extensionExpressionEClass.getESuperTypes().add(this.getScopingEntity());
		extensionTargetEClass.getESuperTypes().add(theModelPackage.getAlphaScheduleTarget());

		// Initialize classes and features; add operations and parameters
		initEClass(targetMappingNodeEClass, TargetMappingNode.class, "TargetMappingNode", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(targetMappingVisitableEClass, TargetMappingVisitable.class, "TargetMappingVisitable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(targetMappingVisitableEClass, null, "accept", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTargetMappingVisitor(), "visitor", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(targetMappingVisitorEClass, TargetMappingVisitor.class, "TargetMappingVisitor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(targetMappingVisitorEClass, null, "visitTargetMapping", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTargetMapping(), "tm", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(targetMappingVisitorEClass, null, "visitTargetMappingForSystemBody", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTargetMappingForSystemBody(), "tm", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(targetMappingVisitorEClass, null, "visitScheduleTreeExpression", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getScheduleTreeExpression(), "ste", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(targetMappingVisitorEClass, null, "visitContextExpression", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContextExpression(), "ce", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(targetMappingVisitorEClass, null, "visitSetExpression", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSetExpression(), "se", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(targetMappingVisitorEClass, null, "visitSequenceExpression", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSequenceExpression(), "se", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(targetMappingVisitorEClass, null, "visitFilterExpression", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getFilterExpression(), "fe", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(targetMappingVisitorEClass, null, "visitGuardExpression", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getGuardExpression(), "ge", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(targetMappingVisitorEClass, null, "visitMarkExpression", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMarkExpression(), "me", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(targetMappingVisitorEClass, null, "visitBandExpression", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getBandExpression(), "be", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(targetMappingVisitorEClass, null, "visitExtensionExpression", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getExtensionExpression(), "ee", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(targetMappingVisitorEClass, null, "inTargetMapping", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTargetMapping(), "tm", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(targetMappingVisitorEClass, null, "inTargetMappingForSystemBody", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTargetMappingForSystemBody(), "tm", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(targetMappingVisitorEClass, null, "inScheduleTreeExpression", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getScheduleTreeExpression(), "ste", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(targetMappingVisitorEClass, null, "inContextExpression", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContextExpression(), "ce", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(targetMappingVisitorEClass, null, "inSetExpression", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSetExpression(), "se", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(targetMappingVisitorEClass, null, "inSequenceExpression", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSequenceExpression(), "se", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(targetMappingVisitorEClass, null, "inFilterExpression", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getFilterExpression(), "fe", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(targetMappingVisitorEClass, null, "inGuardExpression", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getGuardExpression(), "ge", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(targetMappingVisitorEClass, null, "inMarkExpression", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMarkExpression(), "me", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(targetMappingVisitorEClass, null, "inBandExpression", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getBandExpression(), "be", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(targetMappingVisitorEClass, null, "inExtensionExpression", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getExtensionExpression(), "ee", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(targetMappingVisitorEClass, null, "outTargetMapping", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTargetMapping(), "tm", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(targetMappingVisitorEClass, null, "outTargetMappingForSystemBody", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTargetMappingForSystemBody(), "tm", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(targetMappingVisitorEClass, null, "outScheduleTreeExpression", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getScheduleTreeExpression(), "ste", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(targetMappingVisitorEClass, null, "outContextExpression", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContextExpression(), "ce", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(targetMappingVisitorEClass, null, "outSetExpression", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSetExpression(), "se", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(targetMappingVisitorEClass, null, "outSequenceExpression", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSequenceExpression(), "se", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(targetMappingVisitorEClass, null, "outFilterExpression", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getFilterExpression(), "fe", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(targetMappingVisitorEClass, null, "outGuardExpression", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getGuardExpression(), "ge", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(targetMappingVisitorEClass, null, "outMarkExpression", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMarkExpression(), "me", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(targetMappingVisitorEClass, null, "outBandExpression", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getBandExpression(), "be", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(targetMappingVisitorEClass, null, "outExtensionExpression", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getExtensionExpression(), "ee", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(scopingEntityEClass, ScopingEntity.class, "ScopingEntity", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(targetMappingEClass, TargetMapping.class, "TargetMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTargetMapping_TargetSystem(), theModelPackage.getAlphaSystem(), null, "targetSystem", null, 0, 1, TargetMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTargetMapping_SystemBodyTMs(), this.getTargetMappingForSystemBody(), null, "systemBodyTMs", null, 0, -1, TargetMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(targetMappingEClass, null, "accept", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTargetMappingVisitor(), "visitor", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(targetMappingForSystemBodyEClass, TargetMappingForSystemBody.class, "TargetMappingForSystemBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTargetMappingForSystemBody_TargetBody(), theModelPackage.getSystemBody(), null, "targetBody", null, 0, 1, TargetMappingForSystemBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTargetMappingForSystemBody_ScheduleTreeRoot(), this.getScheduleTreeExpression(), null, "scheduleTreeRoot", null, 0, 1, TargetMappingForSystemBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(targetMappingForSystemBodyEClass, null, "accept", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTargetMappingVisitor(), "visitor", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(scheduleTreeExpressionEClass, ScheduleTreeExpression.class, "ScheduleTreeExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(contextExpressionEClass, ContextExpression.class, "ContextExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContextExpression_ContextDomainExpr(), theModelPackage.getJNIDomainInArrayNotation(), null, "contextDomainExpr", null, 0, 1, ContextExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContextExpression_Child(), this.getScheduleTreeExpression(), null, "child", null, 0, 1, ContextExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(contextExpressionEClass, this.getJNIISLSet(), "getContextDomain", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(contextExpressionEClass, null, "accept", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTargetMappingVisitor(), "visitor", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(setExpressionEClass, SetExpression.class, "SetExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSetExpression_Children(), this.getScheduleTreeExpression(), null, "children", null, 0, -1, SetExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(setExpressionEClass, null, "accept", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTargetMappingVisitor(), "visitor", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(sequenceExpressionEClass, SequenceExpression.class, "SequenceExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSequenceExpression_Children(), this.getScheduleTreeExpression(), null, "children", null, 0, -1, SequenceExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(sequenceExpressionEClass, null, "accept", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTargetMappingVisitor(), "visitor", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(filterExpressionEClass, FilterExpression.class, "FilterExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFilterExpression_FilterDomains(), this.getScheduleTargetRestrictDomain(), null, "filterDomains", null, 0, -1, FilterExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFilterExpression_Child(), this.getScheduleTreeExpression(), null, "child", null, 0, 1, FilterExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(filterExpressionEClass, null, "accept", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTargetMappingVisitor(), "visitor", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(scheduleTargetRestrictDomainEClass, ScheduleTargetRestrictDomain.class, "ScheduleTargetRestrictDomain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScheduleTargetRestrictDomain_ScheduleTarget(), theModelPackage.getAlphaScheduleTarget(), null, "scheduleTarget", null, 0, 1, ScheduleTargetRestrictDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScheduleTargetRestrictDomain_IndexNames(), theEcorePackage.getEString(), "indexNames", null, 0, -1, ScheduleTargetRestrictDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScheduleTargetRestrictDomain_RestrictDomainExpr(), theModelPackage.getJNIDomainInArrayNotation(), null, "restrictDomainExpr", null, 0, 1, ScheduleTargetRestrictDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(scheduleTargetRestrictDomainEClass, this.getJNIISLSet(), "getRestrictDomain", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(guardExpressionEClass, GuardExpression.class, "GuardExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGuardExpression_GuardDomainExpr(), theModelPackage.getJNIDomain(), null, "guardDomainExpr", null, 0, 1, GuardExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGuardExpression_Child(), this.getScheduleTreeExpression(), null, "child", null, 0, 1, GuardExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(guardExpressionEClass, this.getJNIISLSet(), "getGuardDomain", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(guardExpressionEClass, null, "accept", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTargetMappingVisitor(), "visitor", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(markExpressionEClass, MarkExpression.class, "MarkExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMarkExpression_Identifier(), theEcorePackage.getEString(), "identifier", null, 0, 1, MarkExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMarkExpression_Child(), this.getScheduleTreeExpression(), null, "child", null, 0, 1, MarkExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(markExpressionEClass, null, "accept", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTargetMappingVisitor(), "visitor", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(bandExpressionEClass, BandExpression.class, "BandExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBandExpression_BandPieces(), this.getBandPiece(), null, "bandPieces", null, 0, -1, BandExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBandExpression_Child(), this.getScheduleTreeExpression(), null, "child", null, 0, 1, BandExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBandExpression_Tile(), theEcorePackage.getEBoolean(), "tile", null, 0, 1, BandExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBandExpression_Parallel(), theEcorePackage.getEBoolean(), "parallel", null, 0, 1, BandExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBandExpression_LoopTypeSpecifications(), this.getLoopTypeSpecification(), null, "loopTypeSpecifications", null, 0, -1, BandExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBandExpression_IsolateSpecification(), this.getIsolateSpecification(), null, "isolateSpecification", null, 0, 1, BandExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(bandExpressionEClass, null, "accept", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTargetMappingVisitor(), "visitor", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(bandPieceEClass, BandPiece.class, "BandPiece", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBandPiece_PieceDomain(), this.getScheduleTargetRestrictDomain(), null, "pieceDomain", null, 0, 1, BandPiece.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBandPiece_PartialScheduleExpr(), theModelPackage.getJNIFunctionInArrayNotation(), null, "partialScheduleExpr", null, 0, 1, BandPiece.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(bandPieceEClass, this.getJNIISLMultiAff(), "getPartialSchedule", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(loopTypeSpecificationEClass, LoopTypeSpecification.class, "LoopTypeSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLoopTypeSpecification_Dimension(), theEcorePackage.getEInt(), "dimension", null, 0, 1, LoopTypeSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLoopTypeSpecification_LoopType(), this.getISLASTLoopType(), "loopType", null, 0, 1, LoopTypeSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(isolateSpecificationEClass, IsolateSpecification.class, "IsolateSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIsolateSpecification_IsolateDomainExpr(), theModelPackage.getJNIDomain(), null, "isolateDomainExpr", null, 0, 1, IsolateSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIsolateSpecification_LoopTypeSpecifications(), this.getLoopTypeSpecification(), null, "loopTypeSpecifications", null, 0, -1, IsolateSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(isolateSpecificationEClass, this.getJNIISLSet(), "getIsolateDomain", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(bandPieceForReductionBodyEClass, BandPieceForReductionBody.class, "BandPieceForReductionBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBandPieceForReductionBody_ReductionInitialization(), theEcorePackage.getEString(), "reductionInitialization", null, 0, 1, BandPieceForReductionBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(extensionExpressionEClass, ExtensionExpression.class, "ExtensionExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExtensionExpression_ExtensionTargets(), this.getExtensionTarget(), null, "extensionTargets", null, 0, -1, ExtensionExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtensionExpression_Child(), this.getScheduleTreeExpression(), null, "child", null, 0, 1, ExtensionExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(extensionExpressionEClass, null, "accept", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTargetMappingVisitor(), "visitor", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(extensionTargetEClass, ExtensionTarget.class, "ExtensionTarget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExtensionTarget_Source(), theModelPackage.getAlphaScheduleTarget(), null, "source", null, 0, 1, ExtensionTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExtensionTarget_Name(), theEcorePackage.getEString(), "name", null, 0, 1, ExtensionTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExtensionTarget_IndexNames(), theEcorePackage.getEString(), "indexNames", null, 0, -1, ExtensionTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtensionTarget_ExtensionMapExpr(), theModelPackage.getJNIRelation(), null, "extensionMapExpr", null, 0, 1, ExtensionTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(extensionTargetEClass, this.getJNIISLMap(), "getExtensionMap", 0, 1, !IS_UNIQUE, IS_ORDERED);

		// Initialize data types
		initEDataType(jniObjectEDataType, JNIObject.class, "JNIObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(jniislSetEDataType, ISLSet.class, "JNIISLSet", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(jniislMapEDataType, ISLMap.class, "JNIISLMap", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(jniislMultiAffEDataType, ISLMultiAff.class, "JNIISLMultiAff", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(jniislpwqPolynomialEDataType, ISLPWQPolynomial.class, "JNIISLPWQPolynomial", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(isL_FORMATEDataType, fr.irisa.cairn.jnimap.isl.ISL_FORMAT.class, "ISL_FORMAT", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(islastLoopTypeEDataType, ISLASTLoopType.class, "ISLASTLoopType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //TargetmappingPackageImpl
