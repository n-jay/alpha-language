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
import alpha.model.issue.AlphaIssueFactory;
import alpha.model.issue.CalculatorExpressionIssue;
import alpha.model.util.AlphaUtil;
import fr.irisa.cairn.jnimap.isl.ISLDimType;
import fr.irisa.cairn.jnimap.isl.ISLFactory;
import fr.irisa.cairn.jnimap.isl.ISLMap;
import fr.irisa.cairn.jnimap.isl.ISLSet;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;

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
    try {
      final ISLSet pdom = AlphaUtil.getParameterDomain(ff);
      AlphaSystem _containerSystem = AlphaUtil.getContainerSystem(ff);
      String _alphaString = ff.getAlphaString();
      String _plus = ("{" + _alphaString);
      String _plus_1 = (_plus + "}");
      ISLMap jnimap = ISLFactory.islMap(AlphaUtil.toContextFreeISLString(_containerSystem, _plus_1));
      jnimap = jnimap.intersectParams(pdom.copy());
      ff.setFuzzyMap(jnimap);
      boolean _domainIsWrapping = ff.getFuzzyMap().domainIsWrapping();
      if (_domainIsWrapping) {
        final List<String> newnames = ff.getFuzzyMap().getDomain().unwrap().getDomain().getIndexNames();
        this.contextHistory.push(this.indexNameContext);
        this.indexNameContext = newnames;
      } else {
        this.contextHistory.push(this.indexNameContext);
        this.indexNameContext = null;
      }
    } catch (final Throwable _t) {
      if (_t instanceof RuntimeException) {
        final RuntimeException re = (RuntimeException)_t;
        String _xifexpression = null;
        String _message = re.getMessage();
        boolean _tripleEquals = (_message == null);
        if (_tripleEquals) {
          _xifexpression = re.getClass().getName();
        } else {
          _xifexpression = re.getMessage();
        }
        final String msg = _xifexpression;
        this.registerIssue(msg, ff);
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
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
    ISLMap _fuzzyMap = ff.getFuzzyMap();
    boolean _tripleEquals = (_fuzzyMap == null);
    if (_tripleEquals) {
      return;
    }
    boolean _domainIsWrapping = ff.getFuzzyMap().domainIsWrapping();
    boolean _not = (!_domainIsWrapping);
    if (_not) {
      this.issues.add(AlphaIssueFactory.unwrappedFuzzyFunction(ff));
      return;
    }
    final ISLMap fvIntroMap = ff.getFuzzyMap().getDomain().unwrap();
    final int nDdim = fvIntroMap.getNbInputs();
    final List<String> ranNames = fvIntroMap.getRange().getIndexNames();
    ISLMap depRel = ((ISLMap) null);
    for (final String ranName : ranNames) {
      {
        final FuzzyVariableUse fvu = ff.getIndirectionByName(ranName);
        if ((fvu == null)) {
          return;
        }
        if ((depRel == null)) {
          depRel = fvu.getDependenceRelation();
        } else {
          depRel = depRel.rangeProduct(fvu.getDependenceRelation()).flattenRange();
        }
      }
    }
    ff.setDependenceRelation(ff.getFuzzyMap().intersectDomain(depRel.wrap()).flatten().projectOut(ISLDimType.isl_dim_in, nDdim, ((Object[])Conversions.unwrapArray(ranNames, Object.class)).length));
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
    this.computeBaseMap(afvu);
  }
  
  private void computeBaseMap(final AlphaNode afvu) {
    if (afvu instanceof AffineFuzzyVariableUse) {
      _computeBaseMap((AffineFuzzyVariableUse)afvu);
      return;
    } else if (afvu instanceof FuzzyFunctionInArrayNotation) {
      _computeBaseMap((FuzzyFunctionInArrayNotation)afvu);
      return;
    } else if (afvu instanceof FuzzyFunction) {
      _computeBaseMap((FuzzyFunction)afvu);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(afvu).toString());
    }
  }
  
  protected void visitFuzzyVariableUse(final FuzzyVariableUse afvu) {
    if (afvu instanceof AffineFuzzyVariableUse) {
      _visitFuzzyVariableUse((AffineFuzzyVariableUse)afvu);
      return;
    } else if (afvu instanceof NestedFuzzyFunction) {
      _visitFuzzyVariableUse((NestedFuzzyFunction)afvu);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(afvu).toString());
    }
  }
}
