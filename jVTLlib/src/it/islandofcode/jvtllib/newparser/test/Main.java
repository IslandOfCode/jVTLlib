package it.islandofcode.jvtllib.newparser.test;

import java.io.File;
import java.io.IOException;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import it.islandofcode.jvtllib.connector.IConnector;
import it.islandofcode.jvtllib.newparser.*;
import it.islandofcode.jvtllib.newparser.error.UnderlineListener;
import it.islandofcode.jvtllib.connector.basic.DummyConnect;

/**
 * @author Pier Riccardo Monzo
 */
public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		long startTime = System.currentTimeMillis();
		
		String pathfile = "src/it/islandofcode/jvtllib/newparser/test/testactual.vtl";
		if((new File(pathfile)).length()<=0) {
			System.out.println("Il file è vuoto!");
			System.exit(-1);
		}
		
		System.out.println("SCRATCH2 Parsing test.vtl \n");
		
		IConnector conn = new DummyConnect();
		
		newVTLLexer lexer = new newVTLLexer(new ANTLRFileStream(pathfile));
		System.out.println("### LEXER TIME " + (System.currentTimeMillis() - startTime) + "ms");
		newVTLParser parser = new newVTLParser(new CommonTokenStream(lexer));
		System.out.println("### PARSER TIME " + (System.currentTimeMillis() - startTime) + "ms");
		
		//error handling test
		parser.removeErrorListeners();
		parser.addErrorListener(new UnderlineListener());
		//parser.setErrorHandler(new BailOutErrorStrategy());
		
		ParseTree tree = null;
		try {
			tree = parser.parse();
			NewEval visitor = new NewEval(conn);
	        visitor.visit(tree);
		} catch(RuntimeException ex) {
			System.out.println("eccezione! " + ex.getMessage() + " @ " + ex.getClass().getSimpleName());
			//retrow ex
		}
        System.out.println("\nEnd Parsing");

        System.out.println("### TOTAL TIME " + (System.currentTimeMillis() - startTime) + "ms ###");
	}

}
