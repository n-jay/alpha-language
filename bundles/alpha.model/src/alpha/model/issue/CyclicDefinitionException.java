package alpha.model.issue;

public class CyclicDefinitionException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6437368208480442305L;

	
	public CyclicDefinitionException(String message) {
		super(message);
	}
}
