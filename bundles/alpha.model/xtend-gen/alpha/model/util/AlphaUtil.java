package alpha.model.util;

import alpha.model.AlphaCompleteVisitable;
import alpha.model.AlphaConstant;
import alpha.model.AlphaExpression;
import alpha.model.AlphaNode;
import alpha.model.AlphaPackage;
import alpha.model.AlphaRoot;
import alpha.model.AlphaSystem;
import alpha.model.AlphaVisitable;
import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import fr.irisa.cairn.jnimap.isl.jni.ISLErrorException;
import fr.irisa.cairn.jnimap.isl.jni.ISLFactory;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLAff;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLBasicSet;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLConstraint;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLDimType;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLMap;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLMultiAff;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLSet;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLSpace;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLTools;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLUnionMap;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLVal;
import fr.irisa.cairn.jnimap.runtime.JNIObject;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class AlphaUtil {
  public static AlphaRoot getContainerRoot(final EObject node) {
    if ((node instanceof AlphaRoot)) {
      return ((AlphaRoot) node);
    }
    EObject _eContainer = node.eContainer();
    boolean _tripleEquals = (_eContainer == null);
    if (_tripleEquals) {
      return null;
    }
    return AlphaUtil.getContainerRoot(node.eContainer());
  }
  
  public static AlphaSystem getContainerSystem(final EObject node) {
    if ((node instanceof AlphaSystem)) {
      return ((AlphaSystem) node);
    }
    EObject _eContainer = node.eContainer();
    boolean _tripleEquals = (_eContainer == null);
    if (_tripleEquals) {
      return null;
    }
    return AlphaUtil.getContainerSystem(node.eContainer());
  }
  
  public static AlphaRoot selectAlphaRoot(final List<AlphaRoot> roots, final String systemName) {
    boolean _contains = systemName.contains(".");
    if (_contains) {
      final IQualifiedNameProvider provider = new DefaultDeclarativeQualifiedNameProvider();
      final Function1<AlphaRoot, TreeIterator<EObject>> _function = (AlphaRoot r) -> {
        return r.eAllContents();
      };
      final Function1<AlphaSystem, Boolean> _function_1 = (AlphaSystem s) -> {
        return Boolean.valueOf(provider.getFullyQualifiedName(s).toString().contentEquals(systemName));
      };
      final Iterable<AlphaSystem> matching = IterableExtensions.<AlphaSystem>filter(Iterables.<AlphaSystem>filter(ListExtensions.<AlphaRoot, TreeIterator<EObject>>map(roots, _function), AlphaSystem.class), _function_1);
      int _size = IterableExtensions.size(matching);
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        return AlphaUtil.getContainerRoot(IterableExtensions.<AlphaSystem>head(matching));
      }
    } else {
      final Function1<AlphaRoot, Iterator<AlphaSystem>> _function_2 = (AlphaRoot it) -> {
        final Function1<AlphaSystem, Boolean> _function_3 = (AlphaSystem s) -> {
          return Boolean.valueOf(s.getName().contentEquals(systemName));
        };
        return IteratorExtensions.<AlphaSystem>filter(Iterators.<AlphaSystem>filter(it.eAllContents(), AlphaSystem.class), _function_3);
      };
      final Iterator<AlphaSystem> matching_1 = IteratorExtensions.<AlphaRoot, AlphaSystem>flatMap(roots.iterator(), _function_2);
      boolean _hasNext = matching_1.hasNext();
      if (_hasNext) {
        return AlphaUtil.getContainerRoot(matching_1.next());
      }
    }
    throw new RuntimeException((("System " + systemName) + " was not found."));
  }
  
  public static JNIISLSet getParameterDomain(final EObject node) {
    final AlphaSystem system = AlphaUtil.getContainerSystem(node);
    if ((system == null)) {
      throw new RuntimeException("Node is not contained by an AlphaSystem.");
    }
    if (((system.getParameterDomain() == null) || (system.getParameterDomain() == null))) {
      throw new RuntimeException("The parameter domain of the container system is null.");
    }
    return system.getParameterDomain();
  }
  
  /**
   * Replaces all AlphaConstants in the given string with its integer values.
   * It is based on String.replaceAll, so it may fail on some inputs.
   * Currently the model is that the users pick good names for AlphaConstants to avoid this issue
   */
  public static String replaceAlphaConstants(final AlphaSystem system, final String jniString) {
    if (((system != null) && (system.eContainer() != null))) {
      String str = jniString;
      EObject _eContainer = system.eContainer();
      Iterable<AlphaConstant> _gatherAlphaConstants = AlphaUtil.gatherAlphaConstants(((AlphaVisitable) _eContainer));
      for (final AlphaConstant ac : _gatherAlphaConstants) {
        str = str.replaceAll(ac.getName(), Integer.valueOf(ac.getValue()).toString());
      }
      return str;
    }
    return jniString;
  }
  
  private static Iterable<AlphaConstant> _gatherAlphaConstants(final AlphaPackage ap) {
    return Iterables.<AlphaConstant>filter(ap.getElements(), AlphaConstant.class);
  }
  
  private static Iterable<AlphaConstant> _gatherAlphaConstants(final AlphaRoot ar) {
    return Iterables.<AlphaConstant>filter(ar.getElements(), AlphaConstant.class);
  }
  
  protected static JNIObject _copy(final Void n) {
    return null;
  }
  
  protected static JNIObject _copy(final JNIISLMap map) {
    return map.copy();
  }
  
  protected static JNIObject _copy(final JNIISLSet set) {
    return set.copy();
  }
  
  protected static JNIObject _copy(final JNIISLMultiAff maff) {
    return maff.copy();
  }
  
  protected static JNIObject _copy(final JNIISLUnionMap umap) {
    return umap.copy();
  }
  
  /**
   * Method that adds parameter domain names and replaces AlphaConstants with its value.
   * Last step before passing the string to ISL.
   */
  public static String toContextFreeISLString(final AlphaSystem system, final String alphaDom) {
    String _xblockexpression = null;
    {
      final StringBuffer completed = new StringBuffer("[");
      completed.append(String.join(",", system.getParameterDomain().getParametersNames()));
      completed.append("] -> ");
      completed.append(alphaDom);
      _xblockexpression = AlphaUtil.replaceAlphaConstants(system, completed.toString());
    }
    return _xblockexpression;
  }
  
  protected static JNIISLSet _getScalarDomain(final AlphaSystem system) {
    JNIISLSet _xblockexpression = null;
    {
      JNIISLSet jniset = ISLFactory.islSet(AlphaUtil.toContextFreeISLString(system, "{ [] : }"));
      final JNIISLSet pdom = system.getParameterDomain();
      _xblockexpression = jniset.intersectParams(pdom.copy());
    }
    return _xblockexpression;
  }
  
  protected static JNIISLSet _getScalarDomain(final AlphaExpression expr) {
    JNIISLSet _xblockexpression = null;
    {
      AlphaSystem _containerSystem = AlphaUtil.getContainerSystem(expr);
      boolean _tripleEquals = (_containerSystem == null);
      if (_tripleEquals) {
        return null;
      }
      _xblockexpression = AlphaUtil.getScalarDomain(AlphaUtil.getContainerSystem(expr));
    }
    return _xblockexpression;
  }
  
  /**
   * Helper function to obtain the additional indices due to while expressions when parsing polyhedral objects specified in ArrayNotation
   */
  public static List<String> getWhileIndexNames(final AlphaNode node) {
    List<String> _xblockexpression = null;
    {
      final AlphaSystem containerSystem = AlphaUtil.getContainerSystem(node);
      List<String> _xifexpression = null;
      JNIISLSet _whileDomain = containerSystem.getWhileDomain();
      boolean _tripleNotEquals = (_whileDomain != null);
      if (_tripleNotEquals) {
        _xifexpression = containerSystem.getWhileDomain().getIndicesNames();
      } else {
        _xifexpression = new LinkedList<String>();
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public static <T extends Object> T callISLwithErrorHandling(final Supplier<T> r, final Consumer<String> f) {
    return AlphaUtil.<T>callISLwithErrorHandling(r, f, null);
  }
  
  public static <T extends Object> T callISLwithErrorHandling(final Supplier<T> r, final Consumer<String> f, final T defaultValue) {
    try {
      return JNIISLTools.<T>recordError(r);
    } catch (final Throwable _t) {
      if (_t instanceof ISLErrorException) {
        final ISLErrorException e = (ISLErrorException)_t;
        f.accept(e.islErrorMessage);
        return defaultValue;
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  public static void callISLwithErrorHandling(final Runnable r, final Consumer<String> f) {
    try {
      JNIISLTools.recordError(r);
    } catch (final Throwable _t) {
      if (_t instanceof ISLErrorException) {
        final ISLErrorException e = (ISLErrorException)_t;
        f.accept(e.islErrorMessage);
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  /**
   * ISL to Alpha String
   */
  public static String toShowString(final JNIISLMultiAff maff) {
    if ((maff == null)) {
      return null;
    }
    final String lhs = IterableExtensions.join(maff.getDomainSpace().getNameList(JNIISLDimType.isl_dim_set), ",");
    final Function1<JNIISLAff, CharSequence> _function = (JNIISLAff a) -> {
      return AlphaUtil.toAlphaString(a, false);
    };
    final String rhs = IterableExtensions.<JNIISLAff>join(maff.getAffs(), ",", _function);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    _builder.append(lhs);
    _builder.append("->");
    _builder.append(rhs);
    _builder.append(")");
    return _builder.toString();
  }
  
  public static String toAShowString(final JNIISLMultiAff maff) {
    if ((maff == null)) {
      return null;
    }
    final Function1<JNIISLAff, CharSequence> _function = (JNIISLAff a) -> {
      return AlphaUtil.toAlphaString(a, true);
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
    return AlphaUtil.toAShowString(AlphaUtil.renameIndices(maff, context));
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
  public static String toAlphaString(final JNIISLAff aff, final boolean arrayNotation) {
    String _xblockexpression = null;
    {
      long _xifexpression = (long) 0;
      if (arrayNotation) {
        _xifexpression = aff.getDenominator();
      } else {
        _xifexpression = 1;
      }
      final long commonD = _xifexpression;
      final JNIISLVal constant = aff.getConstantVal();
      long _numerator = constant.getNumerator();
      long _multiply = (_numerator * commonD);
      long _denominator = constant.getDenominator();
      final long cstVal = (_multiply / _denominator);
      final LinkedList<String> posList = new LinkedList<String>();
      final LinkedList<String> negList = new LinkedList<String>();
      AlphaUtil.toAlphaStringHelper(aff, JNIISLDimType.isl_dim_param, commonD, posList, negList);
      AlphaUtil.toAlphaStringHelper(aff, JNIISLDimType.isl_dim_in, commonD, posList, negList);
      AlphaUtil.toAlphaStringHelper(aff, JNIISLDimType.isl_dim_div, commonD, posList, negList);
      final String pos = IterableExtensions.join(posList, "+");
      final String neg = IterableExtensions.join(negList, "");
      Object _xifexpression_1 = null;
      if ((cstVal == 0)) {
        _xifexpression_1 = "";
      } else {
        Object _xifexpression_2 = null;
        if ((cstVal > 0)) {
          _xifexpression_2 = ("+" + Long.valueOf(cstVal));
        } else {
          _xifexpression_2 = Long.valueOf(cstVal);
        }
        _xifexpression_1 = ((Object)_xifexpression_2);
      }
      final Object cst = ((Object)_xifexpression_1);
      String _xifexpression_3 = null;
      if ((((((Object[])Conversions.unwrapArray(posList, Object.class)).length + ((Object[])Conversions.unwrapArray(negList, Object.class)).length) == 0) && (cstVal == 0))) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("0");
        _xifexpression_3 = _builder.toString();
      } else {
        String _xifexpression_4 = null;
        if ((commonD != 1)) {
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("(");
          _builder_1.append(pos);
          _builder_1.append(neg);
          _builder_1.append(((Object)cst));
          _builder_1.append(")/");
          _builder_1.append(commonD);
          _xifexpression_4 = _builder_1.toString();
        } else {
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append(pos);
          _builder_2.append(neg);
          _builder_2.append(((Object)cst));
          _xifexpression_4 = _builder_2.toString();
        }
        _xifexpression_3 = _xifexpression_4;
      }
      _xblockexpression = _xifexpression_3;
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
    return AlphaUtil.toShowString(set, null);
  }
  
  public static String toShowString(final JNIISLSet set, final JNIISLSet paramDom) {
    String _xifexpression = null;
    if (((paramDom != null) && paramDom.isParamSet())) {
      _xifexpression = set.gist(paramDom.copy().addDims(JNIISLDimType.isl_dim_set, set.getNbDims())).toString();
    } else {
      _xifexpression = set.toString();
    }
    final String str = _xifexpression;
    final String out = str.replaceFirst("\\[.*\\]\\s->\\s*\\{", "{");
    return out;
  }
  
  public static String toAShowString(final JNIISLSet set) {
    return AlphaUtil.toAShowString(set, null);
  }
  
  public static String toAShowString(final JNIISLSet set, final JNIISLSet paramDom) {
    return AlphaUtil.toAShowString(set, paramDom, null);
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
    final List<List<String>> constraints = AlphaUtil.collectConstraints(setGisted);
    final Function1<List<String>, CharSequence> _function = (List<String> c) -> {
      return IterableExtensions.join(c, " and ");
    };
    String _join = IterableExtensions.<List<String>>join(constraints, " or ", _function);
    String _plus = ("{:" + _join);
    final String out = (_plus + "}");
    return out;
  }
  
  public static List<List<String>> collectConstraints(final JNIISLSet set) {
    final Function1<JNIISLBasicSet, List<String>> _function = (JNIISLBasicSet it) -> {
      return AlphaUtil.collectConstraints(it);
    };
    return ListExtensions.<JNIISLBasicSet, List<String>>map(set.getBasicSets(), _function);
  }
  
  public static List<String> collectConstraints(final JNIISLBasicSet bset) {
    final Function1<JNIISLConstraint, String> _function = (JNIISLConstraint c) -> {
      return c.toString().replaceFirst("\\[.*\\]\\s->\\s*\\{", "").replaceAll("\\[[^\\[\\]]*\\]\\s*:\\s*", "").replaceFirst("\\}", "");
    };
    return ListExtensions.<JNIISLConstraint, String>map(bset.getConstraints(), _function);
  }
  
  public static JNIISLSet renameIndices(final JNIISLSet set, final List<String> names) {
    final int n = set.getNbDims();
    JNIISLSet res = set;
    int _length = ((Object[])Conversions.unwrapArray(names, Object.class)).length;
    boolean _greaterThan = (n > _length);
    if (_greaterThan) {
      throw new RuntimeException("Need n or more index names to rename n-d space.");
    }
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, n, true);
    for (final Integer i : _doubleDotLessThan) {
      res = res.setDimName(JNIISLDimType.isl_dim_set, (i).intValue(), names.get((i).intValue()));
    }
    return res;
  }
  
  public static JNIISLMap renameIndices(final JNIISLMap map, final List<String> names) {
    final int n = map.getNbDims(JNIISLDimType.isl_dim_in);
    JNIISLMap res = map;
    int _length = ((Object[])Conversions.unwrapArray(names, Object.class)).length;
    boolean _greaterThan = (n > _length);
    if (_greaterThan) {
      throw new RuntimeException("Need n or more index names to rename n-d space.");
    }
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, n, true);
    for (final Integer i : _doubleDotLessThan) {
      res = res.setDimName(JNIISLDimType.isl_dim_in, (i).intValue(), names.get((i).intValue()));
    }
    return res;
  }
  
  public static JNIISLMultiAff renameIndices(final JNIISLMultiAff maff, final List<String> names) {
    final int n = maff.getNbDims(JNIISLDimType.isl_dim_in);
    int _length = ((Object[])Conversions.unwrapArray(names, Object.class)).length;
    boolean _greaterThan = (n > _length);
    if (_greaterThan) {
      throw new RuntimeException("Need n or more index names to rename n-d space.");
    }
    JNIISLMultiAff res = maff;
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, n, true);
    for (final Integer i : _doubleDotLessThan) {
      res = res.setDimName(JNIISLDimType.isl_dim_in, (i).intValue(), names.get((i).intValue()));
    }
    return res;
  }
  
  private static Iterable<AlphaConstant> gatherAlphaConstants(final AlphaVisitable ap) {
    if (ap instanceof AlphaPackage) {
      return _gatherAlphaConstants((AlphaPackage)ap);
    } else if (ap instanceof AlphaRoot) {
      return _gatherAlphaConstants((AlphaRoot)ap);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(ap).toString());
    }
  }
  
  public static JNIObject copy(final JNIObject map) {
    if (map instanceof JNIISLMap) {
      return _copy((JNIISLMap)map);
    } else if (map instanceof JNIISLMultiAff) {
      return _copy((JNIISLMultiAff)map);
    } else if (map instanceof JNIISLSet) {
      return _copy((JNIISLSet)map);
    } else if (map instanceof JNIISLUnionMap) {
      return _copy((JNIISLUnionMap)map);
    } else if (map == null) {
      return _copy((Void)null);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(map).toString());
    }
  }
  
  public static JNIISLSet getScalarDomain(final AlphaCompleteVisitable system) {
    if (system instanceof AlphaSystem) {
      return _getScalarDomain((AlphaSystem)system);
    } else if (system instanceof AlphaExpression) {
      return _getScalarDomain((AlphaExpression)system);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(system).toString());
    }
  }
}
