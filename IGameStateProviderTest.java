package fr.univavignon.rodeo;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.junit.*;

import fr.univavignon.rodeo.api.IGameState;
import fr.univavignon.rodeo.api.IGameStateProvider;

public class IGameStateProviderTest {

	public IGameStateProvider getGSP(){
		return mock(IGameStateProvider.class);
	}
	
	@Test
	public void testSave(){
		IGameStateProvider GSP = getGSP();
		IGameState GS = IGameStateTest.getGS();
		GSP.save(GS);
	}
	
	@Test
	public void testLoad(){
		IGameStateProvider GSP = getGSP();
		assertEquals(null,GSP.get(null));
	}
}
