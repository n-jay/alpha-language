/*
 * generated by Xtext 2.15.0
 */
package alpha.commands.model.formatting2

import alpha.commands.model.AlphaCommandCategory
import alpha.commands.model.AlphaCommandsRoot
import alpha.commands.model.services.CommandsGrammarAccess
import com.google.inject.Inject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class CommandsFormatter extends AbstractFormatter2 {
	
	@Inject extension CommandsGrammarAccess

	def dispatch void format(AlphaCommandsRoot alphaCommandsRoot, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (alphaCommandCategory : alphaCommandsRoot.categories) {
			alphaCommandCategory.format
		}
	}

	def dispatch void format(AlphaCommandCategory alphaCommandCategory, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (alphaCommand : alphaCommandCategory.commands) {
			alphaCommand.format
		}
	}
	
	// TODO: implement for AlphaCommand, AlphaCommandSignature, AlphaCommandSpecialization
}
