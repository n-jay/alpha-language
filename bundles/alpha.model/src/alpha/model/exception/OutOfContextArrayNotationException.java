package alpha.model.exception;

/**
 * ArrayNotation requires context information about index names. This exception
 * indicates that a use of ArrayNotation without context has been found.
 * 
 * @author tyuki
 *
 */
public class OutOfContextArrayNotationException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7091422190437600709L;

	public OutOfContextArrayNotationException(String message) {
		super(message);
	}

}
