package alpha.codegen

import org.eclipse.xtend.lib.annotations.Accessors

import java.lang.Exception

class ReservedKeywordException extends Exception {
	/** The reserved keyword they tried to use. */
	@Accessors(PUBLIC_GETTER, PRIVATE_SETTER)
	val String reservedWord
	
	/** Constructs a new instance of this exception. */
	new (String reservedWord) {
		super("The following reserved keyword was used as a name: '" + reservedWord + "'.")
		this.reservedWord = reservedWord
	}
}