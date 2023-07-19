package alpha.model.transformation.reduction;

import alpha.model.util.DomainOperations;
import fr.irisa.cairn.jnimap.isl.ISLBasicSet;
import fr.irisa.cairn.jnimap.isl.ISLDimType;
import fr.irisa.cairn.jnimap.isl.ISLMatrix;
import fr.irisa.cairn.jnimap.isl.ISLSpace;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.xtend.lib.annotations.Data;
import org.eclipse.xtext.xbase.lib.ArrayExtensions;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Pair;
import org.eclipse.xtext.xbase.lib.Pure;

/**
 * Constructs the face lattice for an <code>ISLBasicSet</code>.
 */
@SuppressWarnings("all")
public class FaceLattice {
  /**
   * A single node of the face lattice.
   */
  @Data
  protected static class FaceLatticeNode implements Comparable<FaceLattice.FaceLatticeNode> {
    /**
     * The indexes of the inequalities saturated in this node.
     */
    private final int[] saturatedInequalityIndices;

    /**
     * The ISL basic set which is formed by saturating the inequalities.
     */
    private final ISLBasicSet basicSet;

    /**
     * The children nodes of this node.
     */
    private final ArrayList<FaceLattice.FaceLatticeNode> children = new ArrayList<FaceLattice.FaceLatticeNode>();

    /**
     * Checks if this is the parent of the other node, and adds it as a child if so.
     */
    public void checkAddChild(final FaceLattice.FaceLatticeNode other) {
      boolean _isParentOf = this.isParentOf(other);
      if (_isParentOf) {
        this.children.add(other);
      }
    }

    /**
     * Determines if this node is the parent of another node.
     */
    private boolean isParentOf(final FaceLattice.FaceLatticeNode other) {
      final Function1<Integer, Boolean> _function = (Integer it) -> {
        return Boolean.valueOf(ArrayExtensions.contains(other.saturatedInequalityIndices, (it).intValue()));
      };
      final boolean thisIsSubsetOfOther = IterableExtensions.<Integer>forall(((Iterable<Integer>)Conversions.doWrapArray(this.saturatedInequalityIndices)), _function);
      if ((!thisIsSubsetOfOther)) {
        return false;
      }
      final Function1<Integer, Boolean> _function_1 = (Integer it) -> {
        return Boolean.valueOf(ArrayExtensions.contains(this.saturatedInequalityIndices, (it).intValue()));
      };
      final Iterable<Integer> indicesUniqueToOther = IterableExtensions.<Integer>reject(((Iterable<Integer>)Conversions.doWrapArray(other.saturatedInequalityIndices)), _function_1);
      boolean _isEmpty = IterableExtensions.isEmpty(indicesUniqueToOther);
      if (_isEmpty) {
        return false;
      }
      boolean _isEmpty_1 = IterableExtensions.isEmpty(IterableExtensions.<Integer>tail(indicesUniqueToOther));
      boolean _not = (!_isEmpty_1);
      if (_not) {
        return false;
      }
      return true;
    }

    /**
     * Compares two nodes to see which one comes in lexicographical order.
     * Intended to be used only for sorting nodes so they're easier for a human to read.
     */
    @Override
    public int compareTo(final FaceLattice.FaceLatticeNode other) {
      int _length = this.saturatedInequalityIndices.length;
      int _length_1 = other.saturatedInequalityIndices.length;
      boolean _lessThan = (_length < _length_1);
      if (_lessThan) {
        return (-1);
      }
      int _length_2 = this.saturatedInequalityIndices.length;
      int _length_3 = other.saturatedInequalityIndices.length;
      boolean _greaterThan = (_length_2 > _length_3);
      if (_greaterThan) {
        return 1;
      }
      int _length_4 = this.saturatedInequalityIndices.length;
      ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _length_4, true);
      for (final Integer i : _doubleDotLessThan) {
        {
          final int thisIndex = this.saturatedInequalityIndices[(i).intValue()];
          final int otherIndex = other.saturatedInequalityIndices[(i).intValue()];
          if ((thisIndex < otherIndex)) {
            return (-1);
          }
          if ((thisIndex > otherIndex)) {
            return 1;
          }
        }
      }
      return 0;
    }

    /**
     * Prints the indexes of the inequalities that this node saturates.
     */
    @Override
    public String toString() {
      final Function1<Integer, String> _function = (Integer it) -> {
        return it.toString();
      };
      String _join = String.join(",", ListExtensions.<Integer, String>map(((List<Integer>)Conversions.doWrapArray(this.saturatedInequalityIndices)), _function));
      String _plus = ("{" + _join);
      return (_plus + "}");
    }

