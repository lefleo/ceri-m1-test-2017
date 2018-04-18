package fr.univavignon.rodeo;

import static org.mockito.Mockito.*;
import org.junit.*;
import org.mockito.Mock;

import static org.junit.Assert.*;
import fr.univavignon.rodeo.api.IEnvironment;
import fr.univavignon.rodeo.api.IEnvironmentProvider;

public class IEnvironmentProviderTest {

	@Mock public static IEnvironmentProvider EP;
	
	@BeforeClass
	public static void getEP(){
		EP=mock(IEnvironmentProvider.class);
	}
	
	@Test
	public void testAvailableEnvironments(){
		assertEquals(new java.util.ArrayList<IEnvironment>() , EP.getAvailableEnvironments());
	}
	
	@Test
	public void testEnvironmentName(){
		EP.getEnvironment(null);
	}
}
