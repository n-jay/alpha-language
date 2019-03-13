/**
 */
package alpha.commands.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Argument Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see alpha.commands.model.ModelPackage#getArgumentType()
 * @model
 * @generated
 */
public enum ArgumentType implements Enumerator {
	/**
	 * The '<em><b>Void</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VOID_VALUE
	 * @generated
	 * @ordered
	 */
	VOID(0, "Void", "void"),

	/**
	 * The '<em><b>Alpha Node</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALPHA_NODE_VALUE
	 * @generated
	 * @ordered
	 */
	ALPHA_NODE(0, "AlphaNode", "AlphaNode"),

	/**
	 * The '<em><b>Alpha Complete Visitable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALPHA_COMPLETE_VISITABLE_VALUE
	 * @generated
	 * @ordered
	 */
	ALPHA_COMPLETE_VISITABLE(0, "AlphaCompleteVisitable", "AlphaCompleteVisitable"),

	/**
	 * The '<em><b>Alpha Visitable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALPHA_VISITABLE_VALUE
	 * @generated
	 * @ordered
	 */
	ALPHA_VISITABLE(0, "AlphaVisitable", "AlphaVisitable"),

	/**
	 * The '<em><b>Alpha Expression Visitable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALPHA_EXPRESSION_VISITABLE_VALUE
	 * @generated
	 * @ordered
	 */
	ALPHA_EXPRESSION_VISITABLE(0, "AlphaExpressionVisitable", "AlphaExpressionVisitable"),

	/**
	 * The '<em><b>Alpha Root</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALPHA_ROOT_VALUE
	 * @generated
	 * @ordered
	 */
	ALPHA_ROOT(0, "AlphaRoot", "AlphaRoot"),

	/**
	 * The '<em><b>Alpha System</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALPHA_SYSTEM_VALUE
	 * @generated
	 * @ordered
	 */
	ALPHA_SYSTEM(0, "AlphaSystem", "AlphaSystem"),

	/**
	 * The '<em><b>System Body</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SYSTEM_BODY_VALUE
	 * @generated
	 * @ordered
	 */
	SYSTEM_BODY(0, "SystemBody", "SystemBody"),

	/**
	 * The '<em><b>Variable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VARIABLE_VALUE
	 * @generated
	 * @ordered
	 */
	VARIABLE(0, "Variable", "Variable"),

	/**
	 * The '<em><b>Equation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQUATION_VALUE
	 * @generated
	 * @ordered
	 */
	EQUATION(0, "Equation", "Equation"),

	/**
	 * The '<em><b>Standard Equation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STANDARD_EQUATION_VALUE
	 * @generated
	 * @ordered
	 */
	STANDARD_EQUATION(0, "StandardEquation", "StandardEquation"),

	/**
	 * The '<em><b>Use Equation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USE_EQUATION_VALUE
	 * @generated
	 * @ordered
	 */
	USE_EQUATION(0, "UseEquation", "UseEquation"),

	/**
	 * The '<em><b>Alpha Expression</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALPHA_EXPRESSION_VALUE
	 * @generated
	 * @ordered
	 */
	ALPHA_EXPRESSION(0, "AlphaExpression", "AlphaExpression"),

	/**
	 * The '<em><b>Abstract Reduce Expression</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ABSTRACT_REDUCE_EXPRESSION_VALUE
	 * @generated
	 * @ordered
	 */
	ABSTRACT_REDUCE_EXPRESSION(0, "AbstractReduceExpression", "AbstractReduceExpression"),

	/**
	 * The '<em><b>Binary Expression</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BINARY_EXPRESSION_VALUE
	 * @generated
	 * @ordered
	 */
	BINARY_EXPRESSION(0, "BinaryExpression", "BinaryExpression"),

	/**
	 * The '<em><b>Dependence Expression</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEPENDENCE_EXPRESSION_VALUE
	 * @generated
	 * @ordered
	 */
	DEPENDENCE_EXPRESSION(0, "DependenceExpression", "DependenceExpression"),

	/**
	 * The '<em><b>Reduce Expression</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REDUCE_EXPRESSION_VALUE
	 * @generated
	 * @ordered
	 */
	REDUCE_EXPRESSION(0, "ReduceExpression", "ReduceExpression"),

	/**
	 * The '<em><b>Affine Function</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AFFINE_FUNCTION_VALUE
	 * @generated
	 * @ordered
	 */
	AFFINE_FUNCTION(0, "AffineFunction", "AffineFunction"),

	/**
	 * The '<em><b>Domain</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOMAIN_VALUE
	 * @generated
	 * @ordered
	 */
	DOMAIN(0, "Domain", "Domain"),

	/**
	 * The '<em><b>Parameter Domain</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARAMETER_DOMAIN_VALUE
	 * @generated
	 * @ordered
	 */
	PARAMETER_DOMAIN(0, "ParameterDomain", "ParameterDomain"),

