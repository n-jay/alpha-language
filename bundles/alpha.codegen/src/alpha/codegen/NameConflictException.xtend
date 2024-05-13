package alpha.codegen

import org.eclipse.xtend.lib.annotations.Accessors

/** Indicates that a name was declared multiple times. */
class NameConflictException extends Exception {
	/** The list of names that were conflicting. */
	@Accessors(PUBLIC_GETTER, PRIVATE_SETTER)
	val String conflictingName
	
	/** Constructs a new instance of this exception. */
	new (String conflictingName) {
		super("The following name was illegally declared multiple times: '" + conflictingName + "'.")
		this.conflictingName = conflictingName
	}
}