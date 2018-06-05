package alpha.model.testframework;

import static alpha.model.testframework.AlphaTestOperators.defaultDataConvertor;
import static alpha.model.testframework.AlphaTestOperators.versionCopier;
import static fr.irisa.cairn.gecos.testframework.stages.Stages.chain;
import static fr.irisa.cairn.gecos.testframework.stages.Stages.convert;
import static fr.irisa.cairn.gecos.testframework.stages.Stages.forEach;
import static fr.irisa.cairn.gecos.testframework.stages.Stages.transform;

import fr.irisa.cairn.gecos.testframework.s2s.S2STestFlow;
import fr.irisa.cairn.gecos.testframework.s2s.TestFlow;

public class AlphaDefaultTestFlows {
	
	private AlphaDefaultTestFlows() {}
	
	/**
	 * Parsing + syntax check + uniqueness & completeness check.
	 * 
	 * @return
	 */
	public static TestFlow alphaFileDataCheckProgramTestFlow() {
		return S2STestFlow.builder()
			.convert(convert(defaultDataConvertor(AlphaTestVersion::new)))
			.transform(transform(versionCopier(AlphaTestVersion::new)))
			.check(chain(
					forEach(AlphaCheckers.xtextValidator()),
					forEach(AlphaCheckers.checkProgram())))
			.build();
	}

	/**
	 * Normalize + check normalized.
	 * 
	 * @return
	 */
	public static TestFlow alphaFileDataNormalizeTestFlow() {
		return S2STestFlow.builder()
			.convert(convert(defaultDataConvertor(AlphaTestVersion::new)))
			.check(forEach(AlphaCheckers.checkNormalize()))
			.build();
	}
	
}
