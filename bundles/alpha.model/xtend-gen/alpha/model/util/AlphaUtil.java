package alpha.model.util;

import alpha.model.AlphaConstant;
import alpha.model.AlphaExpression;
import alpha.model.AlphaNode;
import alpha.model.AlphaPackage;
import alpha.model.AlphaRoot;
import alpha.model.AlphaSystem;
import alpha.model.AlphaVisitable;
import com.google.common.collect.Iterables;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLMap;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLMultiAff;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLSet;
import fr.irisa.cairn.jnimap.runtime.JNIObject;
import java.util.Arrays;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public class AlphaUtil {
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
  
  public static JNIObject _copy(final Void n) {
    return null;
  }
  
  public static JNIObject _copy(final JNIISLMap map) {
    return map.copy();
  }
  
  public static JNIObject _copy(final JNIISLSet set) {
    return set.copy();
  }
  
  public static JNIObject _copy(final JNIISLMultiAff maff) {
    return maff.copy();
  }
  
  public static JNIISLSet _getScalarDomain(final AlphaSystem system) {
    return JNIISLSet.buildUniverse(system.getParameterDomain().getIslSet().getSpace());
  }
  
  public static JNIISLSet _getScalarDomain(final AlphaExpression expr) {
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
    } else if (map == null) {
      return _copy((Void)null);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(map).toString());
    }
  }
  
  public static JNIISLSet getScalarDomain(final AlphaNode system) {
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
