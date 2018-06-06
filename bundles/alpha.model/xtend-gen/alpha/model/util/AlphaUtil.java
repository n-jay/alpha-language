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
import fr.irisa.cairn.jnimap.isl.jni.JNIISLDimType;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLMap;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLMultiAff;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLSet;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLTools;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLUnionMap;
import fr.irisa.cairn.jnimap.runtime.JNIObject;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
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
  
  public static Iterable<AlphaConstant> getAlphaConstants(final AlphaSystem system) {
    if (((system != null) && (system.eContainer() != null))) {
      EObject _eContainer = system.eContainer();
      return AlphaUtil.gatherAlphaConstants(((AlphaVisitable) _eContainer));
    }
    return null;
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
