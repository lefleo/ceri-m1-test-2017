package fr.univavignon.rodeo;

import static org.mockito.Mockito.*;
import org.junit.*;
import static org.junit.Assert.*;
import fr.univavignon.rodeo.api.IEnvironment;
import fr.univavignon.rodeo.api.IEnvironmentProvider;

public class IEnvironmentProviderTest {

	public IEnvironmentProvider getEP(){
		return mock(IEnvironmentProvider.class);
	}
	
	@Test
	public void testAvailableEnvironments(){
		IEnvironmentProvider EP = getEP();
		assertEquals(new java.util.ArrayList<IEnvironment>() , EP.getAvailableEnvironments());
	}
	
	@Test
	public void testEnvironmentName(){
		IEnvironmentProvider EP = getEP();
		EP.getEnvironment(null);
	}
}
