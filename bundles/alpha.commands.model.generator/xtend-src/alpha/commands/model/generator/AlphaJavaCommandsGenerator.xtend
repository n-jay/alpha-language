package alpha.commands.model.generator

import alpha.commands.model.AlphaCommandCategory
import alpha.commands.model.AlphaCommandsRoot
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import alpha.commands.model.generator.java.AlphaJavaCommandCategory

class AlphaJavaCommandsGenerator implements IGenerator {
	
	extension AlphaJavaCommandCategory javaCat = new AlphaJavaCommandCategory()
	
	def javaRootPath() '''./src-gen/'''
	
	//project where the file gets generated is hard-coded 
	def targetProject() {
		"alpha.commands"
	}
	
	override doGenerate(Resource input, IFileSystemAccess fsa) {
		
		val root = input.contents.get(0) as AlphaCommandsRoot

		for (AlphaCommandCategory cat : root.categories) {
			fsa.generateFile(cat.categoryBaseFilepath(), cat.generateBase);
			fsa.generateFile(cat.categoryFilepath(), cat.generate);
		}		

	}
	
	def categoryFilepath(AlphaCommandCategory cat) {
		javaRootPath+"/alpha/commands/"+cat.name.toFirstUpper+".java"
	}
	def categoryBaseFilepath(AlphaCommandCategory cat) {
		javaRootPath+"/alpha/commands/"+cat.name.toFirstUpper+"Base.java"
	}
}