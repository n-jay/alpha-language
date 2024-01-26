package alpha.model.util;

import fr.irisa.cairn.jnimap.isl.ISLAff;
import fr.irisa.cairn.jnimap.isl.ISLContext;
import fr.irisa.cairn.jnimap.isl.ISLDimType;
import fr.irisa.cairn.jnimap.isl.ISLHermiteResult;
import fr.irisa.cairn.jnimap.isl.ISLLocalSpace;
import fr.irisa.cairn.jnimap.isl.ISLMatrix;
import fr.irisa.cairn.jnimap.isl.ISLMultiAff;
import fr.irisa.cairn.jnimap.isl.ISLSpace;
import fr.irisa.cairn.jnimap.isl.ISLVal;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.IntegerRange;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Pair;

/**
 * Factorizes a set of multi-dimensional affine maps (i.e., <code>ISLMultiAff</code>).
 * The main way this class is expected to be used is by calling the <code>factorizeExpressions</code>
 * static method with a set of affine expressions.
 * This returns a key->value pair, where the key is the "common factor" that can be pulled out,
 * and the value is a dictionary mapping each of the original expressions
 * to the "remaining term" that is left after pulling out the common factor.
 * Each expression can be rewritten as the composition of the common factor and the remaining term
 * as follows: <code>remainingTerm.pullback(commonFactor)</code>
 * 
 * @see <a href="https://impact-workshop.org/papers/paper3.pdf">Reuse Analysis via Affine Factorization</a>
 */
