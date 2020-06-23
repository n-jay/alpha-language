/**
 */
package alpha.targetmapping;

import alpha.model.JNIDomain;

import fr.irisa.cairn.jnimap.isl.ISLSet;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Isolate Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.targetmapping.IsolateSpecification#getIsolateDomainExpr <em>Isolate Domain Expr</em>}</li>
 *   <li>{@link alpha.targetmapping.IsolateSpecification#getLoopTypeSpecifications <em>Loop Type Specifications</em>}</li>
 * </ul>
 *
 * @see alpha.targetmapping.TargetmappingPackage#getIsolateSpecification()
 * @model
 * @generated
 */
public interface IsolateSpecification extends EObject {
	/**
	 * Returns the value of the '<em><b>Isolate Domain Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Isolate Domain Expr</em>' containment reference.
	 * @see #setIsolateDomainExpr(JNIDomain)
	 * @see alpha.targetmapping.TargetmappingPackage#getIsolateSpecification_IsolateDomainExpr()
	 * @model containment="true"
	 * @generated
	 */
	JNIDomain getIsolateDomainExpr();

	/**
	 * Sets the value of the '{@link alpha.targetmapping.IsolateSpecification#getIsolateDomainExpr <em>Isolate Domain Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Isolate Domain Expr</em>' containment reference.
	 * @see #getIsolateDomainExpr()
	 * @generated
	 */
	void setIsolateDomainExpr(JNIDomain value);

	/**
	 * Returns the value of the '<em><b>Loop Type Specifications</b></em>' containment reference list.
	 * The list contents are of type {@link alpha.targetmapping.LoopTypeSpecification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loop Type Specifications</em>' containment reference list.
	 * @see alpha.targetmapping.TargetmappingPackage#getIsolateSpecification_LoopTypeSpecifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<LoopTypeSpecification> getLoopTypeSpecifications();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="alpha.targetmapping.JNIISLSet" unique="false"
	 * @generated
	 */
	ISLSet getIsolateDomain();

} // IsolateSpecification
