package alpha.codegen.isl;

import fr.irisa.cairn.jnimap.isl.ISLASTBuild;
import fr.irisa.cairn.jnimap.isl.ISLASTNode;
import fr.irisa.cairn.jnimap.isl.ISLDimType;
import fr.irisa.cairn.jnimap.isl.ISLMap;
import fr.irisa.cairn.jnimap.isl.ISLMultiAff;
import fr.irisa.cairn.jnimap.isl.ISLSet;
import fr.irisa.cairn.jnimap.isl.ISLUnionMap;

/**
 * Generates the loop statements that iterate through the points in a given domain.
 */
@SuppressWarnings("all")
public class LoopGenerator {
  /**
   * Generates the loop statements that iterate through the points in the given domain
   * in lexicographic order (i.e., scheduled by the identity function).
   */
  public static ISLASTNode generateLoops(final String macroName, final ISLSet domain) {
    final ISLMap identity = ISLMultiAff.buildIdentity(domain.getSpace().addDims(ISLDimType.isl_dim_in, domain.getNbIndices())).toMap();
    return LoopGenerator.generateLoops(macroName, domain, identity);
  }

  /**
   * Generates the loop statements that iterate through the points in the given domain
   * according to the timestamps indicated by the given map.
   */
  public static ISLASTNode generateLoops(final String macroName, final ISLSet domain, final ISLMap timestamps) {
    final ISLSet context = domain.copy().params();
    final ISLUnionMap schedule = timestamps.copy().intersectDomain(domain.copy()).setTupleName(ISLDimType.isl_dim_in, macroName).toUnionMap();
    return ISLASTBuild.buildFromContext(context).generate(schedule);
  }
}
