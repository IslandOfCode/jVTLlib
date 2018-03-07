/**
 * 
 */
package it.islandofcode.model;

import java.util.HashMap;

/**
 * @author Pier Riccardo Monzo
 * <br><b>TODO</b> vanno implementati i costrain su i type (serve *almeno* un ID e una MEASURE)
 */
public class DataStructure {
	
	public static enum type{
		Identifier,
		Measure,
		Attribute;
	}
	
	private String name;
	private String description;
	private boolean isCollected;
	
	/*
	 * TODO doppio HashMap! Sabaku, anyone?
	 */
	private HashMap<String, HashMap<Object, type>> component;
	
	/**
	 * Costruttore semplice.
	 * @param name nome del DataStructure.
	 */
	public DataStructure(String name){
		this.name = name;
		this.description = "";
		this.isCollected = false;
		this.component = new HashMap<String,HashMap<Object,type>>();
	}

	public boolean isCollected() {
		return isCollected;
	}

	public void setCollected(boolean isCollected) {
		this.isCollected = isCollected;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}
	
	/**
	 * Imposta il nome componente.<br>
	 * Se non esiste, ne crea uno nuovo, altrimenti sovrascrive quello già esistente.
	 * @param compname nome componente
	 */
	public void setComponentName(String compname) {
		if(!this.component.containsKey(compname)) {
			this.component.put(compname, new HashMap<Object,type>());
		} else {
			HashMap<Object,type> tmp = this.component.get(compname);
			this.component.put(compname, tmp);
		}		
	}
	
	/**
	 * Elimina un componente indicando un nome.
	 * Ritorna True se il componente esiste ed è stato eliminato, False altrimenti.
	 * @param compname nome componente
	 * @return boolean
	 */
	public boolean removeComponent(String compname) {
		if(this.component.containsKey(compname)) {
			this.component.remove(compname);
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * Verifica se esiste un componente con questo nome.
	 * @param compname nome componente
	 * @return boolean
	 */
	public boolean containtComponent(String compname) {
		return this.component.containsKey(compname);
	}
	
	/**
	 * Inserisci un nuovo componente.<br>
	 * Se la chiave già esiste (quindi in teoria l'intero componente),<br>
	 * ritorna False, altrimenti True.
	 * @param compname
	 * @param comptype
	 * @param compattribute
	 * @return boolean
	 */
	public boolean putComponent(String compname, Object comptype, DataStructure.type compattribute) {
		if(this.component.containsKey(compname))
			return false;
		HashMap<Object,type> tmp = new HashMap<Object,type>();
		tmp.put(comptype, compattribute);
		this.component.put(compname, tmp);
		return true;
	}
	
}
