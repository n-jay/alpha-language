package alpha.commands.model.generator.groovy

import alpha.commands.model.AlphaCommandCategory

class AlphaGroovyCommandCategory {
	
	extension AlphaGroovyCommand groovyCommand = new AlphaGroovyCommand()
	
	def generate(AlphaCommandCategory cat) {
		'''
			«FOR command : cat.commands»
				«command.generate»
				«FOR specialization : command.specializations»
					«specialization.generate»
				«ENDFOR»
			«ENDFOR»
		'''
	}
	
}