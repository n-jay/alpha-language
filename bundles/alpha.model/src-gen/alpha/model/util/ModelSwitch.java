/**
 */
package alpha.model.util;

import alpha.model.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see alpha.model.ModelPackage
 * @generated
 */
public class ModelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelSwitch() {
		if (modelPackage == null) {
			modelPackage = ModelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ModelPackage.ALPHA_NODE: {
				AlphaNode alphaNode = (AlphaNode)theEObject;
				T result = caseAlphaNode(alphaNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ALPHA_VISITABLE: {
				AlphaVisitable alphaVisitable = (AlphaVisitable)theEObject;
				T result = caseAlphaVisitable(alphaVisitable);
				if (result == null) result = caseAlphaNode(alphaVisitable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ALPHA_EXPRESSION_VISITABLE: {
				AlphaExpressionVisitable alphaExpressionVisitable = (AlphaExpressionVisitable)theEObject;
				T result = caseAlphaExpressionVisitable(alphaExpressionVisitable);
				if (result == null) result = caseAlphaNode(alphaExpressionVisitable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.CALCULATOR_EXPRESSION_VISITABLE: {
				CalculatorExpressionVisitable calculatorExpressionVisitable = (CalculatorExpressionVisitable)theEObject;
				T result = caseCalculatorExpressionVisitable(calculatorExpressionVisitable);
				if (result == null) result = caseAlphaNode(calculatorExpressionVisitable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.DOMAIN_QUALIFIED_ELEMENT: {
				DomainQualifiedElement domainQualifiedElement = (DomainQualifiedElement)theEObject;
				T result = caseDomainQualifiedElement(domainQualifiedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ALPHA_VISITOR: {
				AlphaVisitor alphaVisitor = (AlphaVisitor)theEObject;
				T result = caseAlphaVisitor(alphaVisitor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ALPHA_EXPRESSION_VISITOR: {
				AlphaExpressionVisitor alphaExpressionVisitor = (AlphaExpressionVisitor)theEObject;
				T result = caseAlphaExpressionVisitor(alphaExpressionVisitor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ALPHA_COMPLETE_VISITOR: {
				AlphaCompleteVisitor alphaCompleteVisitor = (AlphaCompleteVisitor)theEObject;
				T result = caseAlphaCompleteVisitor(alphaCompleteVisitor);
				if (result == null) result = caseAlphaVisitor(alphaCompleteVisitor);
				if (result == null) result = caseAlphaExpressionVisitor(alphaCompleteVisitor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.CALCULATOR_EXPRESSION_VISITOR: {
				CalculatorExpressionVisitor calculatorExpressionVisitor = (CalculatorExpressionVisitor)theEObject;
				T result = caseCalculatorExpressionVisitor(calculatorExpressionVisitor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ALPHA_ROOT: {
				AlphaRoot alphaRoot = (AlphaRoot)theEObject;
				T result = caseAlphaRoot(alphaRoot);
				if (result == null) result = caseAlphaVisitable(alphaRoot);
				if (result == null) result = caseAlphaNode(alphaRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ALPHA_ELEMENT: {
				AlphaElement alphaElement = (AlphaElement)theEObject;
				T result = caseAlphaElement(alphaElement);
				if (result == null) result = caseAlphaVisitable(alphaElement);
				if (result == null) result = caseAlphaNode(alphaElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.IMPORTS: {
				Imports imports = (Imports)theEObject;
				T result = caseImports(imports);
				if (result == null) result = caseAlphaElement(imports);
				if (result == null) result = caseAlphaVisitable(imports);
				if (result == null) result = caseAlphaNode(imports);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ALPHA_PACKAGE: {
				AlphaPackage alphaPackage = (AlphaPackage)theEObject;
				T result = caseAlphaPackage(alphaPackage);
				if (result == null) result = caseAlphaElement(alphaPackage);
				if (result == null) result = caseAlphaVisitable(alphaPackage);
				if (result == null) result = caseAlphaNode(alphaPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ALPHA_CONSTANT: {
				AlphaConstant alphaConstant = (AlphaConstant)theEObject;
				T result = caseAlphaConstant(alphaConstant);
				if (result == null) result = caseAlphaElement(alphaConstant);
				if (result == null) result = caseAlphaVisitable(alphaConstant);
				if (result == null) result = caseAlphaNode(alphaConstant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.EXTERNAL_FUNCTION: {
				ExternalFunction externalFunction = (ExternalFunction)theEObject;
				T result = caseExternalFunction(externalFunction);
				if (result == null) result = caseAlphaElement(externalFunction);
				if (result == null) result = caseAlphaVisitable(externalFunction);
				if (result == null) result = caseAlphaNode(externalFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ALPHA_SYSTEM: {
				AlphaSystem alphaSystem = (AlphaSystem)theEObject;
				T result = caseAlphaSystem(alphaSystem);
				if (result == null) result = caseAlphaElement(alphaSystem);
				if (result == null) result = caseAlphaVisitable(alphaSystem);
				if (result == null) result = caseAlphaNode(alphaSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.VARIABLE: {
				Variable variable = (Variable)theEObject;
				T result = caseVariable(variable);
				if (result == null) result = caseAlphaVisitable(variable);
				if (result == null) result = caseAlphaNode(variable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.INPUT_VARIABLE: {
				InputVariable inputVariable = (InputVariable)theEObject;
				T result = caseInputVariable(inputVariable);
				if (result == null) result = caseVariable(inputVariable);
				if (result == null) result = caseAlphaVisitable(inputVariable);
				if (result == null) result = caseAlphaNode(inputVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.OUTPUT_VARIABLE: {
				OutputVariable outputVariable = (OutputVariable)theEObject;
				T result = caseOutputVariable(outputVariable);
				if (result == null) result = caseVariable(outputVariable);
				if (result == null) result = caseAlphaVisitable(outputVariable);
				if (result == null) result = caseAlphaNode(outputVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.LOCAL_VARIABLE: {
				LocalVariable localVariable = (LocalVariable)theEObject;
				T result = caseLocalVariable(localVariable);
				if (result == null) result = caseVariable(localVariable);
				if (result == null) result = caseAlphaVisitable(localVariable);
				if (result == null) result = caseAlphaNode(localVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.FUZZY_VARIABLE: {
				FuzzyVariable fuzzyVariable = (FuzzyVariable)theEObject;
				T result = caseFuzzyVariable(fuzzyVariable);
				if (result == null) result = caseVariable(fuzzyVariable);
				if (result == null) result = caseAlphaVisitable(fuzzyVariable);
				if (result == null) result = caseAlphaNode(fuzzyVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.STANDARD_EQUATION: {
				StandardEquation standardEquation = (StandardEquation)theEObject;
				T result = caseStandardEquation(standardEquation);
				if (result == null) result = caseAlphaVisitable(standardEquation);
				if (result == null) result = caseAlphaNode(standardEquation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.USE_EQUATION: {
				UseEquation useEquation = (UseEquation)theEObject;
				T result = caseUseEquation(useEquation);
				if (result == null) result = caseAlphaVisitable(useEquation);
				if (result == null) result = caseAlphaNode(useEquation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ALPHA_EXPRESSION: {
				AlphaExpression alphaExpression = (AlphaExpression)theEObject;
				T result = caseAlphaExpression(alphaExpression);
				if (result == null) result = caseAlphaExpressionVisitable(alphaExpression);
				if (result == null) result = caseAlphaNode(alphaExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.RESTRICT_EXPRESSION: {
				RestrictExpression restrictExpression = (RestrictExpression)theEObject;
				T result = caseRestrictExpression(restrictExpression);
				if (result == null) result = caseAlphaExpression(restrictExpression);
				if (result == null) result = caseAlphaExpressionVisitable(restrictExpression);
				if (result == null) result = caseAlphaNode(restrictExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.AUTO_RESTRICT_EXPRESSION: {
				AutoRestrictExpression autoRestrictExpression = (AutoRestrictExpression)theEObject;
				T result = caseAutoRestrictExpression(autoRestrictExpression);
				if (result == null) result = caseAlphaExpression(autoRestrictExpression);
				if (result == null) result = caseAlphaExpressionVisitable(autoRestrictExpression);
				if (result == null) result = caseAlphaNode(autoRestrictExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.CASE_EXPRESSION: {
				CaseExpression caseExpression = (CaseExpression)theEObject;
				T result = caseCaseExpression(caseExpression);
				if (result == null) result = caseAlphaExpression(caseExpression);
				if (result == null) result = caseAlphaExpressionVisitable(caseExpression);
				if (result == null) result = caseAlphaNode(caseExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.DEPENDENCE_EXPRESSION: {
				DependenceExpression dependenceExpression = (DependenceExpression)theEObject;
				T result = caseDependenceExpression(dependenceExpression);
				if (result == null) result = caseAlphaExpression(dependenceExpression);
				if (result == null) result = caseAlphaExpressionVisitable(dependenceExpression);
				if (result == null) result = caseAlphaNode(dependenceExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.IF_EXPRESSION: {
				IfExpression ifExpression = (IfExpression)theEObject;
				T result = caseIfExpression(ifExpression);
				if (result == null) result = caseAlphaExpression(ifExpression);
				if (result == null) result = caseAlphaExpressionVisitable(ifExpression);
				if (result == null) result = caseAlphaNode(ifExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.INDEX_EXPRESSION: {
				IndexExpression indexExpression = (IndexExpression)theEObject;
				T result = caseIndexExpression(indexExpression);
				if (result == null) result = caseAlphaExpression(indexExpression);
				if (result == null) result = caseAlphaExpressionVisitable(indexExpression);
				if (result == null) result = caseAlphaNode(indexExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.REDUCE_EXPRESSION: {
				ReduceExpression reduceExpression = (ReduceExpression)theEObject;
				T result = caseReduceExpression(reduceExpression);
				if (result == null) result = caseAlphaExpression(reduceExpression);
				if (result == null) result = caseAlphaExpressionVisitable(reduceExpression);
				if (result == null) result = caseAlphaNode(reduceExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.EXTERNAL_REDUCE_EXPRESSION: {
				ExternalReduceExpression externalReduceExpression = (ExternalReduceExpression)theEObject;
				T result = caseExternalReduceExpression(externalReduceExpression);
				if (result == null) result = caseReduceExpression(externalReduceExpression);
				if (result == null) result = caseAlphaExpression(externalReduceExpression);
				if (result == null) result = caseAlphaExpressionVisitable(externalReduceExpression);
				if (result == null) result = caseAlphaNode(externalReduceExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.CONVOLUTION_EXPRESSION: {
				ConvolutionExpression convolutionExpression = (ConvolutionExpression)theEObject;
				T result = caseConvolutionExpression(convolutionExpression);
				if (result == null) result = caseAlphaExpression(convolutionExpression);
				if (result == null) result = caseAlphaExpressionVisitable(convolutionExpression);
				if (result == null) result = caseAlphaNode(convolutionExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.VARIABLE_EXPRESSION: {
				VariableExpression variableExpression = (VariableExpression)theEObject;
				T result = caseVariableExpression(variableExpression);
				if (result == null) result = caseAlphaExpression(variableExpression);
				if (result == null) result = caseAlphaExpressionVisitable(variableExpression);
				if (result == null) result = caseAlphaNode(variableExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.CONSTANT_EXPRESSION: {
				ConstantExpression constantExpression = (ConstantExpression)theEObject;
				T result = caseConstantExpression(constantExpression);
				if (result == null) result = caseAlphaExpression(constantExpression);
				if (result == null) result = caseAlphaExpressionVisitable(constantExpression);
				if (result == null) result = caseAlphaNode(constantExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.INTEGER_EXPRESSION: {
				IntegerExpression integerExpression = (IntegerExpression)theEObject;
				T result = caseIntegerExpression(integerExpression);
				if (result == null) result = caseConstantExpression(integerExpression);
				if (result == null) result = caseAlphaExpression(integerExpression);
				if (result == null) result = caseAlphaExpressionVisitable(integerExpression);
				if (result == null) result = caseAlphaNode(integerExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.REAL_EXPRESSION: {
				RealExpression realExpression = (RealExpression)theEObject;
				T result = caseRealExpression(realExpression);
				if (result == null) result = caseConstantExpression(realExpression);
				if (result == null) result = caseAlphaExpression(realExpression);
				if (result == null) result = caseAlphaExpressionVisitable(realExpression);
				if (result == null) result = caseAlphaNode(realExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.BOOLEAN_EXPRESSION: {
				BooleanExpression booleanExpression = (BooleanExpression)theEObject;
				T result = caseBooleanExpression(booleanExpression);
				if (result == null) result = caseConstantExpression(booleanExpression);
				if (result == null) result = caseAlphaExpression(booleanExpression);
				if (result == null) result = caseAlphaExpressionVisitable(booleanExpression);
				if (result == null) result = caseAlphaNode(booleanExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.UNARY_EXPRESSION: {
				UnaryExpression unaryExpression = (UnaryExpression)theEObject;
				T result = caseUnaryExpression(unaryExpression);
				if (result == null) result = caseAlphaExpression(unaryExpression);
				if (result == null) result = caseAlphaExpressionVisitable(unaryExpression);
				if (result == null) result = caseAlphaNode(unaryExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.BINARY_EXPRESSION: {
				BinaryExpression binaryExpression = (BinaryExpression)theEObject;
				T result = caseBinaryExpression(binaryExpression);
				if (result == null) result = caseAlphaExpression(binaryExpression);
				if (result == null) result = caseAlphaExpressionVisitable(binaryExpression);
				if (result == null) result = caseAlphaNode(binaryExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.MULTI_ARG_EXPRESSION: {
				MultiArgExpression multiArgExpression = (MultiArgExpression)theEObject;
				T result = caseMultiArgExpression(multiArgExpression);
				if (result == null) result = caseAlphaExpression(multiArgExpression);
				if (result == null) result = caseAlphaExpressionVisitable(multiArgExpression);
				if (result == null) result = caseAlphaNode(multiArgExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.EXTERNAL_MULTI_ARG_EXPRESSION: {
				ExternalMultiArgExpression externalMultiArgExpression = (ExternalMultiArgExpression)theEObject;
				T result = caseExternalMultiArgExpression(externalMultiArgExpression);
				if (result == null) result = caseMultiArgExpression(externalMultiArgExpression);
				if (result == null) result = caseAlphaExpression(externalMultiArgExpression);
				if (result == null) result = caseAlphaExpressionVisitable(externalMultiArgExpression);
				if (result == null) result = caseAlphaNode(externalMultiArgExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.CALCULATOR_NODE: {
				CalculatorNode calculatorNode = (CalculatorNode)theEObject;
				T result = caseCalculatorNode(calculatorNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.POLYHEDRAL_OBJECT: {
				PolyhedralObject polyhedralObject = (PolyhedralObject)theEObject;
				T result = casePolyhedralObject(polyhedralObject);
				if (result == null) result = caseCalculatorNode(polyhedralObject);
				if (result == null) result = caseAlphaVisitable(polyhedralObject);
				if (result == null) result = caseAlphaNode(polyhedralObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.CALCULATOR_EXPRESSION: {
				CalculatorExpression calculatorExpression = (CalculatorExpression)theEObject;
				T result = caseCalculatorExpression(calculatorExpression);
				if (result == null) result = caseCalculatorNode(calculatorExpression);
				if (result == null) result = caseCalculatorExpressionVisitable(calculatorExpression);
				if (result == null) result = caseAlphaNode(calculatorExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.JNI_DOMAIN: {
				JNIDomain jniDomain = (JNIDomain)theEObject;
				T result = caseJNIDomain(jniDomain);
				if (result == null) result = caseCalculatorExpression(jniDomain);
				if (result == null) result = caseCalculatorNode(jniDomain);
				if (result == null) result = caseCalculatorExpressionVisitable(jniDomain);
				if (result == null) result = caseAlphaNode(jniDomain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.JNI_RELATION: {
				JNIRelation jniRelation = (JNIRelation)theEObject;
				T result = caseJNIRelation(jniRelation);
				if (result == null) result = caseCalculatorExpression(jniRelation);
				if (result == null) result = caseCalculatorNode(jniRelation);
				if (result == null) result = caseCalculatorExpressionVisitable(jniRelation);
				if (result == null) result = caseAlphaNode(jniRelation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.JNI_FUNCTION: {
				JNIFunction jniFunction = (JNIFunction)theEObject;
				T result = caseJNIFunction(jniFunction);
				if (result == null) result = caseCalculatorExpression(jniFunction);
				if (result == null) result = caseCalculatorNode(jniFunction);
				if (result == null) result = caseCalculatorExpressionVisitable(jniFunction);
				if (result == null) result = caseAlphaNode(jniFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.JNI_FUNCTION_IN_ARRAY_NOTATION: {
				JNIFunctionInArrayNotation jniFunctionInArrayNotation = (JNIFunctionInArrayNotation)theEObject;
				T result = caseJNIFunctionInArrayNotation(jniFunctionInArrayNotation);
				if (result == null) result = caseJNIFunction(jniFunctionInArrayNotation);
				if (result == null) result = caseCalculatorExpression(jniFunctionInArrayNotation);
				if (result == null) result = caseCalculatorNode(jniFunctionInArrayNotation);
				if (result == null) result = caseCalculatorExpressionVisitable(jniFunctionInArrayNotation);
				if (result == null) result = caseAlphaNode(jniFunctionInArrayNotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.UNARY_CALCULATOR_EXPRESSION: {
				UnaryCalculatorExpression unaryCalculatorExpression = (UnaryCalculatorExpression)theEObject;
				T result = caseUnaryCalculatorExpression(unaryCalculatorExpression);
				if (result == null) result = caseCalculatorExpression(unaryCalculatorExpression);
				if (result == null) result = caseCalculatorNode(unaryCalculatorExpression);
				if (result == null) result = caseCalculatorExpressionVisitable(unaryCalculatorExpression);
				if (result == null) result = caseAlphaNode(unaryCalculatorExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.BINARY_CALCULATOR_EXPRESSION: {
				BinaryCalculatorExpression binaryCalculatorExpression = (BinaryCalculatorExpression)theEObject;
				T result = caseBinaryCalculatorExpression(binaryCalculatorExpression);
				if (result == null) result = caseCalculatorExpression(binaryCalculatorExpression);
				if (result == null) result = caseCalculatorNode(binaryCalculatorExpression);
				if (result == null) result = caseCalculatorExpressionVisitable(binaryCalculatorExpression);
				if (result == null) result = caseAlphaNode(binaryCalculatorExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.VARIABLE_DOMAIN: {
				VariableDomain variableDomain = (VariableDomain)theEObject;
				T result = caseVariableDomain(variableDomain);
				if (result == null) result = caseCalculatorExpression(variableDomain);
				if (result == null) result = caseCalculatorNode(variableDomain);
				if (result == null) result = caseCalculatorExpressionVisitable(variableDomain);
				if (result == null) result = caseAlphaNode(variableDomain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.RECTANGULAR_DOMAIN: {
				RectangularDomain rectangularDomain = (RectangularDomain)theEObject;
				T result = caseRectangularDomain(rectangularDomain);
				if (result == null) result = caseCalculatorExpression(rectangularDomain);
				if (result == null) result = caseCalculatorNode(rectangularDomain);
				if (result == null) result = caseCalculatorExpressionVisitable(rectangularDomain);
				if (result == null) result = caseAlphaNode(rectangularDomain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.DEFINED_OBJECT: {
				DefinedObject definedObject = (DefinedObject)theEObject;
				T result = caseDefinedObject(definedObject);
				if (result == null) result = caseCalculatorExpression(definedObject);
				if (result == null) result = caseCalculatorNode(definedObject);
				if (result == null) result = caseCalculatorExpressionVisitable(definedObject);
				if (result == null) result = caseAlphaNode(definedObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alpha Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alpha Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlphaNode(AlphaNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alpha Visitable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alpha Visitable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlphaVisitable(AlphaVisitable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alpha Expression Visitable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alpha Expression Visitable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlphaExpressionVisitable(AlphaExpressionVisitable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calculator Expression Visitable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calculator Expression Visitable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalculatorExpressionVisitable(CalculatorExpressionVisitable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Qualified Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Qualified Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainQualifiedElement(DomainQualifiedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alpha Visitor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alpha Visitor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlphaVisitor(AlphaVisitor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alpha Expression Visitor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alpha Expression Visitor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlphaExpressionVisitor(AlphaExpressionVisitor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alpha Complete Visitor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alpha Complete Visitor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlphaCompleteVisitor(AlphaCompleteVisitor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calculator Expression Visitor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calculator Expression Visitor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalculatorExpressionVisitor(CalculatorExpressionVisitor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alpha Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alpha Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlphaRoot(AlphaRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alpha Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alpha Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlphaElement(AlphaElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Imports</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Imports</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImports(Imports object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alpha Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alpha Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlphaPackage(AlphaPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alpha Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alpha Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlphaConstant(AlphaConstant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalFunction(ExternalFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alpha System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alpha System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlphaSystem(AlphaSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariable(Variable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputVariable(InputVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputVariable(OutputVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Local Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalVariable(LocalVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fuzzy Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fuzzy Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFuzzyVariable(FuzzyVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Standard Equation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Standard Equation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStandardEquation(StandardEquation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Use Equation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Use Equation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUseEquation(UseEquation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alpha Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alpha Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlphaExpression(AlphaExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Restrict Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Restrict Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRestrictExpression(RestrictExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Auto Restrict Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Auto Restrict Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAutoRestrictExpression(AutoRestrictExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Case Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Case Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCaseExpression(CaseExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dependence Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dependence Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDependenceExpression(DependenceExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>If Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>If Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIfExpression(IfExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Index Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Index Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndexExpression(IndexExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reduce Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reduce Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReduceExpression(ReduceExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Reduce Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Reduce Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalReduceExpression(ExternalReduceExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Convolution Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Convolution Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConvolutionExpression(ConvolutionExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableExpression(VariableExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constant Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constant Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstantExpression(ConstantExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerExpression(IntegerExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Real Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Real Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRealExpression(RealExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanExpression(BooleanExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnaryExpression(UnaryExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryExpression(BinaryExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi Arg Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi Arg Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiArgExpression(MultiArgExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Multi Arg Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Multi Arg Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalMultiArgExpression(ExternalMultiArgExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calculator Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calculator Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalculatorNode(CalculatorNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Polyhedral Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Polyhedral Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePolyhedralObject(PolyhedralObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calculator Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calculator Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalculatorExpression(CalculatorExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JNI Domain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JNI Domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJNIDomain(JNIDomain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JNI Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JNI Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJNIRelation(JNIRelation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JNI Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JNI Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJNIFunction(JNIFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JNI Function In Array Notation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JNI Function In Array Notation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJNIFunctionInArrayNotation(JNIFunctionInArrayNotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Calculator Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Calculator Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnaryCalculatorExpression(UnaryCalculatorExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Calculator Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Calculator Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryCalculatorExpression(BinaryCalculatorExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Domain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableDomain(VariableDomain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rectangular Domain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rectangular Domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRectangularDomain(RectangularDomain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Defined Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Defined Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefinedObject(DefinedObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ModelSwitch
