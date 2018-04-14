package it.islandofcode.jvtllib.model;

import java.util.ArrayList;
import java.util.List;

import it.islandofcode.jvtllib.newparser.newVTLParser.SingleruleContext;

/**
 * @author Pier Riccardo Monzo
 */
public class DPRuleset implements VTLObj {
	
	/** nome della regola */
	private String ruleid;
	
	/** lista colonne da usare*/
	private ArrayList<String> columns;
	/** lista regole */
	private ArrayList<SingleruleContext> rules;
	/** ultimo errore rilevato */
	private Scalar lastError;

	/**
	 * Costruttore vuoto.
	 * @deprecated
	 */
	public DPRuleset() {
	}
	
	/**
	 * Costruttore di base, prende in input il nome e una lista di colonne su cui deve operare.<br>
	 * Inizializza la lista delle regole a vuoto.
	 * @param name String
	 * @param cols String
	 */
	public DPRuleset(String name, List<String> cols) {
		this.ruleid = name;
		this.columns = (ArrayList<String>) cols;
		rules = new ArrayList<SingleruleContext>();
	}
	
	public String getRuleId() {
		return this.ruleid;
	}
	
	public ArrayList<String> getColums(){
		return this.columns;
	}
	
	public ArrayList<SingleruleContext> getRuleContexts(){
		return this.rules;
	}
	
	public void addRule(SingleruleContext sr) {
		this.rules.add(sr);	
	}
	
	public Scalar lastErrorCode() {
		return this.lastError;
	}

	/* (non-Javadoc)
	 * @see it.islandofcode.jvtllib.model.VTLObj#getObjType()
	 */
	@Override
	public OBJTYPE getObjType() {
		return VTLObj.OBJTYPE.DataPointRuleSet;
	}

}
