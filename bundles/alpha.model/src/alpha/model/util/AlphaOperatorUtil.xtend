package alpha.model.util

import alpha.model.BINARY_OP
import alpha.model.REDUCTION_OP
import alpha.model.AlphaExpression
import alpha.model.BooleanExpression
import alpha.model.IntegerExpression
import alpha.model.RealExpression

class AlphaOperatorUtil {
	
	
	static def BINARY_OP reductionOPtoBinaryOP(REDUCTION_OP op) {
		switch (op) {
			case MIN: { BINARY_OP.MIN }
			case MAX: { BINARY_OP.MAX }
			case PROD: { BINARY_OP.MUL }
			case SUM: { BINARY_OP.ADD } 
			case AND: { BINARY_OP.AND }
			case OR: { BINARY_OP.OR }
			case XOR: { BINARY_OP.XOR }
			case EX: {
				throw new RuntimeException("[SimplifyingReductions] Reductions with external functions are not yet handled.");
			}
			
		}
	}
	
	static def BINARY_OP reductionOPtoBinaryInverseOP(REDUCTION_OP op) {
		switch (op) {
			case MIN,
			case MAX, 
			case AND,
			case OR,
			case XOR: { 
				throw new RuntimeException("[SimplifyingReductions] Operator does not have an inverse.");
			}
			case PROD: { BINARY_OP.DIV }
			case SUM: { BINARY_OP.SUB }
			case EX: {
				throw new RuntimeException("[SimplifyingReductions] Reductions with external functions are not yet handled.");
			}
			
		}
	}
	
	static def boolean isIdentity(BINARY_OP op, AlphaExpression expr) {
		switch (op) {
			case MIN,
			case MAX: {
				//FIXME should add inf and -inf
				return false
			}
			case MUL,
			case DIV,
			case MOD: {
				if (expr instanceof IntegerExpression) {
					return expr.value == 1
				}
				if (expr instanceof RealExpression) {
					return expr.value == 1
				}
			}
			case ADD,
			case SUB: {
				if (expr instanceof IntegerExpression) {
					return expr.value == 0
				}
				if (expr instanceof RealExpression) {
					return expr.value == 0
				}
			}
			case AND: {
				if (expr instanceof BooleanExpression) {
					return expr.value
				}
			}
			case OR: {
				if (expr instanceof BooleanExpression) {
					return !expr.value
				}
			}
			default: {
				return false
			}
			
		}
		
		false
	}
}