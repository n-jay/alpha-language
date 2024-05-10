package alpha.codegen

import org.eclipse.xtend.lib.annotations.Accessors

/** Indicates that a name was declared multiple times. */
class NameConflictException extends Exception {
	/** The list of names that were conflicting. */
	@Accessors(PUBLIC_GETTER, PRIVATE_SETTER)
	val Iterable<String> conflictingNames
	
	/** Constructs a new instance of this exception. */
	new (String... conflictingNames) {
		super("The following names were illegally declared multiple times: " + conflictingNames.join(","))
		this.conflictingNames = conflictingNames
	}
}