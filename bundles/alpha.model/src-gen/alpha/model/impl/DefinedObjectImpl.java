/**
 */
package alpha.model.impl;

import alpha.model.CalculatorExpressionVisitor;
import alpha.model.DefinedObject;
import alpha.model.ModelPackage;
import alpha.model.POLY_OBJECT_TYPE;
import alpha.model.PolyhedralObject;

import alpha.model.exception.CyclicDefinitionException;

import fr.irisa.cairn.jnimap.runtime.JNIObject;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Defined Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alpha.model.impl.DefinedObjectImpl#getObject <em>Object</em>}</li>
 *   <li>{@link alpha.model.impl.DefinedObjectImpl#getZ__internalCycleDetector <em>Zinternal Cycle Detector</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DefinedObjectImpl extends CalculatorExpressionImpl implements DefinedObject {
	/**
	 * The cached value of the '{@link #getObject() <em>Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObject()
	 * @generated
	 * @ordered
	 */
	protected PolyhedralObject object;

	/**
	 * The default value of the '{@link #getZ__internalCycleDetector() <em>Zinternal Cycle Detector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZ__internalCycleDetector()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ZINTERNAL_CYCLE_DETECTOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZ__internalCycleDetector() <em>Zinternal Cycle Detector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZ__internalCycleDetector()
	 * @generated
	 * @ordered
	 */
	protected Boolean z__internalCycleDetector = ZINTERNAL_CYCLE_DETECTOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DefinedObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.DEFINED_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PolyhedralObject getObject() {
		if (object != null && object.eIsProxy()) {
			InternalEObject oldObject = (InternalEObject)object;
			object = (PolyhedralObject)eResolveProxy(oldObject);
			if (object != oldObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.DEFINED_OBJECT__OBJECT, oldObject, object));
			}
		}
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolyhedralObject basicGetObject() {
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setObject(PolyhedralObject newObject) {
		PolyhedralObject oldObject = object;
		object = newObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.DEFINED_OBJECT__OBJECT, oldObject, object));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getZ__internalCycleDetector() {
		return z__internalCycleDetector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setZ__internalCycleDetector(Boolean newZ__internalCycleDetector) {
		Boolean oldZ__internalCycleDetector = z__internalCycleDetector;
		z__internalCycleDetector = newZ__internalCycleDetector;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.DEFINED_OBJECT__ZINTERNAL_CYCLE_DETECTOR, oldZ__internalCycleDetector, z__internalCycleDetector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public POLY_OBJECT_TYPE getType() {
		return this.getObject().getType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JNIObject getISLObject() {
		PolyhedralObject _object = this.getObject();
		boolean _tripleNotEquals = (_object != null);
		if (_tripleNotEquals) {
			Boolean _z__internalCycleDetector = this.getZ__internalCycleDetector();
			if ((_z__internalCycleDetector).booleanValue()) {
				String _name = this.getObject().getName();
				String _plus = ("Cycle detected in the definition of: " + _name);
				throw new CyclicDefinitionException(_plus);
			}
			this.setZ__internalCycleDetector(Boolean.valueOf(true));
			final JNIObject res = this.getObject().getISLObject();
			this.setZ__internalCycleDetector(Boolean.valueOf(false));
			return res;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void accept(final CalculatorExpressionVisitor visitor) {
		visitor.visitDefinedObject(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String plainToString() {
		return this.getObject().getName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.DEFINED_OBJECT__OBJECT:
				if (resolve) return getObject();
				return basicGetObject();
			case ModelPackage.DEFINED_OBJECT__ZINTERNAL_CYCLE_DETECTOR:
				return getZ__internalCycleDetector();
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
			case ModelPackage.DEFINED_OBJECT__OBJECT:
				setObject((PolyhedralObject)newValue);
				return;
			case ModelPackage.DEFINED_OBJECT__ZINTERNAL_CYCLE_DETECTOR:
				setZ__internalCycleDetector((Boolean)newValue);
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
			case ModelPackage.DEFINED_OBJECT__OBJECT:
				setObject((PolyhedralObject)null);
				return;
			case ModelPackage.DEFINED_OBJECT__ZINTERNAL_CYCLE_DETECTOR:
				setZ__internalCycleDetector(ZINTERNAL_CYCLE_DETECTOR_EDEFAULT);
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
			case ModelPackage.DEFINED_OBJECT__OBJECT:
				return object != null;
			case ModelPackage.DEFINED_OBJECT__ZINTERNAL_CYCLE_DETECTOR:
				return ZINTERNAL_CYCLE_DETECTOR_EDEFAULT == null ? z__internalCycleDetector != null : !ZINTERNAL_CYCLE_DETECTOR_EDEFAULT.equals(z__internalCycleDetector);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (z__internalCycleDetector: ");
		result.append(z__internalCycleDetector);
		result.append(')');
		return result.toString();
	}

} //DefinedObjectImpl
