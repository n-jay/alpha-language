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
import alpha.codegen.Function;
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
import alpha.codegen.VariableDecl;
import alpha.codegen.isl.ASTConversionResult;
import alpha.codegen.isl.ASTConverter;
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
import alpha.model.transformation.Normalize;
import alpha.model.transformation.StandardizeNames;
import alpha.model.util.AlphaUtil;
import fr.irisa.cairn.jnimap.barvinok.BarvinokBindings;
import fr.irisa.cairn.jnimap.isl.ISLASTNode;
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
   * Flag to indicate that the C code being output should be compatible
   * with the wrapper produced by the older AlphaZ.
   */
  protected final boolean oldAlphaZCompatible;

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
  protected SystemConverter(final AlphaSystem system, final boolean oldAlphaZCompatible) {
    this.allocatedVariables = CollectionLiterals.<String>newArrayList();
    this.oldAlphaZCompatible = oldAlphaZCompatible;
    this.program = ProgramBuilder.start();
    this.system = system;
  }

  /**
   * Converts an Alpha system to the simplified C AST.
   * Only supports systems with a single body.
   */
  public static Program convert(final AlphaSystem system) {
    return SystemConverter.convert(system, false);
  }

  /**
   * Converts an Alpha system to the simplified C AST.
   * Only supports systems with a single body.
   * 
   * If requested, the code produced will aim for compatibility with
   * the older version of AlphaZ (although with no guarantees).
   * This means that the inputs to the entry point will assume
   * that memory for the system's inputs and outputs were allocated
   * via the bounding box method, as opposed to linearized memory.
   * 
   * Note: since the newer Alpha language doesn't have typing,
   * all indices are assumed to be of type "long",
   * and all data values are of type "float".
   */
  public static Program convert(final AlphaSystem system, final boolean oldAlphaZCompatible) {
    final AlphaSystem duplicate = AlphaUtil.<AlphaSystem>copyAE(system);
    Normalize.apply(duplicate);
    StandardizeNames.apply(duplicate);
    return new SystemConverter(duplicate, oldAlphaZCompatible).convertSystem();
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
    this.program.addHeaderComment(((String[])Conversions.unwrapArray(Common.defaultHeaderComments(), String.class))).addInclude(((Include[])Conversions.unwrapArray(Common.defaultIncludes(), Include.class))).addFunctionMacro(((MacroStmt[])Conversions.unwrapArray(Common.defaultFunctionMacros(), MacroStmt.class)));
    final Consumer<String> _function_2 = (String it) -> {
      this.program.addGlobalVariable(true, Common.alphaIndexType(), it);
    };
    this.system.getParameterDomain().getParamNames().forEach(_function_2);
    final Consumer<Variable> _function_3 = (Variable it) -> {
      this.prepareAlphaVariable(it);
    };
    this.system.getVariables().forEach(_function_3);
    for (final StandardEquation eq : equations) {
      this.createEvalFunction(eq);
    }
    final Function entryPoint = this.freeAllocatedVariables(this.evaluateOutputs(this.allocateMemory(this.checkParameters(this.prepareEntryArguments(FunctionBuilder.start(BaseDataType.VOID, this.system.getName())))))).getInstance();
    this.program.addFunction(entryPoint);
    return this.program.getInstance();
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
      if ((this.oldAlphaZCompatible && ((variable.isInput()).booleanValue() || (variable.isOutput()).booleanValue()))) {
        this.prepareOldAlphaZCompatibleVariable(variable);
      } else {
        this.prepareVariable(variable, rank, false);
      }
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
   * Declares a new global variable for an Alpha input or output variable
   * and creates its memory macro.
   * 
   * Note: this is ONLY intended for compatibility with the older version
   * of AlphaZ, where memory is allocated as a multi-dimensional bounding
   * box for the variable in question. This may result in negative indexing,
   * which does not work correctly.
   */
  protected ProgramBuilder prepareOldAlphaZCompatibleVariable(final Variable variable) {
    ProgramBuilder _xblockexpression = null;
    {
      final String name = variable.getName();
      final DataType type = Common.alphaVariableType();
      type.setIndirectionLevel(variable.getDomain().getNbIndices());
      this.program.addGlobalVariable(true, type, name);
      final ArrayAccessExpr arrayAccess = Factory.arrayAccessExpr(variable.getName(), ((String[])Conversions.unwrapArray(variable.getDomain().getIndexNames(), String.class)));
      final MacroStmt macro = Factory.macroStmt(name, ((String[])Conversions.unwrapArray(variable.getDomain().getIndexNames(), String.class)), arrayAccess);
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
      final FunctionBuilder evalBuilder = FunctionBuilder.start(Common.alphaValueType(), Common.getEvalName(equation.getVariable()));
      final List<String> indexNames = equation.getExpr().getContextDomain().getIndexNames();
      final Consumer<String> _function = (String it) -> {
        evalBuilder.addParameter(Common.alphaIndexType(), it);
      };
      indexNames.forEach(_function);
      final IfStmt flagCheckingBlock = this.getFlagCheckingBlock(equation);
      evalBuilder.addComment("Check the flags.").addStatement(flagCheckingBlock).addEmptyLine().addReturn(SystemConverter.identityAccess(equation, false));
      _xblockexpression = this.program.addFunction(evalBuilder.getInstance());
    }
    return _xblockexpression;
  }

  /**
   * Constructs the "if" statement block that checks the status of the flags variable and
   * evaluates the variable if needed, or reports a self-dependence if detected.
   */
  protected IfStmt getFlagCheckingBlock(final StandardEquation equation) {
    final Expression computeValue = ExprConverter.convertExpr(this.program, equation.getExpr());
    final AssignmentStmt computeAndStore = Factory.assignmentStmt(SystemConverter.identityAccess(equation, false), computeValue);
    return IfStmtBuilder.start(SystemConverter.ifFlagEquals(equation, FlagStatus.NOT_EVALUATED)).addStatement(
      SystemConverter.setFlagTo(equation, FlagStatus.IN_PROGRESS), computeAndStore, 
      SystemConverter.setFlagTo(equation, FlagStatus.EVALUATED)).startElseIf(SystemConverter.ifFlagEquals(equation, FlagStatus.IN_PROGRESS)).addStatement(
      SystemConverter.getSelfDependencePrintfStmt(equation), 
      Factory.exitCall((-1))).getInstance();
  }

  /**
   * Gets the expression to check if a flags variable is set to a given value.
   */
  protected static BinaryExpr ifFlagEquals(final StandardEquation equation, final FlagStatus flagStatus) {
    return Factory.binaryExpr(BinaryOperator.EQ, SystemConverter.identityAccess(equation, true), Common.toExpr(flagStatus));
  }

  /**
   * Gets the statement that sets a flags variable to a given value.
   */
  protected static AssignmentStmt setFlagTo(final StandardEquation equation, final FlagStatus flagStatus) {
    return Factory.assignmentStmt(SystemConverter.identityAccess(equation, true), Common.toExpr(flagStatus));
  }

  /**
   * Gets the expression used to access a variable (or its flag).
   */
  protected static CallExpr identityAccess(final StandardEquation equation, final boolean accessFlags) {
    String _xifexpression = null;
    if (accessFlags) {
      _xifexpression = Common.getFlagName(equation.getVariable());
    } else {
      _xifexpression = equation.getVariable().getName();
    }
    final String name = _xifexpression;
    return Factory.callExpr(name, ((String[])Conversions.unwrapArray(equation.getExpr().getContextDomain().getIndexNames(), String.class)));
  }

  /**
   * Gets the "printf" statement that tells the user a self dependence was found (and where it was).
   */
  protected static ExpressionStmt getSelfDependencePrintfStmt(final StandardEquation equation) {
    int _nbIndices = equation.getExpr().getContextDomain().getNbIndices();
    final Function1<Integer, String> _function = (Integer it) -> {
      return "%ld";
    };
    final String locationFormat = IterableExtensions.join(IterableExtensions.<Integer, String>map(new ExclusiveRange(0, _nbIndices, true), _function), ",");
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\"There is a self dependence on ");
    String _name = equation.getVariable().getName();
    _builder.append(_name);
    _builder.append(" at (");
    _builder.append(locationFormat);
    _builder.append(")\\n\"");
    final String message = _builder.toString();
    return Factory.printfCall(message, ((String[])Conversions.unwrapArray(equation.getExpr().getContextDomain().getIndexNames(), String.class)));
  }

  /**
   * Adds parameters to the function for all system parameters, inputs, and outputs,
   * then adds statements to the function which copy the function's arguments
   * to the global variables they're accessed from.
   */
  protected FunctionBuilder prepareEntryArguments(final FunctionBuilder builder) {
    FunctionBuilder _xblockexpression = null;
    {
      builder.addComment("Copy arguments to the global variables.");
      final Consumer<String> _function = (String it) -> {
        SystemConverter.prepareEntryArgument(builder, it, Common.alphaIndexType());
      };
      this.system.getParameterDomain().getParamNames().forEach(_function);
      final Consumer<Variable> _function_1 = (Variable it) -> {
        SystemConverter.prepareEntryArgument(builder, it.getName(), Common.alphaVariableType());
      };
      this.system.getInputs().forEach(_function_1);
      final Consumer<Variable> _function_2 = (Variable it) -> {
        SystemConverter.prepareEntryArgument(builder, it.getName(), Common.alphaVariableType());
      };
      this.system.getOutputs().forEach(_function_2);
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
  protected FunctionBuilder checkParameters(final FunctionBuilder builder) {
    FunctionBuilder _xblockexpression = null;
    {
      final Expression isValid = ConditionalConverter.convert(this.system.getParameterDomain());
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
  protected FunctionBuilder allocateMemory(final FunctionBuilder builder) {
    FunctionBuilder _xblockexpression = null;
    {
      builder.addComment("Allocate memory for local storage.");
      final Consumer<Variable> _function = (Variable it) -> {
        this.allocateMemory(builder, it, false);
      };
      this.system.getLocals().forEach(_function);
      builder.addEmptyLine();
      builder.addComment("Allocate and initialize flag variables.");
      final Consumer<Variable> _function_1 = (Variable it) -> {
        this.allocateMemory(builder, it, true);
      };
      this.system.getOutputs().forEach(_function_1);
      final Consumer<Variable> _function_2 = (Variable it) -> {
        this.allocateMemory(builder, it, true);
      };
      this.system.getLocals().forEach(_function_2);
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
   * Frees all allocated variables.
   */
  protected FunctionBuilder freeAllocatedVariables(final FunctionBuilder builder) {
    FunctionBuilder _xblockexpression = null;
    {
      builder.addComment("Free all allocated memory.");
      final Function1<String, ExpressionStmt> _function = (String it) -> {
        return Factory.callStmt("free", it);
      };
      _xblockexpression = builder.addStatement(((Statement[])Conversions.unwrapArray(ListExtensions.<String, ExpressionStmt>map(this.allocatedVariables, _function), Statement.class)));
    }
    return _xblockexpression;
  }

  /**
   * Evaluates all points of all outputs of the system.
   */
  protected FunctionBuilder evaluateOutputs(final FunctionBuilder builder) {
    FunctionBuilder _xblockexpression = null;
    {
      builder.addComment("Evaluate all the outputs.");
      final Consumer<Variable> _function = (Variable it) -> {
        this.evaluateAllPoints(builder, it);
      };
      this.system.getOutputs().forEach(_function);
      _xblockexpression = builder.addEmptyLine();
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
      final ISLASTNode islAST = LoopGenerator.generateLoops(macroName, variable.getDomain());
      final ASTConversionResult loopResult = ASTConverter.convert(islAST);
      final Function1<String, VariableDecl> _function = (String it) -> {
        return SystemConverter.declareIndexVariable(it);
      };
      builder.addVariable(((VariableDecl[])Conversions.unwrapArray(ListExtensions.<String, VariableDecl>map(loopResult.getDeclarations(), _function), VariableDecl.class))).addStatement(((Statement[])Conversions.unwrapArray(loopResult.getStatements(), Statement.class)));
      _xblockexpression = builder.addStatement(Factory.undefStmt(macroName));
    }
    return _xblockexpression;
  }

  /**
   * Declares a variable to use for indexing Alpha variables.
   */
  protected static VariableDecl declareIndexVariable(final String name) {
    return Factory.variableDecl(Common.alphaIndexType(), name);
  }
}
