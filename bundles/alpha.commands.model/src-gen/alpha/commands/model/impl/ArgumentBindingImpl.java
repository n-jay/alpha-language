/**
 */
package alpha.commands.model.impl;

import alpha.commands.model.AlphaCommandArgument;
import alpha.commands.model.ArgumentBinding;
import alpha.commands.model.ModelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Argument Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alpha.commands.model.impl.ArgumentBindingImpl#getBindTarget <em>Bind Target</em>}</li>
 *   <li>{@link alpha.commands.model.impl.ArgumentBindingImpl#getBindSource <em>Bind Source</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArgumentBindingImpl extends MinimalEObjectImpl.Container implements ArgumentBinding {
	/**
	 * The cached value of the '{@link #getBindTarget() <em>Bind Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindTarget()
	 * @generated
	 * @ordered
	 */
	protected AlphaCommandArgument bindTarget;

	/**
	 * The cached value of the '{@link #getBindSource() <em>Bind Source</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindSource()
	 * @generated
	 * @ordered
	 */
	protected EList<AlphaCommandArgument> bindSource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArgumentBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.ARGUMENT_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AlphaCommandArgument getBindTarget() {
		if (bindTarget != null && bindTarget.eIsProxy()) {
			InternalEObject oldBindTarget = (InternalEObject)bindTarget;
			bindTarget = (AlphaCommandArgument)eResolveProxy(oldBindTarget);
			if (bindTarget != oldBindTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.ARGUMENT_BINDING__BIND_TARGET, oldBindTarget, bindTarget));
			}
		}
		return bindTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlphaCommandArgument basicGetBindTarget() {
		return bindTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBindTarget(AlphaCommandArgument newBindTarget) {
		AlphaCommandArgument oldBindTarget = bindTarget;
		bindTarget = newBindTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ARGUMENT_BINDING__BIND_TARGET, oldBindTarget, bindTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AlphaCommandArgument> getBindSource() {
		if (bindSource == null) {
			bindSource = new EObjectResolvingEList<AlphaCommandArgument>(AlphaCommandArgument.class, this, ModelPackage.ARGUMENT_BINDING__BIND_SOURCE);
		}
		return bindSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.ARGUMENT_BINDING__BIND_TARGET:
				if (resolve) return getBindTarget();
				return basicGetBindTarget();
			case ModelPackage.ARGUMENT_BINDING__BIND_SOURCE:
				return getBindSource();
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
			case ModelPackage.ARGUMENT_BINDING__BIND_TARGET:
				setBindTarget((AlphaCommandArgument)newValue);
				return;
			case ModelPackage.ARGUMENT_BINDING__BIND_SOURCE:
				getBindSource().clear();
				getBindSource().addAll((Collection<? extends AlphaCommandArgument>)newValue);
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
			case ModelPackage.ARGUMENT_BINDING__BIND_TARGET:
				setBindTarget((AlphaCommandArgument)null);
				return;
			case ModelPackage.ARGUMENT_BINDING__BIND_SOURCE:
				getBindSource().clear();
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
			case ModelPackage.ARGUMENT_BINDING__BIND_TARGET:
				return bindTarget != null;
			case ModelPackage.ARGUMENT_BINDING__BIND_SOURCE:
				return bindSource != null && !bindSource.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ArgumentBindingImpl