@SuppressWarnings("all")
public class AffineFactorizer {
  /**
   * Factors a set of affine expressions which have the same domain.
   * 
   * @param  expressions A list or array of affine multi-dimensional expressions to factor.
   * @return A key->value pair where the key is the "common factor" and the value is a map
   *         from each of the input expressions to the "remaining term" that is left after
   *         pulling out the common factor. That is, the following would return true,
   *         where <code>expr</code> is one of the input expressions and <code>result</code>
   *         is the return value of this function:
   *         <code>expr.isPlainEqual(result.value.get(expr).pullback(result.key.copy))</code>
   */
  public static Pair<ISLMultiAff, HashMap<ISLMultiAff, ISLMultiAff>> factorizeExpressions(final ISLMultiAff... expressions) {
    final HashMap<ISLMultiAff, ISLMultiAff> named = AffineFactorizer.nameExpressionOutputs(expressions);
    final Function1<ISLMultiAff, ISLMultiAff> _function = (ISLMultiAff it) -> {
      return it.copy();
    };
    final Pair<ISLMultiAff, ISLMultiAff> decomposed = AffineFactorizer.decomposeExpression(AffineFactorizer.mergeExpressions(((ISLMultiAff[])Conversions.unwrapArray(IterableExtensions.<ISLMultiAff, ISLMultiAff>map(named.values(), _function), ISLMultiAff.class))));
    final ISLMultiAff hExpression = decomposed.getKey();
    final ISLMultiAff qExpression = decomposed.getValue();
    final Function1<ISLMultiAff, ISLMultiAff> _function_1 = (ISLMultiAff expr) -> {
      return AffineFactorizer.getDecompositionProjection(named.get(expr), qExpression);
    };
    Map<ISLMultiAff, ISLMultiAff> _invertedMap = IterableExtensions.<ISLMultiAff, ISLMultiAff>toInvertedMap(((Iterable<? extends ISLMultiAff>)Conversions.doWrapArray(expressions)), _function_1);
    final HashMap<ISLMultiAff, ISLMultiAff> projectionMap = new HashMap<ISLMultiAff, ISLMultiAff>(_invertedMap);
    return Pair.<ISLMultiAff, HashMap<ISLMultiAff, ISLMultiAff>>of(hExpression, projectionMap);
  }

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
    final Function2<ISLMultiAff, Integer, ISLMultiAff> assignName = _function;
    return IterableExtensions.<Integer, ISLMultiAff>fold(new ExclusiveRange(0, outCount, true), expression.copy(), assignName);
  }

  /**
   * Creates a copy of each input expression, but renames all the outputs so they can be tracked.
   * Returns a map from the original expressions to the named ones.
   */
  public static HashMap<ISLMultiAff, ISLMultiAff> nameExpressionOutputs(final ISLMultiAff... expressions) {
    final Iterator<String> names = AffineFactorizer.getNameGenerator("orig_out");
    final Function1<ISLMultiAff, ISLMultiAff> _function = (ISLMultiAff it) -> {
      return AffineFactorizer.nameSingleExpressionOutputs(it, names);
    };
    final Map<ISLMultiAff, ISLMultiAff> retVal = IterableExtensions.<ISLMultiAff, ISLMultiAff>toInvertedMap(((Iterable<? extends ISLMultiAff>)Conversions.doWrapArray(expressions)), _function);
    return new HashMap<ISLMultiAff, ISLMultiAff>(retVal);
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
  private static ISLMatrix outputToMatrixCol(final ISLAff expression, final ISLMatrix matrix, final int col) {
    ISLMatrix updatedMatrix = matrix;
    final int paramCount = expression.dim(ISLDimType.isl_dim_param);
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, paramCount, true);
    for (final Integer i : _doubleDotLessThan) {
      {
        final ISLVal coefficient = expression.getCoefficientVal(ISLDimType.isl_dim_param, (i).intValue());
        updatedMatrix = updatedMatrix.setElement((i).intValue(), col, coefficient);
      }
    }
    final int inCount = expression.dim(ISLDimType.isl_dim_in);
    ExclusiveRange _doubleDotLessThan_1 = new ExclusiveRange(0, inCount, true);
    for (final Integer i_1 : _doubleDotLessThan_1) {
      {
        final ISLVal coefficient = expression.getCoefficientVal(ISLDimType.isl_dim_in, (i_1).intValue());
        updatedMatrix = updatedMatrix.setElement((paramCount + (i_1).intValue()), col, coefficient);
      }
    }
    final ISLVal constant = expression.getConstantVal();
    updatedMatrix = updatedMatrix.setElement((paramCount + inCount), col, constant);
    return updatedMatrix;
  }

  /**
   * Converts an expression into a matrix of its parameters, input indexes, and constants.
   * The matrix is column-oriented (i.e., each affine expression is one column).
   * Throws an error if the expression uses division, as that may not work correctly.
   */
  public static ISLMatrix expressionToMatrix(final ISLMultiAff expression) {
    int _dim = expression.dim(ISLDimType.isl_dim_div);
    boolean _greaterThan = (_dim > 0);
    if (_greaterThan) {
      throw new IllegalArgumentException("Affine expressions with division are not currently supported.");
    }
    final int cols = expression.dim(ISLDimType.isl_dim_out);
    int _dim_1 = expression.dim(ISLDimType.isl_dim_param);
    int _dim_2 = expression.dim(ISLDimType.isl_dim_in);
    int _plus = (_dim_1 + _dim_2);
    final int rows = (_plus + 1);
    final List<ISLAff> affs = expression.getAffs();
    final Function2<ISLMatrix, Integer, ISLMatrix> _function = (ISLMatrix mat, Integer col) -> {
      return AffineFactorizer.outputToMatrixCol(affs.get(col), mat, col);
    };
    final Function2<ISLMatrix, Integer, ISLMatrix> updateCol = _function;
    final ISLContext ctx = expression.getContext();
    final ISLMatrix matrix = IterableExtensions.<Integer, ISLMatrix>fold(new ExclusiveRange(0, cols, true), ISLMatrix.build(ctx, rows, cols), updateCol);
    return matrix;
  }

  /**
   * Checks if a column of the given matrix is empty or not.
   */
  private static boolean isColEmpty(final ISLMatrix matrix, final int col) {
    final int rows = matrix.getNbRows();
    final Function1<Integer, Boolean> _function = (Integer row) -> {
      long _element = matrix.getElement((row).intValue(), col);
      return Boolean.valueOf((_element != 0));
    };
    boolean _exists = IterableExtensions.<Integer>exists(new ExclusiveRange(0, rows, true), _function);
    return (!_exists);
  }

  /**
   * Returns the number of empty columns in the given matrix.
   * Assumes that the empty rows appear only on the right of the matrix.
   */
  private static int countEmptyCols(final ISLMatrix matrix) {
    final int cols = matrix.getNbCols();
    final Function1<Integer, Boolean> _function = (Integer col) -> {
      return Boolean.valueOf(AffineFactorizer.isColEmpty(matrix, (col).intValue()));
    };
    final int emptyRowCount = IterableExtensions.size(IterableExtensions.<Integer>takeWhile(new ExclusiveRange(cols, 1, false), _function));
    return emptyRowCount;
  }

  /**
   * Reduces the dimensionality of the matrices constructed by the
   * Hermite Normal Form calculation.
   * This is done by dropping the columns of zeros from the right of H
   * along with the same number of rows from the bottom of Q.
   * This assumes that all columns of zeros are on the right of H,
   * which matches ISL's implementation.
   */
  public static Pair<ISLMatrix, ISLMatrix> reduceHermiteDimensionality(final ISLMatrix h, final ISLMatrix q) {
    final int emptyCols = AffineFactorizer.countEmptyCols(h);
    if ((emptyCols == 0)) {
      return Pair.<ISLMatrix, ISLMatrix>of(h, q);
    }
    int _nbCols = h.getNbCols();
    final int firstToDrop = (_nbCols - emptyCols);
    final ISLMatrix hUpdated = h.dropCols(firstToDrop, emptyCols);
    final ISLMatrix qUpdated = q.dropRows(firstToDrop, emptyCols);
    return Pair.<ISLMatrix, ISLMatrix>of(hUpdated, qUpdated);
  }

  /**
   * Performs the column-oriented Hermite decomposition of the given
   * matrix, returning H and Q as the two outputs (as a key->value pair,
   * in that order respectively). Any columns of 0's have been dropped
   * from the right of H, along with the same number of rows from the
   * bottom of Q.
   */
  public static Pair<ISLMatrix, ISLMatrix> hermiteDecomposition(final ISLMatrix matrix) {
    final ISLHermiteResult hermiteResult = matrix.leftHermite();
    return AffineFactorizer.reduceHermiteDimensionality(hermiteResult.getH(), hermiteResult.getQ());
  }

  /**
   * Returns an empty expression. I.e., { [] -> [] }
   */
  public static ISLMultiAff emptyExpr(final ISLContext context) {
    return ISLMultiAff.buildFromString(context, "{ [] -> [] }");
  }

  /**
   * Creates the new spaces for the decomposition of the original space,
   * returned as a key->value pair. The key has the same domain as the
   * original space, and the value has the same range as the original space.
   * The unspecified range/domain are the same, with a number of dimensions
   * equal to the desired amount.
   */
  private static Pair<ISLSpace, ISLSpace> createDecompositionSpaces(final ISLSpace originalSpace, final int innerDimensionCount) {
    int _xifexpression = (int) 0;
    if ((innerDimensionCount > 0)) {
      _xifexpression = innerDimensionCount;
    } else {
      _xifexpression = 1;
    }
    final int namesToMake = _xifexpression;
    final List<String> innerNames = IteratorExtensions.<String>toList(IteratorExtensions.<String>take(AffineFactorizer.getNameGenerator("mid"), namesToMake));
    final ISLSpace firstSpace = originalSpace.copy().domain().reverse().<ISLSpace>addOutputs(innerNames);
    final int paramCount = originalSpace.dim(ISLDimType.isl_dim_param);
    final ISLSpace secondSpace = originalSpace.copy().range().dropDims(ISLDimType.isl_dim_param, 0, paramCount).<ISLSpace>addInputs(innerNames);
    return Pair.<ISLSpace, ISLSpace>of(firstSpace, secondSpace);
  }

  /**
   * Converts a column of a matrix into an expression.
   */
  private static ISLMultiAff columnToExpression(final ISLMatrix matrix, final ISLSpace space, final int col) {
    ISLAff expression = ISLAff.buildZero(space.copy().domain().toLocalSpace());
    final int paramCount = space.dim(ISLDimType.isl_dim_param);
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, paramCount, true);
    for (final Integer i : _doubleDotLessThan) {
      {
        final ISLVal coefficient = matrix.getElementVal((i).intValue(), col);
        expression = expression.setCoefficient(ISLDimType.isl_dim_param, (i).intValue(), coefficient);
      }
    }
    final int inCount = space.dim(ISLDimType.isl_dim_in);
    ExclusiveRange _doubleDotLessThan_1 = new ExclusiveRange(0, inCount, true);
    for (final Integer i_1 : _doubleDotLessThan_1) {
      {
        final ISLVal coefficient = matrix.getElementVal((paramCount + (i_1).intValue()), col);
        expression = expression.setCoefficient(ISLDimType.isl_dim_in, (i_1).intValue(), coefficient);
      }
    }
    int _nbRows = matrix.getNbRows();
    boolean _greaterThan = (_nbRows > (paramCount + inCount));
    if (_greaterThan) {
      final ISLVal constant = matrix.getElementVal((paramCount + inCount), col);
      expression = expression.setConstant(constant);
    } else {
      expression = expression.setConstant(0);
    }
    final String outputName = space.getDimName(ISLDimType.isl_dim_out, col);
    ISLMultiAff _multiAff = expression.toMultiAff();
    String _elvis = null;
    if (outputName != null) {
      _elvis = outputName;
    } else {
      _elvis = "None";
    }
    return _multiAff.setDimName(ISLDimType.isl_dim_out, 0, _elvis);
  }

  /**
   * Converts a matrix into an expression. Each column is for one of the output dimensions.
   */
  private static ISLMultiAff matrixToExpression(final ISLMatrix matrix, final ISLSpace space) {
    int _nbCols = matrix.getNbCols();
    final Function1<Integer, ISLMultiAff> _function = (Integer col) -> {
      return AffineFactorizer.columnToExpression(matrix, space, (col).intValue());
    };
    return AffineFactorizer.mergeExpressions(((ISLMultiAff[])Conversions.unwrapArray(IterableExtensions.<Integer, ISLMultiAff>map(new ExclusiveRange(0, _nbCols, true), _function), ISLMultiAff.class)));
  }

  /**
   * Decomposes an expression using the Hermite decomposition of the matrix
   * which represents the given expression. The decomposition is returned as
   * a key->value pair, where the key has the same domain as the original
   * expression, and the value has the same range as the original expression.
   * The range of the key is the same as the domain of the value.
   */
  public static Pair<ISLMultiAff, ISLMultiAff> decomposeExpression(final ISLMultiAff expression) {
    int _dim = expression.dim(ISLDimType.isl_dim_out);
    boolean _equals = (_dim == 0);
    if (_equals) {
      ISLMultiAff _emptyExpr = AffineFactorizer.emptyExpr(expression.getContext());
      return Pair.<ISLMultiAff, ISLMultiAff>of(expression, _emptyExpr);
    }
    final Pair<ISLMatrix, ISLMatrix> decomposed = AffineFactorizer.hermiteDecomposition(AffineFactorizer.expressionToMatrix(expression));
    final ISLMatrix hMatrix = decomposed.getKey();
    final ISLMatrix qMatrix = decomposed.getValue();
    final Pair<ISLSpace, ISLSpace> spaces = AffineFactorizer.createDecompositionSpaces(expression.getSpace(), hMatrix.getNbCols());
    final ISLSpace hSpace = spaces.getKey();
    final ISLSpace qSpace = spaces.getValue();
    final ISLMultiAff hExpression = AffineFactorizer.matrixToExpression(hMatrix, hSpace);
    final ISLMultiAff qExpression = AffineFactorizer.matrixToExpression(qMatrix, qSpace);
    return Pair.<ISLMultiAff, ISLMultiAff>of(hExpression, qExpression);
  }

  /**
   * Returns the projection of the decomposed expression (Q)
   * which can be used to recreate the given original expression.
   */
  private static ISLMultiAff getDecompositionProjection(final ISLMultiAff original, final ISLMultiAff q) {
    int _dim = q.dim(ISLDimType.isl_dim_out);
    boolean _equals = (_dim == 0);
    if (_equals) {
      return AffineFactorizer.emptyExpr(original.getContext());
    }
    int _dim_1 = original.dim(ISLDimType.isl_dim_out);
    boolean _equals_1 = (_dim_1 == 0);
    if (_equals_1) {
      final ISLLocalSpace qRange = q.getSpace().domain().toLocalSpace();
      final ISLMultiAff mapToZero = ISLAff.buildZero(qRange).toMultiAff();
      final int outs = mapToZero.dim(ISLDimType.isl_dim_out);
      return mapToZero.dropDims(ISLDimType.isl_dim_out, 0, outs);
    }
    final ISLSpace domain = q.getSpace().range();
    final Function1<String, Integer> _function = (String name) -> {
      return Integer.valueOf(domain.findDimByName(ISLDimType.isl_dim_out, name));
    };
    final List<Integer> wantedIndexes = ListExtensions.<String, Integer>map(original.getSpace().getDimNames(ISLDimType.isl_dim_out), _function);
    final ISLLocalSpace localDomain = domain.copy().toLocalSpace();
    final Function1<Integer, ISLAff> _function_1 = (Integer i) -> {
      return ISLAff.buildVarOnDomain(localDomain.copy(), ISLDimType.isl_dim_out, (i).intValue());
    };
    final List<ISLAff> first = ListExtensions.<Integer, ISLAff>map(wantedIndexes, _function_1);
    final Function1<ISLAff, ISLMultiAff> _function_2 = (ISLAff expr) -> {
      return expr.toMultiAff();
    };
    final List<ISLMultiAff> second = ListExtensions.<ISLAff, ISLMultiAff>map(first, _function_2);
    final ISLMultiAff projection = AffineFactorizer.mergeExpressions(((ISLMultiAff[])Conversions.unwrapArray(second, ISLMultiAff.class)));
    return projection.pullback(q.copy());
  }
}
