package com.skilldistillery.games.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.skilldistillery.games.data.GameDAO;

@Controller
public class GameController {
	
	@Autowired
	private GameDAO dao;
	
	@RequestMapping(path = {"/", "home.do"})
	public String goToHome(Model model) {
		model.addAttribute("gameList", dao.findAll());
		return "home";
	}

}
