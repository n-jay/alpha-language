package alpha.codegen.writeC;

import alpha.codegen.ArrayAccessExpr;
import alpha.codegen.AssignmentStmt;
import alpha.codegen.BaseDataType;
import alpha.codegen.BinaryExpr;
import alpha.codegen.BinaryOperator;
import alpha.codegen.CallExpr;
import alpha.codegen.CastExpr;
import alpha.codegen.CustomExpr;
import alpha.codegen.DataType;
import alpha.codegen.Expression;
import alpha.codegen.ExpressionStmt;
import alpha.codegen.Factory;
import alpha.codegen.FunctionBuilder;
import alpha.codegen.IfStmt;
import alpha.codegen.IfStmtBuilder;
import alpha.codegen.Include;
import alpha.codegen.MacroStmt;
import alpha.codegen.ParenthesizedExpr;
import alpha.codegen.Program;
import alpha.codegen.ProgramBuilder;
import alpha.codegen.Statement;
import alpha.codegen.UnaryOperator;
import alpha.codegen.isl.ConditionalConverter;
import alpha.codegen.isl.LoopGenerator;
import alpha.codegen.isl.MemoryUtils;
import alpha.codegen.isl.PolynomialConverter;
import alpha.model.AlphaSystem;
import alpha.model.Equation;
import alpha.model.StandardEquation;
import alpha.model.SystemBody;
import alpha.model.UseEquation;
import alpha.model.Variable;
import fr.irisa.cairn.jnimap.barvinok.BarvinokBindings;
import fr.irisa.cairn.jnimap.isl.ISLPWQPolynomial;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

/**
 * Converts an Alpha system to the simplified C AST.
 */
@SuppressWarnings("all")
public class SystemConverter {
  /**
   * The list of all variables allocated by the entry point function which need to be freed before returning.
   */
  protected final ArrayList<String> allocatedVariables;

  /**
   * A counter for the number of statement macros that have been created.
   * This is used for determining the names said macros.
   */
  private int nextStatementId = 0;

  /**
   * The instance of the program builder.
   */
  protected final ProgramBuilder program;

  /**
   * The system being converted into a C program.
   */
  protected final AlphaSystem system;

  /**
   * Protected constructor.
   */
  protected SystemConverter(final AlphaSystem system) {
    this.allocatedVariables = CollectionLiterals.<String>newArrayList();
    this.program = ProgramBuilder.start();
    this.system = system;
  }

  /**
   * Converts an Alpha system to the simplified C AST.
   * Only supports systems with a single body.
   */
  public static Program convert(final AlphaSystem system) {
    return new SystemConverter(system).convertSystem();
  }

  /**
   * Converts an Alpha system to the simplified C AST.
   * Only supports systems with a single body.
   */
  protected Program convertSystem() {
    int _size = this.system.getSystemBodies().size();
    boolean _notEquals = (_size != 1);
    if (_notEquals) {
      int _size_1 = this.system.getSystemBodies().size();
      String _plus = ("Only systems with one body are supported, but this system has " + Integer.valueOf(_size_1));
      String _plus_1 = (_plus + ".");
      throw new IllegalArgumentException(_plus_1);
    }
    final SystemBody systemBody = this.system.getSystemBodies().get(0);
    final Function1<Equation, Boolean> _function = (Equation it) -> {
      return Boolean.valueOf((it instanceof UseEquation));
    };
    boolean _exists = IterableExtensions.<Equation>exists(systemBody.getEquations(), _function);
    if (_exists) {
      throw new IllegalArgumentException("Systems with \'use equations\' are not currently supported.");
    }
    final Function1<Equation, StandardEquation> _function_1 = (Equation it) -> {
      return ((StandardEquation) it);
    };
    final List<StandardEquation> equations = ListExtensions.<Equation, StandardEquation>map(systemBody.getEquations(), _function_1);
    final ProgramBuilder program = ProgramBuilder.start().addHeaderComment(((String[])Conversions.unwrapArray(Common.defaultHeaderComments(), String.class))).addInclude(((Include[])Conversions.unwrapArray(Common.defaultIncludes(), Include.class))).addFunctionMacro(((MacroStmt[])Conversions.unwrapArray(Common.defaultFunctionMacros(), MacroStmt.class)));
    final Consumer<String> _function_2 = (String it) -> {
      program.addGlobalVariable(true, Common.alphaIndexType(), it);
    };
    this.system.getParameterDomain().getParamNames().forEach(_function_2);
    final Consumer<Variable> _function_3 = (Variable it) -> {
      this.prepareAlphaVariable(it);
    };
    this.system.getVariables().forEach(_function_3);
    final Consumer<StandardEquation> _function_4 = (StandardEquation it) -> {
      this.createEvalFunction(it);
    };
    equations.forEach(_function_4);
    this.createEntryPoint();
    return program.getInstance();
  }

