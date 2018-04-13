package it.islandofcode.jvtllib.connector.basic;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import it.islandofcode.jvtllib.connector.IConnector;
import it.islandofcode.jvtllib.model.DataSet;

/**
 * @author Pier Riccardo Monzo
 */
public class MongoBasic implements IConnector {
	MongoClient MC;
	String database;
	String table;
	
	public MongoBasic(String IP, int port) {
		//se IP/porta non specificato o fuori specifica, vai di default
		if(IP==null || IP.isEmpty())
			IP="127.0.0.1";
		if(port<=0 || port>65535)
			port=27017;
		
		MC = new MongoClient(IP,port);
	}

	/* (non-Javadoc)
	 * @see it.islandofcode.jvtllib.connector.IConnector#get(java.lang.String)
	 */
	@Override
	public DataSet get(String location) {
		this.database = location.split("\\")[0];
		this.table = location.split("\\")[1];
		
		if(this.checkStatus()) {
			MongoDatabase db = MC.getDatabase(this.database);
			MongoCollection<Document> table = db.getCollection(this.table);
			//TODO
		}
		
		return null;
	}

	/* (non-Javadoc)
	 * @see it.islandofcode.jvtllib.connector.IConnector#set(java.lang.String, it.islandofcode.jvtllib.model.DataSet)
	 */
	@Override
	public boolean set(String location, DataSet data) {
		if(this.checkStatus()) {
			//esiste, sovrascrivo?
		} else {
			//non esiste, lo creo.
			MongoDatabase db = MC.getDatabase(location);
		}
		
		
		return false;
	}

	/* (non-Javadoc)
	 * @see it.islandofcode.jvtllib.connector.IConnector#checkStatus()
	 */
	@Override
	public boolean checkStatus() {
		for(String N :MC.listDatabaseNames()) {
			if(N.equals(this.getLocation()))
				return true;
		}
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
