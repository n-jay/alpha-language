package alpha.commands.model.generator.groovy;

import alpha.commands.model.AlphaCommand;
import alpha.commands.model.AlphaCommandSpecialization;
import alpha.commands.model.generator.CommonExtensions;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class AlphaGroovyCommand {
  @Extension
  private CommonExtensions commonEx = new CommonExtensions();
  
  public CharSequence javaCommandFQN(final AlphaCommand command) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("alpha.commands.");
    String _firstUpper = StringExtensions.toFirstUpper(command.getCategory().getName());
    _builder.append(_firstUpper);
    _builder.append(".");
    String _name = command.getName();
    _builder.append(_name);
    return _builder;
  }
  
  public CharSequence generate(final AlphaCommand command) {
    StringConcatenation _builder = new StringConcatenation();
    String _returnTypeName = this.commonEx.returnTypeName(command.getSignature());
    _builder.append(_returnTypeName);
    _builder.append(" ");
    String _name = command.getName();
    _builder.append(_name);
    _builder.append("(");
    String _inputsList = this.commonEx.inputsList(command.getSignature());
    _builder.append(_inputsList);
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _javaCommandFQN = this.javaCommandFQN(command);
    _builder.append(_javaCommandFQN, "\t");
    _builder.append("(");
    String _callArgumentsList = this.commonEx.callArgumentsList(command.getSignature());
    _builder.append(_callArgumentsList, "\t");
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generate(final AlphaCommandSpecialization specialization) {
    CharSequence _xblockexpression = null;
    {
      final AlphaCommand command = specialization.getCommand();
      StringConcatenation _builder = new StringConcatenation();
      String _returnTypeName = this.commonEx.returnTypeName(command.getSignature());
      _builder.append(_returnTypeName);
      _builder.append(" ");
      String _name = command.getName();
      _builder.append(_name);
      _builder.append("(");
      String _inputsList = this.commonEx.inputsList(specialization);
      _builder.append(_inputsList);
      _builder.append(") {");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      CharSequence _javaCommandFQN = this.javaCommandFQN(command);
      _builder.append(_javaCommandFQN, "\t");
      _builder.append("(");
      String _callArgumentsList = this.commonEx.callArgumentsList(specialization);
      _builder.append(_callArgumentsList, "\t");
      _builder.append(")");
      _builder.newLineIfNotEmpty();
      _builder.append("}");
      _builder.newLine();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
}
