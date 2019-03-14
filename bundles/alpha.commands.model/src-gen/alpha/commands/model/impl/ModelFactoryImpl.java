/**
 */
package alpha.commands.model.impl;

import alpha.commands.model.*;

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
public class ModelFactoryImpl extends EFactoryImpl implements ModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModelFactory init() {
		try {
			ModelFactory theModelFactory = (ModelFactory)EPackage.Registry.INSTANCE.getEFactory(ModelPackage.eNS_URI);
			if (theModelFactory != null) {
				return theModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactoryImpl() {
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
			case ModelPackage.ALPHA_COMMANDS_ROOT: return createAlphaCommandsRoot();
			case ModelPackage.ALPHA_COMMAND_CATEGORY: return createAlphaCommandCategory();
			case ModelPackage.ALPHA_COMMAND: return createAlphaCommand();
			case ModelPackage.COMMAND_BINDING: return createCommandBinding();
			case ModelPackage.ARGUMENT_BINDING: return createArgumentBinding();
			case ModelPackage.ARGUMENT_RENAMING: return createArgumentRenaming();
			case ModelPackage.ALPHA_COMMAND_SIGNATURE: return createAlphaCommandSignature();
			case ModelPackage.ALPHA_COMMAND_SPECIALIZATION: return createAlphaCommandSpecialization();
			case ModelPackage.ALPHA_COMMAND_ARGUMENT: return createAlphaCommandArgument();
			case ModelPackage.OVERRIDE_ARGUMENT: return createOverrideArgument();
			case ModelPackage.DEFAULT_VALUE_ARGUMENT: return createDefaultValueArgument();
			case ModelPackage.SAME_AS_PARENT_ARGUMENT: return createSameAsParentArgument();
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
			case ModelPackage.ARGUMENT_TYPE:
				return createArgumentTypeFromString(eDataType, initialValue);
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
			case ModelPackage.ARGUMENT_TYPE:
				return convertArgumentTypeToString(eDataType, instanceValue);
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
	public AlphaCommandsRoot createAlphaCommandsRoot() {
		AlphaCommandsRootImpl alphaCommandsRoot = new AlphaCommandsRootImpl();
		return alphaCommandsRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AlphaCommandCategory createAlphaCommandCategory() {
		AlphaCommandCategoryImpl alphaCommandCategory = new AlphaCommandCategoryImpl();
		return alphaCommandCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AlphaCommand createAlphaCommand() {
		AlphaCommandImpl alphaCommand = new AlphaCommandImpl();
		return alphaCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommandBinding createCommandBinding() {
		CommandBindingImpl commandBinding = new CommandBindingImpl();
		return commandBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArgumentBinding createArgumentBinding() {
		ArgumentBindingImpl argumentBinding = new ArgumentBindingImpl();
		return argumentBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArgumentRenaming createArgumentRenaming() {
		ArgumentRenamingImpl argumentRenaming = new ArgumentRenamingImpl();
		return argumentRenaming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AlphaCommandSignature createAlphaCommandSignature() {
		AlphaCommandSignatureImpl alphaCommandSignature = new AlphaCommandSignatureImpl();
		return alphaCommandSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AlphaCommandSpecialization createAlphaCommandSpecialization() {
		AlphaCommandSpecializationImpl alphaCommandSpecialization = new AlphaCommandSpecializationImpl();
		return alphaCommandSpecialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AlphaCommandArgument createAlphaCommandArgument() {
		AlphaCommandArgumentImpl alphaCommandArgument = new AlphaCommandArgumentImpl();
		return alphaCommandArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OverrideArgument createOverrideArgument() {
		OverrideArgumentImpl overrideArgument = new OverrideArgumentImpl();
		return overrideArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DefaultValueArgument createDefaultValueArgument() {
		DefaultValueArgumentImpl defaultValueArgument = new DefaultValueArgumentImpl();
		return defaultValueArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SameAsParentArgument createSameAsParentArgument() {
		SameAsParentArgumentImpl sameAsParentArgument = new SameAsParentArgumentImpl();
		return sameAsParentArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentType createArgumentTypeFromString(EDataType eDataType, String initialValue) {
		ArgumentType result = ArgumentType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertArgumentTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModelPackage getModelPackage() {
		return (ModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ModelPackage getPackage() {
		return ModelPackage.eINSTANCE;
	}

} //ModelFactoryImpl
