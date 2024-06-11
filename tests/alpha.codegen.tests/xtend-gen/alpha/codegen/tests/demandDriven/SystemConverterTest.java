package alpha.codegen.tests.demandDriven;

import alpha.codegen.BaseDataType;
import alpha.codegen.Program;
import alpha.codegen.ProgramPrinter;
import alpha.codegen.demandDriven.WriteC;
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
  private static final String alphaFile = "resources/alpha.codegen.tests.demandDriven/SystemConverterTest.alpha";

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
    final Program program = WriteC.convert(system, BaseDataType.FLOAT, false);
    final CharSequence code = ProgramPrinter.print(program);
    Assert.assertNotNull(code);
    Assert.assertNotEquals("", code);
  }

  @Test
  public void convertSystem_noParameterConstraints() {
    final AlphaSystem system = SystemConverterTest.getSystem("NoParameterConstraints");
    final Program program = WriteC.convert(system, BaseDataType.FLOAT, false);
    final CharSequence code = ProgramPrinter.print(program);
    Assert.assertNotNull(code);
    Assert.assertNotEquals("", code);
  }
}
