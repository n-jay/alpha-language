/**
 */
package alpha.model.impl;

import alpha.model.AlphaExpressionVisitor;
import alpha.model.ExternalFunction;
import alpha.model.ExternalMultiArgExpression;
import alpha.model.ModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>External Multi Arg Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alpha.model.impl.ExternalMultiArgExpressionImpl#getExternalFunction <em>External Function</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExternalMultiArgExpressionImpl extends MultiArgExpressionImpl implements ExternalMultiArgExpression {
	/**
	 * The cached value of the '{@link #getExternalFunction() <em>External Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalFunction()
	 * @generated
	 * @ordered
	 */
	protected ExternalFunction externalFunction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalMultiArgExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.EXTERNAL_MULTI_ARG_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalFunction getExternalFunction() {
		if (externalFunction != null && externalFunction.eIsProxy()) {
			InternalEObject oldExternalFunction = (InternalEObject)externalFunction;
			externalFunction = (ExternalFunction)eResolveProxy(oldExternalFunction);
			if (externalFunction != oldExternalFunction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.EXTERNAL_MULTI_ARG_EXPRESSION__EXTERNAL_FUNCTION, oldExternalFunction, externalFunction));
			}
		}
		return externalFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalFunction basicGetExternalFunction() {
		return externalFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExternalFunction(ExternalFunction newExternalFunction) {
		ExternalFunction oldExternalFunction = externalFunction;
		externalFunction = newExternalFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EXTERNAL_MULTI_ARG_EXPRESSION__EXTERNAL_FUNCTION, oldExternalFunction, externalFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void accept(final AlphaExpressionVisitor visitor) {
		visitor.visitExternalMultiArgExpression(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.EXTERNAL_MULTI_ARG_EXPRESSION__EXTERNAL_FUNCTION:
				if (resolve) return getExternalFunction();
				return basicGetExternalFunction();
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
			case ModelPackage.EXTERNAL_MULTI_ARG_EXPRESSION__EXTERNAL_FUNCTION:
				setExternalFunction((ExternalFunction)newValue);
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
			case ModelPackage.EXTERNAL_MULTI_ARG_EXPRESSION__EXTERNAL_FUNCTION:
				setExternalFunction((ExternalFunction)null);
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
			case ModelPackage.EXTERNAL_MULTI_ARG_EXPRESSION__EXTERNAL_FUNCTION:
				return externalFunction != null;
		}
		return super.eIsSet(featureID);
	}

} //ExternalMultiArgExpressionImpl
