package alpha.codegen.writeC;

import alpha.codegen.NameChecker;
import alpha.model.Variable;
import java.util.HashMap;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

/**
 * A name checker specifically for WriteC programs.
 */
@SuppressWarnings("all")
public class WriteCNameChecker extends NameChecker {
  /**
   * A mapping to the name of each variable's flag name.
   */
  protected final HashMap<String, String> flagNames = CollectionLiterals.<String, String>newHashMap();

  /**
   * Gets the flag name for the given variable.
   * If one doesn't exist yet, a new one is created.
   */
  public String getFlagName(final Variable variable) {
    return this.getFlagName(variable.getName());
  }

  /**
   * Gets the flag name for the given variable.
   * If one doesn't exist yet, a new one is created.
   */
  public String getFlagName(final String variableName) {
    boolean _containsKey = this.flagNames.containsKey(variableName);
    if (_containsKey) {
      return this.flagNames.get(variableName);
    }
    final String flagName = this.getUniqueGlobalName(("_flag_" + variableName), "_");
    this.flagNames.put(variableName, flagName);
    return flagName;
  }
}
