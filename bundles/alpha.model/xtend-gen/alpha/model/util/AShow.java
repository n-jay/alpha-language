package alpha.model.util;

import alpha.model.AbstractReduceExpression;
import alpha.model.AlphaVisitable;
import alpha.model.CalculatorExpression;
import alpha.model.ConstantExpression;
import alpha.model.DependenceExpression;
import alpha.model.IndexExpression;
import alpha.model.StandardEquation;
import alpha.model.VariableExpression;
import alpha.model.util.AlphaUtil;
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
    return AlphaUtil.toAShowString(set, this.parameterContext, this.indexNameContext);
  }
  
  @Override
  public String printFunction(final JNIISLMultiAff f) {
    return AlphaUtil.toAShowString(f, this.indexNameContext);
  }
  
  @Override
  public String printRelation(final CalculatorExpression rel) {
    return rel.getISLObject().toString();
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
}
