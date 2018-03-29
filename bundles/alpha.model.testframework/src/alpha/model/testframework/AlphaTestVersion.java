package alpha.model.testframework;

import java.util.LinkedList;
import java.util.List;

import alpha.model.AlphaRoot;
import fr.irisa.cairn.gecos.testframework.model.IVersion;


/**
 * IVersion is a state of whatever environment that is required to run and test the target.
 * For Alpha, it currently includes all the Alpha model instances from each input source file.
 * It should additionally include TargetMapping specifications, Makefiles, Compilers, etc. 
 * for full testing including transformation and codegen.
 * 
 * @author tyuki
 *
 */
public class AlphaTestVersion extends IVersion {

	private List<AlphaRoot> alphaRoots;
	
	public List<AlphaRoot> getAlphaRoots() {
		if(alphaRoots == null)
			alphaRoots = new LinkedList<>();
		return alphaRoots;
	}
}
