package alpha.model.tests.transformations;

import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.eclipse.xtext.EcoreUtil2;
import org.junit.Test;

import alpha.model.AlphaModelLoader;
import alpha.model.AlphaRoot;
import alpha.model.BinaryExpression;
import alpha.model.IndexExpression;
import alpha.model.ReduceExpression;
import alpha.model.UniquenessAndCompletenessCheck;
import alpha.model.transformation.SimplifyExpressions;

public class SimplifyExpressionsTest {
	
	private static final String ROOT_DIR = "resources/src-valid/transformation-tests/simplify-expressions/";
	
	@Test
	public void testBinaryIdentity() throws IOException {
		binaryIdentityTest(ROOT_DIR + "binaryIdentity1.alpha");
	}

	@Test
	public void contantIndexTest() throws IOException {
		constantIndexTest(ROOT_DIR + "constantIndex1.alpha");
	}
	
	@Test
	public void scalarReductionTest() throws IOException {
		scalarReductionTest(ROOT_DIR + "scalarReduction1.alpha");
	}
	
	private void binaryIdentityTest(String filename) throws IOException {
		AlphaRoot root = AlphaModelLoader.loadModel(filename);
		
		SimplifyExpressions.apply(root);
		
		assertTrue(EcoreUtil2.getAllContentsOfType(root, BinaryExpression.class).isEmpty());
		assertTrue(UniquenessAndCompletenessCheck.check(root).isEmpty());
	}
	
	private void constantIndexTest(String filename) throws IOException {
		AlphaRoot root = AlphaModelLoader.loadModel(filename);
		
		SimplifyExpressions.apply(root);
		
		assertTrue(EcoreUtil2.getAllContentsOfType(root, IndexExpression.class).isEmpty());
		assertTrue(UniquenessAndCompletenessCheck.check(root).isEmpty());
	}
	
	private void scalarReductionTest(String filename) throws IOException {
		AlphaRoot root = AlphaModelLoader.loadModel(filename);
		
		SimplifyExpressions.apply(root);
		
		assertTrue(EcoreUtil2.getAllContentsOfType(root, ReduceExpression.class).isEmpty());
		assertTrue(UniquenessAndCompletenessCheck.check(root).isEmpty());
	}
}
