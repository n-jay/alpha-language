package alpha.model.util;

import fr.irisa.cairn.jnimap.isl.ISLAff;
import fr.irisa.cairn.jnimap.isl.ISLContext;
import fr.irisa.cairn.jnimap.isl.ISLDimType;
import fr.irisa.cairn.jnimap.isl.ISLMatrix;
import fr.irisa.cairn.jnimap.isl.ISLMultiAff;
import fr.irisa.cairn.jnimap.isl.ISLVal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.IntegerRange;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

/**
 * Factorizes a set of multi-dimensional affine maps (i.e., <code>ISLMultiAff</code>).
 * 
 * @see <a href="https://impact-workshop.org/papers/paper3.pdf">Reuse Analysis via Affine Factorization</a>
 */
@SuppressWarnings("all")
public class AffineFactorizer {
  /**
   * Generates names containing the given prefix and an incrementing value, separated by an underscore.
   */
  private static Iterator<String> getNameGenerator(final String prefix) {
    final Function1<Integer, String> _function = (Integer it) -> {
      String _string = it.toString();
      return ((prefix + "_") + _string);
    };
    return IterableExtensions.<Integer, String>map(new IntegerRange(0, Integer.MAX_VALUE), _function).iterator();
  }

  /**
   * Gives each output of the provided expression a unique name, overwriting any existing names.
   */
  private static ISLMultiAff nameSingleExpressionOutputs(final ISLMultiAff expression, final Iterator<String> names) {
    final int outCount = expression.dim(ISLDimType.isl_dim_out);
    final Function2<ISLMultiAff, Integer, ISLMultiAff> _function = (ISLMultiAff expr, Integer outIndex) -> {
      return expr.setDimName(ISLDimType.isl_dim_out, outIndex, names.next());
    };
    final Function2<ISLMultiAff, Integer, ISLMultiAff> setName = _function;
    return IterableExtensions.<Integer, ISLMultiAff>fold(new ExclusiveRange(0, outCount, true), expression.copy(), setName);
  }

  /**
   * Gives each output of all the provided expressions a unique name, overwriting any existing names.
   */
  public static ArrayList<ISLMultiAff> nameExpressionOutputs(final ISLMultiAff... expressions) {
    final Iterator<String> names = AffineFactorizer.getNameGenerator("orig_out");
    final Function1<ISLMultiAff, ISLMultiAff> _function = (ISLMultiAff it) -> {
      return AffineFactorizer.nameSingleExpressionOutputs(it, names);
    };
    final List<ISLMultiAff> retVal = ListExtensions.<ISLMultiAff, ISLMultiAff>map(((List<ISLMultiAff>)Conversions.doWrapArray(expressions)), _function);
    return new ArrayList<ISLMultiAff>(retVal);
  }

  /**
   * Merges a set of affine expressions into a single expression via their flat product.
   */
  public static ISLMultiAff mergeExpressions(final ISLMultiAff... expressions) {
    final Function2<ISLMultiAff, ISLMultiAff, ISLMultiAff> _function = (ISLMultiAff left, ISLMultiAff right) -> {
      return left.flatRangeProduct(right);
    };
    return IterableExtensions.<ISLMultiAff>reduce(((Iterable<? extends ISLMultiAff>)Conversions.doWrapArray(expressions)), _function);
  }

  /**
   * Copies the coefficients from one expression in a multi-expression into a matrix.
   */
  private static ISLMatrix outputToMatrixRow(final ISLAff expression, final ISLMatrix matrix, final int row) {
    ISLMatrix updatedMatrix = matrix;
    final int paramCount = expression.dim(ISLDimType.isl_dim_param);
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, paramCount, true);
    for (final Integer i : _doubleDotLessThan) {
      {
        final ISLVal coefficient = expression.getCoefficientVal(ISLDimType.isl_dim_param, (i).intValue());
        updatedMatrix = updatedMatrix.setElement(row, (i).intValue(), coefficient);
      }
    }
    final int inCount = expression.dim(ISLDimType.isl_dim_in);
    ExclusiveRange _doubleDotLessThan_1 = new ExclusiveRange(0, inCount, true);
    for (final Integer i_1 : _doubleDotLessThan_1) {
      {
        final ISLVal coefficient = expression.getCoefficientVal(ISLDimType.isl_dim_in, (i_1).intValue());
        updatedMatrix = updatedMatrix.setElement(row, (paramCount + (i_1).intValue()), coefficient);
      }
    }
    final ISLVal constant = expression.getConstantVal();
    updatedMatrix = updatedMatrix.setElement(row, (paramCount + inCount), constant);
    return updatedMatrix;
  }

  /**
   * Converts an expression into a matrix of its parameters, input indexes, and constants.
   * Throws an error if the expression uses division, as that may not work correctly.
   */
  public static ISLMatrix expressionToMatrix(final ISLMultiAff expression) {
    int _dim = expression.dim(ISLDimType.isl_dim_div);
    boolean _greaterThan = (_dim > 0);
    if (_greaterThan) {
      throw new IllegalArgumentException("Affine expressions with division are not currently supported.");
    }
    final int rows = expression.dim(ISLDimType.isl_dim_out);
    int _dim_1 = expression.dim(ISLDimType.isl_dim_param);
    int _dim_2 = expression.dim(ISLDimType.isl_dim_in);
    int _plus = (_dim_1 + _dim_2);
    final int cols = (_plus + 1);
    final List<ISLAff> affs = expression.getAffs();
    final Function2<ISLMatrix, Integer, ISLMatrix> _function = (ISLMatrix mat, Integer row) -> {
      return AffineFactorizer.outputToMatrixRow(affs.get(row), mat, row);
    };
    final Function2<ISLMatrix, Integer, ISLMatrix> updateRow = _function;
    final ISLContext ctx = expression.getContext();
    final ISLMatrix matrix = IterableExtensions.<Integer, ISLMatrix>fold(new ExclusiveRange(0, rows, true), ISLMatrix.build(ctx, rows, cols), updateRow);
    return matrix;
  }

  /**
   * Checks if a row of the given matrix is empty or not.
   */
  private static boolean isRowEmpty(final ISLMatrix matrix, final int row) {
    final int cols = matrix.getNbCols();
    final Function1<Integer, Boolean> _function = (Integer col) -> {
      long _element = matrix.getElement(row, (col).intValue());
      return Boolean.valueOf((_element != 0));
    };
    boolean _exists = IterableExtensions.<Integer>exists(new ExclusiveRange(0, cols, true), _function);
    return (!_exists);
  }

  /**
   * Returns the number of empty rows in the given matrix.
   * Assumes that the empty rows appear only at the end of the matrix.
   */
  private static int countEmptyRows(final ISLMatrix matrix) {
    final int rows = matrix.getNbRows();
    final Function1<Integer, Boolean> _function = (Integer row) -> {
      return Boolean.valueOf(AffineFactorizer.isRowEmpty(matrix, (row).intValue()));
    };
    final int emptyRowCount = IterableExtensions.size(IterableExtensions.<Integer>takeWhile(new ExclusiveRange(rows, 0, false), _function));
    return emptyRowCount;
  }
}
