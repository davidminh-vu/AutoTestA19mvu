import static org.junit.Assert.*;

import java.awt.Color;

import org.junit.*;

public class AutoTest {

	public AutoTest(){
		konstruktortesten();
		
		testGetType();
		testGetFarbe();
		testGetLeistung();
		
		testSetFarbe();
		testSetLeistung();
		testSetType();
	}
	
	/**
	 * Testet den Konstruktor von Auto mit einer absichtlich falscen assert abfrage
	 * @since 16.03.2017
	 */
	@Test
	public void konstruktortesten(){
		
		Auto a1 = new Auto("Audi",Color.BLACK, 200);
		assertEquals("Ford", a1.getType());
		
		Auto a2 = new Auto(null,Color.BLACK, 200);
	}
	
	@Test
	public void testGetType(){
		Auto a1 = new Auto();
		assertEquals("Golf", a1.getType());
	}
	
	@Test (expected=IllegalArgumentException.class)
	public void testSetType(){
		Auto a1 = new Auto();
		a1.setType("");
		assertEquals("Golf", a1.getType());
	}
	
	@Test
	public void testGetFarbe(){
		Auto a1 = new Auto("Ford", Color.BLACK, 160);
		assertEquals(Color.RED, a1.getFarbe());
	}
	
	@Test (expected=IllegalArgumentException.class)
	public void testSetFarbe(){
		Auto a1 = new Auto();
		a1.setFarbe(null);
	}
	
	@Test
	public void testGetLeistung(){
		Auto a1 = new Auto("Ford", Color.RED, 20);
		assertEquals(120, a1.getLeistung());
	}
	
	@Test
	public void testSetLeistung(){
		Auto a1 = new Auto();
		a1.setLeistung(-1);
	}
	
	@Test
	public void toStringTest(){
		Auto a1 = new Auto("", null, -1);
	}
}
