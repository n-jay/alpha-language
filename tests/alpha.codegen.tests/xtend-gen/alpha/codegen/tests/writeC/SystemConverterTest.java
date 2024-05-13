package alpha.codegen.tests.writeC;

import alpha.codegen.Program;
import alpha.codegen.ProgramPrinter;
import alpha.codegen.writeC.SystemConverter;
import alpha.commands.UtilityBase;
import alpha.model.AlphaModelLoader;
import alpha.model.AlphaSystem;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class SystemConverterTest {
  /**
   * The path to the Alpha file for these unit tests.
   */
  private static final String alphaFile = "resources/alpha.codegen.tests.writeC/SystemConverterTest.alpha";

  /**
   * Gets the desired system for these unit tests.
   */
  public static AlphaSystem getSystem(final String system) {
    try {
      return UtilityBase.GetSystem(AlphaModelLoader.loadModel(SystemConverterTest.alphaFile), system);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  @Test
  public void convertSystem_noParameters() {
    final AlphaSystem system = SystemConverterTest.getSystem("NoParameters");
    final Program program = SystemConverter.convert(system);
    final CharSequence code = ProgramPrinter.print(program);
    Assert.assertNotNull(code);
    Assert.assertNotEquals("", code);
  }

  @Test
  public void convertSystem_noParameterConstraints() {
    final AlphaSystem system = SystemConverterTest.getSystem("NoParameterConstraints");
    final Program program = SystemConverter.convert(system);
    final CharSequence code = ProgramPrinter.print(program);
    Assert.assertNotNull(code);
    Assert.assertNotEquals("", code);
  }
}
