/**
 */
package alpha.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alpha Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * AlphaFunction is supposed to be just text in the Xtext grammar.
 * However, the ambiguity involving parentheses cause issues.
 * This can be resolved by actually parsing it as expressions.
 * 
 * It could be avoided by using square braces instead: [i,j->i,j]
 *  but I prefer to use the classical Alpha syntax for functions.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.model.AlphaFunction#getIndexList <em>Index List</em>}</li>
 *   <li>{@link alpha.model.AlphaFunction#getExprs <em>Exprs</em>}</li>
 * </ul>
 *
 * @see alpha.model.ModelPackage#getAlphaFunction()
 * @model
 * @generated
 */
public interface AlphaFunction extends EObject {
	/**
	 * Returns the value of the '<em><b>Index List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index List</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index List</em>' attribute.
	 * @see #setIndexList(String)
	 * @see alpha.model.ModelPackage#getAlphaFunction_IndexList()
	 * @model unique="false"
	 * @generated
	 */
	String getIndexList();

	/**
	 * Sets the value of the '{@link alpha.model.AlphaFunction#getIndexList <em>Index List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index List</em>' attribute.
	 * @see #getIndexList()
	 * @generated
	 */
	void setIndexList(String value);

	/**
	 * Returns the value of the '<em><b>Exprs</b></em>' containment reference list.
	 * The list contents are of type {@link alpha.model.AlphaFunctionExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exprs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exprs</em>' containment reference list.
	 * @see alpha.model.ModelPackage#getAlphaFunction_Exprs()
	 * @model containment="true"
	 * @generated
	 */
	EList<AlphaFunctionExpression> getExprs();

} // AlphaFunction
