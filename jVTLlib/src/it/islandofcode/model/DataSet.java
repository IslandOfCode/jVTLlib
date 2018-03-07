package it.islandofcode.model;

import java.util.ArrayList;

/**
 * @author Pier Riccardo Monzo
 * @date 01 mar 2018
 */
public class DataSet {
	/*
	 * Dopo una serie di riflessioni, optiamo per Arraylist, i vantaggi sono i seguenti:
	 * 1) Se si crea un ArrayList sapendo già la sua dimensione, le operazioni di inserimento sono
	 * 		sempre O(1). Se si supera la dimensione scelta, ogni tanto abbiamo un inserimento di O(log(n))
	 * 2) Add() e Get() sono sempre O(1) (tranne nel caso di ADD quando si supera la dimensione attuale)
	 * 3) ArrayList usa meno memoria, tranne che nel caso di resize e nel garbage collection.
	 */
	
	private String name;
	private ArrayList<DataPoint> rows;
	private DataStructure struct;
	private String description;
	private boolean isCollected;
	
	/**
	 * @deprecated
	 * <br><b>NON usare</b>, presente solo per testing.<br>
	 * Verrà eliminato in produzione. 
	 */
	public DataSet() { }
	
	public DataSet(String name, String desc, DataStructure dstruc, boolean collected) {
		this.name = name;
		this.description = desc;
		this.struct = dstruc;
		this.rows = new ArrayList<DataPoint>();
		this.isCollected = collected;
	}
	
	public DataSet(String name, String desc, DataStructure dstruc, ArrayList<DataPoint> data, boolean collected) {
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
	
	public DataPoint getPoint(int index) {
		return this.rows.get(index);
	}
	
	public void setPoint(DataPoint newpoint) {
		this.rows.add(newpoint);
	}
	
	public void setPoint(int index, DataPoint newpoint) {
		this.rows.set(index, newpoint);
	}
	
	public boolean isCollected() {
		return this.isCollected;
	}
}
