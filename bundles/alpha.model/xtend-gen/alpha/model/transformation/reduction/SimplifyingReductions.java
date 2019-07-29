package alpha.model.transformation.reduction;

import alpha.model.AbstractReduceExpression;
import alpha.model.AlphaExpression;
import alpha.model.AlphaInternalStateConstructor;
import alpha.model.AlphaSystem;
import alpha.model.BINARY_OP;
import alpha.model.BinaryExpression;
import alpha.model.CaseExpression;
import alpha.model.DependenceExpression;
import alpha.model.Equation;
import alpha.model.ReduceExpression;
import alpha.model.RestrictExpression;
import alpha.model.StandardEquation;
import alpha.model.SystemBody;
import alpha.model.Variable;
import alpha.model.VariableExpression;
import alpha.model.analysis.reduction.ShareSpaceAnalysisResult;
import alpha.model.factory.AlphaUserFactory;
import alpha.model.matrix.MatrixOperations;
import alpha.model.transformation.Normalize;
import alpha.model.transformation.PropagateSimpleEquations;
import alpha.model.transformation.SimplifyExpressions;
import alpha.model.util.AffineFunctionOperations;
import alpha.model.util.AlphaOperatorUtil;
import alpha.model.util.AlphaUtil;
import alpha.model.util.DomainOperations;
import fr.irisa.cairn.jnimap.isl.ISLAff;
import fr.irisa.cairn.jnimap.isl.ISLConstraint;
import fr.irisa.cairn.jnimap.isl.ISLContext;
import fr.irisa.cairn.jnimap.isl.ISLDimType;
import fr.irisa.cairn.jnimap.isl.ISLMultiAff;
import fr.irisa.cairn.jnimap.isl.ISLPoint;
import fr.irisa.cairn.jnimap.isl.ISLSet;
import fr.irisa.cairn.jnimap.isl.ISLSpace;
import fr.irisa.cairn.jnimap.isl.ISLVal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.function.Function;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Pair;

@SuppressWarnings("all")
public class SimplifyingReductions {
  public static boolean DEBUG = false;
  
  /**
   * Setting this variable to true disables all the
   * post processing simplifications. Intended to be
   * used for debugging purposes or to check the
   * result of SR against the theorem in the paper.
   */
  public static boolean DISABLE_POST_PROCESSING = false;
  
  public static Function<SimplifyingReductions, String> defineXaddEquationName = ((Function<SimplifyingReductions, String>) (SimplifyingReductions sr) -> {
    String _xblockexpression = null;
    {
      final String origName = sr.reductionEquation.getVariable().getName();
      String XaddName = (origName + "_add");
      _xblockexpression = AlphaUtil.duplicateNameResolver().apply(sr.containerSystem, XaddName, "_");
    }
    return _xblockexpression;
  });
  
  public static Function<SimplifyingReductions, String> defineXsubEquationName = ((Function<SimplifyingReductions, String>) (SimplifyingReductions sr) -> {
    String _xblockexpression = null;
    {
      final String origName = sr.reductionEquation.getVariable().getName();
      String XaddName = (origName + "_sub");
      _xblockexpression = AlphaUtil.duplicateNameResolver().apply(sr.containerSystem, XaddName, "_");
    }
    return _xblockexpression;
  });
  
  public void debug(final String msg) {
    if (SimplifyingReductions.DEBUG) {
      InputOutput.<String>println(("[SimplifyingReductions] " + msg));
    }
  }
  
  private ReduceExpression targetReduce;
  
  private StandardEquation reductionEquation;
  
  private ISLMultiAff reuseDep;
  
  private ISLMultiAff reuseDir;
  
  private final AlphaSystem containerSystem;
  
  private final SystemBody containerSystemBody;
  
  private SimplifyingReductions(final ReduceExpression reduce, final ISLMultiAff reuseDep) {
    this.targetReduce = reduce;
    this.reuseDep = reuseDep;
    this.containerSystem = AlphaUtil.getContainerSystem(this.targetReduce);
    this.containerSystemBody = AlphaUtil.getContainerSystemBody(this.targetReduce);
  }
  
