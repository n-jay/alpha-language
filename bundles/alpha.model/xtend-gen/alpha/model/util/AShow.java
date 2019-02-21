package alpha.model.util;

import alpha.model.AbstractReduceExpression;
import alpha.model.AlphaExpression;
import alpha.model.AlphaVisitable;
import alpha.model.ConstantExpression;
import alpha.model.ConvolutionExpression;
import alpha.model.DependenceExpression;
import alpha.model.IndexExpression;
import alpha.model.SelectExpression;
import alpha.model.StandardEquation;
import alpha.model.UseEquation;
import alpha.model.VariableExpression;
import alpha.model.util.AlphaPrintingUtil;
import alpha.model.util.Show;
import com.google.common.collect.Iterables;
import com.google.common.collect.Streams;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLDimType;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLMultiAff;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.Stack;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

/**
 * AShow prints the given program in ArrayNotation.
 * 
 * It largely follows Show with two main differences:<ul>
 * <li>Domains and functions are printed with ArrayNotation that relies on context.</li>
 * <li>The available context information is tracked by overriding some of the cases.</li>
 * </ul>
 */
@SuppressWarnings("all")
public class AShow extends Show {
  protected List<String> indexNameContext;
  
  protected Stack<List<String>> contextHistory = new Stack<List<String>>();
  
  private Show show = new Show();
  
  public static <T extends AlphaVisitable> String print(final T av) {
    String _xblockexpression = null;
    {
      final AShow ashow = new AShow();
      _xblockexpression = ashow.doSwitch(av).toString();
    }
    return _xblockexpression;
  }
  
  @Override
  protected String printDomain(final JNIISLSet set) {
    return AlphaPrintingUtil.toAShowString(set, this.parameterContext, this.indexNameContext);
  }
  
  @Override
  public String printFunction(final JNIISLMultiAff f) {
    return AlphaPrintingUtil.toAShowString(f, this.indexNameContext);
  }
  
  protected String printDomainInShowSytanxWithIndexNameContext(final JNIISLSet set) {
    return AlphaPrintingUtil.toShowString(set, this.parameterContext, this.indexNameContext);
  }
  
