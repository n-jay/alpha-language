package alpha.codegen

import java.util.List

import static extension alpha.model.util.CommonExtensions.toArrayList

/**
 * Used for checking if a variable declaration exists in a list
 * and adding it to that list if it doesn't.
 */
class NameChecker {
	/**
	 * Adds a new variable declaration to an existing list of declarations
	 * only if the new variable hasn't been declared yet.
	 * If there is an existing declaration with the same name but a different type,
	 * an IllegalArgumentException will be thrown.
	 * Otherwise, if there is an existing declaration with both the same name
	 * and same type, nothing will happen.
	 * 
	 * Returns true if the variable was added (i.e., it's a new variable),
	 * false if the variable was not added (i.e., it's an exact duplicate),
	 * or throws an IllegalArgumentException if it's a duplicate name with
	 * a differing type.
	 */
	def static boolean checkAdd(List<VariableDecl> existing, VariableDecl toAdd) throws IllegalArgumentException {
		// Get the list of existing variables with the same name.
		val sameName = existing.filter[it.hasSameName(toAdd)].toArrayList
		
		// If there aren't any, then this is a new variable, so add it.
		if (sameName.isNullOrEmpty) {
			existing.add(toAdd)
			return true
		}
		
		// If there are any variables with the same name but a different data type,
		// then the new variable cannot be added, so throw an exception.
		if (sameName.exists[it.hasDifferentType(toAdd)]) {
			throw new IllegalArgumentException("Duplicate declarations for variable '" + toAdd.name + "' with different types.")
		}
		
		// If this is reached, then the variable to add is an exact duplicate
		// of an existing variable, which is OK.
		return false
	}
	
	/** Returns true if the two variables have the same name, and false otherwise. */
	def protected static hasSameName(VariableDecl first, VariableDecl second) {
		return first.name == second.name
	}
	
	/** Returns true if the two variables have different types, and false otherwise. */
	def protected static hasDifferentType(VariableDecl first, VariableDecl second) {
		return first.dataType.baseType != second.dataType.baseType
			|| first.dataType.indirectionLevel != second.dataType.indirectionLevel
	}
}