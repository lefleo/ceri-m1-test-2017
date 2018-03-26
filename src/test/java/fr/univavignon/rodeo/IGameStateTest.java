package fr.univavignon.rodeo;

import static org.mockito.Mockito.*;
import org.junit.*;

import fr.univavignon.rodeo.api.IGameState;
import fr.univavignon.rodeo.api.IGameStateProvider;

public class IGameStateTest {

	public static IGameState getGS(){
		return mock(IGameState.class);
	}
	
}