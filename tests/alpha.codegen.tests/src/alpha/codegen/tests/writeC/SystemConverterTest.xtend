package alpha.codegen.tests.writeC

import alpha.codegen.ProgramPrinter
import alpha.codegen.writeC.SystemConverter
import alpha.model.AlphaModelLoader
import org.junit.Test

import static org.junit.Assert.*

import static extension alpha.commands.UtilityBase.*

class SystemConverterTest {
	/** The path to the Alpha file for these unit tests. */
	static val alphaFile = "resources/alpha.codegen.tests.writeC/SystemConverterTest.alpha";
	
	/** Gets the desired system for these unit tests. */
	static def getSystem(String system) {
		return AlphaModelLoader.loadModel(alphaFile)
			.GetSystem(system)
	}
	
	@Test
	def void convertSystem_noParameters() {
		val system = getSystem("NoParameters")
		val program = SystemConverter.convert(system)
		val code = ProgramPrinter.print(program)
		assertNotNull(code)
		assertNotEquals("", code)
	}
	
	@Test
	def void convertSystem_noParameterConstraints() {
		val system = getSystem("NoParameterConstraints")
		val program = SystemConverter.convert(system)
		val code = ProgramPrinter.print(program)
		assertNotNull(code)
		assertNotEquals("", code)
	}
}