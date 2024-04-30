package alpha.codegen.writeC;

import alpha.codegen.AssignmentStmt;
import alpha.codegen.BinaryExpr;
import alpha.codegen.BinaryOperator;
import alpha.codegen.CallExpr;
import alpha.codegen.CustomExpr;
import alpha.codegen.Expression;
import alpha.codegen.Factory;
import alpha.codegen.Function;
import alpha.codegen.FunctionBuilder;
import alpha.codegen.MacroStmt;
import alpha.codegen.Parameter;
import alpha.codegen.ParenthesizedExpr;
import alpha.codegen.ProgramBuilder;
import alpha.codegen.Statement;
import alpha.codegen.isl.LoopGenerator;
import alpha.model.ReduceExpression;
import com.google.common.collect.Iterables;
import fr.irisa.cairn.jnimap.isl.ISLAff;
import fr.irisa.cairn.jnimap.isl.ISLConstraint;
import fr.irisa.cairn.jnimap.isl.ISLDimType;
import fr.irisa.cairn.jnimap.isl.ISLSet;
import fr.irisa.cairn.jnimap.isl.ISLSpace;
import fr.irisa.cairn.jnimap.isl.ISLVal;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.ListExtensions;

/**
 * Converts an Alpha reduce expression into the appropriate C AST nodes.
 * A new function is created and added to the program which computes the reduction,
 * and the appropriate function call expression is returned.
 */
@SuppressWarnings("all")
public class ReduceExprConverter {
  /**
   * A counter for the number of reductions that have been created.
   * This is used for determining the names of functions and macros
   * which will be emitted.
   */
  protected static int nextReductionId = 0;

  /**
   * The name of the reduction variable inside of reduce functions.
   */
  protected static final String reduceVarName = "reduceVar";

  /**
   * Converts an Alpha reduce expression into the appropriate C AST nodes.
   * A new function is created and added to the program which computes the reduction,
   * and the appropriate function call expression is returned.
   */
  public static CallExpr convertExpr(final ProgramBuilder program, final ReduceExpression expr) {
    final Function reduceFunction = ReduceExprConverter.createReduceFunction(program, expr);
    program.addFunction(reduceFunction);
    List<String> _paramNames = expr.getContextDomain().getParamNames();
    List<String> _indexNames = expr.getContextDomain().getIndexNames();
    final Iterable<String> callArguments = Iterables.<String>concat(Collections.<List<String>>unmodifiableList(CollectionLiterals.<List<String>>newArrayList(_paramNames, _indexNames)));
    return Factory.callExpr(reduceFunction.getName(), ((String[])Conversions.unwrapArray(callArguments, String.class)));
  }

  /**
   * Creates the function which evaluates the reduction at a specific output point.
   */
  protected static Function createReduceFunction(final ProgramBuilder program, final ReduceExpression expr) {
    final String myId = Integer.valueOf(ReduceExprConverter.nextReductionId).toString();
    int _nextReductionId = ReduceExprConverter.nextReductionId;
    ReduceExprConverter.nextReductionId = (_nextReductionId + 1);
    final ISLSet loopDomain = ReduceExprConverter.createReduceLoopDomain(expr);
    final MacroStmt reducePointMacro = ReduceExprConverter.createReducePointMacro(myId, program, expr);
    final MacroStmt accumulateMacro = ReduceExprConverter.createAccumulationMacro(myId, expr, reducePointMacro);
    final Iterable<Statement> loopStatements = LoopGenerator.generateLoops(accumulateMacro.getName(), loopDomain);
    final String reduceFunctionName = ("reduce" + myId);
    final Function1<String, Parameter> _function = (String it) -> {
      return ReduceExprConverter.toParameter(it);
    };
    return FunctionBuilder.start(Boolean.valueOf(false), Common.alphaValueType(), reduceFunctionName).addParameter(((Parameter[])Conversions.unwrapArray(ListExtensions.<String, Parameter>map(loopDomain.getParamNames(), _function), Parameter.class))).addVariable(Common.alphaIndexType(), ReduceExprConverter.reduceVarName).addStatement(reducePointMacro, accumulateMacro).addStatement(((Statement[])Conversions.unwrapArray(loopStatements, Statement.class))).addUndefine(reducePointMacro, accumulateMacro).addReturn(ReduceExprConverter.reduceVarExpr()).getInstance();
  }

