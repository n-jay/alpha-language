/**
 */
package alpha.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alpha Visitor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Notes on visitors.
 * 
 * - Whenever you add a new node, the corresponding methods must be added to the visitor interface.
 * - Each node should have visitXXX, inXXX, outXXX methods.
 * - The default visiting pattern (depth first) is implemented in the corresponding default visitors. They need to be updated when a node is added as well.
 * - In the default visitor, inXXX and outXXX is called from visitXXX, where visitXXX calls accept on all its children.
 * - The abstract visitor does not need to be modified, except for the CompleteVisitor that require bridging between two visitors.
 * 
 * The default methods are used so that the visiting pattern can be implemented at the interface of each visitor.
 * This allows the complete visitor, which is made up of two visitors, to reuse the visiting code.
 * <!-- end-model-doc -->
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
	 * @model sysBodyUnique="false"
	 * @generated
	 */
	void visitSystemBody(SystemBody sysBody);

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
	 * @model sysBodyUnique="false"
	 * @generated
	 */
	void inSystemBody(SystemBody sysBody);

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
	 * @model eqUnique="false"
	 * @generated
	 */
	void inEquation(Equation eq);

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
	 * @model sysBodyUnique="false"
	 * @generated
	 */
	void outSystemBody(SystemBody sysBody);

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
	 * @model eqUnique="false"
	 * @generated
	 */
	void outEquation(Equation eq);

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
