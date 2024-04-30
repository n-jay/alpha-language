package alpha.codegen.isl;

import alpha.codegen.CustomExpr;
import alpha.codegen.Factory;
import alpha.codegen.ParenthesizedExpr;
import fr.irisa.cairn.jnimap.isl.ISLPWQPolynomial;
import fr.irisa.cairn.jnimap.isl.ISL_FORMAT;

/**
 * Converts isl polynomial expressions to C expressions.
 * Note: the isl "toString" method is called to get a string
 * representing the C expression to use.
 * This is then put into a parenthesized "custom expression",
 * which will simply print exactly what isl returned as C code.
 */
@SuppressWarnings("all")
public class PolynomialConverter {
  /**
   * Converts a piecewise polynomial into C code.
   * At the time of writing, isl prints this as a ternary expression
   * with one case for each piece of the polynomial,
   * and a default final case that returns 0 if the point
   * is not in the domain of any piece.
   * This is wrapped in a "custom expression", which is then
   * wrapped in parentheses.
   */
  public static ParenthesizedExpr convert(final ISLPWQPolynomial polynomial) {
    final String literal = ISLPWQPolynomial._toString(polynomial, ISL_FORMAT.C.ordinal());
    final CustomExpr customExpr = Factory.customExpr(literal);
    return Factory.parenthesizedExpr(customExpr);
  }
}
