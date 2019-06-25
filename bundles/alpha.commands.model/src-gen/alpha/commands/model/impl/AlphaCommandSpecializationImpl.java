/**
 */
package alpha.commands.model.impl;

import alpha.commands.model.AlphaCommand;
import alpha.commands.model.AlphaCommandSpecialization;
import alpha.commands.model.CommandArgumentSpecialization;
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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alpha Command Specialization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alpha.commands.model.impl.AlphaCommandSpecializationImpl#getCommand <em>Command</em>}</li>
 *   <li>{@link alpha.commands.model.impl.AlphaCommandSpecializationImpl#getArguments <em>Arguments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AlphaCommandSpecializationImpl extends MinimalEObjectImpl.Container implements AlphaCommandSpecialization {
	/**
	 * The cached value of the '{@link #getArguments() <em>Arguments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArguments()
	 * @generated
	 * @ordered
	 */
	protected EList<CommandArgumentSpecialization> arguments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlphaCommandSpecializationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.ALPHA_COMMAND_SPECIALIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlphaCommand getCommand() {
		if (eContainerFeatureID() != ModelPackage.ALPHA_COMMAND_SPECIALIZATION__COMMAND) return null;
		return (AlphaCommand)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlphaCommand basicGetCommand() {
		if (eContainerFeatureID() != ModelPackage.ALPHA_COMMAND_SPECIALIZATION__COMMAND) return null;
		return (AlphaCommand)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCommand(AlphaCommand newCommand, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCommand, ModelPackage.ALPHA_COMMAND_SPECIALIZATION__COMMAND, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommand(AlphaCommand newCommand) {
		if (newCommand != eInternalContainer() || (eContainerFeatureID() != ModelPackage.ALPHA_COMMAND_SPECIALIZATION__COMMAND && newCommand != null)) {
			if (EcoreUtil.isAncestor(this, newCommand))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCommand != null)
				msgs = ((InternalEObject)newCommand).eInverseAdd(this, ModelPackage.ALPHA_COMMAND__SPECIALIZATIONS, AlphaCommand.class, msgs);
			msgs = basicSetCommand(newCommand, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ALPHA_COMMAND_SPECIALIZATION__COMMAND, newCommand, newCommand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CommandArgumentSpecialization> getArguments() {
		if (arguments == null) {
			arguments = new EObjectContainmentEList<CommandArgumentSpecialization>(CommandArgumentSpecialization.class, this, ModelPackage.ALPHA_COMMAND_SPECIALIZATION__ARGUMENTS);
		}
		return arguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.ALPHA_COMMAND_SPECIALIZATION__COMMAND:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCommand((AlphaCommand)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.ALPHA_COMMAND_SPECIALIZATION__COMMAND:
				return basicSetCommand(null, msgs);
			case ModelPackage.ALPHA_COMMAND_SPECIALIZATION__ARGUMENTS:
				return ((InternalEList<?>)getArguments()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ModelPackage.ALPHA_COMMAND_SPECIALIZATION__COMMAND:
				return eInternalContainer().eInverseRemove(this, ModelPackage.ALPHA_COMMAND__SPECIALIZATIONS, AlphaCommand.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.ALPHA_COMMAND_SPECIALIZATION__COMMAND:
				if (resolve) return getCommand();
				return basicGetCommand();
			case ModelPackage.ALPHA_COMMAND_SPECIALIZATION__ARGUMENTS:
				return getArguments();
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
			case ModelPackage.ALPHA_COMMAND_SPECIALIZATION__COMMAND:
				setCommand((AlphaCommand)newValue);
				return;
			case ModelPackage.ALPHA_COMMAND_SPECIALIZATION__ARGUMENTS:
				getArguments().clear();
				getArguments().addAll((Collection<? extends CommandArgumentSpecialization>)newValue);
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
			case ModelPackage.ALPHA_COMMAND_SPECIALIZATION__COMMAND:
				setCommand((AlphaCommand)null);
				return;
			case ModelPackage.ALPHA_COMMAND_SPECIALIZATION__ARGUMENTS:
				getArguments().clear();
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
			case ModelPackage.ALPHA_COMMAND_SPECIALIZATION__COMMAND:
				return basicGetCommand() != null;
			case ModelPackage.ALPHA_COMMAND_SPECIALIZATION__ARGUMENTS:
				return arguments != null && !arguments.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AlphaCommandSpecializationImpl
