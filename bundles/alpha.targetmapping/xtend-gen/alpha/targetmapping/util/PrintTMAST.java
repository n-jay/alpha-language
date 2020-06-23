package alpha.targetmapping.util;

import alpha.targetmapping.TargetMappingVisitable;
import alpha.targetmapping.util.AbstractTargetMappingVisitor;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.xtext.xbase.lib.Conversions;

@SuppressWarnings("all")
public class PrintTMAST extends AbstractTargetMappingVisitor {
  private String indent = "";
  
  protected static final String INDENT_WITH_SIBILING = "   |";
  
  protected static final String INDENT_LAST_CHILD = "    ";
  
  protected StringBuffer _output = new StringBuffer();
  
  protected int depth = 0;
  
  public static String print(final TargetMappingVisitable node) {
    final PrintTMAST printer = new PrintTMAST();
    node.accept(printer);
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
  
  @Override
  public void defaultIn(final TargetMappingVisitable tmv) {
    this.printStr("_", tmv.eClass().getName());
    String _indent = this.indent;
    this.indent = (_indent + PrintTMAST.INDENT_WITH_SIBILING);
  }
  
  @Override
  public void defaultOut(final TargetMappingVisitable tmv) {
    int _length = this.indent.length();
    int _length_1 = PrintTMAST.INDENT_WITH_SIBILING.length();
    int _minus = (_length - _length_1);
    this.indent = this.indent.substring(0, _minus);
  }
}
