/**
 */
package alpha.commands.model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see alpha.commands.model.ModelPackage
 * @generated
 */
public interface ModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelFactory eINSTANCE = alpha.commands.model.impl.ModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Alpha Commands Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Alpha Commands Root</em>'.
	 * @generated
	 */
	AlphaCommandsRoot createAlphaCommandsRoot();

	/**
	 * Returns a new object of class '<em>Alpha Command Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Alpha Command Category</em>'.
	 * @generated
	 */
	AlphaCommandCategory createAlphaCommandCategory();

	/**
	 * Returns a new object of class '<em>Alpha Command</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Alpha Command</em>'.
	 * @generated
	 */
	AlphaCommand createAlphaCommand();

	/**
	 * Returns a new object of class '<em>Command Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Command Binding</em>'.
	 * @generated
	 */
	CommandBinding createCommandBinding();

	/**
	 * Returns a new object of class '<em>Argument Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Argument Binding</em>'.
	 * @generated
	 */
	ArgumentBinding createArgumentBinding();

	/**
	 * Returns a new object of class '<em>Argument Renaming</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Argument Renaming</em>'.
	 * @generated
	 */
	ArgumentRenaming createArgumentRenaming();

	/**
	 * Returns a new object of class '<em>Alpha Command Signature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Alpha Command Signature</em>'.
	 * @generated
	 */
	AlphaCommandSignature createAlphaCommandSignature();

	/**
	 * Returns a new object of class '<em>Alpha Command Specialization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Alpha Command Specialization</em>'.
	 * @generated
	 */
	AlphaCommandSpecialization createAlphaCommandSpecialization();

	/**
	 * Returns a new object of class '<em>Alpha Command Argument</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Alpha Command Argument</em>'.
	 * @generated
	 */
	AlphaCommandArgument createAlphaCommandArgument();

	/**
	 * Returns a new object of class '<em>Override Argument</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Override Argument</em>'.
	 * @generated
	 */
	OverrideArgument createOverrideArgument();

	/**
	 * Returns a new object of class '<em>Default Value Argument</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Default Value Argument</em>'.
	 * @generated
	 */
	DefaultValueArgument createDefaultValueArgument();

	/**
	 * Returns a new object of class '<em>Same As Parent Argument</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Same As Parent Argument</em>'.
	 * @generated
	 */
	SameAsParentArgument createSameAsParentArgument();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ModelPackage getModelPackage();

} //ModelFactory
