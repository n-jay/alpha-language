package alpha.codegen.tiler;

import fr.irisa.cairn.jnimap.isl.ISLMap;
import fr.irisa.cairn.jnimap.isl.ISLSet;
import java.util.Set;

@SuppressWarnings("all")
public interface Tiler {
  ISLMap getTileMap();

  Set<Integer> getTiledDims();

  ISLSet getApproximateOutset();

  ISLSet getTilePrototype();

  boolean isVectorizable();
}
