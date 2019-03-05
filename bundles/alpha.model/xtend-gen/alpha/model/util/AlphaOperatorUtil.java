package alpha.model.util;

import alpha.model.BINARY_OP;
import alpha.model.REDUCTION_OP;

@SuppressWarnings("all")
public class AlphaOperatorUtil {
  public static BINARY_OP reductionOPtoBinaryOP(final REDUCTION_OP op) {
    BINARY_OP _switchResult = null;
    if (op != null) {
      switch (op) {
        case MIN:
          _switchResult = BINARY_OP.MIN;
          break;
        case MAX:
          _switchResult = BINARY_OP.MAX;
          break;
        case PROD:
          _switchResult = BINARY_OP.MUL;
          break;
        case SUM:
          _switchResult = BINARY_OP.ADD;
          break;
        case AND:
          _switchResult = BINARY_OP.AND;
          break;
        case OR:
          _switchResult = BINARY_OP.OR;
          break;
        case XOR:
          _switchResult = BINARY_OP.XOR;
          break;
        case EX:
          throw new RuntimeException("[SimplifyingReductions] Reductions with external functions are not yet handled.");
        default:
          break;
      }
    }
    return _switchResult;
  }
  
  public static BINARY_OP reductionOPtoBinaryInverseOP(final REDUCTION_OP op) {
    BINARY_OP _switchResult = null;
    if (op != null) {
      switch (op) {
        case MIN:
        case MAX:
        case AND:
        case OR:
        case XOR:
          throw new RuntimeException("[SimplifyingReductions] Operator does not have an inverse.");
        case PROD:
          _switchResult = BINARY_OP.DIV;
          break;
        case SUM:
          _switchResult = BINARY_OP.SUB;
          break;
        case EX:
          throw new RuntimeException("[SimplifyingReductions] Reductions with external functions are not yet handled.");
        default:
          break;
      }
    }
    return _switchResult;
  }
}
