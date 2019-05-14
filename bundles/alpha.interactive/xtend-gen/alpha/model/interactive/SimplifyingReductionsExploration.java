package alpha.model.interactive;

import alpha.model.AbstractReduceExpression;
import alpha.model.AlphaExpression;
import alpha.model.AutoRestrictExpression;
import alpha.model.CaseExpression;
import alpha.model.Equation;
import alpha.model.ReduceExpression;
import alpha.model.RestrictExpression;
import alpha.model.StandardEquation;
import alpha.model.SystemBody;
import alpha.model.UseEquation;
import alpha.model.analysis.reduction.ShareSpaceAnalysis;
import alpha.model.analysis.reduction.ShareSpaceAnalysisResult;
import alpha.model.interactive.AbstractInteractiveExploration;
import alpha.model.matrix.MatrixOperations;
import alpha.model.transformation.Normalize;
import alpha.model.transformation.SplitUnionIntoCase;
import alpha.model.transformation.reduction.Distributivity;
import alpha.model.transformation.reduction.HigherOrderOperator;
import alpha.model.transformation.reduction.Idempotence;
import alpha.model.transformation.reduction.NormalizeReduction;
import alpha.model.transformation.reduction.PermutationCaseReduce;
import alpha.model.transformation.reduction.ReductionDecomposition;
import alpha.model.transformation.reduction.SameOperatorSimplification;
import alpha.model.transformation.reduction.SimplifyingReductions;
import alpha.model.util.AShow;
import alpha.model.util.AffineFunctionOperations;
import alpha.model.util.AlphaUtil;
import com.google.common.base.Objects;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLMultiAff;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;

@SuppressWarnings("all")
public class SimplifyingReductionsExploration extends AbstractInteractiveExploration {
  private enum STATE {
    INITIAL,
    
    REDUCTION_SELECTED,
    
    SIDE_EFFECT_FREE_TRANSFORMATIONS,
    
    DP_STEP_TRANSFORMATIONS,
    
    EXIT;
  }
  
  private static abstract class DPStepOption {
    public abstract String description();
  }
  
  private static class DPStepSimplifyingReduction extends SimplifyingReductionsExploration.DPStepOption {
    private long[] reuseDepNoParams;
    
    public DPStepSimplifyingReduction(final long[] reuseDep, final int nbParams) {
      ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, nbParams, true);
      this.reuseDepNoParams = MatrixOperations.removeColumns(reuseDep, ((int[])Conversions.unwrapArray(_doubleDotLessThan, int.class)));
    }
    
