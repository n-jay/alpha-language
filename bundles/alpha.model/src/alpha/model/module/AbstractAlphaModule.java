package alpha.model.module;

/**
 * Abstract class for all Alpha class using the module extension point in GeCoS framework.
 * 
 * @author tyuki
 *
 */
public abstract class AbstractAlphaModule<T> {
	
	
	public abstract T compute();
}
