/**
 */
package alpha.targetmapping.impl;

import alpha.targetmapping.BandExpression;
import alpha.targetmapping.BandPiece;
import alpha.targetmapping.IsolateSpecification;
import alpha.targetmapping.LoopTypeSpecification;
import alpha.targetmapping.ScheduleTreeExpression;
import alpha.targetmapping.TargetMappingVisitor;
import alpha.targetmapping.TargetmappingPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Band Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alpha.targetmapping.impl.BandExpressionImpl#getBandPieces <em>Band Pieces</em>}</li>
 *   <li>{@link alpha.targetmapping.impl.BandExpressionImpl#getChild <em>Child</em>}</li>
 *   <li>{@link alpha.targetmapping.impl.BandExpressionImpl#isTile <em>Tile</em>}</li>
 *   <li>{@link alpha.targetmapping.impl.BandExpressionImpl#isParallel <em>Parallel</em>}</li>
 *   <li>{@link alpha.targetmapping.impl.BandExpressionImpl#getLoopTypeSpecifications <em>Loop Type Specifications</em>}</li>
 *   <li>{@link alpha.targetmapping.impl.BandExpressionImpl#getIsolateSpecification <em>Isolate Specification</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BandExpressionImpl extends ScheduleTreeExpressionImpl implements BandExpression {
	/**
	 * The cached value of the '{@link #getBandPieces() <em>Band Pieces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBandPieces()
	 * @generated
	 * @ordered
	 */
	protected EList<BandPiece> bandPieces;

	/**
	 * The cached value of the '{@link #getChild() <em>Child</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChild()
	 * @generated
	 * @ordered
	 */
	protected ScheduleTreeExpression child;

	/**
	 * The default value of the '{@link #isTile() <em>Tile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTile()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TILE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTile() <em>Tile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTile()
	 * @generated
	 * @ordered
	 */
	protected boolean tile = TILE_EDEFAULT;

	/**
	 * The default value of the '{@link #isParallel() <em>Parallel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isParallel()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PARALLEL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isParallel() <em>Parallel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isParallel()
	 * @generated
	 * @ordered
	 */
	protected boolean parallel = PARALLEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLoopTypeSpecifications() <em>Loop Type Specifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoopTypeSpecifications()
	 * @generated
	 * @ordered
	 */
	protected EList<LoopTypeSpecification> loopTypeSpecifications;

	/**
	 * The cached value of the '{@link #getIsolateSpecification() <em>Isolate Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsolateSpecification()
	 * @generated
	 * @ordered
	 */
	protected IsolateSpecification isolateSpecification;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BandExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TargetmappingPackage.Literals.BAND_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BandPiece> getBandPieces() {
		if (bandPieces == null) {
			bandPieces = new EObjectContainmentEList<BandPiece>(BandPiece.class, this, TargetmappingPackage.BAND_EXPRESSION__BAND_PIECES);
		}
		return bandPieces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScheduleTreeExpression getChild() {
		return child;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChild(ScheduleTreeExpression newChild, NotificationChain msgs) {
		ScheduleTreeExpression oldChild = child;
		child = newChild;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TargetmappingPackage.BAND_EXPRESSION__CHILD, oldChild, newChild);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChild(ScheduleTreeExpression newChild) {
		if (newChild != child) {
			NotificationChain msgs = null;
			if (child != null)
				msgs = ((InternalEObject)child).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TargetmappingPackage.BAND_EXPRESSION__CHILD, null, msgs);
			if (newChild != null)
				msgs = ((InternalEObject)newChild).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TargetmappingPackage.BAND_EXPRESSION__CHILD, null, msgs);
			msgs = basicSetChild(newChild, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetmappingPackage.BAND_EXPRESSION__CHILD, newChild, newChild));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTile() {
		return tile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTile(boolean newTile) {
		boolean oldTile = tile;
		tile = newTile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetmappingPackage.BAND_EXPRESSION__TILE, oldTile, tile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isParallel() {
		return parallel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParallel(boolean newParallel) {
		boolean oldParallel = parallel;
		parallel = newParallel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetmappingPackage.BAND_EXPRESSION__PARALLEL, oldParallel, parallel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LoopTypeSpecification> getLoopTypeSpecifications() {
		if (loopTypeSpecifications == null) {
			loopTypeSpecifications = new EObjectContainmentEList<LoopTypeSpecification>(LoopTypeSpecification.class, this, TargetmappingPackage.BAND_EXPRESSION__LOOP_TYPE_SPECIFICATIONS);
		}
		return loopTypeSpecifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsolateSpecification getIsolateSpecification() {
		return isolateSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsolateSpecification(IsolateSpecification newIsolateSpecification, NotificationChain msgs) {
		IsolateSpecification oldIsolateSpecification = isolateSpecification;
		isolateSpecification = newIsolateSpecification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TargetmappingPackage.BAND_EXPRESSION__ISOLATE_SPECIFICATION, oldIsolateSpecification, newIsolateSpecification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsolateSpecification(IsolateSpecification newIsolateSpecification) {
		if (newIsolateSpecification != isolateSpecification) {
			NotificationChain msgs = null;
			if (isolateSpecification != null)
				msgs = ((InternalEObject)isolateSpecification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TargetmappingPackage.BAND_EXPRESSION__ISOLATE_SPECIFICATION, null, msgs);
			if (newIsolateSpecification != null)
				msgs = ((InternalEObject)newIsolateSpecification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TargetmappingPackage.BAND_EXPRESSION__ISOLATE_SPECIFICATION, null, msgs);
			msgs = basicSetIsolateSpecification(newIsolateSpecification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetmappingPackage.BAND_EXPRESSION__ISOLATE_SPECIFICATION, newIsolateSpecification, newIsolateSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void accept(final TargetMappingVisitor visitor) {
		visitor.visitBandExpression(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TargetmappingPackage.BAND_EXPRESSION__BAND_PIECES:
				return ((InternalEList<?>)getBandPieces()).basicRemove(otherEnd, msgs);
			case TargetmappingPackage.BAND_EXPRESSION__CHILD:
				return basicSetChild(null, msgs);
			case TargetmappingPackage.BAND_EXPRESSION__LOOP_TYPE_SPECIFICATIONS:
				return ((InternalEList<?>)getLoopTypeSpecifications()).basicRemove(otherEnd, msgs);
			case TargetmappingPackage.BAND_EXPRESSION__ISOLATE_SPECIFICATION:
				return basicSetIsolateSpecification(null, msgs);
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
			case TargetmappingPackage.BAND_EXPRESSION__BAND_PIECES:
				return getBandPieces();
			case TargetmappingPackage.BAND_EXPRESSION__CHILD:
				return getChild();
			case TargetmappingPackage.BAND_EXPRESSION__TILE:
				return isTile();
			case TargetmappingPackage.BAND_EXPRESSION__PARALLEL:
				return isParallel();
			case TargetmappingPackage.BAND_EXPRESSION__LOOP_TYPE_SPECIFICATIONS:
				return getLoopTypeSpecifications();
			case TargetmappingPackage.BAND_EXPRESSION__ISOLATE_SPECIFICATION:
				return getIsolateSpecification();
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
			case TargetmappingPackage.BAND_EXPRESSION__BAND_PIECES:
				getBandPieces().clear();
				getBandPieces().addAll((Collection<? extends BandPiece>)newValue);
				return;
			case TargetmappingPackage.BAND_EXPRESSION__CHILD:
				setChild((ScheduleTreeExpression)newValue);
				return;
			case TargetmappingPackage.BAND_EXPRESSION__TILE:
				setTile((Boolean)newValue);
				return;
			case TargetmappingPackage.BAND_EXPRESSION__PARALLEL:
				setParallel((Boolean)newValue);
				return;
			case TargetmappingPackage.BAND_EXPRESSION__LOOP_TYPE_SPECIFICATIONS:
				getLoopTypeSpecifications().clear();
				getLoopTypeSpecifications().addAll((Collection<? extends LoopTypeSpecification>)newValue);
				return;
			case TargetmappingPackage.BAND_EXPRESSION__ISOLATE_SPECIFICATION:
				setIsolateSpecification((IsolateSpecification)newValue);
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
			case TargetmappingPackage.BAND_EXPRESSION__BAND_PIECES:
				getBandPieces().clear();
				return;
			case TargetmappingPackage.BAND_EXPRESSION__CHILD:
				setChild((ScheduleTreeExpression)null);
				return;
			case TargetmappingPackage.BAND_EXPRESSION__TILE:
				setTile(TILE_EDEFAULT);
				return;
			case TargetmappingPackage.BAND_EXPRESSION__PARALLEL:
				setParallel(PARALLEL_EDEFAULT);
				return;
			case TargetmappingPackage.BAND_EXPRESSION__LOOP_TYPE_SPECIFICATIONS:
				getLoopTypeSpecifications().clear();
				return;
			case TargetmappingPackage.BAND_EXPRESSION__ISOLATE_SPECIFICATION:
				setIsolateSpecification((IsolateSpecification)null);
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
			case TargetmappingPackage.BAND_EXPRESSION__BAND_PIECES:
				return bandPieces != null && !bandPieces.isEmpty();
			case TargetmappingPackage.BAND_EXPRESSION__CHILD:
				return child != null;
			case TargetmappingPackage.BAND_EXPRESSION__TILE:
				return tile != TILE_EDEFAULT;
			case TargetmappingPackage.BAND_EXPRESSION__PARALLEL:
				return parallel != PARALLEL_EDEFAULT;
			case TargetmappingPackage.BAND_EXPRESSION__LOOP_TYPE_SPECIFICATIONS:
				return loopTypeSpecifications != null && !loopTypeSpecifications.isEmpty();
			case TargetmappingPackage.BAND_EXPRESSION__ISOLATE_SPECIFICATION:
				return isolateSpecification != null;
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
		result.append(" (tile: ");
		result.append(tile);
		result.append(", parallel: ");
		result.append(parallel);
		result.append(')');
		return result.toString();
	}

} //BandExpressionImpl