  /**
   * Declares global variables for the Alpha variable itself
   * and its associated flag variable (if needed).
   * Also creates the memory access macros needed for accessing values.
   */
  protected ProgramBuilder prepareAlphaVariable(final Variable variable) {
    ProgramBuilder _xblockexpression = null;
    {
      final ISLPWQPolynomial rank = MemoryUtils.rank(variable.getDomain());
      this.prepareVariable(variable, rank, false);
      ProgramBuilder _xifexpression = null;
      Boolean _isInput = variable.isInput();
      boolean _not = (!(_isInput).booleanValue());
      if (_not) {
        _xifexpression = this.prepareVariable(variable, rank, true);
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }

  /**
   * Declares a new global variable for either a standard Alpha variable
   * or for its flag variable, then constructs the memory macro
   * used to access values in that global variable.
   */
  protected ProgramBuilder prepareVariable(final Variable variable, final ISLPWQPolynomial rank, final boolean createFlag) {
    ProgramBuilder _xblockexpression = null;
    {
      String _xifexpression = null;
      if (createFlag) {
        _xifexpression = Common.getFlagName(variable);
      } else {
        _xifexpression = variable.getName();
      }
      final String name = _xifexpression;
      DataType _xifexpression_1 = null;
      if (createFlag) {
        _xifexpression_1 = Common.flagVariableType();
      } else {
        _xifexpression_1 = Common.alphaVariableType();
      }
      final DataType type = _xifexpression_1;
      this.program.addGlobalVariable(true, type, name);
      final ParenthesizedExpr accessExpression = PolynomialConverter.convert(rank);
      final ArrayAccessExpr macroReplacement = Factory.arrayAccessExpr(name, accessExpression);
      final MacroStmt macro = Factory.macroStmt(name, ((String[])Conversions.unwrapArray(variable.getDomain().getIndexNames(), String.class)), macroReplacement);
      _xblockexpression = this.program.addMemoryMacro(macro);
    }
    return _xblockexpression;
  }

  /**
   * Creates a function which can evaluate either a local or output Alpha variable
   * at some point in its domain, returning the computed (or fetched) value.
   */
  protected ProgramBuilder createEvalFunction(final StandardEquation equation) {
    ProgramBuilder _xblockexpression = null;
    {
      final Variable variable = equation.getVariable();
      final FunctionBuilder evalBuilder = FunctionBuilder.start(Common.alphaValueType(), Common.getEvalName(variable));
      final Consumer<String> _function = (String it) -> {
        evalBuilder.addParameter(Common.alphaIndexType(), it);
      };
      variable.getDomain().getIndexNames().forEach(_function);
      final IfStmt flagCheckingBlock = this.getFlagCheckingBlock(equation);
      evalBuilder.addComment("Check the flags.").addStatement(flagCheckingBlock).addEmptyLine().addReturn(SystemConverter.identityAccess(variable, false));
      _xblockexpression = this.program.addFunction(evalBuilder.getInstance());
    }
    return _xblockexpression;
  }

  /**
   * Constructs the "if" statement block that checks the status of the flags variable and
   * evaluates the variable if needed, or reports a self-dependence if detected.
   */
  protected IfStmt getFlagCheckingBlock(final StandardEquation equation) {
    final Variable variable = equation.getVariable();
    return IfStmtBuilder.start(SystemConverter.ifFlagEquals(variable, FlagStatus.NOT_EVALUATED)).addStatement(
      SystemConverter.setFlagTo(variable, FlagStatus.IN_PROGRESS), 
      Factory.assignmentStmt(SystemConverter.identityAccess(variable, false), ExprConverter.convertExpr(this.program, equation.getExpr())), 
      SystemConverter.setFlagTo(variable, FlagStatus.EVALUATED)).startElseIf(SystemConverter.ifFlagEquals(variable, FlagStatus.IN_PROGRESS)).addStatement(
      SystemConverter.getSelfDependencePrintfStmt(variable), 
      Factory.callStmt("exit", Factory.customExpr("-1"))).getInstance();
  }

  /**
   * Gets the expression to check if a flags variable is set to a given value.
   */
  protected static BinaryExpr ifFlagEquals(final Variable variable, final FlagStatus flagStatus) {
    return Factory.binaryExpr(BinaryOperator.EQ, SystemConverter.identityAccess(variable, true), Common.toExpr(flagStatus));
  }

  /**
   * Gets the statement that sets a flags variable to a given value.
   */
  protected static AssignmentStmt setFlagTo(final Variable variable, final FlagStatus flagStatus) {
    return Factory.assignmentStmt(SystemConverter.identityAccess(variable, true), Common.toExpr(flagStatus));
  }

  /**
   * Gets the expression used to access a variable (or its flag).
   */
  protected static CallExpr identityAccess(final Variable variable, final boolean accessFlags) {
    String _xifexpression = null;
    if (accessFlags) {
      _xifexpression = Common.getFlagName(variable);
    } else {
      _xifexpression = variable.getName();
    }
    final String name = _xifexpression;
    return Factory.callExpr(name, ((String[])Conversions.unwrapArray(variable.getDomain().getIndexNames(), String.class)));
  }

  /**
   * Gets the "printf" statement that tells the user a self dependence was found (and where it was).
   */
  protected static ExpressionStmt getSelfDependencePrintfStmt(final Variable variable) {
    int _nbIndices = variable.getDomain().getNbIndices();
    final Function1<Integer, String> _function = (Integer it) -> {
      return "%ld";
    };
    final String locationFormat = IterableExtensions.join(IterableExtensions.<Integer, String>map(new ExclusiveRange(0, _nbIndices, true), _function), ",");
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\"There is a self dependence on ");
    String _name = variable.getName();
    _builder.append(_name);
    _builder.append(" at (");
    _builder.append(locationFormat);
    _builder.append(")\\n\"");
    final String message = _builder.toString();
    final ArrayList<String> args = CollectionLiterals.<String>newArrayList();
    args.add(message.toString());
    args.addAll(variable.getDomain().getIndexNames());
    return Factory.callStmt("printf", ((String[])Conversions.unwrapArray(args, String.class)));
  }

  /**
   * Creates the function used as the entry point of the function.
   */
  protected ProgramBuilder createEntryPoint() {
    ProgramBuilder _xblockexpression = null;
    {
      final FunctionBuilder builder = this.allocateMemory(SystemConverter.checkParameters(SystemConverter.prepareEntryArguments(FunctionBuilder.start(BaseDataType.VOID, this.system.getName()), this.system), this.system), this.system);
      builder.addComment("Evaluate all the outputs.");
      final Consumer<Variable> _function = (Variable it) -> {
        this.evaluateAllPoints(builder, it);
      };
      this.system.getOutputs().forEach(_function);
      builder.addEmptyLine();
      builder.addComment("Free all allocated memory.");
      final Function1<String, ExpressionStmt> _function_1 = (String it) -> {
        return Factory.callStmt("free", it);
      };
      builder.addStatement(((Statement[])Conversions.unwrapArray(ListExtensions.<String, ExpressionStmt>map(this.allocatedVariables, _function_1), Statement.class)));
      _xblockexpression = this.program.addFunction(builder.getInstance());
    }
    return _xblockexpression;
  }

  /**
   * Adds parameters to the function for all system parameters, inputs, and outputs,
   * then adds statements to the function which copy the function's arguments
   * to the global variables they're accessed from.
   */
  protected static FunctionBuilder prepareEntryArguments(final FunctionBuilder builder, final AlphaSystem system) {
    FunctionBuilder _xblockexpression = null;
    {
      builder.addComment("Copy arguments to the global variables.");
      final Consumer<String> _function = (String it) -> {
        SystemConverter.prepareEntryArgument(builder, it, Common.alphaIndexType());
      };
      system.getParameterDomain().getParamNames().forEach(_function);
      final Consumer<Variable> _function_1 = (Variable it) -> {
        SystemConverter.prepareEntryArgument(builder, it.getName(), Common.alphaVariableType());
      };
      system.getInputs().forEach(_function_1);
      final Consumer<Variable> _function_2 = (Variable it) -> {
        SystemConverter.prepareEntryArgument(builder, it.getName(), Common.alphaVariableType());
      };
      system.getOutputs().forEach(_function_2);
      _xblockexpression = builder.addEmptyLine();
    }
    return _xblockexpression;
  }

  /**
   * Adds a parameter to the function and the assignment statement needed to copy it to the global variable.
   */
  protected static FunctionBuilder prepareEntryArgument(final FunctionBuilder builder, final String name, final DataType type) {
    FunctionBuilder _xblockexpression = null;
    {
      final String argName = ("_local_" + name);
      builder.addParameter(type, argName);
      final AssignmentStmt copyStmt = Factory.assignmentStmt(name, argName);
      _xblockexpression = builder.addStatement(copyStmt);
    }
    return _xblockexpression;
  }

  /**
   * Adds the "if" statements needed to check that the parameters are valid.
   */
  protected static FunctionBuilder checkParameters(final FunctionBuilder builder, final AlphaSystem system) {
    FunctionBuilder _xblockexpression = null;
    {
      final Expression isValid = ConditionalConverter.convert(system.getParameterDomain());
      final IfStmt parameterCheck = IfStmtBuilder.start(Factory.unaryExpr(UnaryOperator.NOT, isValid)).addStatement(
        Factory.callStmt("printf", "\"The value of the parameters are invalid.\\n\""), 
        Factory.callStmt("exit", "-1")).getInstance();
      _xblockexpression = builder.addComment("Check parameter validity.").addStatement(parameterCheck).addEmptyLine();
    }
    return _xblockexpression;
  }

  /**
   * Adds the statements needed to allocate memory for the Alpha variables and any necessary flags.
   */
  protected FunctionBuilder allocateMemory(final FunctionBuilder builder, final AlphaSystem system) {
    FunctionBuilder _xblockexpression = null;
    {
      builder.addComment("Allocate memory for local storage.");
      final Consumer<Variable> _function = (Variable it) -> {
        this.allocateMemory(builder, it, false);
      };
      system.getLocals().forEach(_function);
      builder.addEmptyLine();
      builder.addComment("Allocate and initialize flag variables.");
      final Consumer<Variable> _function_1 = (Variable it) -> {
        this.allocateMemory(builder, it, true);
      };
      system.getOutputs().forEach(_function_1);
      final Consumer<Variable> _function_2 = (Variable it) -> {
        this.allocateMemory(builder, it, true);
      };
      system.getLocals().forEach(_function_2);
      _xblockexpression = builder.addEmptyLine();
    }
    return _xblockexpression;
  }

  /**
   * Adds the calls to "malloc", "mallocCheck", and "memset" as needed
   * for an Alpha variable or its flag variable.
   */
  protected FunctionBuilder allocateMemory(final FunctionBuilder builder, final Variable variable, final boolean allocateFlag) {
    FunctionBuilder _xblockexpression = null;
    {
      String _xifexpression = null;
      if (allocateFlag) {
        _xifexpression = Common.getFlagName(variable);
      } else {
        _xifexpression = variable.getName();
      }
      final String name = _xifexpression;
      DataType _xifexpression_1 = null;
      if (allocateFlag) {
        _xifexpression_1 = Common.flagVariableType();
      } else {
        _xifexpression_1 = Common.alphaValueType();
      }
      final DataType dataType = _xifexpression_1;
      this.allocatedVariables.add(name);
      final ISLPWQPolynomial cardinality = BarvinokBindings.card(variable.getDomain());
      final CastExpr mallocCall = Factory.mallocCall(dataType, PolynomialConverter.convert(cardinality));
      builder.addStatement(Factory.assignmentStmt(name, mallocCall));
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("\"");
      _builder.append(name);
      _builder.append("\"");
      final CustomExpr nameStringExpr = Factory.customExpr(_builder.toString());
      builder.addStatement(Factory.callStmt("mallocCheck", Factory.customExpr(name), nameStringExpr));
      FunctionBuilder _xifexpression_2 = null;
      if (allocateFlag) {
        FunctionBuilder _xblockexpression_1 = null;
        {
          final CustomExpr flagStatusExpr = Common.toExpr(FlagStatus.NOT_EVALUATED);
          _xblockexpression_1 = builder.addStatement(Factory.callStmt("memset", Factory.customExpr(name), flagStatusExpr, PolynomialConverter.convert(cardinality)));
        }
        _xifexpression_2 = _xblockexpression_1;
      }
      _xblockexpression = _xifexpression_2;
    }
    return _xblockexpression;
  }

  /**
   * Evaluates all the points within an output variable.
   */
  protected FunctionBuilder evaluateAllPoints(final FunctionBuilder builder, final Variable variable) {
    FunctionBuilder _xblockexpression = null;
    {
      final String macroName = ("S" + Integer.valueOf(this.nextStatementId));
      int _nextStatementId = this.nextStatementId;
      this.nextStatementId = (_nextStatementId + 1);
      final CallExpr callEval = Factory.callExpr(Common.getEvalName(variable), ((String[])Conversions.unwrapArray(variable.getDomain().getIndexNames(), String.class)));
      final MacroStmt macro = Factory.macroStmt(macroName, ((String[])Conversions.unwrapArray(variable.getDomain().getIndexNames(), String.class)), callEval);
      builder.addStatement(macro);
      final Iterable<Statement> loopStmt = LoopGenerator.generateLoops(macroName, variable.getDomain());
      builder.addStatement(((Statement[])Conversions.unwrapArray(loopStmt, Statement.class)));
      _xblockexpression = builder.addStatement(Factory.undefStmt(macroName));
    }
    return _xblockexpression;
  }
}
