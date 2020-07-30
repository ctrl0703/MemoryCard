package io.cahlee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import io.cahlee.service.CardService;

@Controller
public class PageController {
	
	@Autowired
	private CardService cardService;
	
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("cards", cardService.getAllCard());
		return "index";
	}
}
