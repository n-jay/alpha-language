package alpha.codegen.writeC;

import alpha.codegen.BaseDataType;
import alpha.codegen.Program;
import alpha.model.AlphaSystem;
import alpha.model.util.AlphaUtil;

@SuppressWarnings("all")
public class VerificationSystemConverter {
  /**
   * Converts an Alpha system to the simplified C AST.
   * Only supports systems with a single body.
   * Defaults to data being of type "float" and linearizing memory usage.
   */
  public static Program convert(final AlphaSystem system) {
    return VerificationSystemConverter.convert(system, BaseDataType.FLOAT, false);
  }

  /**
   * Converts an Alpha system to the simplified C AST.
   * Only supports systems with a single body.
   * Defaults to data being of type "float".
   */
  public static Program convert(final AlphaSystem system, final boolean oldAlphaZCompatible) {
    return VerificationSystemConverter.convert(system, BaseDataType.FLOAT, false);
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
  public static Program convert(final AlphaSystem system, final BaseDataType valueType, final boolean oldAlphaZCompatible) {
    final AlphaSystem duplicate = AlphaUtil.<AlphaSystem>copyAE(system);
    String _name = duplicate.getName();
    String _plus = (_name + "_verify");
    duplicate.setName(_plus);
    return SystemConverter.convert(duplicate, valueType, oldAlphaZCompatible);
  }
}
