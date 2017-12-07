package alpha.model.util;

import alpha.model.AlphaConstant;
import alpha.model.AlphaPackage;
import alpha.model.AlphaRoot;
import alpha.model.AlphaSystem;
import alpha.model.AlphaVisitable;
import com.google.common.collect.Iterables;
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
}
