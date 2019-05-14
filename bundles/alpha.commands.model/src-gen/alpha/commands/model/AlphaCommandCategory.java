/**
 */
package alpha.commands.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alpha Command Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.commands.model.AlphaCommandCategory#getName <em>Name</em>}</li>
 *   <li>{@link alpha.commands.model.AlphaCommandCategory#getCommands <em>Commands</em>}</li>
 * </ul>
 *
 * @see alpha.commands.model.ModelPackage#getAlphaCommandCategory()
 * @model
 * @generated
 */
public interface AlphaCommandCategory extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see alpha.commands.model.ModelPackage#getAlphaCommandCategory_Name()
	 * @model unique="false" id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link alpha.commands.model.AlphaCommandCategory#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Commands</b></em>' containment reference list.
	 * The list contents are of type {@link alpha.commands.model.AlphaCommand}.
	 * It is bidirectional and its opposite is '{@link alpha.commands.model.AlphaCommand#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commands</em>' containment reference list.
	 * @see alpha.commands.model.ModelPackage#getAlphaCommandCategory_Commands()
	 * @see alpha.commands.model.AlphaCommand#getCategory
	 * @model opposite="category" containment="true"
	 * @generated
	 */
	EList<AlphaCommand> getCommands();

} // AlphaCommandCategory
