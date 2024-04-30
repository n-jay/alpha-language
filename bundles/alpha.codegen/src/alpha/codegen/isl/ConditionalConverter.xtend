package alpha.codegen.isl

import alpha.codegen.BinaryOperator
import alpha.codegen.Factory
import fr.irisa.cairn.jnimap.isl.ISLBasicSet
import fr.irisa.cairn.jnimap.isl.ISLConstraint
import fr.irisa.cairn.jnimap.isl.ISLSet
import fr.irisa.cairn.jnimap.isl.ISL_FORMAT

import static extension alpha.codegen.Factory.customExpr

class ConditionalConverter {
	/** Generates a conditional only for the parameters of a set. */
	static def convertParameters(ISLSet set) {
		return set.params.convert
	}
	
	/** Generates a conditional to determine if a point is within this set. */
	static def convert(ISLSet set) {
		return Factory.binaryExprTree(BinaryOperator.OR, set.basicSets.map[convert])
	}
	
	/** Generates a conditional to determine if a point is within this basic set. */
	static def convert(ISLBasicSet basicSet) {
		return Factory.binaryExprTree(BinaryOperator.AND, basicSet.constraints.map[convert])
	}
	
	/** Generates a conditional to determine if a point satisfies this constraint. */
	static def convert(ISLConstraint constraint) {
		// Printing the constraint in the "C" format doesn't work as expected.
		// Instead, convert the constraint to an affine expression and print that to C,
		// which works as expected but ignores the comparison with zero.
		// We then add that comparison back in manually.
		val comparison = constraint.isEquality ? BinaryOperator.EQ : BinaryOperator.GEQ
		val leftSide = constraint.aff.toString(ISL_FORMAT.C).customExpr
		return Factory.binaryExpr(comparison, leftSide, "0".customExpr)
	}
}