/**
 */
package alpha.model.impl;

import alpha.model.AlphaExpressionVisitor;
import alpha.model.JNIPolynomial;
import alpha.model.ModelPackage;
import alpha.model.POLY_OBJECT_TYPE;
import alpha.model.PolynomialIndexExpression;

import com.google.common.base.Objects;

import fr.irisa.cairn.jnimap.isl.jni.JNIISLPWQPolynomial;

import fr.irisa.cairn.jnimap.runtime.JNIObject;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Polynomial Index Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alpha.model.impl.PolynomialIndexExpressionImpl#getPolynomialExpr <em>Polynomial Expr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PolynomialIndexExpressionImpl extends AlphaExpressionImpl implements PolynomialIndexExpression {
	/**
	 * The cached value of the '{@link #getPolynomialExpr() <em>Polynomial Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolynomialExpr()
	 * @generated
	 * @ordered
	 */
	protected JNIPolynomial polynomialExpr;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PolynomialIndexExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.POLYNOMIAL_INDEX_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JNIPolynomial getPolynomialExpr() {
		return polynomialExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPolynomialExpr(JNIPolynomial newPolynomialExpr, NotificationChain msgs) {
		JNIPolynomial oldPolynomialExpr = polynomialExpr;
		polynomialExpr = newPolynomialExpr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.POLYNOMIAL_INDEX_EXPRESSION__POLYNOMIAL_EXPR, oldPolynomialExpr, newPolynomialExpr);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPolynomialExpr(JNIPolynomial newPolynomialExpr) {
		if (newPolynomialExpr != polynomialExpr) {
			NotificationChain msgs = null;
			if (polynomialExpr != null)
				msgs = ((InternalEObject)polynomialExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.POLYNOMIAL_INDEX_EXPRESSION__POLYNOMIAL_EXPR, null, msgs);
			if (newPolynomialExpr != null)
				msgs = ((InternalEObject)newPolynomialExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.POLYNOMIAL_INDEX_EXPRESSION__POLYNOMIAL_EXPR, null, msgs);
			msgs = basicSetPolynomialExpr(newPolynomialExpr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.POLYNOMIAL_INDEX_EXPRESSION__POLYNOMIAL_EXPR, newPolynomialExpr, newPolynomialExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JNIISLPWQPolynomial getPolynomial() {
		JNIISLPWQPolynomial _xifexpression = null;
		POLY_OBJECT_TYPE _type = this.getPolynomialExpr().getType();
		boolean _notEquals = (!Objects.equal(_type, POLY_OBJECT_TYPE.POLYNOMIAL));
		if (_notEquals) {
			_xifexpression = null;
		}
		else {
			JNIObject _iSLObject = this.getPolynomialExpr().getISLObject();
			_xifexpression = ((JNIISLPWQPolynomial) _iSLObject);
		}
		return _xifexpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void accept(final AlphaExpressionVisitor visitor) {
		visitor.visitPolynomialIndexExpression(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.POLYNOMIAL_INDEX_EXPRESSION__POLYNOMIAL_EXPR:
				return basicSetPolynomialExpr(null, msgs);
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
			case ModelPackage.POLYNOMIAL_INDEX_EXPRESSION__POLYNOMIAL_EXPR:
				return getPolynomialExpr();
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
			case ModelPackage.POLYNOMIAL_INDEX_EXPRESSION__POLYNOMIAL_EXPR:
				setPolynomialExpr((JNIPolynomial)newValue);
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
			case ModelPackage.POLYNOMIAL_INDEX_EXPRESSION__POLYNOMIAL_EXPR:
				setPolynomialExpr((JNIPolynomial)null);
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
			case ModelPackage.POLYNOMIAL_INDEX_EXPRESSION__POLYNOMIAL_EXPR:
				return polynomialExpr != null;
		}
		return super.eIsSet(featureID);
	}

} //PolynomialIndexExpressionImpl
