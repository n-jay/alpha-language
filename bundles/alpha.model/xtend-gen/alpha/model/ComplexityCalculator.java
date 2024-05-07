package alpha.model;

import alpha.model.util.AbstractAlphaCompleteVisitor;
import alpha.model.util.ISLUtil;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class ComplexityCalculator extends AbstractAlphaCompleteVisitor {
  private int maxComplexity;

  public static int complexity(final AlphaVisitable av) {
    final ComplexityCalculator visitor = new ComplexityCalculator();
    visitor.accept(av);
    return visitor.maxComplexity;
  }

  public int updateComplexity(final int c) {
    int _xifexpression = (int) 0;
    if ((c > this.maxComplexity)) {
      _xifexpression = this.maxComplexity = c;
    }
    return _xifexpression;
  }

  @Override
  public void outStandardEquation(final StandardEquation eq) {
    this.updateComplexity(ISLUtil.dimensionality(eq.getVariable().getDomain()));
  }

  @Override
  public void outUseEquation(final UseEquation eq) {
    try {
      throw new Exception("Complexity calculation of UseEquations not yet implemented");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  @Override
  public void outReduceExpression(final ReduceExpression re) {
    this.updateComplexity(ISLUtil.dimensionality(re.getBody().getContextDomain()));
  }
}
