package alpha.commands.model.test;

import alpha.loader.AlphaLoader;
import alpha.model.AlphaRoot;
import alpha.model.UniquenessAndCompletenessCheck;
import alpha.model.issue.AlphaIssue;
import java.util.List;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class UniquenessAndCompletenessTest {
  @Test
  public void unboundedReduction() {
    try {
      final String alphaFile = "resources/UnboundedReduction/UnboundedReduction.alpha";
      final AlphaRoot root = AlphaLoader.loadAlpha(alphaFile);
      final List<AlphaIssue> issues = UniquenessAndCompletenessCheck.check(root);
      Assert.assertFalse(issues.isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
