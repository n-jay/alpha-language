/**
 */
package alpha.model.impl;

import alpha.model.AlphaExpression;
import alpha.model.AlphaExpressionVisitor;
import alpha.model.CalculatorExpression;
import alpha.model.ConvolutionExpression;
import alpha.model.ModelPackage;
import alpha.model.POLY_OBJECT_TYPE;

import com.google.common.base.Objects;

import fr.irisa.cairn.jnimap.isl.jni.JNIISLSet;

import fr.irisa.cairn.jnimap.runtime.JNIObject;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Convolution Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alpha.model.impl.ConvolutionExpressionImpl#getKernelDomainExpr <em>Kernel Domain Expr</em>}</li>
 *   <li>{@link alpha.model.impl.ConvolutionExpressionImpl#getKernelExpression <em>Kernel Expression</em>}</li>
 *   <li>{@link alpha.model.impl.ConvolutionExpressionImpl#getDataExpression <em>Data Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConvolutionExpressionImpl extends AlphaExpressionImpl implements ConvolutionExpression {
	/**
	 * The cached value of the '{@link #getKernelDomainExpr() <em>Kernel Domain Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKernelDomainExpr()
	 * @generated
	 * @ordered
	 */
	protected CalculatorExpression kernelDomainExpr;

	/**
	 * The cached value of the '{@link #getKernelExpression() <em>Kernel Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKernelExpression()
	 * @generated
	 * @ordered
	 */
	protected AlphaExpression kernelExpression;

	/**
	 * The cached value of the '{@link #getDataExpression() <em>Data Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataExpression()
	 * @generated
	 * @ordered
	 */
	protected AlphaExpression dataExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConvolutionExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.CONVOLUTION_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalculatorExpression getKernelDomainExpr() {
		return kernelDomainExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKernelDomainExpr(CalculatorExpression newKernelDomainExpr, NotificationChain msgs) {
		CalculatorExpression oldKernelDomainExpr = kernelDomainExpr;
		kernelDomainExpr = newKernelDomainExpr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.CONVOLUTION_EXPRESSION__KERNEL_DOMAIN_EXPR, oldKernelDomainExpr, newKernelDomainExpr);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKernelDomainExpr(CalculatorExpression newKernelDomainExpr) {
		if (newKernelDomainExpr != kernelDomainExpr) {
			NotificationChain msgs = null;
			if (kernelDomainExpr != null)
				msgs = ((InternalEObject)kernelDomainExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.CONVOLUTION_EXPRESSION__KERNEL_DOMAIN_EXPR, null, msgs);
			if (newKernelDomainExpr != null)
				msgs = ((InternalEObject)newKernelDomainExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.CONVOLUTION_EXPRESSION__KERNEL_DOMAIN_EXPR, null, msgs);
			msgs = basicSetKernelDomainExpr(newKernelDomainExpr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CONVOLUTION_EXPRESSION__KERNEL_DOMAIN_EXPR, newKernelDomainExpr, newKernelDomainExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlphaExpression getKernelExpression() {
		return kernelExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKernelExpression(AlphaExpression newKernelExpression, NotificationChain msgs) {
		AlphaExpression oldKernelExpression = kernelExpression;
		kernelExpression = newKernelExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.CONVOLUTION_EXPRESSION__KERNEL_EXPRESSION, oldKernelExpression, newKernelExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKernelExpression(AlphaExpression newKernelExpression) {
		if (newKernelExpression != kernelExpression) {
			NotificationChain msgs = null;
			if (kernelExpression != null)
				msgs = ((InternalEObject)kernelExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.CONVOLUTION_EXPRESSION__KERNEL_EXPRESSION, null, msgs);
			if (newKernelExpression != null)
				msgs = ((InternalEObject)newKernelExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.CONVOLUTION_EXPRESSION__KERNEL_EXPRESSION, null, msgs);
			msgs = basicSetKernelExpression(newKernelExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CONVOLUTION_EXPRESSION__KERNEL_EXPRESSION, newKernelExpression, newKernelExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlphaExpression getDataExpression() {
		return dataExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataExpression(AlphaExpression newDataExpression, NotificationChain msgs) {
		AlphaExpression oldDataExpression = dataExpression;
		dataExpression = newDataExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.CONVOLUTION_EXPRESSION__DATA_EXPRESSION, oldDataExpression, newDataExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataExpression(AlphaExpression newDataExpression) {
		if (newDataExpression != dataExpression) {
			NotificationChain msgs = null;
			if (dataExpression != null)
				msgs = ((InternalEObject)dataExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.CONVOLUTION_EXPRESSION__DATA_EXPRESSION, null, msgs);
			if (newDataExpression != null)
				msgs = ((InternalEObject)newDataExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.CONVOLUTION_EXPRESSION__DATA_EXPRESSION, null, msgs);
			msgs = basicSetDataExpression(newDataExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CONVOLUTION_EXPRESSION__DATA_EXPRESSION, newDataExpression, newDataExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JNIISLSet getKernelDomain() {
		JNIISLSet _xifexpression = null;
		POLY_OBJECT_TYPE _type = this.getKernelDomainExpr().getType();
		boolean _notEquals = (!Objects.equal(_type, POLY_OBJECT_TYPE.SET));
		if (_notEquals) {
			_xifexpression = null;
		}
		else {
			JNIObject _iSLObject = this.getKernelDomainExpr().getISLObject();
			_xifexpression = ((JNIISLSet) _iSLObject);
		}
		return _xifexpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void accept(final AlphaExpressionVisitor visitor) {
		visitor.visitConvolutionExpression(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.CONVOLUTION_EXPRESSION__KERNEL_DOMAIN_EXPR:
				return basicSetKernelDomainExpr(null, msgs);
			case ModelPackage.CONVOLUTION_EXPRESSION__KERNEL_EXPRESSION:
				return basicSetKernelExpression(null, msgs);
			case ModelPackage.CONVOLUTION_EXPRESSION__DATA_EXPRESSION:
				return basicSetDataExpression(null, msgs);
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
			case ModelPackage.CONVOLUTION_EXPRESSION__KERNEL_DOMAIN_EXPR:
				return getKernelDomainExpr();
			case ModelPackage.CONVOLUTION_EXPRESSION__KERNEL_EXPRESSION:
				return getKernelExpression();
			case ModelPackage.CONVOLUTION_EXPRESSION__DATA_EXPRESSION:
				return getDataExpression();
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
			case ModelPackage.CONVOLUTION_EXPRESSION__KERNEL_DOMAIN_EXPR:
				setKernelDomainExpr((CalculatorExpression)newValue);
				return;
			case ModelPackage.CONVOLUTION_EXPRESSION__KERNEL_EXPRESSION:
				setKernelExpression((AlphaExpression)newValue);
				return;
			case ModelPackage.CONVOLUTION_EXPRESSION__DATA_EXPRESSION:
				setDataExpression((AlphaExpression)newValue);
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
			case ModelPackage.CONVOLUTION_EXPRESSION__KERNEL_DOMAIN_EXPR:
				setKernelDomainExpr((CalculatorExpression)null);
				return;
			case ModelPackage.CONVOLUTION_EXPRESSION__KERNEL_EXPRESSION:
				setKernelExpression((AlphaExpression)null);
				return;
			case ModelPackage.CONVOLUTION_EXPRESSION__DATA_EXPRESSION:
				setDataExpression((AlphaExpression)null);
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
			case ModelPackage.CONVOLUTION_EXPRESSION__KERNEL_DOMAIN_EXPR:
				return kernelDomainExpr != null;
			case ModelPackage.CONVOLUTION_EXPRESSION__KERNEL_EXPRESSION:
				return kernelExpression != null;
			case ModelPackage.CONVOLUTION_EXPRESSION__DATA_EXPRESSION:
				return dataExpression != null;
		}
		return super.eIsSet(featureID);
	}

} //ConvolutionExpressionImpl
