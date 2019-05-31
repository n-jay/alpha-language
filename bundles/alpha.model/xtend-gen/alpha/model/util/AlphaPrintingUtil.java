package alpha.model.util;

import alpha.model.util.AlphaUtil;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLAff;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLBasicMap;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLBasicSet;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLConstraint;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLDimType;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLMap;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLMultiAff;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLPWQPolynomial;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLQPolynomial;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLSet;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLSpace;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLVal;
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
  public static String toShowString(final JNIISLMultiAff maff) {
    if ((maff == null)) {
      return null;
    }
    final String lhs = IterableExtensions.join(maff.getDomainSpace().getNameList(JNIISLDimType.isl_dim_set), ",");
    final Function1<JNIISLAff, CharSequence> _function = (JNIISLAff a) -> {
      return AlphaPrintingUtil.toAlphaString(a);
    };
    final String rhs = IterableExtensions.<JNIISLAff>join(maff.getAffs(), ",", _function);
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
  
  public static String toAShowString(final JNIISLMultiAff maff) {
    if ((maff == null)) {
      return null;
    }
    final Function1<JNIISLAff, CharSequence> _function = (JNIISLAff a) -> {
      return AlphaPrintingUtil.toAlphaString(a);
    };
    final String rhs = IterableExtensions.<JNIISLAff>join(maff.getAffs(), ",", _function);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("[");
    _builder.append(rhs);
    _builder.append("]");
    return _builder.toString();
  }
  
  public static String toAShowString(final JNIISLMultiAff maff, final List<String> context) {
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
  public static String toAlphaString(final JNIISLAff aff) {
    String _xblockexpression = null;
    {
      final long commonD = aff.getDenominator();
      final JNIISLVal constant = aff.getConstantVal();
      long _numerator = constant.getNumerator();
      long _multiply = (_numerator * commonD);
      long _denominator = constant.getDenominator();
      final long cstVal = (_multiply / _denominator);
      final LinkedList<String> posList = new LinkedList<String>();
      final LinkedList<String> negList = new LinkedList<String>();
      AlphaPrintingUtil.toAlphaStringHelper(aff, JNIISLDimType.isl_dim_param, commonD, posList, negList);
      AlphaPrintingUtil.toAlphaStringHelper(aff, JNIISLDimType.isl_dim_in, commonD, posList, negList);
      AlphaPrintingUtil.toAlphaStringHelper(aff, JNIISLDimType.isl_dim_div, commonD, posList, negList);
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
  private static void toAlphaStringHelper(final JNIISLAff aff, final JNIISLDimType dimType, final long commonD, final List<String> posList, final List<String> negList) {
    final JNIISLSpace dims = aff.getSpace();
    final int n = dims.getNbDims(dimType);
    final List<String> names = dims.getNameList(dimType);
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, n, true);
    for (final Integer i : _doubleDotLessThan) {
      {
        final JNIISLVal coefficient = aff.getCoefficientVal(dimType, (i).intValue());
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
  public static String toShowString(final JNIISLSet set) {
    return AlphaPrintingUtil.toShowString(set, null);
  }
  
  public static String toShowString(final JNIISLSet set, final JNIISLSet paramDom) {
    return AlphaPrintingUtil.toShowString(set, paramDom, null);
  }
  
  public static String toShowString(final JNIISLSet set, final JNIISLSet paramDom, final List<String> names) {
    int _nbDims = set.getNbDims(JNIISLDimType.isl_dim_set);
    boolean _equals = (_nbDims == 0);
    if (_equals) {
      return "{}";
    }
    JNIISLSet _xifexpression = null;
    if ((names != null)) {
      _xifexpression = AlphaUtil.renameIndices(set, names);
    } else {
      _xifexpression = set;
    }
    final JNIISLSet setRenamed = _xifexpression;
    JNIISLSet _xifexpression_1 = null;
    if (((paramDom != null) && paramDom.isParamSet())) {
      _xifexpression_1 = setRenamed.gist(paramDom.copy().addDims(JNIISLDimType.isl_dim_set, setRenamed.getNbDims()));
    } else {
      _xifexpression_1 = setRenamed;
    }
    final JNIISLSet setGisted = _xifexpression_1;
    final List<String> bsets = AlphaPrintingUtil.collectBasicSets(setGisted);
    List<String> _indicesNames = setGisted.getIndicesNames();
    String _plus = ("{" + _indicesNames);
    String _plus_1 = (_plus + ":");
    String _join = IterableExtensions.join(bsets, " or ");
    String _plus_2 = (_plus_1 + _join);
    final String out = (_plus_2 + "}");
    return out;
  }
  
  public static String toAShowString(final JNIISLSet set) {
    return AlphaPrintingUtil.toAShowString(set, null);
  }
  
  public static String toAShowString(final JNIISLSet set, final JNIISLSet paramDom) {
    return AlphaPrintingUtil.toAShowString(set, paramDom, null);
  }
  
  public static String toAShowString(final JNIISLSet set, final JNIISLSet paramDom, final List<String> names) {
    JNIISLSet _xifexpression = null;
    if ((names != null)) {
      _xifexpression = AlphaUtil.renameIndices(set, names);
    } else {
      _xifexpression = set;
    }
    final JNIISLSet setRenamed = _xifexpression;
    JNIISLSet _xifexpression_1 = null;
    if (((paramDom != null) && paramDom.isParamSet())) {
      _xifexpression_1 = setRenamed.gist(paramDom.copy().addDims(JNIISLDimType.isl_dim_set, setRenamed.getNbDims()));
    } else {
      _xifexpression_1 = setRenamed;
    }
    final JNIISLSet setGisted = _xifexpression_1;
    final List<String> bsets = AlphaPrintingUtil.collectBasicSets(setGisted);
    String _join = IterableExtensions.join(bsets, " or ");
    String _plus = ("{:" + _join);
    final String out = (_plus + "}");
    return out;
  }
  
  public static List<String> collectBasicSets(final JNIISLSet set) {
    final Function1<JNIISLBasicSet, String> _function = (JNIISLBasicSet c) -> {
      return c.toString().replaceFirst("\\[.*\\]\\s->\\s*\\{", "").replaceAll("\\[[^\\[\\]]*\\]\\s*:\\s*", "").replaceFirst("\\}", "");
    };
    return ListExtensions.<JNIISLBasicSet, String>map(set.getBasicSets(), _function);
  }
  
  public static List<List<String>> collectConstraints(final JNIISLSet set) {
    final Function1<JNIISLBasicSet, List<String>> _function = (JNIISLBasicSet it) -> {
      return AlphaPrintingUtil.collectConstraints(it);
    };
    return ListExtensions.<JNIISLBasicSet, List<String>>map(set.getBasicSets(), _function);
  }
  
  public static List<String> collectConstraints(final JNIISLBasicSet bset) {
    List<String> _xifexpression = null;
    int _nbDims = bset.getNbDims(JNIISLDimType.isl_dim_set);
    boolean _equals = (_nbDims == 0);
    if (_equals) {
      final Function1<JNIISLConstraint, String> _function = (JNIISLConstraint c) -> {
        return c.toString().replaceFirst("\\[.*\\]\\s->\\s*\\{", "").replaceAll("\\s*:\\s*", "").replaceFirst("\\}", "");
      };
      _xifexpression = ListExtensions.<JNIISLConstraint, String>map(bset.getConstraints(), _function);
    } else {
      final Function1<JNIISLConstraint, String> _function_1 = (JNIISLConstraint c) -> {
        return c.toString().replaceFirst("\\[.*\\]\\s->\\s*\\{", "").replaceAll("\\[[^\\[\\]]*\\]\\s*:\\s*", "").replaceFirst("\\}", "");
      };
      _xifexpression = ListExtensions.<JNIISLConstraint, String>map(bset.getConstraints(), _function_1);
    }
    return _xifexpression;
  }
  
  public static String toShowStringParameterDomain(final JNIISLSet set) {
    return set.toString();
  }
  
  public static String toShowStringSystemBodyDomain(final JNIISLSet set) {
    return set.toString().replaceFirst("\\[.*\\]\\s->\\s*", "");
  }
  
  /**
   * ISLMap to Alpha string
   */
  public static String toShowString(final JNIISLMap map) {
    String _join = IterableExtensions.join(AlphaPrintingUtil.collectBasicMaps(map), "; ");
    String _plus = ("{" + _join);
    return (_plus + "}");
  }
  
  public static List<String> collectBasicMaps(final JNIISLMap map) {
    final Function1<JNIISLBasicMap, String> _function = (JNIISLBasicMap c) -> {
      return c.toString().replaceFirst("\\[.*\\]\\s->\\s*\\{", "").replaceFirst("\\}", "");
    };
    return ListExtensions.<JNIISLBasicMap, String>map(map.getBasicMaps(), _function);
  }
  
  /**
   * ISLPWQPolynomial to Alpha string
   */
  public static String toShowString(final JNIISLPWQPolynomial poly) {
    return poly.toString().replaceFirst("\\[.*\\]\\s*->\\s*\\{", "{");
  }
  
  public static String toAShowString(final JNIISLPWQPolynomial poly, final List<String> context) {
    return AlphaPrintingUtil.toAShowString(AlphaUtil.renameIndices(poly, context));
  }
  
  private static String toAShowString(final JNIISLPWQPolynomial poly) {
    return poly.toString().replaceFirst("\\[.*\\]\\s->\\s*\\{", "{").replaceAll("\\[.*\\]\\s*->\\s*", "");
  }
  
  /**
   * ISLQPolynomial to Alpha string
   */
  public static String toShowString(final JNIISLQPolynomial poly) {
    return poly.toString().replaceFirst("\\[.*\\]\\s*->\\s*\\{", "{");
  }
  
  public static String toAShowString(final JNIISLQPolynomial poly, final List<String> context) {
    return AlphaPrintingUtil.toAShowString(AlphaUtil.renameIndices(poly, context));
  }
  
  private static String toAShowString(final JNIISLQPolynomial poly) {
    return poly.toString().replaceFirst("\\[.*\\]\\s->\\s*\\{", "{").replaceAll("\\[.*\\]\\s*->\\s*", "");
  }
  
  /**
   * Legacy Alpha Syntax
   */
  public static String toLegacyAlphaString(final JNIISLSet set) {
    return AlphaPrintingUtil.toLegacyAlphaString(set, null);
  }
  
  public static String toLegacyAlphaString(final JNIISLSet set, final JNIISLSet paramDom) {
    return AlphaPrintingUtil.toLegacyAlphaString(set, paramDom, null);
  }
  
  public static String toLegacyAlphaString(final JNIISLSet set, final JNIISLSet paramDom, final List<String> names) {
    String _xblockexpression = null;
    {
      int _nbDims = set.getNbDims(JNIISLDimType.isl_dim_set);
      boolean _equals = (_nbDims == 0);
      if (_equals) {
        return "{|}";
      }
      JNIISLSet _xifexpression = null;
      if ((names != null)) {
        _xifexpression = AlphaUtil.renameIndices(set, names);
      } else {
        _xifexpression = set;
      }
      final JNIISLSet setRenamed = _xifexpression;
      JNIISLSet _xifexpression_1 = null;
      if (((paramDom != null) && paramDom.isParamSet())) {
        _xifexpression_1 = setRenamed.gist(paramDom.copy().addDims(JNIISLDimType.isl_dim_set, setRenamed.getNbDims()));
      } else {
        _xifexpression_1 = setRenamed;
      }
      final JNIISLSet setGisted = _xifexpression_1;
      final Function1<JNIISLBasicSet, CharSequence> _function = (JNIISLBasicSet bs) -> {
        return AlphaPrintingUtil.toLegacyAlphaString(bs);
      };
      _xblockexpression = IterableExtensions.<JNIISLBasicSet>join(setGisted.getBasicSets(), "||", _function);
    }
    return _xblockexpression;
  }
  
  private static String toLegacyAlphaString(final JNIISLBasicSet bset) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{ ");
    String _join = IterableExtensions.join(bset.getIndicesNames(), ",");
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
  
  public static String toLegacyAlphaStringParameterDomain(final JNIISLSet set) {
    String _xblockexpression = null;
    {
      int _nbBasicSets = set.getNbBasicSets();
      boolean _notEquals = (_nbBasicSets != 1);
      if (_notEquals) {
        throw new RuntimeException("Parameter domain is assumed to be a single polyhedron.");
      }
      final String paramNames = IterableExtensions.join(set.getParametersNames(), ",");
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
