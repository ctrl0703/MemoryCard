package io.cahlee.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import io.cahlee.domain.Card;

@SpringBootTest
public class CardServiceTest {
	
	@Autowired
	private CardService cardService;
	
	@Test
	public void getCard() {
		List<Card> cards = cardService.getCardList();
		assertNotNull(cards);
		
		for(Card card : cards) {
			System.out.println(card.toString());
		}
	}
	
}
