/**
 * 
 */
package it.islandofcode.model;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Pier Riccardo Monzo
 * @date 01 mar 2018
 */
public class DataPoint {
	
	private Map<String, Object> row;
	
	/**
	 * Costrutture di base. Crea un datapoint vuoto, da popolare.
	 */
	public DataPoint() {
		this.row = new HashMap<String, Object>();
	}
	
	/**
	 * Costruttore. Prende in input un hashmap già pronto.
	 * @param in HashMap
	 * @throws Exception lancia un'eccezione quando viene passato null.
	 */
	public DataPoint(HashMap<String, Object> in) throws Exception {
		if(in == null)
			throw new Exception("No HashMap specified!");
		this.row = in;
	}
	
	/**
	 * Costruttore. Prende un array di chiavi e un array di oggetti.
	 * @param keys
	 * @param values
	 * @throws Exception lancia un'eccezione quando le dimensioni degli array differiscono.
	 */
	public DataPoint(String[] keys, Object[] values) throws Exception {
		if(keys.length != values.length)
			throw new Exception("Keys and Values have different size.");
		
		for(int i=0; i>=keys.length; i++) {
			this.row.put(keys[i], values[i]);
		}
	}
	
	
	/**
	 * Ritorna il valore associato alla chiave specificata
	 * @param key
	 * @return Object
	 */
	public Object getValue(String key) {
		if(key==null || key.isEmpty()) {
			//do nothing, for now...
		}
		return this.row.get(key);
	}
	
	/**
	 * Imposta il valore per la chiave specificata.<br>
	 * Se la chiave non esiste, viene creata una nuova entry con il valore specificato.
	 * @param key
	 * @param value
	 */
	public void setValue(String key, Object value) {
		if(key==null || key.isEmpty()) {
			//do nothing, for now...
		}
		this.row.put(key, value);
	}
}
