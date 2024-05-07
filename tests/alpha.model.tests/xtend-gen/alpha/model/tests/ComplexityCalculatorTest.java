package alpha.model.tests;

import alpha.commands.UtilityBase;
import alpha.model.AlphaRoot;
import alpha.model.AlphaSystem;
import alpha.model.ComplexityCalculator;
import alpha.model.tests.util.AlphaTestUtil;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class ComplexityCalculatorTest {
  @Test
  public void testComplexity_01() {
    final AlphaRoot root = AlphaTestUtil.loadValidFile("transformation-tests/simplify-expressions/scalarReduction1.alpha");
    final AlphaSystem system = UtilityBase.GetSystem(root, "scalarReduction1a");
    Assert.assertEquals(ComplexityCalculator.complexity(system), 1);
  }

  @Test
  public void testComplexity_02() {
    final AlphaRoot root = AlphaTestUtil.loadValidFile("transformation-reduction-tests/normalize-reduction-deep/normalizeReductionDeep.alpha");
    Assert.assertEquals(ComplexityCalculator.complexity(UtilityBase.GetSystem(root, "topLevelReduction")), 2);
    Assert.assertEquals(ComplexityCalculator.complexity(UtilityBase.GetSystem(root, "nestedReduction_01")), 3);
    Assert.assertEquals(ComplexityCalculator.complexity(UtilityBase.GetSystem(root, "nestedReduction_02")), 4);
    Assert.assertEquals(ComplexityCalculator.complexity(UtilityBase.GetSystem(root, "nestedReduction_03")), 4);
  }
}
