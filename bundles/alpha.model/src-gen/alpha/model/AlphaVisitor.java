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
	 * @model ueUnique="false"
	 * @generated
	 */
	void visitUseEquation(UseEquation ue);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model seUnique="false"
	 * @generated
	 */
	void visitStandardEquation(StandardEquation se);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model rootUnique="false"
	 * @generated
	 */
	void inAlphaRoot(AlphaRoot root);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model apUnique="false"
	 * @generated
	 */
	void inAlphaElement(AlphaElement ap);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model apUnique="false"
	 * @generated
	 */
	void inAlphaPackage(AlphaPackage ap);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model systemUnique="false"
	 * @generated
	 */
	void inAlphaSystem(AlphaSystem system);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model importsUnique="false"
	 * @generated
	 */
	void inImports(Imports imports);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model acUnique="false"
	 * @generated
	 */
	void inAlphaConstant(AlphaConstant ac);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model efUnique="false"
	 * @generated
	 */
	void inExternalFunction(ExternalFunction ef);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model variableUnique="false"
	 * @generated
	 */
	void inVariable(Variable variable);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model variableUnique="false"
	 * @generated
	 */
	void inFuzzyVariable(FuzzyVariable variable);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model pobjUnique="false"
	 * @generated
	 */
	void inPolyhedralObject(PolyhedralObject pobj);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ueUnique="false"
	 * @generated
	 */
	void inUseEquation(UseEquation ue);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model seUnique="false"
	 * @generated
	 */
	void inStandardEquation(StandardEquation se);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model rootUnique="false"
	 * @generated
	 */
	void outAlphaRoot(AlphaRoot root);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model apUnique="false"
	 * @generated
	 */
	void outAlphaElement(AlphaElement ap);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model apUnique="false"
	 * @generated
	 */
	void outAlphaPackage(AlphaPackage ap);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model systemUnique="false"
	 * @generated
	 */
	void outAlphaSystem(AlphaSystem system);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model importsUnique="false"
	 * @generated
	 */
	void outImports(Imports imports);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model acUnique="false"
	 * @generated
	 */
	void outAlphaConstant(AlphaConstant ac);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model efUnique="false"
	 * @generated
	 */
	void outExternalFunction(ExternalFunction ef);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model variableUnique="false"
	 * @generated
	 */
	void outVariable(Variable variable);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model variableUnique="false"
	 * @generated
	 */
	void outFuzzyVariable(FuzzyVariable variable);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model pobjUnique="false"
	 * @generated
	 */
	void outPolyhedralObject(PolyhedralObject pobj);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ueUnique="false"
	 * @generated
	 */
	void outUseEquation(UseEquation ue);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model seUnique="false"
	 * @generated
	 */
	void outStandardEquation(StandardEquation se);

} // AlphaVisitor
