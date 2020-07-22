package alpha.targetmapping.util;

import alpha.model.AlphaSystem;
import alpha.model.SystemBody;
import alpha.targetmapping.TargetMapping;
import alpha.targetmapping.TargetMappingForSystemBody;
import alpha.targetmapping.TargetMappingNode;
import fr.irisa.cairn.jnimap.isl.ISLASTLoopType;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public class TargetMappingUtil {
  public static TargetMapping getContainerTM(final TargetMappingNode node) {
    if ((node instanceof TargetMapping)) {
      return ((TargetMapping) node);
    }
    EObject _eContainer = node.eContainer();
    boolean _tripleEquals = (_eContainer == null);
    if (_tripleEquals) {
      return null;
    }
    EObject _eContainer_1 = node.eContainer();
    return TargetMappingUtil.getContainerTM(((TargetMappingNode) _eContainer_1));
  }
  
  public static TargetMappingForSystemBody getContainerTMforSystemBody(final TargetMappingNode node) {
    if ((node instanceof TargetMappingForSystemBody)) {
      return ((TargetMappingForSystemBody) node);
    }
    EObject _eContainer = node.eContainer();
    boolean _tripleEquals = (_eContainer == null);
    if (_tripleEquals) {
      return null;
    }
    EObject _eContainer_1 = node.eContainer();
    return TargetMappingUtil.getContainerTMforSystemBody(((TargetMappingNode) _eContainer_1));
  }
  
  public static AlphaSystem getTargetSystem(final TargetMappingNode node) {
    final TargetMapping tm = TargetMappingUtil.getContainerTM(node);
    if ((tm == null)) {
      return null;
    }
    return tm.getTargetSystem();
  }
  
  public static SystemBody getTargetSystemBody(final TargetMappingNode node) {
    final TargetMappingForSystemBody tm = TargetMappingUtil.getContainerTMforSystemBody(node);
    if ((tm == null)) {
      return null;
    }
    return tm.getTargetBody();
  }
  
  public static String toString(final ISLASTLoopType value) {
    int _value = value.getValue();
    switch (_value) {
      case ISLASTLoopType.ISL_AST_LOOP_DEFAULT:
        return "default";
      case ISLASTLoopType.ISL_AST_LOOP_ATOMIC:
        return "atomic";
      case ISLASTLoopType.ISL_AST_LOOP_UNROLL:
        return "unroll";
      case ISLASTLoopType.ISL_AST_LOOP_SEPARATE:
        return "separate";
      default:
        throw new IllegalArgumentException();
    }
  }
}
