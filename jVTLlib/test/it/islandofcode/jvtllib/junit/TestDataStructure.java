/**
 * 
 */
package it.islandofcode.jvtllib.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import it.islandofcode.jvtllib.model.DataStructure;
import it.islandofcode.jvtllib.model.Scalar;
import it.islandofcode.jvtllib.model.VTLObj;

/**
 * @author Pier Riccardo Monzo
 * @date 14 mar 2018
 */
class TestDataStructure {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	/**
	 * Test method for {@link it.islandofcode.jvtllib.model.DataStructure#DataStructure(java.lang.String)}.
	 */
	@Test
	void testDataStructure() {
		DataStructure ds = new DataStructure("ds1");
		assertEquals(ds.getName(),"ds1");
		//che test idiota, ma tant'è...
	}

	/**
	 * Test method for {@link it.islandofcode.jvtllib.model.DataStructure#isCollected()}.
	 */
	@Test
	void testIsCollected() {
		return;
		//ritorno e basta perchè non è usato.
	}

	/**
	 * Test method for {@link it.islandofcode.jvtllib.model.DataStructure#isComplete()}.
	 */
	@Test
	void testIsComplete() {
		DataStructure ds = new DataStructure("ds1");
		if(ds.isComplete())
			fail("non può essere completo a struttura vuota");
		ds.putComponent("comp1", new Scalar("test",Scalar.SCALARTYPE.String), DataStructure.ROLE.Identifier);
		if(ds.isComplete())
			fail("non può essere completo con un unico componente");
		ds.putComponent("comp2", new Scalar("619",Scalar.SCALARTYPE.Integer), DataStructure.ROLE.Measure);
		assertTrue(ds.isComplete());
	}

	/**
	 * Test method for {@link it.islandofcode.jvtllib.model.DataStructure#setCollected(boolean)}.
	 */
	@Test
	void testSetCollected() {
		DataStructure ds = new DataStructure("ds1");
		if(ds.isCollected())
			fail("Già impostato?");
		ds.setCollected(true);
		assertTrue(ds.isCollected());
	}

	/**
	 * Test method for {@link it.islandofcode.jvtllib.model.DataStructure#getName()}.
	 */
	@Test
	void testGetName() {
		DataStructure ds = new DataStructure("ds1");
		//come il costruttore
		assertEquals(ds.getName(),"ds1");
	}

	/**
	 * Test method for {@link it.islandofcode.jvtllib.model.DataStructure#getDescription()}.
	 */
	@Test
	void testGetDescription() {
		DataStructure ds = new DataStructure("ds1");
		/*
		 * Attualmente datastructure ignora la descrizione
		 * che sarà sempre impostata a ""
		 */
		assertEquals(ds.getDescription(),"");
	}

	/**
	 * Test method for {@link it.islandofcode.jvtllib.model.DataStructure#setComponentName(java.lang.String)}.
	 */
	@Test
	void testSetComponentName() {
		DataStructure ds = new DataStructure("ds1");
		ds.putComponent("comp1", new Scalar("test",Scalar.SCALARTYPE.String), DataStructure.ROLE.Identifier);
		ds.setComponentName("comp1","comp2");
		if(ds.containtComponent("comp1"))
			fail("vecchio nome ancora presente");
		else
			assertTrue(ds.containtComponent("comp2"));
	}

	/**
	 * Test method for {@link it.islandofcode.jvtllib.model.DataStructure#containtComponent(java.lang.String)}.
	 */
	
	@Test
	void testContaintComponent() {
		DataStructure ds = new DataStructure("ds1");
		ds.putComponent("comp1", new Scalar("test",Scalar.SCALARTYPE.String), DataStructure.ROLE.Identifier);
		assertTrue(ds.containtComponent("comp1"));
	}

	/**
	 * Test method for {@link it.islandofcode.jvtllib.model.DataStructure#putComponent(java.lang.String, it.islandofcode.jvtllib.model.VTLObj, it.islandofcode.jvtllib.model.DataStructure.ROLE)}.
	 */
	@Test
	void testPutComponent() {
		DataStructure ds = new DataStructure("ds1");
		
		ds.putComponent("comp1", new Scalar("test",Scalar.SCALARTYPE.String), DataStructure.ROLE.Identifier);
		//assertTrue(res);
		assertNotNull(ds.getComponent("comp1"));
	}

	/**
	 * Test method for {@link it.islandofcode.jvtllib.model.DataStructure#getKeys()}.
	 */
	@Test
	void testGetKeys() {
		DataStructure ds = new DataStructure("ds1");
		ds.putComponent("comp1", new Scalar("test",Scalar.SCALARTYPE.String), DataStructure.ROLE.Identifier);
		ds.putComponent("comp2", new Scalar("619",Scalar.SCALARTYPE.Integer), DataStructure.ROLE.Measure);
		if(ds.getKeys().size()<=0)
			fail("Il set non può essere vuoto");
		for(String k : ds.getKeys()) {
			if(ds.getComponent(k)==null) {
				fail("c'è una chiave non associata?");
			}
		}
	}

	/**
	 * Test method for {@link it.islandofcode.jvtllib.model.DataStructure#getComponent(java.lang.String)}.
	 */
	@Test
	void testGetComponent() {
		DataStructure ds = new DataStructure("ds1");
		ds.putComponent("comp1", new Scalar("test",Scalar.SCALARTYPE.String), DataStructure.ROLE.Identifier);
		assertNotNull(ds.getComponent("comp1"));
	}

	/**
	 * Test method for {@link it.islandofcode.jvtllib.model.DataStructure#getObjType()}.
	 */
	@Test
	void testGetObjType() {
		DataStructure ds = new DataStructure("ds1");
		assertEquals(ds.getObjType(), VTLObj.OBJTYPE.DataStructure);
	}

}