  public void basicTests() {
    int _nbBasicSets = this.targetReduce.getContextDomain().getNbBasicSets();
    boolean _greaterThan = (_nbBasicSets > 1);
    if (_greaterThan) {
      throw new RuntimeException("The context of the reduction body must be a single polyhedron.");
    }
    EObject _eContainer = this.targetReduce.eContainer();
    boolean _not = (!(_eContainer instanceof StandardEquation));
    if (_not) {
      throw new RuntimeException("The target ReduceExpression must be a direct child of a StandardEquation. Apply NormalizeReductions first.");
    }
    int _nbIndices = this.targetReduce.getBody().getContextDomain().getNbIndices();
    int _nbInputs = this.reuseDep.getNbInputs();
    boolean _notEquals = (_nbIndices != _nbInputs);
    if (_notEquals) {
      throw new RuntimeException("Given reuse dependence does not match the dimensionality of the reduction body.");
    }
    final long[][] kerQ = DomainOperations.kernelOfLinearPart(this.targetReduce.getBody().getContextDomain());
    if ((kerQ != null)) {
      throw new RuntimeException("The body of the target ReduceExpression has non-empty ker(Q); kernel of the linear part of the domain. This case is currently not handled.");
    }
  }
  
  public static void apply(final ReduceExpression reduce, final ISLMultiAff reuseDep) {
    final SimplifyingReductions sr = new SimplifyingReductions(reduce, reuseDep);
    sr.simplify();
  }
  
  public static void apply(final ReduceExpression reduce, final int[] reuseDepNoParams) {
    final Function1<Integer, Long> _function = (Integer v) -> {
      return Long.valueOf(((long) (v).intValue()));
    };
    SimplifyingReductions.apply(reduce, ((long[])Conversions.unwrapArray(ListExtensions.<Integer, Long>map(((List<Integer>)Conversions.doWrapArray(reuseDepNoParams)), _function), long.class)));
  }
  
  public static void apply(final ReduceExpression reduce, final long[] reuseDepNoParams) {
    final ISLSpace space = ISLSpace.idMapDimFromSetDim(reduce.getBody().getExpressionDomain().getSpace().copy());
    final long[] reuseDep = MatrixOperations.bindVector(new long[space.getNbParams()], reuseDepNoParams);
    final ISLMultiAff maff = AffineFunctionOperations.createUniformFunction(space.copy(), reuseDep);
    SimplifyingReductions.apply(reduce, maff);
  }
  
