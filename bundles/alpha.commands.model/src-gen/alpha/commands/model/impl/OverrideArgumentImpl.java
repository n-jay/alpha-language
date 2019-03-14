/**
 */
package alpha.commands.model.impl;

import alpha.commands.model.ArgumentType;
import alpha.commands.model.ModelPackage;
import alpha.commands.model.OverrideArgument;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Override Argument</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alpha.commands.model.impl.OverrideArgumentImpl#getName <em>Name</em>}</li>
 *   <li>{@link alpha.commands.model.impl.OverrideArgumentImpl#getArgumentType <em>Argument Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OverrideArgumentImpl extends CommandArgumentSpecializationImpl implements OverrideArgument {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getArgumentType() <em>Argument Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgumentType()
	 * @generated
	 * @ordered
	 */
	protected static final ArgumentType ARGUMENT_TYPE_EDEFAULT = ArgumentType.VOID;

	/**
	 * The cached value of the '{@link #getArgumentType() <em>Argument Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgumentType()
	 * @generated
	 * @ordered
	 */
	protected ArgumentType argumentType = ARGUMENT_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OverrideArgumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.OVERRIDE_ARGUMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.OVERRIDE_ARGUMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArgumentType getArgumentType() {
		return argumentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArgumentType(ArgumentType newArgumentType) {
		ArgumentType oldArgumentType = argumentType;
		argumentType = newArgumentType == null ? ARGUMENT_TYPE_EDEFAULT : newArgumentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.OVERRIDE_ARGUMENT__ARGUMENT_TYPE, oldArgumentType, argumentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.OVERRIDE_ARGUMENT__NAME:
				return getName();
			case ModelPackage.OVERRIDE_ARGUMENT__ARGUMENT_TYPE:
				return getArgumentType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.OVERRIDE_ARGUMENT__NAME:
				setName((String)newValue);
				return;
			case ModelPackage.OVERRIDE_ARGUMENT__ARGUMENT_TYPE:
				setArgumentType((ArgumentType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModelPackage.OVERRIDE_ARGUMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ModelPackage.OVERRIDE_ARGUMENT__ARGUMENT_TYPE:
				setArgumentType(ARGUMENT_TYPE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModelPackage.OVERRIDE_ARGUMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ModelPackage.OVERRIDE_ARGUMENT__ARGUMENT_TYPE:
				return argumentType != ARGUMENT_TYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", argumentType: ");
		result.append(argumentType);
		result.append(')');
		return result.toString();
	}

} //OverrideArgumentImpl
