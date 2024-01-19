package alpha.model.transformation.reduction;

import alpha.model.util.SetInfo;
import com.google.common.collect.Iterables;
import fr.irisa.cairn.jnimap.isl.ISLBasicSet;
import java.util.ArrayList;
import java.util.LinkedList;
import org.eclipse.xtend.lib.annotations.AccessorType;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Pure;

/**
 * Constructs the face lattice of a given <code>ISLBasicSet</code>.
 * Usage: to create the face lattice, call the static function: <code>FaceLattice.create(root)</code>.
 */
@SuppressWarnings("all")
public class FaceLattice {
  /**
   * The information about the set which forms the root of the lattice.
   */
  @Accessors(AccessorType.PUBLIC_GETTER)
  private final SetInfo rootInfo;

  /**
   * The storage of the lattice itself.
   * The index of each layer (the outermost list) is the dimensionality.
   * I.e., <code>lattice[2]</code> contains all the 2D faces of the lattice.
   * Each layer is a list of all the sets which are in that layer.
   */
  @Accessors(AccessorType.PUBLIC_GETTER)
  private final ArrayList<ArrayList<SetInfo>> lattice;

  /**
   * Constructs a new, empty lattice.
   */
  private FaceLattice(final SetInfo rootInfo) {
    this.rootInfo = rootInfo;
    ArrayList<ArrayList<SetInfo>> _arrayList = new ArrayList<ArrayList<SetInfo>>();
    this.lattice = _arrayList;
  }

  /**
   * Creates a new face lattice for the given set.
   */
  public static FaceLattice create(final ISLBasicSet root) {
    final SetInfo rootInfo = new SetInfo(root);
    final FaceLattice lattice = new FaceLattice(rootInfo);
    final LinkedList<ArrayList<Integer>> toSaturate = new LinkedList<ArrayList<Integer>>();
    ArrayList<Integer> _arrayList = new ArrayList<Integer>();
    toSaturate.add(_arrayList);
    while ((!toSaturate.isEmpty())) {
      {
        final ArrayList<Integer> currentConstraints = toSaturate.remove();
        final boolean isValidFace = lattice.checkAddFace(currentConstraints);
        final boolean hasChildren = (isValidFace && (currentConstraints.size() < rootInfo.getDimensionality()));
        if (hasChildren) {
          int _xifexpression = (int) 0;
          boolean _isEmpty = currentConstraints.isEmpty();
          if (_isEmpty) {
            _xifexpression = 0;
          } else {
            Integer _last = IterableExtensions.<Integer>last(currentConstraints);
            _xifexpression = ((_last).intValue() + 1);
          }
          final int minimumIndex = _xifexpression;
          int _indexInequalityCount = rootInfo.getIndexInequalityCount();
          ExclusiveRange _doubleDotLessThan = new ExclusiveRange(minimumIndex, _indexInequalityCount, true);
          for (final Integer constraint : _doubleDotLessThan) {
            {
              final ArrayList<Integer> nextSet = new ArrayList<Integer>(currentConstraints);
              nextSet.add(constraint);
              toSaturate.add(nextSet);
            }
          }
        }
      }
    }
    return lattice;
  }

  /**
   * Gets the set of all children of the indicated face.
   */
  public Iterable<SetInfo> getChildren(final SetInfo face) {
    final int faceLayer = Integer.max(0, face.getDimensionality());
    if (((faceLayer == 0) || (faceLayer >= this.lattice.size()))) {
      return new ArrayList<SetInfo>();
    }
    final Function1<SetInfo, Boolean> _function = (SetInfo node) -> {
      return Boolean.valueOf(node.isChildOf(face));
    };
    return IterableExtensions.<SetInfo>filter(this.lattice.get((faceLayer - 1)), _function);
  }

  /**
   * Returns the set of all faces, not organized by dimension.
   */
  public Iterable<SetInfo> getAllFaces() {
    return Iterables.<SetInfo>concat(this.lattice);
  }

  /**
   * Indicates whether or not the set used as the root of the lattice is simplicial (hyper-triangular) or not.
   */
  public boolean isSimplicial() {
    boolean _isEmpty = this.rootInfo.isEmpty();
    if (_isEmpty) {
      return false;
    }
    boolean _isBounded = this.rootInfo.isBounded();
    boolean _not = (!_isBounded);
    if (_not) {
      return false;
    }
    final ArrayList<SetInfo> zeroFaces = this.lattice.get(0);
    if ((zeroFaces == null)) {
      return false;
    }
    int _size = zeroFaces.size();
    int _dimensionality = this.rootInfo.getDimensionality();
    int _plus = (_dimensionality + 1);
    boolean _notEquals = (_size != _plus);
    if (_notEquals) {
      return false;
    }
    return true;
  }

  /**
   * Checks if a face is valid to add to the lattice, and adds it if so.
   * @returns Returns <code>true</code> if the face was valid and added, and <code>false</code> otherwise.
   */
  private boolean checkAddFace(final ArrayList<Integer> toSaturate) {
    final SetInfo face = SetInfo.createFace(this.rootInfo, toSaturate);
    boolean _isValidFace = face.isValidFace(this.rootInfo);
    boolean _not = (!_isValidFace);
    if (_not) {
      return false;
    }
    final int layerIndex = Integer.max(0, face.getDimensionality());
    while ((this.lattice.size() <= layerIndex)) {
      ArrayList<SetInfo> _arrayList = new ArrayList<SetInfo>();
      this.lattice.add(_arrayList);
    }
    this.lattice.get(layerIndex).add(face);
    return true;
  }

  @Pure
  public SetInfo getRootInfo() {
    return this.rootInfo;
  }

  @Pure
  public ArrayList<ArrayList<SetInfo>> getLattice() {
    return this.lattice;
  }
}
