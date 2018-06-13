package it.islandofcode.jvtllib.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.HashMap;
import java.util.regex.PatternSyntaxException;

import org.junit.jupiter.api.Test;

import it.islandofcode.jvtllib.model.DataPoint;
import it.islandofcode.jvtllib.model.Scalar;
import it.islandofcode.jvtllib.model.ValueDomain;
import it.islandofcode.jvtllib.model.exception.DataPointInvalidCostructor;

/**
 * @author Pier Riccardo Monzo
 * @date 14 mar 2018
 */
class TestValueDomain {

	/**
	 * Test method for {@link it.islandofcode.jvtllib.model.ValueDomain#ValueDomain(java.lang.String, java.lang.String, it.islandofcode.jvtllib.model.VTLObj, it.islandofcode.jvtllib.model.ValueDomain.RESTRICT, it.islandofcode.jvtllib.model.Scalar, it.islandofcode.jvtllib.model.Scalar)}.
	 */
	@Test
	void testValueDomain() {
		try {
			String reg = "^\\\\$\\\\{([\\\\w]+)\\\\}$";
			ValueDomain vd = new ValueDomain("name",reg,Scalar.SCALARTYPE.Float);
			fail("Doveva lanciare eccezione, perchè " + reg + " non è una regex valida.");
			reg = vd.getName(); //giusto per evitare il problema dell'unused
		} catch (PatternSyntaxException pse){
		}
	}

	/**
	 * Test method for {@link it.islandofcode.jvtllib.model.ValueDomain#getName()}.
	 */
	@Test
	void testGetName() {
		ValueDomain vd = new ValueDomain("name","^(.)+$",Scalar.SCALARTYPE.String);
		assertEquals(vd.getName(),"name");
	}

	/**
	 * Test method for {@link it.islandofcode.jvtllib.model.ValueDomain#getDataType()}.
	 */
	@Test
	void testGetDataType() {
		ValueDomain vd = new ValueDomain("name","^(.)+$",Scalar.SCALARTYPE.String);
		assertEquals(Scalar.SCALARTYPE.String,vd.getScalarType());
	}
	
	/**
	 * Test method for {@link it.islandofcode.jvtllib.model.ValueDomain#getScalarType()}.
	 */
	@Test
	void testGetScalarType() {
		ValueDomain vd = new ValueDomain("name","^(.)+$",Scalar.SCALARTYPE.String);
		assertEquals(Scalar.SCALARTYPE.String,vd.getScalarType());
	}

	/**
	 * Test method for {@link it.islandofcode.jvtllib.model.ValueDomain#checkDomain(it.islandofcode.jvtllib.model.DataPoint, java.lang.String)}.
	 */
	@Test
	void testCheckDomain() {
		ValueDomain vd = new ValueDomain("name","^(\\d)+.(\\d)+$",Scalar.SCALARTYPE.Float);
		HashMap<String, Scalar> in = new HashMap<String, Scalar>();
		in.put("PI", new Scalar("3.14", Scalar.SCALARTYPE.Float));
		try {
			DataPoint dp = new DataPoint(in);
			if(!vd.checkDomain(dp, "PI")) {
				fail("controllo fallito");
			}

		} catch (DataPointInvalidCostructor e) {
			fail(e.getMessage());
		}
	}

}
