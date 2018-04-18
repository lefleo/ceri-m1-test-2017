package fr.univavignon.rodeo;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.junit.*;
import org.mockito.Mock;

import fr.univavignon.rodeo.api.IAnimal;

public class IAnimalTest{
		
	@Mock public IAnimal A;
	
	@BeforeClass
	public void getAnimal(){
		this.A=mock(IAnimal.class);
	}
	
	@Test
	public void testXP(){
		assertEquals(0,A.getXP());
	}
	
	@Test
	public void testSecret(){
		assertEquals(false,A.isSecret());
	}
	
	@Test
	public void testEndangered(){
		assertEquals(false,A.isEndangered());
	}
	
	@Test
	public void testBoss(){
		assertEquals(false,A.isBoss());
	}
	
}