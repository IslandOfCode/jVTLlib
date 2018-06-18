package it.islandofcode.jvtllib.newparser.error;

/**
 * Questa eccezione viene sollevata quando viene individuato un errore nel parser.
 * @author Pier Riccardo Monzo
 */
public class ParseException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	private int line;

	/**
	 * @param msg
	 * @param thw
	 */
	public ParseException(String msg, Throwable thw) {
		super(msg, thw);
	}
	
	/**
	 * Usa sempre questa eccezione, per favore.
	 * @param msg
	 * @param thw
	 * @param line
	 */
	public ParseException(String msg, Throwable thw, int line) {
		super(msg, thw);
		this.line = line;
		System.err.println(msg);
	}

	/**
	 * @param msg
	 * @param thw
	 * @param arg2
	 * @param arg3
	 */
	public ParseException(String msg, Throwable thw, boolean arg2, boolean arg3) {
		super(msg, thw, arg2, arg3);
	}
	
	public int getErrorLine() {
		return this.line;
	}

}
