package alpha.codegen.writeC;

import alpha.codegen.AssignmentStmt;
import alpha.codegen.BaseDataType;
import alpha.codegen.BinaryExpr;
import alpha.codegen.BinaryOperator;
import alpha.codegen.CallExpr;
import alpha.codegen.CustomExpr;
import alpha.codegen.Expression;
import alpha.codegen.Factory;
import alpha.codegen.Function;
import alpha.codegen.FunctionBuilder;
import alpha.codegen.MacroStmt;
import alpha.codegen.NameChecker;
import alpha.codegen.Parameter;
import alpha.codegen.ParenthesizedExpr;
import alpha.codegen.ProgramBuilder;
import alpha.codegen.Statement;
import alpha.codegen.isl.ASTConversionResult;
import alpha.codegen.isl.ASTConverter;
import alpha.codegen.isl.LoopGenerator;
import alpha.model.ReduceExpression;
import com.google.common.collect.Iterables;
import fr.irisa.cairn.jnimap.isl.ISLASTNode;
import fr.irisa.cairn.jnimap.isl.ISLAff;
import fr.irisa.cairn.jnimap.isl.ISLConstraint;
import fr.irisa.cairn.jnimap.isl.ISLDimType;
import fr.irisa.cairn.jnimap.isl.ISLSet;
import fr.irisa.cairn.jnimap.isl.ISLSpace;
import fr.irisa.cairn.jnimap.isl.ISLVal;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.function.Consumer;
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
   * The name of the reduction variable inside of reduce functions.
   */
  protected static final String reduceVarName = "reduceVar";

  /**
   * A counter for the number of reductions that have been created.
   * This is used for determining the names of functions and macros
   * which will be emitted.
   */
  protected int nextReductionId = 0;

  /**
   * The data type to use for Alpha values.
   */
  protected final BaseDataType alphaValueType;

  /**
   * The converter used for converting the body of a reduce expression into C expressions.
   */
  protected final ExprConverter exprConverter;

  /**
   * Constructs a new converter for reduce expressions.
   */
  public ReduceExprConverter(final BaseDataType alphaValueType, final ExprConverter exprConverter) {
    this.alphaValueType = alphaValueType;
    this.exprConverter = exprConverter;
  }

  /**
   * Converts an Alpha reduce expression into the appropriate C AST nodes.
   * A new function is created and added to the program which computes the reduction,
   * and the appropriate function call expression is returned.
   */
  public Expression convertExpr(final ProgramBuilder program, final ReduceExpression expr) {
    final Function reduceFunction = this.createReduceFunction(program, expr);
    program.addFunction(reduceFunction);
    List<String> _paramNames = expr.getContextDomain().getParamNames();
    List<String> _indexNames = expr.getContextDomain().getIndexNames();
    final Iterable<String> callArguments = Iterables.<String>concat(Collections.<List<String>>unmodifiableList(CollectionLiterals.<List<String>>newArrayList(_paramNames, _indexNames)));
    return Factory.callExpr(reduceFunction.getName(), ((String[])Conversions.unwrapArray(callArguments, String.class)));
  }

  /**
   * Creates the function which evaluates the reduction at a specific output point.
   */
  protected Function createReduceFunction(final ProgramBuilder program, final ReduceExpression expr) {
    String reduceFunctionName = null;
    String reducePointMacroName = null;
    String accumulateMacroName = null;
    do {
      {
        reduceFunctionName = ("reduce" + Integer.valueOf(this.nextReductionId));
        reducePointMacroName = ("RP" + Integer.valueOf(this.nextReductionId));
        accumulateMacroName = ("R" + Integer.valueOf(this.nextReductionId));
        int _nextReductionId = this.nextReductionId;
        this.nextReductionId = (_nextReductionId + 1);
      }
    } while(program.getNameChecker().globalNameExists(reduceFunctionName, reducePointMacroName, accumulateMacroName));
    final FunctionBuilder function = program.startFunction(true, false, Factory.dataType(this.alphaValueType), reduceFunctionName);
    final AssignmentStmt initializeStmt = Factory.assignmentStmt(ReduceExprConverter.reduceVarName, Common.getReductionInitialValue(this.alphaValueType, expr.getOperator()));
    function.addVariable(Factory.dataType(this.alphaValueType), ReduceExprConverter.reduceVarName).addStatement(initializeStmt);
    final MacroStmt reducePointMacro = this.createReducePointMacro(reducePointMacroName, program, expr);
    final MacroStmt accumulateMacro = ReduceExprConverter.createAccumulationMacro(accumulateMacroName, expr, reducePointMacro);
    function.addStatement(reducePointMacro, accumulateMacro);
    final ISLSet loopDomain = this.createReduceLoopDomain(program.getNameChecker(), expr);
    final ISLASTNode islAST = LoopGenerator.generateLoops(accumulateMacro.getName(), loopDomain);
    final Function1<String, Parameter> _function = (String it) -> {
      return ReduceExprConverter.toParameter(it);
    };
    function.addParameter(((Parameter[])Conversions.unwrapArray(ListExtensions.<String, Parameter>map(loopDomain.getParamNames(), _function), Parameter.class)));
    final ASTConversionResult loopResult = ASTConverter.convert(islAST);
    final Consumer<String> _function_1 = (String it) -> {
      function.addVariable(Common.alphaIndexType(), it);
    };
    loopResult.getDeclarations().forEach(_function_1);
    function.addStatement(((Statement[])Conversions.unwrapArray(loopResult.getStatements(), Statement.class)));
    function.addUndefine(reducePointMacro, accumulateMacro).addReturn(ReduceExprConverter.reduceVarExpr());
    return function.getInstance();
  }

  /**
   * Constructs the domain which will represent the loop nest that isl will produce.
   */
  protected ISLSet createReduceLoopDomain(final NameChecker nameChecker, final ReduceExpression reduceExpr) {
    ISLSet pointsToReduce = reduceExpr.getBody().getContextDomain().copy();
    final HashSet<String> existingNames = CollectionLiterals.<String>newHashSet();
    existingNames.addAll(pointsToReduce.getParamNames());
    existingNames.addAll(pointsToReduce.getIndexNames());
    final ISLSet outputDomain = reduceExpr.getContextDomain();
    int _nbIndices = outputDomain.getNbIndices();
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _nbIndices, true);
    for (final Integer i : _doubleDotLessThan) {
      {
        final String outputName = outputDomain.getIndexName((i).intValue());
        final String parameterName = nameChecker.getUniqueLocalName(existingNames, outputName, "p");
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
  protected MacroStmt createReducePointMacro(final String macroName, final ProgramBuilder program, final ReduceExpression expr) {
    final List<String> arguments = expr.getBody().getContextDomain().getIndexNames();
    final Expression replacement = this.exprConverter.convertExpr(program, expr.getBody());
    return Factory.macroStmt(macroName, ((String[])Conversions.unwrapArray(arguments, String.class)), replacement);
  }

  /**
   * Constructs the macro used to accumulate points of the reduction body into the reduce variable.
   */
  protected static MacroStmt createAccumulationMacro(final String macroName, final ReduceExpression expr, final MacroStmt reducePointMacro) {
    final Function1<String, ParenthesizedExpr> _function = (String it) -> {
      return Factory.parenthesizedExpr(it);
    };
    final List<ParenthesizedExpr> reducePointArguments = ListExtensions.<String, ParenthesizedExpr>map(expr.getBody().getContextDomain().getIndexNames(), _function);
    final CallExpr reducePointCall = Factory.callExpr(reducePointMacro.getName(), ((Expression[])Conversions.unwrapArray(reducePointArguments, Expression.class)));
    final BinaryOperator operator = Common.getOperator(expr.getOperator());
    final BinaryExpr accumulateExpr = Factory.binaryExpr(operator, ReduceExprConverter.reduceVarExpr(), reducePointCall);
    final AssignmentStmt accumulateStmt = Factory.assignmentStmt(ReduceExprConverter.reduceVarExpr(), accumulateExpr);
    return Factory.macroStmt(macroName, ((String[])Conversions.unwrapArray(expr.getBody().getContextDomain().getIndexNames(), String.class)), accumulateStmt);
  }
}
