package fr.univavignon.rodeo;
import static org.mockito.Mockito.*;
import org.junit.*;
import org.mockito.Mock;

import static org.junit.Assert.*;
import fr.univavignon.rodeo.api.IEnvironment;
import fr.univavignon.rodeo.api.ISpecie;

public class IEnvironmentTest {
	
	@Mock public static IEnvironment E;
	
	@BeforeClass
	public static void getEnvironment(){
		E=mock(IEnvironment.class);
	}
	
	@Test
	public void testAreas(){
		assertEquals(0,E.getAreas());
	}
	
	@Test
	public void testSpecies(){
		assertEquals(new java.util.ArrayList<ISpecie>() , E.getSpecies());
	}
}
