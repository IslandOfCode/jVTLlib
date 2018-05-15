package it.islandofcode.jvtllib.junit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import it.islandofcode.jvtllib.model.DataPoint;
import it.islandofcode.jvtllib.model.Scalar;
import it.islandofcode.jvtllib.model.exception.DataPointInvalidCostructor;

/**
 * @author Pier Riccardo Monzo
 */
class TestDataPoint {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	/**
	 * Test method for {@link it.islandofcode.jvtllib.model.DataPoint#DataPoint()}.
	 */
	@Test
	void testDataPoint() {
		DataPoint dp = new DataPoint();
		assertEquals(dp.getValue(""),null);
	}

	/**
	 * Test method for {@link it.islandofcode.jvtllib.model.DataPoint#DataPoint(java.util.HashMap)}.
	 */
	@Test
	void testDataPointHashMapOfStringScalar() {
		HashMap<String, Scalar> in = new HashMap<String, Scalar>();
		in.put("prova", new Scalar("pippo", Scalar.SCALARTYPE.String));
		in.put("prova2", new Scalar("pluto", Scalar.SCALARTYPE.String));
		
		DataPoint dp;
		try {
			dp = new DataPoint(in);
			//System.out.println("VALUE: " + dp.getValue("prova").asString());
			assertEquals(dp.getValue("prova").asString(),"pippo");
		} catch (Exception e) {
			fail(e.getMessage());
			//e.printStackTrace();
		}
	}

	/**
	 * Test method for {@link it.islandofcode.jvtllib.model.DataPoint#DataPoint(java.lang.String[], it.islandofcode.jvtllib.model.Scalar[])}.
	 */
	@Test
	void testDataPointStringArrayScalarArray() {
		String[] key = {
				"prova",
				"prova2"
				};
		Scalar[] value = {
				new Scalar("10", Scalar.SCALARTYPE.Integer),
				new Scalar("20", Scalar.SCALARTYPE.Integer)
				};
		
		//System.out.println("KEYLEN: " + key.length + "\nVALUELEN: " + value.length);
		try {
			DataPoint dp = new DataPoint(key,value);
			assertEquals(dp.getValue("prova").asInteger(),10);
		} catch (DataPointInvalidCostructor e) {
			//System.out.println(e.getMessage());
			fail(e.getMessage());
		}
	}

	/**
	 * Test method for {@link it.islandofcode.jvtllib.model.DataPoint#getKeySet()}.
	 */
	@Test
	void testGetKeySet() {
		HashMap<String, Scalar> in = new HashMap<String, Scalar>();
		in.put("prova", new Scalar("pippo", Scalar.SCALARTYPE.String));
		in.put("prova2", new Scalar("pluto", Scalar.SCALARTYPE.String));
		
		DataPoint dp = new DataPoint();
		
		if(dp.getKeySet() == null)
			fail("ritornato iterable nullo");
		
		for(String K : dp.getKeySet()) {
			if(dp.getValue(K) == null)
				fail("ritornata chiave inesistente");
		}
	}

	/**
	 * Test method for {@link it.islandofcode.jvtllib.model.DataPoint#getValue(java.lang.String)}.
	 */
	@Test
	void testGetValue() {
		HashMap<String, Scalar> in = new HashMap<String, Scalar>();
		in.put("prova", new Scalar("pippo", Scalar.SCALARTYPE.String));
		try {
			DataPoint dp = new DataPoint(in);
			assertEquals(dp.getValue("prova").asString(),"pippo");
		} catch (DataPointInvalidCostructor e) {
			fail(e.getMessage());
		}
	}

	/**
	 * Test method for {@link it.islandofcode.jvtllib.model.DataPoint#setValue(java.lang.String, it.islandofcode.jvtllib.model.Scalar)}.
	 */
	@Test
	void testSetValue() {
		HashMap<String, Scalar> in = new HashMap<String, Scalar>();
		in.put("prova", new Scalar("pippo", Scalar.SCALARTYPE.String));
		try {
			DataPoint dp = new DataPoint(in);
			dp.setValue("prova", new Scalar("pluto",Scalar.SCALARTYPE.String));
			assertEquals(dp.getValue("prova").asString(),"pluto");
		} catch (DataPointInvalidCostructor e) {
			fail(e.getMessage());
		}
	}

	/**
	 * Test method for {@link it.islandofcode.jvtllib.model.DataPoint#getKeys()}.
	 * N.B. è lo stesso di quello di sopra. Cancellarne uno e tenere l'altro.
	 */
	@Test
	void testGetKeys() {
		HashMap<String, Scalar> in = new HashMap<String, Scalar>();
		in.put("prova", new Scalar("pippo", Scalar.SCALARTYPE.String));
		in.put("prova2", new Scalar("pluto", Scalar.SCALARTYPE.String));
		
		DataPoint dp = new DataPoint();
		
		if(dp.getKeySet() == null)
			fail("ritornato iterable nullo");
		
		for(String K : dp.getKeySet()) {
			if(dp.getValue(K) == null)
				fail("ritornata chiave inesistente");
		}
	}

}
