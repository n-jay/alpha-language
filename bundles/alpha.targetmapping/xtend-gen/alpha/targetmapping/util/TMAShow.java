package alpha.targetmapping.util;

import alpha.targetmapping.TargetMappingNode;
import alpha.targetmapping.util.TMShow;
import alpha.targetmapping.util.TargetMappingUtil;

@SuppressWarnings("all")
public class TMAShow extends TMShow {
  public static <T extends TargetMappingNode> String print(final T tmn) {
    String _xblockexpression = null;
    {
      final TMAShow ashow = new TMAShow();
      ashow.parameterContext = TargetMappingUtil.getTargetSystem(tmn).getParameterDomain();
      _xblockexpression = ashow.doSwitch(tmn).toString();
    }
    return _xblockexpression;
  }
}
