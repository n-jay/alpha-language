package alpha.commands.model.generator.java

import alpha.commands.model.AlphaCommandCategory
import alpha.commands.model.generator.CommonExtensions

class AlphaJavaCommandCategory {
	
	extension CommonExtensions commonEx = new CommonExtensions()
	extension AlphaJavaCommand javaCommands = new AlphaJavaCommand()
	
	def generateBase(AlphaCommandCategory cat) {
		'''
		package alpha.commands;
		
		/*PROTECTED REGION ID(«cat.name.toFirstUpper»Base_Imports) ENABLED START*/
		//Add custom imports here
		/*PROTECTED REGION END*/
		
		«cat.collectUsedClassesInBaseMethods.join("\n", [o|'''import «o»;'''])»
		
		
		public class «cat.name.toFirstUpper»Base {
			«FOR command : cat.commands»
				«generateBaseCommand(command)»
			«ENDFOR»
		}
		'''
	}
		
	def generate(AlphaCommandCategory cat) {
		'''
		package alpha.commands;
		
		«cat.collectUsedClasses.join("\n", [o|'''import «o»;'''])»
		
		
		public class «cat.name.toFirstUpper» extends «cat.name.toFirstUpper»Base {
			«FOR command : cat.commands»
				«IF command.binding === null»«generateSpecializationCommand(command)»«ENDIF»
				«IF command.binding !== null»«generateCommandWithBindings(command)»«ENDIF»
			«ENDFOR»
		}
		'''
	}
		
}