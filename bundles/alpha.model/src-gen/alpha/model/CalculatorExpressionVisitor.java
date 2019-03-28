/**
 */
package alpha.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Calculator Expression Visitor</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see alpha.model.ModelPackage#getCalculatorExpressionVisitor()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface CalculatorExpressionVisitor extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exprUnique="false"
	 * @generated
	 */
	void visitCalculatorExpression(CalculatorExpression expr);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exprUnique="false"
	 * @generated
	 */
	void visitUnaryCalculatorExpression(UnaryCalculatorExpression expr);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exprUnique="false"
	 * @generated
	 */
	void visitBinaryCalculatorExpression(BinaryCalculatorExpression expr);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model jniDomainUnique="false"
	 * @generated
	 */
	void visitJNIDomain(JNIDomain jniDomain);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model jniRelationUnique="false"
	 * @generated
	 */
	void visitJNIRelation(JNIRelation jniRelation);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model jniFunctionUnique="false"
	 * @generated
	 */
	void visitJNIFunction(JNIFunction jniFunction);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model jniPolynomialUnique="false"
	 * @generated
	 */
	void visitJNIPolynomial(JNIPolynomial jniPolynomial);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model vdomUnique="false"
	 * @generated
	 */
	void visitVariableDomain(VariableDomain vdom);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model rdomUnique="false"
	 * @generated
	 */
	void visitRectangularDomain(RectangularDomain rdom);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dobjUnique="false"
	 * @generated
	 */
	void visitDefinedObject(DefinedObject dobj);

} // CalculatorExpressionVisitor
