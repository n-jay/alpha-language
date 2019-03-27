package alpha.model.analysis.reduction;

import java.util.Map;
import java.util.stream.Collectors;

import com.google.common.collect.Streams;

import alpha.model.AlphaExpression;
import alpha.model.matrix.MatrixOperations;
import alpha.model.util.AShow;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLSet;

/**
 * Wraps the result of {@link ShareSpaceAnalysis}.
 * 
 * @author tyuki
 *
 */
public class ShareSpaceAnalysisResult {

	protected Map<AlphaExpression, long[][]> shareSpace;
	
	public ShareSpaceAnalysisResult(Map<AlphaExpression, long[][]> shareSpace) {
		this.shareSpace = shareSpace;
	}
	
	public boolean hasNonTrivialShareSpace() {
		return shareSpace.values().stream().filter(x->x!=null).count() > 0;
	}
	
	public long[][] getShareSpace(AlphaExpression expr) {
		return shareSpace.get(expr);
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		
		for (Map.Entry<AlphaExpression, long[][]> e : shareSpace.entrySet() ) {
			if (e.getValue() != null) {
				JNIISLSet ctxDom = e.getKey().getContextDomain();
				sb.append(AShow.print(e.getKey()));
				sb.append("\n");
				sb.append(Streams.concat(ctxDom.getParametersNames().stream(),
								ctxDom.getIndicesNames().stream()).collect(Collectors.joining(" ", "[", "]")));
				sb.append("\n");
				sb.append(MatrixOperations.toString(e.getValue()));
				sb.append("\n");
			}
		}
		
		return sb.toString();
	}
}
