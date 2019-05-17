/**
 */
package alpha.model.impl;

import alpha.model.AlphaNode;
import alpha.model.ModelPackage;

import alpha.model.util.AlphaUtil;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alpha Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alpha.model.impl.AlphaNodeImpl#getNodeID <em>Node ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AlphaNodeImpl extends MinimalEObjectImpl.Container implements AlphaNode {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlphaNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.ALPHA_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getNodeID() {
		BasicEList<Integer> _xifexpression = null;
		EObject _eContainer = this.eContainer();
		if ((_eContainer instanceof AlphaNode)) {
			EObject _eContainer_1 = this.eContainer();
			EList<Integer> _nodeID = ((AlphaNode) _eContainer_1).getNodeID();
			_xifexpression = new BasicEList<Integer>(_nodeID);
		}
		else {
			_xifexpression = new BasicEList<Integer>();
		}
		final BasicEList<Integer> parentID = _xifexpression;
		EObject _eContainer_2 = this.eContainer();
		boolean _tripleNotEquals = (_eContainer_2 != null);
		if (_tripleNotEquals) {
			parentID.add(Integer.valueOf(this.eContainer().eContents().indexOf(this)));
		}
		return parentID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AlphaNode getNode(final Queue<Integer> nodeID) {
		AlphaNode _xblockexpression = null;
		{
			final Integer next = nodeID.poll();
			AlphaNode _xifexpression = null;
			if ((next == null)) {
				_xifexpression = this;
			}
			else {
				EObject _get = this.eContents().get((next).intValue());
				_xifexpression = ((AlphaNode) _get).getNode(nodeID);
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
	public AlphaNode getNode(final EList<Integer> nodeID) {
		LinkedList<Integer> _linkedList = new LinkedList<Integer>(nodeID);
		return this.getNode(_linkedList);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AlphaNode getNode(final String nodeID) {
		int[] _parseIntArray = AlphaUtil.parseIntArray(nodeID);
		LinkedList<Integer> _linkedList = new LinkedList<Integer>((Collection<? extends Integer>)org.eclipse.xtext.xbase.lib.Conversions.doWrapArray(_parseIntArray));
		return this.getNode(_linkedList);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.ALPHA_NODE__NODE_ID:
				return getNodeID();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModelPackage.ALPHA_NODE__NODE_ID:
				return !getNodeID().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AlphaNodeImpl
