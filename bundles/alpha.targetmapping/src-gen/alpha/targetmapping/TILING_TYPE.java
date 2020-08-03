/**
 */
package alpha.targetmapping;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>TILING TYPE</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see alpha.targetmapping.TargetmappingPackage#getTILING_TYPE()
 * @model
 * @generated
 */
public enum TILING_TYPE implements Enumerator {
	/**
	 * The '<em><b>FIXED SIZE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIXED_SIZE_VALUE
	 * @generated
	 * @ordered
	 */
	FIXED_SIZE(0, "FIXED_SIZE", "fixed-size"),

	/**
	 * The '<em><b>PARAMETRIC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARAMETRIC_VALUE
	 * @generated
	 * @ordered
	 */
	PARAMETRIC(1, "PARAMETRIC", "parametric"),

	/**
	 * The '<em><b>COMPILE TIME CONSTANT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPILE_TIME_CONSTANT_VALUE
	 * @generated
	 * @ordered
	 */
	COMPILE_TIME_CONSTANT(2, "COMPILE_TIME_CONSTANT", "compile-time-constant");

	/**
	 * The '<em><b>FIXED SIZE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIXED_SIZE
	 * @model literal="fixed-size"
	 * @generated
	 * @ordered
	 */
	public static final int FIXED_SIZE_VALUE = 0;

	/**
	 * The '<em><b>PARAMETRIC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARAMETRIC
	 * @model literal="parametric"
	 * @generated
	 * @ordered
	 */
	public static final int PARAMETRIC_VALUE = 1;

	/**
	 * The '<em><b>COMPILE TIME CONSTANT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPILE_TIME_CONSTANT
	 * @model literal="compile-time-constant"
	 * @generated
	 * @ordered
	 */
	public static final int COMPILE_TIME_CONSTANT_VALUE = 2;

	/**
	 * An array of all the '<em><b>TILING TYPE</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TILING_TYPE[] VALUES_ARRAY =
		new TILING_TYPE[] {
			FIXED_SIZE,
			PARAMETRIC,
			COMPILE_TIME_CONSTANT,
		};

	/**
	 * A public read-only list of all the '<em><b>TILING TYPE</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TILING_TYPE> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>TILING TYPE</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TILING_TYPE get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TILING_TYPE result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>TILING TYPE</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TILING_TYPE getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TILING_TYPE result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>TILING TYPE</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TILING_TYPE get(int value) {
		switch (value) {
			case FIXED_SIZE_VALUE: return FIXED_SIZE;
			case PARAMETRIC_VALUE: return PARAMETRIC;
			case COMPILE_TIME_CONSTANT_VALUE: return COMPILE_TIME_CONSTANT;
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
	private TILING_TYPE(int value, String name, String literal) {
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
	
} //TILING_TYPE
