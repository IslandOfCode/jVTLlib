/**
 * 
 */
package it.islandofcode.jvtllib.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import it.islandofcode.jvtllib.model.util.SimpleDate;

/**
 * @author Pier Riccardo Monzo
 * @date 12 mar 2018
 */
class TestSimpleDateSuccess {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	/**
	 * Test method for {@link it.islandofcode.jvtllib.model.util.SimpleDate#SimpleDate()}.
	 */
	@Test
	void testSimpleDate() {
		@SuppressWarnings("unused")
		SimpleDate d = new SimpleDate();
		//emm�?
	}

	/**
	 * Test method for {@link it.islandofcode.jvtllib.model.util.SimpleDate#SimpleDate(java.lang.String)}.
	 */
	@Test
	void testSimpleDateString() {
		//try {
			SimpleDate d = new SimpleDate("Mon Sep 01 02:00:00 CEST 2008");
			assertEquals(d.getDateString(), "Mon Sep 01 02:00:00 CEST 2008");
		/*} catch (ParseException e) {
			fail("Catturata eccezione");
			e.printStackTrace();
		}*/
		
	}

	/**
	 * Test method for {@link it.islandofcode.jvtllib.model.util.SimpleDate#getDateString()}.
	 */
	@Test
	void testGetDateString() {
		fail("Not yet implemented"); // TODO
	}

}