  protected void simplify() {
    this.basicTests();
    Equation _containerEquation = AlphaUtil.getContainerEquation(this.targetReduce);
    this.reductionEquation = ((StandardEquation) _containerEquation);
    final Variable targetVariable = this.reductionEquation.getVariable();
    this.debug(("ReuseDependence : " + this.reuseDep));
    this.reuseDir = AffineFunctionOperations.negateUniformFunction(this.reuseDep);
    this.debug(("ReuseDirection  : " + this.reuseDir));
    final ISLMultiAff reuseDepProjected = this.constructDependenceFunctionInAnswerSpace();
    this.debug(("ReuseDepProjected: " + reuseDepProjected));
    boolean _isIdentity = reuseDepProjected.isIdentity();
    if (_isIdentity) {
      throw new RuntimeException("The reuse dependence is in the kernel of the projection function.");
    }
    final ISLSet origDE = this.targetReduce.getBody().getContextDomain();
    this.debug(("DE  : " + origDE));
    final ISLSet DEp = origDE.copy().apply(this.reuseDir.toMap());
    this.debug(("DE\' : " + DEp));
    final ISLSet Dadd = origDE.copy().subtract(DEp.copy()).apply(this.targetReduce.getProjection().toMap()).intersect(targetVariable.getDomain());
    this.debug(("Dadd: " + Dadd));
    final ISLSet Dsub = DEp.copy().subtract(origDE.copy()).apply(this.targetReduce.getProjection().toMap()).intersect(targetVariable.getDomain());
    this.debug(("Dsub: " + Dsub));
    final ISLSet Dint = origDE.copy().intersect(DEp.copy()).apply(this.targetReduce.getProjection().toMap()).intersect(targetVariable.getDomain());
    this.debug(("Dint: " + Dint));
    boolean _isEmpty = Dint.isEmpty();
    if (_isEmpty) {
      throw new RuntimeException("Initialization domain is empty; input reuse vector is invalid.");
    }
    final String XaddName = SimplifyingReductions.defineXaddEquationName.apply(this);
    {
      final ISLSet restrictDom = origDE.copy().subtract(DEp.copy());
      final RestrictExpression restrictExpr = AlphaUserFactory.createRestrictExpression(restrictDom, EcoreUtil.<AlphaExpression>copy(this.targetReduce.getBody()));
      final ReduceExpression Xadd = AlphaUserFactory.createReduceExpression(this.targetReduce.getOperator(), this.targetReduce.getProjection(), restrictExpr);
      final ISLSet XaddDom = restrictDom.copy().apply(this.targetReduce.getProjection().toMap());
      final Variable XaddVar = AlphaUserFactory.createVariable(XaddName, XaddDom);
      final StandardEquation XaddEq = AlphaUserFactory.createStandardEquation(XaddVar, Xadd);
      this.containerSystem.getLocals().add(XaddVar);
      this.containerSystemBody.getEquations().add(XaddEq);
      AlphaInternalStateConstructor.recomputeContextDomain(XaddEq);
    }
    final String XsubName = SimplifyingReductions.defineXsubEquationName.apply(this);
    boolean _isEmpty_1 = Dsub.isEmpty();
    boolean _not = (!_isEmpty_1);
    if (_not) {
      final ISLSet restrictDom = DEp.copy().subtract(origDE.copy());
      final ISLSet DintPreimage = Dint.copy().preimage(this.targetReduce.getProjection());
      final DependenceExpression depExpr = AlphaUserFactory.createDependenceExpression(this.reuseDep.copy(), EcoreUtil.<AlphaExpression>copy(this.targetReduce.getBody()));
      final RestrictExpression innerRestrict = AlphaUserFactory.createRestrictExpression(restrictDom, depExpr);
      final RestrictExpression outerRestrict = AlphaUserFactory.createRestrictExpression(DintPreimage, innerRestrict);
      final ReduceExpression Xsub = AlphaUserFactory.createReduceExpression(this.targetReduce.getOperator(), this.targetReduce.getProjection(), outerRestrict);
      final ISLSet XsubDom = restrictDom.copy().apply(this.targetReduce.getProjection().toMap()).intersect(Dint.copy());
      final Variable XsubVar = AlphaUserFactory.createVariable(XsubName, XsubDom);
      final StandardEquation XsubEq = AlphaUserFactory.createStandardEquation(XsubVar, Xsub);
      this.containerSystem.getLocals().add(XsubVar);
      this.containerSystemBody.getEquations().add(XsubEq);
      AlphaInternalStateConstructor.recomputeContextDomain(XsubEq);
    }
    final CaseExpression mainCaseExpr = AlphaUserFactory.createCaseExpression();
    final BINARY_OP binaryOp = AlphaOperatorUtil.reductionOPtoBinaryOP(this.targetReduce.getOperator());
    final VariableExpression XaddRef = AlphaUserFactory.createVariableExpression(this.containerSystem.getVariable(XaddName));
    final VariableExpression Xref = AlphaUserFactory.createVariableExpression(this.reductionEquation.getVariable());
    final DependenceExpression reuseExpr = AlphaUserFactory.createDependenceExpression(reuseDepProjected.copy(), Xref);
    {
      final ISLSet restrictDom_1 = Dadd.copy().subtract(Dint.copy());
      final RestrictExpression branch1expr = AlphaUserFactory.createRestrictExpression(restrictDom_1, EcoreUtil.<VariableExpression>copy(XaddRef));
      mainCaseExpr.getExprs().add(branch1expr);
    }
    {
      final ISLSet restrictDom_1 = Dint.copy().subtract(Dadd.copy().union(Dsub.copy()));
      final RestrictExpression branch2expr = AlphaUserFactory.createRestrictExpression(restrictDom_1, EcoreUtil.<DependenceExpression>copy(reuseExpr));
      mainCaseExpr.getExprs().add(branch2expr);
    }
    {
      final ISLSet restrictDom_1 = Dadd.copy().intersect(Dint.copy().subtract(Dsub.copy()));
      final BinaryExpression binaryExpr = AlphaUserFactory.createBinaryExpression(binaryOp, EcoreUtil.<VariableExpression>copy(XaddRef), EcoreUtil.<DependenceExpression>copy(reuseExpr));
      final RestrictExpression branch3expr = AlphaUserFactory.createRestrictExpression(restrictDom_1, binaryExpr);
      mainCaseExpr.getExprs().add(branch3expr);
    }
    boolean _isEmpty_2 = Dsub.isEmpty();
    boolean _not_1 = (!_isEmpty_2);
    if (_not_1) {
      final BINARY_OP invOp = AlphaOperatorUtil.reductionOPtoBinaryInverseOP(this.targetReduce.getOperator());
      final VariableExpression XsubRef = AlphaUserFactory.createVariableExpression(this.containerSystem.getVariable(XsubName));
      {
        final ISLSet restrictDom_1 = Dsub.copy().intersect(Dint.copy().subtract(Dadd.copy()));
        final BinaryExpression binaryExpr = AlphaUserFactory.createBinaryExpression(invOp, EcoreUtil.<DependenceExpression>copy(reuseExpr), EcoreUtil.<VariableExpression>copy(XsubRef));
        final RestrictExpression branch4expr = AlphaUserFactory.createRestrictExpression(restrictDom_1, binaryExpr);
        mainCaseExpr.getExprs().add(branch4expr);
      }
      {
        final ISLSet restrictDom_1 = Dadd.copy().intersect(Dint.copy().intersect(Dsub.copy()));
        final BinaryExpression binaryExprAdd = AlphaUserFactory.createBinaryExpression(binaryOp, XaddRef, reuseExpr);
        final BinaryExpression binaryExprSub = AlphaUserFactory.createBinaryExpression(invOp, binaryExprAdd, XsubRef);
        final RestrictExpression branch5expr = AlphaUserFactory.createRestrictExpression(restrictDom_1, binaryExprSub);
        mainCaseExpr.getExprs().add(branch5expr);
      }
    }
    EcoreUtil.replace(this.targetReduce, mainCaseExpr);
    AlphaInternalStateConstructor.recomputeContextDomain(this.reductionEquation);
    if ((!SimplifyingReductions.DISABLE_POST_PROCESSING)) {
      SimplifyExpressions.apply(this.containerSystemBody);
      Normalize.apply(this.containerSystemBody);
      PropagateSimpleEquations.apply(this.containerSystemBody);
      Normalize.apply(this.containerSystemBody);
    }
  }
  
