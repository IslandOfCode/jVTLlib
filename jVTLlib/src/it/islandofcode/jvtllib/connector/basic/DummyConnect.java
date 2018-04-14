package it.islandofcode.jvtllib.connector.basic;

import it.islandofcode.jvtllib.connector.IConnector;
import it.islandofcode.jvtllib.model.DataPoint;
import it.islandofcode.jvtllib.model.DataSet;
import it.islandofcode.jvtllib.model.DataStructure;
import it.islandofcode.jvtllib.model.Scalar;
import it.islandofcode.jvtllib.model.exception.DataStructureNotComplete;

/**
 * Classe dummy per fornire dati per testing.
 * @author Pier Riccardo Monzo
 */
public class DummyConnect implements IConnector {
	
	private String location = "";
	private DataSet ds;

	/* (non-Javadoc)
	 * @see it.islandofcode.connector.IConnector#get(java.lang.String)
	 */
	@Override
	public DataSet get(String location) {

		this.location = location;
		//questo controllo a che serve? Tanto non sarà mai nullo...
		if(!this.checkStatus())
			return null;
		
		if(location.equals("random"))
			this.populate1();
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
	
	private void populate1() {
		DataStructure struct;
		DataPoint row;
		String tmp;
		
		struct = new DataStructure("dstr1");
		struct.putComponent("ID", new Scalar(Scalar.SCALARTYPE.String), DataStructure.type.Identifier);
		struct.putComponent("NAME", new Scalar(Scalar.SCALARTYPE.String), DataStructure.type.Identifier);
		struct.putComponent("AGE", new Scalar(Scalar.SCALARTYPE.Integer), DataStructure.type.Measure);
		
		this.ds = new DataSet("ds1", "descrizione",struct, false);
		
		for(int i=0; i<3; i++) {
			row = new DataPoint();
			row.setValue("ID", new Scalar(""+i,Scalar.SCALARTYPE.String));
				tmp = java.util.UUID.randomUUID().toString().substring(0, 8);
			row.setValue("NAME", new Scalar(tmp,Scalar.SCALARTYPE.String));
			row.setValue("AGE", new Scalar("18",Scalar.SCALARTYPE.Integer));
			this.ds.setPoint(row);
		}
		
		row = new DataPoint();
		row.setValue("ID", new Scalar("10",Scalar.SCALARTYPE.String));
		row.setValue("NAME", new Scalar("peppe",Scalar.SCALARTYPE.String));
		row.setValue("AGE", new Scalar("21",Scalar.SCALARTYPE.Integer));
		this.ds.setPoint(row);
	}

}
