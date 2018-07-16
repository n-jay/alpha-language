package alpha.model.exception;

/**
 * The new syntax allows PolyhedralObjects to be a Domain taken from a variable
 * domain, and vice versa. This creates a possibility to have cycles in the
 * definition chain. CyclicDefinitionException indicates such a cycle has been found.
 * 
 * @author tyuki
 *
 */
public class CyclicDefinitionException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6437368208480442305L;

	public CyclicDefinitionException(String message) {
		super(message);
	}
}
