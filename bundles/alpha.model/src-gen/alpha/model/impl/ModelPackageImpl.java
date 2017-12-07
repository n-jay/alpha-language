/**
 */
package alpha.model.impl;

import alpha.model.AlphaCompleteVisitor;
import alpha.model.AlphaConstant;
import alpha.model.AlphaElement;
import alpha.model.AlphaExpression;
import alpha.model.AlphaExpressionVisitable;
import alpha.model.AlphaExpressionVisitor;
import alpha.model.AlphaNode;
import alpha.model.AlphaPackage;
import alpha.model.AlphaRoot;
import alpha.model.AlphaSystem;
import alpha.model.AlphaVisitable;
import alpha.model.AlphaVisitor;
import alpha.model.ArgReduceExpression;
import alpha.model.AutoRestrictExpression;
import alpha.model.BinaryCalculatorExpression;
import alpha.model.BinaryExpression;
import alpha.model.BooleanExpression;
import alpha.model.CalculatorExpression;
import alpha.model.CalculatorExpressionVisitable;
import alpha.model.CalculatorExpressionVisitor;
import alpha.model.CalculatorNode;
import alpha.model.CaseExpression;
import alpha.model.ConstantExpression;
import alpha.model.ConvolutionExpression;
import alpha.model.DefinedObject;
import alpha.model.DependenceExpression;
import alpha.model.DomainQualifiedElement;
import alpha.model.ExternalArgReduceExpression;
import alpha.model.ExternalFunction;
import alpha.model.ExternalMultiArgExpression;
import alpha.model.ExternalReduceExpression;
import alpha.model.FuzzyVariable;
import alpha.model.IfExpression;
import alpha.model.Imports;
import alpha.model.IndexExpression;
import alpha.model.InputVariable;
import alpha.model.IntegerExpression;
import alpha.model.JNIDomain;
import alpha.model.JNIFunction;
import alpha.model.JNIFunctionInArrayNotation;
import alpha.model.JNIRelation;
import alpha.model.LocalVariable;
import alpha.model.ModelFactory;
import alpha.model.ModelPackage;
import alpha.model.MultiArgExpression;
import alpha.model.OutputVariable;
import alpha.model.PolyhedralObject;
import alpha.model.RealExpression;
import alpha.model.RectangularDomain;
import alpha.model.ReduceExpression;
import alpha.model.RestrictExpression;
import alpha.model.SelectExpression;
import alpha.model.StandardEquation;
import alpha.model.UnaryCalculatorExpression;
import alpha.model.UnaryExpression;
import alpha.model.UseEquation;
import alpha.model.Variable;
import alpha.model.VariableDomain;
import alpha.model.VariableExpression;

import fr.irisa.cairn.jnimap.isl.jni.JNIISLMap;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLMultiAff;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLSet;

