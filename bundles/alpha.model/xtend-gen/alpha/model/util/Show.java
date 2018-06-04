package alpha.model.util;

import alpha.model.AbstractReduceExpression;
import alpha.model.AlphaConstant;
import alpha.model.AlphaElement;
import alpha.model.AlphaExpression;
import alpha.model.AlphaPackage;
import alpha.model.AlphaRoot;
import alpha.model.AlphaSystem;
import alpha.model.AlphaVisitable;
import alpha.model.ArgReduceExpression;
import alpha.model.AutoRestrictExpression;
import alpha.model.BINARY_OP;
import alpha.model.BinaryCalculatorExpression;
import alpha.model.BinaryExpression;
import alpha.model.BooleanExpression;
import alpha.model.CALCULATOR_BINARY_OP;
import alpha.model.CALCULATOR_UNARY_OP;
import alpha.model.CalculatorExpression;
import alpha.model.CaseExpression;
import alpha.model.ConvolutionExpression;
import alpha.model.DefinedObject;
import alpha.model.DependenceExpression;
import alpha.model.ExternalArgReduceExpression;
import alpha.model.ExternalFunction;
import alpha.model.ExternalMultiArgExpression;
import alpha.model.ExternalReduceExpression;
import alpha.model.IfExpression;
import alpha.model.Imports;
import alpha.model.IndexExpression;
import alpha.model.IntegerExpression;
import alpha.model.JNIDomain;
import alpha.model.JNIDomainInArrayNotation;
import alpha.model.JNIFunctionInArrayNotation;
import alpha.model.MultiArgExpression;
import alpha.model.REDUCTION_OP;
import alpha.model.RealExpression;
import alpha.model.RectangularDomain;
import alpha.model.ReduceExpression;
import alpha.model.RestrictExpression;
import alpha.model.SelectExpression;
import alpha.model.StandardEquation;
import alpha.model.UNARY_OP;
import alpha.model.UnaryCalculatorExpression;
import alpha.model.UnaryExpression;
import alpha.model.UseEquation;
import alpha.model.Variable;
import alpha.model.VariableDomain;
import alpha.model.VariableExpression;
import alpha.model.util.AlphaUtil;
import alpha.model.util.ModelSwitch;
import com.google.common.collect.Iterables;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLDimType;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLMultiAff;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLSet;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

/**
 * Prints the Alpha program in Show notation. The show notation
 * is mostly context-free and each node can be printed on its own.
 * The only exception is when printing the domains, the parameter
 * domain of the enclosing system is used to simplify the constraints.
 * 
 * For now, Show will completely remove the calculator expression.
 */
@SuppressWarnings("all")
public class Show extends ModelSwitch<String> {
  protected JNIISLSet parameterContext = null;
  
  public static <T extends AlphaVisitable> String print(final T av) {
    String _xblockexpression = null;
    {
      final Show show = new Show();
      _xblockexpression = show.doSwitch(av);
    }
    return _xblockexpression;
  }
  
  /**
   * CalculatorExpressions are printed differently depending on the context.
   */
  protected String printParameterDomain(final JNIDomain dom) {
    return dom.getIslString();
  }
  
  protected String printVariableDeclarationDomain(final JNIISLSet set) {
    String _xifexpression = null;
    int _nbDims = set.getNbDims(JNIISLDimType.isl_dim_set);
    boolean _equals = (_nbDims == 0);
    if (_equals) {
      _xifexpression = "";
    } else {
      _xifexpression = AlphaUtil.toShowString(set, this.parameterContext);
    }
    return _xifexpression;
  }
  
  protected String printUECallParams(final JNIFunctionInArrayNotation f) {
    return f.getAlphaString();
  }
  
  protected String printInstantiationDomain(final JNIISLSet set) {
    return AlphaUtil.toShowString(set, this.parameterContext);
  }
  
  protected String printWhileDomain(final JNIISLSet set) {
    return AlphaUtil.toShowString(set, this.parameterContext);
  }
  
  protected String printDomain(final JNIISLSet set) {
    return AlphaUtil.toShowString(set, this.parameterContext);
  }
  
