/**
 */
package alpha.commands.model.util;

import alpha.commands.model.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see alpha.commands.model.ModelPackage
 * @generated
 */
public class ModelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelSwitch() {
		if (modelPackage == null) {
			modelPackage = ModelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ModelPackage.ALPHA_COMMANDS_ROOT: {
				AlphaCommandsRoot alphaCommandsRoot = (AlphaCommandsRoot)theEObject;
				T result = caseAlphaCommandsRoot(alphaCommandsRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ALPHA_COMMAND_CATEGORY: {
				AlphaCommandCategory alphaCommandCategory = (AlphaCommandCategory)theEObject;
				T result = caseAlphaCommandCategory(alphaCommandCategory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ALPHA_COMMAND: {
				AlphaCommand alphaCommand = (AlphaCommand)theEObject;
				T result = caseAlphaCommand(alphaCommand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.COMMAND_BINDING: {
				CommandBinding commandBinding = (CommandBinding)theEObject;
				T result = caseCommandBinding(commandBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ARGUMENT_BINDING: {
				ArgumentBinding argumentBinding = (ArgumentBinding)theEObject;
				T result = caseArgumentBinding(argumentBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ARGUMENT_RENAMING: {
				ArgumentRenaming argumentRenaming = (ArgumentRenaming)theEObject;
				T result = caseArgumentRenaming(argumentRenaming);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ALPHA_COMMAND_SIGNATURE: {
				AlphaCommandSignature alphaCommandSignature = (AlphaCommandSignature)theEObject;
				T result = caseAlphaCommandSignature(alphaCommandSignature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ALPHA_COMMAND_SPECIALIZATION: {
				AlphaCommandSpecialization alphaCommandSpecialization = (AlphaCommandSpecialization)theEObject;
				T result = caseAlphaCommandSpecialization(alphaCommandSpecialization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ALPHA_COMMAND_ARGUMENT: {
				AlphaCommandArgument alphaCommandArgument = (AlphaCommandArgument)theEObject;
				T result = caseAlphaCommandArgument(alphaCommandArgument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.COMMAND_ARGUMENT_SPECIALIZATION: {
				CommandArgumentSpecialization commandArgumentSpecialization = (CommandArgumentSpecialization)theEObject;
				T result = caseCommandArgumentSpecialization(commandArgumentSpecialization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.OVERRIDE_ARGUMENT: {
				OverrideArgument overrideArgument = (OverrideArgument)theEObject;
				T result = caseOverrideArgument(overrideArgument);
				if (result == null) result = caseCommandArgumentSpecialization(overrideArgument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.DEFAULT_VALUE_ARGUMENT: {
				DefaultValueArgument defaultValueArgument = (DefaultValueArgument)theEObject;
				T result = caseDefaultValueArgument(defaultValueArgument);
				if (result == null) result = caseCommandArgumentSpecialization(defaultValueArgument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.SAME_AS_PARENT_ARGUMENT: {
				SameAsParentArgument sameAsParentArgument = (SameAsParentArgument)theEObject;
				T result = caseSameAsParentArgument(sameAsParentArgument);
				if (result == null) result = caseCommandArgumentSpecialization(sameAsParentArgument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alpha Commands Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alpha Commands Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlphaCommandsRoot(AlphaCommandsRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alpha Command Category</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alpha Command Category</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlphaCommandCategory(AlphaCommandCategory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alpha Command</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alpha Command</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlphaCommand(AlphaCommand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Command Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Command Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommandBinding(CommandBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Argument Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Argument Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArgumentBinding(ArgumentBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Argument Renaming</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Argument Renaming</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArgumentRenaming(ArgumentRenaming object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alpha Command Signature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alpha Command Signature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlphaCommandSignature(AlphaCommandSignature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alpha Command Specialization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alpha Command Specialization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlphaCommandSpecialization(AlphaCommandSpecialization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alpha Command Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alpha Command Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlphaCommandArgument(AlphaCommandArgument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Command Argument Specialization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Command Argument Specialization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommandArgumentSpecialization(CommandArgumentSpecialization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Override Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Override Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOverrideArgument(OverrideArgument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Default Value Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Default Value Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefaultValueArgument(DefaultValueArgument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Same As Parent Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Same As Parent Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSameAsParentArgument(SameAsParentArgument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ModelSwitch
