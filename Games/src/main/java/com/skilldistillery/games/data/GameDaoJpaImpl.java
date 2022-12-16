package com.skilldistillery.games.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.skilldistillery.games.entities.Game.Game;

@Service
@Transactional
public class GameDaoJpaImpl implements GameDAO {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Game findById(int gameId) {
		return em.find(Game.class, gameId);
	}

	@Override
	public List<Game> findAll() {
		String jpql = "SELECT g FROM Game g";
		return em.createQuery(jpql, Game.class).getResultList();
	}

	@Override
	public Game create() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Game update(int gameId, Game game) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(int gameId) {
		// TODO Auto-generated method stub
		return false;
	}

}