  protected String printFunction(final JNIISLMultiAff f) {
    return AlphaUtil.toShowString(f);
  }
  
  protected String printRelation(final CalculatorExpression rel) {
    return rel.getISLObject().toString();
  }
  
  protected CharSequence printSubsystemCallParams(final JNIFunctionInArrayNotation f, final JNIISLSet instantiationDomain) {
    CharSequence _xblockexpression = null;
    {
      final JNIISLMultiAff maff = f.getISLMultiAff();
      StringConcatenation _builder = new StringConcatenation();
      String _aShowString = AlphaUtil.toAShowString(maff, instantiationDomain.getIndicesNames());
      _builder.append(_aShowString);
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  @Override
  public String caseAlphaRoot(final AlphaRoot root) {
    final Function1<AlphaElement, String> _function = (AlphaElement it) -> {
      return this.doSwitch(it);
    };
    return IterableExtensions.join(ListExtensions.<AlphaElement, String>map(root.getElements(), _function), "\n");
  }
  
  @Override
  public String caseAlphaConstant(final AlphaConstant ac) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("constant ");
    String _name = ac.getName();
    _builder.append(_name);
    _builder.append(" = ");
    int _value = ac.getValue();
    _builder.append(_value);
    return _builder.toString();
  }
  
  @Override
  public String caseExternalFunction(final ExternalFunction ef) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("external ");
    String _name = ef.getName();
    _builder.append(_name);
    _builder.append("(");
    int _cardinality = ef.getCardinality();
    _builder.append(_cardinality);
    _builder.append(")");
    return _builder.toString();
  }
  
