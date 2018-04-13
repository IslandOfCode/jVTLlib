package it.islandofcode.jvtllib;

import java.io.File;

import it.islandofcode.jvtllib.connector.IConnector;

/**
 * @author Pier Riccardo Monzo
 */
public class JVTLlib {
	
	IConnector connect;
	String pathfile;
	String script;
	

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
	 * Se si vuole eseguire un semplice script e non una CU.
	 * @param script String
	 */
	public void addScript(String script) {
		if(script == null || script.isEmpty())
			throw new IllegalArgumentException("Script cannot be null or empty");
		this.script = script;
	}
	
	/**
	 * Passa una stringa che indica il path della CU VTL da eseguire.
	 * @param path String
	 * @param check boolean Se true, effettua dei controlli sulla presenza del file e se sia popolato.
	 */
	public void addFile(String path, boolean check) {
		if(script == null || script.isEmpty())
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
	
	public boolean execute() {
		
		
		return false;
	}
}
