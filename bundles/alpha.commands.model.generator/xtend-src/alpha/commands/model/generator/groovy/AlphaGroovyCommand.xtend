package alpha.commands.model.generator.groovy

import alpha.commands.model.AlphaCommand
import alpha.commands.model.AlphaCommandSpecialization
import alpha.commands.model.generator.CommonExtensions

class AlphaGroovyCommand {
	
	extension CommonExtensions commonEx = new CommonExtensions()
	
	def javaCommandFQN(AlphaCommand command) {
		'''alpha.commands.«command.category.name.toFirstUpper».«command.name»'''
	}
	
	def generate(AlphaCommand command) {
		'''
		«command.signature.returnTypeName» «command.name»(«command.signature.inputsList») {
			«command.javaCommandFQN»(«command.signature.callArgumentsList»)
		}
		'''
	}
	
	def generate(AlphaCommandSpecialization specialization) {
		val command = specialization.command
		'''
		«command.signature.returnTypeName» «command.name»(«specialization.inputsList») {
			«command.javaCommandFQN»(«specialization.callArgumentsList»)
		}
		'''
	}
}