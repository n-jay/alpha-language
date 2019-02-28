package alpha.commands.model.generator.groovy;

import alpha.commands.model.AlphaCommand;
import alpha.commands.model.AlphaCommandCategory;
import alpha.commands.model.AlphaCommandSpecialization;
import alpha.commands.model.generator.groovy.AlphaGroovyCommand;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class AlphaGroovyCommandCategory {
  @Extension
  private AlphaGroovyCommand groovyCommand = new AlphaGroovyCommand();
  
  public CharSequence generate(final AlphaCommandCategory cat) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<AlphaCommand> _commands = cat.getCommands();
      for(final AlphaCommand command : _commands) {
        CharSequence _generate = this.groovyCommand.generate(command);
        _builder.append(_generate);
        _builder.newLineIfNotEmpty();
        {
          EList<AlphaCommandSpecialization> _specializations = command.getSpecializations();
          for(final AlphaCommandSpecialization specialization : _specializations) {
            CharSequence _generate_1 = this.groovyCommand.generate(specialization);
            _builder.append(_generate_1);
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder;
  }
}
