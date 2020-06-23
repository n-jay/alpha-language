package alpha.targetmapping.util;

import alpha.model.AlphaSystem;
import alpha.model.SystemBody;
import alpha.targetmapping.TargetMapping;
import alpha.targetmapping.TargetMappingForSystemBody;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public class TargetMappingUtil {
  public static TargetMapping getContainerTM(final EObject node) {
    if ((node instanceof TargetMapping)) {
      return ((TargetMapping) node);
    }
    EObject _eContainer = node.eContainer();
    boolean _tripleEquals = (_eContainer == null);
    if (_tripleEquals) {
      return null;
    }
    return TargetMappingUtil.getContainerTM(node.eContainer());
  }
  
  public static TargetMappingForSystemBody getContainerTMforSystemBody(final EObject node) {
    if ((node instanceof TargetMappingForSystemBody)) {
      return ((TargetMappingForSystemBody) node);
    }
    EObject _eContainer = node.eContainer();
    boolean _tripleEquals = (_eContainer == null);
    if (_tripleEquals) {
      return null;
    }
    return TargetMappingUtil.getContainerTMforSystemBody(node.eContainer());
  }
  
  public static AlphaSystem getTargetSystem(final EObject node) {
    final TargetMapping tm = TargetMappingUtil.getContainerTM(node);
    if ((tm == null)) {
      return null;
    }
    return tm.getTargetSystem();
  }
  
  public static SystemBody getTargetSystemBody(final EObject node) {
    final TargetMappingForSystemBody tm = TargetMappingUtil.getContainerTMforSystemBody(node);
    if ((tm == null)) {
      return null;
    }
    return tm.getTargetBody();
  }
}
