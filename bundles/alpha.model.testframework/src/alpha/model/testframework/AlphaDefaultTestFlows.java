package alpha.model.testframework;

import static alpha.model.testframework.AlphaTestOperators.defaultDataConvertor;
import static fr.irisa.cairn.gecos.testframework.stages.Stages.chain;
import static fr.irisa.cairn.gecos.testframework.stages.Stages.convert;
import static fr.irisa.cairn.gecos.testframework.stages.Stages.forEach;

import fr.irisa.cairn.gecos.testframework.s2s.S2STestFlow;
import fr.irisa.cairn.gecos.testframework.s2s.TestFlow;

public class AlphaDefaultTestFlows {
	
	private AlphaDefaultTestFlows() {}
	
	public static TestFlow alphaFileDataCheckProgramTestFlow() {
		return S2STestFlow.builder()
			.convert(convert(defaultDataConvertor(AlphaTestVersion::new)))
			.check(chain(
					forEach(v -> AlphaCheckers.xtextValidator()),
					forEach(v -> AlphaCheckers.checkProgram())))
			.build();
	}

	public static TestFlow alphaFileDataNormalizeTestFlow() {
		return S2STestFlow.builder()
			.convert(convert(defaultDataConvertor(AlphaTestVersion::new)))
			.check(forEach(v -> AlphaCheckers.checkNormalize()))
			.build();
	}
	
}
