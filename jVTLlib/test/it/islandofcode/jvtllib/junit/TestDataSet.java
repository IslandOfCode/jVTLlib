package it.islandofcode.jvtllib.junit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import it.islandofcode.jvtllib.model.DataPoint;
import it.islandofcode.jvtllib.model.DataSet;
import it.islandofcode.jvtllib.model.DataStructure;
import it.islandofcode.jvtllib.model.Scalar;
import it.islandofcode.jvtllib.model.VTLObj;
import it.islandofcode.jvtllib.model.exception.DataPointInvalidCostructor;

class TestDataSet {

	@BeforeEach
	void setUp() throws Exception {
	}

	@SuppressWarnings("unused")
	@Test
	void testDataSetStringStringDataStructureBoolean() {
		DataStructure dstr = new DataStructure("dstr1");
		dstr.putComponent("comp1", new Scalar("test",Scalar.SCALARTYPE.String), DataStructure.ROLE.Identifier);
		dstr.putComponent("comp2", new Scalar("619",Scalar.SCALARTYPE.Integer), DataStructure.ROLE.Measure);
		DataSet ds = new DataSet("ds1","desc",dstr,false);
		
	}

	@Test
	void testDataSetStringStringDataStructureArrayListOfDataPointBoolean() {
		DataStructure dstr = new DataStructure("dstr1");
		dstr.putComponent("comp1", new Scalar(Scalar.SCALARTYPE.String), DataStructure.ROLE.Identifier);
		dstr.putComponent("comp2", new Scalar(Scalar.SCALARTYPE.Integer), DataStructure.ROLE.Measure);
		
		ArrayList<DataPoint> data = new ArrayList<DataPoint>();
		
		HashMap<String, Scalar> in = new HashMap<String, Scalar>();
		in.put("comp1", new Scalar("pippo", Scalar.SCALARTYPE.String));
		in.put("comp2", new Scalar("0", Scalar.SCALARTYPE.Integer));
		
		try {
			data.add(new DataPoint(in));
		} catch (DataPointInvalidCostructor e1) {
			fail(e1.getMessage());
		}
		
		DataSet ds = new DataSet("ds1","desc",dstr,data,false);
		assertTrue(ds.getPoint(0).getValue("comp1").asString().equals("pippo"));
	}

	@Test
	void testGetName() {
		DataStructure dstr = new DataStructure("dstr1");
		dstr.putComponent("comp1", new Scalar("test",Scalar.SCALARTYPE.String), DataStructure.ROLE.Identifier);
		dstr.putComponent("comp2", new Scalar("619",Scalar.SCALARTYPE.Integer), DataStructure.ROLE.Measure);
		DataSet ds = new DataSet("ds1","desc",dstr,false);
		assertTrue(ds.getName().equals("ds1"));
	}

	@Test
	void testGetDescription() {
		DataStructure dstr = new DataStructure("dstr1");
		dstr.putComponent("comp1", new Scalar("test",Scalar.SCALARTYPE.String), DataStructure.ROLE.Identifier);
		dstr.putComponent("comp2", new Scalar("619",Scalar.SCALARTYPE.Integer), DataStructure.ROLE.Measure);
		DataSet ds = new DataSet("ds1","desc",dstr,false);
		assertTrue(ds.getDescription().equals("desc"));
	}

	@Test
	void testGetDataStructure() {
		DataStructure dstr = new DataStructure("dstr1");
		dstr.putComponent("comp1", new Scalar("test",Scalar.SCALARTYPE.String), DataStructure.ROLE.Identifier);
		dstr.putComponent("comp2", new Scalar("619",Scalar.SCALARTYPE.Integer), DataStructure.ROLE.Measure);
		DataSet ds = new DataSet("ds1","desc",dstr,false);
		assertEquals(ds.getDataStructure(),dstr);
	}

	@Test
	void testSetPointDataPoint() {
		DataStructure dstr = new DataStructure("dstr1");
		dstr.putComponent("comp1", new Scalar(Scalar.SCALARTYPE.String), DataStructure.ROLE.Identifier);
		dstr.putComponent("comp2", new Scalar(Scalar.SCALARTYPE.Integer), DataStructure.ROLE.Measure);
		
		HashMap<String, Scalar> in = new HashMap<String, Scalar>();
		in.put("comp1", new Scalar("pippo", Scalar.SCALARTYPE.String));
		in.put("comp2", new Scalar("0", Scalar.SCALARTYPE.Integer));
		
		try {
			
			DataPoint dp = new DataPoint(in);
			DataSet ds = new DataSet("ds1","desc",dstr,false);
			assertTrue(ds.setPoint(dp));
			
		} catch (DataPointInvalidCostructor e) {
			fail(e.getMessage());
		}
	}

	@Test
	void testGetObjType() {
		DataStructure dstr = new DataStructure("dstr1");
		dstr.putComponent("comp1", new Scalar("test",Scalar.SCALARTYPE.String), DataStructure.ROLE.Identifier);
		dstr.putComponent("comp2", new Scalar("619",Scalar.SCALARTYPE.Integer), DataStructure.ROLE.Measure);
		DataSet ds = new DataSet("ds1","desc",dstr,false);
		assertEquals(ds.getObjType(),VTLObj.OBJTYPE.DataSet);
	}

}
