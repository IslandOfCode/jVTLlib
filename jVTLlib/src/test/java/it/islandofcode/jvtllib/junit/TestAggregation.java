package it.islandofcode.jvtllib.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import it.islandofcode.jvtllib.model.DataPoint;
import it.islandofcode.jvtllib.model.DataSet;
import it.islandofcode.jvtllib.model.DataStructure;
import it.islandofcode.jvtllib.model.Scalar;
import it.islandofcode.jvtllib.model.util.Aggregation;

/**
 * @author Pier Riccardo Monzo
 */
class TestAggregation {

	private DataSet dst;
	
	/*
	 * 		|   DataSet di Test   |
	 * 		|---------------------|
	 * 		| ID |   NAME   | AGE |
	 * 		|----|----------|-----|
	 * 		|  0 |   marco  |  20 |
	 * 		|  1 | riccardo |  30 |
	 * 		|  2 |   marco  |  25 |
	 * 		|----|----------|-----|
	 * 
	 */
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		//MongoBasic MB = new MongoBasic(null,-1,"jVTLlib");
		//dst = MB.get("LNKD_ENTRPRSS", null);
		
		DataStructure dstr = new DataStructure("dstr");
		dstr.putComponent("NAME", new Scalar(Scalar.SCALARTYPE.String), DataStructure.ROLE.Identifier);
		dstr.putComponent("AGE", new Scalar(Scalar.SCALARTYPE.Integer), DataStructure.ROLE.Measure);
		
		dst = new DataSet("ds","aggregation",dstr,true);
		
		DataPoint dp = new DataPoint();
		dp.setValue("NAME", new Scalar("marco",Scalar.SCALARTYPE.String));
		dp.setValue("AGE", new Scalar("20",Scalar.SCALARTYPE.Integer));
		dst.setPoint(dp);
		dp = new DataPoint();
		dp.setValue("NAME", new Scalar("riccardo",Scalar.SCALARTYPE.String));
		dp.setValue("AGE", new Scalar("30",Scalar.SCALARTYPE.Integer));
		dst.setPoint(dp);
		dp = new DataPoint();
		dp.setValue("NAME", new Scalar("marco",Scalar.SCALARTYPE.String));
		dp.setValue("AGE", new Scalar("25",Scalar.SCALARTYPE.Integer));
		dst.setPoint(dp);
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
	@Test
	void testAggregateNext() {
		ArrayList<DataPoint> ret = new ArrayList<>();
		
		Aggregation A = new Aggregation(dst.getDataStructure(),Aggregation.AGGROP.SUM);
		for(int d=0; d<dst.getSize(); d++) {
			A.aggregateNext(dst.getPoint(d));
			ret = A.retrive();
		}
		//e come lo testo?
	}

	/**
	 * Test method for {@link it.islandofcode.jvtllib.model.util.Aggregation#retrive(it.islandofcode.jvtllib.model.DataStructure)}.
	 */
	@Test
	void testRetrive() {
		Aggregation A = new Aggregation(dst.getDataStructure(),Aggregation.AGGROP.SUM);
		for(int d=0; d<dst.getSize(); d++) {
			A.aggregateNext(dst.getPoint(d));
		}
		ArrayList<DataPoint> ret = A.retrive();
		if(ret.size()<2)
			fail("Retrive ha ritornato troppi pochi datapoint");
		
		for(DataPoint P : ret) {
			if( !("marco".equals(P.getValue("NAME").asString()) ^ "riccardo".equals(P.getValue("NAME").asString())) ){
				fail("Mancano dati!");
			}
			if("marco".equals(P.getValue("NAME").asString()) && P.getValue("AGE").asInteger()!=45)
				fail("Aggregazione fallita");
		}
	}

}
