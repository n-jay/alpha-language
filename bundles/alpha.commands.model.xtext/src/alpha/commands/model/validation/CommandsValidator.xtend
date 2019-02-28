/*
 * generated by Xtext 2.15.0
 */
package alpha.commands.model.validation

import alpha.commands.model.AlphaCommandSpecialization
import alpha.commands.model.ModelPackage
import org.eclipse.xtext.validation.Check

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class CommandsValidator extends AbstractCommandsValidator {
	
//	public static val INVALID_NAME = 'invalidName'
//
//	@Check
//	def checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.name.charAt(0))) {
//			warning('Name should start with a capital', 
//					CommandsPackage.Literals.GREETING__NAME,
//					INVALID_NAME)
//		}
//	}
	
	@Check
	def specializationLengthMatchesParent(AlphaCommandSpecialization specialization) {
		if (specialization.arguments.length != specialization.command.signature.arguments.length) {
			error('Specialization must have the same number of inputs as its base command', ModelPackage.Literals.ALPHA_COMMAND_SPECIALIZATION__ARGUMENTS)	
		}
	}
	
}
