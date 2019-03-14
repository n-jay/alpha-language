/**
 */
package alpha.commands.model.impl;

import alpha.commands.model.AlphaCommandArgument;
import alpha.commands.model.ArgumentRenaming;
import alpha.commands.model.ModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Argument Renaming</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alpha.commands.model.impl.ArgumentRenamingImpl#getBindTarget <em>Bind Target</em>}</li>
 *   <li>{@link alpha.commands.model.impl.ArgumentRenamingImpl#getBindSource <em>Bind Source</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArgumentRenamingImpl extends MinimalEObjectImpl.Container implements ArgumentRenaming {
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
	 * The cached value of the '{@link #getBindSource() <em>Bind Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindSource()
	 * @generated
	 * @ordered
	 */
	protected AlphaCommandArgument bindSource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArgumentRenamingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.ARGUMENT_RENAMING;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.ARGUMENT_RENAMING__BIND_TARGET, oldBindTarget, bindTarget));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ARGUMENT_RENAMING__BIND_TARGET, oldBindTarget, bindTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AlphaCommandArgument getBindSource() {
		if (bindSource != null && bindSource.eIsProxy()) {
			InternalEObject oldBindSource = (InternalEObject)bindSource;
			bindSource = (AlphaCommandArgument)eResolveProxy(oldBindSource);
			if (bindSource != oldBindSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.ARGUMENT_RENAMING__BIND_SOURCE, oldBindSource, bindSource));
			}
		}
		return bindSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlphaCommandArgument basicGetBindSource() {
		return bindSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBindSource(AlphaCommandArgument newBindSource) {
		AlphaCommandArgument oldBindSource = bindSource;
		bindSource = newBindSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ARGUMENT_RENAMING__BIND_SOURCE, oldBindSource, bindSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.ARGUMENT_RENAMING__BIND_TARGET:
				if (resolve) return getBindTarget();
				return basicGetBindTarget();
			case ModelPackage.ARGUMENT_RENAMING__BIND_SOURCE:
				if (resolve) return getBindSource();
				return basicGetBindSource();
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
			case ModelPackage.ARGUMENT_RENAMING__BIND_TARGET:
				setBindTarget((AlphaCommandArgument)newValue);
				return;
			case ModelPackage.ARGUMENT_RENAMING__BIND_SOURCE:
				setBindSource((AlphaCommandArgument)newValue);
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
			case ModelPackage.ARGUMENT_RENAMING__BIND_TARGET:
				setBindTarget((AlphaCommandArgument)null);
				return;
			case ModelPackage.ARGUMENT_RENAMING__BIND_SOURCE:
				setBindSource((AlphaCommandArgument)null);
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
			case ModelPackage.ARGUMENT_RENAMING__BIND_TARGET:
				return bindTarget != null;
			case ModelPackage.ARGUMENT_RENAMING__BIND_SOURCE:
				return bindSource != null;
		}
		return super.eIsSet(featureID);
	}

} //ArgumentRenamingImpl
