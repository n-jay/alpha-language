package alpha.codegen;

import org.eclipse.xtend.lib.annotations.AccessorType;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

/**
 * Indicates that a name was declared multiple times.
 */
@SuppressWarnings("all")
public class NameConflictException extends Exception {
  /**
   * The list of names that were conflicting.
   */
  @Accessors({ AccessorType.PUBLIC_GETTER, AccessorType.PRIVATE_SETTER })
  private final String conflictingName;

  /**
   * Constructs a new instance of this exception.
   */
  public NameConflictException(final String conflictingName) {
    super((("The following name was illegally declared multiple times: \'" + conflictingName) + "\'."));
    this.conflictingName = conflictingName;
  }

  @Pure
  public String getConflictingName() {
    return this.conflictingName;
  }
}
