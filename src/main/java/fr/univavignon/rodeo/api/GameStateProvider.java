package fr.univavignon.rodeo.api;

import java.util.List;

public class GameStateProvider implements IGameStateProvider {

	public IGameState get(String name){
		return new GameState();
	}

	public void save(IGameState gameState) {
		
	}
}