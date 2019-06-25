/**
 */
package alpha.commands.model.impl;

import alpha.commands.model.AlphaCommand;
import alpha.commands.model.ArgumentBinding;
import alpha.commands.model.ArgumentRenaming;
import alpha.commands.model.CommandBinding;
import alpha.commands.model.ModelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Command Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alpha.commands.model.impl.CommandBindingImpl#getBindTargetCommand <em>Bind Target Command</em>}</li>
 *   <li>{@link alpha.commands.model.impl.CommandBindingImpl#getArgumentBindings <em>Argument Bindings</em>}</li>
 *   <li>{@link alpha.commands.model.impl.CommandBindingImpl#getArgumentRenamings <em>Argument Renamings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommandBindingImpl extends MinimalEObjectImpl.Container implements CommandBinding {
	/**
	 * The cached value of the '{@link #getBindTargetCommand() <em>Bind Target Command</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindTargetCommand()
	 * @generated
	 * @ordered
	 */
	protected AlphaCommand bindTargetCommand;

	/**
	 * The cached value of the '{@link #getArgumentBindings() <em>Argument Bindings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgumentBindings()
	 * @generated
	 * @ordered
	 */
	protected EList<ArgumentBinding> argumentBindings;

	/**
	 * The cached value of the '{@link #getArgumentRenamings() <em>Argument Renamings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgumentRenamings()
	 * @generated
	 * @ordered
	 */
	protected EList<ArgumentRenaming> argumentRenamings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommandBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.COMMAND_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlphaCommand getBindTargetCommand() {
		if (bindTargetCommand != null && bindTargetCommand.eIsProxy()) {
			InternalEObject oldBindTargetCommand = (InternalEObject)bindTargetCommand;
			bindTargetCommand = (AlphaCommand)eResolveProxy(oldBindTargetCommand);
			if (bindTargetCommand != oldBindTargetCommand) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.COMMAND_BINDING__BIND_TARGET_COMMAND, oldBindTargetCommand, bindTargetCommand));
			}
		}
		return bindTargetCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlphaCommand basicGetBindTargetCommand() {
		return bindTargetCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBindTargetCommand(AlphaCommand newBindTargetCommand) {
		AlphaCommand oldBindTargetCommand = bindTargetCommand;
		bindTargetCommand = newBindTargetCommand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.COMMAND_BINDING__BIND_TARGET_COMMAND, oldBindTargetCommand, bindTargetCommand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArgumentBinding> getArgumentBindings() {
		if (argumentBindings == null) {
			argumentBindings = new EObjectContainmentEList<ArgumentBinding>(ArgumentBinding.class, this, ModelPackage.COMMAND_BINDING__ARGUMENT_BINDINGS);
		}
		return argumentBindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArgumentRenaming> getArgumentRenamings() {
		if (argumentRenamings == null) {
			argumentRenamings = new EObjectContainmentEList<ArgumentRenaming>(ArgumentRenaming.class, this, ModelPackage.COMMAND_BINDING__ARGUMENT_RENAMINGS);
		}
		return argumentRenamings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.COMMAND_BINDING__ARGUMENT_BINDINGS:
				return ((InternalEList<?>)getArgumentBindings()).basicRemove(otherEnd, msgs);
			case ModelPackage.COMMAND_BINDING__ARGUMENT_RENAMINGS:
				return ((InternalEList<?>)getArgumentRenamings()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.COMMAND_BINDING__BIND_TARGET_COMMAND:
				if (resolve) return getBindTargetCommand();
				return basicGetBindTargetCommand();
			case ModelPackage.COMMAND_BINDING__ARGUMENT_BINDINGS:
				return getArgumentBindings();
			case ModelPackage.COMMAND_BINDING__ARGUMENT_RENAMINGS:
				return getArgumentRenamings();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.COMMAND_BINDING__BIND_TARGET_COMMAND:
				setBindTargetCommand((AlphaCommand)newValue);
				return;
			case ModelPackage.COMMAND_BINDING__ARGUMENT_BINDINGS:
				getArgumentBindings().clear();
				getArgumentBindings().addAll((Collection<? extends ArgumentBinding>)newValue);
				return;
			case ModelPackage.COMMAND_BINDING__ARGUMENT_RENAMINGS:
				getArgumentRenamings().clear();
				getArgumentRenamings().addAll((Collection<? extends ArgumentRenaming>)newValue);
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
			case ModelPackage.COMMAND_BINDING__BIND_TARGET_COMMAND:
				setBindTargetCommand((AlphaCommand)null);
				return;
			case ModelPackage.COMMAND_BINDING__ARGUMENT_BINDINGS:
				getArgumentBindings().clear();
				return;
			case ModelPackage.COMMAND_BINDING__ARGUMENT_RENAMINGS:
				getArgumentRenamings().clear();
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
			case ModelPackage.COMMAND_BINDING__BIND_TARGET_COMMAND:
				return bindTargetCommand != null;
			case ModelPackage.COMMAND_BINDING__ARGUMENT_BINDINGS:
				return argumentBindings != null && !argumentBindings.isEmpty();
			case ModelPackage.COMMAND_BINDING__ARGUMENT_RENAMINGS:
				return argumentRenamings != null && !argumentRenamings.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CommandBindingImpl
