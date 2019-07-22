/**
 */
package alpha.model.impl;

import alpha.model.AlphaVisitor;
import alpha.model.CalculatorExpression;
import alpha.model.FuzzyVariable;
import alpha.model.ModelPackage;
import alpha.model.POLY_OBJECT_TYPE;

import com.google.common.base.Objects;

import fr.irisa.cairn.jnimap.isl.ISLMap;
import fr.irisa.cairn.jnimap.isl.ISLSet;

import fr.irisa.cairn.jnimap.runtime.JNIObject;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fuzzy Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alpha.model.impl.FuzzyVariableImpl#getRangeExpr <em>Range Expr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FuzzyVariableImpl extends VariableImpl implements FuzzyVariable {
	/**
	 * The cached value of the '{@link #getRangeExpr() <em>Range Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRangeExpr()
	 * @generated
	 * @ordered
	 */
	protected CalculatorExpression rangeExpr;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FuzzyVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.FUZZY_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalculatorExpression getRangeExpr() {
		return rangeExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRangeExpr(CalculatorExpression newRangeExpr, NotificationChain msgs) {
		CalculatorExpression oldRangeExpr = rangeExpr;
		rangeExpr = newRangeExpr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.FUZZY_VARIABLE__RANGE_EXPR, oldRangeExpr, newRangeExpr);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRangeExpr(CalculatorExpression newRangeExpr) {
		if (newRangeExpr != rangeExpr) {
			NotificationChain msgs = null;
			if (rangeExpr != null)
				msgs = ((InternalEObject)rangeExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.FUZZY_VARIABLE__RANGE_EXPR, null, msgs);
			if (newRangeExpr != null)
				msgs = ((InternalEObject)newRangeExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.FUZZY_VARIABLE__RANGE_EXPR, null, msgs);
			msgs = basicSetRangeExpr(newRangeExpr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FUZZY_VARIABLE__RANGE_EXPR, newRangeExpr, newRangeExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISLSet getRange() {
		ISLSet _xifexpression = null;
		POLY_OBJECT_TYPE _type = this.getRangeExpr().getType();
		boolean _notEquals = (!Objects.equal(_type, POLY_OBJECT_TYPE.SET));
		if (_notEquals) {
			_xifexpression = null;
		}
		else {
			JNIObject _iSLObject = this.getRangeExpr().getISLObject();
			_xifexpression = ((ISLSet) _iSLObject);
		}
		return _xifexpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISLMap getRelation() {
		ISLMap _xblockexpression = null;
		{
			final ISLSet dom = this.getDomain();
			final ISLSet ran = this.getRange();
			ISLMap _xifexpression = null;
			if (((dom == null) || (ran == null))) {
				_xifexpression = null;
			}
			else {
				_xifexpression = dom.product(ran).unwrap();
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
	public void accept(final AlphaVisitor visitor) {
		visitor.visitVariable(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.FUZZY_VARIABLE__RANGE_EXPR:
				return basicSetRangeExpr(null, msgs);
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
			case ModelPackage.FUZZY_VARIABLE__RANGE_EXPR:
				return getRangeExpr();
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
			case ModelPackage.FUZZY_VARIABLE__RANGE_EXPR:
				setRangeExpr((CalculatorExpression)newValue);
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
			case ModelPackage.FUZZY_VARIABLE__RANGE_EXPR:
				setRangeExpr((CalculatorExpression)null);
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
			case ModelPackage.FUZZY_VARIABLE__RANGE_EXPR:
				return rangeExpr != null;
		}
		return super.eIsSet(featureID);
	}

} //FuzzyVariableImpl
