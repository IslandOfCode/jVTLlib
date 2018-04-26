package it.islandofcode.jvtllib.model;

import java.math.BigDecimal;

import it.islandofcode.jvtllib.model.util.SimpleDate;

public class Scalar implements VTLObj {

	public static enum SCALARTYPE {
		String, Integer, Float, Boolean, Date, Null
	}

	private SCALARTYPE what;
	private String scalar;
	private boolean isNull = false;

	/**
	 * Il costruttore prende in input un dato e cerca di capire
	 * che tipo di dato sia.
	 * @param sca String
	 */
	public Scalar(String sca) {

		sca = sca.replace("\"", "");
		this.scalar = sca;
		this.what = SCALARTYPE.String;
		this.isNull = false;

		// this.scalar = ((String)this.scalar).trim().replace("\"", "");

		//improbabile l'uso ma tant'è
		if (sca.equals("null") || sca.equals("NULL")) {
			this.scalar = "";
			this.what = SCALARTYPE.Null;
			this.isNull = true;
		}
		// c'è la possibilità che non si tratti di una stringa ma di qualcos'altro
		if (((String) sca).matches("^([+-]?\\d+)$")) {
			//this.scalar = Integer.parseInt(sca);
			this.what = SCALARTYPE.Integer;
		}
		if (((String) sca).matches("^([+-]?\\d*\\.\\d+)$")) { // per avere +/- davanti ^([+-]?\\d*\\.\\d+)$ //senza segno ^(\\d*\\.\\d+)$
			//this.scalar = Float.parseFloat(sca);
			this.what = SCALARTYPE.Float;
		}
		if (((String) sca).matches("^(true|false|T|F)$")) {
			/*if (((String) sca).equals("T"))
				this.scalar = Boolean.TRUE;
			else if (((String) sca).equals("F"))
				this.scalar = Boolean.FALSE;
			else
				this.scalar = Boolean.parseBoolean((String) sca);*/
			this.what = SCALARTYPE.Boolean;
		}

		// provo a capire se è una data
		SimpleDate sd = new SimpleDate(sca);
		if (!sd.isDefaultDate()) {
			this.what = SCALARTYPE.Date;
		}

	}

	/**
	 * Il costruttore più semplice, accetta sia il valore che il tipo.<br>
	 * <b>ATTENZIONE!</b> nessun controllo viene effettuato sul tipo. Quindi assicuratevi
	 * di inserire il tipo giusto con il giusto valore.
	 * @param sca String
	 * @param what {@link SCALARTYPE}
	 */
	public Scalar(String sca, SCALARTYPE what) {
		sca = sca.replace("\"", "");
		this.scalar = sca;
		this.what = what;
		
		//questi controlli servono semplicemente per riformattare i numeri al loro tipo (0 int, 0.0 float)
		if (what.equals(SCALARTYPE.Integer)) {
			this.scalar = ""+((sca!=null && !sca.isEmpty()) ? Integer.parseInt(sca.split("\\.")[0]) : 0);
		}
		if (what.equals(SCALARTYPE.Float)) {
			this.scalar = ""+((sca!=null && !sca.isEmpty()) ? Float.parseFloat(sca) : 0.0);
		}
		
		if (what.equals(SCALARTYPE.Null))
			this.isNull = true;
	}

	/**
	 * Costruttore usato per create oggetti nulli o che verranno usati
	 * come segnaposto nel {@link DataStructure}.
	 * @param what {@link SCALARTYPE}
	 */
	public Scalar(SCALARTYPE what) {
		this.what = what;
		this.isNull = true;
		this.scalar = "";
	}

	/**
	 * Per ottenere il valore dello scalare come stringa, senza conversioni.
	 * @return
	 */
	public String getScalar() {
		return this.scalar;
	}

	/**
	 * Per ottenere il tipo dello scalare.
	 * @return
	 */
	public SCALARTYPE getScalarType() {
		return this.what;
	}

	/**
	 * Wrapper di getScalar().<br>
	 * Mantenuto per compatibilità.
	 * @return
	 */
	public String asString() {
		return getScalar();
	}

	/**
	 * Ritorna lo scalare come intero.<br>
	 * Nel caso in cui lo scalare era nullo, verrà ritornato 0.<br>
	 * Verificare SEMPRE se lo scalare è nullo tramite il metodo apposito prima.
	 * @return
	 */
	public int asInteger() {
		return ((!this.scalar.isEmpty()) ? (new BigDecimal(this.scalar)).intValue(): 0);
	}

	public float asFloat() {
		return ((!this.scalar.isEmpty()) ? (new BigDecimal(this.scalar)).floatValue(): 0f);
	}

	public boolean asBoolean() {
		if(!this.scalar.isEmpty()) {
			if(this.scalar.equals("T"))
				return true;
			if(this.scalar.equals("F"))
				return false;
			return Boolean.parseBoolean(this.scalar.toLowerCase());
		}
		//se è nullo, ritorna false, così come da specifiche VTL
		return false;
	}

	public SimpleDate asDate() {
		return ((!this.scalar.isEmpty()) ? new SimpleDate(this.scalar) : new SimpleDate());
	}


	/**
	 * Ritorna il numero come double, per operazioni matematiche generiche
	 * 
	 * @return double
	 */
	public double asDouble() {
		if (this.what == SCALARTYPE.Integer || this.what == SCALARTYPE.Float)
			return (new BigDecimal(this.scalar)).doubleValue();
		else
			return 0; // ritorna un valore di default
	}

	/**
	 * Ritorna true se lo scalare è un numero
	 * @return boolean
	 */
	public boolean isNumber() {
		return (what.equals(SCALARTYPE.Integer) || what.equals(SCALARTYPE.Float));
	}

	/**
	 * Ritorna true se lo scalare è nullo.
	 * @return Boolean
	 */
	public boolean isNull() {
		return this.isNull;
	}
	
	
	public static Scalar createBoolean(boolean status) {
		if(status)
			return new Scalar("true", Scalar.SCALARTYPE.Boolean);
		else
			return new Scalar("false", Scalar.SCALARTYPE.Boolean);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Scalar)){
			return false;
		}
		
		Scalar s = (Scalar)obj;
		
		if(s.getScalarType()==this.what)
			if(s.asString().equals(this.scalar))
				return true;
		
		return false;
	}

	@Override
	public OBJTYPE getObjType() {
		return VTLObj.OBJTYPE.Scalar;
	}

}
