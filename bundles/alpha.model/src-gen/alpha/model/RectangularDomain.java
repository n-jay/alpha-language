/**
 */
package alpha.model;

import fr.irisa.cairn.jnimap.isl.jni.JNIISLSet;

import fr.irisa.cairn.jnimap.runtime.JNIObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rectangular Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  RectangularDomain is a short-hand for rectilinear domains bounded by 0 from below, and by some parameter from above.
 * The dimensionality of the domain is the length of upperBounds that give the upper bound for each dimension.
 * The index names can be optionally specified for each dimension. (It is not possible to only name a subset of the dimensions.)
 * 
 * The bounds are of the form: 0<=i<N; each dimension will have N integer points starting from 0.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.model.RectangularDomain#getUpperBounds <em>Upper Bounds</em>}</li>
 *   <li>{@link alpha.model.RectangularDomain#getIndexNames <em>Index Names</em>}</li>
 *   <li>{@link alpha.model.RectangularDomain#getIslSet <em>Isl Set</em>}</li>
 * </ul>
 *
 * @see alpha.model.ModelPackage#getRectangularDomain()
 * @model
 * @generated
 */
public interface RectangularDomain extends CalculatorExpression {
	/**
	 * Returns the value of the '<em><b>Upper Bounds</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Bounds</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Bounds</em>' attribute list.
	 * @see alpha.model.ModelPackage#getRectangularDomain_UpperBounds()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getUpperBounds();

	/**
	 * Returns the value of the '<em><b>Index Names</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index Names</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index Names</em>' attribute list.
	 * @see alpha.model.ModelPackage#getRectangularDomain_IndexNames()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getIndexNames();

	/**
	 * Returns the value of the '<em><b>Isl Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Isl Set</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Isl Set</em>' attribute.
	 * @see #setIslSet(JNIISLSet)
	 * @see alpha.model.ModelPackage#getRectangularDomain_IslSet()
	 * @model unique="false" dataType="alpha.model.JNIISLSet"
	 * @generated
	 */
	JNIISLSet getIslSet();

	/**
	 * Sets the value of the '{@link alpha.model.RectangularDomain#getIslSet <em>Isl Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Isl Set</em>' attribute.
	 * @see #getIslSet()
	 * @generated
	 */
	void setIslSet(JNIISLSet value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return &lt;%alpha.model.POLY_OBJECT_TYPE%&gt;.SET;'"
	 * @generated
	 */
	POLY_OBJECT_TYPE getType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="alpha.model.JNIObject" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return &lt;%alpha.model.util.AlphaUtil%&gt;.copy(this.getIslSet());'"
	 * @generated
	 */
	JNIObject getISLObject();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model visitorUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='visitor.visitRectangularDomain(this);'"
	 * @generated
	 */
	void accept(CalculatorExpressionVisitor visitor);

} // RectangularDomain
