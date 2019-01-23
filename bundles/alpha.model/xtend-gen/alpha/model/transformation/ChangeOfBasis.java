package alpha.model.transformation;

import alpha.model.AlphaSystem;
import alpha.model.util.AbstractAlphaCompleteVisitor;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLMultiAff;

@SuppressWarnings("all")
public class ChangeOfBasis extends AbstractAlphaCompleteVisitor {
  private ChangeOfBasis() {
  }
  
  public static void apply(final AlphaSystem system, final String varName, final JNIISLMultiAff f) {
    final ChangeOfBasis CoB = new ChangeOfBasis();
  }
}
