/**
 */
package alpha.commands.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see alpha.commands.model.ModelFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel operationReflection='false' loadInitialization='false' literalsInterface='true' basePackage='alpha.commands'"
 * @generated
 */
public interface ModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "alpha.commands.model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelPackage eINSTANCE = alpha.commands.model.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link alpha.commands.model.impl.AlphaCommandsRootImpl <em>Alpha Commands Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alpha.commands.model.impl.AlphaCommandsRootImpl
	 * @see alpha.commands.model.impl.ModelPackageImpl#getAlphaCommandsRoot()
	 * @generated
	 */
	int ALPHA_COMMANDS_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALPHA_COMMANDS_ROOT__CATEGORIES = 0;

	/**
	 * The number of structural features of the '<em>Alpha Commands Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALPHA_COMMANDS_ROOT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link alpha.commands.model.impl.AlphaCommandCategoryImpl <em>Alpha Command Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alpha.commands.model.impl.AlphaCommandCategoryImpl
	 * @see alpha.commands.model.impl.ModelPackageImpl#getAlphaCommandCategory()
	 * @generated
	 */
	int ALPHA_COMMAND_CATEGORY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALPHA_COMMAND_CATEGORY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Commands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALPHA_COMMAND_CATEGORY__COMMANDS = 1;

	/**
	 * The number of structural features of the '<em>Alpha Command Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALPHA_COMMAND_CATEGORY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link alpha.commands.model.impl.AlphaCommandImpl <em>Alpha Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alpha.commands.model.impl.AlphaCommandImpl
	 * @see alpha.commands.model.impl.ModelPackageImpl#getAlphaCommand()
	 * @generated
	 */
	int ALPHA_COMMAND = 2;

	/**
	 * The feature id for the '<em><b>Category</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALPHA_COMMAND__CATEGORY = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALPHA_COMMAND__LABEL = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALPHA_COMMAND__NAME = 2;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALPHA_COMMAND__SIGNATURE = 3;

	/**
	 * The feature id for the '<em><b>Specializations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALPHA_COMMAND__SPECIALIZATIONS = 4;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALPHA_COMMAND__BINDING = 5;

	/**
	 * The number of structural features of the '<em>Alpha Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALPHA_COMMAND_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link alpha.commands.model.impl.CommandBindingImpl <em>Command Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alpha.commands.model.impl.CommandBindingImpl
	 * @see alpha.commands.model.impl.ModelPackageImpl#getCommandBinding()
	 * @generated
	 */
	int COMMAND_BINDING = 3;

	/**
	 * The feature id for the '<em><b>Bind Target Command</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_BINDING__BIND_TARGET_COMMAND = 0;

	/**
	 * The feature id for the '<em><b>Argument Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_BINDING__ARGUMENT_BINDINGS = 1;

	/**
	 * The feature id for the '<em><b>Argument Renamings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_BINDING__ARGUMENT_RENAMINGS = 2;

	/**
	 * The number of structural features of the '<em>Command Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_BINDING_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link alpha.commands.model.impl.ArgumentBindingImpl <em>Argument Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alpha.commands.model.impl.ArgumentBindingImpl
	 * @see alpha.commands.model.impl.ModelPackageImpl#getArgumentBinding()
	 * @generated
	 */
	int ARGUMENT_BINDING = 4;

	/**
	 * The feature id for the '<em><b>Bind Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_BINDING__BIND_TARGET = 0;

	/**
	 * The feature id for the '<em><b>Bind Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_BINDING__BIND_SOURCE = 1;

	/**
	 * The number of structural features of the '<em>Argument Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_BINDING_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link alpha.commands.model.impl.ArgumentRenamingImpl <em>Argument Renaming</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alpha.commands.model.impl.ArgumentRenamingImpl
	 * @see alpha.commands.model.impl.ModelPackageImpl#getArgumentRenaming()
	 * @generated
	 */
	int ARGUMENT_RENAMING = 5;

	/**
	 * The feature id for the '<em><b>Bind Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_RENAMING__BIND_TARGET = 0;

	/**
	 * The feature id for the '<em><b>Bind Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_RENAMING__BIND_SOURCE = 1;

	/**
	 * The number of structural features of the '<em>Argument Renaming</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_RENAMING_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link alpha.commands.model.impl.AlphaCommandSignatureImpl <em>Alpha Command Signature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alpha.commands.model.impl.AlphaCommandSignatureImpl
	 * @see alpha.commands.model.impl.ModelPackageImpl#getAlphaCommandSignature()
	 * @generated
	 */
	int ALPHA_COMMAND_SIGNATURE = 6;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALPHA_COMMAND_SIGNATURE__ARGUMENTS = 0;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALPHA_COMMAND_SIGNATURE__RETURN_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Alpha Command Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALPHA_COMMAND_SIGNATURE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link alpha.commands.model.impl.AlphaCommandSpecializationImpl <em>Alpha Command Specialization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alpha.commands.model.impl.AlphaCommandSpecializationImpl
	 * @see alpha.commands.model.impl.ModelPackageImpl#getAlphaCommandSpecialization()
	 * @generated
	 */
	int ALPHA_COMMAND_SPECIALIZATION = 7;

	/**
	 * The feature id for the '<em><b>Command</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALPHA_COMMAND_SPECIALIZATION__COMMAND = 0;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALPHA_COMMAND_SPECIALIZATION__ARGUMENTS = 1;

	/**
	 * The number of structural features of the '<em>Alpha Command Specialization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALPHA_COMMAND_SPECIALIZATION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link alpha.commands.model.impl.AlphaCommandArgumentImpl <em>Alpha Command Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alpha.commands.model.impl.AlphaCommandArgumentImpl
	 * @see alpha.commands.model.impl.ModelPackageImpl#getAlphaCommandArgument()
	 * @generated
	 */
	int ALPHA_COMMAND_ARGUMENT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALPHA_COMMAND_ARGUMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Argument Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALPHA_COMMAND_ARGUMENT__ARGUMENT_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Alpha Command Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALPHA_COMMAND_ARGUMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link alpha.commands.model.impl.CommandArgumentSpecializationImpl <em>Command Argument Specialization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alpha.commands.model.impl.CommandArgumentSpecializationImpl
	 * @see alpha.commands.model.impl.ModelPackageImpl#getCommandArgumentSpecialization()
	 * @generated
	 */
	int COMMAND_ARGUMENT_SPECIALIZATION = 9;

	/**
	 * The number of structural features of the '<em>Command Argument Specialization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_ARGUMENT_SPECIALIZATION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link alpha.commands.model.impl.OverrideArgumentImpl <em>Override Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alpha.commands.model.impl.OverrideArgumentImpl
	 * @see alpha.commands.model.impl.ModelPackageImpl#getOverrideArgument()
	 * @generated
	 */
	int OVERRIDE_ARGUMENT = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERRIDE_ARGUMENT__NAME = COMMAND_ARGUMENT_SPECIALIZATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Argument Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERRIDE_ARGUMENT__ARGUMENT_TYPE = COMMAND_ARGUMENT_SPECIALIZATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Override Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERRIDE_ARGUMENT_FEATURE_COUNT = COMMAND_ARGUMENT_SPECIALIZATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link alpha.commands.model.impl.DefaultValueArgumentImpl <em>Default Value Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alpha.commands.model.impl.DefaultValueArgumentImpl
	 * @see alpha.commands.model.impl.ModelPackageImpl#getDefaultValueArgument()
	 * @generated
	 */
	int DEFAULT_VALUE_ARGUMENT = 11;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_VALUE_ARGUMENT__VALUE = COMMAND_ARGUMENT_SPECIALIZATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Default Value Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_VALUE_ARGUMENT_FEATURE_COUNT = COMMAND_ARGUMENT_SPECIALIZATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link alpha.commands.model.impl.SameAsParentArgumentImpl <em>Same As Parent Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alpha.commands.model.impl.SameAsParentArgumentImpl
	 * @see alpha.commands.model.impl.ModelPackageImpl#getSameAsParentArgument()
	 * @generated
	 */
	int SAME_AS_PARENT_ARGUMENT = 12;

	/**
	 * The number of structural features of the '<em>Same As Parent Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAME_AS_PARENT_ARGUMENT_FEATURE_COUNT = COMMAND_ARGUMENT_SPECIALIZATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link alpha.commands.model.ArgumentType <em>Argument Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alpha.commands.model.ArgumentType
	 * @see alpha.commands.model.impl.ModelPackageImpl#getArgumentType()
	 * @generated
	 */
	int ARGUMENT_TYPE = 13;


	/**
	 * Returns the meta object for class '{@link alpha.commands.model.AlphaCommandsRoot <em>Alpha Commands Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alpha Commands Root</em>'.
	 * @see alpha.commands.model.AlphaCommandsRoot
	 * @generated
	 */
	EClass getAlphaCommandsRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link alpha.commands.model.AlphaCommandsRoot#getCategories <em>Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Categories</em>'.
	 * @see alpha.commands.model.AlphaCommandsRoot#getCategories()
	 * @see #getAlphaCommandsRoot()
	 * @generated
	 */
	EReference getAlphaCommandsRoot_Categories();

	/**
	 * Returns the meta object for class '{@link alpha.commands.model.AlphaCommandCategory <em>Alpha Command Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alpha Command Category</em>'.
	 * @see alpha.commands.model.AlphaCommandCategory
	 * @generated
	 */
	EClass getAlphaCommandCategory();

	/**
	 * Returns the meta object for the attribute '{@link alpha.commands.model.AlphaCommandCategory#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see alpha.commands.model.AlphaCommandCategory#getName()
	 * @see #getAlphaCommandCategory()
	 * @generated
	 */
	EAttribute getAlphaCommandCategory_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link alpha.commands.model.AlphaCommandCategory#getCommands <em>Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Commands</em>'.
	 * @see alpha.commands.model.AlphaCommandCategory#getCommands()
	 * @see #getAlphaCommandCategory()
	 * @generated
	 */
	EReference getAlphaCommandCategory_Commands();

	/**
	 * Returns the meta object for class '{@link alpha.commands.model.AlphaCommand <em>Alpha Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alpha Command</em>'.
	 * @see alpha.commands.model.AlphaCommand
	 * @generated
	 */
	EClass getAlphaCommand();

	/**
	 * Returns the meta object for the container reference '{@link alpha.commands.model.AlphaCommand#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Category</em>'.
	 * @see alpha.commands.model.AlphaCommand#getCategory()
	 * @see #getAlphaCommand()
	 * @generated
	 */
	EReference getAlphaCommand_Category();

	/**
	 * Returns the meta object for the attribute '{@link alpha.commands.model.AlphaCommand#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see alpha.commands.model.AlphaCommand#getLabel()
	 * @see #getAlphaCommand()
	 * @generated
	 */
	EAttribute getAlphaCommand_Label();

	/**
	 * Returns the meta object for the attribute '{@link alpha.commands.model.AlphaCommand#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see alpha.commands.model.AlphaCommand#getName()
	 * @see #getAlphaCommand()
	 * @generated
	 */
	EAttribute getAlphaCommand_Name();

	/**
	 * Returns the meta object for the containment reference '{@link alpha.commands.model.AlphaCommand#getSignature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Signature</em>'.
	 * @see alpha.commands.model.AlphaCommand#getSignature()
	 * @see #getAlphaCommand()
	 * @generated
	 */
	EReference getAlphaCommand_Signature();

	/**
	 * Returns the meta object for the containment reference list '{@link alpha.commands.model.AlphaCommand#getSpecializations <em>Specializations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Specializations</em>'.
	 * @see alpha.commands.model.AlphaCommand#getSpecializations()
	 * @see #getAlphaCommand()
	 * @generated
	 */
	EReference getAlphaCommand_Specializations();

	/**
	 * Returns the meta object for the containment reference '{@link alpha.commands.model.AlphaCommand#getBinding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Binding</em>'.
	 * @see alpha.commands.model.AlphaCommand#getBinding()
	 * @see #getAlphaCommand()
	 * @generated
	 */
	EReference getAlphaCommand_Binding();

	/**
	 * Returns the meta object for class '{@link alpha.commands.model.CommandBinding <em>Command Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command Binding</em>'.
	 * @see alpha.commands.model.CommandBinding
	 * @generated
	 */
	EClass getCommandBinding();

	/**
	 * Returns the meta object for the reference '{@link alpha.commands.model.CommandBinding#getBindTargetCommand <em>Bind Target Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bind Target Command</em>'.
	 * @see alpha.commands.model.CommandBinding#getBindTargetCommand()
	 * @see #getCommandBinding()
	 * @generated
	 */
	EReference getCommandBinding_BindTargetCommand();

	/**
	 * Returns the meta object for the containment reference list '{@link alpha.commands.model.CommandBinding#getArgumentBindings <em>Argument Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Argument Bindings</em>'.
	 * @see alpha.commands.model.CommandBinding#getArgumentBindings()
	 * @see #getCommandBinding()
	 * @generated
	 */
	EReference getCommandBinding_ArgumentBindings();

	/**
	 * Returns the meta object for the containment reference list '{@link alpha.commands.model.CommandBinding#getArgumentRenamings <em>Argument Renamings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Argument Renamings</em>'.
	 * @see alpha.commands.model.CommandBinding#getArgumentRenamings()
	 * @see #getCommandBinding()
	 * @generated
	 */
	EReference getCommandBinding_ArgumentRenamings();

	/**
	 * Returns the meta object for class '{@link alpha.commands.model.ArgumentBinding <em>Argument Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument Binding</em>'.
	 * @see alpha.commands.model.ArgumentBinding
	 * @generated
	 */
	EClass getArgumentBinding();

	/**
	 * Returns the meta object for the reference '{@link alpha.commands.model.ArgumentBinding#getBindTarget <em>Bind Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bind Target</em>'.
	 * @see alpha.commands.model.ArgumentBinding#getBindTarget()
	 * @see #getArgumentBinding()
	 * @generated
	 */
	EReference getArgumentBinding_BindTarget();

	/**
	 * Returns the meta object for the reference list '{@link alpha.commands.model.ArgumentBinding#getBindSource <em>Bind Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Bind Source</em>'.
	 * @see alpha.commands.model.ArgumentBinding#getBindSource()
	 * @see #getArgumentBinding()
	 * @generated
	 */
	EReference getArgumentBinding_BindSource();

	/**
	 * Returns the meta object for class '{@link alpha.commands.model.ArgumentRenaming <em>Argument Renaming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument Renaming</em>'.
	 * @see alpha.commands.model.ArgumentRenaming
	 * @generated
	 */
	EClass getArgumentRenaming();

	/**
	 * Returns the meta object for the reference '{@link alpha.commands.model.ArgumentRenaming#getBindTarget <em>Bind Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bind Target</em>'.
	 * @see alpha.commands.model.ArgumentRenaming#getBindTarget()
	 * @see #getArgumentRenaming()
	 * @generated
	 */
	EReference getArgumentRenaming_BindTarget();

	/**
	 * Returns the meta object for the reference '{@link alpha.commands.model.ArgumentRenaming#getBindSource <em>Bind Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bind Source</em>'.
	 * @see alpha.commands.model.ArgumentRenaming#getBindSource()
	 * @see #getArgumentRenaming()
	 * @generated
	 */
	EReference getArgumentRenaming_BindSource();

	/**
	 * Returns the meta object for class '{@link alpha.commands.model.AlphaCommandSignature <em>Alpha Command Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alpha Command Signature</em>'.
	 * @see alpha.commands.model.AlphaCommandSignature
	 * @generated
	 */
	EClass getAlphaCommandSignature();

	/**
	 * Returns the meta object for the containment reference list '{@link alpha.commands.model.AlphaCommandSignature#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see alpha.commands.model.AlphaCommandSignature#getArguments()
	 * @see #getAlphaCommandSignature()
	 * @generated
	 */
	EReference getAlphaCommandSignature_Arguments();

	/**
	 * Returns the meta object for the attribute '{@link alpha.commands.model.AlphaCommandSignature#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Type</em>'.
	 * @see alpha.commands.model.AlphaCommandSignature#getReturnType()
	 * @see #getAlphaCommandSignature()
	 * @generated
	 */
	EAttribute getAlphaCommandSignature_ReturnType();

	/**
	 * Returns the meta object for class '{@link alpha.commands.model.AlphaCommandSpecialization <em>Alpha Command Specialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alpha Command Specialization</em>'.
	 * @see alpha.commands.model.AlphaCommandSpecialization
	 * @generated
	 */
	EClass getAlphaCommandSpecialization();

	/**
	 * Returns the meta object for the container reference '{@link alpha.commands.model.AlphaCommandSpecialization#getCommand <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Command</em>'.
	 * @see alpha.commands.model.AlphaCommandSpecialization#getCommand()
	 * @see #getAlphaCommandSpecialization()
	 * @generated
	 */
	EReference getAlphaCommandSpecialization_Command();

	/**
	 * Returns the meta object for the containment reference list '{@link alpha.commands.model.AlphaCommandSpecialization#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see alpha.commands.model.AlphaCommandSpecialization#getArguments()
	 * @see #getAlphaCommandSpecialization()
	 * @generated
	 */
	EReference getAlphaCommandSpecialization_Arguments();

	/**
	 * Returns the meta object for class '{@link alpha.commands.model.AlphaCommandArgument <em>Alpha Command Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alpha Command Argument</em>'.
	 * @see alpha.commands.model.AlphaCommandArgument
	 * @generated
	 */
	EClass getAlphaCommandArgument();

	/**
	 * Returns the meta object for the attribute '{@link alpha.commands.model.AlphaCommandArgument#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see alpha.commands.model.AlphaCommandArgument#getName()
	 * @see #getAlphaCommandArgument()
	 * @generated
	 */
	EAttribute getAlphaCommandArgument_Name();

	/**
	 * Returns the meta object for the attribute '{@link alpha.commands.model.AlphaCommandArgument#getArgumentType <em>Argument Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Argument Type</em>'.
	 * @see alpha.commands.model.AlphaCommandArgument#getArgumentType()
	 * @see #getAlphaCommandArgument()
	 * @generated
	 */
	EAttribute getAlphaCommandArgument_ArgumentType();

	/**
	 * Returns the meta object for class '{@link alpha.commands.model.CommandArgumentSpecialization <em>Command Argument Specialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command Argument Specialization</em>'.
	 * @see alpha.commands.model.CommandArgumentSpecialization
	 * @generated
	 */
	EClass getCommandArgumentSpecialization();

	/**
	 * Returns the meta object for class '{@link alpha.commands.model.OverrideArgument <em>Override Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Override Argument</em>'.
	 * @see alpha.commands.model.OverrideArgument
	 * @generated
	 */
	EClass getOverrideArgument();

	/**
	 * Returns the meta object for the attribute '{@link alpha.commands.model.OverrideArgument#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see alpha.commands.model.OverrideArgument#getName()
	 * @see #getOverrideArgument()
	 * @generated
	 */
	EAttribute getOverrideArgument_Name();

	/**
	 * Returns the meta object for the attribute '{@link alpha.commands.model.OverrideArgument#getArgumentType <em>Argument Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Argument Type</em>'.
	 * @see alpha.commands.model.OverrideArgument#getArgumentType()
	 * @see #getOverrideArgument()
	 * @generated
	 */
	EAttribute getOverrideArgument_ArgumentType();

	/**
	 * Returns the meta object for class '{@link alpha.commands.model.DefaultValueArgument <em>Default Value Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default Value Argument</em>'.
	 * @see alpha.commands.model.DefaultValueArgument
	 * @generated
	 */
	EClass getDefaultValueArgument();

	/**
	 * Returns the meta object for the attribute '{@link alpha.commands.model.DefaultValueArgument#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see alpha.commands.model.DefaultValueArgument#getValue()
	 * @see #getDefaultValueArgument()
	 * @generated
	 */
	EAttribute getDefaultValueArgument_Value();

	/**
	 * Returns the meta object for class '{@link alpha.commands.model.SameAsParentArgument <em>Same As Parent Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Same As Parent Argument</em>'.
	 * @see alpha.commands.model.SameAsParentArgument
	 * @generated
	 */
	EClass getSameAsParentArgument();

	/**
	 * Returns the meta object for enum '{@link alpha.commands.model.ArgumentType <em>Argument Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Argument Type</em>'.
	 * @see alpha.commands.model.ArgumentType
	 * @generated
	 */
	EEnum getArgumentType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelFactory getModelFactory();

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
		 * The meta object literal for the '{@link alpha.commands.model.impl.AlphaCommandsRootImpl <em>Alpha Commands Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alpha.commands.model.impl.AlphaCommandsRootImpl
		 * @see alpha.commands.model.impl.ModelPackageImpl#getAlphaCommandsRoot()
		 * @generated
		 */
		EClass ALPHA_COMMANDS_ROOT = eINSTANCE.getAlphaCommandsRoot();

		/**
		 * The meta object literal for the '<em><b>Categories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALPHA_COMMANDS_ROOT__CATEGORIES = eINSTANCE.getAlphaCommandsRoot_Categories();

		/**
		 * The meta object literal for the '{@link alpha.commands.model.impl.AlphaCommandCategoryImpl <em>Alpha Command Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alpha.commands.model.impl.AlphaCommandCategoryImpl
		 * @see alpha.commands.model.impl.ModelPackageImpl#getAlphaCommandCategory()
		 * @generated
		 */
		EClass ALPHA_COMMAND_CATEGORY = eINSTANCE.getAlphaCommandCategory();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALPHA_COMMAND_CATEGORY__NAME = eINSTANCE.getAlphaCommandCategory_Name();

		/**
		 * The meta object literal for the '<em><b>Commands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALPHA_COMMAND_CATEGORY__COMMANDS = eINSTANCE.getAlphaCommandCategory_Commands();

		/**
		 * The meta object literal for the '{@link alpha.commands.model.impl.AlphaCommandImpl <em>Alpha Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alpha.commands.model.impl.AlphaCommandImpl
		 * @see alpha.commands.model.impl.ModelPackageImpl#getAlphaCommand()
		 * @generated
		 */
		EClass ALPHA_COMMAND = eINSTANCE.getAlphaCommand();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALPHA_COMMAND__CATEGORY = eINSTANCE.getAlphaCommand_Category();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALPHA_COMMAND__LABEL = eINSTANCE.getAlphaCommand_Label();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALPHA_COMMAND__NAME = eINSTANCE.getAlphaCommand_Name();

		/**
		 * The meta object literal for the '<em><b>Signature</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALPHA_COMMAND__SIGNATURE = eINSTANCE.getAlphaCommand_Signature();

		/**
		 * The meta object literal for the '<em><b>Specializations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALPHA_COMMAND__SPECIALIZATIONS = eINSTANCE.getAlphaCommand_Specializations();

		/**
		 * The meta object literal for the '<em><b>Binding</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALPHA_COMMAND__BINDING = eINSTANCE.getAlphaCommand_Binding();

		/**
		 * The meta object literal for the '{@link alpha.commands.model.impl.CommandBindingImpl <em>Command Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alpha.commands.model.impl.CommandBindingImpl
		 * @see alpha.commands.model.impl.ModelPackageImpl#getCommandBinding()
		 * @generated
		 */
		EClass COMMAND_BINDING = eINSTANCE.getCommandBinding();

		/**
		 * The meta object literal for the '<em><b>Bind Target Command</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND_BINDING__BIND_TARGET_COMMAND = eINSTANCE.getCommandBinding_BindTargetCommand();

		/**
		 * The meta object literal for the '<em><b>Argument Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND_BINDING__ARGUMENT_BINDINGS = eINSTANCE.getCommandBinding_ArgumentBindings();

		/**
		 * The meta object literal for the '<em><b>Argument Renamings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND_BINDING__ARGUMENT_RENAMINGS = eINSTANCE.getCommandBinding_ArgumentRenamings();

		/**
		 * The meta object literal for the '{@link alpha.commands.model.impl.ArgumentBindingImpl <em>Argument Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alpha.commands.model.impl.ArgumentBindingImpl
		 * @see alpha.commands.model.impl.ModelPackageImpl#getArgumentBinding()
		 * @generated
		 */
		EClass ARGUMENT_BINDING = eINSTANCE.getArgumentBinding();

		/**
		 * The meta object literal for the '<em><b>Bind Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT_BINDING__BIND_TARGET = eINSTANCE.getArgumentBinding_BindTarget();

		/**
		 * The meta object literal for the '<em><b>Bind Source</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT_BINDING__BIND_SOURCE = eINSTANCE.getArgumentBinding_BindSource();

		/**
		 * The meta object literal for the '{@link alpha.commands.model.impl.ArgumentRenamingImpl <em>Argument Renaming</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alpha.commands.model.impl.ArgumentRenamingImpl
		 * @see alpha.commands.model.impl.ModelPackageImpl#getArgumentRenaming()
		 * @generated
		 */
		EClass ARGUMENT_RENAMING = eINSTANCE.getArgumentRenaming();

		/**
		 * The meta object literal for the '<em><b>Bind Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT_RENAMING__BIND_TARGET = eINSTANCE.getArgumentRenaming_BindTarget();

		/**
		 * The meta object literal for the '<em><b>Bind Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT_RENAMING__BIND_SOURCE = eINSTANCE.getArgumentRenaming_BindSource();

		/**
		 * The meta object literal for the '{@link alpha.commands.model.impl.AlphaCommandSignatureImpl <em>Alpha Command Signature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alpha.commands.model.impl.AlphaCommandSignatureImpl
		 * @see alpha.commands.model.impl.ModelPackageImpl#getAlphaCommandSignature()
		 * @generated
		 */
		EClass ALPHA_COMMAND_SIGNATURE = eINSTANCE.getAlphaCommandSignature();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALPHA_COMMAND_SIGNATURE__ARGUMENTS = eINSTANCE.getAlphaCommandSignature_Arguments();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALPHA_COMMAND_SIGNATURE__RETURN_TYPE = eINSTANCE.getAlphaCommandSignature_ReturnType();

		/**
		 * The meta object literal for the '{@link alpha.commands.model.impl.AlphaCommandSpecializationImpl <em>Alpha Command Specialization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alpha.commands.model.impl.AlphaCommandSpecializationImpl
		 * @see alpha.commands.model.impl.ModelPackageImpl#getAlphaCommandSpecialization()
		 * @generated
		 */
		EClass ALPHA_COMMAND_SPECIALIZATION = eINSTANCE.getAlphaCommandSpecialization();

		/**
		 * The meta object literal for the '<em><b>Command</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALPHA_COMMAND_SPECIALIZATION__COMMAND = eINSTANCE.getAlphaCommandSpecialization_Command();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALPHA_COMMAND_SPECIALIZATION__ARGUMENTS = eINSTANCE.getAlphaCommandSpecialization_Arguments();

		/**
		 * The meta object literal for the '{@link alpha.commands.model.impl.AlphaCommandArgumentImpl <em>Alpha Command Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alpha.commands.model.impl.AlphaCommandArgumentImpl
		 * @see alpha.commands.model.impl.ModelPackageImpl#getAlphaCommandArgument()
		 * @generated
		 */
		EClass ALPHA_COMMAND_ARGUMENT = eINSTANCE.getAlphaCommandArgument();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALPHA_COMMAND_ARGUMENT__NAME = eINSTANCE.getAlphaCommandArgument_Name();

		/**
		 * The meta object literal for the '<em><b>Argument Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALPHA_COMMAND_ARGUMENT__ARGUMENT_TYPE = eINSTANCE.getAlphaCommandArgument_ArgumentType();

		/**
		 * The meta object literal for the '{@link alpha.commands.model.impl.CommandArgumentSpecializationImpl <em>Command Argument Specialization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alpha.commands.model.impl.CommandArgumentSpecializationImpl
		 * @see alpha.commands.model.impl.ModelPackageImpl#getCommandArgumentSpecialization()
		 * @generated
		 */
		EClass COMMAND_ARGUMENT_SPECIALIZATION = eINSTANCE.getCommandArgumentSpecialization();

		/**
		 * The meta object literal for the '{@link alpha.commands.model.impl.OverrideArgumentImpl <em>Override Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alpha.commands.model.impl.OverrideArgumentImpl
		 * @see alpha.commands.model.impl.ModelPackageImpl#getOverrideArgument()
		 * @generated
		 */
		EClass OVERRIDE_ARGUMENT = eINSTANCE.getOverrideArgument();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OVERRIDE_ARGUMENT__NAME = eINSTANCE.getOverrideArgument_Name();

		/**
		 * The meta object literal for the '<em><b>Argument Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OVERRIDE_ARGUMENT__ARGUMENT_TYPE = eINSTANCE.getOverrideArgument_ArgumentType();

		/**
		 * The meta object literal for the '{@link alpha.commands.model.impl.DefaultValueArgumentImpl <em>Default Value Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alpha.commands.model.impl.DefaultValueArgumentImpl
		 * @see alpha.commands.model.impl.ModelPackageImpl#getDefaultValueArgument()
		 * @generated
		 */
		EClass DEFAULT_VALUE_ARGUMENT = eINSTANCE.getDefaultValueArgument();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_VALUE_ARGUMENT__VALUE = eINSTANCE.getDefaultValueArgument_Value();

		/**
		 * The meta object literal for the '{@link alpha.commands.model.impl.SameAsParentArgumentImpl <em>Same As Parent Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alpha.commands.model.impl.SameAsParentArgumentImpl
		 * @see alpha.commands.model.impl.ModelPackageImpl#getSameAsParentArgument()
		 * @generated
		 */
		EClass SAME_AS_PARENT_ARGUMENT = eINSTANCE.getSameAsParentArgument();

		/**
		 * The meta object literal for the '{@link alpha.commands.model.ArgumentType <em>Argument Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alpha.commands.model.ArgumentType
		 * @see alpha.commands.model.impl.ModelPackageImpl#getArgumentType()
		 * @generated
		 */
		EEnum ARGUMENT_TYPE = eINSTANCE.getArgumentType();

	}

} //ModelPackage
