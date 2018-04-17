package it.islandofcode.jvtllib.model;

import java.util.HashMap;
import java.util.List;

import it.islandofcode.jvtllib.newparser.antlr.newVTLParser.AssignmentContext;

/**
 * @author Pier Riccardo Monzo
 */
public class Procedure {
	
	private String procedureID; 
	
	private HashMap<String,String> mapVar;
	
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
	
	public AssignmentContext getExpr(int index) {
		return this.exprs.get(index);
	}
	
	public int getExprLenght() {
		if(this.exprs == null)
			return -1;
		return this.exprs.size();
	}
	
	public String getProcedureID() {
		return this.procedureID;
	}
	
	private static class ProcVarComp {
		
	}

}
