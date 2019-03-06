package alpha.model.tests.transformations;

import java.io.IOException;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import alpha.model.AlphaModelLoader;
import alpha.model.AlphaRoot;
import alpha.model.ReduceExpression;
import alpha.model.StandardEquation;
import alpha.model.UniquenessAndCompletenessCheck;
import alpha.model.issue.AlphaIssue;
import alpha.model.transformation.Normalize;
import alpha.model.transformation.reduction.SimplifyingReductions;
import fr.irisa.cairn.jnimap.isl.jni.ISLFactory;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLMultiAff;

public class SimplifyingReductionsTest {
	
	private static final String ROOT_DIR = "resources/simplifying-reductions/";

	@Test
	public void testPrefixSum() throws IOException {
		testSR(ROOT_DIR + "prefixSum.alpha", "prefixSum", "C", "0", "[N]->{[i,j]->[i-1,j]}");
	}

	@Test
	public void testSegmentSum() throws IOException {
		testSR(ROOT_DIR + "segmentSum.alpha", "segmentSum", "C", "0", "[N,W]->{[i,j]->[i-1,j]}");
	}
	
	private static void testSR(String filename, String systemName, String eqName, String exprID, String fStr) throws IOException {
		AlphaRoot root = AlphaModelLoader.loadModel(filename);

		List<AlphaIssue> issues = UniquenessAndCompletenessCheck.check(root);
		Assert.assertTrue(issues.isEmpty());
		
		StandardEquation eq = root.getSystem(systemName).getSystemBodies().get(0).getStandardEquation(eqName);
		ReduceExpression reduce = (ReduceExpression)eq.getExpression(exprID);
		
		JNIISLMultiAff reuseDep = ISLFactory.islMultiAff(fStr);
		
		SimplifyingReductions.apply(reduce, reuseDep);
		Normalize.apply(root);
		

		issues = UniquenessAndCompletenessCheck.check(root);
		Assert.assertTrue(issues.isEmpty());
	}

}
