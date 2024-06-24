package alpha.commands.model.test

import org.junit.Test
import alpha.loader.AlphaLoader
import static org.junit.Assert.*
import alpha.model.UniquenessAndCompletenessCheck

class UniquenessAndCompletenessTest {
	@Test
	def void unboundedReduction() {
		val alphaFile = "resources/UnboundedReduction/UnboundedReduction.alpha";
		val root = AlphaLoader.loadAlpha(alphaFile);
		val issues = UniquenessAndCompletenessCheck.check(root);
		
		assertFalse(issues.isEmpty());
	}
}