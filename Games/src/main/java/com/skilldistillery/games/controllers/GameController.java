package com.skilldistillery.games.controllers;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.skilldistillery.games.data.GameDAO;
import com.skilldistillery.games.entities.Game.Game;

@Controller
public class GameController {
	
	@Autowired
	private GameDAO dao;
	
	@RequestMapping(path = {"/", "home.do"})
	public String goToHome(Model model) {
		model.addAttribute("games", dao.findAll());
		return "home";
	}
	
	@RequestMapping("getGame.do")
	public String showGame(@RequestParam int gameId, Model model) {
		Game g = dao.findById(gameId);
		model.addAttribute("game", g);
		return "game/show";
	}
	
	@RequestMapping("create.do")
	public String createGame() {

		return "game/create";
	}
	
	@RequestMapping("added.do")
	public String addedGame(@RequestParam("gameId") int gameId, Game game) {

		return "game/added";

	}
	
	@RequestMapping("update.do")
	public String update() {

		return "game/update";

	}
	
	@RequestMapping(path = "create.do", method = RequestMethod.POST)
	public String create(Game g, RedirectAttributes redir) {
		ModelAndView mv = new ModelAndView();
		Game game = dao.create(g);
		mv.addObject("game", game);
		mv.setViewName("game/added");
		redir.addFlashAttribute("game", g);
		return "redirect:added.do";

	}
	
	
	@RequestMapping(path = "editGameById.do", params = "gameId", method = RequestMethod.GET)
	public ModelAndView editFilmById(@RequestParam("gameId") int gameId) throws SQLException {
		ModelAndView mv = new ModelAndView();
		Game g = dao.findById(gameId);
		mv.addObject("game", g);
		
		mv.setViewName("game/update");
		return mv;
	}

	@RequestMapping(path = "update.do", method = RequestMethod.POST)
	public ModelAndView editFilm(@RequestParam("gameId") int gameId, Model model) throws SQLException {
		
		ModelAndView mv = new ModelAndView();
		
		Game game = dao.findById(gameId);
		
		dao.update(gameId, game);
		
		mv.setViewName("home");
		return mv;
	}
	
	@RequestMapping(path = "delete.do", method = RequestMethod.POST)
	public ModelAndView delete(@RequestParam("gameId") int gameId) {
		ModelAndView mv = new ModelAndView();
		dao.delete(gameId);

		mv.addObject("game", gameId);
		mv.setViewName("game/delete");
		return mv;

	}
	

}
