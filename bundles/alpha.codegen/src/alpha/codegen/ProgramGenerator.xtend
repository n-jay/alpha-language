package alpha.codegen

import alpha.codegen.Program
import alpha.codegen.ProgramPrinter
import java.nio.file.Paths
import java.nio.file.Files

class ProgramGenerator {
	def static generate(Program program, String name) {
		val path = Paths.get(name + ".c")
		val content = '''
			«ProgramPrinter.print(program)»
		'''
		Files.write(path, content.bytes)
		println(name + ".c file generated")
	}
}