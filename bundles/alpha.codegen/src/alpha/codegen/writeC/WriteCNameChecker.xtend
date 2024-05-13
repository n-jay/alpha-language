package alpha.codegen.writeC

import alpha.codegen.NameChecker
import java.util.HashMap
import alpha.model.Variable

/** A name checker specifically for WriteC programs. */
class WriteCNameChecker extends NameChecker {
	/** A mapping to the name of each variable's flag name. */
	protected val HashMap<String, String> flagNames = newHashMap
	
	/**
	 * Gets the flag name for the given variable.
	 * If one doesn't exist yet, a new one is created.
	 */
	def getFlagName(Variable variable) {
		return getFlagName(variable.name)
	}
	
	/**
	 * Gets the flag name for the given variable.
	 * If one doesn't exist yet, a new one is created.
	 */
	def getFlagName(String variableName) {
		// If the flag name has already been created, return that.
		if (flagNames.containsKey(variableName)) {
			return flagNames.get(variableName)
		}
		
		// Get a unique name to use as the flag name by adding a prefix
		// of "_flag_" to the variable name, then appending "_" until
		// the name is unique. 
		val flagName = getUniqueGlobalName("_flag_" + variableName, "_")
		flagNames.put(variableName, flagName)
		return flagName
	}
}