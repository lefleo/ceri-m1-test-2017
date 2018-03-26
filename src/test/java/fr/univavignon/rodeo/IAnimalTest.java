package fr.univavignon.rodeo;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.junit.*;

import fr.univavignon.rodeo.api.IAnimal;

public class IAnimalTest{
		
	public IAnimal getAnimal(){
		return mock(IAnimal.class);
	}
	
	@Test
	public void TestXP(){
		IAnimal A = getAnimal();
		assertEquals(0,A.getXP());
	}
	
	@Test
	public void TestSecret(){
		IAnimal A = getAnimal();
		assertEquals(false,A.isSecret());
	}
	
	@Test
	public void TestEndangered(){
		IAnimal A = getAnimal();
		assertEquals(0,A.isEndangered());
	}
	
	@Test
	public void TestBoss(){
		IAnimal A = getAnimal();
		assertEquals(false,A.isBoss());
	}
	
}