  /**
   * The reuse dependence is specified in the space of reduction body,
   * but the actual dependence will be among the reduction instance.
   * Thus, the projection of the reuse must be computed.
   * 
   * In this method, this process is implemented as evaluating the
   * constant vector representing the uniform reuse dependence by
   * the projection function, and then reconstructing the uniform
   * function from the result of the evaluation.
   */
  private ISLMultiAff constructDependenceFunctionInAnswerSpace() {
    ISLMultiAff _xblockexpression = null;
    {
      final List<Long> b = AffineFunctionOperations.getConstantVector(this.reuseDep);
      final int nbParams = this.reuseDep.getDomainSpace().getNbParams();
      ISLPoint point = ISLPoint.buildZero(this.reuseDep.getDomainSpace());
      int _size = b.size();
      ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size, true);
      for (final Integer d : _doubleDotLessThan) {
        {
          ISLDimType _xifexpression = null;
          if (((d).intValue() < nbParams)) {
            _xifexpression = ISLDimType.isl_dim_param;
          } else {
            _xifexpression = ISLDimType.isl_dim_set;
          }
          final ISLDimType dimType = _xifexpression;
          Integer _xifexpression_1 = null;
          if (((d).intValue() < nbParams)) {
            _xifexpression_1 = d;
          } else {
            _xifexpression_1 = Integer.valueOf(((d).intValue() - nbParams));
          }
          final Integer pos = _xifexpression_1;
          final ISLVal v = ISLVal.buildFromLong(ISLContext.getInstance(), (b.get((d).intValue())).longValue());
          point = point.setCoordinate(dimType, (pos).intValue(), v);
        }
      }
      int _nbOutputs = this.targetReduce.getProjection().getNbOutputs();
      int _plus = (nbParams + _nbOutputs);
      final ArrayList<Long> projectedB = new ArrayList<Long>(_plus);
      ExclusiveRange _doubleDotLessThan_1 = new ExclusiveRange(0, nbParams, true);
      for (final Integer d_1 : _doubleDotLessThan_1) {
        projectedB.add(Long.valueOf(0l));
      }
      List<ISLAff> _affs = this.targetReduce.getProjection().getAffs();
      for (final ISLAff aff : _affs) {
        projectedB.add(Long.valueOf(aff.eval(point.copy()).asLong()));
      }
      final ISLSpace domSpace = this.reductionEquation.getVariable().getDomain().getSpace();
      final ISLSpace space = ISLSpace.idMapDimFromSetDim(domSpace);
      final ISLMultiAff f = AffineFunctionOperations.createUniformFunction(space, projectedB);
      _xblockexpression = AlphaUtil.renameIndices(f, this.reductionEquation.getVariable().getDomain().getIndexNames());
    }
    return _xblockexpression;
  }
  
  /**
   * Creates a list of ISLMultiAff that are valid reuse vectors given the share space.
   * Exposed to be used by SimplifyingReductionExploration.
   */
  public static LinkedList<long[]> generateCandidateReuseVectors(final AbstractReduceExpression are, final ShareSpaceAnalysisResult SSAR) {
    final LinkedList<long[]> vectors = new LinkedList<long[]>();
    final long[][] areSS = SSAR.getShareSpace(are.getBody());
    if ((areSS == null)) {
      return vectors;
    }
    final long[][] kerFp = MatrixOperations.transpose(AffineFunctionOperations.computeKernel(are.getProjection()));
    long[][] _kernelIntersection = MatrixOperations.kernelIntersection(areSS, kerFp);
    boolean _tripleNotEquals = (_kernelIntersection != null);
    if (_tripleNotEquals) {
      return vectors;
    }
    for (final long[] row : areSS) {
      {
        vectors.add(MatrixOperations.scalarMultiplication(row, (-1)));
        vectors.add(row);
      }
    }
    return vectors;
  }
  
  /**
   * Creates a list of Pair<ISLMultiAff, ISLMultiAff> that are valid projection functions for decomposing
   * the given reduction. The first element is the projection for the inner reduction.
   * 
   * The candidates are created using two methods:
   *  1. Boundary Constraints. For each constraint c in the domain of the reduction body,
   * a function f such that ker(f) = ker(original projection) \intersect ker(c) becomes a candidate.
   *  2. Distributivity. When the reduction body has share space RE,
   * a function f such that ker(f) = ker(original projection) \intersect RE becomes a candidate.
   */
  public static LinkedList<Pair<ISLMultiAff, ISLMultiAff>> generateDecompositionCandidates(final ShareSpaceAnalysisResult SSAR, final AbstractReduceExpression targetRE) {
    final List<Map.Entry<AlphaExpression, long[][]>> exprREs = SSAR.getExpressionsWithReuse();
    final long[][] kerF = MatrixOperations.transpose(AffineFunctionOperations.computeKernel(targetRE.getProjection()));
    final TreeSet<long[][]> kerFps = new TreeSet<long[][]>(new Comparator<long[][]>() {
      @Override
      public int compare(final long[][] o1, final long[][] o2) {
        final String str1 = MatrixOperations.toString(o1);
        final String str2 = MatrixOperations.toString(o2);
        return str1.compareTo(str2);
      }
    });
    for (final Map.Entry<AlphaExpression, long[][]> exprRE : exprREs) {
      {
        final long[][] intersection = MatrixOperations.kernelIntersection(exprRE.getValue(), kerF);
        if ((intersection != null)) {
          kerFps.add(intersection);
        }
      }
    }
    final List<ISLConstraint> constraints = targetRE.getBody().getContextDomain().getBasicSetAt(0).getConstraints();
    for (final ISLConstraint c : constraints) {
      {
        final long[][] kerC = MatrixOperations.transpose(DomainOperations.kernelOfLinearPart(c.copy().toBasicSet()));
        final long[][] ker = MatrixOperations.kernelIntersection(kerF, kerC);
        if ((ker != null)) {
          kerFps.add(ker);
        }
      }
    }
    final LinkedList<Pair<ISLMultiAff, ISLMultiAff>> candidates = new LinkedList<Pair<ISLMultiAff, ISLMultiAff>>();
    final List<String> params = targetRE.getBody().getExpressionDomain().getParamNames();
    final List<String> indices = targetRE.getBody().getExpressionDomain().getIndexNames();
    for (final long[][] RE : kerFps) {
      {
        final ISLMultiAff Fp = AffineFunctionOperations.constructAffineFunctionWithSpecifiedKernel(params, indices, RE);
        int _nbOutputs = Fp.getNbOutputs();
        int _nbOutputs_1 = targetRE.getProjection().getNbOutputs();
        boolean _greaterThan = (_nbOutputs > _nbOutputs_1);
        if (_greaterThan) {
          final ISLMultiAff Fpp = AffineFunctionOperations.projectFunctionDomain(targetRE.getProjection(), Fp.copy());
          Pair<ISLMultiAff, ISLMultiAff> _pair = new Pair<ISLMultiAff, ISLMultiAff>(Fp, Fpp);
          candidates.add(_pair);
        }
      }
    }
    return candidates;
  }
}
