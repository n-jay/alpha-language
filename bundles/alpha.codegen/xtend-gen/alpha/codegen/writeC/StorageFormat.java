package alpha.codegen.writeC;

/**
 * Indicates the format in which a variable's data is stored.
 */
@SuppressWarnings("all")
public enum StorageFormat {
  /**
   * All data is stored in a linear (i.e., 1D) array
   * to use the minimum amount of storage possible.
   */
  Linearized,

  /**
   * Data is stored in a way that is compatible with
   * the wrapper code from the original AlphaZ system.
   */
  OldAlphaZCompatible;
}
