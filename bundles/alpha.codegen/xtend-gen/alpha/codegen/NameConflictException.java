package alpha.codegen;

import org.eclipse.xtend.lib.annotations.AccessorType;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
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
  private final Iterable<String> conflictingNames;

  /**
   * Constructs a new instance of this exception.
   */
  public NameConflictException(final String... conflictingNames) {
    super(("The following names were illegally declared multiple times: " + IterableExtensions.join(((Iterable<?>)Conversions.doWrapArray(conflictingNames)), ",")));
    this.conflictingNames = ((Iterable<String>)Conversions.doWrapArray(conflictingNames));
  }

  @Pure
  public Iterable<String> getConflictingNames() {
    return this.conflictingNames;
  }
}
