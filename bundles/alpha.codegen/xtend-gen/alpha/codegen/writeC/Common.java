package alpha.codegen.writeC;

import alpha.codegen.BaseDataType;
import alpha.codegen.BinaryOperator;
import alpha.codegen.CustomExpr;
import alpha.codegen.DataType;
import alpha.codegen.Factory;
import alpha.codegen.Include;
import alpha.codegen.MacroStmt;
import alpha.codegen.UnaryOperator;
import alpha.model.BINARY_OP;
import alpha.model.REDUCTION_OP;
import alpha.model.UNARY_OP;
import alpha.model.Variable;
import java.util.Collections;
import java.util.List;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.ListExtensions;

/**
 * Defines common functions used in this package.
 */
@SuppressWarnings("all")
public class Common {
  /**
   * The default header comment for a program.
   */
  public static List<String> defaultHeaderComments() {
    return Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("This code was auto-generated with AlphaZ."));
  }

  /**
   * The default "#include" directives for a program.
   */
  public static List<Include> defaultIncludes() {
    final Function1<String, Include> _function = (String it) -> {
      return Factory.include(it);
    };
    return ListExtensions.<String, Include>map(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("float.h", "limits.h", "math.h", "stdbool.h", "stdio.h", "stdlib.h", "string.h")), _function);
  }

  /**
   * The default macros for common functions in a program.
   */
  public static List<MacroStmt> defaultFunctionMacros() {
    MacroStmt _macroStmt = Factory.macroStmt("max", new String[] { "a", "b" }, "(((a)>(b))?(a):(b))");
    MacroStmt _macroStmt_1 = Factory.macroStmt("min", new String[] { "a", "b" }, "(((a)<(b))?(a):(b))");
    MacroStmt _macroStmt_2 = Factory.macroStmt("mallocCheck", new String[] { "v", "s" }, "if ((v) == NULL) { printf(\"Failed to allocate memory for variable: %s\\n\", (s)); exit(-1); }");
    return Collections.<MacroStmt>unmodifiableList(CollectionLiterals.<MacroStmt>newArrayList(_macroStmt, _macroStmt_1, _macroStmt_2));
  }

  /**
   * The data type for a value within a "flag" variable.
   */
  public static DataType flagValueType() {
    return Factory.dataType(BaseDataType.CHAR, 0);
  }

  /**
   * The data type for a flag variable itself.
   */
  public static DataType flagVariableType() {
    return Factory.dataType(BaseDataType.CHAR, 1);
  }

  /**
   * The data type for a value within an Alpha variable.
   */
  public static DataType alphaValueType() {
    return Factory.dataType(BaseDataType.FLOAT, 0);
  }

  /**
   * The data type for an Alpha variable itself.
   */
  public static DataType alphaVariableType() {
    return Factory.dataType(BaseDataType.FLOAT, 1);
  }

  /**
   * The data type for an index within Alpha.
   */
  public static DataType alphaIndexType() {
    return Factory.dataType(BaseDataType.LONG, 0);
  }

  /**
   * Gets the name of the function that evaluates an Alpha variable at a specific point.
   */
  public static String getEvalName(final Variable variable) {
    String _name = variable.getName();
    return ("eval_" + _name);
  }

  /**
   * Gets the name of the "flag" variable for an Alpha variable.
   */
  public static String getFlagName(final Variable variable) {
    String _name = variable.getName();
    return ("_flag_" + _name);
  }

  /**
   * Gets the name of a parameter used for supplying the Alpha variables and parameters
   * to the entry point of a program.
   */
  public static String getParameterName(final Variable variable) {
    return Common.getParameterName(variable.getName());
  }

  /**
   * Gets the name of a parameter used for supplying the Alpha variables and parameters
   * to the entry point of a program.
   */
  public static String getParameterName(final String variable) {
    return ("_local_" + variable);
  }

  /**
   * Gets the expression representing a value of a "flag" variable.
   */
  public static CustomExpr toExpr(final FlagStatus status) {
    String _switchResult = null;
    if (status != null) {
      switch (status) {
        case NOT_EVALUATED:
          _switchResult = "\'N\'";
          break;
        case IN_PROGRESS:
          _switchResult = "\'I\'";
          break;
        case EVALUATED:
          _switchResult = "\'F\'";
          break;
        default:
          String _string = status.toString();
          String _plus = ("Unknown flag status: " + _string);
          throw new IllegalArgumentException(_plus);
      }
    } else {
      String _string = status.toString();
      String _plus = ("Unknown flag status: " + _string);
      throw new IllegalArgumentException(_plus);
    }
    return Factory.customExpr(_switchResult);
  }

  /**
   * Translates an Alpha unary operator to the C equivalent.
   */
  public static UnaryOperator getOperator(final UNARY_OP op) {
    try {
      UnaryOperator _switchResult = null;
      if (op != null) {
        switch (op) {
          case NOT:
            _switchResult = UnaryOperator.NOT;
            break;
          case NEGATE:
            _switchResult = UnaryOperator.NEGATE;
            break;
          default:
            throw new Exception((("Cannot convert Alpha unary operator \'" + op) + "\' to a C operator."));
        }
      } else {
        throw new Exception((("Cannot convert Alpha unary operator \'" + op) + "\' to a C operator."));
      }
      return _switchResult;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  /**
   * Translates an Alpha binary operator to the C equivalent.
   */
  public static BinaryOperator getOperator(final BINARY_OP op) {
    try {
      BinaryOperator _switchResult = null;
      if (op != null) {
        switch (op) {
          case MIN:
            _switchResult = BinaryOperator.MIN;
            break;
          case MAX:
            _switchResult = BinaryOperator.MAX;
            break;
          case MUL:
            _switchResult = BinaryOperator.TIMES;
            break;
          case DIV:
            _switchResult = BinaryOperator.DIVIDE;
            break;
          case ADD:
            _switchResult = BinaryOperator.PLUS;
            break;
          case SUB:
            _switchResult = BinaryOperator.MINUS;
            break;
          case AND:
            _switchResult = BinaryOperator.AND;
            break;
          case OR:
            _switchResult = BinaryOperator.OR;
            break;
          case EQ:
            _switchResult = BinaryOperator.EQ;
            break;
          case NE:
            _switchResult = BinaryOperator.NEQ;
            break;
          case GE:
            _switchResult = BinaryOperator.GEQ;
            break;
          case GT:
            _switchResult = BinaryOperator.GT;
            break;
          case LE:
            _switchResult = BinaryOperator.LEQ;
            break;
          case LT:
            _switchResult = BinaryOperator.LT;
            break;
          default:
            throw new Exception((("Cannot convert Alpha binary operator \'" + op) + "\' to a C operator."));
        }
      } else {
        throw new Exception((("Cannot convert Alpha binary operator \'" + op) + "\' to a C operator."));
      }
      return _switchResult;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  /**
   * Translates an Alpha reduction operator to the equivalent C binary operator.
   */
  public static BinaryOperator getOperator(final REDUCTION_OP op) {
    try {
      BinaryOperator _switchResult = null;
      if (op != null) {
        switch (op) {
          case MIN:
            _switchResult = BinaryOperator.MIN;
            break;
          case MAX:
            _switchResult = BinaryOperator.MAX;
            break;
          case PROD:
            _switchResult = BinaryOperator.TIMES;
            break;
          case SUM:
            _switchResult = BinaryOperator.PLUS;
            break;
          case AND:
            _switchResult = BinaryOperator.AND;
            break;
          case OR:
            _switchResult = BinaryOperator.OR;
            break;
          default:
            throw new Exception((("Cannot convert Alpha reduction operator \'" + op) + "\' to a C operator."));
        }
      } else {
        throw new Exception((("Cannot convert Alpha reduction operator \'" + op) + "\' to a C operator."));
      }
      return _switchResult;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  /**
   * Gets the expression for the initial value to use for the reduction variable
   * that gets accumulated into while computing the reduction.
   * Note: since the current implementation only uses floats to represent data,
   * there are no initial values for the logical operations (AND, OR, etc.).
   */
  public static CustomExpr getReductionInitialValue(final REDUCTION_OP op) {
    try {
      String _switchResult = null;
      if (op != null) {
        switch (op) {
          case MIN:
            _switchResult = "FLT_MAX";
            break;
          case MAX:
            _switchResult = "FLT_MIN";
            break;
          case PROD:
            _switchResult = "1.0f";
            break;
          case SUM:
            _switchResult = "0.0f";
            break;
          default:
            throw new Exception((("There is no initial value for reduction operator \'" + op) + "\'."));
        }
      } else {
        throw new Exception((("There is no initial value for reduction operator \'" + op) + "\'."));
      }
      return Factory.customExpr(_switchResult);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
