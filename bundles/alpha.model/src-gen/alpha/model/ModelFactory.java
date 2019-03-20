/**
 */
package alpha.model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see alpha.model.ModelPackage
 * @generated
 */
public interface ModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelFactory eINSTANCE = alpha.model.impl.ModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Alpha Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Alpha Node</em>'.
	 * @generated
	 */
	AlphaNode createAlphaNode();

	/**
	 * Returns a new object of class '<em>Alpha Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Alpha Root</em>'.
	 * @generated
	 */
	AlphaRoot createAlphaRoot();

	/**
	 * Returns a new object of class '<em>Imports</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Imports</em>'.
	 * @generated
	 */
	Imports createImports();

	/**
	 * Returns a new object of class '<em>Alpha Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Alpha Package</em>'.
	 * @generated
	 */
	AlphaPackage createAlphaPackage();

	/**
	 * Returns a new object of class '<em>Alpha Constant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Alpha Constant</em>'.
	 * @generated
	 */
	AlphaConstant createAlphaConstant();

	/**
	 * Returns a new object of class '<em>External Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Function</em>'.
	 * @generated
	 */
	ExternalFunction createExternalFunction();

	/**
	 * Returns a new object of class '<em>Alpha System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Alpha System</em>'.
	 * @generated
	 */
	AlphaSystem createAlphaSystem();

	/**
	 * Returns a new object of class '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable</em>'.
	 * @generated
	 */
	Variable createVariable();

	/**
	 * Returns a new object of class '<em>Fuzzy Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fuzzy Variable</em>'.
	 * @generated
	 */
	FuzzyVariable createFuzzyVariable();

	/**
	 * Returns a new object of class '<em>System Body</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Body</em>'.
	 * @generated
	 */
	SystemBody createSystemBody();

	/**
	 * Returns a new object of class '<em>Standard Equation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Standard Equation</em>'.
	 * @generated
	 */
	StandardEquation createStandardEquation();

	/**
	 * Returns a new object of class '<em>Use Equation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Use Equation</em>'.
	 * @generated
	 */
	UseEquation createUseEquation();

	/**
	 * Returns a new object of class '<em>Restrict Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Restrict Expression</em>'.
	 * @generated
	 */
	RestrictExpression createRestrictExpression();

	/**
	 * Returns a new object of class '<em>Auto Restrict Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Auto Restrict Expression</em>'.
	 * @generated
	 */
	AutoRestrictExpression createAutoRestrictExpression();

	/**
	 * Returns a new object of class '<em>Case Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Case Expression</em>'.
	 * @generated
	 */
	CaseExpression createCaseExpression();

	/**
	 * Returns a new object of class '<em>Dependence Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dependence Expression</em>'.
	 * @generated
	 */
	DependenceExpression createDependenceExpression();

	/**
	 * Returns a new object of class '<em>Fuzzy Dependence Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fuzzy Dependence Expression</em>'.
	 * @generated
	 */
	FuzzyDependenceExpression createFuzzyDependenceExpression();

	/**
	 * Returns a new object of class '<em>If Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>If Expression</em>'.
	 * @generated
	 */
	IfExpression createIfExpression();

	/**
	 * Returns a new object of class '<em>Index Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Index Expression</em>'.
	 * @generated
	 */
	IndexExpression createIndexExpression();

	/**
	 * Returns a new object of class '<em>Fuzzy Index Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fuzzy Index Expression</em>'.
	 * @generated
	 */
	FuzzyIndexExpression createFuzzyIndexExpression();

	/**
	 * Returns a new object of class '<em>Reduce Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reduce Expression</em>'.
	 * @generated
	 */
	ReduceExpression createReduceExpression();

	/**
	 * Returns a new object of class '<em>External Reduce Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Reduce Expression</em>'.
	 * @generated
	 */
	ExternalReduceExpression createExternalReduceExpression();

	/**
	 * Returns a new object of class '<em>Arg Reduce Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arg Reduce Expression</em>'.
	 * @generated
	 */
	ArgReduceExpression createArgReduceExpression();

	/**
	 * Returns a new object of class '<em>External Arg Reduce Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Arg Reduce Expression</em>'.
	 * @generated
	 */
	ExternalArgReduceExpression createExternalArgReduceExpression();

	/**
	 * Returns a new object of class '<em>Convolution Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Convolution Expression</em>'.
	 * @generated
	 */
	ConvolutionExpression createConvolutionExpression();

	/**
	 * Returns a new object of class '<em>Select Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Select Expression</em>'.
	 * @generated
	 */
	SelectExpression createSelectExpression();

	/**
	 * Returns a new object of class '<em>Variable Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Expression</em>'.
	 * @generated
	 */
	VariableExpression createVariableExpression();

	/**
	 * Returns a new object of class '<em>Integer Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Expression</em>'.
	 * @generated
	 */
	IntegerExpression createIntegerExpression();

	/**
	 * Returns a new object of class '<em>Real Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Real Expression</em>'.
	 * @generated
	 */
	RealExpression createRealExpression();

	/**
	 * Returns a new object of class '<em>Boolean Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Expression</em>'.
	 * @generated
	 */
	BooleanExpression createBooleanExpression();

	/**
	 * Returns a new object of class '<em>Unary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unary Expression</em>'.
	 * @generated
	 */
	UnaryExpression createUnaryExpression();

	/**
	 * Returns a new object of class '<em>Binary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binary Expression</em>'.
	 * @generated
	 */
	BinaryExpression createBinaryExpression();

	/**
	 * Returns a new object of class '<em>Multi Arg Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multi Arg Expression</em>'.
	 * @generated
	 */
	MultiArgExpression createMultiArgExpression();

	/**
	 * Returns a new object of class '<em>External Multi Arg Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Multi Arg Expression</em>'.
	 * @generated
	 */
	ExternalMultiArgExpression createExternalMultiArgExpression();

	/**
	 * Returns a new object of class '<em>Fuzzy Reduce Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fuzzy Reduce Expression</em>'.
	 * @generated
	 */
	FuzzyReduceExpression createFuzzyReduceExpression();

	/**
	 * Returns a new object of class '<em>External Fuzzy Reduce Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Fuzzy Reduce Expression</em>'.
	 * @generated
	 */
	ExternalFuzzyReduceExpression createExternalFuzzyReduceExpression();

	/**
	 * Returns a new object of class '<em>Fuzzy Arg Reduce Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fuzzy Arg Reduce Expression</em>'.
	 * @generated
	 */
	FuzzyArgReduceExpression createFuzzyArgReduceExpression();

	/**
	 * Returns a new object of class '<em>External Fuzzy Arg Reduce Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Fuzzy Arg Reduce Expression</em>'.
	 * @generated
	 */
	ExternalFuzzyArgReduceExpression createExternalFuzzyArgReduceExpression();

	/**
	 * Returns a new object of class '<em>Polyhedral Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Polyhedral Object</em>'.
	 * @generated
	 */
	PolyhedralObject createPolyhedralObject();

	/**
	 * Returns a new object of class '<em>JNI Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JNI Domain</em>'.
	 * @generated
	 */
	JNIDomain createJNIDomain();

	/**
	 * Returns a new object of class '<em>JNI Domain In Array Notation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JNI Domain In Array Notation</em>'.
	 * @generated
	 */
	JNIDomainInArrayNotation createJNIDomainInArrayNotation();

	/**
	 * Returns a new object of class '<em>JNI Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JNI Relation</em>'.
	 * @generated
	 */
	JNIRelation createJNIRelation();

	/**
	 * Returns a new object of class '<em>JNI Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JNI Function</em>'.
	 * @generated
	 */
	JNIFunction createJNIFunction();

	/**
	 * Returns a new object of class '<em>JNI Function In Array Notation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JNI Function In Array Notation</em>'.
	 * @generated
	 */
	JNIFunctionInArrayNotation createJNIFunctionInArrayNotation();

	/**
	 * Returns a new object of class '<em>Fuzzy Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fuzzy Function</em>'.
	 * @generated
	 */
	FuzzyFunction createFuzzyFunction();

	/**
	 * Returns a new object of class '<em>Nested Fuzzy Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nested Fuzzy Function</em>'.
	 * @generated
	 */
	NestedFuzzyFunction createNestedFuzzyFunction();

	/**
	 * Returns a new object of class '<em>Affine Fuzzy Variable Use</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Affine Fuzzy Variable Use</em>'.
	 * @generated
	 */
	AffineFuzzyVariableUse createAffineFuzzyVariableUse();

	/**
	 * Returns a new object of class '<em>Fuzzy Function In Array Notation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fuzzy Function In Array Notation</em>'.
	 * @generated
	 */
	FuzzyFunctionInArrayNotation createFuzzyFunctionInArrayNotation();

	/**
	 * Returns a new object of class '<em>Unary Calculator Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unary Calculator Expression</em>'.
	 * @generated
	 */
	UnaryCalculatorExpression createUnaryCalculatorExpression();

	/**
	 * Returns a new object of class '<em>Binary Calculator Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binary Calculator Expression</em>'.
	 * @generated
	 */
	BinaryCalculatorExpression createBinaryCalculatorExpression();

	/**
	 * Returns a new object of class '<em>Variable Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Domain</em>'.
	 * @generated
	 */
	VariableDomain createVariableDomain();

	/**
	 * Returns a new object of class '<em>Rectangular Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rectangular Domain</em>'.
	 * @generated
	 */
	RectangularDomain createRectangularDomain();

	/**
	 * Returns a new object of class '<em>Defined Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Defined Object</em>'.
	 * @generated
	 */
	DefinedObject createDefinedObject();

	/**
	 * Returns a new object of class '<em>Alpha Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Alpha Function</em>'.
	 * @generated
	 */
	AlphaFunction createAlphaFunction();

	/**
	 * Returns a new object of class '<em>Alpha Function Binary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Alpha Function Binary Expression</em>'.
	 * @generated
	 */
	AlphaFunctionBinaryExpression createAlphaFunctionBinaryExpression();

	/**
	 * Returns a new object of class '<em>Alpha Function Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Alpha Function Literal</em>'.
	 * @generated
	 */
	AlphaFunctionLiteral createAlphaFunctionLiteral();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ModelPackage getModelPackage();

} //ModelFactory
