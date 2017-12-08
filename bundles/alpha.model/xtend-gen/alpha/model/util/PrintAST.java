package alpha.model.util;

import alpha.model.AlphaConstant;
import alpha.model.AlphaExpression;
import alpha.model.AlphaExpressionVisitable;
import alpha.model.AlphaRoot;
import alpha.model.AlphaSystem;
import alpha.model.AlphaVisitable;
import alpha.model.ArgReduceExpression;
import alpha.model.AutoRestrictExpression;
import alpha.model.BinaryExpression;
import alpha.model.CalculatorExpression;
import alpha.model.ConstantExpression;
import alpha.model.ConvolutionExpression;
import alpha.model.DependenceExpression;
import alpha.model.ExternalArgReduceExpression;
import alpha.model.ExternalFunction;
import alpha.model.ExternalMultiArgExpression;
import alpha.model.ExternalReduceExpression;
import alpha.model.FuzzyVariable;
import alpha.model.IndexExpression;
import alpha.model.JNIDomain;
import alpha.model.MultiArgExpression;
import alpha.model.PolyhedralObject;
import alpha.model.ReduceExpression;
import alpha.model.RestrictExpression;
import alpha.model.SelectExpression;
import alpha.model.StandardEquation;
import alpha.model.UnaryExpression;
import alpha.model.UseEquation;
import alpha.model.Variable;
import alpha.model.VariableExpression;
import alpha.model.util.AbstractAlphaCompleteVisitor;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;

@SuppressWarnings("all")
public class PrintAST extends AbstractAlphaCompleteVisitor {
  private String indent = "";
  
  protected final static String INDENT_WITH_SIBILING = "   |";
  
  protected final static String INDENT_LAST_CHILD = "    ";
  
  protected StringBuffer _output = new StringBuffer();
  
  protected List<Integer> nodeIdTracker = new LinkedList<Integer>();
  
  protected int depth = 0;
  
  public static String print(final AlphaRoot program) {
    final PrintAST printer = new PrintAST();
    program.accept(printer);
    return printer._output.toString();
  }
  
  public static String print(final AlphaSystem system) {
    final PrintAST printer = new PrintAST();
    system.accept(printer);
    return printer._output.toString();
  }
  
  protected StringBuffer printInt(final String prefix, final long v) {
    String _plus = (Long.valueOf(v) + "");
    return this.printStr(prefix, _plus);
  }
  
  protected StringBuffer printReal(final String prefix, final double v) {
    String _plus = (Double.valueOf(v) + "");
    return this.printStr(prefix, _plus);
  }
  
  protected StringBuffer printStr(final Object... objs) {
    StringBuffer _xblockexpression = null;
    {
      this._output.append(this.indent);
      final Consumer<Object> _function = (Object o) -> {
        this._output.append(o);
      };
      ((List<Object>)Conversions.doWrapArray(objs)).forEach(_function);
      _xblockexpression = this._output.append("\n");
    }
    return _xblockexpression;
  }
  
