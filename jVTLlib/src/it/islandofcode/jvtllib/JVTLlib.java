package it.islandofcode.jvtllib;

import java.io.IOException;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import it.islandofcode.jvtllib.connector.IConnector;
import it.islandofcode.jvtllib.newparser.NewEval;
import it.islandofcode.jvtllib.newparser.antlr.newVTLLexer;
import it.islandofcode.jvtllib.newparser.antlr.newVTLParser;
import it.islandofcode.jvtllib.newparser.error.ParseException;
import it.islandofcode.jvtllib.newparser.error.UnderlineListener;

/**
 * <pre>'Have you guessed the riddle yet?' the Hatter said, turning to Alice again.
 *'No, I give it up,' Alice replied: 'what's the answer?'
 *'I haven't the slightest idea,' said the Hatter.
 *					"Alice in Wonderland", Lewis Carroll</pre>
 * 
 * @author Pier Riccardo Monzo
 */
public class JVTLlib {
	
	/**
	 * Per il momento si considera un solo connettore per volta.
	 */
	private IConnector connect = null;
	/**
	 * Path al file da eseguire.
	 */
	private String pathfile = null;
	/**
	 * Tempo di esecuzione dello script in millisecondi.
	 */
	private long lastExTime = -1;
	

	/**
	 * 
	 */
	public JVTLlib() { }

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
	 */
	public void addFile(String path) {
		if(path == null || path.isEmpty())
			throw new IllegalArgumentException("Path cannot be null or empty");
		
		this.pathfile = path;
	}
	
	public void parseOnly() throws ParseException, IOException{
		long startTime = System.currentTimeMillis();
		
		newVTLLexer lexer = new newVTLLexer(new ANTLRFileStream(pathfile));
		newVTLParser parser = new newVTLParser(new CommonTokenStream(lexer));
		
		//error handling test
		parser.removeErrorListeners();
		parser.addErrorListener(new UnderlineListener());
		
		try {
			parser.parse();
		} catch(RuntimeException ex) {
			//System.out.println("eccezione! " + ex.getMessage() + " @ " + ex.getClass().getSimpleName());
			//retrow ex
			this.lastExTime = (System.currentTimeMillis() - startTime);
			throw ex;
		}
		//se arrivo qui senza eccezioni, allora il codice è grammaticalmente corretto
		this.lastExTime = (System.currentTimeMillis() - startTime);
	}
	
	public boolean execute() throws RuntimeException, IOException{
		long startTime = System.currentTimeMillis();
		
		newVTLLexer lexer = new newVTLLexer(new ANTLRFileStream(pathfile));
		newVTLParser parser = new newVTLParser(new CommonTokenStream(lexer));
		
		//error handling test
		parser.removeErrorListeners();
		parser.addErrorListener(new UnderlineListener());
		
		ParseTree tree = null;
		try {
			tree = parser.parse();
			NewEval visitor = new NewEval(this.connect);
	        visitor.visit(tree);
		} catch(RuntimeException ex) {
			//System.out.println("eccezione! " + ex.getMessage() + " @ " + ex.getClass().getSimpleName());
			//retrow ex
			this.lastExTime = (System.currentTimeMillis() - startTime);
			throw ex;
		}
		this.lastExTime = (System.currentTimeMillis() - startTime);
		return true;
	}
	
	
	public long getTimeExecution() {
		return this.lastExTime;
	}
}
