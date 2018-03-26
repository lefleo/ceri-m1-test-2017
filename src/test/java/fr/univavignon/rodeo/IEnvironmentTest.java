package fr.univavignon.rodeo;
import static org.mockito.Mockito.*;
import org.junit.*;
import static org.junit.Assert.*;
import fr.univavignon.rodeo.api.IEnvironment;
import fr.univavignon.rodeo.api.ISpecie;

public class IEnvironmentTest {
	
	public IEnvironment getEnvironment(){
		return mock(IEnvironment.class);
	}
	
	@Test
	public void TestAreas(){
		IEnvironment E = getEnvironment();
		assertEquals(0,E.getAreas());
	}
	
	@Test
	public void TestSpecies(){
		IEnvironment E = getEnvironment();
		assertEquals(new java.util.ArrayList<ISpecie>() , E.getSpecies());
	}
}
