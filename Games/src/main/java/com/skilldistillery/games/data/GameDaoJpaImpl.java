package com.skilldistillery.games.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

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
	public Game create(Game game) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAGames");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();

		em.persist(game);

		em.flush();

		em.getTransaction().commit();

		return game;
	}

	@Override
	public Game update(@RequestParam("gameId") int gameId, Game game) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAGames");
		EntityManager em = emf.createEntityManager();
		Game managed = em.find(Game.class, gameId);

		if (managed != null) {
			em.getTransaction().begin();

			managed.setTitle(game.getTitle());
			managed.setDescription(game.getDescription());
			managed.setImageUrl(game.getImageUrl());
			managed.setDeveloper(game.getDeveloper());
			managed.setRating(game.getRating());
			managed.setGenre(game.getGenre());
			managed.setMetascore(game.getMetascore());
			managed.setUserScore(game.getUserScore());
			managed.setPublisher(game.getPublisher());
			
			em.getTransaction().commit();

		}

		return managed;
	}

	@Override
	public boolean delete(int gameId) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAGames");
		EntityManager em = emf.createEntityManager();

		Boolean destroyed = false;
		Game destroyedGame = em.find(Game.class, gameId);

		if (destroyedGame != null) {
			em.getTransaction().begin();

			em.remove(destroyedGame);

			em.getTransaction().commit();

			destroyed = !em.contains(destroyedGame);
		}

		return destroyed;
	}

}