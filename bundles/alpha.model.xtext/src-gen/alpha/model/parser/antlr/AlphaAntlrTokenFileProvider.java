/*
 * generated by Xtext 2.18.0.M3
 */
package alpha.model.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class AlphaAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("alpha/model/parser/antlr/internal/InternalAlpha.tokens");
	}
}
