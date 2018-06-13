package it.islandofcode.jvtllib.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import it.islandofcode.jvtllib.connector.basic.MongoBasic;
import it.islandofcode.jvtllib.model.DataSet;
import it.islandofcode.jvtllib.model.util.Aggregation;

/**
 * @author Pier Riccardo Monzo
 */
class TestAggregation {

	private DataSet dst;
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		MongoBasic MB = new MongoBasic(null,-1,"jVTLlib");
		dst = MB.get("LNKD_ENTRPRSS", null);
	}

	/**
	 * Test method for {@link it.islandofcode.jvtllib.model.util.Aggregation#Aggregation(it.islandofcode.jvtllib.model.DataStructure, it.islandofcode.jvtllib.model.util.Aggregation.AGGROP)}.
	 */
	@Test
	void testAggregation() {
		Aggregation A = new Aggregation(dst.getDataStructure(),Aggregation.AGGROP.MAX);
		assertEquals("AGE", A.getMeasureCompName());
	}

	/**
	 * Test method for {@link it.islandofcode.jvtllib.model.util.Aggregation#getAggrOp()}.
	 */
	@Test
	void testGetAggrOp() {
		Aggregation A = new Aggregation(dst.getDataStructure(),Aggregation.AGGROP.MAX);
		assertEquals(Aggregation.AGGROP.MAX, A.getAggrOp());
	}

	/**
	 * Test method for {@link it.islandofcode.jvtllib.model.util.Aggregation#aggregateNext(it.islandofcode.jvtllib.model.DataPoint)}.
	 */
	@SuppressWarnings("unused")
	@Test
	void testAggregateNext() {
		Aggregation A = new Aggregation(dst.getDataStructure(),Aggregation.AGGROP.SUM);
		for(int d=0; d<dst.getSize(); d++) {
			A.aggregateNext(dst.getPoint(d));
		}
		DataSet nds = new DataSet("","",dst.getDataStructure(),A.retrive(),false);
		fail("ToDo");
	}

	/**
	 * Test method for {@link it.islandofcode.jvtllib.model.util.Aggregation#retrive(it.islandofcode.jvtllib.model.DataStructure)}.
	 */
	@Test
	void testRetrive() {
		fail("not implemented yet");
	}

}
