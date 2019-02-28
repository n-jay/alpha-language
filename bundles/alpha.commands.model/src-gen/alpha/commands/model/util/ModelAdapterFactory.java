/**
 */
package alpha.commands.model.util;

import alpha.commands.model.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see alpha.commands.model.ModelPackage
 * @generated
 */
public class ModelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ModelPackage.eINSTANCE;
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
	protected ModelSwitch<Adapter> modelSwitch =
		new ModelSwitch<Adapter>() {
			@Override
			public Adapter caseAlphaCommandsRoot(AlphaCommandsRoot object) {
				return createAlphaCommandsRootAdapter();
			}
			@Override
			public Adapter caseAlphaCommandCategory(AlphaCommandCategory object) {
				return createAlphaCommandCategoryAdapter();
			}
			@Override
			public Adapter caseAlphaCommand(AlphaCommand object) {
				return createAlphaCommandAdapter();
			}
			@Override
			public Adapter caseCommandBinding(CommandBinding object) {
				return createCommandBindingAdapter();
			}
			@Override
			public Adapter caseArgumentBinding(ArgumentBinding object) {
				return createArgumentBindingAdapter();
			}
			@Override
			public Adapter caseArgumentRenaming(ArgumentRenaming object) {
				return createArgumentRenamingAdapter();
			}
			@Override
			public Adapter caseAlphaCommandSignature(AlphaCommandSignature object) {
				return createAlphaCommandSignatureAdapter();
			}
			@Override
			public Adapter caseAlphaCommandSpecialization(AlphaCommandSpecialization object) {
				return createAlphaCommandSpecializationAdapter();
			}
			@Override
			public Adapter caseAlphaCommandArgument(AlphaCommandArgument object) {
				return createAlphaCommandArgumentAdapter();
			}
			@Override
			public Adapter caseCommandArgumentSpecialization(CommandArgumentSpecialization object) {
				return createCommandArgumentSpecializationAdapter();
			}
			@Override
			public Adapter caseOverrideArgument(OverrideArgument object) {
				return createOverrideArgumentAdapter();
			}
			@Override
			public Adapter caseDefaultValueArgument(DefaultValueArgument object) {
				return createDefaultValueArgumentAdapter();
			}
			@Override
			public Adapter caseSameAsParentArgument(SameAsParentArgument object) {
				return createSameAsParentArgumentAdapter();
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
	 * Creates a new adapter for an object of class '{@link alpha.commands.model.AlphaCommandsRoot <em>Alpha Commands Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alpha.commands.model.AlphaCommandsRoot
	 * @generated
	 */
	public Adapter createAlphaCommandsRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alpha.commands.model.AlphaCommandCategory <em>Alpha Command Category</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alpha.commands.model.AlphaCommandCategory
	 * @generated
	 */
	public Adapter createAlphaCommandCategoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alpha.commands.model.AlphaCommand <em>Alpha Command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alpha.commands.model.AlphaCommand
	 * @generated
	 */
	public Adapter createAlphaCommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alpha.commands.model.CommandBinding <em>Command Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alpha.commands.model.CommandBinding
	 * @generated
	 */
	public Adapter createCommandBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alpha.commands.model.ArgumentBinding <em>Argument Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alpha.commands.model.ArgumentBinding
	 * @generated
	 */
	public Adapter createArgumentBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alpha.commands.model.ArgumentRenaming <em>Argument Renaming</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alpha.commands.model.ArgumentRenaming
	 * @generated
	 */
	public Adapter createArgumentRenamingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alpha.commands.model.AlphaCommandSignature <em>Alpha Command Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alpha.commands.model.AlphaCommandSignature
	 * @generated
	 */
	public Adapter createAlphaCommandSignatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alpha.commands.model.AlphaCommandSpecialization <em>Alpha Command Specialization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alpha.commands.model.AlphaCommandSpecialization
	 * @generated
	 */
	public Adapter createAlphaCommandSpecializationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alpha.commands.model.AlphaCommandArgument <em>Alpha Command Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alpha.commands.model.AlphaCommandArgument
	 * @generated
	 */
	public Adapter createAlphaCommandArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alpha.commands.model.CommandArgumentSpecialization <em>Command Argument Specialization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alpha.commands.model.CommandArgumentSpecialization
	 * @generated
	 */
	public Adapter createCommandArgumentSpecializationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alpha.commands.model.OverrideArgument <em>Override Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alpha.commands.model.OverrideArgument
	 * @generated
	 */
	public Adapter createOverrideArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alpha.commands.model.DefaultValueArgument <em>Default Value Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alpha.commands.model.DefaultValueArgument
	 * @generated
	 */
	public Adapter createDefaultValueArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alpha.commands.model.SameAsParentArgument <em>Same As Parent Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alpha.commands.model.SameAsParentArgument
	 * @generated
	 */
	public Adapter createSameAsParentArgumentAdapter() {
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

} //ModelAdapterFactory
