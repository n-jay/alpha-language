package alpha.model.util;

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("all")
public class CommonExtensions {
  /**
   * Wraps a map into a hash map so its values are only computed once.
   * Intended for use with Xtend's iterable/map extensions, which can recompute values
   * each time they're accessed due to lazy evaluation.
   */
  public static <K extends Object, V extends Object> HashMap<K, V> toHashMap(final Map<K, V> map) {
    return new HashMap<K, V>(map);
  }
}
