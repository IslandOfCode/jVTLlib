package it.islandofcode.jvtllib.model;

/**
 * @author Pier Riccardo Monzo
 */
public interface VTLObj {
	public static enum OBJTYPE {
		Scalar,
		
		DataSet,
		DataStructure,
		ValueDomain,
		
		//not implemented
		ValueDomainSubset,
		
		DataSetColumn,
		
		DataPointRuleSet,
		SingleRule,
		RuleCondition
	}
	
	public OBJTYPE getObjType();
}
