package it.islandofcode.jvtllib.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import it.islandofcode.jvtllib.model.exception.DataPointInvalidCostructor;

/**
 * Singola riga di una tabella.
 * @author Pier Riccardo Monzo
 */
public class DataPoint {
	
	private Map<String, Scalar> row;
	
	private Map<String, Boolean> Erow;
	
	/**
	 * Costrutture di base. Crea un datapoint vuoto, da popolare.
	 */
	public DataPoint() {
		this.row = new HashMap<String, Scalar>();
		this.Erow = new HashMap<String, Boolean>();
	}
	
	/**
	 * Costruttore. Prende in input un hashmap già pronto.
	 * @param in HashMap
	 * @throws DataPointInvalidCostructor lancia un'eccezione quando viene passato null.
	 */
	public DataPoint(HashMap<String, Scalar> in) throws DataPointInvalidCostructor {
		if(in == null)
			throw new DataPointInvalidCostructor("No HashMap specified!");
		this.row = in;
		this.Erow = new HashMap<String, Boolean>();
	}
	
	/**
	 * Costruttore. Prende un array di chiavi e un array di oggetti.
	 * @param keys
	 * @param values
	 * @throws DataPointInvalidCostructor lancia un'eccezione quando le dimensioni degli array differiscono.
	 */
	public DataPoint(String[] keys, Scalar[] values) throws DataPointInvalidCostructor {
		if(keys.length != values.length) {
			throw new DataPointInvalidCostructor("Keys and Values have different size.");
		}
		
		this.row = new HashMap<String, Scalar>();
		this.Erow = new HashMap<String, Boolean>();
		
		for(int i=0; i<keys.length; i++) {
			this.row.put(keys[i], values[i]);
			//System.out.println("K:["+keys[i]+"] V:["+values[i]+"]");
		}
	}
	
	public Iterable<String> getKeySet() {
		return this.row.keySet();
	}
	
	
	/**
	 * Ritorna il valore associato alla chiave specificata
	 * @param key
	 * @return {@link Scalar}
	 */
	public Scalar getValue(String key) {
		return this.row.get(key);
	}
	
	public boolean getError(String key) {
		return this.Erow.get(key);
	}
	
	/**
	 * Imposta il valore per la chiave specificata.<br>
	 * Se la chiave non esiste, viene creata una nuova entry con il valore specificato.
	 * @param key
	 * @param value
	 */
	public void setValue(String key, Scalar value) {
		this.row.put(key, value);
		if(!Erow.containsKey(key)) {
			Erow.put(key, false);
		}
	}
	
	public Set<String> getKeys(){
		return this.row.keySet();
	}

	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof DataPoint))
			return false;
		
		DataPoint dp = (DataPoint) obj;
		
		if(dp.getKeys().size()!=this.row.size())
			return false;
		
		for(String K : this.row.keySet()) {
			if(!dp.getValue(K).equals(this.row.get(K))) {
				return false;
			}
		}
		
		return true;
	}
	
	/**
	 * Verifica se il {@link DataPoint} passato come parametro è uguale a questo.
	 * <br>
	 * Il parametro withAttr, booleano, serve per indicare se vogliamo considerare
	 * anche gli attributi o scartarli.
	 * @param dp {@link DataPoint}
	 * @param dstr {@link DataStructure}
	 * @param withAttr boolean
	 * @return true se i due {@link DataPoint} sono uguali, false altrimenti.
	 */
	public boolean equals(DataPoint dp, DataStructure dstr, boolean withAttr) {
		
		if(dp.getKeys().size()>=this.row.size()) {
			for(String K : dp.getKeys()) {
				/*
				 * Prima verifica se il componente � un attributo.
				 * Se ho scelto di non verificarlo, salto
				 */
				if((dstr.getComponent(K).getType().equals(DataStructure.ROLE.Attribute) && !withAttr)) {
					continue;
				}
				
				if(this.row.containsKey(K)) {
					if(!this.row.get(K).equals(dp.getValue(K))) {
						return false;
					}
				} else {
					return false;
				}
			}
			
		} else {
			for(String K : this.row.keySet()) {
				/*
				 * Prima verifica se il componente è un attributo.
				 * Se ho scelto di non verificarlo, salto
				 */
				if(dstr.getComponent(K)==null)
					continue;
				
				if(dstr.getComponent(K).getType().equals(DataStructure.ROLE.Attribute) && !withAttr) {
					continue;
				}
				
				if(dp.getValue(K) != null) {
					if(!dp.getValue(K).equals(this.row.get(K))) {
						return false;
					}
				} else {
					return false;
				}
			}
		}
		
		
		return true;
	}
	
	
}
