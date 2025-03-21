package alpha.codegen

import alpha.codegen.Program
import alpha.codegen.ProgramPrinter
import java.nio.file.Paths
import java.nio.file.Files

class ProgramGenerator {
	def static generate(Program program, String name) {
		generateC(program,name)
	}
	
	def static generateC(Program program, String name) {
		val path = Paths.get(name + ".c")
		val content = '''
			«ProgramPrinter.print(program)»
		'''
		Files.write(path, content.bytes)
		println(name + ".c file generated")
	}
	
	//TODO: Finalize content for header and makefile
	def static generateH(Program program, String name) {
		val path = Paths.get(name + ".h")
		val content = ''' 
			«» 
		'''
		Files.write(path, content.bytes)
		println(name + ".h file generated")
	}
	
	def static generateMakefile(String name) {
		val path = Paths.get("Makefile")
		val content = ''' 
			«» 
		'''
		Files.write(path, content.bytes)
		println("Makefile generated")
	}
}