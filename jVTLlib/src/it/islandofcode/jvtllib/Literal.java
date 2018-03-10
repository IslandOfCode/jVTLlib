package it.islandofcode.jvtllib;

import java.util.Date;

public class Literal {
	// Literal.
	/*literal : nullLiteral
	         | booleanLiteral
	         | dateLiteral
	         | integerLiteral
	         | floatLiteral
	         | stringLiteral ;*/
	
	public static Literal VOID = new Literal(new Object());
	
	final Object literal;
	
	public Literal(Object Literal) {
		this.literal = Literal;
	}
	
	//*******************************//
	
	public Object asNull() {
		return null;
	}
	
	public boolean asBool(Object lit) {
		return (boolean)lit;
	}
	
	public Date asDate(Object lit) {
		if(lit instanceof java.util.Date)
			return (Date)lit;
		else
			return new Date();
	}
	
	public int asInteger(Object lit) {
		return (int)lit;
	}
	
	public float asFloat(Object lit) {
		return (float)lit;
	}
	
	public String asString(Object lit) {
		return (String)lit;
	}
	
	//*******************************//

	@Override
	public int hashCode() {
		return (this.literal == null) ? 0 : this.literal.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Literal other = (Literal) obj;
		if (literal == null) {
			if (other.literal != null)
				return false;
		} else if (!literal.equals(other.literal))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return String.valueOf(this.literal);
	}
		
}
