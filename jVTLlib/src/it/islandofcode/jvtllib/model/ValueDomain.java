package it.islandofcode.jvtllib.model;

import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 * @author Pier Riccardo Monzo
 */
public class ValueDomain implements VTLObj {
	
	private String name;
	private VTLObj datatype;
	
	private String regexp;
	private List<String> codelist;

	/**
	 * Accetta una espressione regolare come definizione del dominio.
	 * Lancia una {@link PatternSyntaxException} se l'espressione
	 * regolare non è sintatticamente valida.
	 * @param name
	 * @param rg
	 * @param type
	 * @throws PatternSyntaxException
	 */
	public ValueDomain(String name, String rg, VTLObj type) throws PatternSyntaxException{
		this.name = name;
		this.datatype = type;
		this.codelist = null;
		this.regexp = rg;
		Pattern.compile(rg);
	}
	
	public ValueDomain(String name, List<String> list, VTLObj type) {
		this.name = name;
		this.datatype = type;
		this.regexp = null;
		this.codelist = list;
	}
	
	public String getName() {
		return this.name;
	}
	
	public VTLObj getDataType() {
		return this.datatype;
	}
	
	/**
	 * Il fatto di conservare un {@link VTLObj} per descrivere il tipo espresso dal dominio
	 * deriva dalla primissima versione, in cui era contemplato l'uso di {@link ValueDomainSubset}.
	 * Questa classe si è deciso di non implementarla (è ridondante), ma questo approccio è rimasto.
	 * Dato che viene sempre passato uno {@link Scalar} come {@link #datatype}, questo metodo 
	 * è consigliato rispetto al precedente, {@link #getDataType()}. 
	 * @return {@link Scalar.SCALARTYPE}
	 */
	public Scalar.SCALARTYPE getScalarType(){
		return ((Scalar) this.datatype).getScalarType();
	}
	
	/**
	 * Verifica se il {@link DataPoint} passato come parametro sia conforme al ValueDomain.<br>
	 * Un'implementazione corretta dovrebbe scartare il {@link DataPoint} se il metodo ritorna False.<br>
	 * <br>
	 * Attenzione! Se lo {@link Scalar} associato alla chiave è nullo, allora viene ritornato <i>true</i>,
	 * senza controlli aggiuntivi, perchè si assume che <b>null</b> faccia sempre parte del dominio.
	 * @param in {@link DataPoint}
	 * @return boolean
	 */
	public boolean checkDomain(DataPoint in, String key) {
		//per "contratto", key è sempre non vuota.
		Scalar tmp = in.getValue(key);
		
		//se lo scalare esiste ed è non nullo...
		if(tmp!=null) {
			
			//se scalare nullo, ritorna true direttamente.
			if(tmp.isNull())
				return true;
			
			//se regexp è not null
			if(this.regexp != null) {
				return tmp.getScalar().matches(this.regexp);
			} else { //altrimenti è una codelist
				//ciclo sulla lista
				for(String C : this.codelist) {
					if(tmp.getScalar().equals(C))
						return true;
				}
			}
		}
		
		//quella chiave non esiste nel data point, oppure non è conforme al dominio
		return false;
	}
	
	@Override
	public OBJTYPE getObjType() {
		return VTLObj.OBJTYPE.ValueDomain;
	}

}