	/**
	 * The '<em><b>Alpha Bundle</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALPHA_BUNDLE_VALUE
	 * @generated
	 * @ordered
	 */
	ALPHA_BUNDLE(0, "AlphaBundle", "List<AlphaRoot>"),

	/**
	 * The '<em><b>String</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_VALUE
	 * @generated
	 * @ordered
	 */
	STRING(0, "String", "String"),

	/**
	 * The '<em><b>String List</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_LIST_VALUE
	 * @generated
	 * @ordered
	 */
	STRING_LIST(0, "StringList", "List<String>"),

	/**
	 * The '<em><b>String Array</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_ARRAY_VALUE
	 * @generated
	 * @ordered
	 */
	STRING_ARRAY(0, "StringArray", "String[]"),

	/**
	 * The '<em><b>Integer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGER_VALUE
	 * @generated
	 * @ordered
	 */
	INTEGER(0, "Integer", "int"),

	/**
	 * The '<em><b>Integer List</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGER_LIST_VALUE
	 * @generated
	 * @ordered
	 */
	INTEGER_LIST(0, "IntegerList", "List<Integer>"),

	/**
	 * The '<em><b>Integer Array</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGER_ARRAY_VALUE
	 * @generated
	 * @ordered
	 */
	INTEGER_ARRAY(0, "IntegerArray", "int[]");

	/**
	 * The '<em><b>Void</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Void</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VOID
	 * @model name="Void" literal="void"
	 * @generated
	 * @ordered
	 */
	public static final int VOID_VALUE = 0;

	/**
	 * The '<em><b>Alpha Node</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Alpha Node</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALPHA_NODE
	 * @model name="AlphaNode"
	 * @generated
	 * @ordered
	 */
	public static final int ALPHA_NODE_VALUE = 0;

	/**
	 * The '<em><b>Alpha Complete Visitable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Alpha Complete Visitable</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALPHA_COMPLETE_VISITABLE
	 * @model name="AlphaCompleteVisitable"
	 * @generated
	 * @ordered
	 */
	public static final int ALPHA_COMPLETE_VISITABLE_VALUE = 0;

	/**
	 * The '<em><b>Alpha Visitable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Alpha Visitable</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALPHA_VISITABLE
	 * @model name="AlphaVisitable"
	 * @generated
	 * @ordered
	 */
	public static final int ALPHA_VISITABLE_VALUE = 0;

	/**
	 * The '<em><b>Alpha Expression Visitable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Alpha Expression Visitable</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALPHA_EXPRESSION_VISITABLE
	 * @model name="AlphaExpressionVisitable"
	 * @generated
	 * @ordered
	 */
	public static final int ALPHA_EXPRESSION_VISITABLE_VALUE = 0;

	/**
	 * The '<em><b>Alpha Root</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Alpha Root</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALPHA_ROOT
	 * @model name="AlphaRoot"
	 * @generated
	 * @ordered
	 */
	public static final int ALPHA_ROOT_VALUE = 0;

	/**
	 * The '<em><b>Alpha System</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Alpha System</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALPHA_SYSTEM
	 * @model name="AlphaSystem"
	 * @generated
	 * @ordered
	 */
	public static final int ALPHA_SYSTEM_VALUE = 0;

	/**
	 * The '<em><b>System Body</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>System Body</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SYSTEM_BODY
	 * @model name="SystemBody"
	 * @generated
	 * @ordered
	 */
	public static final int SYSTEM_BODY_VALUE = 0;

	/**
	 * The '<em><b>Variable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Variable</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VARIABLE
	 * @model name="Variable"
	 * @generated
	 * @ordered
	 */
	public static final int VARIABLE_VALUE = 0;

	/**
	 * The '<em><b>Equation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Equation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EQUATION
	 * @model name="Equation"
	 * @generated
	 * @ordered
	 */
	public static final int EQUATION_VALUE = 0;

	/**
	 * The '<em><b>Standard Equation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Standard Equation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STANDARD_EQUATION
	 * @model name="StandardEquation"
	 * @generated
	 * @ordered
	 */
	public static final int STANDARD_EQUATION_VALUE = 0;

	/**
	 * The '<em><b>Use Equation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Use Equation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #USE_EQUATION
	 * @model name="UseEquation"
	 * @generated
	 * @ordered
	 */
	public static final int USE_EQUATION_VALUE = 0;

	/**
	 * The '<em><b>Alpha Expression</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Alpha Expression</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALPHA_EXPRESSION
	 * @model name="AlphaExpression"
	 * @generated
	 * @ordered
	 */
	public static final int ALPHA_EXPRESSION_VALUE = 0;

	/**
	 * The '<em><b>Abstract Reduce Expression</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Abstract Reduce Expression</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ABSTRACT_REDUCE_EXPRESSION
	 * @model name="AbstractReduceExpression"
	 * @generated
	 * @ordered
	 */
	public static final int ABSTRACT_REDUCE_EXPRESSION_VALUE = 0;

