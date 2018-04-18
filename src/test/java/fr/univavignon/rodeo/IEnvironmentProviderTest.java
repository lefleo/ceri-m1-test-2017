package fr.univavignon.rodeo;

import static org.mockito.Mockito.*;
import org.junit.*;
import org.mockito.Mock;

import static org.junit.Assert.*;
import fr.univavignon.rodeo.api.IEnvironment;
import fr.univavignon.rodeo.api.IEnvironmentProvider;

public class IEnvironmentProviderTest {

	@Mock public IEnvironmentProvider EP;
	
	@BeforeClass
	public void getEP(){
		this.EP=mock(IEnvironmentProvider.class);
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
