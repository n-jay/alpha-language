/**
 */
package alpha.model.impl;

import alpha.model.*;

import fr.irisa.cairn.jnimap.isl.jni.ISL_FORMAT;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLMap;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLMultiAff;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLPWQPolynomial;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLSet;

import fr.irisa.cairn.jnimap.runtime.JNIObject;

import java.util.List;
import java.util.Queue;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelFactoryImpl extends EFactoryImpl implements ModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModelFactory init() {
		try {
			ModelFactory theModelFactory = (ModelFactory)EPackage.Registry.INSTANCE.getEFactory(ModelPackage.eNS_URI);
			if (theModelFactory != null) {
				return theModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ModelPackage.ALPHA_NODE: return createAlphaNode();
			case ModelPackage.ALPHA_ROOT: return createAlphaRoot();
			case ModelPackage.IMPORTS: return createImports();
			case ModelPackage.ALPHA_PACKAGE: return createAlphaPackage();
			case ModelPackage.ALPHA_CONSTANT: return createAlphaConstant();
			case ModelPackage.EXTERNAL_FUNCTION: return createExternalFunction();
			case ModelPackage.ALPHA_SYSTEM: return createAlphaSystem();
			case ModelPackage.VARIABLE: return createVariable();
			case ModelPackage.FUZZY_VARIABLE: return createFuzzyVariable();
			case ModelPackage.SYSTEM_BODY: return createSystemBody();
			case ModelPackage.STANDARD_EQUATION: return createStandardEquation();
			case ModelPackage.USE_EQUATION: return createUseEquation();
			case ModelPackage.RESTRICT_EXPRESSION: return createRestrictExpression();
			case ModelPackage.AUTO_RESTRICT_EXPRESSION: return createAutoRestrictExpression();
			case ModelPackage.CASE_EXPRESSION: return createCaseExpression();
			case ModelPackage.DEPENDENCE_EXPRESSION: return createDependenceExpression();
			case ModelPackage.FUZZY_DEPENDENCE_EXPRESSION: return createFuzzyDependenceExpression();
			case ModelPackage.IF_EXPRESSION: return createIfExpression();
			case ModelPackage.INDEX_EXPRESSION: return createIndexExpression();
			case ModelPackage.POLYNOMIAL_INDEX_EXPRESSION: return createPolynomialIndexExpression();
			case ModelPackage.FUZZY_INDEX_EXPRESSION: return createFuzzyIndexExpression();
			case ModelPackage.REDUCE_EXPRESSION: return createReduceExpression();
			case ModelPackage.EXTERNAL_REDUCE_EXPRESSION: return createExternalReduceExpression();
			case ModelPackage.ARG_REDUCE_EXPRESSION: return createArgReduceExpression();
			case ModelPackage.EXTERNAL_ARG_REDUCE_EXPRESSION: return createExternalArgReduceExpression();
			case ModelPackage.CONVOLUTION_EXPRESSION: return createConvolutionExpression();
			case ModelPackage.SELECT_EXPRESSION: return createSelectExpression();
			case ModelPackage.VARIABLE_EXPRESSION: return createVariableExpression();
			case ModelPackage.INTEGER_EXPRESSION: return createIntegerExpression();
			case ModelPackage.REAL_EXPRESSION: return createRealExpression();
			case ModelPackage.BOOLEAN_EXPRESSION: return createBooleanExpression();
			case ModelPackage.UNARY_EXPRESSION: return createUnaryExpression();
			case ModelPackage.BINARY_EXPRESSION: return createBinaryExpression();
			case ModelPackage.MULTI_ARG_EXPRESSION: return createMultiArgExpression();
			case ModelPackage.EXTERNAL_MULTI_ARG_EXPRESSION: return createExternalMultiArgExpression();
			case ModelPackage.FUZZY_REDUCE_EXPRESSION: return createFuzzyReduceExpression();
			case ModelPackage.EXTERNAL_FUZZY_REDUCE_EXPRESSION: return createExternalFuzzyReduceExpression();
			case ModelPackage.FUZZY_ARG_REDUCE_EXPRESSION: return createFuzzyArgReduceExpression();
			case ModelPackage.EXTERNAL_FUZZY_ARG_REDUCE_EXPRESSION: return createExternalFuzzyArgReduceExpression();
			case ModelPackage.POLYHEDRAL_OBJECT: return createPolyhedralObject();
			case ModelPackage.JNI_DOMAIN: return createJNIDomain();
			case ModelPackage.JNI_DOMAIN_IN_ARRAY_NOTATION: return createJNIDomainInArrayNotation();
			case ModelPackage.JNI_RELATION: return createJNIRelation();
			case ModelPackage.JNI_FUNCTION: return createJNIFunction();
			case ModelPackage.JNI_FUNCTION_IN_ARRAY_NOTATION: return createJNIFunctionInArrayNotation();
			case ModelPackage.JNI_POLYNOMIAL: return createJNIPolynomial();
			case ModelPackage.JNI_POLYNOMIAL_IN_ARRAY_NOTATION: return createJNIPolynomialInArrayNotation();
			case ModelPackage.FUZZY_FUNCTION: return createFuzzyFunction();
			case ModelPackage.NESTED_FUZZY_FUNCTION: return createNestedFuzzyFunction();
			case ModelPackage.AFFINE_FUZZY_VARIABLE_USE: return createAffineFuzzyVariableUse();
			case ModelPackage.FUZZY_FUNCTION_IN_ARRAY_NOTATION: return createFuzzyFunctionInArrayNotation();
			case ModelPackage.UNARY_CALCULATOR_EXPRESSION: return createUnaryCalculatorExpression();
			case ModelPackage.BINARY_CALCULATOR_EXPRESSION: return createBinaryCalculatorExpression();
			case ModelPackage.VARIABLE_DOMAIN: return createVariableDomain();
			case ModelPackage.RECTANGULAR_DOMAIN: return createRectangularDomain();
			case ModelPackage.DEFINED_OBJECT: return createDefinedObject();
			case ModelPackage.ALPHA_FUNCTION: return createAlphaFunction();
			case ModelPackage.ALPHA_FUNCTION_BINARY_EXPRESSION: return createAlphaFunctionBinaryExpression();
			case ModelPackage.ALPHA_FUNCTION_LITERAL: return createAlphaFunctionLiteral();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ModelPackage.UNARY_OP:
				return createUNARY_OPFromString(eDataType, initialValue);
			case ModelPackage.BINARY_OP:
				return createBINARY_OPFromString(eDataType, initialValue);
			case ModelPackage.REDUCTION_OP:
				return createREDUCTION_OPFromString(eDataType, initialValue);
			case ModelPackage.POLY_OBJECT_TYPE:
				return createPOLY_OBJECT_TYPEFromString(eDataType, initialValue);
			case ModelPackage.CALCULATOR_UNARY_OP:
				return createCALCULATOR_UNARY_OPFromString(eDataType, initialValue);
			case ModelPackage.CALCULATOR_BINARY_OP:
				return createCALCULATOR_BINARY_OPFromString(eDataType, initialValue);
			case ModelPackage.JNI_OBJECT:
				return createJNIObjectFromString(eDataType, initialValue);
			case ModelPackage.JNIISL_SET:
				return createJNIISLSetFromString(eDataType, initialValue);
			case ModelPackage.JNIISL_MAP:
				return createJNIISLMapFromString(eDataType, initialValue);
			case ModelPackage.JNIISL_MULTI_AFF:
				return createJNIISLMultiAffFromString(eDataType, initialValue);
			case ModelPackage.JNIISLPWQ_POLYNOMIAL:
				return createJNIISLPWQPolynomialFromString(eDataType, initialValue);
			case ModelPackage.ISL_FORMAT:
				return createISL_FORMATFromString(eDataType, initialValue);
			case ModelPackage.LIST_VARIABLE_EXPRESSION:
				return createListVariableExpressionFromString(eDataType, initialValue);
			case ModelPackage.INTEGER_QUEUE:
				return createIntegerQueueFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ModelPackage.UNARY_OP:
				return convertUNARY_OPToString(eDataType, instanceValue);
			case ModelPackage.BINARY_OP:
				return convertBINARY_OPToString(eDataType, instanceValue);
			case ModelPackage.REDUCTION_OP:
				return convertREDUCTION_OPToString(eDataType, instanceValue);
			case ModelPackage.POLY_OBJECT_TYPE:
				return convertPOLY_OBJECT_TYPEToString(eDataType, instanceValue);
			case ModelPackage.CALCULATOR_UNARY_OP:
				return convertCALCULATOR_UNARY_OPToString(eDataType, instanceValue);
			case ModelPackage.CALCULATOR_BINARY_OP:
				return convertCALCULATOR_BINARY_OPToString(eDataType, instanceValue);
			case ModelPackage.JNI_OBJECT:
				return convertJNIObjectToString(eDataType, instanceValue);
			case ModelPackage.JNIISL_SET:
				return convertJNIISLSetToString(eDataType, instanceValue);
			case ModelPackage.JNIISL_MAP:
				return convertJNIISLMapToString(eDataType, instanceValue);
			case ModelPackage.JNIISL_MULTI_AFF:
				return convertJNIISLMultiAffToString(eDataType, instanceValue);
			case ModelPackage.JNIISLPWQ_POLYNOMIAL:
				return convertJNIISLPWQPolynomialToString(eDataType, instanceValue);
			case ModelPackage.ISL_FORMAT:
				return convertISL_FORMATToString(eDataType, instanceValue);
			case ModelPackage.LIST_VARIABLE_EXPRESSION:
				return convertListVariableExpressionToString(eDataType, instanceValue);
			case ModelPackage.INTEGER_QUEUE:
				return convertIntegerQueueToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AlphaNode createAlphaNode() {
		AlphaNodeImpl alphaNode = new AlphaNodeImpl();
		return alphaNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AlphaRoot createAlphaRoot() {
		AlphaRootImpl alphaRoot = new AlphaRootImpl();
		return alphaRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Imports createImports() {
		ImportsImpl imports = new ImportsImpl();
		return imports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AlphaPackage createAlphaPackage() {
		AlphaPackageImpl alphaPackage = new AlphaPackageImpl();
		return alphaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AlphaConstant createAlphaConstant() {
		AlphaConstantImpl alphaConstant = new AlphaConstantImpl();
		return alphaConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExternalFunction createExternalFunction() {
		ExternalFunctionImpl externalFunction = new ExternalFunctionImpl();
		return externalFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AlphaSystem createAlphaSystem() {
		AlphaSystemImpl alphaSystem = new AlphaSystemImpl();
		return alphaSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FuzzyVariable createFuzzyVariable() {
		FuzzyVariableImpl fuzzyVariable = new FuzzyVariableImpl();
		return fuzzyVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SystemBody createSystemBody() {
		SystemBodyImpl systemBody = new SystemBodyImpl();
		return systemBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StandardEquation createStandardEquation() {
		StandardEquationImpl standardEquation = new StandardEquationImpl();
		return standardEquation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UseEquation createUseEquation() {
		UseEquationImpl useEquation = new UseEquationImpl();
		return useEquation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RestrictExpression createRestrictExpression() {
		RestrictExpressionImpl restrictExpression = new RestrictExpressionImpl();
		return restrictExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AutoRestrictExpression createAutoRestrictExpression() {
		AutoRestrictExpressionImpl autoRestrictExpression = new AutoRestrictExpressionImpl();
		return autoRestrictExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CaseExpression createCaseExpression() {
		CaseExpressionImpl caseExpression = new CaseExpressionImpl();
		return caseExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DependenceExpression createDependenceExpression() {
		DependenceExpressionImpl dependenceExpression = new DependenceExpressionImpl();
		return dependenceExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FuzzyDependenceExpression createFuzzyDependenceExpression() {
		FuzzyDependenceExpressionImpl fuzzyDependenceExpression = new FuzzyDependenceExpressionImpl();
		return fuzzyDependenceExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IfExpression createIfExpression() {
		IfExpressionImpl ifExpression = new IfExpressionImpl();
		return ifExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IndexExpression createIndexExpression() {
		IndexExpressionImpl indexExpression = new IndexExpressionImpl();
		return indexExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PolynomialIndexExpression createPolynomialIndexExpression() {
		PolynomialIndexExpressionImpl polynomialIndexExpression = new PolynomialIndexExpressionImpl();
		return polynomialIndexExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FuzzyIndexExpression createFuzzyIndexExpression() {
		FuzzyIndexExpressionImpl fuzzyIndexExpression = new FuzzyIndexExpressionImpl();
		return fuzzyIndexExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReduceExpression createReduceExpression() {
		ReduceExpressionImpl reduceExpression = new ReduceExpressionImpl();
		return reduceExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExternalReduceExpression createExternalReduceExpression() {
		ExternalReduceExpressionImpl externalReduceExpression = new ExternalReduceExpressionImpl();
		return externalReduceExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArgReduceExpression createArgReduceExpression() {
		ArgReduceExpressionImpl argReduceExpression = new ArgReduceExpressionImpl();
		return argReduceExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExternalArgReduceExpression createExternalArgReduceExpression() {
		ExternalArgReduceExpressionImpl externalArgReduceExpression = new ExternalArgReduceExpressionImpl();
		return externalArgReduceExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConvolutionExpression createConvolutionExpression() {
		ConvolutionExpressionImpl convolutionExpression = new ConvolutionExpressionImpl();
		return convolutionExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SelectExpression createSelectExpression() {
		SelectExpressionImpl selectExpression = new SelectExpressionImpl();
		return selectExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariableExpression createVariableExpression() {
		VariableExpressionImpl variableExpression = new VariableExpressionImpl();
		return variableExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegerExpression createIntegerExpression() {
		IntegerExpressionImpl integerExpression = new IntegerExpressionImpl();
		return integerExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RealExpression createRealExpression() {
		RealExpressionImpl realExpression = new RealExpressionImpl();
		return realExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanExpression createBooleanExpression() {
		BooleanExpressionImpl booleanExpression = new BooleanExpressionImpl();
		return booleanExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnaryExpression createUnaryExpression() {
		UnaryExpressionImpl unaryExpression = new UnaryExpressionImpl();
		return unaryExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BinaryExpression createBinaryExpression() {
		BinaryExpressionImpl binaryExpression = new BinaryExpressionImpl();
		return binaryExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultiArgExpression createMultiArgExpression() {
		MultiArgExpressionImpl multiArgExpression = new MultiArgExpressionImpl();
		return multiArgExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExternalMultiArgExpression createExternalMultiArgExpression() {
		ExternalMultiArgExpressionImpl externalMultiArgExpression = new ExternalMultiArgExpressionImpl();
		return externalMultiArgExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FuzzyReduceExpression createFuzzyReduceExpression() {
		FuzzyReduceExpressionImpl fuzzyReduceExpression = new FuzzyReduceExpressionImpl();
		return fuzzyReduceExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExternalFuzzyReduceExpression createExternalFuzzyReduceExpression() {
		ExternalFuzzyReduceExpressionImpl externalFuzzyReduceExpression = new ExternalFuzzyReduceExpressionImpl();
		return externalFuzzyReduceExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FuzzyArgReduceExpression createFuzzyArgReduceExpression() {
		FuzzyArgReduceExpressionImpl fuzzyArgReduceExpression = new FuzzyArgReduceExpressionImpl();
		return fuzzyArgReduceExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExternalFuzzyArgReduceExpression createExternalFuzzyArgReduceExpression() {
		ExternalFuzzyArgReduceExpressionImpl externalFuzzyArgReduceExpression = new ExternalFuzzyArgReduceExpressionImpl();
		return externalFuzzyArgReduceExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PolyhedralObject createPolyhedralObject() {
		PolyhedralObjectImpl polyhedralObject = new PolyhedralObjectImpl();
		return polyhedralObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JNIDomain createJNIDomain() {
		JNIDomainImpl jniDomain = new JNIDomainImpl();
		return jniDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JNIDomainInArrayNotation createJNIDomainInArrayNotation() {
		JNIDomainInArrayNotationImpl jniDomainInArrayNotation = new JNIDomainInArrayNotationImpl();
		return jniDomainInArrayNotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JNIRelation createJNIRelation() {
		JNIRelationImpl jniRelation = new JNIRelationImpl();
		return jniRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JNIFunction createJNIFunction() {
		JNIFunctionImpl jniFunction = new JNIFunctionImpl();
		return jniFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JNIFunctionInArrayNotation createJNIFunctionInArrayNotation() {
		JNIFunctionInArrayNotationImpl jniFunctionInArrayNotation = new JNIFunctionInArrayNotationImpl();
		return jniFunctionInArrayNotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JNIPolynomial createJNIPolynomial() {
		JNIPolynomialImpl jniPolynomial = new JNIPolynomialImpl();
		return jniPolynomial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JNIPolynomialInArrayNotation createJNIPolynomialInArrayNotation() {
		JNIPolynomialInArrayNotationImpl jniPolynomialInArrayNotation = new JNIPolynomialInArrayNotationImpl();
		return jniPolynomialInArrayNotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FuzzyFunction createFuzzyFunction() {
		FuzzyFunctionImpl fuzzyFunction = new FuzzyFunctionImpl();
		return fuzzyFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NestedFuzzyFunction createNestedFuzzyFunction() {
		NestedFuzzyFunctionImpl nestedFuzzyFunction = new NestedFuzzyFunctionImpl();
		return nestedFuzzyFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AffineFuzzyVariableUse createAffineFuzzyVariableUse() {
		AffineFuzzyVariableUseImpl affineFuzzyVariableUse = new AffineFuzzyVariableUseImpl();
		return affineFuzzyVariableUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FuzzyFunctionInArrayNotation createFuzzyFunctionInArrayNotation() {
		FuzzyFunctionInArrayNotationImpl fuzzyFunctionInArrayNotation = new FuzzyFunctionInArrayNotationImpl();
		return fuzzyFunctionInArrayNotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnaryCalculatorExpression createUnaryCalculatorExpression() {
		UnaryCalculatorExpressionImpl unaryCalculatorExpression = new UnaryCalculatorExpressionImpl();
		return unaryCalculatorExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BinaryCalculatorExpression createBinaryCalculatorExpression() {
		BinaryCalculatorExpressionImpl binaryCalculatorExpression = new BinaryCalculatorExpressionImpl();
		return binaryCalculatorExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariableDomain createVariableDomain() {
		VariableDomainImpl variableDomain = new VariableDomainImpl();
		return variableDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RectangularDomain createRectangularDomain() {
		RectangularDomainImpl rectangularDomain = new RectangularDomainImpl();
		return rectangularDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DefinedObject createDefinedObject() {
		DefinedObjectImpl definedObject = new DefinedObjectImpl();
		return definedObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AlphaFunction createAlphaFunction() {
		AlphaFunctionImpl alphaFunction = new AlphaFunctionImpl();
		return alphaFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AlphaFunctionBinaryExpression createAlphaFunctionBinaryExpression() {
		AlphaFunctionBinaryExpressionImpl alphaFunctionBinaryExpression = new AlphaFunctionBinaryExpressionImpl();
		return alphaFunctionBinaryExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AlphaFunctionLiteral createAlphaFunctionLiteral() {
		AlphaFunctionLiteralImpl alphaFunctionLiteral = new AlphaFunctionLiteralImpl();
		return alphaFunctionLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UNARY_OP createUNARY_OPFromString(EDataType eDataType, String initialValue) {
		UNARY_OP result = UNARY_OP.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUNARY_OPToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BINARY_OP createBINARY_OPFromString(EDataType eDataType, String initialValue) {
		BINARY_OP result = BINARY_OP.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBINARY_OPToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public REDUCTION_OP createREDUCTION_OPFromString(EDataType eDataType, String initialValue) {
		REDUCTION_OP result = REDUCTION_OP.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertREDUCTION_OPToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public POLY_OBJECT_TYPE createPOLY_OBJECT_TYPEFromString(EDataType eDataType, String initialValue) {
		POLY_OBJECT_TYPE result = POLY_OBJECT_TYPE.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPOLY_OBJECT_TYPEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CALCULATOR_UNARY_OP createCALCULATOR_UNARY_OPFromString(EDataType eDataType, String initialValue) {
		CALCULATOR_UNARY_OP result = CALCULATOR_UNARY_OP.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCALCULATOR_UNARY_OPToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CALCULATOR_BINARY_OP createCALCULATOR_BINARY_OPFromString(EDataType eDataType, String initialValue) {
		CALCULATOR_BINARY_OP result = CALCULATOR_BINARY_OP.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCALCULATOR_BINARY_OPToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JNIObject createJNIObjectFromString(EDataType eDataType, String initialValue) {
		return (JNIObject)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJNIObjectToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JNIISLSet createJNIISLSetFromString(EDataType eDataType, String initialValue) {
		return (JNIISLSet)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJNIISLSetToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JNIISLMap createJNIISLMapFromString(EDataType eDataType, String initialValue) {
		return (JNIISLMap)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJNIISLMapToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JNIISLMultiAff createJNIISLMultiAffFromString(EDataType eDataType, String initialValue) {
		return (JNIISLMultiAff)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJNIISLMultiAffToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JNIISLPWQPolynomial createJNIISLPWQPolynomialFromString(EDataType eDataType, String initialValue) {
		return (JNIISLPWQPolynomial)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJNIISLPWQPolynomialToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISL_FORMAT createISL_FORMATFromString(EDataType eDataType, String initialValue) {
		return (ISL_FORMAT)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertISL_FORMATToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<VariableExpression> createListVariableExpressionFromString(EDataType eDataType, String initialValue) {
		return (List<VariableExpression>)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertListVariableExpressionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public Queue<Integer> createIntegerQueueFromString(EDataType eDataType, String initialValue) {
		return (Queue<Integer>)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIntegerQueueToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModelPackage getModelPackage() {
		return (ModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ModelPackage getPackage() {
		return ModelPackage.eINSTANCE;
	}

} //ModelFactoryImpl
