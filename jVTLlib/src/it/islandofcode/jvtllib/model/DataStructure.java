package it.islandofcode.jvtllib.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import it.islandofcode.jvtllib.model.util.Component;

/**
 * Descrive la struttura di un {@link DataSet} e, di conseguenza, quello di un {@link DataPoint}.
 * @author Pier Riccardo Monzo
 */
public class DataStructure implements VTLObj {
	
	public static enum type{
		Identifier,
		Measure,
		Attribute;
	}
	
	private String name;
	private String description;
	private boolean isCollected;
	private boolean isComplete;
	//0 id, 1 measure.
	private boolean[] constraint = {false,false};
	
	private HashMap<String, Component> component;
	
	/**
	 * Costruttore semplice.
	 * @param name nome del {@link DataStructure}.
	 */
	public DataStructure(String name){
		this.name = name;
		this.description = "";
		this.isCollected = false;
		this.component = new HashMap<String,Component>();
	}

	public boolean isCollected() {
		return isCollected;
	}
	
	/**
	 * Ritorna true se la struttura rispetta i constraint:
	 * un Identifier e una Measure minimo.
	 * @return boolean
	 */
	public boolean isComplete() {
		return isComplete;
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
	 * TODO cosa significa ne crea uno nuovo? Modificare per renderlo booleano o togliere l'if.<br>
	 * Imposta il nome componente.<br>
	 * Se non esiste, ne crea uno nuovo, altrimenti sovrascrive quello già esistente.
	 * @param compname nome componente
	 */
	public boolean setComponentName(String oldname, String newname) {
		if(!this.component.containsKey(oldname)) {
			//this.component.put(newname, new Component());
			return false;
		} else {
			Component tmp = this.component.get(oldname);
			this.component.remove(oldname);
			this.component.put(newname, tmp);
			return true;
		}		
	}
	
	/**
	 * @deprecated Solo per testing.<br>
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
	public boolean putComponent(String compname, VTLObj comptype, DataStructure.type compattribute) {
		
		if(this.component.containsKey(compname))
			return false;

		this.component.put(compname, new Component(compname,comptype,compattribute));
		
		if(!this.isComplete) {//se rispetta i constraint, skip!
			if(compattribute.equals(DataStructure.type.Identifier)) //sto inserendo un ID
				this.constraint[0]=true;
			if(compattribute.equals(DataStructure.type.Measure)) //sto inserendo una misura
				this.constraint[1]=true;
			if(this.constraint[0] && this.constraint[1]) //ho sia misura che id, quindi la struttura è ok
				this.isComplete = true;
		}
		
		return true;
	}
	
	/**
	 * Ritorna un set con tutte le chiavi dei componenti.
	 * Utile per navigare tra di essi.
	 * @return {@link Set}
	 */
	public Set<String> getKeys(){
		return this.component.keySet();
	}
	
	/**
	 * Restituisce il componente con la chiave specificata.
	 * @param key String
	 * @return {@link HashMap}
	 */
	public Component getComponent(String key){
		return this.component.get(key);
	}
	
	/**
	 * Verifica se un componente è di un tipo specifico.
	 * Nel caso in cui non voglia trovare uno scalare, il parametro scatype può essere nullo,
	 * alternativamente bisogna settarlo a un valore diverso da null per evitare eccezioni indesiderate.
	 * @param key String
	 * @param objtype {@link VTLObj.OBJTYPE} enum
	 * @param scatype {@link Scalar.SCALARTYPE} enum
	 * @return booleano
	 */
	public boolean isSameType(String key, VTLObj.OBJTYPE objtype, Scalar.SCALARTYPE scatype) {
		VTLObj obj = this.getComponent(key).getDataType();
		if(obj.getObjType().equals(objtype) && scatype==null) //se non sto esaminando uno scalare, allora scatype è vuoto.
			return true;
		if(scatype!=null && obj.getObjType().equals(VTLObj.OBJTYPE.Scalar)) //voglio esaminare uno scalare
			if( ((Scalar)obj).getScalarType().equals(scatype) ) //casto a scalare e confronto i tipi
				return true;
		//se l'oggetto non è dello stesso tipo o dello stesso scalare, torno false
		return false;
	}
	
	

	@Override
	/**
	 * Ciclo sul datastructure più grande, per ogni elemento che non è attributo,
	 * verifico che si trovi (con nome e tipo uguale) nell'altro datastructure.
	 * Se un ident o un meas manca, ritorna false.
	 */
	public boolean equals(Object arg0) {
		if(!(arg0 instanceof DataStructure))
			return false;
		
		//questa lista contiene gli elementi verificati che andranno poi confrontati.
		ArrayList<String> passed = new ArrayList<>();
		
		DataStructure dstr = (DataStructure) arg0;
		Component C = null;
		if(dstr.getKeys().size()>=this.component.size()) {  //dstr è è più grande
			for(String K : dstr.getKeys()) {
				C = dstr.getComponent(K);
				if(C.getType().equals(type.Attribute))
					continue; //gli attributi vanno ignorati
				//è ident o meas, ciclo sull'altro per trovarlo
				if(this.component.containsKey(K)) {
					//c'è un componente con la stessa chiave
					if(!this.component.get(K).getType().equals(dstr.getComponent(K).getType())) {
						//non hanno lo stesso tipo, errore!
						return false;
					} else
						passed.add(K);
				} else {
					//non c'è quel componente, errore!
					return false;
				}
			}
			
			//addesso verifico dall'altra parte
			//potrei aver mancato qualche componente
			if(passed.size()>0) { //se non ci sono elementi, significa che li ho esaminati tutti
				for(String O : this.component.keySet()) {
					if(passed.contains(O))
						continue; //skip
					if(!this.component.get(O).getType().equals(DataStructure.type.Attribute))
						return false; //ho trovato un componente ident/meas non controllato!
				}
			}
			return true; //tutte le verifiche effettuate, sono uguali!
			
		} else {		//this è più grande
			for(String K : this.component.keySet()) {
				C = this.component.get(K);
				if(C.getType().equals(type.Attribute))
					continue; //gli attributi vanno ignorati
				//è ident o meas, ciclo sull'altro per trovarlo
				if(dstr.containtComponent(K)) {
					//c'è un componente con la stessa chiave
					if(!dstr.getComponent(K).getType().equals(this.component.get(K).getType())) {
						//non hanno lo stesso tipo, errore!
						return false;
					}
				} else {
					//non c'è quel componente, errore!
					return false;
				}
			}
			//addesso verifico dall'altra parte
			//potrei aver mancato qualche componente
			if(passed.size()>0) { //se non ci sono elementi, significa che li ho esaminati tutti
				for(String O : dstr.getKeys()) {
					if(passed.contains(O))
						continue; //skip
					if(!dstr.getComponent(O).getType().equals(DataStructure.type.Attribute))
						return false; //ho trovato un componente ident/meas non controllato!
				}
			}
			return true; //tutte le verifiche effettuate, sono uguali!
		}

	}
	
	
	public static type string2type(String in) {
		switch(in) {
		case("identifier"):{
			return type.Identifier;
		}
		case("measure"):{
			return type.Measure;
		}
		case("attribute"):{
			return type.Attribute;
		}
		default:
			return null;
		}
	}
	
	
	@Override
	public OBJTYPE getObjType() {
		return VTLObj.OBJTYPE.DataStructure;
	}
	
}
