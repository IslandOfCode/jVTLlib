package it.islandofcode.jvtllib.model;

import it.islandofcode.jvtllib.model.util.SimpleDate;

/**
 * @author Pier Riccardo Monzo
 */
public class ValueDomainOld implements VTLObj {
	
	//define ValueDomain TimeYears (“Time values”, date restrict YYYY)
	// TimeYears name
	// “Time values” description
	// date VTLObject
	// restrict è parola chiave
	// YYYY tipo di restrizione:
	//		restrict [YYYY | MM | DD | YYYY-MM | maxLength n | regexp regexp | between a and b | > b | < n | <= n | >= n]
	
	/**
	 * Enum delle operazioni di restrizione sui dati che sono attualmente supportati.<br>
	 * Si fa notare che le restrizioni sulle date non sono chiarissime poichè, così come sono scritte,<br>
	 * sembrano altamente distruttive. Poniamo ad es.<br><code>restric YYYY</code><br>
	 * Se abbiamo la data nel formato <i>01/01/2018</i>, questa diventerà solo <i>2018</i>, perdendo giorno e mese.<br><br>
	 * Indagare, perchè è possibile che vogliano invece che dal formato <i>01/01/18</i> otteniamo <i>01/01/2018</i>.
	 */
	public static enum RESTRICT{
		YYYY_MM,	//considera la data nel formato YYYY-MM, tipo 2018-03
		maxLength,	//stringa di lunghezza massima n
		regexp,		//espressione regolare
		betweenand,	//compreso tra a e b
		GT,			//maggiore di
		LT,			//minore di
		GTE,		//maggiore uguale di
		LTE			//minore uguale di
	}
	
	
	private String name;
	private String description;
	private VTLObj datatype;
	private RESTRICT op;
	
	//queste variabili sono d'appoggio, solo per contenere i valori per eseguire la RESTRICTOP.
	private double a,b;
	private String regexp;
	private SimpleDate d;
	
	/**
	 * Costruttore per la classe ValueDomain.<br>
	 * Il costruttore è generico per tutte le operazioni di restrizione possibili.<br>
	 * Gli scalari in input a e b vanno popolati in base al tipo di operazione.<br>
	 * Ad es. se vogliamo YYYY, dobbiamo inserire solo a, mentre b va messo a null (verrà comunque ignorato.<br>
	 * L'op between ha bisogno di due valori, quindi vanno popolati entrambi, o l'operazione fallirà.
	 * @param name String
	 * @param description String
	 * @param type {@link VTLObj}
	 * @param op {@link RESTRICT}
	 * @param a {@link Scalar}
	 * @param b {@link Scalar}
	 */
	public ValueDomainOld(String name, String description, VTLObj type, RESTRICT op, Scalar a, Scalar b) {
		this.name = name;
		this.description = description;
		this.datatype = type;
		this.op = op;
		
		if(op.equals(RESTRICT.YYYY_MM)) {
			this.d = a.asDate();
		} else if(op.equals(RESTRICT.regexp)) {
			this.regexp = a.asString();
		} else if(op.equals(RESTRICT.maxLength)) {
			this.a = a.asInteger();
		} else {
			this.a = a.asDouble();
			if(b != null)
				this.b = b.asDouble();
		}
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public VTLObj getDataType() {
		return this.datatype;
	}
	
	/**
	 * Verifica se il {@link DataPoint} passato come parametro sia conforme al ValueDomain.<br>
	 * Un'implementazione corretta dovrebbe scartare il {@link DataPoint} se il metodo ritorna False.
	 * @param in {@link DataPoint}
	 * @return boolean
	 */
	public boolean checkDomain(DataPoint in, String key) {
		Scalar tmp;
		//for(String K : in.getKeySet()) {
		if(in.getValue(key)!=null) {
			//tmp = in.getValue(K);
			tmp = in.getValue(key);
			if(tmp.getScalarType().equals(Scalar.SCALARTYPE.Date)) { //data, YYYY, MM, DD, YYYY-MM
				this.d = tmp.asDate();
				switch(this.op) {
					case YYYY_MM:{
						if(d.getFormat().equals(SimpleDate.DATEFORMAT[SimpleDate.DATE_FORMAT_YEARMONTH]))
							return true;
						else
							return false;
					}
					//TODO anche between e <,>,=>,<= etc.
				default:
					return false;
				}
			}//fine if data
			if(tmp.isNumber()) {
				switch(this.op) {
					case GT:{
						return (tmp.asDouble() > this.a) ? true : false;
					}
					case LT:{
						return (tmp.asDouble() < this.a) ? true : false;
					}
					case GTE:{
						return (tmp.asDouble() >= this.a) ? true : false;
					}
					case LTE:{
						return (tmp.asDouble() <= this.a) ? true : false;
					}
					case betweenand:{
						return ( (tmp.asDouble()>=this.a) && (tmp.asDouble()<=this.b)) ? true : false;
					}
					default:{
						return false;
					}
				}
			}//fine if numerici
			if(tmp.getScalarType().equals(Scalar.SCALARTYPE.String)) {
				switch(this.op) {
					case regexp:{
						return tmp.asString().matches(this.regexp);
					}
					case maxLength:{
						return (tmp.asString().length()==this.a) ? true : false;
					}
					default:{
						return false;
					}
				}
			}//fine if Stringhe
		}
		//} //fine for
		return false;
	}
	
	@Override
	public OBJTYPE getObjType() {
		return VTLObj.OBJTYPE.ValueDomain;
	}

}
