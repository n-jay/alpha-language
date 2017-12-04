/**
 */
package alpha.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>CALCULATOR BINARY OP</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see alpha.model.ModelPackage#getCALCULATOR_BINARY_OP()
 * @model
 * @generated
 */
public enum CALCULATOR_BINARY_OP implements Enumerator {
	/**
	 * The '<em><b>INTERSECT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERSECT_VALUE
	 * @generated
	 * @ordered
	 */
	INTERSECT(0, "INTERSECT", "*"),

	/**
	 * The '<em><b>UNION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNION_VALUE
	 * @generated
	 * @ordered
	 */
	UNION(0, "UNION", "+"),

	/**
	 * The '<em><b>CROSS PRODUCT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CROSS_PRODUCT_VALUE
	 * @generated
	 * @ordered
	 */
	CROSS_PRODUCT(0, "CROSS_PRODUCT", "cross"),

	/**
	 * The '<em><b>SET DIFFERENCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SET_DIFFERENCE_VALUE
	 * @generated
	 * @ordered
	 */
	SET_DIFFERENCE(0, "SET_DIFFERENCE", "-"),

	/**
	 * The '<em><b>JOIN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JOIN_VALUE
	 * @generated
	 * @ordered
	 */
	JOIN(0, "JOIN", "@"),

	/**
	 * The '<em><b>INTERSECT RANGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERSECT_RANGE_VALUE
	 * @generated
	 * @ordered
	 */
	INTERSECT_RANGE(0, "INTERSECT_RANGE", "->*"),

	/**
	 * The '<em><b>SUBTRACT RANGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBTRACT_RANGE_VALUE
	 * @generated
	 * @ordered
	 */
	SUBTRACT_RANGE(0, "SUBTRACT_RANGE", "->-");

	/**
	 * The '<em><b>INTERSECT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INTERSECT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTERSECT
	 * @model literal="*"
	 * @generated
	 * @ordered
	 */
	public static final int INTERSECT_VALUE = 0;

	/**
	 * The '<em><b>UNION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UNION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNION
	 * @model literal="+"
	 * @generated
	 * @ordered
	 */
	public static final int UNION_VALUE = 0;

	/**
	 * The '<em><b>CROSS PRODUCT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CROSS PRODUCT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CROSS_PRODUCT
	 * @model literal="cross"
	 * @generated
	 * @ordered
	 */
	public static final int CROSS_PRODUCT_VALUE = 0;

	/**
	 * The '<em><b>SET DIFFERENCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SET DIFFERENCE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SET_DIFFERENCE
	 * @model literal="-"
	 * @generated
	 * @ordered
	 */
	public static final int SET_DIFFERENCE_VALUE = 0;

	/**
	 * The '<em><b>JOIN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>JOIN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #JOIN
	 * @model literal="@"
	 * @generated
	 * @ordered
	 */
	public static final int JOIN_VALUE = 0;

	/**
	 * The '<em><b>INTERSECT RANGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INTERSECT RANGE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTERSECT_RANGE
	 * @model literal="-&gt;*"
	 * @generated
	 * @ordered
	 */
	public static final int INTERSECT_RANGE_VALUE = 0;

	/**
	 * The '<em><b>SUBTRACT RANGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SUBTRACT RANGE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUBTRACT_RANGE
	 * @model literal="-&gt;-"
	 * @generated
	 * @ordered
	 */
	public static final int SUBTRACT_RANGE_VALUE = 0;

	/**
	 * An array of all the '<em><b>CALCULATOR BINARY OP</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CALCULATOR_BINARY_OP[] VALUES_ARRAY =
		new CALCULATOR_BINARY_OP[] {
			INTERSECT,
			UNION,
			CROSS_PRODUCT,
			SET_DIFFERENCE,
			JOIN,
			INTERSECT_RANGE,
			SUBTRACT_RANGE,
		};

	/**
	 * A public read-only list of all the '<em><b>CALCULATOR BINARY OP</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CALCULATOR_BINARY_OP> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CALCULATOR BINARY OP</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CALCULATOR_BINARY_OP get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CALCULATOR_BINARY_OP result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CALCULATOR BINARY OP</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CALCULATOR_BINARY_OP getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CALCULATOR_BINARY_OP result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CALCULATOR BINARY OP</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CALCULATOR_BINARY_OP get(int value) {
		switch (value) {
			case INTERSECT_VALUE: return INTERSECT;
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
	private CALCULATOR_BINARY_OP(int value, String name, String literal) {
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
	
} //CALCULATOR_BINARY_OP
