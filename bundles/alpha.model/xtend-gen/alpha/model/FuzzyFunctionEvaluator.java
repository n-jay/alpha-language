package alpha.model;

import alpha.model.AffineFuzzyVariableUse;
import alpha.model.AlphaNode;
import alpha.model.AlphaSystem;
import alpha.model.CalculatorExpressionEvaluator;
import alpha.model.FuzzyFunction;
import alpha.model.FuzzyFunctionInArrayNotation;
import alpha.model.FuzzyVariableUse;
import alpha.model.NestedFuzzyFunction;
import alpha.model.issue.AlphaIssue;
import alpha.model.issue.CalculatorExpressionIssue;
import alpha.model.util.AlphaUtil;
import fr.irisa.cairn.jnimap.isl.jni.ISLFactory;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLMap;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLSet;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * This class computes the ISL representation for {@link FuzzyFunction}s.
 * FuzzyFunctions are not part of the calculator expression, but have a similar structure to them.
 */
@SuppressWarnings("all")
public class FuzzyFunctionEvaluator {
  private List<AlphaIssue> issues = new LinkedList<AlphaIssue>();
  
  private Stack<List<String>> contextHistory = new Stack<List<String>>();
  
  private List<String> indexNameContext;
  
  protected FuzzyFunctionEvaluator(final List<String> indexNameContext) {
    this.indexNameContext = indexNameContext;
  }
  
  public static List<AlphaIssue> calculate(final FuzzyFunction ff) {
    return FuzzyFunctionEvaluator.calculate(ff, null);
  }
  
  public static List<AlphaIssue> calculate(final FuzzyFunction ff, final List<String> indexNameContext) {
    final FuzzyFunctionEvaluator calc = new FuzzyFunctionEvaluator(indexNameContext);
    calc.visitFuzzyFunction(ff);
    return calc.issues;
  }
  
  private boolean registerIssue(final String msg, final AlphaNode node) {
    EObject _eContainer = node.eContainer();
    EStructuralFeature _eContainingFeature = node.eContainingFeature();
    CalculatorExpressionIssue _calculatorExpressionIssue = new CalculatorExpressionIssue(AlphaIssue.TYPE.ERROR, msg, _eContainer, _eContainingFeature);
    return this.issues.add(_calculatorExpressionIssue);
  }
  
  /**
   * Computes the ISL representation of the textual representation.
   * This is done top-down, since the computed map gives the context
   * for AffineFuzzyVariableUse in its children.
   */
  private void _computeBaseMap(final FuzzyFunction ff) {
    final JNIISLSet pdom = AlphaUtil.getParameterDomain(ff);
    AlphaSystem _containerSystem = AlphaUtil.getContainerSystem(ff);
    String _alphaString = ff.getAlphaString();
    String _plus = ("{" + _alphaString);
    String _plus_1 = (_plus + "}");
    JNIISLMap jnimap = ISLFactory.islMap(AlphaUtil.toContextFreeISLString(_containerSystem, _plus_1));
    jnimap = jnimap.intersectParams(pdom.copy());
    ff.setFuzzyMap(jnimap);
    boolean _domainIsWrapping = ff.getFuzzyMap().domainIsWrapping();
    if (_domainIsWrapping) {
      final List<String> newnames = ff.getFuzzyMap().getDomain().unwrap().getDomainNames();
      this.contextHistory.push(this.indexNameContext);
      this.indexNameContext = newnames;
    } else {
      this.contextHistory.push(this.indexNameContext);
      this.indexNameContext = null;
    }
  }
  
  private void _computeBaseMap(final FuzzyFunctionInArrayNotation ff) {
    this.contextHistory.push(this.indexNameContext);
    this.indexNameContext = null;
  }
  
  private void _computeBaseMap(final AffineFuzzyVariableUse afvu) {
    this.issues.addAll(CalculatorExpressionEvaluator.calculate(afvu.getUseFunction(), this.indexNameContext));
  }
  
  /**
   * Computes the dependence relation, which is the set of values
   * that a FuzzyFunction may use. This is computed by first adding the constraints
   * on the fuzzy variables, and then projecting them out.
   */
  private void computeDependenceRelation(final FuzzyFunction ff) {
    this.indexNameContext = this.contextHistory.pop();
  }
  
  /**
   * Simple visitor to calculate bottom-up.
   */
  protected void visitFuzzyFunction(final FuzzyFunction ff) {
    this.computeBaseMap(ff);
    EList<FuzzyVariableUse> _indirections = ff.getIndirections();
    for (final FuzzyVariableUse indirection : _indirections) {
      this.visitFuzzyVariableUse(indirection);
    }
    this.computeDependenceRelation(ff);
  }
  
  protected void _visitFuzzyVariableUse(final NestedFuzzyFunction nff) {
    this.visitFuzzyFunction(nff);
  }
  
  protected void _visitFuzzyVariableUse(final AffineFuzzyVariableUse afvu) {
  }
  
  private void computeBaseMap(final EObject ff) {
    if (ff instanceof FuzzyFunctionInArrayNotation) {
      _computeBaseMap((FuzzyFunctionInArrayNotation)ff);
      return;
    } else if (ff instanceof AffineFuzzyVariableUse) {
      _computeBaseMap((AffineFuzzyVariableUse)ff);
      return;
    } else if (ff instanceof FuzzyFunction) {
      _computeBaseMap((FuzzyFunction)ff);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(ff).toString());
    }
  }
  
  protected void visitFuzzyVariableUse(final FuzzyVariableUse nff) {
    if (nff instanceof NestedFuzzyFunction) {
      _visitFuzzyVariableUse((NestedFuzzyFunction)nff);
      return;
    } else if (nff instanceof AffineFuzzyVariableUse) {
      _visitFuzzyVariableUse((AffineFuzzyVariableUse)nff);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(nff).toString());
    }
  }
}
