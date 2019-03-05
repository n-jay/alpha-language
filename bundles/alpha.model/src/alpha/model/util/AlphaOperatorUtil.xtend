package alpha.model.util

import alpha.model.BINARY_OP
import alpha.model.REDUCTION_OP

class AlphaOperatorUtil {
	
	
	public static def BINARY_OP reductionOPtoBinaryOP(REDUCTION_OP op) {
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
	
	public static def BINARY_OP reductionOPtoBinaryInverseOP(REDUCTION_OP op) {
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
}