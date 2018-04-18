package fr.univavignon.rodeo;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.junit.*;
import org.mockito.Mock;

import fr.univavignon.rodeo.api.IAnimal;
import fr.univavignon.rodeo.api.IGameState;
import fr.univavignon.rodeo.api.ISpecie;

public class IGameStateTest {

	@Mock public IGameState GS;
	
	@BeforeClass
	public  void getGS(){
		this.GS = mock(IGameState.class);
	}
	
	@Test
	public void testProgression(){
		assertEquals(0,GS.getProgression());
	}
	
	@Test
	public void testSpecieLevel(){
		ISpecie S = mock(ISpecie.class);
		assertEquals(null,GS.getSpecieLevel(S));
	}
	
	@Test
	public void testExplore(){
		GS.exploreArea();
	}
	
	@Test
	public void testCapture(){
		IAnimal A = mock(IAnimal.class);
		GS.catchAnimal(A);
	}
}