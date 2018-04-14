package it.islandofcode.jvtllib;

import java.io.File;

import it.islandofcode.jvtllib.connector.IConnector;

/**
 * @author Pier Riccardo Monzo
 */
public class JVTLlib {
	
	/**
	 * Per il momento si considera un solo connettore per volta.
	 */
	private IConnector connect;
	/**
	 * Path al file da eseguire.
	 */
	private String pathfile;
	/**
	 * Tempo di esecuzione dello script in millisecondi.
	 */
	private long lastExTime = -1;
	

	/**
	 * 
	 */
	public JVTLlib() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Aggiunge un connettore. Obbligatorio.
	 * @param conn {@link IConnector}
	 */
	public void addConnector(IConnector conn) {
		if(connect!=null)
			throw new IllegalArgumentException("Connector already set!");
		this.connect = conn;
	}
	
	/**
	 * Passa una stringa che indica il path della CU VTL da eseguire.
	 * @param path String
	 * @param check boolean Se true, effettua dei controlli sulla presenza del file e se sia popolato.
	 */
	public void addFile(String path, boolean check) {
		if(path == null || path.isEmpty())
			throw new IllegalArgumentException("Path cannot be null or empty");
		if(check) {
			if(!(new File(pathfile)).exists()) {
				throw new IllegalArgumentException("File not exist!");
			}
			if((new File(pathfile)).length()<=0) {
				throw new IllegalArgumentException("File cannot be empty");
			}
		}
		
		this.pathfile = path;
	}
	
	public boolean parseOnly() /*throws ParserException*/{
		
		return false;
	}
	
	public boolean execute() throws RuntimeException{
		
		
		return false;
	}
}
