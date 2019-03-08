/**
 */
package alpha.model.matrix.impl;

import alpha.model.matrix.Matrix;
import alpha.model.matrix.MatrixPackage;
import alpha.model.matrix.MatrixRow;
import alpha.model.matrix.Space;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Matrix</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alpha.model.matrix.impl.MatrixImpl#getSpace <em>Space</em>}</li>
 *   <li>{@link alpha.model.matrix.impl.MatrixImpl#getRows <em>Rows</em>}</li>
 *   <li>{@link alpha.model.matrix.impl.MatrixImpl#isLinearPartOnly <em>Linear Part Only</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MatrixImpl extends MinimalEObjectImpl.Container implements Matrix {
	/**
	 * The cached value of the '{@link #getSpace() <em>Space</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpace()
	 * @generated
	 * @ordered
	 */
	protected Space space;

	/**
	 * The cached value of the '{@link #getRows() <em>Rows</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRows()
	 * @generated
	 * @ordered
	 */
	protected EList<MatrixRow> rows;

	/**
	 * The default value of the '{@link #isLinearPartOnly() <em>Linear Part Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLinearPartOnly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LINEAR_PART_ONLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLinearPartOnly() <em>Linear Part Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLinearPartOnly()
	 * @generated
	 * @ordered
	 */
	protected boolean linearPartOnly = LINEAR_PART_ONLY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MatrixImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MatrixPackage.Literals.MATRIX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Space getSpace() {
		return space;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpace(Space newSpace, NotificationChain msgs) {
		Space oldSpace = space;
		space = newSpace;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MatrixPackage.MATRIX__SPACE, oldSpace, newSpace);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpace(Space newSpace) {
		if (newSpace != space) {
			NotificationChain msgs = null;
			if (space != null)
				msgs = ((InternalEObject)space).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MatrixPackage.MATRIX__SPACE, null, msgs);
			if (newSpace != null)
				msgs = ((InternalEObject)newSpace).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MatrixPackage.MATRIX__SPACE, null, msgs);
			msgs = basicSetSpace(newSpace, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MatrixPackage.MATRIX__SPACE, newSpace, newSpace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MatrixRow> getRows() {
		if (rows == null) {
			rows = new EObjectContainmentEList<MatrixRow>(MatrixRow.class, this, MatrixPackage.MATRIX__ROWS);
		}
		return rows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLinearPartOnly() {
		return linearPartOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinearPartOnly(boolean newLinearPartOnly) {
		boolean oldLinearPartOnly = linearPartOnly;
		linearPartOnly = newLinearPartOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MatrixPackage.MATRIX__LINEAR_PART_ONLY, oldLinearPartOnly, linearPartOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isConsistent() {
		final int nbCols = this.getNbColumns();
		EList<MatrixRow> _rows = this.getRows();
		for (final MatrixRow r : _rows) {
			int _size = r.getValues().size();
			boolean _notEquals = (_size != nbCols);
			if (_notEquals) {
				return false;
			}
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getValue(final int r, final int c) {
		return (this.getRows().get(r).getValues().get(c)).longValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(final int r, final int c, final long v) {
		this.getRows().get(r).getValues().set(c, Long.valueOf(v));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNbRows() {
		return ((Object[])org.eclipse.xtext.xbase.lib.Conversions.unwrapArray(this.getRows(), Object.class)).length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNbColumns() {
		int _xifexpression = (int) 0;
		boolean _isLinearPartOnly = this.isLinearPartOnly();
		if (_isLinearPartOnly) {
			int _nbParams = this.getNbParams();
			int _nbIndices = this.getNbIndices();
			_xifexpression = (_nbParams + _nbIndices);
		}
		else {
			int _nbParams_1 = this.getNbParams();
			int _nbIndices_1 = this.getNbIndices();
			int _plus = (_nbParams_1 + _nbIndices_1);
			_xifexpression = (_plus + 1);
		}
		return _xifexpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNbParams() {
		return this.getSpace().getNbParams();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNbIndices() {
		return this.getSpace().getNbIndices();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getParamNames() {
		return this.getSpace().getParamNames();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getIndexNames() {
		return this.getSpace().getIndexNames();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		return IterableExtensions.join(this.getRows(), "\n");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MatrixPackage.MATRIX__SPACE:
				return basicSetSpace(null, msgs);
			case MatrixPackage.MATRIX__ROWS:
				return ((InternalEList<?>)getRows()).basicRemove(otherEnd, msgs);
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
			case MatrixPackage.MATRIX__SPACE:
				return getSpace();
			case MatrixPackage.MATRIX__ROWS:
				return getRows();
			case MatrixPackage.MATRIX__LINEAR_PART_ONLY:
				return isLinearPartOnly();
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
			case MatrixPackage.MATRIX__SPACE:
				setSpace((Space)newValue);
				return;
			case MatrixPackage.MATRIX__ROWS:
				getRows().clear();
				getRows().addAll((Collection<? extends MatrixRow>)newValue);
				return;
			case MatrixPackage.MATRIX__LINEAR_PART_ONLY:
				setLinearPartOnly((Boolean)newValue);
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
			case MatrixPackage.MATRIX__SPACE:
				setSpace((Space)null);
				return;
			case MatrixPackage.MATRIX__ROWS:
				getRows().clear();
				return;
			case MatrixPackage.MATRIX__LINEAR_PART_ONLY:
				setLinearPartOnly(LINEAR_PART_ONLY_EDEFAULT);
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
			case MatrixPackage.MATRIX__SPACE:
				return space != null;
			case MatrixPackage.MATRIX__ROWS:
				return rows != null && !rows.isEmpty();
			case MatrixPackage.MATRIX__LINEAR_PART_ONLY:
				return linearPartOnly != LINEAR_PART_ONLY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //MatrixImpl
