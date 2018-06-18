package it.islandofcode.jvtllib.junit;

import java.io.IOException;
import java.util.HashMap;

import it.islandofcode.jvtllib.JVTLlib;
import it.islandofcode.jvtllib.connector.basic.MongoBasic;
import it.islandofcode.jvtllib.model.Scalar;
import it.islandofcode.jvtllib.newparser.error.ParseException;

/**
 * @author Pier Riccardo Monzo
 */
public class RunLib {

	public static void main(String[] args) {
		JVTLlib lib = new JVTLlib();
		lib.addConnector(new MongoBasic("127.0.0.1",27017,"jVTLlib"));
		//lib.addFile("src/test/it/islandofcode/jvtllib/junit/testProcedure.vtl");
		lib.addFile("src/test/resources/test.vtl");
		//lib.setParseOnly(true); ??
		HashMap<String, Scalar> I = new HashMap<>();
		I.put("prova", new Scalar("pippo",Scalar.SCALARTYPE.String));
		lib.addInjection(I);
		try {
			//System.in.read();
			
			//lib.parseOnly();
			lib.execute();
			System.out.println("TIME: " + lib.getTimeExecution());
			
		} catch (ParseException | IOException e) {
			System.out.println("Eccezione! " + e.getMessage());
		}/* catch (NullPointerException ne) {
			//System.out.println("Null Pointer, errore generico.");
		}*/
	}

}