    @Override
    public String description() {
      return String.format("Apply SimplifyingReduction with: %s", MatrixOperations.toString(this.reuseDepNoParams));
    }
  }
  
  private static class DPStepIdempotence extends SimplifyingReductionsExploration.DPStepOption {
    @Override
    public String description() {
      return String.format("Apply Idempotence");
    }
  }
  
  private static class DPStepHigherOrderOperator extends SimplifyingReductionsExploration.DPStepOption {
    @Override
    public String description() {
      return String.format("Apply HigherOrderOperator");
    }
  }
  
  private static class DPStepReductionDecomposition extends SimplifyingReductionsExploration.DPStepOption {
    private JNIISLMultiAff innerProjection;
    
    private JNIISLMultiAff outerProjection;
    
    public DPStepReductionDecomposition(final JNIISLMultiAff innerF, final JNIISLMultiAff outerF) {
      this.innerProjection = innerF;
      this.outerProjection = outerF;
    }
    
    @Override
    public String description() {
      return String.format("Apply ReductionDecomposition with %s o %s", this.outerProjection, this.innerProjection);
    }
  }
  
  private static class DPStepBacktrack extends SimplifyingReductionsExploration.DPStepOption {
    @Override
    public String description() {
      return String.format("Revert to previous state.");
    }
  }
  
  private static class DPStepFinish extends SimplifyingReductionsExploration.DPStepOption {
    @Override
    public String description() {
      return String.format("Finish exploration.");
    }
  }
  
  private static class DPStepPrintShareSpace extends SimplifyingReductionsExploration.DPStepOption {
    private ShareSpaceAnalysisResult SSAR;
    
    public DPStepPrintShareSpace(final ShareSpaceAnalysisResult SSAR) {
      this.SSAR = SSAR;
    }
    
    @Override
    public String description() {
      return String.format("Print Share Space");
    }
  }
  
  protected SimplifyingReductionsExploration.STATE state = SimplifyingReductionsExploration.STATE.INITIAL;
  
  protected AbstractReduceExpression targetRE;
  
  protected List<String> commandHistory;
  
  private SimplifyingReductionsExploration(final String filepath) {
    super(filepath);
  }
  
  public static final void start(final String filepath) {
    final SimplifyingReductionsExploration sre = new SimplifyingReductionsExploration(filepath);
    AbstractInteractiveExploration.SKIP_SINGLE_CHOICE_QUESTIONS = true;
    sre.run();
  }
  
  @Override
  public void mainLoop() {
    AbstractInteractiveExploration.SKIP_SINGLE_CHOICE_QUESTIONS = false;
    while ((!Objects.equal(this.state, SimplifyingReductionsExploration.STATE.EXIT))) {
      try {
        LinkedList<String> _linkedList = new LinkedList<String>();
        this.commandHistory = _linkedList;
        final SimplifyingReductionsExploration.STATE state = this.state;
        if (state != null) {
          switch (state) {
            case INITIAL:
              this.selectReduceExpression();
              break;
            case REDUCTION_SELECTED:
              this.expressionDomainCheck();
              break;
            case SIDE_EFFECT_FREE_TRANSFORMATIONS:
              this.sideEffectFreeTransformations();
              break;
            case DP_STEP_TRANSFORMATIONS:
              this.DPStepTransformations();
              break;
            case EXIT:
              break;
            default:
              break;
          }
        }
        boolean _isEmpty = this.commandHistory.isEmpty();
        boolean _not = (!_isEmpty);
        if (_not) {
          this.setProperty("state", this.state);
          this.setProperty("targetRE", this.targetRE);
          this.recordState(this.commandHistory);
        }
      } catch (final Throwable _t) {
        if (_t instanceof RuntimeException) {
          final RuntimeException re = (RuntimeException)_t;
          Class<? extends RuntimeException> _class = re.getClass();
          String _plus = ("Exception: " + _class);
          this.errStream.println(_plus);
          this.errStream.println(re.getMessage());
          this.errStream.println("Restoring previous state.");
          this.restoreState();
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
    }
    this.outStream.println(AShow.print(this.getCurrentSystem()));
  }
  
  /**
   * Lists all reductions in the selected SystemBody to work with.
   */
  private void selectReduceExpression() {
    final SystemBody body = this.getCurrentBody();
    final List<AbstractReduceExpression> candidates = EcoreUtil2.<AbstractReduceExpression>getAllContentsOfType(body, AbstractReduceExpression.class);
    final int nbAREs = candidates.size();
    if ((nbAREs == 0)) {
      this.outStream.println("No more ReduceExpression left. Finishing exploration.");
      this.state = SimplifyingReductionsExploration.STATE.EXIT;
      return;
    }
    int _xifexpression = (int) 0;
    if (((nbAREs == 1) && AbstractInteractiveExploration.SKIP_SINGLE_CHOICE_QUESTIONS)) {
      _xifexpression = 0;
    } else {
      int _xblockexpression = (int) 0;
      {
        this.outStream.println(AShow.print(body));
        this.outStream.println("");
        this.outStream.println("Select a ReduceExpression to work on:");
        ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, nbAREs, true);
        for (final Integer i : _doubleDotLessThan) {
          {
            final AbstractReduceExpression are = candidates.get((i).intValue());
            this.outStream.println(String.format("%d: %s (in %s)", i, AShow.print(are), this.getEquationName(AlphaUtil.getContainerEquation(are))));
          }
        }
        _xblockexpression = this.acceptInteger(0, nbAREs);
      }
      _xifexpression = _xblockexpression;
    }
    final int selected = _xifexpression;
    this.targetRE = candidates.get(selected);
    this.state = SimplifyingReductionsExploration.STATE.REDUCTION_SELECTED;
    this.outStream.println(String.format("TargetReduction: %s", AShow.print(this.targetRE)));
  }
  
  /**
   * Once a reduction is selected, the basic assumptions must be checked.
   *  - The expression domain of the reduction body is a single polyhedron.
   *  - The ReduceExpression has trivial share space.
   * 
   * The latter is currently not checked; it only happens when the domain of
   * reduction body is unbounded.
   */
  private void expressionDomainCheck() {
    try {
      final CharSequence eqName = this.getEquationName(AlphaUtil.getContainerEquation(this.targetRE));
      final EList<Integer> exprID = this.targetRE.getExpressionID();
      AlphaExpression _body = this.targetRE.getBody();
      if ((_body instanceof CaseExpression)) {
        this.outStream.println("");
        this.outStream.println("Selected reduction has a CaseExpression as its body. Applying PermutationCaseReduce.");
        this.outStream.print("Press enter/return to continue...");
        this.inStream.readLine();
        PermutationCaseReduce.apply(this.targetRE);
        this.state = SimplifyingReductionsExploration.STATE.INITIAL;
        this.targetRE = null;
        this.commandHistory.add(String.format("PermutationCaseReduce(GetExpression(body, %s, %s)", eqName, exprID));
        return;
      }
      int _nbBasicSets = this.targetRE.getBody().getExpressionDomain().getNbBasicSets();
      boolean _greaterThan = (_nbBasicSets > 1);
      if (_greaterThan) {
        this.outStream.println("");
        this.outStream.println("The expression domain of reduction body is not a single polyhedron. Applying SplitUnionIntoCase.");
        this.outStream.print("Press enter/return to continue...");
        this.inStream.readLine();
        AlphaExpression _body_1 = this.targetRE.getBody();
        boolean _matched = false;
        if (_body_1 instanceof RestrictExpression) {
          _matched=true;
          AlphaExpression _body_2 = this.targetRE.getBody();
          SplitUnionIntoCase.apply(((RestrictExpression) _body_2));
        }
        if (!_matched) {
          if (_body_1 instanceof AutoRestrictExpression) {
            _matched=true;
            AlphaExpression _body_2 = this.targetRE.getBody();
            SplitUnionIntoCase.apply(((AutoRestrictExpression) _body_2));
          }
        }
        if (!_matched) {
          throw new UnsupportedOperationException("Expecting the body of reduction to be a restrict. The program may not be normalized.");
        }
        this.state = SimplifyingReductionsExploration.STATE.INITIAL;
        this.targetRE = null;
        this.commandHistory.add(String.format("SplitUnionIntoCase(GetExpression(body, %s, %s)", eqName, exprID));
        return;
      }
      this.state = SimplifyingReductionsExploration.STATE.SIDE_EFFECT_FREE_TRANSFORMATIONS;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * Apply side-effect free SR enhancing transformations.
   * This step is completely automatic.
   */
  private void sideEffectFreeTransformations() {
    try {
      final CharSequence eqName = this.getEquationName(AlphaUtil.getContainerEquation(this.targetRE));
      final EList<Integer> exprID = this.targetRE.getBody().getExpressionID();
      final int sosCount = SameOperatorSimplification.apply(this.targetRE);
      if ((sosCount > 0)) {
        this.outStream.println("");
        this.outStream.println(String.format("Applied SameOperatorSimplification: %s", AShow.print(this.targetRE)));
        this.outStream.print("Press enter/return to continue...");
        this.inStream.readLine();
        this.state = SimplifyingReductionsExploration.STATE.INITIAL;
        this.targetRE = null;
        this.commandHistory.add(String.format("SameOperatorSimplification(GetExpression(body, %s, %s)", eqName, exprID));
        return;
      }
      final int distCount = Distributivity.apply(this.targetRE);
      if ((distCount > 0)) {
        this.outStream.println("");
        this.outStream.println(String.format("Applied Distributivity: %s", AShow.print(this.targetRE)));
        this.outStream.print("Press enter/return to continue...");
        this.inStream.readLine();
        this.state = SimplifyingReductionsExploration.STATE.INITIAL;
        this.targetRE = null;
        this.commandHistory.add(String.format("Distributivity(GetExpression(body, %s, %s)", eqName, exprID));
        return;
      }
      this.outStream.println("No side-effect free transformations to apply.");
      this.state = SimplifyingReductionsExploration.STATE.DP_STEP_TRANSFORMATIONS;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * Lists all possible DP step that can be taken.
   */
  private Object DPStepTransformations() {
    Object _xblockexpression = null;
    {
      Normalize.apply(this.targetRE.getBody());
      final int nbParams = this.targetRE.getExpressionDomain().getNbParams();
      final ShareSpaceAnalysisResult SSAR = ShareSpaceAnalysis.apply(this.targetRE);
      final LinkedList<SimplifyingReductionsExploration.DPStepOption> options = new LinkedList<SimplifyingReductionsExploration.DPStepOption>();
      final LinkedList<long[]> vectors = SimplifyingReductions.generateCandidateReuseVectors(this.targetRE, SSAR);
      for (final long[] vec : vectors) {
        SimplifyingReductionsExploration.DPStepSimplifyingReduction _dPStepSimplifyingReduction = new SimplifyingReductionsExploration.DPStepSimplifyingReduction(vec, nbParams);
        options.add(_dPStepSimplifyingReduction);
      }
      boolean _testLegality = Idempotence.testLegality(this.targetRE, SSAR);
      if (_testLegality) {
        SimplifyingReductionsExploration.DPStepIdempotence _dPStepIdempotence = new SimplifyingReductionsExploration.DPStepIdempotence();
        options.add(_dPStepIdempotence);
      }
      boolean _testLegality_1 = HigherOrderOperator.testLegality(this.targetRE, SSAR);
      if (_testLegality_1) {
        SimplifyingReductionsExploration.DPStepHigherOrderOperator _dPStepHigherOrderOperator = new SimplifyingReductionsExploration.DPStepHigherOrderOperator();
        options.add(_dPStepHigherOrderOperator);
      }
      options.addAll(this.findDecompositionCandidates(SSAR));
      SimplifyingReductionsExploration.DPStepPrintShareSpace _dPStepPrintShareSpace = new SimplifyingReductionsExploration.DPStepPrintShareSpace(SSAR);
      options.add(_dPStepPrintShareSpace);
      SimplifyingReductionsExploration.DPStepBacktrack _dPStepBacktrack = new SimplifyingReductionsExploration.DPStepBacktrack();
      options.add(_dPStepBacktrack);
      SimplifyingReductionsExploration.DPStepFinish _dPStepFinish = new SimplifyingReductionsExploration.DPStepFinish();
      options.add(_dPStepFinish);
      this.outStream.println("");
      this.outStream.println("Select an action:");
      int _size = options.size();
      ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size, true);
      for (final Integer i : _doubleDotLessThan) {
        {
          final SimplifyingReductionsExploration.DPStepOption opt = options.get((i).intValue());
          this.outStream.println(String.format("%d: %s", i, opt.description()));
        }
      }
      final int selected = this.acceptInteger(0, options.size());
      _xblockexpression = this.performAction(options.get(selected));
    }
    return _xblockexpression;
  }
  
  private Object _performAction(final SimplifyingReductionsExploration.DPStepSimplifyingReduction step) {
    boolean _xblockexpression = false;
    {
      EObject _eContainer = this.targetRE.eContainer();
      boolean _not = (!(_eContainer instanceof StandardEquation));
      if (_not) {
        final CharSequence eqName = this.getEquationName(AlphaUtil.getContainerEquation(this.targetRE));
        final EList<Integer> exprID = this.targetRE.getExpressionID();
        final StandardEquation eq = NormalizeReduction.apply(this.targetRE);
        this.commandHistory.add(String.format("NormalizeReduction(GetExpression(body, %s, %s)", eqName, exprID));
        AlphaExpression _expr = eq.getExpr();
        this.targetRE = ((AbstractReduceExpression) _expr);
      }
      final CharSequence eqName_1 = this.getEquationName(AlphaUtil.getContainerEquation(this.targetRE));
      final EList<Integer> exprID_1 = this.targetRE.getExpressionID();
      SimplifyingReductions.apply(((ReduceExpression) this.targetRE), step.reuseDepNoParams);
      this.outStream.println(String.format("Applied SimplifyingReductions."));
      this.state = SimplifyingReductionsExploration.STATE.INITIAL;
      this.targetRE = null;
      _xblockexpression = this.commandHistory.add(String.format("SimplifyingReductions(GetExpression(body, %s, %s, \"%s\")", eqName_1, exprID_1, MatrixOperations.toString(step.reuseDepNoParams)));
    }
    return Boolean.valueOf(_xblockexpression);
  }
  
  private Object _performAction(final SimplifyingReductionsExploration.DPStepIdempotence step) {
    try {
      boolean _xblockexpression = false;
      {
        final CharSequence eqName = this.getEquationName(AlphaUtil.getContainerEquation(this.targetRE));
        final EList<Integer> exprID = this.targetRE.getExpressionID();
        Idempotence.apply(this.targetRE);
        this.outStream.println("");
        this.outStream.println(String.format("Applied Idempotence: %s", AShow.print(this.targetRE)));
        this.outStream.print("Press enter/return to continue...");
        this.inStream.readLine();
        this.state = SimplifyingReductionsExploration.STATE.INITIAL;
        this.targetRE = null;
        _xblockexpression = this.commandHistory.add(String.format("Idempotence(GetExpression(body, %s, %s)", eqName, exprID));
      }
      return Boolean.valueOf(_xblockexpression);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private Object _performAction(final SimplifyingReductionsExploration.DPStepHigherOrderOperator step) {
    try {
      boolean _xblockexpression = false;
      {
        final CharSequence eqName = this.getEquationName(AlphaUtil.getContainerEquation(this.targetRE));
        final EList<Integer> exprID = this.targetRE.getExpressionID();
        HigherOrderOperator.apply(this.targetRE);
        this.outStream.println("");
        this.outStream.println(String.format("Applied HigherOrderOperator: %s", AShow.print(this.targetRE)));
        this.outStream.print("Press enter/return to continue...");
        this.inStream.readLine();
        this.state = SimplifyingReductionsExploration.STATE.INITIAL;
        this.targetRE = null;
        _xblockexpression = this.commandHistory.add(String.format("HigherOrderOperator(GetExpression(body, %s, %s)", eqName, exprID));
      }
      return Boolean.valueOf(_xblockexpression);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private Object _performAction(final SimplifyingReductionsExploration.DPStepReductionDecomposition step) {
    try {
      boolean _xblockexpression = false;
      {
        final CharSequence eqName = this.getEquationName(AlphaUtil.getContainerEquation(this.targetRE));
        final EList<Integer> exprID = this.targetRE.getExpressionID();
        ReductionDecomposition.apply(this.targetRE, step.innerProjection, step.outerProjection);
        this.outStream.println("");
        this.outStream.println(String.format("Applied ReductionDecomposition: %s", AShow.print(this.targetRE)));
        this.outStream.print("Press enter/return to continue...");
        this.inStream.readLine();
        this.state = SimplifyingReductionsExploration.STATE.INITIAL;
        this.targetRE = null;
        _xblockexpression = this.commandHistory.add(String.format("ReductionDecomposition(GetExpression(body, %s, %s, \"%s\", \"%s\")", eqName, exprID, step.innerProjection, step.outerProjection));
      }
      return Boolean.valueOf(_xblockexpression);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private LinkedList<SimplifyingReductionsExploration.DPStepReductionDecomposition> findDecompositionCandidates(final ShareSpaceAnalysisResult SSAR) {
    final List<Map.Entry<AlphaExpression, long[][]>> exprREs = SSAR.getExpressionsWithReuse();
    final long[][] kerFp = MatrixOperations.transpose(AffineFunctionOperations.computeKernel(this.targetRE.getProjection()));
    final HashSet<long[][]> REs = new HashSet<long[][]>();
    for (final Map.Entry<AlphaExpression, long[][]> exprRE : exprREs) {
      {
        final long[][] intersection = MatrixOperations.plainIntersection(exprRE.getValue(), kerFp);
        if ((intersection != null)) {
          REs.add(intersection);
        }
      }
    }
    final LinkedList<SimplifyingReductionsExploration.DPStepReductionDecomposition> candidates = new LinkedList<SimplifyingReductionsExploration.DPStepReductionDecomposition>();
    final List<String> params = this.targetRE.getBody().getExpressionDomain().getParametersNames();
    final List<String> indices = this.targetRE.getBody().getExpressionDomain().getIndicesNames();
    for (final long[][] RE : REs) {
      {
        final JNIISLMultiAff Fp = AffineFunctionOperations.constructAffineFunctionWithSpecifiedKernel(params, indices, RE);
        final JNIISLMultiAff Fpp = AffineFunctionOperations.projectFunctionDomain(this.targetRE.getProjection(), Fp.copy());
        SimplifyingReductionsExploration.DPStepReductionDecomposition _dPStepReductionDecomposition = new SimplifyingReductionsExploration.DPStepReductionDecomposition(Fp, Fpp);
        candidates.add(_dPStepReductionDecomposition);
      }
    }
    return candidates;
  }
  
  private Object _performAction(final SimplifyingReductionsExploration.DPStepBacktrack step) {
    do {
      this.rollbackState();
    } while((((!Objects.equal(this.state, SimplifyingReductionsExploration.STATE.INITIAL)) && (!Objects.equal(this.state, SimplifyingReductionsExploration.STATE.REDUCTION_SELECTED))) && (!Objects.equal(this.state, SimplifyingReductionsExploration.STATE.DP_STEP_TRANSFORMATIONS))));
    return null;
  }
  
  private Object _performAction(final SimplifyingReductionsExploration.DPStepFinish step) {
    return this.state = SimplifyingReductionsExploration.STATE.EXIT;
  }
  
  private Object _performAction(final SimplifyingReductionsExploration.DPStepPrintShareSpace step) {
    this.outStream.println(step.SSAR);
    return null;
  }
  
  @Override
  protected void initProperties() {
    this.setProperty("state", SimplifyingReductionsExploration.STATE.INITIAL);
  }
  
  @Override
  protected void reflectProperties() {
    SimplifyingReductionsExploration.STATE _xifexpression = null;
    Object _property = this.getProperty("state");
    boolean _tripleNotEquals = (_property != null);
    if (_tripleNotEquals) {
      Object _property_1 = this.getProperty("state");
      _xifexpression = ((SimplifyingReductionsExploration.STATE) _property_1);
    } else {
      _xifexpression = SimplifyingReductionsExploration.STATE.INITIAL;
    }
    this.state = _xifexpression;
    AbstractReduceExpression _xifexpression_1 = null;
    Object _property_2 = this.getProperty("targetRE");
    boolean _tripleNotEquals_1 = (_property_2 != null);
    if (_tripleNotEquals_1) {
      Object _property_3 = this.getProperty("targetRE");
      _xifexpression_1 = ((AbstractReduceExpression) _property_3);
    } else {
      _xifexpression_1 = null;
    }
    this.targetRE = _xifexpression_1;
  }
  
  private CharSequence _getEquationName(final StandardEquation eq) {
    return eq.getVariable().getName();
  }
  
  private CharSequence _getEquationName(final UseEquation eq) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("UseEquation");
    return _builder;
  }
  
  private Object performAction(final SimplifyingReductionsExploration.DPStepOption step) {
    if (step instanceof SimplifyingReductionsExploration.DPStepBacktrack) {
      return _performAction((SimplifyingReductionsExploration.DPStepBacktrack)step);
    } else if (step instanceof SimplifyingReductionsExploration.DPStepFinish) {
      return _performAction((SimplifyingReductionsExploration.DPStepFinish)step);
    } else if (step instanceof SimplifyingReductionsExploration.DPStepHigherOrderOperator) {
      return _performAction((SimplifyingReductionsExploration.DPStepHigherOrderOperator)step);
    } else if (step instanceof SimplifyingReductionsExploration.DPStepIdempotence) {
      return _performAction((SimplifyingReductionsExploration.DPStepIdempotence)step);
    } else if (step instanceof SimplifyingReductionsExploration.DPStepPrintShareSpace) {
      return _performAction((SimplifyingReductionsExploration.DPStepPrintShareSpace)step);
    } else if (step instanceof SimplifyingReductionsExploration.DPStepReductionDecomposition) {
      return _performAction((SimplifyingReductionsExploration.DPStepReductionDecomposition)step);
    } else if (step instanceof SimplifyingReductionsExploration.DPStepSimplifyingReduction) {
      return _performAction((SimplifyingReductionsExploration.DPStepSimplifyingReduction)step);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(step).toString());
    }
  }
  
  private CharSequence getEquationName(final Equation eq) {
    if (eq instanceof StandardEquation) {
      return _getEquationName((StandardEquation)eq);
    } else if (eq instanceof UseEquation) {
      return _getEquationName((UseEquation)eq);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(eq).toString());
    }
  }
}
