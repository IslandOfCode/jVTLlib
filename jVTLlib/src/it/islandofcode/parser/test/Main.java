package it.islandofcode.parser.test;

import java.io.File;
import java.io.IOException;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import it.islandofcode.connector.IConnector;
import it.islandofcode.parser.antlr.*;

public class Main {

	public static void main(String[] args) throws IOException {
		if((new File("src/it/islandofcode/parser/test/test.vtl")).length()<=0) {
			System.out.println("Il file è vuoto!");
			System.exit(-1);
		}
		
		IConnector con = new DummyConnect();
		
		System.out.println("Parsing test.vtl \n");
		
		VTLLexer lexer = new VTLLexer(new ANTLRFileStream("src/it/islandofcode/parser/test/test.vtl"));
		VTLParser parser = new VTLParser(new CommonTokenStream(lexer));
		ParseTree tree = parser.start();
		EvalVisitor visitor = new EvalVisitor(con);
        visitor.visit(tree);
        
        System.out.println("\nEnd Parsing");
	}

}
