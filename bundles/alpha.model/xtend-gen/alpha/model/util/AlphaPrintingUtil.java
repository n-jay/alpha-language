package alpha.model.util;

import alpha.model.util.AlphaUtil;
import fr.irisa.cairn.jnimap.isl.ISLAff;
import fr.irisa.cairn.jnimap.isl.ISLBasicMap;
import fr.irisa.cairn.jnimap.isl.ISLBasicSet;
import fr.irisa.cairn.jnimap.isl.ISLConstraint;
import fr.irisa.cairn.jnimap.isl.ISLDimType;
import fr.irisa.cairn.jnimap.isl.ISLMap;
import fr.irisa.cairn.jnimap.isl.ISLMultiAff;
import fr.irisa.cairn.jnimap.isl.ISLPWQPolynomial;
import fr.irisa.cairn.jnimap.isl.ISLQPolynomial;
import fr.irisa.cairn.jnimap.isl.ISLSet;
import fr.irisa.cairn.jnimap.isl.ISLSpace;
import fr.irisa.cairn.jnimap.isl.ISLVal;
import java.util.LinkedList;
import java.util.List;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class AlphaPrintingUtil {
  /**
   * ISLMultiAff to Alpha functions
   */
  public static String toShowString(final ISLMultiAff maff) {
    if ((maff == null)) {
      return null;
    }
    final String lhs = IterableExtensions.join(maff.getDomainSpace().getIndexNames(), ",");
    final Function1<ISLAff, CharSequence> _function = (ISLAff a) -> {
      return AlphaPrintingUtil.toAlphaString(a);
    };
    final String rhs = IterableExtensions.<ISLAff>join(maff.getAffs(), ",", _function);
    String _xifexpression = null;
    boolean _startsWith = rhs.startsWith("-");
    if (_startsWith) {
      _xifexpression = " ";
    } else {
      _xifexpression = "";
    }
    final String offset = _xifexpression;
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    _builder.append(lhs);
    _builder.append("->");
    _builder.append(offset);
    _builder.append(rhs);
    _builder.append(")");
    return _builder.toString();
  }
  
  public static String toAShowString(final ISLMultiAff maff) {
    if ((maff == null)) {
      return null;
    }
    final Function1<ISLAff, CharSequence> _function = (ISLAff a) -> {
      return AlphaPrintingUtil.toAlphaString(a);
    };
    final String rhs = IterableExtensions.<ISLAff>join(maff.getAffs(), ",", _function);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("[");
    _builder.append(rhs);
    _builder.append("]");
    return _builder.toString();
  }
  
  public static String toAShowString(final ISLMultiAff maff, final List<String> context) {
    if ((maff == null)) {
      return null;
    }
    return AlphaPrintingUtil.toAShowString(AlphaUtil.renameIndices(maff, context));
  }
  
  /**
   * JNIISLAff to AlphaString
   * 
   * The JNIISLAff corresponds to an affine function with 1D output. The space defines the
   * index names, and the output expression is defined as a list of coef*name/denom with
   * an additional denominator that applies to the entire expression.
   * 
   * This method applies the following order:
   *   - constant is always at the end
   *   - positive values first
   *   - among positive/negative values, the order is parameters, indices, divs
   */
  public static String toAlphaString(final ISLAff aff) {
    String _xblockexpression = null;
    {
      final long commonD = aff.getDenominator();
      final ISLVal constant = aff.getConstantVal();
      long _numerator = constant.getNumerator();
      long _multiply = (_numerator * commonD);
      long _denominator = constant.getDenominator();
      final long cstVal = (_multiply / _denominator);
      final LinkedList<String> posList = new LinkedList<String>();
      final LinkedList<String> negList = new LinkedList<String>();
      AlphaPrintingUtil.toAlphaStringHelper(aff, ISLDimType.isl_dim_param, commonD, posList, negList);
      AlphaPrintingUtil.toAlphaStringHelper(aff, ISLDimType.isl_dim_in, commonD, posList, negList);
      AlphaPrintingUtil.toAlphaStringHelper(aff, ISLDimType.isl_dim_div, commonD, posList, negList);
      final String pos = IterableExtensions.join(posList, "+");
      final String neg = IterableExtensions.join(negList, "");
      Object _xifexpression = null;
      if ((cstVal == 0)) {
        _xifexpression = "";
      } else {
        Object _xifexpression_1 = null;
        if (((cstVal > 0) && ((((Object[])Conversions.unwrapArray(posList, Object.class)).length + ((Object[])Conversions.unwrapArray(negList, Object.class)).length) > 0))) {
          _xifexpression_1 = ("+" + Long.valueOf(cstVal));
        } else {
          _xifexpression_1 = Long.valueOf(cstVal);
        }
        _xifexpression = ((Object)_xifexpression_1);
      }
      final Object cst = ((Object)_xifexpression);
      String _xifexpression_2 = null;
      if ((((((Object[])Conversions.unwrapArray(posList, Object.class)).length + ((Object[])Conversions.unwrapArray(negList, Object.class)).length) == 0) && (cstVal == 0))) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("0");
        _xifexpression_2 = _builder.toString();
      } else {
        String _xifexpression_3 = null;
        if ((commonD != 1)) {
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("(");
          _builder_1.append(pos);
          _builder_1.append(neg);
          _builder_1.append(((Object)cst));
          _builder_1.append(")/");
          _builder_1.append(commonD);
          _xifexpression_3 = _builder_1.toString();
        } else {
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append(pos);
          _builder_2.append(neg);
          _builder_2.append(((Object)cst));
          _xifexpression_3 = _builder_2.toString();
        }
        _xifexpression_2 = _xifexpression_3;
      }
      _xblockexpression = _xifexpression_2;
    }
    return _xblockexpression;
  }
  
  /**
   * Helper for printAff that collects positive/negative values of a given dim type
   */
  private static void toAlphaStringHelper(final ISLAff aff, final ISLDimType dimType, final long commonD, final List<String> posList, final List<String> negList) {
    final ISLSpace dims = aff.getSpace();
    final int n = dims.dim(dimType);
    final List<String> names = dims.getDimNames(dimType);
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, n, true);
    for (final Integer i : _doubleDotLessThan) {
      {
        final ISLVal coefficient = aff.getCoefficientVal(dimType, (i).intValue());
        long _numerator = coefficient.getNumerator();
        long _multiply = (_numerator * commonD);
        long _denominator = coefficient.getDenominator();
        final long coef = (_multiply / _denominator);
        if ((coef > 1)) {
          StringConcatenation _builder = new StringConcatenation();
          _builder.append(coef);
          String _get = names.get((i).intValue());
          _builder.append(_get);
          posList.add(_builder.toString());
        } else {
          if ((coef == 1)) {
            posList.add(names.get((i).intValue()));
          } else {
            if ((coef < (-1))) {
              StringConcatenation _builder_1 = new StringConcatenation();
              _builder_1.append(coef);
              String _get_1 = names.get((i).intValue());
              _builder_1.append(_get_1);
              negList.add(_builder_1.toString());
            } else {
              if ((coef == (-1))) {
                StringConcatenation _builder_2 = new StringConcatenation();
                _builder_2.append("-");
                String _get_2 = names.get((i).intValue());
                _builder_2.append(_get_2);
                negList.add(_builder_2.toString());
              }
            }
          }
        }
      }
    }
  }
  
  /**
   * ISLSet to AlphaString
   * 
   * For sets, ISL string without the parameter part is the AlphaString.
   */
  public static String toShowString(final ISLSet set) {
    return AlphaPrintingUtil.toShowString(set, null);
  }
  
  public static String toShowString(final ISLSet set, final ISLSet paramDom) {
    return AlphaPrintingUtil.toShowString(set, paramDom, null);
  }
  
  public static String toShowString(final ISLSet set, final ISLSet paramDom, final List<String> names) {
    int _nbIndices = set.getNbIndices();
    boolean _equals = (_nbIndices == 0);
    if (_equals) {
      return "{}";
    }
    ISLSet _xifexpression = null;
    if ((names != null)) {
      _xifexpression = set.<ISLSet>renameIndices(names);
    } else {
      _xifexpression = set;
    }
    final ISLSet setRenamed = _xifexpression;
    ISLSet _xifexpression_1 = null;
    if (((paramDom != null) && paramDom.isParamSet())) {
      _xifexpression_1 = setRenamed.gist(paramDom.copy().addDims(ISLDimType.isl_dim_set, setRenamed.getNbIndices()));
    } else {
      _xifexpression_1 = setRenamed;
    }
    final ISLSet setGisted = _xifexpression_1;
    final List<String> bsets = AlphaPrintingUtil.collectBasicSets(setGisted);
    List<String> _indexNames = setGisted.getIndexNames();
    String _plus = ("{" + _indexNames);
    String _plus_1 = (_plus + ":");
    String _join = IterableExtensions.join(bsets, " or ");
    String _plus_2 = (_plus_1 + _join);
    final String out = (_plus_2 + "}");
    return out;
  }
  
  public static String toAShowString(final ISLSet set) {
    return AlphaPrintingUtil.toAShowString(set, null);
  }
  
  public static String toAShowString(final ISLSet set, final ISLSet paramDom) {
    return AlphaPrintingUtil.toAShowString(set, paramDom, null);
  }
  
  public static String toAShowString(final ISLSet set, final ISLSet paramDom, final List<String> names) {
    ISLSet _xifexpression = null;
    if ((names != null)) {
      _xifexpression = set.<ISLSet>renameIndices(names);
    } else {
      _xifexpression = set;
    }
    final ISLSet setRenamed = _xifexpression;
    ISLSet _xifexpression_1 = null;
    if (((paramDom != null) && paramDom.isParamSet())) {
      _xifexpression_1 = setRenamed.gist(paramDom.copy().addDims(ISLDimType.isl_dim_set, setRenamed.getNbIndices()));
    } else {
      _xifexpression_1 = setRenamed;
    }
    final ISLSet setGisted = _xifexpression_1;
    final List<String> bsets = AlphaPrintingUtil.collectBasicSets(setGisted);
    String _join = IterableExtensions.join(bsets, " or ");
    String _plus = ("{:" + _join);
    final String out = (_plus + "}");
    return out;
  }
  
  public static List<String> collectBasicSets(final ISLSet set) {
    final Function1<ISLBasicSet, String> _function = (ISLBasicSet c) -> {
      return c.toString().replaceFirst("\\[.*\\]\\s->\\s*\\{", "").replaceAll("\\[[^\\[\\]]*\\]\\s*:\\s*", "").replaceFirst("\\}", "");
    };
    return ListExtensions.<ISLBasicSet, String>map(set.getBasicSets(), _function);
  }
  
  public static List<List<String>> collectConstraints(final ISLSet set) {
    final Function1<ISLBasicSet, List<String>> _function = (ISLBasicSet it) -> {
      return AlphaPrintingUtil.collectConstraints(it);
    };
    return ListExtensions.<ISLBasicSet, List<String>>map(set.getBasicSets(), _function);
  }
  
  public static List<String> collectConstraints(final ISLBasicSet bset) {
    List<String> _xifexpression = null;
    int _nbIndices = bset.getNbIndices();
    boolean _equals = (_nbIndices == 0);
    if (_equals) {
      final Function1<ISLConstraint, String> _function = (ISLConstraint c) -> {
        return c.toString().replaceFirst("\\[.*\\]\\s->\\s*\\{", "").replaceAll("\\s*:\\s*", "").replaceFirst("\\}", "");
      };
      _xifexpression = ListExtensions.<ISLConstraint, String>map(bset.getConstraints(), _function);
    } else {
      final Function1<ISLConstraint, String> _function_1 = (ISLConstraint c) -> {
        return c.toString().replaceFirst("\\[.*\\]\\s->\\s*\\{", "").replaceAll("\\[[^\\[\\]]*\\]\\s*:\\s*", "").replaceFirst("\\}", "");
      };
      _xifexpression = ListExtensions.<ISLConstraint, String>map(bset.getConstraints(), _function_1);
    }
    return _xifexpression;
  }
  
  public static String toShowStringParameterDomain(final ISLSet set) {
    return set.toString();
  }
  
  public static String toShowStringSystemBodyDomain(final ISLSet set) {
    return set.toString().replaceFirst("\\[.*\\]\\s->\\s*", "");
  }
  
  /**
   * ISLMap to Alpha string
   */
  public static String toShowString(final ISLMap map) {
    String _join = IterableExtensions.join(AlphaPrintingUtil.collectBasicMaps(map), "; ");
    String _plus = ("{" + _join);
    return (_plus + "}");
  }
  
  public static List<String> collectBasicMaps(final ISLMap map) {
    final Function1<ISLBasicMap, String> _function = (ISLBasicMap c) -> {
      return c.toString().replaceFirst("\\[.*\\]\\s->\\s*\\{", "").replaceFirst("\\}", "");
    };
    return ListExtensions.<ISLBasicMap, String>map(map.getBasicMaps(), _function);
  }
  
  /**
   * ISLPWQPolynomial to Alpha string
   */
  public static String toShowString(final ISLPWQPolynomial poly) {
    return poly.toString().replaceFirst("\\[.*\\]\\s*->\\s*\\{", "{");
  }
  
  public static String toAShowString(final ISLPWQPolynomial poly, final List<String> context) {
    return AlphaPrintingUtil.toAShowString(AlphaUtil.renameIndices(poly, context));
  }
  
  private static String toAShowString(final ISLPWQPolynomial poly) {
    return poly.toString().replaceFirst("\\[.*\\]\\s->\\s*\\{", "{").replaceAll("\\[.*\\]\\s*->\\s*", "");
  }
  
  /**
   * ISLQPolynomial to Alpha string
   */
  public static String toShowString(final ISLQPolynomial poly) {
    return poly.toString().replaceFirst("\\[.*\\]\\s*->\\s*\\{", "{");
  }
  
  public static String toAShowString(final ISLQPolynomial poly, final List<String> context) {
    return AlphaPrintingUtil.toAShowString(AlphaUtil.renameIndices(poly, context));
  }
  
  private static String toAShowString(final ISLQPolynomial poly) {
    return poly.toString().replaceFirst("\\[.*\\]\\s->\\s*\\{", "{").replaceAll("\\[.*\\]\\s*->\\s*", "");
  }
  
  /**
   * Legacy Alpha Syntax
   */
  public static String toLegacyAlphaString(final ISLSet set) {
    return AlphaPrintingUtil.toLegacyAlphaString(set, null);
  }
  
  public static String toLegacyAlphaString(final ISLSet set, final ISLSet paramDom) {
    return AlphaPrintingUtil.toLegacyAlphaString(set, paramDom, null);
  }
  
  public static String toLegacyAlphaString(final ISLSet set, final ISLSet paramDom, final List<String> names) {
    String _xblockexpression = null;
    {
      int _nbIndices = set.getNbIndices();
      boolean _equals = (_nbIndices == 0);
      if (_equals) {
        return "{|}";
      }
      ISLSet _xifexpression = null;
      if ((names != null)) {
        _xifexpression = set.<ISLSet>renameIndices(names);
      } else {
        _xifexpression = set;
      }
      final ISLSet setRenamed = _xifexpression;
      ISLSet _xifexpression_1 = null;
      if (((paramDom != null) && paramDom.isParamSet())) {
        _xifexpression_1 = setRenamed.gist(paramDom.copy().addDims(ISLDimType.isl_dim_set, setRenamed.getNbIndices()));
      } else {
        _xifexpression_1 = setRenamed;
      }
      final ISLSet setGisted = _xifexpression_1;
      final Function1<ISLBasicSet, CharSequence> _function = (ISLBasicSet bs) -> {
        return AlphaPrintingUtil.toLegacyAlphaString(bs);
      };
      _xblockexpression = IterableExtensions.<ISLBasicSet>join(setGisted.getBasicSets(), "||", _function);
    }
    return _xblockexpression;
  }
  
  private static String toLegacyAlphaString(final ISLBasicSet bset) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{ ");
    String _join = IterableExtensions.join(bset.getIndexNames(), ",");
    _builder.append(_join);
    _builder.append(" | ");
    final Function1<String, String> _function = (String s) -> {
      return s.replace(" = ", " == ");
    };
    String _join_1 = IterableExtensions.join(ListExtensions.<String, String>map(AlphaPrintingUtil.collectConstraints(bset), _function), " && ");
    _builder.append(_join_1);
    _builder.append(" }");
    return _builder.toString();
  }
  
  public static String toLegacyAlphaStringParameterDomain(final ISLSet set) {
    String _xblockexpression = null;
    {
      int _nbBasicSets = set.getNbBasicSets();
      boolean _notEquals = (_nbBasicSets != 1);
      if (_notEquals) {
        throw new RuntimeException("Parameter domain is assumed to be a single polyhedron.");
      }
      final String paramNames = IterableExtensions.join(set.getParamNames(), ",");
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("{ ");
      _builder.append(paramNames);
      _builder.append(" | ");
      final Function1<String, String> _function = (String s) -> {
        return s.replace(" = ", " == ");
      };
      String _join = IterableExtensions.join(ListExtensions.<String, String>map(AlphaPrintingUtil.collectConstraints(set.getBasicSets().get(0)), _function), " && ");
      _builder.append(_join);
      _builder.append(" }");
      _xblockexpression = _builder.toString();
    }
    return _xblockexpression;
  }
}
