package alpha.model.util;

import alpha.model.AlphaExpression;
import alpha.model.BINARY_OP;
import alpha.model.BooleanExpression;
import alpha.model.IntegerExpression;
import alpha.model.REDUCTION_OP;
import alpha.model.RealExpression;

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
  
  public static boolean isIdentity(final BINARY_OP op, final AlphaExpression expr) {
    boolean _xblockexpression = false;
    {
      if (op != null) {
        switch (op) {
          case MIN:
          case MAX:
            return false;
          case MUL:
          case DIV:
          case MOD:
            if ((expr instanceof IntegerExpression)) {
              int _value = ((IntegerExpression)expr).getValue();
              return (_value == 1);
            }
            if ((expr instanceof RealExpression)) {
              float _value_1 = ((RealExpression)expr).getValue();
              return (_value_1 == 1);
            }
            break;
          case ADD:
          case SUB:
            if ((expr instanceof IntegerExpression)) {
              int _value_2 = ((IntegerExpression)expr).getValue();
              return (_value_2 == 0);
            }
            if ((expr instanceof RealExpression)) {
              float _value_3 = ((RealExpression)expr).getValue();
              return (_value_3 == 0);
            }
            break;
          case AND:
            if ((expr instanceof BooleanExpression)) {
              return ((BooleanExpression)expr).isValue();
            }
            break;
          case OR:
            if ((expr instanceof BooleanExpression)) {
              boolean _isValue = ((BooleanExpression)expr).isValue();
              return (!_isValue);
            }
            break;
          default:
            return false;
        }
      } else {
        return false;
      }
      _xblockexpression = false;
    }
    return _xblockexpression;
  }
}
