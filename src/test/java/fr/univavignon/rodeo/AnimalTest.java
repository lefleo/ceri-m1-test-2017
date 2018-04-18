package fr.univavignon.rodeo;

import static org.junit.Assert.*;
import org.junit.*;

import fr.univavignon.rodeo.api.Animal;

public class AnimalTest {

	public static Animal A;
	public static Animal B;
	
	@BeforeClass
	public static void getAnimal(){
		A = new Animal("LOL",true,true,true);
		B = new Animal();
	}
	
	@Test
	public void testXP(){
		assertEquals(0,A.getXP());
	}
	
	@Test
	public void testSecret(){
		assertEquals(true,A.isSecret());
		assertEquals(false,B.isSecret());
	}
	
	@Test
	public void testEndangered(){
		assertEquals(true,A.isEndangered());
		assertEquals(false,B.isEndangered());
	}
	
	@Test
	public void testBoss(){
		assertEquals(true,A.isBoss());
		assertEquals(false,B.isBoss());
	}
}
