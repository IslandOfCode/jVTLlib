package it.islandofcode.jvtllib.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import it.islandofcode.jvtllib.model.Scalar;
import it.islandofcode.jvtllib.model.VTLObj;
import it.islandofcode.jvtllib.model.util.SimpleDate;

/**
 * @author Pier Riccardo Monzo
 */
class TestScalarSuccess {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	/**
	 * Test method for {@link it.islandofcode.jvtllib.model.Scalar#Scalar(java.lang.Object)}.
	 */
	@Test
	void testScalarObject() {
		Scalar S = new Scalar("false");
		assertEquals(S.getScalarType(), Scalar.SCALARTYPE.Boolean);
	}
	
	

	/**
	 * Test method for {@link it.islandofcode.jvtllib.model.Scalar#Scalar(java.lang.Object, it.islandofcode.jvtllib.model.Scalar.SCALARTYPE)}.
	 */
	@Test
	void testScalarObjectSCALARTYPE() {
		Scalar S = new Scalar(Scalar.SCALARTYPE.String);
		assertEquals(S.asString(),"");
	}

	/**
	 * Test method for {@link it.islandofcode.jvtllib.model.Scalar#getScalar()}.
	 */
	@Test
	void testGetScalar() {
		String o = "";
		Scalar S = new Scalar(o);
		assertEquals(o, S.getScalar());
	}

	/**
	 * Test method for {@link it.islandofcode.jvtllib.model.Scalar#getScalarType()}.
	 */
	@Test
	void testGetScalarType() {
		Scalar S = new Scalar("3.5");
		assertEquals(Scalar.SCALARTYPE.Float, S.getScalarType());
	}

	/**
	 * Test method for {@link it.islandofcode.jvtllib.model.Scalar#asString()}.
	 */
	@Test
	void testAsString() {
		Scalar S = new Scalar("peppe");
		assertEquals("peppe", S.asString());
	}

	/**
	 * Test method for {@link it.islandofcode.jvtllib.model.Scalar#asInteger()}.
	 */
	@Test
	void testAsInteger() {
		Scalar S = new Scalar("15");
		assertEquals(15, S.asInteger());
	}

	/**
	 * Test method for {@link it.islandofcode.jvtllib.model.Scalar#asFloat()}.
	 */
	@Test
	void testAsFloat() {
		Scalar S = new Scalar("6.45f");
		assertEquals(6.45f, S.asFloat());
	}

	/**
	 * Test method for {@link it.islandofcode.jvtllib.model.Scalar#asBoolean()}.
	 */
	@Test
	void testAsBoolean() {
		Scalar S = new Scalar("true");
		assertEquals(true, S.asBoolean());
	}

	/**
	 * Test method for {@link it.islandofcode.jvtllib.model.Scalar#asDate()}.
	 */
	@Test
	void testAsDate() {
		SimpleDate d = new SimpleDate();
		Scalar S = new Scalar(d.getDateString());
		assertEquals(d.getDateString(), S.asDate().getDateString());
	}
	
	/**
	 * Test method for {@link it.islandofcode.jvtllib.model.Scalar#getObjType()}.
	 */
	@Test
	void testGetObjType() {
		Scalar S = new Scalar("1");
		assertEquals(VTLObj.OBJTYPE.Scalar, S.getObjType());
	}

}
