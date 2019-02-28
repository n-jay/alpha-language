/**
 */
package alpha.commands.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alpha Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.commands.model.AlphaCommand#getCategory <em>Category</em>}</li>
 *   <li>{@link alpha.commands.model.AlphaCommand#getLabel <em>Label</em>}</li>
 *   <li>{@link alpha.commands.model.AlphaCommand#getName <em>Name</em>}</li>
 *   <li>{@link alpha.commands.model.AlphaCommand#getSignature <em>Signature</em>}</li>
 *   <li>{@link alpha.commands.model.AlphaCommand#getSpecializations <em>Specializations</em>}</li>
 *   <li>{@link alpha.commands.model.AlphaCommand#getBinding <em>Binding</em>}</li>
 * </ul>
 *
 * @see alpha.commands.model.ModelPackage#getAlphaCommand()
 * @model
 * @generated
 */
public interface AlphaCommand extends EObject {
	/**
	 * Returns the value of the '<em><b>Category</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link alpha.commands.model.AlphaCommandCategory#getCommands <em>Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' container reference.
	 * @see #setCategory(AlphaCommandCategory)
	 * @see alpha.commands.model.ModelPackage#getAlphaCommand_Category()
	 * @see alpha.commands.model.AlphaCommandCategory#getCommands
	 * @model opposite="commands" transient="false"
	 * @generated
	 */
	AlphaCommandCategory getCategory();

	/**
	 * Sets the value of the '{@link alpha.commands.model.AlphaCommand#getCategory <em>Category</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' container reference.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(AlphaCommandCategory value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see alpha.commands.model.ModelPackage#getAlphaCommand_Label()
	 * @model unique="false" id="true"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link alpha.commands.model.AlphaCommand#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see alpha.commands.model.ModelPackage#getAlphaCommand_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link alpha.commands.model.AlphaCommand#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signature</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature</em>' containment reference.
	 * @see #setSignature(AlphaCommandSignature)
	 * @see alpha.commands.model.ModelPackage#getAlphaCommand_Signature()
	 * @model containment="true"
	 * @generated
	 */
	AlphaCommandSignature getSignature();

	/**
	 * Sets the value of the '{@link alpha.commands.model.AlphaCommand#getSignature <em>Signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature</em>' containment reference.
	 * @see #getSignature()
	 * @generated
	 */
	void setSignature(AlphaCommandSignature value);

	/**
	 * Returns the value of the '<em><b>Specializations</b></em>' containment reference list.
	 * The list contents are of type {@link alpha.commands.model.AlphaCommandSpecialization}.
	 * It is bidirectional and its opposite is '{@link alpha.commands.model.AlphaCommandSpecialization#getCommand <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specializations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specializations</em>' containment reference list.
	 * @see alpha.commands.model.ModelPackage#getAlphaCommand_Specializations()
	 * @see alpha.commands.model.AlphaCommandSpecialization#getCommand
	 * @model opposite="command" containment="true"
	 * @generated
	 */
	EList<AlphaCommandSpecialization> getSpecializations();

	/**
	 * Returns the value of the '<em><b>Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding</em>' containment reference.
	 * @see #setBinding(CommandBinding)
	 * @see alpha.commands.model.ModelPackage#getAlphaCommand_Binding()
	 * @model containment="true"
	 * @generated
	 */
	CommandBinding getBinding();

	/**
	 * Sets the value of the '{@link alpha.commands.model.AlphaCommand#getBinding <em>Binding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding</em>' containment reference.
	 * @see #getBinding()
	 * @generated
	 */
	void setBinding(CommandBinding value);

} // AlphaCommand
