/**
 */
package alpha.targetmapping;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loop Type Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.targetmapping.LoopTypeSpecification#getDimension <em>Dimension</em>}</li>
 * </ul>
 *
 * @see alpha.targetmapping.TargetmappingPackage#getLoopTypeSpecification()
 * @model abstract="true"
 * @generated
 */
public interface LoopTypeSpecification extends EObject {
	/**
	 * Returns the value of the '<em><b>Dimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimension</em>' attribute.
	 * @see #setDimension(int)
	 * @see alpha.targetmapping.TargetmappingPackage#getLoopTypeSpecification_Dimension()
	 * @model unique="false"
	 * @generated
	 */
	int getDimension();

	/**
	 * Sets the value of the '{@link alpha.targetmapping.LoopTypeSpecification#getDimension <em>Dimension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dimension</em>' attribute.
	 * @see #getDimension()
	 * @generated
	 */
	void setDimension(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	String getName();

} // LoopTypeSpecification