	/**
	 * The '<em><b>Binary Expression</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Binary Expression</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BINARY_EXPRESSION
	 * @model name="BinaryExpression"
	 * @generated
	 * @ordered
	 */
	public static final int BINARY_EXPRESSION_VALUE = 0;

	/**
	 * The '<em><b>Dependence Expression</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dependence Expression</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEPENDENCE_EXPRESSION
	 * @model name="DependenceExpression"
	 * @generated
	 * @ordered
	 */
	public static final int DEPENDENCE_EXPRESSION_VALUE = 0;

	/**
	 * The '<em><b>Reduce Expression</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Reduce Expression</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REDUCE_EXPRESSION
	 * @model name="ReduceExpression"
	 * @generated
	 * @ordered
	 */
	public static final int REDUCE_EXPRESSION_VALUE = 0;

	/**
	 * The '<em><b>Affine Function</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Affine Function</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AFFINE_FUNCTION
	 * @model name="AffineFunction"
	 * @generated
	 * @ordered
	 */
	public static final int AFFINE_FUNCTION_VALUE = 0;

	/**
	 * The '<em><b>Domain</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Domain</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOMAIN
	 * @model name="Domain"
	 * @generated
	 * @ordered
	 */
	public static final int DOMAIN_VALUE = 0;

	/**
	 * The '<em><b>Parameter Domain</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Parameter Domain</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PARAMETER_DOMAIN
	 * @model name="ParameterDomain"
	 * @generated
	 * @ordered
	 */
	public static final int PARAMETER_DOMAIN_VALUE = 0;

	/**
	 * The '<em><b>Alpha Bundle</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Alpha Bundle</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALPHA_BUNDLE
	 * @model name="AlphaBundle" literal="List&lt;AlphaRoot&gt;"
	 * @generated
	 * @ordered
	 */
	public static final int ALPHA_BUNDLE_VALUE = 0;

	/**
	 * The '<em><b>String</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>String</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STRING
	 * @model name="String"
	 * @generated
	 * @ordered
	 */
	public static final int STRING_VALUE = 0;

	/**
	 * The '<em><b>String List</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>String List</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STRING_LIST
	 * @model name="StringList" literal="List&lt;String&gt;"
	 * @generated
	 * @ordered
	 */
	public static final int STRING_LIST_VALUE = 0;

	/**
	 * The '<em><b>String Array</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>String Array</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STRING_ARRAY
	 * @model name="StringArray" literal="String[]"
	 * @generated
	 * @ordered
	 */
	public static final int STRING_ARRAY_VALUE = 0;

	/**
	 * The '<em><b>Integer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Integer</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTEGER
	 * @model name="Integer" literal="int"
	 * @generated
	 * @ordered
	 */
	public static final int INTEGER_VALUE = 0;

	/**
	 * The '<em><b>Integer List</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Integer List</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTEGER_LIST
	 * @model name="IntegerList" literal="List&lt;Integer&gt;"
	 * @generated
	 * @ordered
	 */
	public static final int INTEGER_LIST_VALUE = 0;

	/**
	 * The '<em><b>Integer Array</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Integer Array</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTEGER_ARRAY
	 * @model name="IntegerArray" literal="int[]"
	 * @generated
	 * @ordered
	 */
	public static final int INTEGER_ARRAY_VALUE = 0;

	/**
	 * An array of all the '<em><b>Argument Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ArgumentType[] VALUES_ARRAY =
		new ArgumentType[] {
			VOID,
			ALPHA_NODE,
			ALPHA_COMPLETE_VISITABLE,
			ALPHA_VISITABLE,
			ALPHA_EXPRESSION_VISITABLE,
			ALPHA_ROOT,
			ALPHA_SYSTEM,
			SYSTEM_BODY,
			VARIABLE,
			EQUATION,
			STANDARD_EQUATION,
			USE_EQUATION,
			ALPHA_EXPRESSION,
			ABSTRACT_REDUCE_EXPRESSION,
			BINARY_EXPRESSION,
			DEPENDENCE_EXPRESSION,
			REDUCE_EXPRESSION,
			AFFINE_FUNCTION,
			DOMAIN,
			PARAMETER_DOMAIN,
			ALPHA_BUNDLE,
			STRING,
			STRING_LIST,
			STRING_ARRAY,
			INTEGER,
			INTEGER_LIST,
			INTEGER_ARRAY,
		};

	/**
	 * A public read-only list of all the '<em><b>Argument Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ArgumentType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Argument Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ArgumentType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ArgumentType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Argument Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ArgumentType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ArgumentType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Argument Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ArgumentType get(int value) {
		switch (value) {
			case VOID_VALUE: return VOID;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ArgumentType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //ArgumentType
