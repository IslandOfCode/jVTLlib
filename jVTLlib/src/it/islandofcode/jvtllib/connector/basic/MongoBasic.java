package it.islandofcode.jvtllib.connector.basic;

import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.univocity.parsers.csv.CsvParser;
import com.univocity.parsers.csv.CsvParserSettings;

import it.islandofcode.jvtllib.connector.IConnector;
import it.islandofcode.jvtllib.model.DataPoint;
import it.islandofcode.jvtllib.model.DataSet;
import it.islandofcode.jvtllib.model.DataStructure;
import it.islandofcode.jvtllib.model.Scalar;
import it.islandofcode.jvtllib.model.VTLObj;
import it.islandofcode.jvtllib.model.util.Component;

/**
 * @author Pier Riccardo Monzo
 */
public class MongoBasic implements IConnector {
	MongoClient MC;
	String database;
	String table;
	
	/*
	 * Si usa uniVocity per il parsing da csv
	 * https://github.com/uniVocity/univocity-parsers
	 */
	
	public MongoBasic(String IP, int port, String db) {
		//se IP/porta non specificato o fuori specifica, vai di default
		if(IP==null || IP.isEmpty())
			IP="127.0.0.1";
		if(port<=0 || port>65535)
			port=27017;
		
		MC = new MongoClient(IP,port);
		this.database = db;
	}

	/* (non-Javadoc)
	 * @see it.islandofcode.jvtllib.connector.IConnector#get(java.lang.String)
	 */
	@Override
	public DataSet get(String location, String[] keep) {
		this.table = location;
		DataSet ds = null;
		
		if(this.checkStatus()) {
			MongoDatabase db = MC.getDatabase(this.database);
			MongoCollection<Document> table = db.getCollection(this.table);
			
			//creiamo qui in DataStructure
			Document first = table.find().first();
			DataStructure dstr = new DataStructure(location+"_dstr");
			for(String K : first.keySet()) {
				if(K.equals("_id"))
					continue;
				if(keep!=null) {
					for(int i=0; i<keep.length; i++) {
						if(keep[i].equals(K)) {
							Component C = this.retrive(K);
							if(C==null)
								return null; //se non ho trovato la colonna o non sono riuscito a generarla, torno null.
							dstr.putComponent(
									C.getId(),
									C.getDataType(),
									C.getType()
									);
							break;
						}
					}//fine for su keep
				} else {
					Component C = this.retrive(K);
					if(C==null)
						return null; //se non ho trovato la colonna o non sono riuscito a generarla, torno null.
					dstr.putComponent(
							C.getId(),
							C.getDataType(),
							C.getType()
							);
				}
				
				
				
			}//fine for su first
			
			ds = new DataSet(location,this.database,dstr,true);
			for(Document D : table.find()) {
				DataPoint dp = new DataPoint();
				for(String I : D.keySet()) {
					if(I.equals("_id"))
						continue;
					dp.setValue(I, new Scalar(""+D.get(I)) );
				}
				ds.setPoint(dp);
			}
			
		} else
			return null; //se faccio check prima di get, non dovrei MAI arrivare qui.
		
		return ds;
	}

	/* (non-Javadoc)
	 * @see it.islandofcode.jvtllib.connector.IConnector#set(java.lang.String, it.islandofcode.jvtllib.model.DataSet)
	 */
	@Override
	public boolean put(String location, DataSet data) {
		
		return false;
	}

	/* (non-Javadoc)
	 * @see it.islandofcode.jvtllib.connector.IConnector#checkStatus()
	 */
	@Override
	public boolean checkStatus() {
		for(String N : MC.listDatabaseNames()) {
			if(N.equals(this.database))
				return true;
		}
		return false;
	}

	/* (non-Javadoc)
	 * @see it.islandofcode.jvtllib.connector.IConnector#getLocation()
	 */
	@Override
	public String getLocation() {
		return this.table;
	}
	
	
	private final Component retrive(String key) {
		CsvParserSettings parserSettings = new CsvParserSettings();
		parserSettings.setHeaderExtractionEnabled(true); //ignora il primo rigo (Header)
		CsvParser p = new CsvParser(parserSettings);
		Component c = null;
		try {
			p.beginParsing(new InputStreamReader(this.getClass().getResourceAsStream("/BIRDmap.csv"), "UTF-8"));
			String[] row;
			VTLObj obtype = null;
			DataStructure.ROLE attr;
			while ((row = p.parseNext()) != null) {
				if(!row[0].equals(key)) {
					continue;
				}
				switch(row[4]) {
				case "string":
					obtype = new Scalar(Scalar.SCALARTYPE.String);
					break;
				case "float":
					obtype = new Scalar(Scalar.SCALARTYPE.Float);
					break;
				case "integer":
					obtype = new Scalar(Scalar.SCALARTYPE.Integer);
					break;
				case "boolean":
					obtype = new Scalar(Scalar.SCALARTYPE.Boolean);
					break;
				case "date":
					obtype = new Scalar(Scalar.SCALARTYPE.Date);
					break;
				default:
					p.stopParsing();
					return null;
				}
				
				switch(row[1]) {
				case "D":
					attr = DataStructure.ROLE.Identifier;
					break;
				case "O":
					attr = DataStructure.ROLE.Measure;
					break;
				case "A":
					attr = DataStructure.ROLE.Attribute;
					break;
				default:
					p.stopParsing();
					return null;
				}
				
				c = new Component(row[0],obtype,attr);
			}
		} catch (UnsupportedEncodingException e) {
			p.stopParsing();
			return null;
		}
		p.stopParsing();
		return c;
	}
	
}
