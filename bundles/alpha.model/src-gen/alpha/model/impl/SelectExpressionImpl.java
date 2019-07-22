/**
 */
package alpha.model.impl;

import alpha.model.AlphaExpression;
import alpha.model.AlphaExpressionVisitor;
import alpha.model.CalculatorExpression;
import alpha.model.ModelPackage;
import alpha.model.POLY_OBJECT_TYPE;
import alpha.model.SelectExpression;

import com.google.common.base.Objects;

import fr.irisa.cairn.jnimap.isl.ISLMap;

import fr.irisa.cairn.jnimap.runtime.JNIObject;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Select Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alpha.model.impl.SelectExpressionImpl#getRelationExpr <em>Relation Expr</em>}</li>
 *   <li>{@link alpha.model.impl.SelectExpressionImpl#getExpr <em>Expr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SelectExpressionImpl extends AlphaExpressionImpl implements SelectExpression {
	/**
	 * The cached value of the '{@link #getRelationExpr() <em>Relation Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationExpr()
	 * @generated
	 * @ordered
	 */
	protected CalculatorExpression relationExpr;

	/**
	 * The cached value of the '{@link #getExpr() <em>Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpr()
	 * @generated
	 * @ordered
	 */
	protected AlphaExpression expr;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelectExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.SELECT_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalculatorExpression getRelationExpr() {
		return relationExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelationExpr(CalculatorExpression newRelationExpr, NotificationChain msgs) {
		CalculatorExpression oldRelationExpr = relationExpr;
		relationExpr = newRelationExpr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.SELECT_EXPRESSION__RELATION_EXPR, oldRelationExpr, newRelationExpr);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelationExpr(CalculatorExpression newRelationExpr) {
		if (newRelationExpr != relationExpr) {
			NotificationChain msgs = null;
			if (relationExpr != null)
				msgs = ((InternalEObject)relationExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.SELECT_EXPRESSION__RELATION_EXPR, null, msgs);
			if (newRelationExpr != null)
				msgs = ((InternalEObject)newRelationExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.SELECT_EXPRESSION__RELATION_EXPR, null, msgs);
			msgs = basicSetRelationExpr(newRelationExpr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SELECT_EXPRESSION__RELATION_EXPR, newRelationExpr, newRelationExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlphaExpression getExpr() {
		return expr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpr(AlphaExpression newExpr, NotificationChain msgs) {
		AlphaExpression oldExpr = expr;
		expr = newExpr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.SELECT_EXPRESSION__EXPR, oldExpr, newExpr);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpr(AlphaExpression newExpr) {
		if (newExpr != expr) {
			NotificationChain msgs = null;
			if (expr != null)
				msgs = ((InternalEObject)expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.SELECT_EXPRESSION__EXPR, null, msgs);
			if (newExpr != null)
				msgs = ((InternalEObject)newExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.SELECT_EXPRESSION__EXPR, null, msgs);
			msgs = basicSetExpr(newExpr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SELECT_EXPRESSION__EXPR, newExpr, newExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISLMap getSelectRelation() {
		ISLMap _xifexpression = null;
		POLY_OBJECT_TYPE _type = this.getRelationExpr().getType();
		boolean _notEquals = (!Objects.equal(_type, POLY_OBJECT_TYPE.MAP));
		if (_notEquals) {
			_xifexpression = null;
		}
		else {
			JNIObject _iSLObject = this.getRelationExpr().getISLObject();
			_xifexpression = ((ISLMap) _iSLObject);
		}
		return _xifexpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void accept(final AlphaExpressionVisitor visitor) {
		visitor.visitSelectExpression(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.SELECT_EXPRESSION__RELATION_EXPR:
				return basicSetRelationExpr(null, msgs);
			case ModelPackage.SELECT_EXPRESSION__EXPR:
				return basicSetExpr(null, msgs);
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
			case ModelPackage.SELECT_EXPRESSION__RELATION_EXPR:
				return getRelationExpr();
			case ModelPackage.SELECT_EXPRESSION__EXPR:
				return getExpr();
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
			case ModelPackage.SELECT_EXPRESSION__RELATION_EXPR:
				setRelationExpr((CalculatorExpression)newValue);
				return;
			case ModelPackage.SELECT_EXPRESSION__EXPR:
				setExpr((AlphaExpression)newValue);
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
			case ModelPackage.SELECT_EXPRESSION__RELATION_EXPR:
				setRelationExpr((CalculatorExpression)null);
				return;
			case ModelPackage.SELECT_EXPRESSION__EXPR:
				setExpr((AlphaExpression)null);
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
			case ModelPackage.SELECT_EXPRESSION__RELATION_EXPR:
				return relationExpr != null;
			case ModelPackage.SELECT_EXPRESSION__EXPR:
				return expr != null;
		}
		return super.eIsSet(featureID);
	}

} //SelectExpressionImpl
