package alpha.codegen.writeC

import alpha.model.AlphaSystem
import alpha.codegen.BaseDataType

import static extension alpha.model.util.AlphaUtil.copyAE

class VerificationSystemConverter {
	/**
	 * Converts an Alpha system to the simplified C AST.
	 * Only supports systems with a single body.
	 * Defaults to data being of type "float" and linearizing memory usage.
	 */
	def static convert(AlphaSystem system) {
		return convert(system, BaseDataType.FLOAT, false)
	}
	
	/**
	 * Converts an Alpha system to the simplified C AST.
	 * Only supports systems with a single body.
	 * Defaults to data being of type "float".
	 */
	def static convert(AlphaSystem system, boolean oldAlphaZCompatible) {
		return convert(system, BaseDataType.FLOAT, false)
	}
	
	/**
	 * Converts an Alpha system to the simplified C AST.
	 * Only supports systems with a single body.
	 * 
	 * If requested, the code produced will aim for compatibility with
	 * the older version of AlphaZ (although with no guarantees).
	 * This means that the inputs to the entry point will assume
	 * that memory for the system's inputs and outputs were allocated
	 * via the bounding box method, as opposed to linearized memory.
	 * 
	 * Note: since the newer Alpha language doesn't have typing,
	 * all indices are assumed to be of type "long",
	 * and all data values are of type "float".
	 */
	def static convert(AlphaSystem system, BaseDataType valueType, boolean oldAlphaZCompatible) {
		// Duplicate the system and add a suffix of "_verify" to the name.
		// Then, use the normal system converter to generate code.
		val duplicate = system.copyAE
		duplicate.name = duplicate.name + "_verify"
		return SystemConverter.convert(duplicate, valueType, oldAlphaZCompatible)
	}
}