  protected StringBuffer printId() {
    StringBuffer _xblockexpression = null;
    {
      final StringBuffer id = new StringBuffer();
      ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, this.depth, true);
      for (final Integer i : _doubleDotLessThan) {
        {
          int _length = id.length();
          boolean _greaterThan = (_length > 0);
          if (_greaterThan) {
            id.append(",");
          }
          id.append(this.nodeIdTracker.get((i).intValue()));
        }
      }
      _xblockexpression = this._output.append((((this.indent + "nodeId = (") + id) + ")\n"));
    }
    return _xblockexpression;
  }
  
  @Override
  public void defaultIn(final AlphaVisitable av) {
    this._defaultIn(av);
  }
  
  @Override
  public void defaultIn(final AlphaExpressionVisitable aev) {
    this._defaultIn(aev);
  }
  
  private String _defaultIn(final EObject obj) {
    String _xblockexpression = null;
    {
      this.printStr("_", obj.eClass().getName());
      String _indent = this.indent;
      _xblockexpression = this.indent = (_indent + PrintAST.INDENT_WITH_SIBILING);
    }
    return _xblockexpression;
  }
  
  @Override
  public void defaultOut(final AlphaVisitable av) {
    this._defaultOut(av);
  }
  
  @Override
  public void defaultOut(final AlphaExpressionVisitable aev) {
    this._defaultOut(aev);
  }
  
  private String _defaultOut(final EObject obj) {
    int _length = this.indent.length();
    int _length_1 = PrintAST.INDENT_WITH_SIBILING.length();
    int _minus = (_length - _length_1);
    return this.indent = this.indent.substring(0, _minus);
  }
  
  @Override
  public void inAlphaSystem(final AlphaSystem system) {
    this.defaultIn(system);
    this.printStr("_", system.getName());
  }
  
  @Override
  public void outAlphaSystem(final AlphaSystem system) {
    this.defaultOut(system);
  }
  
  @Override
  public void inExternalFunction(final ExternalFunction ef) {
    this.defaultIn(ef);
    String _name = ef.getName();
    int _cardinality = ef.getCardinality();
    String _plus = (Integer.valueOf(_cardinality) + ")");
    this.printStr("+--", _name, "(", _plus);
  }
  
  @Override
  public void visitAlphaConstant(final AlphaConstant ac) {
    this.defaultIn(ac);
    String _name = ac.getName();
    int _value = ac.getValue();
    String _plus = (Integer.valueOf(_value) + "");
    this.printStr("+--", _name, "=", _plus);
  }
  
  @Override
  public void visitVariable(final Variable v) {
    this.defaultIn(v);
    this.printStr("+-- ", v.getName());
    this.printStr("+-- ", v.getDomain());
    this.defaultOut(v);
  }
  
  @Override
  public void visitFuzzyVariable(final FuzzyVariable v) {
    this.defaultIn(v);
    this.printStr("+-- ", v.getName());
    this.printStr("+-- ", v.getRelation());
    this.defaultOut(v);
  }
  
  @Override
  public void visitPolyhedralObject(final PolyhedralObject pobj) {
    this.defaultIn(pobj);
    this.printStr("+-- ", pobj.getName());
    this.printStr("+-- ", pobj.getType().name());
    this.printStr("+-- ", pobj.getISLObject());
    this.defaultOut(pobj);
  }
  
  @Override
  public void inStandardEquation(final StandardEquation se) {
    this.defaultIn(se);
    this.printStr("+-- ", se.getVariable().getName());
  }
  
  @Override
  public void inUseEquation(final UseEquation ue) {
    this.defaultIn(ue);
    this.printStr("+-- ", ue.getSystem().getName());
    CalculatorExpression _instantiationDomain = ue.getInstantiationDomain();
    boolean _tripleNotEquals = (_instantiationDomain != null);
    if (_tripleNotEquals) {
      this.printStr("+-- ", ue.getInstantiationDomain().getISLObject());
    }
  }
  
  @Override
  public void inAlphaExpression(final AlphaExpression ae) {
    this.defaultIn(ae);
    this.printStr("+-- ", "expDomain: ", ae.getExpressionDomain());
    this.printStr("+-- ", "ctxDomain: ", ae.getContextDomain());
  }
  
  @Override
  public void outAlphaExpression(final AlphaExpression ae) {
    this.defaultOut(ae);
  }
  
  @Override
  public void inRestrictExpression(final RestrictExpression re) {
    this.inAlphaExpression(re);
    this.printStr("+-- ", re.getDomainExpr().getISLObject());
  }
  
  @Override
  public void inAutoRestrictExpression(final AutoRestrictExpression are) {
    this.inAlphaExpression(are);
    JNIDomain _inferredDomain = are.getInferredDomain();
    boolean _tripleNotEquals = (_inferredDomain != null);
    if (_tripleNotEquals) {
      this.printStr("+-- ", are.getInferredDomain().getISLObject());
    }
  }
  
  @Override
  public void inDependenceExpression(final DependenceExpression de) {
    this.inAlphaExpression(de);
    this.printStr("+-- ", de.getFunction().getISLObject());
  }
  
  @Override
  public void inVariableExpression(final VariableExpression ve) {
    this.inAlphaExpression(ve);
    this.printStr("+-- ", ve.getVariable().getName());
  }
  
  @Override
  public void inIndexExpression(final IndexExpression ie) {
    this.inAlphaExpression(ie);
    this.printStr("+-- ", ie.getFunction().getISLObject());
  }
  
  @Override
  public void inConstantExpression(final ConstantExpression ce) {
    this.inAlphaExpression(ce);
    this.printStr("+-- ", ce);
  }
  
  @Override
  public void inUnaryExpression(final UnaryExpression ue) {
    this.inAlphaExpression(ue);
    this.printStr("+-- ", ue.getOperator());
  }
  
  @Override
  public void inBinaryExpression(final BinaryExpression be) {
    this.inAlphaExpression(be);
    this.printStr("+-- ", be.getOperator());
  }
  
  @Override
  public void inReduceExpression(final ReduceExpression re) {
    this.inAlphaExpression(re);
    this.printStr("+-- ", re.getOperator());
    this.printStr("+-- ", re.getProjection().getISLObject());
  }
  
  @Override
  public void inExternalReduceExpression(final ExternalReduceExpression ere) {
    this.inAlphaExpression(ere);
    this.printStr("+-- ", ere.getExternalFunction().getName());
    this.printStr("+-- ", ere.getProjection().getISLObject());
  }
  
  @Override
  public void inArgReduceExpression(final ArgReduceExpression are) {
    this.inAlphaExpression(are);
    this.printStr("+-- ", are.getOperator());
    this.printStr("+-- ", are.getProjection().getISLObject());
  }
  
  @Override
  public void inExternalArgReduceExpression(final ExternalArgReduceExpression eare) {
    this.inAlphaExpression(eare);
    this.printStr("+-- ", eare.getOperator());
    this.printStr("+-- ", eare.getProjection().getISLObject());
  }
  
  @Override
  public void inConvolutionExpression(final ConvolutionExpression ce) {
    this.inAlphaExpression(ce);
    this.printStr("+-- ", ce.getKernelDomain().getISLObject());
  }
  
  @Override
  public void inMultiArgExpression(final MultiArgExpression mae) {
    this.inAlphaExpression(mae);
    this.printStr("+-- ", mae.getOperator());
  }
  
  @Override
  public void inExternalMultiArgExpression(final ExternalMultiArgExpression emae) {
    this.inAlphaExpression(emae);
    this.printStr("+-- ", emae.getExternalFunction().getName());
  }
  
  @Override
  public void inSelectExpression(final SelectExpression se) {
    this.inAlphaExpression(se);
    this.printStr("+-- ", se.getSelectRelation().getISLObject());
  }
}
