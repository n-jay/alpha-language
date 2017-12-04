/**
 */
package alpha.model.impl;

import alpha.model.AlphaVisitor;
import alpha.model.FuzzyVariable;
import alpha.model.ModelPackage;
import alpha.model.POLY_OBJECT_TYPE;

import com.google.common.base.Objects;

import fr.irisa.cairn.jnimap.isl.jni.JNIISLMap;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLSet;

import fr.irisa.cairn.jnimap.runtime.JNIObject;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fuzzy Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class FuzzyVariableImpl extends VariableImpl implements FuzzyVariable {
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
	public JNIISLSet getDomain() {
		POLY_OBJECT_TYPE _type = this.getDomainExpr().getType();
		boolean _notEquals = (!Objects.equal(_type, POLY_OBJECT_TYPE.MAP));
		if (_notEquals) {
			return null;
		}
		JNIObject _iSLObject = this.getDomainExpr().getISLObject();
		return ((JNIISLMap) _iSLObject).copy().domain();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JNIISLMap getRelation() {
		POLY_OBJECT_TYPE _type = this.getDomainExpr().getType();
		boolean _notEquals = (!Objects.equal(_type, POLY_OBJECT_TYPE.MAP));
		if (_notEquals) {
			return null;
		}
		JNIObject _iSLObject = this.getDomainExpr().getISLObject();
		return ((JNIISLMap) _iSLObject);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void accept(final AlphaVisitor visitor) {
		visitor.visitFuzzyVariable(this);
	}

} //FuzzyVariableImpl
