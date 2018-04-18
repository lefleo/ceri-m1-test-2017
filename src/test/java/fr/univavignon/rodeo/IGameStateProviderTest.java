package fr.univavignon.rodeo;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.junit.*;
import org.mockito.Mock;

import fr.univavignon.rodeo.api.IGameState;
import fr.univavignon.rodeo.api.IGameStateProvider;

public class IGameStateProviderTest {

	@Mock public IGameStateProvider GSP;
	
	@BeforeClass
	public void getGSP(){
		this.GSP=mock(IGameStateProvider.class);
	}
	
	@Test
	public void testSave(){
		IGameState GS = mock(IGameState.class);
		GSP.save(GS);
	}
	
	@Test
	public void testLoad(){
		assertEquals(null,GSP.get(null));
	}
}
