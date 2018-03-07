package it.islandofcode.parser.test;

import it.islandofcode.connector.IConnector;
import it.islandofcode.model.DataPoint;
import it.islandofcode.model.DataSet;
import it.islandofcode.model.DataStructure;

/**
 * @author Pier Riccardo Monzo
 * Classe dummy per fornire dati per testing.
 */
public class DummyConnect implements IConnector {
	
	private String name;
	private String location = "";
	private DataSet ds;

	/* (non-Javadoc)
	 * @see it.islandofcode.connector.IConnector#get(java.lang.String)
	 */
	@Override
	public DataSet get(String name, String location) {
		this.name = name;
		this.location = location;
		//questo controllo a che serve? Tanto non sarà mai nullo...
		if(!this.checkStatus())
			return null;
		this.populate();
		return this.ds;
	}

	/* (non-Javadoc)
	 * @see it.islandofcode.connector.IConnector#set(java.lang.String, it.islandofcode.model.DataSet)
	 */
	@Override
	public boolean set(String location, DataSet data) {
		//nessun controllo, nessuna trasformazione
		//ma IRL queste cose bisogna assolutamente farle!
		this.ds = data;
		return true;
	}

	/* (non-Javadoc)
	 * @see it.islandofcode.connector.IConnector#checkStatus()
	 */
	@Override
	public boolean checkStatus() {
		//hackatlon style!
		return true;
	}

	/* (non-Javadoc)
	 * @see it.islandofcode.connector.IConnector#getLocation()
	 */
	@Override
	public String getLocation() {
		return this.location;
	}
	
	private void populate() {
		DataStructure struct;
		DataPoint row;
		String tmp;
		
		struct = new DataStructure("dstr1");
		struct.putComponent("ID", "string", DataStructure.type.Identifier);
		struct.putComponent("NAME", "string", DataStructure.type.Identifier);
		struct.putComponent("AGE", "integer", DataStructure.type.Measure);
		
		this.ds = new DataSet(this.name, "descrizione",struct, false);
		
		for(int i=0; i<10; i++) {
			row = new DataPoint();
			row.setValue("ID", i);
				tmp = java.util.UUID.randomUUID().toString().substring(0, 8);
			row.setValue("NAME", tmp);
			row.setValue("AGE", 18);
			this.ds.setPoint(row);
		}
	}

}
