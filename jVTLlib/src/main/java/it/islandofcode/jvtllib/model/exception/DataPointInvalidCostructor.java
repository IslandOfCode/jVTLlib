package it.islandofcode.jvtllib.model.exception;

/**
 * @author Pier Riccardo Monzo
 */
public class DataPointInvalidCostructor extends Exception {

	private static final long serialVersionUID = 1L;
	private static final String defaultmex = "Parameters not valid.";
	
	public DataPointInvalidCostructor() {
		super(defaultmex);
	}

	/**
	 * @param message
	 */
	public DataPointInvalidCostructor(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public DataPointInvalidCostructor(Throwable cause) {
		super(cause);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public DataPointInvalidCostructor(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public DataPointInvalidCostructor(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
