package alpha.codegen;

import org.eclipse.xtend.lib.annotations.AccessorType;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

@SuppressWarnings("all")
public class ReservedKeywordException extends Exception {
  /**
   * The reserved keyword they tried to use.
   */
  @Accessors({ AccessorType.PUBLIC_GETTER, AccessorType.PRIVATE_SETTER })
  private final String reservedWord;

  /**
   * Constructs a new instance of this exception.
   */
  public ReservedKeywordException(final String reservedWord) {
    super((("The following reserved keyword was used as a name: \'" + reservedWord) + "\'."));
    this.reservedWord = reservedWord;
  }

  @Pure
  public String getReservedWord() {
    return this.reservedWord;
  }
}
