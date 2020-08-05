package io.cahlee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import io.cahlee.service.CardService;

@Controller
public class PageController {
	
	@Autowired
	private CardService cardService;
	
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("cards", cardService.getCardList());
		return "index";
	}
	
	@RequestMapping("/card")
	public String card(Model model, @RequestParam Long id) {
		model.addAttribute("card", cardService.getCardDetail(id));
		return "card";
	}
	
	@RequestMapping("/word")
	public String word(Model model, @RequestParam Long id) {
		model.addAttribute("card", cardService.getRandomCardDetail(id));
		return "word";
	}
}