  /**
   * CalculatorExpressions are printed differently depending on the context.
   */
  @Override
  public CharSequence caseStandardEquation(final StandardEquation se) {
    CharSequence _xblockexpression = null;
    {
      this.indexNameContext = se.getVariable().getDomain().getIndicesNames();
      String _xifexpression = null;
      int _length = ((Object[])Conversions.unwrapArray(this.indexNameContext, Object.class)).length;
      boolean _greaterThan = (_length > 0);
      if (_greaterThan) {
        String _join = IterableExtensions.join(this.indexNameContext, ",");
        String _plus = ("[" + _join);
        _xifexpression = (_plus + "]");
      } else {
        _xifexpression = "";
      }
      final String indices = _xifexpression;
      StringConcatenation _builder = new StringConcatenation();
      String _name = se.getVariable().getName();
      _builder.append(_name);
      _builder.append(indices);
      _builder.append(" = ");
      CharSequence _doSwitch = this.doSwitch(se.getExpr());
      _builder.append(_doSwitch);
      _builder.append(";");
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  @Override
  public CharSequence caseUseEquation(final UseEquation ue) {
    CharSequence _xblockexpression = null;
    {
      EList<AlphaExpression> _inputExprs = ue.getInputExprs();
      EList<AlphaExpression> _outputExprs = ue.getOutputExprs();
      final Function1<AlphaExpression, List<String>> _function = (AlphaExpression e) -> {
        return e.getContextDomain().getIndicesNames();
      };
      final Function1<List<String>, Integer> _function_1 = (List<String> n) -> {
        return Integer.valueOf(((Object[])Conversions.unwrapArray(n, Object.class)).length);
      };
      final List<String> names = IterableExtensions.<List<String>, Integer>maxBy(IterableExtensions.<AlphaExpression, List<String>>map(Iterables.<AlphaExpression>concat(_inputExprs, _outputExprs), _function), _function_1);
      final boolean idomDeclared = ((ue.getInstantiationDomainExpr() != null) && (ue.getInstantiationDomain().getNbDims() > 0));
      List<String> _xifexpression = null;
      if (idomDeclared) {
        _xifexpression = names.subList(ue.getInstantiationDomain().getNbDims(), ((Object[])Conversions.unwrapArray(names, Object.class)).length);
      } else {
        _xifexpression = names;
      }
      final List<String> withNames = _xifexpression;
      String _xifexpression_1 = null;
      if (idomDeclared) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("over ");
        String _printInstantiationDomain = this.printInstantiationDomain(ue.getInstantiationDomain());
        _builder.append(_printInstantiationDomain);
        _xifexpression_1 = _builder.toString();
      } else {
        StringConcatenation _builder_1 = new StringConcatenation();
        _xifexpression_1 = _builder_1.toString();
      }
      final String idom = _xifexpression_1;
      this.indexNameContext = names;
      final CharSequence callParam = this.printSubsystemCallParams(ue.getCallParamsExpr(), ue.getInstantiationDomain());
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append(idom);
      _builder_2.append(" with [");
      String _join = IterableExtensions.join(withNames, ",");
      _builder_2.append(_join);
      _builder_2.append("] : (");
      final Function1<AlphaExpression, CharSequence> _function_2 = (AlphaExpression it) -> {
        return this.doSwitch(it);
      };
      String _join_1 = IterableExtensions.join(ListExtensions.<AlphaExpression, CharSequence>map(ue.getOutputExprs(), _function_2), ", ");
      _builder_2.append(_join_1);
      _builder_2.append(") = ");
      String _name = ue.getSystem().getName();
      _builder_2.append(_name);
      _builder_2.append(callParam);
      _builder_2.append("(");
      final Function1<AlphaExpression, CharSequence> _function_3 = (AlphaExpression it) -> {
        return this.doSwitch(it);
      };
      String _join_2 = IterableExtensions.join(ListExtensions.<AlphaExpression, CharSequence>map(ue.getInputExprs(), _function_3), ", ");
      _builder_2.append(_join_2);
      _builder_2.append(");");
      _xblockexpression = _builder_2;
    }
    return _xblockexpression;
  }
  
  /**
   * AlphaExpression
   */
  @Override
  public CharSequence caseDependenceExpression(final DependenceExpression de) {
    CharSequence _xifexpression = null;
    if (((de.getExpr() instanceof ConstantExpression) || (de.getExpr() instanceof VariableExpression))) {
      StringConcatenation _builder = new StringConcatenation();
      CharSequence _doSwitch = this.doSwitch(de.getExpr());
      _builder.append(_doSwitch);
      String _printFunction = this.printFunction(de.getFunction());
      _builder.append(_printFunction);
      _xifexpression = _builder;
    } else {
      _xifexpression = this.show.doSwitch(de);
    }
    return _xifexpression;
  }
  
  @Override
  public CharSequence caseIndexExpression(final IndexExpression ie) {
    return this.printFunction(ie.getFunction());
  }
  
  @Override
  protected String printProjectionFunction(final JNIISLMultiAff maff) {
    String _xblockexpression = null;
    {
      this.contextHistory.push(this.indexNameContext);
      List<String> _nameList = maff.getSpace().getNameList(JNIISLDimType.isl_dim_in);
      LinkedList<String> _linkedList = new LinkedList<String>(_nameList);
      this.indexNameContext = _linkedList;
      _xblockexpression = super.printProjectionFunction(maff);
    }
    return _xblockexpression;
  }
  
  @Override
  protected String printAbstractReduceExpression(final AbstractReduceExpression are) {
    final String res = super.printAbstractReduceExpression(are);
    this.indexNameContext = this.contextHistory.pop();
    return res;
  }
  
  @Override
  public CharSequence caseConvolutionExpression(final ConvolutionExpression ce) {
    final List<String> kernelDomainNames = ce.getKernelDomain().getIndicesNames();
    final BiFunction<String, String, Boolean> _function = (String e1, String e2) -> {
      return Boolean.valueOf(e1.contentEquals(e2));
    };
    final BinaryOperator<Boolean> _function_1 = (Boolean b1, Boolean b2) -> {
      return Boolean.valueOf(((b1).booleanValue() || (b2).booleanValue()));
    };
    final Optional<Boolean> conflict = Streams.<String, String, Boolean>zip(this.indexNameContext.stream(), kernelDomainNames.stream(), _function).reduce(_function_1);
    List<String> printCtx = null;
    if ((conflict.isPresent() && (conflict.get()).booleanValue())) {
      int _nbDims = ce.getContextDomain().getNbDims();
      int _nbDims_1 = ce.getContextDomain().getNbDims();
      int _nbDims_2 = ce.getKernelDomain().getNbDims();
      int _plus = (_nbDims_1 + _nbDims_2);
      final Function1<Integer, String> _function_2 = (Integer i) -> {
        return ("i" + i);
      };
      printCtx = IterableExtensions.<String>toList(IterableExtensions.<Integer, String>map(new ExclusiveRange(_nbDims, _plus, true), _function_2));
    } else {
      printCtx = kernelDomainNames;
    }
    this.contextHistory.push(this.indexNameContext);
    final LinkedList<String> newCtx = new LinkedList<String>(this.indexNameContext);
    newCtx.addAll(printCtx);
    this.indexNameContext = printCtx;
    final String kerDom = this.printDomainInShowSytanxWithIndexNameContext(ce.getKernelDomain());
    this.indexNameContext = newCtx;
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("conv(");
    _builder.append(kerDom);
    _builder.append(", ");
    CharSequence _doSwitch = this.doSwitch(ce.getKernelExpression());
    _builder.append(_doSwitch);
    _builder.append(", ");
    CharSequence _doSwitch_1 = this.doSwitch(ce.getDataExpression());
    _builder.append(_doSwitch_1);
    _builder.append(")");
    final String res = _builder.toString();
    this.indexNameContext = this.contextHistory.pop();
    return res;
  }
  
  @Override
  public CharSequence caseSelectExpression(final SelectExpression se) {
    this.contextHistory.push(this.indexNameContext);
    this.indexNameContext = se.getSelectRelation().getRangeNames();
    final CharSequence res = super.caseSelectExpression(se);
    this.indexNameContext = this.contextHistory.pop();
    return res;
  }
}
