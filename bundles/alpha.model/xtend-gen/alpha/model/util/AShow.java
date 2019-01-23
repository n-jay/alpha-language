package alpha.model.util;

import alpha.model.AbstractReduceExpression;
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
import org.eclipse.xtext.xbase.lib.IterableExtensions;

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
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field inputExprs is undefined for the type UseEquation"
      + "\nThe method or field contextDomain is undefined for the type Object"
      + "\nThe method or field callParamsExpr is undefined for the type UseEquation"
      + "\nThe method or field outputExprs is undefined for the type UseEquation"
      + "\nThe method or field system is undefined for the type UseEquation"
      + "\nThe method or field inputExprs is undefined for the type UseEquation"
      + "\nType mismatch: cannot convert from Object to Object[]"
      + "\nThere is no context to infer the closure\'s argument types from. Consider typing the arguments or put the closures into a typed context."
      + "\nThere is no context to infer the closure\'s argument types from. Consider typing the arguments or put the closures into a typed context."
      + "\nmap cannot be resolved"
      + "\nindicesNames cannot be resolved"
      + "\nmaxBy cannot be resolved"
      + "\nsubList cannot be resolved"
      + "\nlength cannot be resolved"
      + "\nlength cannot be resolved"
      + "\n> cannot be resolved"
      + "\njoin cannot be resolved"
      + "\nprintSubsystemCallParams cannot be resolved"
      + "\nmap cannot be resolved"
      + "\njoin cannot be resolved"
      + "\nname cannot be resolved"
      + "\nmap cannot be resolved"
      + "\njoin cannot be resolved");
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
    final String kerDom = super.printDomain(ce.getKernelDomain());
    this.contextHistory.push(this.indexNameContext);
    final LinkedList<String> copy = new LinkedList<String>(this.indexNameContext);
    copy.addAll(ce.getKernelDomain().getIndicesNames());
    this.indexNameContext = copy;
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
