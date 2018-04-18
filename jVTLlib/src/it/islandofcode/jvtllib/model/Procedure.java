package it.islandofcode.jvtllib.model;

import java.util.HashMap;
import java.util.List;

import it.islandofcode.jvtllib.newparser.antlr.newVTLParser.AssignmentContext;

/**
 * @author Pier Riccardo Monzo
 */
public class Procedure {
	
	private String procedureID; 
	
	private HashMap<String,ProcVarComp> mapVar;
	
	private List<AssignmentContext> exprs;

	/**
	 * Costruttore vuoto
	 */
	public Procedure(String name) {
		this.procedureID = name;
		mapVar = new HashMap<>();
	}
	
	public void setExprs(List<AssignmentContext> exs) {
		this.exprs = exs;
	}
	
	public void addParameter(int i, boolean input, String name, String dt) {
		this.mapVar.put(name,
				new ProcVarComp(
						i,
						input,
						name,
						dt
						)
				);
	}
	
	public AssignmentContext getExpr(int index) {
		return this.exprs.get(index);
	}
	
	public int getExprSize() {
		if(this.exprs == null)
			return -1;
		return this.exprs.size();
	}
	
	public int getMapSize() {
		return this.mapVar.size();
	}
	
	public String getProcedureID() {
		return this.procedureID;
	}
	
	public String getWithIndex(int i) {
		for(String K : this.mapVar.keySet()) {
			if(i==this.mapVar.get(K).getIndex())
				return this.mapVar.get(K).getName();
		}
		return null;
	}
	
	//XXX
	public String translate(String from) {
		
		/*
		 * Accedo alla mappa.
		 * Prendo "from" e lo cerco nella mappa
		 * se esiste, ritorno il nome corretto.
		 */
		
		if(from!=null && !from.isEmpty()) {
			if(this.mapVar.containsKey(from)) {
				return this.mapVar.get(from).getName();
			}
		}
		return null;
	}
	
	private static class ProcVarComp {
		private boolean input;
		private String datatype;
		private String ID;
		private String newID;
		private int index;
		
		private ProcVarComp(int i, boolean input, String name, String dt){
			this.index = i;
			this.input = input;
			this.ID = name;
			this.datatype = dt;
			this.newID = null;
		}
		
		public void setMapping(String param){
			this.newID = param;
		}
		
		public boolean isInput() {
			return this.input;
		}
		
		public String getName() {
			return this.ID;
		}
		
		public String getDataType() {
			return this.datatype;
		}
		
		public int getIndex() {
			return this.index;
		}
		
		public boolean isDataset() {
			return (this.datatype.equals("dataset"));
		}
	}

}
