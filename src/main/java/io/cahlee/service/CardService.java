package io.cahlee.service;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.cahlee.domain.Card;
import io.cahlee.repository.CardRepository;

@Service
public class CardService {

	@Autowired
	private CardRepository cardRepository;
	
	public List<Card> getCardList() {
		return (List<Card>) cardRepository.findAll();
	}

	public Card getCardDetail(Long cardId) {
		return cardRepository.findById(cardId).get();
	}

	public Card getRandomCardDetail(Long cardId) {
		Card card = cardRepository.findById(cardId).get();
		Collections.shuffle(card.getWords());
		return card;
	}
}
