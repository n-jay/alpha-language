/**
 */
package alpha.model.matrix.impl;

import alpha.model.matrix.Matrix;
import alpha.model.matrix.MatrixPackage;
import alpha.model.matrix.MatrixRow;
import alpha.model.matrix.Space;

import com.google.common.base.Objects;

import fr.irisa.cairn.jnimap.isl.jni.JNIISLAff;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLAffList;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLContext;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLDimType;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLMultiAff;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLSpace;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtext.xbase.lib.ExclusiveRange;
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
	public long[][] toArray() {
		boolean _isConsistent = this.isConsistent();
		boolean _not = (!_isConsistent);
		if (_not) {
			throw new RuntimeException("Inconsistent matrix: number of columns do not match its space.");
		}
		final long[][] array = new long[this.getNbRows()][this.getNbColumns()];
		int r = 0;
		EList<MatrixRow> _rows = this.getRows();
		for (final MatrixRow row : _rows) {
			{
				int c = 0;
				EList<Long> _values = row.getValues();
				for (final Long v : _values) {
					{
						array[r][c] = (v).longValue();
						c++;
					}
				}
				r++;
			}
		}
		return array;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JNIISLMultiAff toMultiAff() {
		int _nbRows = this.getNbRows();
		int _nbParams = this.getNbParams();
		final int nbDims = (_nbRows - _nbParams);
		int _nbParams_1 = this.getNbParams();
		ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _nbParams_1, true);
		for (final Integer r : _doubleDotLessThan) {
			{
				final MatrixRow row = this.getRows().get((r).intValue());
				int _size = row.getValues().size();
				ExclusiveRange _doubleDotLessThan_1 = new ExclusiveRange(0, _size, true);
				for (final Integer c : _doubleDotLessThan_1) {
					if (((!(Objects.equal(c, r) && (row.getValue((c).intValue()) == 1))) && (!((!Objects.equal(c, r)) && (row.getValue((c).intValue()) == 0))))) {
						throw new RuntimeException("Unexpected input matrix. The first nbParams rows are assumed to be implicit parameter equalities.");
					}
				}
			}
		}
		final JNIISLSpace islSpace = this.getSpace().toJNIISLSetSpace();
		JNIISLAffList affList = JNIISLAffList.build(JNIISLContext.getCtx(), nbDims);
		JNIISLSpace affSpace = null;
		List<MatrixRow> _subList = this.getRows().subList(this.getNbParams(), this.getNbRows());
		for (final MatrixRow row : _subList) {
			{
				JNIISLAff aff = JNIISLAff.buildZero(islSpace.copy().toLocalSpace());
				if ((affSpace == null)) {
					affSpace = aff.getSpace().copy();
				}
				int _nbParams_2 = this.getNbParams();
				ExclusiveRange _doubleDotLessThan_1 = new ExclusiveRange(0, _nbParams_2, true);
				for (final Integer p : _doubleDotLessThan_1) {
					long _value = row.getValue((p).intValue());
					aff = aff.setCoefficient(JNIISLDimType.isl_dim_param, (p).intValue(), ((int) _value));
				}
				int _nbIndices = this.getNbIndices();
				ExclusiveRange _doubleDotLessThan_2 = new ExclusiveRange(0, _nbIndices, true);
				for (final Integer i : _doubleDotLessThan_2) {
					int _nbParams_3 = this.getNbParams();
					int _plus = ((i).intValue() + _nbParams_3);
					long _value_1 = row.getValue(_plus);
					aff = aff.setCoefficient(JNIISLDimType.isl_dim_in, (i).intValue(), ((int) _value_1));
				}
				boolean _isLinearPartOnly = this.isLinearPartOnly();
				boolean _not = (!_isLinearPartOnly);
				if (_not) {
					int _nbParams_4 = this.getNbParams();
					int _nbIndices_1 = this.getNbIndices();
					int _plus_1 = (_nbParams_4 + _nbIndices_1);
					long _value_2 = row.getValue(_plus_1);
					aff = aff.setConstant(((int) _value_2));
				}
				affList = affList.add(aff);
			}
		}
		return JNIISLMultiAff.buildFromAffList(this.getSpace().toJNIISLMultiAffSpace(nbDims), affList);
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
