package alpha.codegen.tests

import alpha.codegen.BinaryExpr
import alpha.codegen.BinaryOperator
import alpha.codegen.CustomExpr
import alpha.codegen.Factory
import org.junit.Test

import static org.junit.Assert.*

class FactoryTest {
	/**
	 * Tests that binary expression trees group elements left to right.
	 */
	@Test def void binaryExprTree_01() {
		val exprs = (0..4).map[Factory.customExpr(it.toString)]
		
		// Building a binary expression tree should produce a binary expression.
		val tree = Factory.binaryExprTree(BinaryOperator.PLUS, exprs)
		assertTrue(tree instanceof BinaryExpr)
		
		// When adding 0+1+2+3+4, the grouping must be (((0+1)+2)+3)+4.
		// Thus, the right-hand sides should go 4, 3, 2, then 1.
		// Only the bottom left-hand side should be 0, the rest should
		// just be more binary expression nodes.
		val root = tree as BinaryExpr
		
		val four = root.right as CustomExpr
		val leftOf4 = root.left as BinaryExpr
		
		val three = leftOf4.right as CustomExpr
		val leftOf3 = leftOf4.left as BinaryExpr
		
		val two = leftOf3.right as CustomExpr
		val leftOf2 = leftOf3.left as BinaryExpr
		
		val one = leftOf2.right as CustomExpr
		val zero = leftOf2.left as CustomExpr
		
		assertEquals("4", four.expression)
		assertEquals("3", three.expression)
		assertEquals("2", two.expression)
		assertEquals("1", one.expression)
		assertEquals("0", zero.expression)
	}
}