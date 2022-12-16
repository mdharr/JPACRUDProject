package com.skilldistillery.games.data;

import java.util.List;

import com.skilldistillery.games.entities.Game.Game;

public interface GameDAO {
	
	Game findById(int gameId);
	List<Game> findAll();
	Game create();
	Game update(int gameId, Game game);
	boolean delete(int gameId);

}
