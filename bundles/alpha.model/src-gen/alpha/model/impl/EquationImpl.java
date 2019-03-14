/**
 */
package alpha.model.impl;

import alpha.model.AlphaExpression;
import alpha.model.AlphaVisitor;
import alpha.model.Equation;
import alpha.model.ModelPackage;
import alpha.model.SystemBody;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.xtext.xbase.lib.Functions.Function1;

import org.eclipse.xtext.xbase.lib.ListExtensions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Equation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alpha.model.impl.EquationImpl#getSystemBody <em>System Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EquationImpl extends MinimalEObjectImpl.Container implements Equation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EquationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.EQUATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SystemBody getSystemBody() {
		if (eContainerFeatureID() != ModelPackage.EQUATION__SYSTEM_BODY) return null;
		return (SystemBody)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemBody basicGetSystemBody() {
		if (eContainerFeatureID() != ModelPackage.EQUATION__SYSTEM_BODY) return null;
		return (SystemBody)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSystemBody(SystemBody newSystemBody, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSystemBody, ModelPackage.EQUATION__SYSTEM_BODY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSystemBody(SystemBody newSystemBody) {
		if (newSystemBody != eInternalContainer() || (eContainerFeatureID() != ModelPackage.EQUATION__SYSTEM_BODY && newSystemBody != null)) {
			if (EcoreUtil.isAncestor(this, newSystemBody))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSystemBody != null)
				msgs = ((InternalEObject)newSystemBody).eInverseAdd(this, ModelPackage.SYSTEM_BODY__EQUATIONS, SystemBody.class, msgs);
			msgs = basicSetSystemBody(newSystemBody, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EQUATION__SYSTEM_BODY, newSystemBody, newSystemBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AlphaExpression getExpression(final Queue<Integer> exprID) {
		AlphaExpression _xblockexpression = null;
		{
			final Integer next = exprID.poll();
			AlphaExpression _xifexpression = null;
			if ((next == null)) {
				throw new RuntimeException("Invalid Expression ID");
			}
			else {
				EObject _get = this.eContents().get((next).intValue());
				_xifexpression = ((AlphaExpression) _get).getExpression(exprID);
			}
			_xblockexpression = _xifexpression;
		}
		return _xblockexpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AlphaExpression getExpression(final String exprID) {
		final Function1<String, Integer> _function = new Function1<String, Integer>() {
			public Integer apply(final String e) {
				return Integer.valueOf(Integer.parseInt(e));
			}
		};
		List<Integer> _map = ListExtensions.<String, Integer>map(((List<String>)org.eclipse.xtext.xbase.lib.Conversions.doWrapArray(exprID.split("\\s*,\\s*"))), _function);
		LinkedList<Integer> _linkedList = new LinkedList<Integer>(_map);
		return this.getExpression(_linkedList);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void accept(AlphaVisitor visitor) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.EQUATION__SYSTEM_BODY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSystemBody((SystemBody)otherEnd, msgs);
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
			case ModelPackage.EQUATION__SYSTEM_BODY:
				return basicSetSystemBody(null, msgs);
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
			case ModelPackage.EQUATION__SYSTEM_BODY:
				return eInternalContainer().eInverseRemove(this, ModelPackage.SYSTEM_BODY__EQUATIONS, SystemBody.class, msgs);
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
			case ModelPackage.EQUATION__SYSTEM_BODY:
				if (resolve) return getSystemBody();
				return basicGetSystemBody();
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
			case ModelPackage.EQUATION__SYSTEM_BODY:
				setSystemBody((SystemBody)newValue);
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
			case ModelPackage.EQUATION__SYSTEM_BODY:
				setSystemBody((SystemBody)null);
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
			case ModelPackage.EQUATION__SYSTEM_BODY:
				return basicGetSystemBody() != null;
		}
		return super.eIsSet(featureID);
	}

} //EquationImpl
