/**
 * 
 */
package it.islandofcode.jvtllib.connector.basic;

import it.islandofcode.jvtllib.connector.IConnector;
import it.islandofcode.jvtllib.model.DataSet;

/**
 * @author Pier Riccardo Monzo
 */
public class CSVBasic implements IConnector {

	/**
	 * 
	 */
	public CSVBasic() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see it.islandofcode.jvtllib.connector.IConnector#get(java.lang.String)
	 */
	@Override
	public DataSet get(String location) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see it.islandofcode.jvtllib.connector.IConnector#set(java.lang.String, it.islandofcode.jvtllib.model.DataSet)
	 */
	@Override
	public boolean set(String location, DataSet data) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see it.islandofcode.jvtllib.connector.IConnector#checkStatus()
	 */
	@Override
	public boolean checkStatus() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see it.islandofcode.jvtllib.connector.IConnector#getLocation()
	 */
	@Override
	public String getLocation() {
		// TODO Auto-generated method stub
		return null;
	}

}
