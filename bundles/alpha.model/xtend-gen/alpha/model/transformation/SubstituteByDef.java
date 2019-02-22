package alpha.model.transformation;

import alpha.model.AlphaSystem;
import alpha.model.Variable;
import alpha.model.util.AbstractAlphaCompleteVisitor;

@SuppressWarnings("all")
public class SubstituteByDef extends AbstractAlphaCompleteVisitor {
  protected Variable targetVariable;
  
  protected Variable substituteVariable;
  
  private SubstituteByDef(final AlphaSystem system, final Variable targetVariable, final Variable substituteVariable) {
    this.targetVariable = targetVariable;
    this.substituteVariable = substituteVariable;
  }
  
  public static void apply(final AlphaSystem system, final String varName, final String varToSubstitute) {
  }
}
