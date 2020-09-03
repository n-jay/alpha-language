/**
 */
package alpha.targetmapping.util;

import alpha.model.AlphaNode;
import alpha.model.AlphaScheduleTarget;
import alpha.model.CalculatorExpression;
import alpha.model.CalculatorExpressionVisitable;
import alpha.model.CalculatorNode;
import alpha.model.JNIFunction;

import alpha.targetmapping.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see alpha.targetmapping.TargetmappingPackage
 * @generated
 */
public class TargetmappingAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TargetmappingPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetmappingAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TargetmappingPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TargetmappingSwitch<Adapter> modelSwitch =
		new TargetmappingSwitch<Adapter>() {
			@Override
			public Adapter caseTargetMappingNode(TargetMappingNode object) {
				return createTargetMappingNodeAdapter();
			}
			@Override
			public Adapter caseTargetMappingVisitable(TargetMappingVisitable object) {
				return createTargetMappingVisitableAdapter();
			}
			@Override
			public Adapter caseTargetMappingVisitor(TargetMappingVisitor object) {
				return createTargetMappingVisitorAdapter();
			}
			@Override
			public Adapter caseScopingEntity(ScopingEntity object) {
				return createScopingEntityAdapter();
			}
			@Override
			public Adapter caseTargetMapping(TargetMapping object) {
				return createTargetMappingAdapter();
			}
			@Override
			public Adapter caseTargetMappingForSystemBody(TargetMappingForSystemBody object) {
				return createTargetMappingForSystemBodyAdapter();
			}
			@Override
			public Adapter caseScheduleTreeExpression(ScheduleTreeExpression object) {
				return createScheduleTreeExpressionAdapter();
			}
			@Override
			public Adapter caseContextExpression(ContextExpression object) {
				return createContextExpressionAdapter();
			}
			@Override
			public Adapter caseSetExpression(SetExpression object) {
				return createSetExpressionAdapter();
			}
			@Override
			public Adapter caseSequenceExpression(SequenceExpression object) {
				return createSequenceExpressionAdapter();
			}
			@Override
			public Adapter caseFilterExpression(FilterExpression object) {
				return createFilterExpressionAdapter();
			}
			@Override
			public Adapter caseScheduleTargetRestrictDomain(ScheduleTargetRestrictDomain object) {
				return createScheduleTargetRestrictDomainAdapter();
			}
			@Override
			public Adapter caseGuardExpression(GuardExpression object) {
				return createGuardExpressionAdapter();
			}
			@Override
			public Adapter caseMarkExpression(MarkExpression object) {
				return createMarkExpressionAdapter();
			}
			@Override
			public Adapter caseAbstractBandExpression(AbstractBandExpression object) {
				return createAbstractBandExpressionAdapter();
			}
			@Override
			public Adapter caseBandExpression(BandExpression object) {
				return createBandExpressionAdapter();
			}
			@Override
			public Adapter caseBandPiece(BandPiece object) {
				return createBandPieceAdapter();
			}
			@Override
			public Adapter caseLoopTypeSpecification(LoopTypeSpecification object) {
				return createLoopTypeSpecificationAdapter();
			}
			@Override
			public Adapter caseISLLoopTypeSpecification(ISLLoopTypeSpecification object) {
				return createISLLoopTypeSpecificationAdapter();
			}
			@Override
			public Adapter caseAlphaLoopTypeSpecification(AlphaLoopTypeSpecification object) {
				return createAlphaLoopTypeSpecificationAdapter();
			}
			@Override
			public Adapter caseIsolateSpecification(IsolateSpecification object) {
				return createIsolateSpecificationAdapter();
			}
			@Override
			public Adapter caseTileBandExpression(TileBandExpression object) {
				return createTileBandExpressionAdapter();
			}
			@Override
			public Adapter caseTilingSpecification(TilingSpecification object) {
				return createTilingSpecificationAdapter();
			}
			@Override
			public Adapter caseTileLoopSpecification(TileLoopSpecification object) {
				return createTileLoopSpecificationAdapter();
			}
			@Override
			public Adapter casePointLoopSpecification(PointLoopSpecification object) {
				return createPointLoopSpecificationAdapter();
			}
			@Override
			public Adapter caseFullTileSpecification(FullTileSpecification object) {
				return createFullTileSpecificationAdapter();
			}
			@Override
			public Adapter caseTileSizeSpecification(TileSizeSpecification object) {
				return createTileSizeSpecificationAdapter();
			}
			@Override
			public Adapter caseFixedTileSize(FixedTileSize object) {
				return createFixedTileSizeAdapter();
			}
			@Override
			public Adapter caseParametricTileSize(ParametricTileSize object) {
				return createParametricTileSizeAdapter();
			}
			@Override
			public Adapter caseCompileTimeConstantTileSize(CompileTimeConstantTileSize object) {
				return createCompileTimeConstantTileSizeAdapter();
			}
			@Override
			public Adapter caseExtensionExpression(ExtensionExpression object) {
				return createExtensionExpressionAdapter();
			}
			@Override
			public Adapter caseExtensionTarget(ExtensionTarget object) {
				return createExtensionTargetAdapter();
			}
			@Override
			public Adapter caseJNIIdentityFunction(JNIIdentityFunction object) {
				return createJNIIdentityFunctionAdapter();
			}
			@Override
			public Adapter caseAlphaScheduleTarget(AlphaScheduleTarget object) {
				return createAlphaScheduleTargetAdapter();
			}
			@Override
			public Adapter caseAlphaNode(AlphaNode object) {
				return createAlphaNodeAdapter();
			}
			@Override
			public Adapter caseCalculatorNode(CalculatorNode object) {
				return createCalculatorNodeAdapter();
			}
			@Override
			public Adapter caseCalculatorExpressionVisitable(CalculatorExpressionVisitable object) {
				return createCalculatorExpressionVisitableAdapter();
			}
			@Override
			public Adapter caseCalculatorExpression(CalculatorExpression object) {
				return createCalculatorExpressionAdapter();
			}
			@Override
			public Adapter caseJNIFunction(JNIFunction object) {
				return createJNIFunctionAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link alpha.targetmapping.TargetMappingNode <em>Target Mapping Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alpha.targetmapping.TargetMappingNode
	 * @generated
	 */
	public Adapter createTargetMappingNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alpha.targetmapping.TargetMappingVisitable <em>Target Mapping Visitable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alpha.targetmapping.TargetMappingVisitable
	 * @generated
	 */
	public Adapter createTargetMappingVisitableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alpha.targetmapping.TargetMappingVisitor <em>Target Mapping Visitor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alpha.targetmapping.TargetMappingVisitor
	 * @generated
	 */
	public Adapter createTargetMappingVisitorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alpha.targetmapping.ScopingEntity <em>Scoping Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alpha.targetmapping.ScopingEntity
	 * @generated
	 */
	public Adapter createScopingEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alpha.targetmapping.TargetMapping <em>Target Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alpha.targetmapping.TargetMapping
	 * @generated
	 */
	public Adapter createTargetMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alpha.targetmapping.TargetMappingForSystemBody <em>Target Mapping For System Body</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alpha.targetmapping.TargetMappingForSystemBody
	 * @generated
	 */
	public Adapter createTargetMappingForSystemBodyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alpha.targetmapping.ScheduleTreeExpression <em>Schedule Tree Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alpha.targetmapping.ScheduleTreeExpression
	 * @generated
	 */
	public Adapter createScheduleTreeExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alpha.targetmapping.ContextExpression <em>Context Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alpha.targetmapping.ContextExpression
	 * @generated
	 */
	public Adapter createContextExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alpha.targetmapping.SetExpression <em>Set Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alpha.targetmapping.SetExpression
	 * @generated
	 */
	public Adapter createSetExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alpha.targetmapping.SequenceExpression <em>Sequence Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alpha.targetmapping.SequenceExpression
	 * @generated
	 */
	public Adapter createSequenceExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alpha.targetmapping.FilterExpression <em>Filter Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alpha.targetmapping.FilterExpression
	 * @generated
	 */
	public Adapter createFilterExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alpha.targetmapping.ScheduleTargetRestrictDomain <em>Schedule Target Restrict Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alpha.targetmapping.ScheduleTargetRestrictDomain
	 * @generated
	 */
	public Adapter createScheduleTargetRestrictDomainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alpha.targetmapping.GuardExpression <em>Guard Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alpha.targetmapping.GuardExpression
	 * @generated
	 */
	public Adapter createGuardExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alpha.targetmapping.MarkExpression <em>Mark Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alpha.targetmapping.MarkExpression
	 * @generated
	 */
	public Adapter createMarkExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alpha.targetmapping.AbstractBandExpression <em>Abstract Band Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alpha.targetmapping.AbstractBandExpression
	 * @generated
	 */
	public Adapter createAbstractBandExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alpha.targetmapping.BandExpression <em>Band Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alpha.targetmapping.BandExpression
	 * @generated
	 */
	public Adapter createBandExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alpha.targetmapping.BandPiece <em>Band Piece</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alpha.targetmapping.BandPiece
	 * @generated
	 */
	public Adapter createBandPieceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alpha.targetmapping.LoopTypeSpecification <em>Loop Type Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alpha.targetmapping.LoopTypeSpecification
	 * @generated
	 */
	public Adapter createLoopTypeSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alpha.targetmapping.ISLLoopTypeSpecification <em>ISL Loop Type Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alpha.targetmapping.ISLLoopTypeSpecification
	 * @generated
	 */
	public Adapter createISLLoopTypeSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alpha.targetmapping.AlphaLoopTypeSpecification <em>Alpha Loop Type Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alpha.targetmapping.AlphaLoopTypeSpecification
	 * @generated
	 */
	public Adapter createAlphaLoopTypeSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alpha.targetmapping.IsolateSpecification <em>Isolate Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alpha.targetmapping.IsolateSpecification
	 * @generated
	 */
	public Adapter createIsolateSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alpha.targetmapping.TileBandExpression <em>Tile Band Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alpha.targetmapping.TileBandExpression
	 * @generated
	 */
	public Adapter createTileBandExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alpha.targetmapping.TilingSpecification <em>Tiling Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alpha.targetmapping.TilingSpecification
	 * @generated
	 */
	public Adapter createTilingSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alpha.targetmapping.TileLoopSpecification <em>Tile Loop Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alpha.targetmapping.TileLoopSpecification
	 * @generated
	 */
	public Adapter createTileLoopSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alpha.targetmapping.PointLoopSpecification <em>Point Loop Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alpha.targetmapping.PointLoopSpecification
	 * @generated
	 */
	public Adapter createPointLoopSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alpha.targetmapping.FullTileSpecification <em>Full Tile Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alpha.targetmapping.FullTileSpecification
	 * @generated
	 */
	public Adapter createFullTileSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alpha.targetmapping.TileSizeSpecification <em>Tile Size Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alpha.targetmapping.TileSizeSpecification
	 * @generated
	 */
	public Adapter createTileSizeSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alpha.targetmapping.FixedTileSize <em>Fixed Tile Size</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alpha.targetmapping.FixedTileSize
	 * @generated
	 */
	public Adapter createFixedTileSizeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alpha.targetmapping.ParametricTileSize <em>Parametric Tile Size</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alpha.targetmapping.ParametricTileSize
	 * @generated
	 */
	public Adapter createParametricTileSizeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alpha.targetmapping.CompileTimeConstantTileSize <em>Compile Time Constant Tile Size</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alpha.targetmapping.CompileTimeConstantTileSize
	 * @generated
	 */
	public Adapter createCompileTimeConstantTileSizeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alpha.targetmapping.ExtensionExpression <em>Extension Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alpha.targetmapping.ExtensionExpression
	 * @generated
	 */
	public Adapter createExtensionExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alpha.targetmapping.ExtensionTarget <em>Extension Target</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alpha.targetmapping.ExtensionTarget
	 * @generated
	 */
	public Adapter createExtensionTargetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alpha.targetmapping.JNIIdentityFunction <em>JNI Identity Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alpha.targetmapping.JNIIdentityFunction
	 * @generated
	 */
	public Adapter createJNIIdentityFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alpha.model.AlphaScheduleTarget <em>Alpha Schedule Target</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alpha.model.AlphaScheduleTarget
	 * @generated
	 */
	public Adapter createAlphaScheduleTargetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alpha.model.AlphaNode <em>Alpha Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alpha.model.AlphaNode
	 * @generated
	 */
	public Adapter createAlphaNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alpha.model.CalculatorNode <em>Calculator Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alpha.model.CalculatorNode
	 * @generated
	 */
	public Adapter createCalculatorNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alpha.model.CalculatorExpressionVisitable <em>Calculator Expression Visitable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alpha.model.CalculatorExpressionVisitable
	 * @generated
	 */
	public Adapter createCalculatorExpressionVisitableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alpha.model.CalculatorExpression <em>Calculator Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alpha.model.CalculatorExpression
	 * @generated
	 */
	public Adapter createCalculatorExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alpha.model.JNIFunction <em>JNI Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alpha.model.JNIFunction
	 * @generated
	 */
	public Adapter createJNIFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //TargetmappingAdapterFactory
