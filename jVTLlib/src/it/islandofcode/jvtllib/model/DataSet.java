package it.islandofcode.jvtllib.model;

import java.util.ArrayList;

import it.islandofcode.jvtllib.model.util.Component;

/**
 * Struttura principale del VTL. Si può considerare come una tabella.
 * @author Pier Riccardo Monzo
 */
public class DataSet implements VTLObj {

	private String name;
	private ArrayList<DataPoint> rows;
	private DataStructure struct;
	private String description;
	private boolean isCollected;
	
	public DataSet(String name, String desc, DataStructure dstruc, boolean collected)/* throws DataStructureNotComplete */{
		/*if(!dstruc.isComplete())
			throw new DataStructureNotComplete();*/
		this.name = name;
		this.description = desc;
		this.struct = dstruc;
		this.rows = new ArrayList<DataPoint>();
		this.isCollected = collected;
	}
	
	public DataSet(String name, String desc, DataStructure dstruc, ArrayList<DataPoint> data, boolean collected) /*throws DataStructureNotComplete*/ {
		/*if(!dstruc.isComplete())
			throw new DataStructureNotComplete();*/
		this.name = name;
		this.description = desc;
		this.struct = dstruc;
		this.rows = data;
		this.isCollected = collected;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public DataStructure getDataStructure() {
		return this.struct;
	}
	
	public int getSize() {
		return this.rows.size();
	}
	
	public DataPoint getPoint(int index) {
		try {
			return this.rows.get(index);
		} catch(IndexOutOfBoundsException e) {
			return null;
		}
		
	}
	
	/**
	 * Vedi {@link #setPoint(int, DataPoint)}. <br>
	 * Questa variante inserisce sempre in coda il nuovo {@link DataPoint}.
	 * @param newpoint {@link DataPoint}
	 */
	public boolean setPoint(DataPoint newpoint) {
		return setPoint(-1,newpoint);
	}
	
	/**
	 * Questo metodo aggiunge un {@link DataPoint} al {@link DataSet} nella posizione indicata da <i>index</i>.<br>
	 * Prima di essere inserito, però, il metodo controlla che ci sia corrispondenza
	 * tra {@link DataPoint} e il {@link DataStructure} associato.
	 * Nel caso in cui il {@link DataPoint} abbia una colonna non presente nel {@link DataStructure},
	 * questa viene scartata ma il {@link DataPoint} viene comunque aggiunto.<br>
	 * Se invece il {@link DataPoint} non ha una colonna del {@link DataStructure} (ne basta una),
	 * tutto il {@link DataPoint} viene scartato.
	 * <br><br>
	 * Se <i>index</i> si trova al di fuori dell'intervallo (<i>index</i>&LT0 || <i>index</i>&GTsize),
	 * allora l'inserimento avviene sempre in coda.
	 * @param index integer
	 * @param newpoint {@link DataPoint}
	 */
	public boolean setPoint(int index, DataPoint newpoint) {
		
		/*
		 * verifica che ogni componente di newpoint rispetti datastructure
		 * e sia dello stesso tipo.
		 * Se quell'id è associato ad un DataValue, verifica che rispetti
		 * le restrizioni.
		 */
		
		DataPoint checked = new DataPoint();
		Scalar newvalue = null;
		for(String S : this.struct.getKeys()) { //scorri i component della struttura
			newvalue = newpoint.getValue(S);
			
			if(newvalue != null) { //se il DP ha un elemento con quella chiave
				
				Component comp = this.struct.getComponent(S);
				VTLObj obj = comp.getDataType();
				
				if(obj.getObjType().equals(VTLObj.OBJTYPE.Scalar)) { //se VTLObj è uno scalare
					//controllo che sia dello stesso tipo del DP
					Scalar sca = (Scalar)obj;
					if(!newvalue.getScalarType().equals(sca.getScalarType())) {
						//Se fallisce, la colonna è null.
						//continue;
						newvalue = new Scalar(newvalue.getScalarType());
					}
					
				} else if(obj.getObjType().equals(VTLObj.OBJTYPE.ValueDomain)) { //se invece è un VDomain
					//faccio un check
					ValueDomain vd = (ValueDomain)obj;
					if(!vd.checkDomain(newpoint,S)) {
						//se fallisce scarta colonna
						//continue;
						newvalue = new Scalar(newvalue.getScalarType());
					}
				}
				
			} else { //il DP NON ha un elemento con quella chiave
				//devo scartare il datapoint
				return false;
			}
			
			//tutti i controlli superati, aggiungo colonna al datapoint
			checked.setValue(S, newvalue);
		}
		//finito controllo per tutte le colonne, aggiungo al dataset e termino
		if(index<0 || index>=getSize()) {
			//aggiungo in coda, ritornerà sempre true
			return this.rows.add(checked);
		} else {
			//nel caso in cui index sia corretto
			this.rows.set(index, newpoint);
			return true;
		}
	}
	
	public boolean isCollected() {
		return this.isCollected;
	}

	@Override
	public OBJTYPE getObjType() {
		return VTLObj.OBJTYPE.DataSet;
	}
}