  /**
   * Constructs the domain which will represent the loop nest that isl will produce.
   */
  protected static ISLSet createReduceLoopDomain(final ReduceExpression reduceExpr) {
    ISLSet pointsToReduce = reduceExpr.getBody().getContextDomain().copy();
    final HashSet<String> existingNames = new HashSet<String>();
    existingNames.addAll(pointsToReduce.getParamNames());
    existingNames.addAll(pointsToReduce.getIndexNames());
    final ISLSet outputDomain = reduceExpr.getContextDomain();
    int _nbIndices = outputDomain.getNbIndices();
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _nbIndices, true);
    for (final Integer i : _doubleDotLessThan) {
      {
        final String outputName = outputDomain.getIndexName((i).intValue());
        final String parameterName = ReduceExprConverter.makeParameterName(outputName, existingNames);
        existingNames.add(parameterName);
        pointsToReduce = pointsToReduce.<ISLSet>addParams(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList(parameterName)));
        final ISLAff outputExpr = reduceExpr.getProjection().getAff((i).intValue());
        final ISLConstraint outputConstraint = ReduceExprConverter.constrainAddedParameter(pointsToReduce.getSpace(), outputExpr);
        pointsToReduce = pointsToReduce.addConstraint(outputConstraint);
      }
    }
    return pointsToReduce;
  }

  /**
   * Turns an index name into a unique parameter name.
   * The new name is added to the given set of existing names.
   */
  protected static String makeParameterName(final String indexName, final HashSet<String> existingNames) {
    String parameterName = indexName;
    do {
      String _parameterName = parameterName;
      parameterName = (_parameterName + "p");
    } while(existingNames.contains(parameterName));
    return parameterName;
  }

  /**
   * Adds an equality constraint to the recently added parameter
   * (i.e., the parameter with the largest index).
   * This parameter is set equal to the given affine expression
   * (which comes from the reduction's projection function).
   */
  protected static ISLConstraint constrainAddedParameter(final ISLSpace reductionSpace, final ISLAff outputExpr) {
    int _nbParams = reductionSpace.getNbParams();
    final int parameterIndex = (_nbParams - 1);
    ISLConstraint equality = ISLConstraint.buildEquality(reductionSpace.copy()).setCoefficient(ISLDimType.isl_dim_param, parameterIndex, (-1));
    int _nbParams_1 = outputExpr.getNbParams();
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _nbParams_1, true);
    for (final Integer paramIdx : _doubleDotLessThan) {
      {
        final ISLVal coefficient = outputExpr.getCoefficientVal(ISLDimType.isl_dim_param, (paramIdx).intValue());
        equality = equality.setCoefficient(ISLDimType.isl_dim_param, (paramIdx).intValue(), coefficient);
      }
    }
    int _nbInputs = outputExpr.getNbInputs();
    ExclusiveRange _doubleDotLessThan_1 = new ExclusiveRange(0, _nbInputs, true);
    for (final Integer inIdx : _doubleDotLessThan_1) {
      {
        final ISLVal coefficient = outputExpr.getCoefficientVal(ISLDimType.isl_dim_in, (inIdx).intValue());
        equality = equality.setCoefficient(ISLDimType.isl_dim_set, (inIdx).intValue(), coefficient);
      }
    }
    return equality;
  }

  /**
   * Gets an expression representing the reduce variable.
   */
  protected static CustomExpr reduceVarExpr() {
    return Factory.customExpr(ReduceExprConverter.reduceVarName);
  }

  /**
   * Constructs a parameter for the reduce function.
   */
  protected static Parameter toParameter(final String name) {
    return Factory.parameter(Common.alphaIndexType(), name);
  }

  /**
   * Constructs the macro that evaluates a point within the reduction body.
   */
  protected static MacroStmt createReducePointMacro(final String reductionId, final ProgramBuilder program, final ReduceExpression expr) {
    final String name = ("RP" + reductionId);
    final List<String> arguments = expr.getBody().getContextDomain().getIndexNames();
    final Expression replacement = ExprConverter.convertExpr(program, expr.getBody());
    return Factory.macroStmt(name, ((String[])Conversions.unwrapArray(arguments, String.class)), replacement);
  }

  /**
   * Constructs the macro used to accumulate points of the reduction body into the reduce variable.
   */
  protected static MacroStmt createAccumulationMacro(final String reductionId, final ReduceExpression expr, final MacroStmt reducePointMacro) {
    final String name = ("R" + reductionId);
    final Function1<String, ParenthesizedExpr> _function = (String it) -> {
      return Factory.parenthesizedExpr(it);
    };
    final List<ParenthesizedExpr> reducePointArguments = ListExtensions.<String, ParenthesizedExpr>map(expr.getBody().getContextDomain().getIndexNames(), _function);
    final CallExpr reducePointCall = Factory.callExpr(reducePointMacro.getName(), ((Expression[])Conversions.unwrapArray(reducePointArguments, Expression.class)));
    final BinaryOperator operator = Common.getOperator(expr.getOperator());
    final BinaryExpr accumulateExpr = Factory.binaryExpr(operator, ReduceExprConverter.reduceVarExpr(), reducePointCall);
    final AssignmentStmt accumulateStmt = Factory.assignmentStmt(ReduceExprConverter.reduceVarExpr(), accumulateExpr);
    return Factory.macroStmt(name, ((String[])Conversions.unwrapArray(expr.getBody().getContextDomain().getIndexNames(), String.class)), accumulateStmt);
  }
}
