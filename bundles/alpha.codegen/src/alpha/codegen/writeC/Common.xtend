package alpha.codegen.writeC

import alpha.codegen.BaseDataType
import alpha.codegen.BinaryOperator
import alpha.codegen.UnaryOperator
import alpha.model.BINARY_OP
import alpha.model.REDUCTION_OP
import alpha.model.UNARY_OP
import alpha.model.Variable

import static alpha.codegen.Factory.dataType
import static alpha.codegen.Factory.macroStmt

import static extension alpha.codegen.Factory.customExpr
import static extension alpha.codegen.Factory.include

/** Defines common functions used in this package. */
class Common {
	////////////////////////////////////////////////
	// Program Defaults
	////////////////////////////////////////////////
	
	/** The default header comment for a program. */
	def static defaultHeaderComments() {
		return #["This code was auto-generated with AlphaZ."]
	}
	
	/** The default "#include" directives for a program. */
	def static defaultIncludes() {
		return #[
			"float.h",
			"limits.h",
			"math.h",
			"stdbool.h",
			"stdio.h",
			"stdlib.h",
			"string.h"
		].map[include]
	}
	
	/** The default macros for common functions in a program. */
	def static defaultFunctionMacros() {
		return #[
			macroStmt("ceild", #["n", "d"], "((int)ceil(((double)(n))/((double)(d))))"),
			macroStmt("floord", #["n", "d"], "((int)floor(((double)(n))/((double)(d))))"),
			macroStmt("div", #["a", "b"], "(ceild((a),(b)))"),
			macroStmt("max", #["a", "b"], "(((a)>(b))?(a):(b))"),
			macroStmt("min", #["a", "b"], "(((a)<(b))?(a):(b))"),
			macroStmt("mallocCheck", #["v", "s"], "if ((v) == NULL) { printf(\"Failed to allocate memory for variable: %s\\n\", (s)); exit(-1); }")
		]
	}
	
	
	////////////////////////////////////////////////
	// Data Types
	////////////////////////////////////////////////
	
	/** The data type for a value within a "flag" variable. */
	def static flagValueType() {
		return dataType(BaseDataType.CHAR, 0)
	}
	
	/** The data type for a flag variable itself. */
	def static flagVariableType() {
		return dataType(BaseDataType.CHAR, 1)
	}
	
	/** The data type for an index within Alpha. */
	def static alphaIndexType() {
		return dataType(BaseDataType.LONG, 0)
	}
	
	
	////////////////////////////////////////////////
	// Function and Variable Names
	////////////////////////////////////////////////
	
	/** Gets the name of the function that evaluates an Alpha variable at a specific point. */
	def static getEvalName(Variable variable) {
		return "eval_" + variable.name
	}
	
	/**
	 * Gets the name of a parameter used for supplying the Alpha variables and parameters
	 * to the entry point of a program.
	 */
	def static getParameterName(Variable variable) {
		return getParameterName(variable.name)
	}
	
	/**
	 * Gets the name of a parameter used for supplying the Alpha variables and parameters
	 * to the entry point of a program.
	 */
	def static getParameterName(String variable) {
		return "_local_" + variable
	}
	
	
	////////////////////////////////////////////////
	// Expressions and Operators
	////////////////////////////////////////////////
	
	/** Gets the expression representing a value of a "flag" variable. */
	def static toExpr(FlagStatus status) {
		return switch status {
			case NOT_EVALUATED: "'N'"
			case IN_PROGRESS: "'I'"
			case EVALUATED: "'F'"
			default: throw new IllegalArgumentException("Unknown flag status: " + status.toString)
		}.customExpr
	}
	
	/** Translates an Alpha unary operator to the C equivalent. */
	static def getOperator(UNARY_OP op) {
		return switch op {
			case NOT: UnaryOperator.NOT
			case NEGATE: UnaryOperator.NEGATE
			default: throw new Exception("Cannot convert Alpha unary operator '" + op + "' to a C operator.")
		}
	}
	
	/** Translates an Alpha binary operator to the C equivalent. */
	static def getOperator(BINARY_OP op) {
		return switch op {
			case MIN: BinaryOperator.MIN
			case MAX: BinaryOperator.MAX
			case MUL: BinaryOperator.TIMES
			case DIV: BinaryOperator.DIVIDE
			case ADD: BinaryOperator.PLUS
			case SUB: BinaryOperator.MINUS
			case AND: BinaryOperator.AND
			case OR: BinaryOperator.OR
			case EQ: BinaryOperator.EQ
			case NE: BinaryOperator.NEQ
			case GE: BinaryOperator.GEQ
			case GT: BinaryOperator.GT
			case LE: BinaryOperator.LEQ
			case LT: BinaryOperator.LT
			default: throw new Exception("Cannot convert Alpha binary operator '" + op + "' to a C operator.")
		}
	}
	
	/** Translates an Alpha reduction operator to the equivalent C binary operator. */
	static def getOperator(REDUCTION_OP op) {
		return switch op {
			case MIN: BinaryOperator.MIN
			case MAX: BinaryOperator.MAX
			case PROD: BinaryOperator.TIMES
			case SUM: BinaryOperator.PLUS
			case AND: BinaryOperator.AND
			case OR: BinaryOperator.OR
			default: throw new Exception("Cannot convert Alpha reduction operator '" + op + "' to a C operator.")
		}
	}
	
	/**
	 * Gets the expression for the initial value to use for the reduction variable
	 * that gets accumulated into while computing the reduction.
	 * Note: since the current implementation only uses floats to represent data,
	 * there are no initial values for the logical operations (AND, OR, etc.).
	 */
	static def getReductionInitialValue(BaseDataType dataType, REDUCTION_OP op) {
		return switch op {
			case MIN: dataType.maxValue
			case MAX: dataType.minValue
			case PROD: dataType.oneValue
			case SUM: dataType.zeroValue
			default: throw new Exception("There is no initial value for reduction operator '" + op + "'.")
		}
	}
	
	/** Gets the expression for the maximum value of a data type. */
	static def getMaxValue(BaseDataType dataType) {
		val maxValue = switch dataType {
			case INT: "INT_MAX"
			case LONG: "LONG_MAX"
			case FLOAT: "FLT_MAX"
			case DOUBLE: "DBL_MAX"
			default: throw new Exception("There is no maximum value for type '" + dataType + "'.")
		}
		return maxValue.customExpr
	}
	
	/** Gets the expression for the minimum value of a data type. */
	static def getMinValue(BaseDataType dataType) {
		return switch dataType {
			case INT: "INT_MIN"
			case LONG: "LONG_MIN"
			case FLOAT: "FLT_MIN"
			case DOUBLE: "DBL_MIN"
			default: throw new Exception("There is no maximum value for type '" + dataType + "'.")
		}.customExpr
	}
	
	/** Gets the expression for 1 for the given data type. */
	static def getOneValue(BaseDataType dataType) {
		return switch dataType {
			case INT: "1"
			case LONG: "1L"
			case FLOAT: "1.0f"
			case DOUBLE: "1.0"
			default: throw new Exception("There is no maximum value for type '" + dataType + "'.")
		}.customExpr
	}
	
	/** Gets the expression for 0 for the given data type. */
	static def getZeroValue(BaseDataType dataType) {
		return switch dataType {
			case INT: "0"
			case LONG: "0L"
			case FLOAT: "0.0f"
			case DOUBLE: "0.0"
			default: throw new Exception("There is no maximum value for type '" + dataType + "'.")
		}.customExpr
	}
}