import fr.irisa.cairn.jnimap.runtime.JNIObject;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelPackageImpl extends EPackageImpl implements ModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alphaNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alphaVisitableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alphaExpressionVisitableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calculatorExpressionVisitableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainQualifiedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alphaVisitorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alphaExpressionVisitorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alphaCompleteVisitorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calculatorExpressionVisitorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alphaRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alphaElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alphaPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alphaConstantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alphaSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fuzzyVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass standardEquationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass useEquationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alphaExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass restrictExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass autoRestrictExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass caseExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dependenceExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ifExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass indexExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reduceExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalReduceExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass argReduceExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalArgReduceExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass convolutionExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constantExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiArgExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalMultiArgExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calculatorNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass polyhedralObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calculatorExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jniDomainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jniRelationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jniFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jniFunctionInArrayNotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryCalculatorExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryCalculatorExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableDomainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rectangularDomainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass definedObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum unarY_OPEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum binarY_OPEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum reductioN_OPEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum polY_OBJECT_TYPEEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum calculatoR_UNARY_OPEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum calculatoR_BINARY_OPEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType jniObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType jniislSetEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType jniislMapEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType jniislMultiAffEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType isL_FORMATEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see alpha.model.ModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ModelPackageImpl() {
		super(eNS_URI, ModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ModelPackage init() {
		if (isInited) return (ModelPackage)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI);

		// Obtain or create and register package
		ModelPackageImpl theModelPackage = (ModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ModelPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theModelPackage.createPackageContents();

		// Initialize created meta-data
		theModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ModelPackage.eNS_URI, theModelPackage);
		return theModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlphaNode() {
		return alphaNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlphaVisitable() {
		return alphaVisitableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlphaExpressionVisitable() {
		return alphaExpressionVisitableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalculatorExpressionVisitable() {
		return calculatorExpressionVisitableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainQualifiedElement() {
		return domainQualifiedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlphaVisitor() {
		return alphaVisitorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlphaExpressionVisitor() {
		return alphaExpressionVisitorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlphaCompleteVisitor() {
		return alphaCompleteVisitorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalculatorExpressionVisitor() {
		return calculatorExpressionVisitorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlphaRoot() {
		return alphaRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlphaRoot_Elements() {
		return (EReference)alphaRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlphaElement() {
		return alphaElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImports() {
		return importsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImports_ImportedNamespace() {
		return (EAttribute)importsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlphaPackage() {
		return alphaPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlphaPackage_Name() {
		return (EAttribute)alphaPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlphaPackage_Elements() {
		return (EReference)alphaPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlphaConstant() {
		return alphaConstantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlphaConstant_Name() {
		return (EAttribute)alphaConstantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlphaConstant_Value() {
		return (EAttribute)alphaConstantEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalFunction() {
		return externalFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExternalFunction_Name() {
		return (EAttribute)externalFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExternalFunction_Cardinarity() {
		return (EAttribute)externalFunctionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlphaSystem() {
		return alphaSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlphaSystem_Name() {
		return (EAttribute)alphaSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlphaSystem_ParameterDomain() {
		return (EReference)alphaSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlphaSystem_DefinedObjects() {
		return (EReference)alphaSystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlphaSystem_Inputs() {
		return (EReference)alphaSystemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlphaSystem_Outputs() {
		return (EReference)alphaSystemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlphaSystem_Locals() {
		return (EReference)alphaSystemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlphaSystem_FuzzyVariables() {
		return (EReference)alphaSystemEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlphaSystem_WhileDomain() {
		return (EReference)alphaSystemEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlphaSystem_TestExpression() {
		return (EReference)alphaSystemEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlphaSystem_UseEquations() {
		return (EReference)alphaSystemEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlphaSystem_Equations() {
		return (EReference)alphaSystemEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Name() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariable_DomainExpr() {
		return (EReference)variableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputVariable() {
		return inputVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputVariable() {
		return outputVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalVariable() {
		return localVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFuzzyVariable() {
		return fuzzyVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStandardEquation() {
		return standardEquationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStandardEquation_Variable() {
		return (EReference)standardEquationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStandardEquation_IndexNames() {
		return (EAttribute)standardEquationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStandardEquation_Expr() {
		return (EReference)standardEquationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUseEquation() {
		return useEquationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUseEquation_System() {
		return (EReference)useEquationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUseEquation_InstantiationDomain() {
		return (EReference)useEquationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUseEquation_CallParams() {
		return (EReference)useEquationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUseEquation_SubsystemDims() {
		return (EAttribute)useEquationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUseEquation_InputExprs() {
		return (EReference)useEquationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUseEquation_OutputExprs() {
		return (EReference)useEquationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlphaExpression() {
		return alphaExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRestrictExpression() {
		return restrictExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRestrictExpression_DomainExpr() {
		return (EReference)restrictExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRestrictExpression_Expr() {
		return (EReference)restrictExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAutoRestrictExpression() {
		return autoRestrictExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAutoRestrictExpression_InferredDomain() {
		return (EReference)autoRestrictExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAutoRestrictExpression_Expr() {
		return (EReference)autoRestrictExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCaseExpression() {
		return caseExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCaseExpression_Name() {
		return (EAttribute)caseExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCaseExpression_Exprs() {
		return (EReference)caseExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDependenceExpression() {
		return dependenceExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependenceExpression_Function() {
		return (EReference)dependenceExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependenceExpression_Expr() {
		return (EReference)dependenceExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIfExpression() {
		return ifExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfExpression_CondExpr() {
		return (EReference)ifExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfExpression_ThenExpr() {
		return (EReference)ifExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfExpression_ElseExpr() {
		return (EReference)ifExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndexExpression() {
		return indexExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndexExpression_Function() {
		return (EReference)indexExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReduceExpression() {
		return reduceExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReduceExpression_Operator() {
		return (EAttribute)reduceExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReduceExpression_Projection() {
		return (EReference)reduceExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReduceExpression_Body() {
		return (EReference)reduceExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalReduceExpression() {
		return externalReduceExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExternalReduceExpression_ExternalFunction() {
		return (EReference)externalReduceExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArgReduceExpression() {
		return argReduceExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArgReduceExpression_Operator() {
		return (EAttribute)argReduceExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArgReduceExpression_Projection() {
		return (EReference)argReduceExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArgReduceExpression_Body() {
		return (EReference)argReduceExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalArgReduceExpression() {
		return externalArgReduceExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExternalArgReduceExpression_ExternalFunction() {
		return (EReference)externalArgReduceExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConvolutionExpression() {
		return convolutionExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConvolutionExpression_KernelDomain() {
		return (EReference)convolutionExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConvolutionExpression_KernelExpression() {
		return (EReference)convolutionExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConvolutionExpression_DataExpression() {
		return (EReference)convolutionExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelectExpression() {
		return selectExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelectExpression_SelectRelation() {
		return (EReference)selectExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelectExpression_Expr() {
		return (EReference)selectExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableExpression() {
		return variableExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableExpression_Variable() {
		return (EReference)variableExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstantExpression() {
		return constantExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerExpression() {
		return integerExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerExpression_Value() {
		return (EAttribute)integerExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRealExpression() {
		return realExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRealExpression_Value() {
		return (EAttribute)realExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanExpression() {
		return booleanExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanExpression_Value() {
		return (EAttribute)booleanExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryExpression() {
		return unaryExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnaryExpression_Operator() {
		return (EAttribute)unaryExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnaryExpression_Expr() {
		return (EReference)unaryExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryExpression() {
		return binaryExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinaryExpression_Operator() {
		return (EAttribute)binaryExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryExpression_Left() {
		return (EReference)binaryExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryExpression_Right() {
		return (EReference)binaryExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiArgExpression() {
		return multiArgExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiArgExpression_Operator() {
		return (EAttribute)multiArgExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiArgExpression_Exprs() {
		return (EReference)multiArgExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalMultiArgExpression() {
		return externalMultiArgExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExternalMultiArgExpression_ExternalFunction() {
		return (EReference)externalMultiArgExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalculatorNode() {
		return calculatorNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPolyhedralObject() {
		return polyhedralObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolyhedralObject_Name() {
		return (EAttribute)polyhedralObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolyhedralObject_Expr() {
		return (EReference)polyhedralObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalculatorExpression() {
		return calculatorExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCalculatorExpression_ErrorMessage() {
		return (EAttribute)calculatorExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJNIDomain() {
		return jniDomainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJNIDomain_IslString() {
		return (EAttribute)jniDomainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJNIDomain_IslSet() {
		return (EAttribute)jniDomainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJNIRelation() {
		return jniRelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJNIRelation_IslString() {
		return (EAttribute)jniRelationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJNIRelation_IslMap() {
		return (EAttribute)jniRelationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJNIFunction() {
		return jniFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJNIFunction_AlphaString() {
		return (EAttribute)jniFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJNIFunction_IslMAff() {
		return (EAttribute)jniFunctionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJNIFunctionInArrayNotation() {
		return jniFunctionInArrayNotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJNIFunctionInArrayNotation_ArrayNotation() {
		return (EAttribute)jniFunctionInArrayNotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryCalculatorExpression() {
		return unaryCalculatorExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnaryCalculatorExpression_Operator() {
		return (EAttribute)unaryCalculatorExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnaryCalculatorExpression_Expr() {
		return (EReference)unaryCalculatorExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnaryCalculatorExpression___internal_cache_islObject() {
		return (EAttribute)unaryCalculatorExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryCalculatorExpression() {
		return binaryCalculatorExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinaryCalculatorExpression_Operator() {
		return (EAttribute)binaryCalculatorExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryCalculatorExpression_Left() {
		return (EReference)binaryCalculatorExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryCalculatorExpression_Right() {
		return (EReference)binaryCalculatorExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinaryCalculatorExpression___internal_cache_islObject() {
		return (EAttribute)binaryCalculatorExpressionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableDomain() {
		return variableDomainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableDomain_Variable() {
		return (EReference)variableDomainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRectangularDomain() {
		return rectangularDomainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectangularDomain_UpperBounds() {
		return (EAttribute)rectangularDomainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectangularDomain_IndexNames() {
		return (EAttribute)rectangularDomainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectangularDomain_IslSet() {
		return (EAttribute)rectangularDomainEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefinedObject() {
		return definedObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefinedObject_Object() {
		return (EReference)definedObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDefinedObject___internalCycleDetector() {
		return (EAttribute)definedObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUNARY_OP() {
		return unarY_OPEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBINARY_OP() {
		return binarY_OPEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getREDUCTION_OP() {
		return reductioN_OPEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPOLY_OBJECT_TYPE() {
		return polY_OBJECT_TYPEEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCALCULATOR_UNARY_OP() {
		return calculatoR_UNARY_OPEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCALCULATOR_BINARY_OP() {
		return calculatoR_BINARY_OPEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getJNIObject() {
		return jniObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getJNIISLSet() {
		return jniislSetEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getJNIISLMap() {
		return jniislMapEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getJNIISLMultiAff() {
		return jniislMultiAffEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getISL_FORMAT() {
		return isL_FORMATEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactory getModelFactory() {
		return (ModelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		alphaNodeEClass = createEClass(ALPHA_NODE);

		alphaVisitableEClass = createEClass(ALPHA_VISITABLE);

		alphaExpressionVisitableEClass = createEClass(ALPHA_EXPRESSION_VISITABLE);

		calculatorExpressionVisitableEClass = createEClass(CALCULATOR_EXPRESSION_VISITABLE);

		domainQualifiedElementEClass = createEClass(DOMAIN_QUALIFIED_ELEMENT);

		alphaVisitorEClass = createEClass(ALPHA_VISITOR);

		alphaExpressionVisitorEClass = createEClass(ALPHA_EXPRESSION_VISITOR);

		alphaCompleteVisitorEClass = createEClass(ALPHA_COMPLETE_VISITOR);

		calculatorExpressionVisitorEClass = createEClass(CALCULATOR_EXPRESSION_VISITOR);

		alphaRootEClass = createEClass(ALPHA_ROOT);
		createEReference(alphaRootEClass, ALPHA_ROOT__ELEMENTS);

		alphaElementEClass = createEClass(ALPHA_ELEMENT);

		importsEClass = createEClass(IMPORTS);
		createEAttribute(importsEClass, IMPORTS__IMPORTED_NAMESPACE);

		alphaPackageEClass = createEClass(ALPHA_PACKAGE);
		createEAttribute(alphaPackageEClass, ALPHA_PACKAGE__NAME);
		createEReference(alphaPackageEClass, ALPHA_PACKAGE__ELEMENTS);

		alphaConstantEClass = createEClass(ALPHA_CONSTANT);
		createEAttribute(alphaConstantEClass, ALPHA_CONSTANT__NAME);
		createEAttribute(alphaConstantEClass, ALPHA_CONSTANT__VALUE);

		externalFunctionEClass = createEClass(EXTERNAL_FUNCTION);
		createEAttribute(externalFunctionEClass, EXTERNAL_FUNCTION__NAME);
		createEAttribute(externalFunctionEClass, EXTERNAL_FUNCTION__CARDINARITY);

		alphaSystemEClass = createEClass(ALPHA_SYSTEM);
		createEAttribute(alphaSystemEClass, ALPHA_SYSTEM__NAME);
		createEReference(alphaSystemEClass, ALPHA_SYSTEM__PARAMETER_DOMAIN);
		createEReference(alphaSystemEClass, ALPHA_SYSTEM__DEFINED_OBJECTS);
		createEReference(alphaSystemEClass, ALPHA_SYSTEM__INPUTS);
		createEReference(alphaSystemEClass, ALPHA_SYSTEM__OUTPUTS);
		createEReference(alphaSystemEClass, ALPHA_SYSTEM__LOCALS);
		createEReference(alphaSystemEClass, ALPHA_SYSTEM__FUZZY_VARIABLES);
		createEReference(alphaSystemEClass, ALPHA_SYSTEM__WHILE_DOMAIN);
		createEReference(alphaSystemEClass, ALPHA_SYSTEM__TEST_EXPRESSION);
		createEReference(alphaSystemEClass, ALPHA_SYSTEM__USE_EQUATIONS);
		createEReference(alphaSystemEClass, ALPHA_SYSTEM__EQUATIONS);

		variableEClass = createEClass(VARIABLE);
		createEAttribute(variableEClass, VARIABLE__NAME);
		createEReference(variableEClass, VARIABLE__DOMAIN_EXPR);

		inputVariableEClass = createEClass(INPUT_VARIABLE);

		outputVariableEClass = createEClass(OUTPUT_VARIABLE);

		localVariableEClass = createEClass(LOCAL_VARIABLE);

		fuzzyVariableEClass = createEClass(FUZZY_VARIABLE);

		standardEquationEClass = createEClass(STANDARD_EQUATION);
		createEReference(standardEquationEClass, STANDARD_EQUATION__VARIABLE);
		createEAttribute(standardEquationEClass, STANDARD_EQUATION__INDEX_NAMES);
		createEReference(standardEquationEClass, STANDARD_EQUATION__EXPR);

		useEquationEClass = createEClass(USE_EQUATION);
		createEReference(useEquationEClass, USE_EQUATION__SYSTEM);
		createEReference(useEquationEClass, USE_EQUATION__INSTANTIATION_DOMAIN);
		createEReference(useEquationEClass, USE_EQUATION__CALL_PARAMS);
		createEAttribute(useEquationEClass, USE_EQUATION__SUBSYSTEM_DIMS);
		createEReference(useEquationEClass, USE_EQUATION__INPUT_EXPRS);
		createEReference(useEquationEClass, USE_EQUATION__OUTPUT_EXPRS);

		alphaExpressionEClass = createEClass(ALPHA_EXPRESSION);

		restrictExpressionEClass = createEClass(RESTRICT_EXPRESSION);
		createEReference(restrictExpressionEClass, RESTRICT_EXPRESSION__DOMAIN_EXPR);
		createEReference(restrictExpressionEClass, RESTRICT_EXPRESSION__EXPR);

		autoRestrictExpressionEClass = createEClass(AUTO_RESTRICT_EXPRESSION);
		createEReference(autoRestrictExpressionEClass, AUTO_RESTRICT_EXPRESSION__INFERRED_DOMAIN);
		createEReference(autoRestrictExpressionEClass, AUTO_RESTRICT_EXPRESSION__EXPR);

		caseExpressionEClass = createEClass(CASE_EXPRESSION);
		createEAttribute(caseExpressionEClass, CASE_EXPRESSION__NAME);
		createEReference(caseExpressionEClass, CASE_EXPRESSION__EXPRS);

		dependenceExpressionEClass = createEClass(DEPENDENCE_EXPRESSION);
		createEReference(dependenceExpressionEClass, DEPENDENCE_EXPRESSION__FUNCTION);
		createEReference(dependenceExpressionEClass, DEPENDENCE_EXPRESSION__EXPR);

		ifExpressionEClass = createEClass(IF_EXPRESSION);
		createEReference(ifExpressionEClass, IF_EXPRESSION__COND_EXPR);
		createEReference(ifExpressionEClass, IF_EXPRESSION__THEN_EXPR);
		createEReference(ifExpressionEClass, IF_EXPRESSION__ELSE_EXPR);

		indexExpressionEClass = createEClass(INDEX_EXPRESSION);
		createEReference(indexExpressionEClass, INDEX_EXPRESSION__FUNCTION);

		reduceExpressionEClass = createEClass(REDUCE_EXPRESSION);
		createEAttribute(reduceExpressionEClass, REDUCE_EXPRESSION__OPERATOR);
		createEReference(reduceExpressionEClass, REDUCE_EXPRESSION__PROJECTION);
		createEReference(reduceExpressionEClass, REDUCE_EXPRESSION__BODY);

		externalReduceExpressionEClass = createEClass(EXTERNAL_REDUCE_EXPRESSION);
		createEReference(externalReduceExpressionEClass, EXTERNAL_REDUCE_EXPRESSION__EXTERNAL_FUNCTION);

		argReduceExpressionEClass = createEClass(ARG_REDUCE_EXPRESSION);
		createEAttribute(argReduceExpressionEClass, ARG_REDUCE_EXPRESSION__OPERATOR);
		createEReference(argReduceExpressionEClass, ARG_REDUCE_EXPRESSION__PROJECTION);
		createEReference(argReduceExpressionEClass, ARG_REDUCE_EXPRESSION__BODY);

		externalArgReduceExpressionEClass = createEClass(EXTERNAL_ARG_REDUCE_EXPRESSION);
		createEReference(externalArgReduceExpressionEClass, EXTERNAL_ARG_REDUCE_EXPRESSION__EXTERNAL_FUNCTION);

		convolutionExpressionEClass = createEClass(CONVOLUTION_EXPRESSION);
		createEReference(convolutionExpressionEClass, CONVOLUTION_EXPRESSION__KERNEL_DOMAIN);
		createEReference(convolutionExpressionEClass, CONVOLUTION_EXPRESSION__KERNEL_EXPRESSION);
		createEReference(convolutionExpressionEClass, CONVOLUTION_EXPRESSION__DATA_EXPRESSION);

		selectExpressionEClass = createEClass(SELECT_EXPRESSION);
		createEReference(selectExpressionEClass, SELECT_EXPRESSION__SELECT_RELATION);
		createEReference(selectExpressionEClass, SELECT_EXPRESSION__EXPR);

		variableExpressionEClass = createEClass(VARIABLE_EXPRESSION);
		createEReference(variableExpressionEClass, VARIABLE_EXPRESSION__VARIABLE);

		constantExpressionEClass = createEClass(CONSTANT_EXPRESSION);

		integerExpressionEClass = createEClass(INTEGER_EXPRESSION);
		createEAttribute(integerExpressionEClass, INTEGER_EXPRESSION__VALUE);

		realExpressionEClass = createEClass(REAL_EXPRESSION);
		createEAttribute(realExpressionEClass, REAL_EXPRESSION__VALUE);

		booleanExpressionEClass = createEClass(BOOLEAN_EXPRESSION);
		createEAttribute(booleanExpressionEClass, BOOLEAN_EXPRESSION__VALUE);

		unaryExpressionEClass = createEClass(UNARY_EXPRESSION);
		createEAttribute(unaryExpressionEClass, UNARY_EXPRESSION__OPERATOR);
		createEReference(unaryExpressionEClass, UNARY_EXPRESSION__EXPR);

		binaryExpressionEClass = createEClass(BINARY_EXPRESSION);
		createEAttribute(binaryExpressionEClass, BINARY_EXPRESSION__OPERATOR);
		createEReference(binaryExpressionEClass, BINARY_EXPRESSION__LEFT);
		createEReference(binaryExpressionEClass, BINARY_EXPRESSION__RIGHT);

		multiArgExpressionEClass = createEClass(MULTI_ARG_EXPRESSION);
		createEAttribute(multiArgExpressionEClass, MULTI_ARG_EXPRESSION__OPERATOR);
		createEReference(multiArgExpressionEClass, MULTI_ARG_EXPRESSION__EXPRS);

		externalMultiArgExpressionEClass = createEClass(EXTERNAL_MULTI_ARG_EXPRESSION);
		createEReference(externalMultiArgExpressionEClass, EXTERNAL_MULTI_ARG_EXPRESSION__EXTERNAL_FUNCTION);

		calculatorNodeEClass = createEClass(CALCULATOR_NODE);

		polyhedralObjectEClass = createEClass(POLYHEDRAL_OBJECT);
		createEAttribute(polyhedralObjectEClass, POLYHEDRAL_OBJECT__NAME);
		createEReference(polyhedralObjectEClass, POLYHEDRAL_OBJECT__EXPR);

		calculatorExpressionEClass = createEClass(CALCULATOR_EXPRESSION);
		createEAttribute(calculatorExpressionEClass, CALCULATOR_EXPRESSION__ERROR_MESSAGE);

		jniDomainEClass = createEClass(JNI_DOMAIN);
		createEAttribute(jniDomainEClass, JNI_DOMAIN__ISL_STRING);
		createEAttribute(jniDomainEClass, JNI_DOMAIN__ISL_SET);

		jniRelationEClass = createEClass(JNI_RELATION);
		createEAttribute(jniRelationEClass, JNI_RELATION__ISL_STRING);
		createEAttribute(jniRelationEClass, JNI_RELATION__ISL_MAP);

		jniFunctionEClass = createEClass(JNI_FUNCTION);
		createEAttribute(jniFunctionEClass, JNI_FUNCTION__ALPHA_STRING);
		createEAttribute(jniFunctionEClass, JNI_FUNCTION__ISL_MAFF);

		jniFunctionInArrayNotationEClass = createEClass(JNI_FUNCTION_IN_ARRAY_NOTATION);
		createEAttribute(jniFunctionInArrayNotationEClass, JNI_FUNCTION_IN_ARRAY_NOTATION__ARRAY_NOTATION);

		unaryCalculatorExpressionEClass = createEClass(UNARY_CALCULATOR_EXPRESSION);
		createEAttribute(unaryCalculatorExpressionEClass, UNARY_CALCULATOR_EXPRESSION__OPERATOR);
		createEReference(unaryCalculatorExpressionEClass, UNARY_CALCULATOR_EXPRESSION__EXPR);
		createEAttribute(unaryCalculatorExpressionEClass, UNARY_CALCULATOR_EXPRESSION__INTERNAL_CACHE_ISL_OBJECT);

		binaryCalculatorExpressionEClass = createEClass(BINARY_CALCULATOR_EXPRESSION);
		createEAttribute(binaryCalculatorExpressionEClass, BINARY_CALCULATOR_EXPRESSION__OPERATOR);
		createEReference(binaryCalculatorExpressionEClass, BINARY_CALCULATOR_EXPRESSION__LEFT);
		createEReference(binaryCalculatorExpressionEClass, BINARY_CALCULATOR_EXPRESSION__RIGHT);
		createEAttribute(binaryCalculatorExpressionEClass, BINARY_CALCULATOR_EXPRESSION__INTERNAL_CACHE_ISL_OBJECT);

		variableDomainEClass = createEClass(VARIABLE_DOMAIN);
		createEReference(variableDomainEClass, VARIABLE_DOMAIN__VARIABLE);

		rectangularDomainEClass = createEClass(RECTANGULAR_DOMAIN);
		createEAttribute(rectangularDomainEClass, RECTANGULAR_DOMAIN__UPPER_BOUNDS);
		createEAttribute(rectangularDomainEClass, RECTANGULAR_DOMAIN__INDEX_NAMES);
		createEAttribute(rectangularDomainEClass, RECTANGULAR_DOMAIN__ISL_SET);

		definedObjectEClass = createEClass(DEFINED_OBJECT);
		createEReference(definedObjectEClass, DEFINED_OBJECT__OBJECT);
		createEAttribute(definedObjectEClass, DEFINED_OBJECT__INTERNAL_CYCLE_DETECTOR);

		// Create enums
		unarY_OPEEnum = createEEnum(UNARY_OP);
		binarY_OPEEnum = createEEnum(BINARY_OP);
		reductioN_OPEEnum = createEEnum(REDUCTION_OP);
		polY_OBJECT_TYPEEEnum = createEEnum(POLY_OBJECT_TYPE);
		calculatoR_UNARY_OPEEnum = createEEnum(CALCULATOR_UNARY_OP);
		calculatoR_BINARY_OPEEnum = createEEnum(CALCULATOR_BINARY_OP);

		// Create data types
		jniObjectEDataType = createEDataType(JNI_OBJECT);
		jniislSetEDataType = createEDataType(JNIISL_SET);
		jniislMapEDataType = createEDataType(JNIISL_MAP);
		jniislMultiAffEDataType = createEDataType(JNIISL_MULTI_AFF);
		isL_FORMATEDataType = createEDataType(ISL_FORMAT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		alphaVisitableEClass.getESuperTypes().add(this.getAlphaNode());
		alphaExpressionVisitableEClass.getESuperTypes().add(this.getAlphaNode());
		calculatorExpressionVisitableEClass.getESuperTypes().add(this.getAlphaNode());
		alphaCompleteVisitorEClass.getESuperTypes().add(this.getAlphaVisitor());
		alphaCompleteVisitorEClass.getESuperTypes().add(this.getAlphaExpressionVisitor());
		alphaRootEClass.getESuperTypes().add(this.getAlphaVisitable());
		alphaElementEClass.getESuperTypes().add(this.getAlphaVisitable());
		importsEClass.getESuperTypes().add(this.getAlphaElement());
		alphaPackageEClass.getESuperTypes().add(this.getAlphaElement());
		alphaConstantEClass.getESuperTypes().add(this.getAlphaElement());
		externalFunctionEClass.getESuperTypes().add(this.getAlphaElement());
		alphaSystemEClass.getESuperTypes().add(this.getAlphaElement());
		variableEClass.getESuperTypes().add(this.getAlphaVisitable());
		inputVariableEClass.getESuperTypes().add(this.getVariable());
		outputVariableEClass.getESuperTypes().add(this.getVariable());
		localVariableEClass.getESuperTypes().add(this.getVariable());
		fuzzyVariableEClass.getESuperTypes().add(this.getVariable());
		standardEquationEClass.getESuperTypes().add(this.getAlphaVisitable());
		useEquationEClass.getESuperTypes().add(this.getAlphaVisitable());
		alphaExpressionEClass.getESuperTypes().add(this.getAlphaExpressionVisitable());
		restrictExpressionEClass.getESuperTypes().add(this.getAlphaExpression());
		autoRestrictExpressionEClass.getESuperTypes().add(this.getAlphaExpression());
		caseExpressionEClass.getESuperTypes().add(this.getAlphaExpression());
		dependenceExpressionEClass.getESuperTypes().add(this.getAlphaExpression());
		ifExpressionEClass.getESuperTypes().add(this.getAlphaExpression());
		indexExpressionEClass.getESuperTypes().add(this.getAlphaExpression());
		reduceExpressionEClass.getESuperTypes().add(this.getAlphaExpression());
		externalReduceExpressionEClass.getESuperTypes().add(this.getReduceExpression());
		argReduceExpressionEClass.getESuperTypes().add(this.getAlphaExpression());
		externalArgReduceExpressionEClass.getESuperTypes().add(this.getArgReduceExpression());
		convolutionExpressionEClass.getESuperTypes().add(this.getAlphaExpression());
		selectExpressionEClass.getESuperTypes().add(this.getAlphaExpression());
		variableExpressionEClass.getESuperTypes().add(this.getAlphaExpression());
		constantExpressionEClass.getESuperTypes().add(this.getAlphaExpression());
		integerExpressionEClass.getESuperTypes().add(this.getConstantExpression());
		realExpressionEClass.getESuperTypes().add(this.getConstantExpression());
		booleanExpressionEClass.getESuperTypes().add(this.getConstantExpression());
		unaryExpressionEClass.getESuperTypes().add(this.getAlphaExpression());
		binaryExpressionEClass.getESuperTypes().add(this.getAlphaExpression());
		multiArgExpressionEClass.getESuperTypes().add(this.getAlphaExpression());
		externalMultiArgExpressionEClass.getESuperTypes().add(this.getMultiArgExpression());
		polyhedralObjectEClass.getESuperTypes().add(this.getCalculatorNode());
		polyhedralObjectEClass.getESuperTypes().add(this.getAlphaVisitable());
		calculatorExpressionEClass.getESuperTypes().add(this.getCalculatorNode());
		calculatorExpressionEClass.getESuperTypes().add(this.getCalculatorExpressionVisitable());
		jniDomainEClass.getESuperTypes().add(this.getCalculatorExpression());
		jniRelationEClass.getESuperTypes().add(this.getCalculatorExpression());
		jniFunctionEClass.getESuperTypes().add(this.getCalculatorExpression());
		jniFunctionInArrayNotationEClass.getESuperTypes().add(this.getJNIFunction());
		unaryCalculatorExpressionEClass.getESuperTypes().add(this.getCalculatorExpression());
		binaryCalculatorExpressionEClass.getESuperTypes().add(this.getCalculatorExpression());
		variableDomainEClass.getESuperTypes().add(this.getCalculatorExpression());
		rectangularDomainEClass.getESuperTypes().add(this.getCalculatorExpression());
		definedObjectEClass.getESuperTypes().add(this.getCalculatorExpression());

		// Initialize classes and features; add operations and parameters
		initEClass(alphaNodeEClass, AlphaNode.class, "AlphaNode", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(alphaVisitableEClass, AlphaVisitable.class, "AlphaVisitable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(alphaVisitableEClass, null, "accept", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAlphaVisitor(), "visitor", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(alphaExpressionVisitableEClass, AlphaExpressionVisitable.class, "AlphaExpressionVisitable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(alphaExpressionVisitableEClass, null, "accept", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAlphaExpressionVisitor(), "visitor", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(calculatorExpressionVisitableEClass, CalculatorExpressionVisitable.class, "CalculatorExpressionVisitable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(calculatorExpressionVisitableEClass, null, "accept", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCalculatorExpressionVisitor(), "visitor", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(domainQualifiedElementEClass, DomainQualifiedElement.class, "DomainQualifiedElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(alphaVisitorEClass, AlphaVisitor.class, "AlphaVisitor", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(alphaVisitorEClass, null, "visitAlphaRoot", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAlphaRoot(), "root", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(alphaVisitorEClass, null, "visitAlphaElement", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAlphaElement(), "ap", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(alphaVisitorEClass, null, "visitAlphaPackage", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAlphaPackage(), "ap", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(alphaVisitorEClass, null, "visitAlphaSystem", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAlphaSystem(), "system", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(alphaVisitorEClass, null, "visitImports", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getImports(), "imports", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(alphaVisitorEClass, null, "visitAlphaConstant", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAlphaConstant(), "ac", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(alphaVisitorEClass, null, "visitExternalFunction", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getExternalFunction(), "ef", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(alphaVisitorEClass, null, "visitVariable", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getVariable(), "variable", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(alphaVisitorEClass, null, "visitInputVariable", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getInputVariable(), "variable", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(alphaVisitorEClass, null, "visitOutputVariable", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getOutputVariable(), "variable", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(alphaVisitorEClass, null, "visitLocalVariable", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getLocalVariable(), "variable", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(alphaVisitorEClass, null, "visitFuzzyVariable", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getFuzzyVariable(), "variable", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(alphaVisitorEClass, null, "visitPolyhedralObject", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPolyhedralObject(), "pobj", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(alphaVisitorEClass, null, "visitUseEquation", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getUseEquation(), "se", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(alphaVisitorEClass, null, "visitStandardEquation", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getStandardEquation(), "se", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(alphaExpressionVisitorEClass, AlphaExpressionVisitor.class, "AlphaExpressionVisitor", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(alphaExpressionVisitorEClass, null, "visitRestrictExpression", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRestrictExpression(), "re", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(alphaExpressionVisitorEClass, null, "visitAutoRestrictExpression", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAutoRestrictExpression(), "are", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(alphaExpressionVisitorEClass, null, "visitCaseExpression", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCaseExpression(), "ce", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(alphaExpressionVisitorEClass, null, "visitIfExpression", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIfExpression(), "ie", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(alphaExpressionVisitorEClass, null, "visitDependenceExpression", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDependenceExpression(), "de", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(alphaExpressionVisitorEClass, null, "visitReduceExpression", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getReduceExpression(), "re", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(alphaExpressionVisitorEClass, null, "visitArgReduceExpression", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getArgReduceExpression(), "are", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(alphaExpressionVisitorEClass, null, "visitConvolutionExpression", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getConvolutionExpression(), "ce", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(alphaExpressionVisitorEClass, null, "visitUnaryExpression", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getUnaryExpression(), "ue", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(alphaExpressionVisitorEClass, null, "visitBinaryExpression", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getBinaryExpression(), "be", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(alphaExpressionVisitorEClass, null, "visitMultiArgExpression", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMultiArgExpression(), "mae", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(alphaExpressionVisitorEClass, null, "visitSelectExpression", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSelectExpression(), "se", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(alphaExpressionVisitorEClass, null, "visitIndexExpression", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIndexExpression(), "ie", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(alphaExpressionVisitorEClass, null, "visitVariableExpression", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getVariableExpression(), "ve", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(alphaExpressionVisitorEClass, null, "visitConstantExpression", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getConstantExpression(), "ce", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(alphaExpressionVisitorEClass, null, "visitIntegerExpression", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIntegerExpression(), "ie", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(alphaExpressionVisitorEClass, null, "visitRealExpression", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRealExpression(), "re", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(alphaExpressionVisitorEClass, null, "visitBooleanExpression", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getBooleanExpression(), "be", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(alphaExpressionVisitorEClass, null, "visitExternalReduceExpression", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getExternalReduceExpression(), "ere", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(alphaExpressionVisitorEClass, null, "visitExternalArgReduceExpression", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getExternalArgReduceExpression(), "eare", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(alphaExpressionVisitorEClass, null, "visitExternalMultiArgExpression", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getExternalMultiArgExpression(), "emae", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(alphaCompleteVisitorEClass, AlphaCompleteVisitor.class, "AlphaCompleteVisitor", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(calculatorExpressionVisitorEClass, CalculatorExpressionVisitor.class, "CalculatorExpressionVisitor", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(calculatorExpressionVisitorEClass, null, "visitCalculatorExpression", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCalculatorExpression(), "expr", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(calculatorExpressionVisitorEClass, null, "visitUnaryCalculatorExpression", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getUnaryCalculatorExpression(), "expr", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(calculatorExpressionVisitorEClass, null, "visitBinaryCalculatorExpression", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getBinaryCalculatorExpression(), "expr", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(calculatorExpressionVisitorEClass, null, "visitJNIDomain", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getJNIDomain(), "jniDomain", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(calculatorExpressionVisitorEClass, null, "visitJNIRelation", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getJNIRelation(), "jniRelation", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(calculatorExpressionVisitorEClass, null, "visitJNIFunction", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getJNIFunction(), "jniFunction", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(calculatorExpressionVisitorEClass, null, "visitVariableDomain", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getVariableDomain(), "vdom", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(calculatorExpressionVisitorEClass, null, "visitRectangularDomain", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRectangularDomain(), "rdom", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(calculatorExpressionVisitorEClass, null, "visitDefinedObject", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDefinedObject(), "dobj", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(alphaRootEClass, AlphaRoot.class, "AlphaRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAlphaRoot_Elements(), this.getAlphaElement(), null, "elements", null, 0, -1, AlphaRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(alphaRootEClass, this.getImports(), "getImports", 0, -1, !IS_UNIQUE, IS_ORDERED);

		addEOperation(alphaRootEClass, this.getAlphaConstant(), "getConstants", 0, -1, !IS_UNIQUE, IS_ORDERED);

		addEOperation(alphaRootEClass, this.getExternalFunction(), "getExternalFunctions", 0, -1, !IS_UNIQUE, IS_ORDERED);

		addEOperation(alphaRootEClass, this.getAlphaPackage(), "getPackages", 0, -1, !IS_UNIQUE, IS_ORDERED);

		addEOperation(alphaRootEClass, this.getAlphaSystem(), "getSystems", 0, -1, !IS_UNIQUE, IS_ORDERED);

		initEClass(alphaElementEClass, AlphaElement.class, "AlphaElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(alphaElementEClass, null, "accept", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAlphaVisitor(), "visitor", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(importsEClass, Imports.class, "Imports", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImports_ImportedNamespace(), theEcorePackage.getEString(), "importedNamespace", null, 0, 1, Imports.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(importsEClass, null, "accept", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAlphaVisitor(), "visitor", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(alphaPackageEClass, AlphaPackage.class, "AlphaPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAlphaPackage_Name(), theEcorePackage.getEString(), "name", null, 0, 1, AlphaPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAlphaPackage_Elements(), this.getAlphaElement(), null, "elements", null, 0, -1, AlphaPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(alphaPackageEClass, this.getAlphaConstant(), "getConstants", 0, -1, !IS_UNIQUE, IS_ORDERED);

		addEOperation(alphaPackageEClass, this.getExternalFunction(), "getExternalFunctions", 0, -1, !IS_UNIQUE, IS_ORDERED);

		addEOperation(alphaPackageEClass, this.getAlphaPackage(), "getPackages", 0, -1, !IS_UNIQUE, IS_ORDERED);

		addEOperation(alphaPackageEClass, this.getAlphaSystem(), "getSystems", 0, -1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(alphaPackageEClass, null, "accept", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAlphaVisitor(), "visitor", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(alphaConstantEClass, AlphaConstant.class, "AlphaConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAlphaConstant_Name(), theEcorePackage.getEString(), "name", null, 0, 1, AlphaConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAlphaConstant_Value(), theEcorePackage.getEInt(), "value", null, 0, 1, AlphaConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(alphaConstantEClass, null, "accept", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAlphaVisitor(), "visitor", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(externalFunctionEClass, ExternalFunction.class, "ExternalFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExternalFunction_Name(), theEcorePackage.getEString(), "name", null, 0, 1, ExternalFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExternalFunction_Cardinarity(), theEcorePackage.getEInt(), "cardinarity", null, 0, 1, ExternalFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(externalFunctionEClass, null, "accept", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAlphaVisitor(), "visitor", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(alphaSystemEClass, AlphaSystem.class, "AlphaSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAlphaSystem_Name(), theEcorePackage.getEString(), "name", null, 0, 1, AlphaSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAlphaSystem_ParameterDomain(), this.getJNIDomain(), null, "parameterDomain", null, 0, 1, AlphaSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAlphaSystem_DefinedObjects(), this.getPolyhedralObject(), null, "definedObjects", null, 0, -1, AlphaSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAlphaSystem_Inputs(), this.getInputVariable(), null, "inputs", null, 0, -1, AlphaSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAlphaSystem_Outputs(), this.getOutputVariable(), null, "outputs", null, 0, -1, AlphaSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAlphaSystem_Locals(), this.getLocalVariable(), null, "locals", null, 0, -1, AlphaSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAlphaSystem_FuzzyVariables(), this.getFuzzyVariable(), null, "fuzzyVariables", null, 0, -1, AlphaSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAlphaSystem_WhileDomain(), this.getCalculatorExpression(), null, "whileDomain", null, 0, 1, AlphaSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAlphaSystem_TestExpression(), this.getAlphaExpression(), null, "testExpression", null, 0, 1, AlphaSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAlphaSystem_UseEquations(), this.getUseEquation(), null, "useEquations", null, 0, -1, AlphaSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAlphaSystem_Equations(), this.getStandardEquation(), null, "equations", null, 0, -1, AlphaSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(alphaSystemEClass, this.getVariable(), "getVariables", 0, -1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(alphaSystemEClass, null, "accept", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAlphaVisitor(), "visitor", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariable_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariable_DomainExpr(), this.getCalculatorExpression(), null, "domainExpr", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(variableEClass, this.getJNIISLSet(), "getDomain", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(variableEClass, null, "accept", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAlphaVisitor(), "visitor", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(inputVariableEClass, InputVariable.class, "InputVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(inputVariableEClass, null, "accept", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAlphaVisitor(), "visitor", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(outputVariableEClass, OutputVariable.class, "OutputVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(outputVariableEClass, null, "accept", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAlphaVisitor(), "visitor", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(localVariableEClass, LocalVariable.class, "LocalVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(localVariableEClass, null, "accept", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAlphaVisitor(), "visitor", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(fuzzyVariableEClass, FuzzyVariable.class, "FuzzyVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(fuzzyVariableEClass, this.getJNIISLSet(), "getDomain", 0, 1, !IS_UNIQUE, IS_ORDERED);

		addEOperation(fuzzyVariableEClass, this.getJNIISLMap(), "getRelation", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(fuzzyVariableEClass, null, "accept", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAlphaVisitor(), "visitor", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(standardEquationEClass, StandardEquation.class, "StandardEquation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStandardEquation_Variable(), this.getVariable(), null, "variable", null, 0, 1, StandardEquation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStandardEquation_IndexNames(), theEcorePackage.getEString(), "indexNames", null, 0, -1, StandardEquation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStandardEquation_Expr(), this.getAlphaExpression(), null, "expr", null, 0, 1, StandardEquation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(standardEquationEClass, null, "accept", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAlphaVisitor(), "visitor", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(useEquationEClass, UseEquation.class, "UseEquation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUseEquation_System(), this.getAlphaSystem(), null, "system", null, 0, 1, UseEquation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUseEquation_InstantiationDomain(), this.getCalculatorExpression(), null, "instantiationDomain", null, 0, 1, UseEquation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUseEquation_CallParams(), this.getJNIFunctionInArrayNotation(), null, "callParams", null, 0, 1, UseEquation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUseEquation_SubsystemDims(), theEcorePackage.getEString(), "subsystemDims", null, 0, -1, UseEquation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUseEquation_InputExprs(), this.getAlphaExpression(), null, "inputExprs", null, 0, -1, UseEquation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUseEquation_OutputExprs(), this.getAlphaExpression(), null, "outputExprs", null, 0, -1, UseEquation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(alphaExpressionEClass, AlphaExpression.class, "AlphaExpression", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(restrictExpressionEClass, RestrictExpression.class, "RestrictExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRestrictExpression_DomainExpr(), this.getCalculatorExpression(), null, "domainExpr", null, 0, 1, RestrictExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRestrictExpression_Expr(), this.getAlphaExpression(), null, "expr", null, 0, 1, RestrictExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(restrictExpressionEClass, null, "accept", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAlphaExpressionVisitor(), "visitor", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(autoRestrictExpressionEClass, AutoRestrictExpression.class, "AutoRestrictExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAutoRestrictExpression_InferredDomain(), this.getJNIDomain(), null, "inferredDomain", null, 0, 1, AutoRestrictExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAutoRestrictExpression_Expr(), this.getAlphaExpression(), null, "expr", null, 0, 1, AutoRestrictExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(autoRestrictExpressionEClass, null, "accept", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAlphaExpressionVisitor(), "visitor", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(caseExpressionEClass, CaseExpression.class, "CaseExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCaseExpression_Name(), theEcorePackage.getEString(), "name", null, 0, 1, CaseExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCaseExpression_Exprs(), this.getAlphaExpression(), null, "exprs", null, 0, -1, CaseExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(caseExpressionEClass, null, "accept", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAlphaExpressionVisitor(), "visitor", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(dependenceExpressionEClass, DependenceExpression.class, "DependenceExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDependenceExpression_Function(), this.getJNIFunction(), null, "function", null, 0, 1, DependenceExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDependenceExpression_Expr(), this.getAlphaExpression(), null, "expr", null, 0, 1, DependenceExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(dependenceExpressionEClass, null, "accept", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAlphaExpressionVisitor(), "visitor", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(ifExpressionEClass, IfExpression.class, "IfExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIfExpression_CondExpr(), this.getAlphaExpression(), null, "condExpr", null, 0, 1, IfExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIfExpression_ThenExpr(), this.getAlphaExpression(), null, "thenExpr", null, 0, 1, IfExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIfExpression_ElseExpr(), this.getAlphaExpression(), null, "elseExpr", null, 0, 1, IfExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(ifExpressionEClass, null, "accept", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAlphaExpressionVisitor(), "visitor", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(indexExpressionEClass, IndexExpression.class, "IndexExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIndexExpression_Function(), this.getJNIFunction(), null, "function", null, 0, 1, IndexExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(indexExpressionEClass, null, "accept", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAlphaExpressionVisitor(), "visitor", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(reduceExpressionEClass, ReduceExpression.class, "ReduceExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReduceExpression_Operator(), this.getREDUCTION_OP(), "operator", null, 0, 1, ReduceExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReduceExpression_Projection(), this.getJNIFunction(), null, "projection", null, 0, 1, ReduceExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReduceExpression_Body(), this.getAlphaExpression(), null, "body", null, 0, 1, ReduceExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(reduceExpressionEClass, null, "accept", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAlphaExpressionVisitor(), "visitor", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(externalReduceExpressionEClass, ExternalReduceExpression.class, "ExternalReduceExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExternalReduceExpression_ExternalFunction(), this.getExternalFunction(), null, "externalFunction", null, 0, 1, ExternalReduceExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(externalReduceExpressionEClass, null, "accept", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAlphaExpressionVisitor(), "visitor", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(argReduceExpressionEClass, ArgReduceExpression.class, "ArgReduceExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArgReduceExpression_Operator(), this.getREDUCTION_OP(), "operator", null, 0, 1, ArgReduceExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArgReduceExpression_Projection(), this.getJNIFunction(), null, "projection", null, 0, 1, ArgReduceExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArgReduceExpression_Body(), this.getAlphaExpression(), null, "body", null, 0, 1, ArgReduceExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(argReduceExpressionEClass, null, "accept", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAlphaExpressionVisitor(), "visitor", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(externalArgReduceExpressionEClass, ExternalArgReduceExpression.class, "ExternalArgReduceExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExternalArgReduceExpression_ExternalFunction(), this.getExternalFunction(), null, "externalFunction", null, 0, 1, ExternalArgReduceExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(externalArgReduceExpressionEClass, null, "accept", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAlphaExpressionVisitor(), "visitor", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(convolutionExpressionEClass, ConvolutionExpression.class, "ConvolutionExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConvolutionExpression_KernelDomain(), this.getCalculatorExpression(), null, "kernelDomain", null, 0, 1, ConvolutionExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConvolutionExpression_KernelExpression(), this.getAlphaExpression(), null, "kernelExpression", null, 0, 1, ConvolutionExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConvolutionExpression_DataExpression(), this.getAlphaExpression(), null, "dataExpression", null, 0, 1, ConvolutionExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(convolutionExpressionEClass, null, "accept", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAlphaExpressionVisitor(), "visitor", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(selectExpressionEClass, SelectExpression.class, "SelectExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSelectExpression_SelectRelation(), this.getCalculatorExpression(), null, "selectRelation", null, 0, 1, SelectExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSelectExpression_Expr(), this.getAlphaExpression(), null, "expr", null, 0, 1, SelectExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(selectExpressionEClass, null, "accept", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAlphaExpressionVisitor(), "visitor", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(variableExpressionEClass, VariableExpression.class, "VariableExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariableExpression_Variable(), this.getVariable(), null, "variable", null, 0, 1, VariableExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(variableExpressionEClass, null, "accept", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAlphaExpressionVisitor(), "visitor", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(constantExpressionEClass, ConstantExpression.class, "ConstantExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(constantExpressionEClass, null, "accept", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAlphaExpressionVisitor(), "visitor", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(integerExpressionEClass, IntegerExpression.class, "IntegerExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegerExpression_Value(), theEcorePackage.getEInt(), "value", null, 0, 1, IntegerExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(integerExpressionEClass, null, "accept", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAlphaExpressionVisitor(), "visitor", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(realExpressionEClass, RealExpression.class, "RealExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRealExpression_Value(), theEcorePackage.getEFloat(), "value", null, 0, 1, RealExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(realExpressionEClass, null, "accept", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAlphaExpressionVisitor(), "visitor", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(booleanExpressionEClass, BooleanExpression.class, "BooleanExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanExpression_Value(), theEcorePackage.getEBoolean(), "value", null, 0, 1, BooleanExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(booleanExpressionEClass, null, "accept", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAlphaExpressionVisitor(), "visitor", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(unaryExpressionEClass, UnaryExpression.class, "UnaryExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnaryExpression_Operator(), this.getUNARY_OP(), "operator", null, 0, 1, UnaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnaryExpression_Expr(), this.getAlphaExpression(), null, "expr", null, 0, 1, UnaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(unaryExpressionEClass, null, "accept", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAlphaExpressionVisitor(), "visitor", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(binaryExpressionEClass, BinaryExpression.class, "BinaryExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBinaryExpression_Operator(), this.getBINARY_OP(), "operator", null, 0, 1, BinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinaryExpression_Left(), this.getAlphaExpression(), null, "left", null, 0, 1, BinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinaryExpression_Right(), this.getAlphaExpression(), null, "right", null, 0, 1, BinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(binaryExpressionEClass, null, "accept", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAlphaExpressionVisitor(), "visitor", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(multiArgExpressionEClass, MultiArgExpression.class, "MultiArgExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMultiArgExpression_Operator(), this.getREDUCTION_OP(), "operator", null, 0, 1, MultiArgExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMultiArgExpression_Exprs(), this.getAlphaExpression(), null, "exprs", null, 0, -1, MultiArgExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(multiArgExpressionEClass, null, "accept", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAlphaExpressionVisitor(), "visitor", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(externalMultiArgExpressionEClass, ExternalMultiArgExpression.class, "ExternalMultiArgExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExternalMultiArgExpression_ExternalFunction(), this.getExternalFunction(), null, "externalFunction", null, 0, 1, ExternalMultiArgExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(externalMultiArgExpressionEClass, null, "accept", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAlphaExpressionVisitor(), "visitor", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(calculatorNodeEClass, CalculatorNode.class, "CalculatorNode", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(calculatorNodeEClass, this.getPOLY_OBJECT_TYPE(), "getType", 0, 1, !IS_UNIQUE, IS_ORDERED);

		addEOperation(calculatorNodeEClass, this.getJNIObject(), "getISLObject", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(polyhedralObjectEClass, PolyhedralObject.class, "PolyhedralObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPolyhedralObject_Name(), theEcorePackage.getEString(), "name", null, 0, 1, PolyhedralObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPolyhedralObject_Expr(), this.getCalculatorExpression(), null, "expr", null, 0, 1, PolyhedralObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(polyhedralObjectEClass, this.getPOLY_OBJECT_TYPE(), "getType", 0, 1, !IS_UNIQUE, IS_ORDERED);

		addEOperation(polyhedralObjectEClass, this.getJNIObject(), "getISLObject", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(polyhedralObjectEClass, null, "accept", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAlphaVisitor(), "visitor", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(calculatorExpressionEClass, CalculatorExpression.class, "CalculatorExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCalculatorExpression_ErrorMessage(), theEcorePackage.getEString(), "errorMessage", null, 0, 1, CalculatorExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(calculatorExpressionEClass, null, "accept", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCalculatorExpressionVisitor(), "visitor", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(jniDomainEClass, JNIDomain.class, "JNIDomain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJNIDomain_IslString(), theEcorePackage.getEString(), "islString", null, 0, 1, JNIDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJNIDomain_IslSet(), this.getJNIISLSet(), "islSet", null, 0, 1, JNIDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(jniDomainEClass, this.getPOLY_OBJECT_TYPE(), "getType", 0, 1, !IS_UNIQUE, IS_ORDERED);

		addEOperation(jniDomainEClass, this.getJNIObject(), "getISLObject", 0, 1, !IS_UNIQUE, IS_ORDERED);

		addEOperation(jniDomainEClass, theEcorePackage.getEString(), "toString", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(jniDomainEClass, null, "accept", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCalculatorExpressionVisitor(), "visitor", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(jniRelationEClass, JNIRelation.class, "JNIRelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJNIRelation_IslString(), theEcorePackage.getEString(), "islString", null, 0, 1, JNIRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJNIRelation_IslMap(), this.getJNIISLMap(), "islMap", null, 0, 1, JNIRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(jniRelationEClass, this.getPOLY_OBJECT_TYPE(), "getType", 0, 1, !IS_UNIQUE, IS_ORDERED);

		addEOperation(jniRelationEClass, this.getJNIObject(), "getISLObject", 0, 1, !IS_UNIQUE, IS_ORDERED);

		addEOperation(jniRelationEClass, theEcorePackage.getEString(), "toString", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(jniRelationEClass, null, "accept", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCalculatorExpressionVisitor(), "visitor", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(jniFunctionEClass, JNIFunction.class, "JNIFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJNIFunction_AlphaString(), theEcorePackage.getEString(), "alphaString", null, 0, 1, JNIFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJNIFunction_IslMAff(), this.getJNIISLMultiAff(), "islMAff", null, 0, 1, JNIFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(jniFunctionEClass, this.getPOLY_OBJECT_TYPE(), "getType", 0, 1, !IS_UNIQUE, IS_ORDERED);

		addEOperation(jniFunctionEClass, this.getJNIObject(), "getISLObject", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(jniFunctionEClass, null, "accept", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCalculatorExpressionVisitor(), "visitor", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(jniFunctionInArrayNotationEClass, JNIFunctionInArrayNotation.class, "JNIFunctionInArrayNotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJNIFunctionInArrayNotation_ArrayNotation(), theEcorePackage.getEString(), "arrayNotation", null, 0, 1, JNIFunctionInArrayNotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unaryCalculatorExpressionEClass, UnaryCalculatorExpression.class, "UnaryCalculatorExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnaryCalculatorExpression_Operator(), this.getCALCULATOR_UNARY_OP(), "operator", null, 0, 1, UnaryCalculatorExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnaryCalculatorExpression_Expr(), this.getCalculatorExpression(), null, "expr", null, 0, 1, UnaryCalculatorExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnaryCalculatorExpression___internal_cache_islObject(), this.getJNIObject(), "__internal_cache_islObject", null, 0, 1, UnaryCalculatorExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(unaryCalculatorExpressionEClass, this.getPOLY_OBJECT_TYPE(), "getType", 0, 1, !IS_UNIQUE, IS_ORDERED);

		addEOperation(unaryCalculatorExpressionEClass, this.getJNIObject(), "getISLObject", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(unaryCalculatorExpressionEClass, null, "accept", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCalculatorExpressionVisitor(), "visitor", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(binaryCalculatorExpressionEClass, BinaryCalculatorExpression.class, "BinaryCalculatorExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBinaryCalculatorExpression_Operator(), this.getCALCULATOR_BINARY_OP(), "operator", null, 0, 1, BinaryCalculatorExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinaryCalculatorExpression_Left(), this.getCalculatorExpression(), null, "left", null, 0, 1, BinaryCalculatorExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinaryCalculatorExpression_Right(), this.getCalculatorExpression(), null, "right", null, 0, 1, BinaryCalculatorExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBinaryCalculatorExpression___internal_cache_islObject(), this.getJNIObject(), "__internal_cache_islObject", null, 0, 1, BinaryCalculatorExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(binaryCalculatorExpressionEClass, this.getPOLY_OBJECT_TYPE(), "getType", 0, 1, !IS_UNIQUE, IS_ORDERED);

		addEOperation(binaryCalculatorExpressionEClass, this.getJNIObject(), "getISLObject", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(binaryCalculatorExpressionEClass, null, "accept", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCalculatorExpressionVisitor(), "visitor", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(variableDomainEClass, VariableDomain.class, "VariableDomain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariableDomain_Variable(), this.getVariable(), null, "variable", null, 0, 1, VariableDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(variableDomainEClass, this.getPOLY_OBJECT_TYPE(), "getType", 0, 1, !IS_UNIQUE, IS_ORDERED);

		addEOperation(variableDomainEClass, this.getJNIObject(), "getISLObject", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(variableDomainEClass, null, "accept", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCalculatorExpressionVisitor(), "visitor", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(rectangularDomainEClass, RectangularDomain.class, "RectangularDomain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRectangularDomain_UpperBounds(), theEcorePackage.getEString(), "upperBounds", null, 0, -1, RectangularDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRectangularDomain_IndexNames(), theEcorePackage.getEString(), "indexNames", null, 0, -1, RectangularDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRectangularDomain_IslSet(), this.getJNIISLSet(), "islSet", null, 0, 1, RectangularDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(rectangularDomainEClass, this.getPOLY_OBJECT_TYPE(), "getType", 0, 1, !IS_UNIQUE, IS_ORDERED);

		addEOperation(rectangularDomainEClass, this.getJNIObject(), "getISLObject", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(rectangularDomainEClass, null, "accept", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCalculatorExpressionVisitor(), "visitor", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(definedObjectEClass, DefinedObject.class, "DefinedObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDefinedObject_Object(), this.getPolyhedralObject(), null, "object", null, 0, 1, DefinedObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDefinedObject___internalCycleDetector(), theEcorePackage.getEBoolean(), "__internalCycleDetector", null, 0, 1, DefinedObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(definedObjectEClass, this.getPOLY_OBJECT_TYPE(), "getType", 0, 1, !IS_UNIQUE, IS_ORDERED);

		addEOperation(definedObjectEClass, this.getJNIObject(), "getISLObject", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(definedObjectEClass, null, "accept", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCalculatorExpressionVisitor(), "visitor", 0, 1, !IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(unarY_OPEEnum, alpha.model.UNARY_OP.class, "UNARY_OP");
		addEEnumLiteral(unarY_OPEEnum, alpha.model.UNARY_OP.NOT);
		addEEnumLiteral(unarY_OPEEnum, alpha.model.UNARY_OP.NEGATE);

		initEEnum(binarY_OPEEnum, alpha.model.BINARY_OP.class, "BINARY_OP");
		addEEnumLiteral(binarY_OPEEnum, alpha.model.BINARY_OP.MIN);
		addEEnumLiteral(binarY_OPEEnum, alpha.model.BINARY_OP.MAX);
		addEEnumLiteral(binarY_OPEEnum, alpha.model.BINARY_OP.MUL);
		addEEnumLiteral(binarY_OPEEnum, alpha.model.BINARY_OP.DIV);
		addEEnumLiteral(binarY_OPEEnum, alpha.model.BINARY_OP.MOD);
		addEEnumLiteral(binarY_OPEEnum, alpha.model.BINARY_OP.ADD);
		addEEnumLiteral(binarY_OPEEnum, alpha.model.BINARY_OP.SUB);
		addEEnumLiteral(binarY_OPEEnum, alpha.model.BINARY_OP.AND);
		addEEnumLiteral(binarY_OPEEnum, alpha.model.BINARY_OP.OR);
		addEEnumLiteral(binarY_OPEEnum, alpha.model.BINARY_OP.XOR);
		addEEnumLiteral(binarY_OPEEnum, alpha.model.BINARY_OP.EQ);
		addEEnumLiteral(binarY_OPEEnum, alpha.model.BINARY_OP.NE);
		addEEnumLiteral(binarY_OPEEnum, alpha.model.BINARY_OP.GE);
		addEEnumLiteral(binarY_OPEEnum, alpha.model.BINARY_OP.GT);
		addEEnumLiteral(binarY_OPEEnum, alpha.model.BINARY_OP.LE);
		addEEnumLiteral(binarY_OPEEnum, alpha.model.BINARY_OP.LT);

		initEEnum(reductioN_OPEEnum, alpha.model.REDUCTION_OP.class, "REDUCTION_OP");
		addEEnumLiteral(reductioN_OPEEnum, alpha.model.REDUCTION_OP.MIN);
		addEEnumLiteral(reductioN_OPEEnum, alpha.model.REDUCTION_OP.MAX);
		addEEnumLiteral(reductioN_OPEEnum, alpha.model.REDUCTION_OP.PROD);
		addEEnumLiteral(reductioN_OPEEnum, alpha.model.REDUCTION_OP.SUM);
		addEEnumLiteral(reductioN_OPEEnum, alpha.model.REDUCTION_OP.AND);
		addEEnumLiteral(reductioN_OPEEnum, alpha.model.REDUCTION_OP.OR);
		addEEnumLiteral(reductioN_OPEEnum, alpha.model.REDUCTION_OP.XOR);
		addEEnumLiteral(reductioN_OPEEnum, alpha.model.REDUCTION_OP.EX);

		initEEnum(polY_OBJECT_TYPEEEnum, alpha.model.POLY_OBJECT_TYPE.class, "POLY_OBJECT_TYPE");
		addEEnumLiteral(polY_OBJECT_TYPEEEnum, alpha.model.POLY_OBJECT_TYPE.SET);
		addEEnumLiteral(polY_OBJECT_TYPEEEnum, alpha.model.POLY_OBJECT_TYPE.MAP);
		addEEnumLiteral(polY_OBJECT_TYPEEEnum, alpha.model.POLY_OBJECT_TYPE.FUNCTION);

		initEEnum(calculatoR_UNARY_OPEEnum, alpha.model.CALCULATOR_UNARY_OP.class, "CALCULATOR_UNARY_OP");
		addEEnumLiteral(calculatoR_UNARY_OPEEnum, alpha.model.CALCULATOR_UNARY_OP.GET_DOMAIN);
		addEEnumLiteral(calculatoR_UNARY_OPEEnum, alpha.model.CALCULATOR_UNARY_OP.GET_RANGE);
		addEEnumLiteral(calculatoR_UNARY_OPEEnum, alpha.model.CALCULATOR_UNARY_OP.COMPLEMENT);
		addEEnumLiteral(calculatoR_UNARY_OPEEnum, alpha.model.CALCULATOR_UNARY_OP.POLYHEDRAL_HULL);
		addEEnumLiteral(calculatoR_UNARY_OPEEnum, alpha.model.CALCULATOR_UNARY_OP.AFFINE_HULL);
		addEEnumLiteral(calculatoR_UNARY_OPEEnum, alpha.model.CALCULATOR_UNARY_OP.REVERSE);

		initEEnum(calculatoR_BINARY_OPEEnum, alpha.model.CALCULATOR_BINARY_OP.class, "CALCULATOR_BINARY_OP");
		addEEnumLiteral(calculatoR_BINARY_OPEEnum, alpha.model.CALCULATOR_BINARY_OP.INTERSECT);
		addEEnumLiteral(calculatoR_BINARY_OPEEnum, alpha.model.CALCULATOR_BINARY_OP.UNION);
		addEEnumLiteral(calculatoR_BINARY_OPEEnum, alpha.model.CALCULATOR_BINARY_OP.CROSS_PRODUCT);
		addEEnumLiteral(calculatoR_BINARY_OPEEnum, alpha.model.CALCULATOR_BINARY_OP.SET_DIFFERENCE);
		addEEnumLiteral(calculatoR_BINARY_OPEEnum, alpha.model.CALCULATOR_BINARY_OP.JOIN);
		addEEnumLiteral(calculatoR_BINARY_OPEEnum, alpha.model.CALCULATOR_BINARY_OP.INTERSECT_RANGE);
		addEEnumLiteral(calculatoR_BINARY_OPEEnum, alpha.model.CALCULATOR_BINARY_OP.SUBTRACT_RANGE);

		// Initialize data types
		initEDataType(jniObjectEDataType, JNIObject.class, "JNIObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(jniislSetEDataType, JNIISLSet.class, "JNIISLSet", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(jniislMapEDataType, JNIISLMap.class, "JNIISLMap", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(jniislMultiAffEDataType, JNIISLMultiAff.class, "JNIISLMultiAff", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(isL_FORMATEDataType, fr.irisa.cairn.jnimap.isl.jni.ISL_FORMAT.class, "ISL_FORMAT", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ModelPackageImpl
