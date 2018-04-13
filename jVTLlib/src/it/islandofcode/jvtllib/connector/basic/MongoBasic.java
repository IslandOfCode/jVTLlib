package it.islandofcode.jvtllib.connector.basic;

import com.mongodb.MongoClient;

import it.islandofcode.jvtllib.connector.IConnector;
import it.islandofcode.jvtllib.model.DataSet;

/**
 * @author Pier Riccardo Monzo
 */
public class MongoBasic implements IConnector {
	
	public MongoBasic() {
		MongoClient MC = new MongoClient();
	}

	public MongoBasic(String IP, int port) {
		//se IP/porta non specificato o fuori specifica, vai di default
		if(IP==null || IP.isEmpty())
			IP="127.0.0.1";
		if(port<=0 || port>65535)
			port=27017;
		
		MongoClient MC = new MongoClient(IP,port);
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
