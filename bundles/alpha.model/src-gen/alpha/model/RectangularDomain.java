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
 *   <li>{@link alpha.model.RectangularDomain#getLowerBounds <em>Lower Bounds</em>}</li>
 *   <li>{@link alpha.model.RectangularDomain#getUpperBounds <em>Upper Bounds</em>}</li>
 *   <li>{@link alpha.model.RectangularDomain#getIndexNames <em>Index Names</em>}</li>
 *   <li>{@link alpha.model.RectangularDomain#getZ__internal_cache_islSet <em>Zinternal cache isl Set</em>}</li>
 * </ul>
 *
 * @see alpha.model.ModelPackage#getRectangularDomain()
 * @model
 * @generated
 */
public interface RectangularDomain extends CalculatorExpression {
	/**
	 * Returns the value of the '<em><b>Lower Bounds</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Bounds</em>' attribute list.
	 * @see alpha.model.ModelPackage#getRectangularDomain_LowerBounds()
	 * @model unique="false" dataType="alpha.model.String"
	 * @generated
	 */
	EList<String> getLowerBounds();

	/**
	 * Returns the value of the '<em><b>Upper Bounds</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Bounds</em>' attribute list.
	 * @see alpha.model.ModelPackage#getRectangularDomain_UpperBounds()
	 * @model unique="false" dataType="alpha.model.String"
	 * @generated
	 */
	EList<String> getUpperBounds();

	/**
	 * Returns the value of the '<em><b>Index Names</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index Names</em>' attribute list.
	 * @see alpha.model.ModelPackage#getRectangularDomain_IndexNames()
	 * @model unique="false" dataType="alpha.model.String"
	 * @generated
	 */
	EList<String> getIndexNames();

	/**
	 * Returns the value of the '<em><b>Zinternal cache isl Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zinternal cache isl Set</em>' attribute.
	 * @see #setZ__internal_cache_islSet(JNIISLSet)
	 * @see alpha.model.ModelPackage#getRectangularDomain_Z__internal_cache_islSet()
	 * @model unique="false" dataType="alpha.model.JNIISLSet"
	 * @generated
	 */
	JNIISLSet getZ__internal_cache_islSet();

	/**
	 * Sets the value of the '{@link alpha.model.RectangularDomain#getZ__internal_cache_islSet <em>Zinternal cache isl Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zinternal cache isl Set</em>' attribute.
	 * @see #getZ__internal_cache_islSet()
	 * @generated
	 */
	void setZ__internal_cache_islSet(JNIISLSet value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="alpha.model.JNIISLSet" unique="false"
	 * @generated
	 */
	JNIISLSet getISLSet();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model islsetDataType="alpha.model.JNIISLSet" islsetUnique="false"
	 * @generated
	 */
	void setISLSet(JNIISLSet islset);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	POLY_OBJECT_TYPE getType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="alpha.model.JNIObject" unique="false"
	 * @generated
	 */
	JNIObject getISLObject();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model visitorUnique="false"
	 * @generated
	 */
	void accept(CalculatorExpressionVisitor visitor);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="alpha.model.String" unique="false"
	 * @generated
	 */
	String plainToString();

} // RectangularDomain
