package it.islandofcode.jvtllib.model;

/**
 * Relazione tra un dataset e una specifica colonna di quest'ultimo.
 * @author Pier Riccardo Monzo
 */
public class DataSetColumn implements VTLObj {
	
	private String DataSetName;
	private String ColumnName;
	
	public DataSetColumn(String dsname, String clmname) {
		this.DataSetName = dsname;
		this.ColumnName = clmname;
	}
	
	/**
	 * Verifica se la colonna passata come parametro fa parte del {@link DataSet}.
	 * @param ds {@link DataSet}
	 * @param colname String
	 * @return boolean
	 */
	public static boolean checkIfContain(DataSet ds, String colname) {
		
		for(String S : ds.getDataStructure().getKeys()) {
			if(S.equals(colname))
				return true;
		}
		return false;
	}
	
	public String getDataSetName() {
		return this.DataSetName;
	}
	
	public String getColumnName() {
		return this.ColumnName;
	}

	@Override
	public OBJTYPE getObjType() {
		return OBJTYPE.DataSetColumn;
	}

}
