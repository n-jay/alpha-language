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
import fr.irisa.cairn.jnimap.isl.jni.JNIISLDimType;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLMultiAff;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class AShow extends Show {
  protected List<String> indexNameContext;
  
  protected Stack<List<String>> contextHistory = new Stack<List<String>>();
  
  private Show show = new Show();
  
  public static <T extends AlphaVisitable> String print(final T av) {
    String _xblockexpression = null;
    {
      final AShow ashow = new AShow();
      _xblockexpression = ashow.doSwitch(av);
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
  
  /**
   * CalculatorExpressions are printed differently depending on the context.
   */
  @Override
  public String caseStandardEquation(final StandardEquation se) {
    String _xblockexpression = null;
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
      String _doSwitch = this.doSwitch(se.getExpr());
      _builder.append(_doSwitch);
      _builder.append(";");
      _xblockexpression = _builder.toString();
    }
    return _xblockexpression;
  }
  
  @Override
  public String caseUseEquation(final UseEquation ue) {
    String _xblockexpression = null;
    {
      final Function1<AlphaExpression, List<String>> _function = (AlphaExpression e) -> {
        return e.getContextDomain().getIndicesNames();
      };
      final Function1<List<String>, Integer> _function_1 = (List<String> n) -> {
        return Integer.valueOf(((Object[])Conversions.unwrapArray(n, Object.class)).length);
      };
      final List<String> names = IterableExtensions.<List<String>, Integer>maxBy(ListExtensions.<AlphaExpression, List<String>>map(ue.getInputExprs(), _function), _function_1);
      final boolean idomDeclared = ((ue.getInstantiationDomainExpr() != null) && (ue.getInstantiationDomain().getNbDims() > 0));
      List<String> _xifexpression = null;
      if (idomDeclared) {
        _xifexpression = names.subList(ue.getInstantiationDomain().getNbDims(), ((Object[])Conversions.unwrapArray(names, Object.class)).length);
      } else {
        _xifexpression = null;
      }
      final List<String> withClause = _xifexpression;
      String _xifexpression_1 = null;
      int _length = 0;
      if (((Object[])Conversions.unwrapArray(withClause, Object.class))!=null) {
        _length=((Object[])Conversions.unwrapArray(withClause, Object.class)).length;
      }
      boolean _greaterThan = (_length > 0);
      if (_greaterThan) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append(" ");
        _builder.append("with [");
        String _join = IterableExtensions.join(withClause, ",");
        _builder.append(_join, " ");
        _builder.append("]");
        _xifexpression_1 = _builder.toString();
      } else {
        StringConcatenation _builder_1 = new StringConcatenation();
        _xifexpression_1 = _builder_1.toString();
      }
      final String withStr = _xifexpression_1;
      String _xifexpression_2 = null;
      if (idomDeclared) {
        StringConcatenation _builder_2 = new StringConcatenation();
        _builder_2.append("over ");
        String _printInstantiationDomain = this.printInstantiationDomain(ue.getInstantiationDomain());
        _builder_2.append(_printInstantiationDomain);
        _builder_2.append(withStr);
        _builder_2.append(" : ");
        _xifexpression_2 = _builder_2.toString();
      } else {
        StringConcatenation _builder_3 = new StringConcatenation();
        _xifexpression_2 = _builder_3.toString();
      }
      final String idom = _xifexpression_2;
      this.indexNameContext = names;
      final CharSequence callParam = this.printSubsystemCallParams(ue.getCallParamsExpr(), ue.getInstantiationDomain());
      StringConcatenation _builder_4 = new StringConcatenation();
      _builder_4.append(idom);
      _builder_4.append("(");
      final Function1<AlphaExpression, String> _function_2 = (AlphaExpression it) -> {
        return this.doSwitch(it);
      };
      String _join_1 = IterableExtensions.join(ListExtensions.<AlphaExpression, String>map(ue.getOutputExprs(), _function_2), ", ");
      _builder_4.append(_join_1);
      _builder_4.append(") = ");
      String _name = ue.getSystem().getName();
      _builder_4.append(_name);
      _builder_4.append(callParam);
      _builder_4.append("(");
      final Function1<AlphaExpression, String> _function_3 = (AlphaExpression it) -> {
        return this.doSwitch(it);
      };
      String _join_2 = IterableExtensions.join(ListExtensions.<AlphaExpression, String>map(ue.getInputExprs(), _function_3), ", ");
      _builder_4.append(_join_2);
      _builder_4.append(");");
      _xblockexpression = _builder_4.toString();
    }
    return _xblockexpression;
  }
  
  /**
   * AlphaExpression
   */
  @Override
  public String caseDependenceExpression(final DependenceExpression de) {
    String _xifexpression = null;
    if (((de.getExpr() instanceof ConstantExpression) || (de.getExpr() instanceof VariableExpression))) {
      StringConcatenation _builder = new StringConcatenation();
      String _doSwitch = this.doSwitch(de.getExpr());
      _builder.append(_doSwitch);
      String _printFunction = this.printFunction(de.getFunction());
      _builder.append(_printFunction);
      _xifexpression = _builder.toString();
    } else {
      _xifexpression = this.show.doSwitch(de);
    }
    return _xifexpression;
  }
  
  @Override
  public String caseIndexExpression(final IndexExpression ie) {
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
  public String caseConvolutionExpression(final ConvolutionExpression ce) {
    final String kerDom = super.printDomain(ce.getKernelDomain());
    this.contextHistory.push(this.indexNameContext);
    final LinkedList<String> copy = new LinkedList<String>(this.indexNameContext);
    copy.addAll(ce.getKernelDomain().getIndicesNames());
    this.indexNameContext = copy;
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("conv(");
    _builder.append(kerDom);
    _builder.append(", ");
    String _doSwitch = this.doSwitch(ce.getKernelExpression());
    _builder.append(_doSwitch);
    _builder.append(", ");
    String _doSwitch_1 = this.doSwitch(ce.getDataExpression());
    _builder.append(_doSwitch_1);
    _builder.append(")");
    final String res = _builder.toString();
    this.indexNameContext = this.contextHistory.pop();
    return res;
  }
  
  @Override
  public String caseSelectExpression(final SelectExpression se) {
    this.contextHistory.push(this.indexNameContext);
    this.indexNameContext = se.getSelectRelation().getRangeNames();
    final String res = super.caseSelectExpression(se);
    this.indexNameContext = this.contextHistory.pop();
    return res;
  }
}
