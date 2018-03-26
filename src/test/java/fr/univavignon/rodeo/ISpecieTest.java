package fr.univavignon.rodeo;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.junit.*;

import fr.univavignon.rodeo.api.IAnimal;
import fr.univavignon.rodeo.api.ISpecie;

public class ISpecieTest {

	public ISpecie getSpecie(){
		return mock(ISpecie.class);
	}
	
	@Test
	public void TestArea(){
		ISpecie S=getSpecie();
		assertEquals(0,S.getArea());
	}
	
	@Test
	public void TestAnimals(){
		ISpecie S=getSpecie();	
		assertEquals(null,S.getAnimals());
	}
}
