package fr.univavignon.rodeo;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.junit.*;
import org.mockito.Mock;

import fr.univavignon.rodeo.api.IAnimal;
import fr.univavignon.rodeo.api.ISpecie;

public class ISpecieTest {

	@Mock public ISpecie S;
	
	@BeforeClass
	public void getSpecie(){
		this.S=mock(ISpecie.class);
	}
	
	@Test
	public void testArea(){
		assertEquals(0,S.getArea());
	}
	
	@Test
	public void testAnimals(){
		assertEquals(new java.util.ArrayList<IAnimal>(),S.getAnimals());
	}
}
