package alpha.model.testframework;

import java.io.IOException;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;

import org.eclipse.emf.ecore.util.EcoreUtil;

import alpha.model.AlphaModelLoader;
import alpha.model.testframework.data.IAlphaData;
import fr.irisa.cairn.gecos.testframework.model.IVersionFactory;

/**
 * This class mimics the structure in GSOperators (gecos.core.testframework.impl)
 * 
 * The static methods are used when building test flows for Alpha using the testframework in GeCoS.
 * 
 * 
 * @author tyuki
 *
 */
public class AlphaTestOperators {

	private AlphaTestOperators() {}
	

	/**
	 * Create a new version using the provided factory, and:<ul>
	 * <li> set its project as a copy of the project of the specified version.
	 * <li> then, optionally apply the specified {@code afterVersionCreation}
	 * of the created (i.e. the copy) version.
	 * </ul>
	 * 
	 * @param versionFactory which is used to create the new version.
	 * the created project, otherwise do nothing.
	 * @param afterVersionCreation if not {@code null} accept
	 * the created version, otherwise do nothing.
	 * @return a function that when applied on a given version returns a copy of it.
	 */
	public static final <V extends AlphaTestVersion> Function<V, V> versionCopier(
			IVersionFactory<V> versionFactory, Consumer<V> afterVersionCreation) {
		return src -> {
			V copy = versionFactory.createVersion();
			copy.setPrevious(src);
			copy.setTimeout(src.getTimeout());
			src.getAlphaRoots().forEach(a->copy.getAlphaRoots().add(EcoreUtil.copy(a)));
			
			if(afterVersionCreation != null)
				afterVersionCreation.accept(copy);

			return copy;
		};
	}

	
	/**
	 * Create a new version using the provided factory, and:<ul>
	 * <li> set its project as a copy of the project of the specified version.
	 * <li> set its previous as the source version.
	 * </ul>
	 * 
	 * @param versionFactory which is used to create the new version.
	 * @return a function that when applied on a given version returns a copy of it.
	 */
	public static final <V extends AlphaTestVersion> Function<V, V> versionCopier(
			IVersionFactory<V> versionFactory) {
		return versionCopier(versionFactory, null);
	}
	
	/**
	 * Create a function that when applied, on a given data, returns a new version.
	 * It performs the following:
	 * <ul>FIXME
	 * <li> Create a new {@link AlphaTestVersion} and initialize it from data information
	 * (path to source file or unit directory).
	 * <li> Parse the input files and construct expression/context domain
	 * <li> Optionally, apply the specified {@code afterVersionCreation} 
	 * on the data and the created version, to modify it if needed.
	 * </ul>
	 * 
	 * @param versionFactory which is used to create the new version.
	 * @param afterVersionCreation if not {@code null} accept the data and
	 * the created version, otherwise do nothing.
	 * @return a function that when applied on a given data returns a new version.   
	 */
	public static final <D extends IAlphaData, V extends AlphaTestVersion> Function<D, V> customDataConvertor(
			IVersionFactory<V> versionFactory,
			BiConsumer<D,V> afterVersionCreation) {
		return data -> {
			
			V ver = versionFactory.createVersion();
			try {
				ver.getAlphaRoots().addAll(AlphaModelLoader.loadModelFromPaths(data.getAlphaFiles()));
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
			ver.setName("Original");
			ver.setPrevious(null);
			ver.setTimeout(Long.valueOf(20));
			ver.setSrcFiles(data.getAlphaFiles());
			
			if(afterVersionCreation != null)
				afterVersionCreation.accept(data, ver);
			return ver;
		};
	}
	
	/**
	 * Shorthand to {@link #customDataConvertor(IVersionFactory, BiConsumer, BiConsumer)}
	 * with no beforeParsing nor afterVersionCreation actions.
	 * 
	 * @param versionFactory which is used to create the new version.
	 * @return a function that when applied on a given data returns a new version.
	 */
	public static final <D extends IAlphaData, V extends AlphaTestVersion> Function<D, V> defaultDataConvertor(
			IVersionFactory<V> versionFactory) {
		return customDataConvertor(versionFactory, null);
	}

}
