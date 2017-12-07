package alpha.model.util;

import alpha.model.AlphaConstant;
import alpha.model.AlphaExpressionVisitable;
import alpha.model.AlphaRoot;
import alpha.model.AlphaSystem;
import alpha.model.AlphaVisitable;
import alpha.model.ExternalFunction;
import alpha.model.FuzzyVariable;
import alpha.model.PolyhedralObject;
import alpha.model.StandardEquation;
import alpha.model.Variable;
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
  
  protected StringBuffer printStr(final String... strs) {
    StringBuffer _xblockexpression = null;
    {
      this._output.append(this.indent);
      final Consumer<String> _function = (String str) -> {
        this._output.append(str);
      };
      ((List<String>)Conversions.doWrapArray(strs)).forEach(_function);
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
    this.printStr("+-- ", v.getDomain().toString());
    this.defaultOut(v);
  }
  
  @Override
  public void visitFuzzyVariable(final FuzzyVariable v) {
    this.defaultIn(v);
    this.printStr("+-- ", v.getName());
    this.printStr("+-- ", v.getRelation().toString());
    this.defaultOut(v);
  }
  
  @Override
  public void visitPolyhedralObject(final PolyhedralObject pobj) {
    this.defaultIn(pobj);
    this.printStr("+-- ", pobj.getName());
    this.printStr("+-- ", pobj.getType().name());
    this.printStr("+-- ", pobj.getISLObject().toString());
    this.defaultOut(pobj);
  }
  
  @Override
  public void visitStandardEquation(final StandardEquation s) {
    this.defaultIn(s);
    this.printStr("+-- ", s.getVariable().getName());
    super.visitStandardEquation(s);
    this.defaultOut(s);
  }
}
