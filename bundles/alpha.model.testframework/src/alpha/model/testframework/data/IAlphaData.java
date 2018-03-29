package alpha.model.testframework.data;

import java.nio.file.Path;
import java.util.List;

import fr.irisa.cairn.gecos.testframework.model.IData;

/**
 * IData for Alpha.
 * 
 * Currently, the only type of file is Alpha programs. In the future support
 * should be added for TargetMapping and possibly additional types for
 * specifying the execution strategy.
 * 
 * @author tyuki
 *
 */
public interface IAlphaData extends IData {

	/**
	 * Gets the source Alpha files.
	 *
	 * @return the list of source files
	 */
	public List<Path> getAlphaFiles();

	public static final class FileNamePatterns {
		public static final String ALPHA_SRC = "^\\S+\\.alpha$";
		public static final String ALPHA_UNIT_DIR = "^\\S+\\.unit$";
		// public static final String MAKEFILE = "^[mM]akefile$";
	}

}
