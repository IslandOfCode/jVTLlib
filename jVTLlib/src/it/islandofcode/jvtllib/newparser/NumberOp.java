package it.islandofcode.jvtllib.newparser;

import java.time.Duration;

import it.islandofcode.jvtllib.model.DataSet;
import it.islandofcode.jvtllib.model.Scalar;

/**
 * Classe utility per le quattro operazioni.
 * @author Pier Riccardo Monzo
 */
public class NumberOp {
	
	/* SOLO SCALARI */
	
	public static Scalar add(Scalar a, Scalar b) {
		if(a.isNumber() && b.isNumber()) {
			if(a.getScalarType().equals(Scalar.SCALARTYPE.Float) || b.getScalarType().equals(Scalar.SCALARTYPE.Float)) {
				return new Scalar(""+(a.asDouble()+b.asDouble()), Scalar.SCALARTYPE.Float);
			}
			return new Scalar(""+(a.asDouble()+b.asDouble()), Scalar.SCALARTYPE.Integer);
		} else 
			throw new IllegalArgumentException("SUM of non numerical value.");
	}
	
	public static Scalar mul(Scalar a, Scalar b) {
		if(a.isNumber() && b.isNumber()) {
			if(a.getScalarType().equals(Scalar.SCALARTYPE.Float) || b.getScalarType().equals(Scalar.SCALARTYPE.Float)) {
				return new Scalar(""+(a.asDouble()*b.asDouble()), Scalar.SCALARTYPE.Float);
			}
			return new Scalar(""+(a.asDouble()*b.asDouble()), Scalar.SCALARTYPE.Integer);
		} else 
			throw new IllegalArgumentException("MUL of non numerical value.");
	}
	
	public static Scalar sub(Scalar a, Scalar b) {
		if(a.isNumber() && b.isNumber()) {
			if(a.getScalarType().equals(Scalar.SCALARTYPE.Float) || b.getScalarType().equals(Scalar.SCALARTYPE.Float)) {
				return new Scalar(""+(a.asDouble()-b.asDouble()), Scalar.SCALARTYPE.Float);
			}
			return new Scalar(""+(a.asDouble()-b.asDouble()), Scalar.SCALARTYPE.Integer);
		} else if(a.getScalarType()==Scalar.SCALARTYPE.Date && b.getScalarType()==Scalar.SCALARTYPE.Date) {
			return new Scalar(""+Duration.between(a.asDate().getDate(),  b.asDate().getDate()).toDays(), Scalar.SCALARTYPE.Integer);
		} else 
			throw new IllegalArgumentException("SUB of non numerical or non date value.");
	}
	
	public static Scalar div(Scalar a, Scalar b) {
		if(a.isNumber() && b.isNumber()) {
			if(b.asDouble()==0) {
				throw new ArithmeticException("Division by zero!");
			}
			if(a.getScalarType().equals(Scalar.SCALARTYPE.Float) || b.getScalarType().equals(Scalar.SCALARTYPE.Float)) {
				return new Scalar(""+(a.asDouble()*b.asDouble()), Scalar.SCALARTYPE.Float);
			}
			return new Scalar(""+(a.asDouble()*b.asDouble()), Scalar.SCALARTYPE.Integer);
		} else 
			throw new IllegalArgumentException("Div of non numerical value.");
	}
	
	/* COLONNA SCALARI */
	
	public static DataSet add(DataSet a, Scalar b) {
		throw new ArithmeticException("Not implemented yet");
	}
	
	public static DataSet mul(DataSet a, Scalar b) {
		throw new ArithmeticException("Not implemented yet");
	}
	
	
	/* DATASET DATASET */
	
	public static Scalar add(DataSet a, DataSet b) {
		if(!a.getDataStructure().equals(b.getDataStructure()))
			throw new IllegalArgumentException("Can't SUM DataSet with different DataStructure (Attributes are ignored).");
		
		
		
		throw new IllegalArgumentException("SUM of non numerical value.");
	}
	
	public static Scalar mul(DataSet a, DataSet b) {
		if(!a.getDataStructure().equals(b.getDataStructure()))
			throw new IllegalArgumentException("Can't SUM DataSet with different DataStructure (Attributes are ignored).");
		
		
		
		throw new IllegalArgumentException("SUM of non numerical value.");
	}
	

}
