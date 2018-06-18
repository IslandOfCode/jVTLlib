package it.islandofcode.jvtllib.model.exception;

/**
 * @author Pier Riccardo Monzo
 */
public class DataStructureNotComplete extends Exception {

	private static final long serialVersionUID = 1L;

	private static final String defaultmex = "DataStructure artefact not respect constraint.";
	
	/**
	 * 
	 */
	public DataStructureNotComplete() {
		super(defaultmex);
	}

	/**
	 * @param arg0
	 */
	public DataStructureNotComplete(String arg0) {
		super(arg0);
	}

	/**
	 * @param arg0
	 */
	public DataStructureNotComplete(Throwable arg0) {
		super(arg0);
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public DataStructureNotComplete(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	/**
	 * @param arg0
	 * @param arg1
	 * @param arg2
	 * @param arg3
	 */
	public DataStructureNotComplete(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

}
