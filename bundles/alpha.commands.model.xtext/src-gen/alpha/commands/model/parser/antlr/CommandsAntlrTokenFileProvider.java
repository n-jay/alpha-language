/*
 * generated by Xtext 2.18.0.M3
 */
package alpha.commands.model.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class CommandsAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("alpha/commands/model/parser/antlr/internal/InternalCommands.tokens");
	}
}
