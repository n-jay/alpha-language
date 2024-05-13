package alpha.codegen.tests

import org.junit.Test
import alpha.codegen.NameChecker
import static extension alpha.model.util.CommonExtensions.toArrayList
import static org.junit.Assert.*
import alpha.codegen.NameConflictException
import alpha.codegen.Factory
import alpha.codegen.writeC.Common

class NameCheckerTest {
	@Test
	def void globalNameExists_01() {
		// Add some names to a name checker.
		val checker = new NameChecker
		checker.checkAddGlobal("a", "b", "c")
		
		// Ensure the names added are present.
		assertTrue(checker.globalNameExists("c"))
		assertTrue(checker.globalNameExists("a"))
		assertTrue(checker.globalNameExists("b"))
		
		// Ensure that some other names are not present.
		assertFalse(checker.globalNameExists("d"))
		assertFalse(checker.globalNameExists("A"))
		assertFalse(checker.globalNameExists("aaaa"))
	}
	
	@Test
	def void checkAddGlobal_01() {
		// Make sure we can add names that don't exist yet.
		// A "NameConflictException" will be thrown if the name isn't allowed.
		val checker = new NameChecker
		checker.checkAddGlobal("a")
		checker.checkAddGlobal("b")
		checker.checkAddGlobal("c")
		checker.checkAddGlobal("A")
		checker.checkAddGlobal("aa")
		checker.checkAddGlobal("aaa")
	}
	
	@Test
	def void checkAddGlobal_02() {
		// Make sure we can't add duplicate global names.
		val checker = new NameChecker
		checker.checkAddGlobal("a")
		assertThrows(typeof(NameConflictException), [|checker.checkAddGlobal("a")])
	}
	
	@Test
	def void checkAddGlobal_03() {
		// Make sure we can't add duplicate global names if they're both being added at once.
		val checker = new NameChecker
		assertThrows(typeof(NameConflictException), [|checker.checkAddGlobal("a", "a")])
	}
	
	@Test
	def void getUniqueGlobalName_01() {
		val checker = new NameChecker
		checker.checkAddGlobal("a", "aa", "aaa")
		assertEquals("aaaa", checker.getUniqueGlobalName("a", "a"))
	}
	
	@Test
	def void preventShadowing_01() {
		// Add a name to the name checker as a global name.
		val checker = new NameChecker
		checker.checkAddGlobal("a")
		
		// Make sure we can't add a local variable of the same name.
		val variable = Factory.variableDecl(Common.alphaIndexType, "a")
		assertThrows(typeof(NameConflictException), [|checker.checkAddLocal(variable, newArrayList)]) 
	}
	
	@Test
	def void allowShadowing_01() {
		// Add a name to the name checker as a global name.
		val checker = new NameChecker(false)
		checker.checkAddGlobal("a")
		
		// Make sure we can add a local variable of the same name if shadowing is turned off.
		val variable = Factory.variableDecl(Common.alphaIndexType, "a")
		checker.checkAddLocal(variable, newArrayList)
	}
	
	@Test
	def void checkAddLocal_01() {
		val checker = new NameChecker()
		val variable = Factory.variableDecl(Common.alphaIndexType, "a")
		val localsList = newArrayList
		checker.checkAddLocal(variable, localsList)
		assertEquals(1, localsList.size)
		assertTrue(localsList.get(0).name == "a")
	}
	
	@Test
	def void getUniqueLocalName_01() {
		val checker = new NameChecker
		checker.checkAddGlobal("a", "aa")
		val locals = #["aaa", "aaaa"]
		assertEquals("aaaaa", checker.getUniqueLocalName(locals, "a", "a"))
	}
}