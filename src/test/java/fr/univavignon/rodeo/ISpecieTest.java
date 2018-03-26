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
	public void testArea(){
		ISpecie S=getSpecie();
		assertEquals(0,S.getArea());
	}
	
	@Test
	public void testAnimals(){
		ISpecie S=getSpecie();	
		assertEquals(new java.util.ArrayList<IAnimal>(),S.getAnimals());
	}
}
