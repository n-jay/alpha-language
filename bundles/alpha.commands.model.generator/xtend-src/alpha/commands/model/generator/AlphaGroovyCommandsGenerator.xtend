package alpha.commands.model.generator

import alpha.commands.model.AlphaCommandsRoot
import alpha.commands.model.generator.groovy.AlphaGroovyCommandCategory
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator

class AlphaGroovyCommandsGenerator implements IGenerator {
	
	
	extension CommonExtensions commonEx = new CommonExtensions()
	extension AlphaGroovyCommandCategory groovyCat = new AlphaGroovyCommandCategory()
	
	def groovyRootPath() '''./src-gen/'''
	
	//project where the file gets generated is hard-coded
	def targetProject() {
		"alpha.commands.groovy"
	}
	
	override doGenerate(Resource input, IFileSystemAccess fsa) {
		val root = input.contents.get(0) as AlphaCommandsRoot
		
		fsa.generateFile(alphaScriptPath.toString, root.generate);
	}
	
	def alphaScriptPath() {
		'''«groovyRootPath»/alpha/commands/groovy/AlphaScript.groovy'''
	}
	
	def generate(AlphaCommandsRoot root) {
		'''
		package alpha.commands.groovy
		
		«root.collectUsedClasses.join("\n", [o|'''import «o»'''])»
		
		abstract class AlphaScript extends AbstractAlphaScript {
		
			«FOR cat : root.categories»
				«cat.generate»
			«ENDFOR»
		
		}
		'''
	}
}