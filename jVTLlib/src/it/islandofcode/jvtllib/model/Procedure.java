package it.islandofcode.jvtllib.model;

import java.util.ArrayList;
import java.util.List;

import it.islandofcode.jvtllib.newparser.antlr.newVTLParser.AssignmentContext;

/**
 * @author Pier Riccardo Monzo
 */
public class Procedure {
	
	private String procedureID; 
	
	private ArrayList<ProcVarComp> mapParam;
	
	private List<AssignmentContext> exprs;

	/**
	 * Costruttore.
	 */
	public Procedure(String name) {
		this.procedureID = name;
		this.mapParam = new ArrayList<>();
	}
	
	/**
	 * Aggiunge la lista di istruzioni lette dal Parser.<br>
	 * Fa uso di {@link AssignmentContext}.
	 * @param exs
	 */
	public void setExprs(List<AssignmentContext> exs) {
		this.exprs = exs;
	}
	
	/**
	 * Quando si dichara una nuova procedura, aggiunge un nuovo parametro,
	 * specificando la sua posizione, il nome, il tipo e se è un parametro inputo o di output.
	 * @param i int
	 * @param input boolean
	 * @param name String
	 * @param dt String
	 */
	public void addParameter(int i, boolean input, String name, String dt) {
		this.mapParam.add(i, new ProcVarComp(input, name, dt));
	}
	
	/**
	 * Recupera l'istruzione indicata dall'indice.
	 * @param index int
	 * @return {@link AssignmentContext}
	 */
	public AssignmentContext getExpr(int index) {
		return this.exprs.get(index);
	}
	
	/**
	 * Ritorna il numero delle istruzioni, -1 altrimenti.
	 * @return int
	 */
	public int getExprSize() {
		if(this.exprs == null)
			return -1;
		return this.exprs.size();
	}
	
	/**
	 * Ritorna il numero dei parametri.
	 * @return int
	 */
	public int getMapSize() {
		return this.mapParam.size();
	}
	
	/**
	 * Ritorna il nome della funzione.
	 * @return String
	 */
	public String getProcedureID() {
		return this.procedureID;
	}
	
	/**
	 * Ritorna il nome del parametro in posizione indicata.
	 * @param i int
	 * @return String
	 */
	public String getWithIndex(int i) {
		return this.mapParam.get(i).getName();
	}
	
	/**
	 * Quando una procedura viene invocata, per ogni parametro si invoca questo metodo.<br>
	 * Se il parametro corrisponde a quello della procedura, ritorna true.
	 * @param i
	 * @param input
	 * @param name
	 * @param dt
	 * @return boolean
	 */
	public boolean addCompleteMapping(int i, boolean input, String name, String dt) {
		if(this.checkParam(i, input, dt)) {
			ProcVarComp PVC = this.mapParam.get(i);
			PVC.setMapping(name);
			this.mapParam.set(i, PVC);
			return true;
		}
		
		return false;
	}
	
	/**
	 * A differenza di addCompleteMapping(), questo metodo inserisce semplicemente il nuovo
	 * nome della variabile.
	 * @param i
	 * @param name
	 */
	public void addFastMapping(int i, String name) {
		if(i>=0 && i<this.mapParam.size()) {
			ProcVarComp PVC = this.mapParam.get(i);
			PVC.setMapping(name);
			this.mapParam.set(i, PVC);
		}
	}
	
	/**
	 * Verifica se c'è corrispondenza tra parametri.
	 * @param index
	 * @param input
	 * @param dt
	 * @return boolean
	 */
	public boolean checkParam(int index, boolean input, String dt) {
		if(index<0 && index>=this.mapParam.size())
			return false;
		
		if(input == this.mapParam.get(index).isInput())
			if(dt.equals(this.mapParam.get(index).getDataType()))
				return true;
		
		
		return false;
	}
	
	public String translate(String declare) {
		for(ProcVarComp PVC : this.mapParam) {
			if(PVC.getName().equals(declare))
				return PVC.getNewName();
		}
		return null;
	}
	
	public String getOutputVarName() {
		return this.mapParam.get(this.mapParam.size()-1).getName();
	}
	
	/**
	 * Classe interna per gestire i parametri di una procedura.
	 * @author Pier Riccardo Monzo
	 */
	protected static class ProcVarComp {
		private boolean input;
		private String datatype;
		private String ID;
		private String newID;
		
		/**
		 * Costruttore: prende in input il tipo di parametro, il datatype e, ovviamente, il nome.
		 * @param input
		 * @param name
		 * @param dt
		 */
		private ProcVarComp(boolean input, String name, String dt){
			this.input = input;
			this.ID = name;
			this.datatype = dt;
			this.newID = null;
		}
		
		/**
		 * Associa il nome della variabile a quella del parametro.
		 * @param param
		 */
		public void setMapping(String param){
			this.newID = param;
		}
		
		/**
		 * Ritorna il nome della variabile associata al parametro.
		 * @return String
		 */
		public String getNewName() {
			return this.newID;
		}
		
		/**
		 * Ritorna true se il parametro è di input.
		 * @return boolean
		 */
		public boolean isInput() {
			return this.input;
		}
		
		/**
		 * Ritorna il nome del parametro.
		 * @return String
		 */
		public String getName() {
			return this.ID;
		}
		
		/**
		 * Ritorna il tipo del data. Per ora solo dataset e string.
		 * @return String
		 */
		public String getDataType() {
			return this.datatype;
		}
		
		/**
		 * Ritorna true se il tipo del parametro è dataset.
		 * @return boolean
		 */
		public boolean isDataset() {
			return (this.datatype.equals("dataset"));
		}
	}

}
