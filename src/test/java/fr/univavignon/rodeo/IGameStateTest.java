package fr.univavignon.rodeo;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.junit.*;

import fr.univavignon.rodeo.api.IAnimal;
import fr.univavignon.rodeo.api.IGameState;
import fr.univavignon.rodeo.api.ISpecie;

public class IGameStateTest {

	public static IGameState getGS(){
		return mock(IGameState.class);
	}
	
	@Test
	public void testProgression(){
		IGameState GS = getGS();
		assertEquals(0,GS.getProgression());
	}
	
	/*@Test
	public void testSpecieLevel(){
		IGameState GS = getGS();
		ISpecie S = ISpecieTest.getSpecie();
		assertEquals(null,GS.getSpecieLevel(S));
	}*/
	
	@Test
	public void testExplore(){
		IGameState GS = getGS();
		GS.exploreArea();
	}
	
	/*@Test
	public void testCapture(){
		IGameState GS = getGS();
		IAnimal A = IAnimalTest.getAnimal();
		GS.catchAnimal(A);
	}*/
}