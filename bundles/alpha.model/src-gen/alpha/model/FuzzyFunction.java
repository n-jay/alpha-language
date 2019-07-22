/**
 */
package alpha.model;

import fr.irisa.cairn.jnimap.isl.ISLMap;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuzzy Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.model.FuzzyFunction#getAlphaString <em>Alpha String</em>}</li>
 *   <li>{@link alpha.model.FuzzyFunction#getIndirections <em>Indirections</em>}</li>
 *   <li>{@link alpha.model.FuzzyFunction#getZ__internal_cache_fuzzyMap <em>Zinternal cache fuzzy Map</em>}</li>
 *   <li>{@link alpha.model.FuzzyFunction#getZ__internal_cache_depRelation <em>Zinternal cache dep Relation</em>}</li>
 * </ul>
 *
 * @see alpha.model.ModelPackage#getFuzzyFunction()
 * @model
 * @generated
 */
public interface FuzzyFunction extends AlphaNode {
	/**
	 * Returns the value of the '<em><b>Alpha String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alpha String</em>' attribute.
	 * @see #setAlphaString(String)
	 * @see alpha.model.ModelPackage#getFuzzyFunction_AlphaString()
	 * @model unique="false" dataType="alpha.model.String"
	 * @generated
	 */
	String getAlphaString();

	/**
	 * Sets the value of the '{@link alpha.model.FuzzyFunction#getAlphaString <em>Alpha String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alpha String</em>' attribute.
	 * @see #getAlphaString()
	 * @generated
	 */
	void setAlphaString(String value);

	/**
	 * Returns the value of the '<em><b>Indirections</b></em>' containment reference list.
	 * The list contents are of type {@link alpha.model.FuzzyVariableUse}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indirections</em>' containment reference list.
	 * @see alpha.model.ModelPackage#getFuzzyFunction_Indirections()
	 * @model containment="true"
	 * @generated
	 */
	EList<FuzzyVariableUse> getIndirections();

	/**
	 * Returns the value of the '<em><b>Zinternal cache fuzzy Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zinternal cache fuzzy Map</em>' attribute.
	 * @see #setZ__internal_cache_fuzzyMap(ISLMap)
	 * @see alpha.model.ModelPackage#getFuzzyFunction_Z__internal_cache_fuzzyMap()
	 * @model unique="false" dataType="alpha.model.JNIISLMap"
	 * @generated
	 */
	ISLMap getZ__internal_cache_fuzzyMap();

	/**
	 * Sets the value of the '{@link alpha.model.FuzzyFunction#getZ__internal_cache_fuzzyMap <em>Zinternal cache fuzzy Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zinternal cache fuzzy Map</em>' attribute.
	 * @see #getZ__internal_cache_fuzzyMap()
	 * @generated
	 */
	void setZ__internal_cache_fuzzyMap(ISLMap value);

	/**
	 * Returns the value of the '<em><b>Zinternal cache dep Relation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zinternal cache dep Relation</em>' attribute.
	 * @see #setZ__internal_cache_depRelation(ISLMap)
	 * @see alpha.model.ModelPackage#getFuzzyFunction_Z__internal_cache_depRelation()
	 * @model unique="false" dataType="alpha.model.JNIISLMap"
	 * @generated
	 */
	ISLMap getZ__internal_cache_depRelation();

	/**
	 * Sets the value of the '{@link alpha.model.FuzzyFunction#getZ__internal_cache_depRelation <em>Zinternal cache dep Relation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zinternal cache dep Relation</em>' attribute.
	 * @see #getZ__internal_cache_depRelation()
	 * @generated
	 */
	void setZ__internal_cache_depRelation(ISLMap value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="alpha.model.JNIISLMap" unique="false"
	 * @generated
	 */
	ISLMap getFuzzyMap();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model fuzzyMapDataType="alpha.model.JNIISLMap" fuzzyMapUnique="false"
	 * @generated
	 */
	void setFuzzyMap(ISLMap fuzzyMap);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="alpha.model.JNIISLMap" unique="false"
	 * @generated
	 */
	ISLMap getDependenceRelation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model depRelDataType="alpha.model.JNIISLMap" depRelUnique="false"
	 * @generated
	 */
	void setDependenceRelation(ISLMap depRel);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" nameDataType="alpha.model.String" nameUnique="false"
	 * @generated
	 */
	FuzzyVariableUse getIndirectionByName(String name);

} // FuzzyFunction
