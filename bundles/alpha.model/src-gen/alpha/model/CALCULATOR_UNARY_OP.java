/**
 */
package alpha.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>CALCULATOR UNARY OP</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see alpha.model.ModelPackage#getCALCULATOR_UNARY_OP()
 * @model
 * @generated
 */
public enum CALCULATOR_UNARY_OP implements Enumerator {
	/**
	 * The '<em><b>GET DOMAIN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GET_DOMAIN_VALUE
	 * @generated
	 * @ordered
	 */
	GET_DOMAIN(0, "GET_DOMAIN", "domain"),

	/**
	 * The '<em><b>GET RANGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GET_RANGE_VALUE
	 * @generated
	 * @ordered
	 */
	GET_RANGE(0, "GET_RANGE", "range"),

	/**
	 * The '<em><b>COMPLEMENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPLEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	COMPLEMENT(0, "COMPLEMENT", "complement"),

	/**
	 * The '<em><b>POLYHEDRAL HULL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POLYHEDRAL_HULL_VALUE
	 * @generated
	 * @ordered
	 */
	POLYHEDRAL_HULL(0, "POLYHEDRAL_HULL", "poly-hull"),

	/**
	 * The '<em><b>AFFINE HULL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AFFINE_HULL_VALUE
	 * @generated
	 * @ordered
	 */
	AFFINE_HULL(0, "AFFINE_HULL", "affine-hull"),

	/**
	 * The '<em><b>REVERSE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REVERSE_VALUE
	 * @generated
	 * @ordered
	 */
	REVERSE(0, "REVERSE", "reverse");

	/**
	 * The '<em><b>GET DOMAIN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GET DOMAIN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GET_DOMAIN
	 * @model literal="domain"
	 * @generated
	 * @ordered
	 */
	public static final int GET_DOMAIN_VALUE = 0;

	/**
	 * The '<em><b>GET RANGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GET RANGE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GET_RANGE
	 * @model literal="range"
	 * @generated
	 * @ordered
	 */
	public static final int GET_RANGE_VALUE = 0;

	/**
	 * The '<em><b>COMPLEMENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COMPLEMENT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPLEMENT
	 * @model literal="complement"
	 * @generated
	 * @ordered
	 */
	public static final int COMPLEMENT_VALUE = 0;

	/**
	 * The '<em><b>POLYHEDRAL HULL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>POLYHEDRAL HULL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POLYHEDRAL_HULL
	 * @model literal="poly-hull"
	 * @generated
	 * @ordered
	 */
	public static final int POLYHEDRAL_HULL_VALUE = 0;

	/**
	 * The '<em><b>AFFINE HULL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AFFINE HULL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AFFINE_HULL
	 * @model literal="affine-hull"
	 * @generated
	 * @ordered
	 */
	public static final int AFFINE_HULL_VALUE = 0;

	/**
	 * The '<em><b>REVERSE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REVERSE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REVERSE
	 * @model literal="reverse"
	 * @generated
	 * @ordered
	 */
	public static final int REVERSE_VALUE = 0;

	/**
	 * An array of all the '<em><b>CALCULATOR UNARY OP</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CALCULATOR_UNARY_OP[] VALUES_ARRAY =
		new CALCULATOR_UNARY_OP[] {
			GET_DOMAIN,
			GET_RANGE,
			COMPLEMENT,
			POLYHEDRAL_HULL,
			AFFINE_HULL,
			REVERSE,
		};

	/**
	 * A public read-only list of all the '<em><b>CALCULATOR UNARY OP</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CALCULATOR_UNARY_OP> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CALCULATOR UNARY OP</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CALCULATOR_UNARY_OP get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CALCULATOR_UNARY_OP result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CALCULATOR UNARY OP</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CALCULATOR_UNARY_OP getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CALCULATOR_UNARY_OP result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CALCULATOR UNARY OP</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CALCULATOR_UNARY_OP get(int value) {
		switch (value) {
			case GET_DOMAIN_VALUE: return GET_DOMAIN;
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
	private CALCULATOR_UNARY_OP(int value, String name, String literal) {
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
	
} //CALCULATOR_UNARY_OP
