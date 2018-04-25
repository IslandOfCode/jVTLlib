package it.islandofcode.jvtllib.model.util;

import it.islandofcode.jvtllib.model.DataStructure;
import it.islandofcode.jvtllib.model.VTLObj;

/**
 * Componente per il {@link DataStructure}. Contiene nome, tipo di dato e tipo di componente.<br>
 * Il campo nome � ovviamente duplicato nel datastructure, poich� � contenuto nell'hashmap come campo chiave.<br>
 * Questa ridondanza � voluta, per poter accedere pi� velocemente ai dati durante l'elaborazione, senza dover fare cicli
 * per cercare il valore corretto.
 * @author Pier Riccardo Monzo
 */
public class Component {
	private String id;
	private VTLObj datatype;
	private DataStructure.ROLE type;
	
	public Component(String id, VTLObj datatype, DataStructure.ROLE type) {
		this.id = id;
		this.datatype = datatype;
		this.type = type;
	}
	
	public Component(String id, VTLObj datatype, String type) {
		this.id = id;
		this.datatype = datatype;
		this.type = DataStructure.string2type(type);
	}
	
	
	public String getId() {
		return this.id;
	}
	
	public VTLObj getDataType() {
		return this.datatype;
	}
	
	public DataStructure.ROLE getType(){
		return this.type;
	}
}