    /**
     * Prints this node's saturated inequalities.
     * If the node has children, it also prints them.
     * Otherwise, it prints the ISL set it represents.
     */
    public String toStringWithChildrenOrSet() {
      int _size = this.children.size();
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        return this.toStringWithChildren();
      } else {
        return this.toStringWithSet();
      }
    }

    /**
     * Prints this node's saturated inequalities and children.
     */
    public String toStringWithChildren() {
      String _string = this.toString();
      String _plus = (_string + ": ");
      final Function1<FaceLattice.FaceLatticeNode, String> _function = (FaceLattice.FaceLatticeNode it) -> {
        return it.toString();
      };
      String _join = String.join(", ", ListExtensions.<FaceLattice.FaceLatticeNode, String>map(IterableExtensions.<FaceLattice.FaceLatticeNode>sort(this.children), _function));
      return (_plus + _join);
    }

    /**
     * Prints this node's saturated inequalities and the ISL string for the basic set it creates.
     */
    public String toStringWithSet() {
      String _string = this.toString();
      String _plus = (_string + ": ");
      String _string_1 = this.basicSet.toString();
      return (_plus + _string_1);
    }

    public FaceLatticeNode(final int[] saturatedInequalityIndices, final ISLBasicSet basicSet) {
      super();
      this.saturatedInequalityIndices = saturatedInequalityIndices;
      this.basicSet = basicSet;
    }

    @Override
    @Pure
    public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((this.saturatedInequalityIndices== null) ? 0 : Arrays.hashCode(this.saturatedInequalityIndices));
      result = prime * result + ((this.basicSet== null) ? 0 : this.basicSet.hashCode());
      return prime * result + ((this.children== null) ? 0 : this.children.hashCode());
    }

    @Override
    @Pure
    public boolean equals(final Object obj) {
      if (this == obj)
        return true;
      if (obj == null)
        return false;
      if (getClass() != obj.getClass())
        return false;
      FaceLattice.FaceLatticeNode other = (FaceLattice.FaceLatticeNode) obj;
      if (this.saturatedInequalityIndices == null) {
        if (other.saturatedInequalityIndices != null)
          return false;
      } else if (!Arrays.equals(this.saturatedInequalityIndices, other.saturatedInequalityIndices))
        return false;
      if (this.basicSet == null) {
        if (other.basicSet != null)
          return false;
      } else if (!this.basicSet.equals(other.basicSet))
        return false;
      if (this.children == null) {
        if (other.children != null)
          return false;
      } else if (!this.children.equals(other.children))
        return false;
      return true;
    }

    @Pure
    public int[] getSaturatedInequalityIndices() {
      return this.saturatedInequalityIndices;
    }

    @Pure
    public ISLBasicSet getBasicSet() {
      return this.basicSet;
    }

    @Pure
    public ArrayList<FaceLattice.FaceLatticeNode> getChildren() {
      return this.children;
    }
  }

  /**
   * Iterates through the power set of all inequality constraints of a given set.
   */
  protected static class UnorderedPowerSetIterator implements Iterable<FaceLattice.FaceLatticeNode>, Iterator<FaceLattice.FaceLatticeNode> {
    /**
     * Since each inequality can be saturated or not, we can use the bits of an integer
     * to determine at each step which constraints to saturate.
     */
    private BigInteger currentValue = BigInteger.ZERO;

    /**
     * The final value to use for generating members of the power set.
     * If there are n constraints, this should be (2^n)-1 (n bits of all 1's).
     */
    private final BigInteger finalValue;

    /**
     * The space in which the generated polyhedra exist.
     */
    private final ISLSpace space;

    /**
     * The matrix of inequality constraints that the initial set started with.
     */
    private final ISLMatrix startingEqualities;

    /**
     * The matrix of inequality constraints that involve at least one index dimension
     * that the initial set started with.
     */
    private final ISLMatrix startingIndexInequalities;

    /**
     * The matrix of inequality constraints that involve only parameter dimensions
     * that the initial set started with.
     */
    private final ISLMatrix startingParameterInequalities;

    /**
     * The dimensionality of the starting set.
     * The maximum number of inequalities to saturate is equal to this.
     */
    private final int startingSetDimensionality;

    /**
     * Creates a new iterator which will iterate the power set of all inequality constraints of the given set.
     * The number of inequalities saturated will not exceed the dimensionality of the given set.
     */
    public UnorderedPowerSetIterator(final ISLBasicSet startingSet) {
      this.space = startingSet.getSpace();
      this.startingEqualities = DomainOperations.toISLEqualityMatrix(startingSet);
      this.startingSetDimensionality = FaceLattice.dimensionality(startingSet);
      final Pair<ISLMatrix, ISLMatrix> bothInequalityMatrices = FaceLattice.UnorderedPowerSetIterator.separateIndexInequalities(startingSet);
      this.startingIndexInequalities = bothInequalityMatrices.getKey();
      this.startingParameterInequalities = bothInequalityMatrices.getValue();
      BigInteger _pow = new BigInteger("2").pow(this.startingSetDimensionality);
      final BigInteger dimensionalityMax = _pow.subtract(BigInteger.ONE);
      int _nbRows = this.startingIndexInequalities.getNbRows();
      int _minus = (_nbRows - this.startingSetDimensionality);
      this.finalValue = dimensionalityMax.shiftLeft(_minus);
    }

    /**
     * Gets a new iterator for the power set of all inequality constraints of a given set.
     * Warning: this is only intended to be used once per instance of this class.
     */
    @Override
    public Iterator<FaceLattice.FaceLatticeNode> iterator() {
      return this;
    }

    /**
     * Returns true if there are any more nodes to iterate through and false otherwise.
     */
    @Override
    public boolean hasNext() {
      return (this.currentValue.compareTo(this.finalValue) <= 0);
    }

    /**
     * Returns a face lattice node in the power set of all constraints to saturate.
     */
    @Override
    public FaceLattice.FaceLatticeNode next() {
      int _nbRows = this.startingIndexInequalities.getNbRows();
      final Function1<Integer, Boolean> _function = (Integer it) -> {
        return Boolean.valueOf(this.currentValue.testBit((it).intValue()));
      };
      final Iterable<Integer> indicesToSaturate = IterableExtensions.<Integer>filter(new ExclusiveRange(0, _nbRows, true), _function);
      final FaceLattice.FaceLatticeNode node = this.toFaceLatticeNode(indicesToSaturate);
      BigInteger _currentValue = this.currentValue;
      this.currentValue = _currentValue.add(BigInteger.ONE);
      return node;
    }

    /**
     * Separates the given set's inequality constraint matrix into two separate matrices:
     * one for constraints which involve at least one index, and one for constraints involving
     * only parameters.
     * 
     * @keep startingSet Keep. The set to split the inequality constraints of.
     * @return Returns a pair of ISL matrices.
     *         The one in the "key" position contains the constraints involving at least one index.
     *         The one in the "value" position contains the constraints involving only parameters.
     */
    private static Pair<ISLMatrix, ISLMatrix> separateIndexInequalities(final ISLBasicSet startingSet) {
      ISLMatrix indexConstraints = DomainOperations.toISLInequalityMatrix(startingSet);
      ISLMatrix parameterConstraints = indexConstraints.copy();
      final int indexCount = FaceLattice.indexDimensionCount(startingSet);
      int _nbRows = indexConstraints.getNbRows();
      ExclusiveRange _greaterThanDoubleDot = new ExclusiveRange(_nbRows, 0, false);
      for (final Integer row : _greaterThanDoubleDot) {
        boolean _constraintInvolvesIndex = FaceLattice.constraintInvolvesIndex(indexConstraints, (row).intValue(), indexCount);
        if (_constraintInvolvesIndex) {
          parameterConstraints = parameterConstraints.dropRows((row).intValue(), 1);
        } else {
          indexConstraints = indexConstraints.dropRows((row).intValue(), 1);
        }
      }
      return Pair.<ISLMatrix, ISLMatrix>of(indexConstraints, parameterConstraints);
    }

    /**
     * Generates a face lattice node from a set of indexes to saturate.
     */
    private FaceLattice.FaceLatticeNode toFaceLatticeNode(final Iterable<Integer> toSaturate) {
      ISLMatrix equalities = this.startingIndexInequalities.copy();
      ISLMatrix inequalities = equalities.copy();
      int _nbRows = this.startingIndexInequalities.getNbRows();
      ExclusiveRange _greaterThanDoubleDot = new ExclusiveRange(_nbRows, 0, false);
      for (final Integer row : _greaterThanDoubleDot) {
        boolean _contains = IterableExtensions.contains(toSaturate, row);
        if (_contains) {
          inequalities = inequalities.dropRows((row).intValue(), 1);
        } else {
          equalities = equalities.dropRows((row).intValue(), 1);
        }
      }
      equalities = equalities.concat(this.startingEqualities.copy());
      inequalities = inequalities.concat(this.startingParameterInequalities.copy());
      final ISLBasicSet basicSet = ISLBasicSet.fromConstraintMatrices(
        this.space.copy(), equalities, inequalities, 
        ISLDimType.isl_dim_param, ISLDimType.isl_dim_set, 
        ISLDimType.isl_dim_div, ISLDimType.isl_dim_cst);
      return new FaceLattice.FaceLatticeNode(((int[])Conversions.unwrapArray(toSaturate, int.class)), basicSet);
    }
  }

  /**
   * The container for the face lattice itself, organized into layers.
   * Layer 0 is the top level of the lattice (highest dimensionality),
   * which should contain only the starting set.
   * Each successive layer has one fewer dimension than the previous layer.
   * The last layer will be the vertices.
   */
  private final ArrayList<ArrayList<FaceLattice.FaceLatticeNode>> lattice = new ArrayList<ArrayList<FaceLattice.FaceLatticeNode>>();

  /**
   * The dimensionality of the given set, which is at the top of the lattice.
   */
  private final int givenSetDimensionality;

  /**
   * Constructs a new face lattice for the given set.
   */
  public FaceLattice(final ISLBasicSet givenSet) throws UnsupportedOperationException {
    final ISLBasicSet startingSet = givenSet.copy().removeRedundancies();
    int _nbParams = startingSet.getNbParams();
    boolean _greaterThan = (_nbParams > 1);
    if (_greaterThan) {
      throw new UnsupportedOperationException("Parameterized polyhedra are not supported at this time.");
    }
    this.givenSetDimensionality = FaceLattice.dimensionality(givenSet);
    final FaceLattice.UnorderedPowerSetIterator powerSetIterator = new FaceLattice.UnorderedPowerSetIterator(startingSet);
    final Consumer<FaceLattice.FaceLatticeNode> _function = (FaceLattice.FaceLatticeNode it) -> {
      this.checkAddNode(it);
    };
    powerSetIterator.forEach(_function);
    int _size = this.lattice.size();
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(1, _size, true);
    for (final Integer i : _doubleDotLessThan) {
      {
        final ArrayList<FaceLattice.FaceLatticeNode> parentLayer = this.lattice.get(((i).intValue() - 1));
        final ArrayList<FaceLattice.FaceLatticeNode> currentLayer = this.lattice.get((i).intValue());
        for (final FaceLattice.FaceLatticeNode parent : parentLayer) {
          for (final FaceLattice.FaceLatticeNode child : currentLayer) {
            parent.checkAddChild(child);
          }
        }
      }
    }
  }

  /**
   * Determines the dimensionality (number of free dimensions) for a set.
   * This is defined as the number of index variables minus the number of
   * linearly independent equality constraints which involve at least one index variable.
   * 
   * @keep set Keep. The set to find the dimensionality of.
   */
  private static int dimensionality(final ISLBasicSet set) {
    final int indexCount = FaceLattice.indexDimensionCount(set);
    ISLMatrix equalityMatrix = DomainOperations.toISLEqualityMatrix(set);
    int _nbRows = equalityMatrix.getNbRows();
    ExclusiveRange _greaterThanDoubleDot = new ExclusiveRange(_nbRows, 0, false);
    for (final Integer row : _greaterThanDoubleDot) {
      boolean _constraintInvolvesIndex = FaceLattice.constraintInvolvesIndex(equalityMatrix, (row).intValue(), indexCount);
      boolean _not = (!_constraintInvolvesIndex);
      if (_not) {
        equalityMatrix = equalityMatrix.dropRows((row).intValue(), 1);
      }
    }
    int _rank = equalityMatrix.rank();
    return (indexCount - _rank);
  }

  /**
   * Checks if a node is valid to be added to the face lattice, adding it if it is.
   */
  private void checkAddNode(final FaceLattice.FaceLatticeNode node) {
    boolean _isEmpty = node.basicSet.isEmpty();
    if (_isEmpty) {
      return;
    }
    final int dimensionality = FaceLattice.dimensionality(node.basicSet);
    final int layer = (this.givenSetDimensionality - dimensionality);
    int _length = node.saturatedInequalityIndices.length;
    boolean _notEquals = (layer != _length);
    if (_notEquals) {
      String _string = node.toString();
      String _plus = ((("Node layer and saturated inequality count mismatch! Layer: " + Integer.valueOf(layer)) + ", node: ") + _string);
      System.err.println(_plus);
    }
    while ((this.lattice.size() <= layer)) {
      ArrayList<FaceLattice.FaceLatticeNode> _arrayList = new ArrayList<FaceLattice.FaceLatticeNode>();
      this.lattice.add(_arrayList);
    }
    this.lattice.get(layer).add(node);
  }

  /**
   * Checks if the row of a constraint matrix has a non-zero coefficient for at least one index dimension.
   */
  private static boolean constraintInvolvesIndex(final ISLMatrix matrix, final int row, final int indexCount) {
    int _nbCols = matrix.getNbCols();
    final int endExclusive = (_nbCols - 1);
    final int start = (endExclusive - indexCount);
    final Function1<Integer, Boolean> _function = (Integer col) -> {
      long _element = matrix.getElement(row, (col).intValue());
      return Boolean.valueOf((_element != 0));
    };
    return IterableExtensions.<Integer>exists(new ExclusiveRange(start, endExclusive, true), _function);
  }

  /**
   * Gets the number of index dimensions in the given set.
   */
  private static int indexDimensionCount(final ISLBasicSet set) {
    return set.dim(ISLDimType.isl_dim_set);
  }
}
