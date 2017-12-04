/**
 */
package alpha.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alpha Visitor</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see alpha.model.ModelPackage#getAlphaVisitor()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface AlphaVisitor extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model rootUnique="false"
	 * @generated
	 */
	void visitAlphaRoot(AlphaRoot root);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model apUnique="false"
	 * @generated
	 */
	void visitAlphaElement(AlphaElement ap);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model apUnique="false"
	 * @generated
	 */
	void visitAlphaPackage(AlphaPackage ap);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model systemUnique="false"
	 * @generated
	 */
	void visitAlphaSystem(AlphaSystem system);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model importsUnique="false"
	 * @generated
	 */
	void visitImports(Imports imports);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model acUnique="false"
	 * @generated
	 */
	void visitAlphaConstant(AlphaConstant ac);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model efUnique="false"
	 * @generated
	 */
	void visitExternalFunction(ExternalFunction ef);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Use specialized methods for input/output/local specific operations.
	 * The abstract visitor calls the specialized methods, which then calls the generic visitor.
	 * <!-- end-model-doc -->
	 * @model variableUnique="false"
	 * @generated
	 */
	void visitVariable(Variable variable);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Use visitVariable for generic operations
	 * <!-- end-model-doc -->
	 * @model variableUnique="false"
	 * @generated
	 */
	void visitInputVariable(InputVariable variable);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Use visitVariable for generic operations
	 * <!-- end-model-doc -->
	 * @model variableUnique="false"
	 * @generated
	 */
	void visitOutputVariable(OutputVariable variable);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Use visitVariable for generic operations
	 * <!-- end-model-doc -->
	 * @model variableUnique="false"
	 * @generated
	 */
	void visitLocalVariable(LocalVariable variable);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model variableUnique="false"
	 * @generated
	 */
	void visitFuzzyVariable(FuzzyVariable variable);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model pobjUnique="false"
	 * @generated
	 */
	void visitPolyhedralObject(PolyhedralObject pobj);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model seUnique="false"
	 * @generated
	 */
	void visitUseEquation(UseEquation se);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model seUnique="false"
	 * @generated
	 */
	void visitStandardEquation(StandardEquation se);

} // AlphaVisitor
