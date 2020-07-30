package io.cahlee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.cahlee.domain.Card;
import io.cahlee.service.CardService;

@RestController
@RequestMapping("/cards")
public class CardController {
	
	@Autowired
	private CardService cardService;

	@GetMapping("")
	public List<Card> getAllCards() {
		return cardService.getAllCard();
	}
}