  @Override
  public String caseImports(final Imports i) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import ");
    String _importedNamespace = i.getImportedNamespace();
    _builder.append(_importedNamespace);
    return _builder.toString();
  }
  
  @Override
  public String caseAlphaPackage(final AlphaPackage ap) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _name = ap.getName();
    _builder.append(_name);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    final Function1<AlphaElement, String> _function = (AlphaElement it) -> {
      return this.doSwitch(it);
    };
    String _join = IterableExtensions.join(ListExtensions.<AlphaElement, String>map(ap.getElements(), _function), "\n");
    _builder.append(_join, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    return _builder.toString();
  }
  
  @Override
  public String caseAlphaSystem(final AlphaSystem s) {
    String _xblockexpression = null;
    {
      this.parameterContext = s.getParameterDomain();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("affine ");
      String _name = s.getName();
      _builder.append(_name);
      _builder.append(" ");
      String _printParameterDomain = this.printParameterDomain(s.getParameterDomainExpr());
      _builder.append(_printParameterDomain);
      _builder.newLineIfNotEmpty();
      {
        boolean _isEmpty = s.getInputs().isEmpty();
        boolean _not = (!_isEmpty);
        if (_not) {
          _builder.append("\t");
          _builder.append("inputs");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("\t");
          final Function1<Variable, String> _function = (Variable it) -> {
            return this.doSwitch(it);
          };
          String _join = IterableExtensions.join(ListExtensions.<Variable, String>map(s.getInputs(), _function), "\n");
          _builder.append(_join, "\t\t");
          _builder.newLineIfNotEmpty();
        }
      }
      {
        boolean _isEmpty_1 = s.getOutputs().isEmpty();
        boolean _not_1 = (!_isEmpty_1);
        if (_not_1) {
          _builder.append("\t");
          _builder.append("outputs");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("\t");
          final Function1<Variable, String> _function_1 = (Variable it) -> {
            return this.doSwitch(it);
          };
          String _join_1 = IterableExtensions.join(ListExtensions.<Variable, String>map(s.getOutputs(), _function_1), "\n");
          _builder.append(_join_1, "\t\t");
          _builder.newLineIfNotEmpty();
        }
      }
      {
        boolean _isEmpty_2 = s.getLocals().isEmpty();
        boolean _not_2 = (!_isEmpty_2);
        if (_not_2) {
          _builder.append("\t");
          _builder.append("locals");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("\t");
          final Function1<Variable, String> _function_2 = (Variable it) -> {
            return this.doSwitch(it);
          };
          String _join_2 = IterableExtensions.join(ListExtensions.<Variable, String>map(s.getLocals(), _function_2), "\n");
          _builder.append(_join_2, "\t\t");
          _builder.newLineIfNotEmpty();
        }
      }
      {
        CalculatorExpression _whileDomainExpr = s.getWhileDomainExpr();
        boolean _tripleNotEquals = (_whileDomainExpr != null);
        if (_tripleNotEquals) {
          _builder.append("\t");
          _builder.append("over ");
          String _printInstantiationDomain = this.printInstantiationDomain(s.getWhileDomain());
          _builder.append(_printInstantiationDomain, "\t");
          _builder.append(" while (");
          String _doSwitch = this.doSwitch(s.getTestExpression());
          _builder.append(_doSwitch, "\t");
          _builder.append(")");
          _builder.newLineIfNotEmpty();
        }
      }
      {
        if (((!s.getUseEquations().isEmpty()) || (!s.getEquations().isEmpty()))) {
          _builder.append("\t");
          _builder.append("let");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("\t");
          EList<UseEquation> _useEquations = s.getUseEquations();
          EList<StandardEquation> _equations = s.getEquations();
          final Function1<AlphaVisitable, String> _function_3 = (AlphaVisitable it) -> {
            return this.doSwitch(it);
          };
          String _join_3 = IterableExtensions.join(IterableExtensions.<AlphaVisitable, String>map(Iterables.<AlphaVisitable>concat(_useEquations, _equations), _function_3), "\n\n");
          _builder.append(_join_3, "\t\t");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append(".");
      _builder.newLine();
      _xblockexpression = _builder.toString();
    }
    return _xblockexpression;
  }
  
  @Override
  public String caseVariable(final Variable v) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = v.getName();
    _builder.append(_name);
    _builder.append(" : ");
    String _printVariableDeclarationDomain = this.printVariableDeclarationDomain(v.getDomain());
    _builder.append(_printVariableDeclarationDomain);
    return _builder.toString();
  }
  
  @Override
  public String caseStandardEquation(final StandardEquation se) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = se.getVariable().getName();
    _builder.append(_name);
    _builder.append(" = ");
    String _doSwitch = this.doSwitch(se.getExpr());
    _builder.append(_doSwitch);
    _builder.append(";");
    return _builder.toString();
  }
  
  @Override
  public String caseUseEquation(final UseEquation ue) {
    String _xblockexpression = null;
    {
      String _xifexpression = null;
      if (((ue.getInstantiationDomainExpr() != null) && (ue.getInstantiationDomain().getNbDims() > 0))) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("over ");
        String _printInstantiationDomain = this.printInstantiationDomain(ue.getInstantiationDomain());
        _builder.append(_printInstantiationDomain);
        _builder.append(" : ");
        _xifexpression = _builder.toString();
      } else {
        StringConcatenation _builder_1 = new StringConcatenation();
        _xifexpression = _builder_1.toString();
      }
      final String idom = _xifexpression;
      final CharSequence callParam = this.printSubsystemCallParams(ue.getCallParamsExpr(), ue.getInstantiationDomain());
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append(idom);
      _builder_2.append("(");
      final Function1<AlphaExpression, String> _function = (AlphaExpression it) -> {
        return this.doSwitch(it);
      };
      String _join = IterableExtensions.join(ListExtensions.<AlphaExpression, String>map(ue.getOutputExprs(), _function), ", ");
      _builder_2.append(_join);
      _builder_2.append(") = ");
      String _name = ue.getSystem().getName();
      _builder_2.append(_name);
      _builder_2.append(callParam);
      _builder_2.append("(");
      final Function1<AlphaExpression, String> _function_1 = (AlphaExpression it) -> {
        return this.doSwitch(it);
      };
      String _join_1 = IterableExtensions.join(ListExtensions.<AlphaExpression, String>map(ue.getInputExprs(), _function_1), ", ");
      _builder_2.append(_join_1);
      _builder_2.append(");");
      _xblockexpression = _builder_2.toString();
    }
    return _xblockexpression;
  }
  
  /**
   * AlphaExpression
   */
  @Override
  public String caseIfExpression(final IfExpression ie) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("if ");
    String _doSwitch = this.doSwitch(ie.getCondExpr());
    _builder.append(_doSwitch);
    _builder.append(" then ");
    String _doSwitch_1 = this.doSwitch(ie.getThenExpr());
    _builder.append(_doSwitch_1);
    _builder.append(" else ");
    String _doSwitch_2 = this.doSwitch(ie.getElseExpr());
    _builder.append(_doSwitch_2);
    return _builder.toString();
  }
  
  @Override
  public String caseRestrictExpression(final RestrictExpression re) {
    String _xblockexpression = null;
    {
      String _xifexpression = null;
      if (((re.getDomainExpr() instanceof JNIDomain) || (re.getDomainExpr() instanceof JNIDomainInArrayNotation))) {
        _xifexpression = this.printDomain(re.getRestrictDomain());
      } else {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("{");
        String _printDomain = this.printDomain(re.getRestrictDomain());
        _builder.append(_printDomain);
        _builder.append("}");
        _xifexpression = _builder.toString();
      }
      final String domStr = _xifexpression;
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append(domStr);
      _builder_1.append(" : ");
      String _doSwitch = this.doSwitch(re.getExpr());
      _builder_1.append(_doSwitch);
      _xblockexpression = _builder_1.toString();
    }
    return _xblockexpression;
  }
  
  @Override
  public String caseAutoRestrictExpression(final AutoRestrictExpression are) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("auto : ");
    String _doSwitch = this.doSwitch(are.getExpr());
    _builder.append(_doSwitch);
    return _builder.toString();
  }
  
  @Override
  public String caseCaseExpression(final CaseExpression ce) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("case ");
    {
      String _name = ce.getName();
      boolean _tripleNotEquals = (_name != null);
      if (_tripleNotEquals) {
        String _name_1 = ce.getName();
        _builder.append(_name_1);
      }
    }
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    final Function1<AlphaExpression, CharSequence> _function = (AlphaExpression e) -> {
      return this.doSwitch(e);
    };
    String _join = IterableExtensions.<AlphaExpression>join(ce.getExprs(), "", ";\n", ";", _function);
    _builder.append(_join, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    return _builder.toString();
  }
  
  @Override
  public String caseDependenceExpression(final DependenceExpression de) {
    StringConcatenation _builder = new StringConcatenation();
    String _printFunction = this.printFunction(de.getFunction());
    _builder.append(_printFunction);
    _builder.append("@");
    String _doSwitch = this.doSwitch(de.getExpr());
    _builder.append(_doSwitch);
    return _builder.toString();
  }
  
  @Override
  public String caseIndexExpression(final IndexExpression ie) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("val ");
    String _printFunction = this.printFunction(ie.getFunction());
    _builder.append(_printFunction);
    return _builder.toString();
  }
  
  @Override
  public String caseReduceExpression(final ReduceExpression re) {
    return this.printAbstractReduceExpression(re);
  }
  
  @Override
  public String caseExternalReduceExpression(final ExternalReduceExpression ere) {
    return this.printAbstractReduceExpression(ere);
  }
  
  @Override
  public String caseArgReduceExpression(final ArgReduceExpression re) {
    return this.printAbstractReduceExpression(re);
  }
  
  @Override
  public String caseExternalArgReduceExpression(final ExternalArgReduceExpression ere) {
    return this.printAbstractReduceExpression(ere);
  }
  
  protected CharSequence _printReduceExpression(final ReduceExpression re, final String proj, final String body) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("reduce(");
    String _printReductionOP = this.printReductionOP(re.getOperator());
    _builder.append(_printReductionOP);
    _builder.append(", ");
    _builder.append(proj);
    _builder.append(", ");
    _builder.append(body);
    _builder.append(")");
    return _builder;
  }
  
  protected CharSequence _printReduceExpression(final ExternalReduceExpression ere, final String proj, final String body) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("reduce(");
    String _name = ere.getExternalFunction().getName();
    _builder.append(_name);
    _builder.append(", ");
    _builder.append(proj);
    _builder.append(", ");
    _builder.append(body);
    _builder.append(")");
    return _builder;
  }
  
  protected CharSequence _printReduceExpression(final ArgReduceExpression are, final String proj, final String body) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("argreduce(");
    String _printReductionOP = this.printReductionOP(are.getOperator());
    _builder.append(_printReductionOP);
    _builder.append(", ");
    _builder.append(proj);
    _builder.append(", ");
    _builder.append(body);
    _builder.append(")");
    return _builder;
  }
  
  protected CharSequence _printReduceExpression(final ExternalArgReduceExpression aere, final String proj, final String body) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("argreduce(");
    String _name = aere.getExternalFunction().getName();
    _builder.append(_name);
    _builder.append(", ");
    _builder.append(proj);
    _builder.append(", ");
    _builder.append(body);
    _builder.append(")");
    return _builder;
  }
  
  protected String printProjectionFunction(final JNIISLMultiAff maff) {
    return AlphaUtil.toShowString(maff);
  }
  
  protected String printReductionBody(final AlphaExpression expr) {
    return this.doSwitch(expr);
  }
  
  protected String printReductionOP(final REDUCTION_OP op) {
    if (op != null) {
      switch (op) {
        case SUM:
          return "+";
        case PROD:
          return "*";
        default:
          return op.getLiteral();
      }
    } else {
      return op.getLiteral();
    }
  }
  
  protected String printAbstractReduceExpression(final AbstractReduceExpression are) {
    String _xblockexpression = null;
    {
      final String proj = this.printProjectionFunction(are.getProjection());
      final String body = this.printReductionBody(are.getBody());
      _xblockexpression = this.printReduceExpression(are, proj, body).toString();
    }
    return _xblockexpression;
  }
  
  @Override
  public String caseConvolutionExpression(final ConvolutionExpression ce) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("conv(");
    String _printDomain = this.printDomain(ce.getKernelDomain());
    _builder.append(_printDomain);
    _builder.append(", ");
    String _doSwitch = this.doSwitch(ce.getKernelExpression());
    _builder.append(_doSwitch);
    _builder.append(", ");
    String _doSwitch_1 = this.doSwitch(ce.getDataExpression());
    _builder.append(_doSwitch_1);
    _builder.append(")");
    return _builder.toString();
  }
  
  @Override
  public String caseSelectExpression(final SelectExpression se) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("select ");
    String _printRelation = this.printRelation(se.getRelationExpr());
    _builder.append(_printRelation);
    _builder.append(" from ");
    String _doSwitch = this.doSwitch(se.getExpr());
    _builder.append(_doSwitch);
    return _builder.toString();
  }
  
  @Override
  public String caseBinaryExpression(final BinaryExpression be) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    String _doSwitch = this.doSwitch(be.getLeft());
    _builder.append(_doSwitch);
    _builder.append(" ");
    BINARY_OP _operator = be.getOperator();
    _builder.append(_operator);
    _builder.append(" ");
    String _doSwitch_1 = this.doSwitch(be.getRight());
    _builder.append(_doSwitch_1);
    _builder.append(")");
    return _builder.toString();
  }
  
  @Override
  public String caseMultiArgExpression(final MultiArgExpression mae) {
    StringConcatenation _builder = new StringConcatenation();
    REDUCTION_OP _operator = mae.getOperator();
    _builder.append(_operator);
    _builder.append("(");
    final Function1<AlphaExpression, String> _function = (AlphaExpression it) -> {
      return this.doSwitch(it);
    };
    String _join = IterableExtensions.join(ListExtensions.<AlphaExpression, String>map(mae.getExprs(), _function), ", ");
    _builder.append(_join);
    _builder.append(")");
    return _builder.toString();
  }
  
  @Override
  public String caseExternalMultiArgExpression(final ExternalMultiArgExpression emae) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = emae.getExternalFunction().getName();
    _builder.append(_name);
    _builder.append("(");
    final Function1<AlphaExpression, String> _function = (AlphaExpression it) -> {
      return this.doSwitch(it);
    };
    String _join = IterableExtensions.join(ListExtensions.<AlphaExpression, String>map(emae.getExprs(), _function), ", ");
    _builder.append(_join);
    _builder.append(")");
    return _builder.toString();
  }
  
  @Override
  public String caseUnaryExpression(final UnaryExpression ue) {
    StringConcatenation _builder = new StringConcatenation();
    UNARY_OP _operator = ue.getOperator();
    _builder.append(_operator);
    _builder.append(" ");
    String _doSwitch = this.doSwitch(ue.getExpr());
    _builder.append(_doSwitch);
    return _builder.toString();
  }
  
  @Override
  public String caseVariableExpression(final VariableExpression ve) {
    return ve.getVariable().getName();
  }
  
  @Override
  public String caseBooleanExpression(final BooleanExpression be) {
    return Boolean.valueOf(be.isValue()).toString();
  }
  
  @Override
  public String caseIntegerExpression(final IntegerExpression ie) {
    return Integer.valueOf(ie.getValue()).toString();
  }
  
  @Override
  public String caseRealExpression(final RealExpression re) {
    return Float.valueOf(re.getValue()).toString();
  }
  
  /**
   * CalculatorExpression
   */
  @Override
  public String caseBinaryCalculatorExpression(final BinaryCalculatorExpression bce) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    String _doSwitch = this.doSwitch(bce.getLeft());
    _builder.append(_doSwitch);
    _builder.append(" ");
    CALCULATOR_BINARY_OP _operator = bce.getOperator();
    _builder.append(_operator);
    _builder.append(" ");
    String _doSwitch_1 = this.doSwitch(bce.getRight());
    _builder.append(_doSwitch_1);
    _builder.append(")");
    return _builder.toString();
  }
  
  @Override
  public String caseUnaryCalculatorExpression(final UnaryCalculatorExpression uce) {
    StringConcatenation _builder = new StringConcatenation();
    CALCULATOR_UNARY_OP _operator = uce.getOperator();
    _builder.append(_operator);
    _builder.append(" ");
    String _doSwitch = this.doSwitch(uce.getExpr());
    _builder.append(_doSwitch);
    _builder.append(")");
    return _builder.toString();
  }
  
  @Override
  public String caseVariableDomain(final VariableDomain vd) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{ ");
    String _name = vd.getVariable().getName();
    _builder.append(_name);
    _builder.append(" }");
    return _builder.toString();
  }
  
  @Override
  public String caseRectangularDomain(final RectangularDomain rd) {
    String _xblockexpression = null;
    {
      String _xifexpression = null;
      if (((rd.getIndexNames() != null) && (((Object[])Conversions.unwrapArray(rd.getIndexNames(), Object.class)).length == ((Object[])Conversions.unwrapArray(rd.getUpperBounds(), Object.class)).length))) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("as [");
        String _join = IterableExtensions.join(rd.getIndexNames(), ",");
        _builder.append(_join);
        _builder.append("]");
        _xifexpression = _builder.toString();
      } else {
        StringConcatenation _builder_1 = new StringConcatenation();
        _xifexpression = _builder_1.toString();
      }
      final String inames = _xifexpression;
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("[");
      String _join_1 = IterableExtensions.join(rd.getUpperBounds(), ",");
      _builder_2.append(_join_1);
      _builder_2.append("] ");
      _builder_2.append(inames);
      _xblockexpression = _builder_2.toString();
    }
    return _xblockexpression;
  }
  
  @Override
  public String caseDefinedObject(final DefinedObject dobj) {
    return dobj.getObject().getName();
  }
  
  protected CharSequence printReduceExpression(final AbstractReduceExpression aere, final String proj, final String body) {
    if (aere instanceof ExternalArgReduceExpression) {
      return _printReduceExpression((ExternalArgReduceExpression)aere, proj, body);
    } else if (aere instanceof ExternalReduceExpression) {
      return _printReduceExpression((ExternalReduceExpression)aere, proj, body);
    } else if (aere instanceof ArgReduceExpression) {
      return _printReduceExpression((ArgReduceExpression)aere, proj, body);
    } else if (aere instanceof ReduceExpression) {
      return _printReduceExpression((ReduceExpression)aere, proj, body);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(aere, proj, body).toString());
    }
  }
}
