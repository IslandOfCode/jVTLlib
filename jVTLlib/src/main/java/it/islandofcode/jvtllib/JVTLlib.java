package it.islandofcode.jvtllib;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.util.HashMap;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import it.islandofcode.jvtllib.connector.IConnector;
import it.islandofcode.jvtllib.model.Scalar;
import it.islandofcode.jvtllib.model.VTLObj;
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
 * @version 0.1.0-indev
 */
public class JVTLlib {
	
	/**
	 * Per il momento si considera un solo connettore per volta.
	 */
	private IConnector connect = null;
	/**
	 * Path al file da eseguire.
	 */
	private String source = null;
	/**
	 * Se true, ho indicato un path ad un file.
	 */
	private boolean isFile = false;
	/**
	 * Tempo di esecuzione dello script in millisecondi.
	 */
	private String lastExTime = "";
	
	private HashMap<String,Scalar> injection = new HashMap<>();
	private HashMap<String,VTLObj> directMapping = new HashMap<>();

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
	 * @deprecated
	 * Passa una stringa che indica il path della CU VTL da eseguire.
	 * @param path String
	 */
	public void addFile(String path) {
		if(path == null || path.isEmpty())
			throw new IllegalArgumentException("Path cannot be null or empty");
		this.isFile = true;
		this.source = path;
	}
	
	/**
	 * Passa il file che contiene la CU VTL da eseguire
	 * @param File
	 */
	public void addScript(File file) {
		if(file == null || !file.isFile() || !file.exists() || !file.canRead())
			throw new IllegalArgumentException("File cannot be null or a directory, have to exist and be readable.");
		this.isFile = true;
		this.source = file.getPath();
	}
	
	/**
	 * Passa la VTL da eseguire sotto forma di stringa.
	 * Utile per database o simili.
	 * @param String
	 */
	public void addScript(String script) {
		if(script==null || script.isEmpty() || script.length()<3)
			throw new IllegalArgumentException("Script cannot be null or empty string");
		this.isFile = false;
		this.source = script;
	}
	
	public void addInjection(HashMap<String,Scalar> inj) {
		if(inj!=null && !inj.isEmpty()) {
			this.injection = inj;
		}
	}
	
	public void directMemoryInjection(HashMap<String,VTLObj> mem) {
		if(mem!=null && !mem.isEmpty()) {
			this.directMapping = mem;
		}
	}
	
	
	
	public boolean parseOnly() throws ParseException, IOException{
		Instant start = Instant.now();
		Instant end;
		
		newVTLLexer lexer;
		if(this.isFile)
			lexer = new newVTLLexer(new ANTLRFileStream(source));
		else
			lexer = new newVTLLexer(new ANTLRInputStream(source));
		newVTLParser parser = new newVTLParser(new CommonTokenStream(lexer));
		
		//error handling test
		parser.removeErrorListeners();
		parser.addErrorListener(new UnderlineListener());
		
		try {
			parser.parse();
		} catch(RuntimeException ex) {
			//System.out.println("eccezione! " + ex.getMessage() + " @ " + ex.getClass().getSimpleName());
			//retrow ex
			end = Instant.now();
			this.lastExTime = Duration.between(start, end).toString();
			throw ex;
		}
		//se arrivo qui senza eccezioni, allora il codice è grammaticalmente corretto
		
		end = Instant.now();
		this.lastExTime = Duration.between(start, end).toString();
		return true;
	}
	
	public boolean execute() throws RuntimeException, IOException{
		Instant start = Instant.now();
		Instant end;
		
		newVTLLexer lexer;
		if(this.isFile)
			lexer = new newVTLLexer(new ANTLRFileStream(source));
		else
			lexer = new newVTLLexer(new ANTLRInputStream(source));
		newVTLParser parser = new newVTLParser(new CommonTokenStream(lexer));
		
		//error handling test
		parser.removeErrorListeners();
		parser.addErrorListener(new UnderlineListener());
		
		ParseTree tree = null;
		try {
			tree = parser.parse();
			NewEval visitor = new NewEval(this.connect);
			
			visitor.inject(this.injection);
			visitor.injectDirect(directMapping);
			
	        visitor.visit(tree);
		} catch(RuntimeException ex) {
			//System.out.println("eccezione! " + ex.getMessage() + " @ " + ex.getClass().getSimpleName());
			//retrow ex
			end = Instant.now();
			this.lastExTime = Duration.between(start, end).toString();
			throw ex;
		}
		//se arrivo qui, significa che il codice è corretto ed è stato eseguito senza errori
		//ovvio che questo non significa che il codice sia sintatticamente corretto.
		end = Instant.now();
		this.lastExTime = Duration.between(start, end).toString();
		return true;
	}
	
	
	public String getTimeExecution() {
		return this.lastExTime;
	}
}
