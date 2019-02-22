package alpha.model.transformation;

import alpha.model.AlphaSystem;
import alpha.model.StandardEquation;
import alpha.model.util.AbstractAlphaCompleteVisitor;

@SuppressWarnings("all")
public class SubstituteByDef extends AbstractAlphaCompleteVisitor {
  protected StandardEquation transformedEquation;
  
  protected StandardEquation substitutedEquation;
  
  private SubstituteByDef(final AlphaSystem system, final StandardEquation transformedEquation, final StandardEquation substitutedEquation) {
    this.transformedEquation = transformedEquation;
    this.substitutedEquation = substitutedEquation;
  }
  
  public static void apply(final AlphaSystem system, final String varName, final String varToSubstitute) {
  }
}
