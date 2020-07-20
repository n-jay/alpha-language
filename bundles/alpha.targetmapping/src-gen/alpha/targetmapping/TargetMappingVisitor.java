/**
 */
package alpha.targetmapping;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Target Mapping Visitor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * See visitor in the Alpha model for how visitors work in Alpha related projects.
 * The one for TargetMapping is (currently) simpler, since it only uses one visitor
 * for the model. This may change when memory mappings are added.
 * <!-- end-model-doc -->
 *
 *
 * @see alpha.targetmapping.TargetmappingPackage#getTargetMappingVisitor()
 * @model
 * @generated
 */
public interface TargetMappingVisitor extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  visit
	 * <!-- end-model-doc -->
	 * @model tmUnique="false"
	 * @generated
	 */
	void visitTargetMapping(TargetMapping tm);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model tmUnique="false"
	 * @generated
	 */
	void visitTargetMappingForSystemBody(TargetMappingForSystemBody tm);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model steUnique="false"
	 * @generated
	 */
	void visitScheduleTreeExpression(ScheduleTreeExpression ste);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ceUnique="false"
	 * @generated
	 */
	void visitContextExpression(ContextExpression ce);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model seUnique="false"
	 * @generated
	 */
	void visitSetExpression(SetExpression se);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model seUnique="false"
	 * @generated
	 */
	void visitSequenceExpression(SequenceExpression se);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model feUnique="false"
	 * @generated
	 */
	void visitFilterExpression(FilterExpression fe);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model geUnique="false"
	 * @generated
	 */
	void visitGuardExpression(GuardExpression ge);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model meUnique="false"
	 * @generated
	 */
	void visitMarkExpression(MarkExpression me);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model beUnique="false"
	 * @generated
	 */
	void visitBandExpression(BandExpression be);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model tbeUnique="false"
	 * @generated
	 */
	void visitTileBandExpression(TileBandExpression tbe);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model eeUnique="false"
	 * @generated
	 */
	void visitExtensionExpression(ExtensionExpression ee);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  in
	 * <!-- end-model-doc -->
	 * @model tmUnique="false"
	 * @generated
	 */
	void inTargetMapping(TargetMapping tm);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model tmUnique="false"
	 * @generated
	 */
	void inTargetMappingForSystemBody(TargetMappingForSystemBody tm);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model steUnique="false"
	 * @generated
	 */
	void inScheduleTreeExpression(ScheduleTreeExpression ste);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ceUnique="false"
	 * @generated
	 */
	void inContextExpression(ContextExpression ce);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model seUnique="false"
	 * @generated
	 */
	void inSetExpression(SetExpression se);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model seUnique="false"
	 * @generated
	 */
	void inSequenceExpression(SequenceExpression se);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model feUnique="false"
	 * @generated
	 */
	void inFilterExpression(FilterExpression fe);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model geUnique="false"
	 * @generated
	 */
	void inGuardExpression(GuardExpression ge);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model meUnique="false"
	 * @generated
	 */
	void inMarkExpression(MarkExpression me);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model abeUnique="false"
	 * @generated
	 */
	void inAbstractBandExpression(AbstractBandExpression abe);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model beUnique="false"
	 * @generated
	 */
	void inBandExpression(BandExpression be);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model tbeUnique="false"
	 * @generated
	 */
	void inTileBandExpression(TileBandExpression tbe);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model eeUnique="false"
	 * @generated
	 */
	void inExtensionExpression(ExtensionExpression ee);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  out
	 * <!-- end-model-doc -->
	 * @model tmUnique="false"
	 * @generated
	 */
	void outTargetMapping(TargetMapping tm);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model tmUnique="false"
	 * @generated
	 */
	void outTargetMappingForSystemBody(TargetMappingForSystemBody tm);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model steUnique="false"
	 * @generated
	 */
	void outScheduleTreeExpression(ScheduleTreeExpression ste);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ceUnique="false"
	 * @generated
	 */
	void outContextExpression(ContextExpression ce);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model seUnique="false"
	 * @generated
	 */
	void outSetExpression(SetExpression se);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model seUnique="false"
	 * @generated
	 */
	void outSequenceExpression(SequenceExpression se);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model feUnique="false"
	 * @generated
	 */
	void outFilterExpression(FilterExpression fe);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model geUnique="false"
	 * @generated
	 */
	void outGuardExpression(GuardExpression ge);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model meUnique="false"
	 * @generated
	 */
	void outMarkExpression(MarkExpression me);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model abeUnique="false"
	 * @generated
	 */
	void outAbstractBandExpression(AbstractBandExpression abe);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model beUnique="false"
	 * @generated
	 */
	void outBandExpression(BandExpression be);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model tbeUnique="false"
	 * @generated
	 */
	void outTileBandExpression(TileBandExpression tbe);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model eeUnique="false"
	 * @generated
	 */
	void outExtensionExpression(ExtensionExpression ee);

} // TargetMappingVisitor
