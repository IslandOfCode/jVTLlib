package it.islandofcode.jvtllib.model;

import java.util.ArrayList;

import it.islandofcode.jvtllib.newparser.antlr.newVTLParser.ExprContext;

/**
 * @author Pier Riccardo Monzo
 */
public class Function {
	private String functionID;
	private ArrayList<FunVarComp> varMap;
	private String retType;
	private ExprContext expr;
	
	
	
	public Function(String funID) {
		this.functionID = funID;
		this.varMap = new ArrayList<>();
	}
	
	public void addParam(int i, String param) {
		this.varMap.add(i, new FunVarComp(param));
	}
	
	public void addExpr(ExprContext e) {
		this.expr = e;
	}
	
	public void setRetType(String t) {
		this.retType = t;
	}
	
	public void setMapping(int i, String var) {
		if(i>=0 && i<this.varMap.size()) {
			FunVarComp FVC = this.varMap.get(i);
			FVC.setMapping(var);
			this.varMap.set(i, FVC);
		}
	}
	
	public String getFunctionID() {
		return this.functionID;
	}
	
	public ExprContext getExpr() {
		return this.expr;
	}
	
	public String getRetType() {
		return this.retType;
	}
	
	public int getVarMapSize() {
		return this.varMap.size();
	}
	
	public String getWithIndex(int i) {
		return this.varMap.get(i).getParamID();
	}
	
	public String translate(String param) {
		for(FunVarComp P : this.varMap) {
			if(P.getParamID().equals(param))
				return P.getVarID();
		}
		return null;
	}
	
	/***** CLASSE HELPER INTERNA *****/
	
	protected class FunVarComp{
		private String paramID;
		private String varID;
		
		public FunVarComp(String param) {
			this.paramID = param;
			this.varID = "";
		}
		
		public void setMapping(String var) {
			this.varID = var;
		}
		
		public String getParamID() {
			return this.paramID;
		}
		
		public String getVarID() {
			return this.varID;
		}
		
	}
	
}
