package io.cahlee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.cahlee.domain.Card;
import io.cahlee.repository.CardRepository;

@Service
public class CardService {

	@Autowired
	private CardRepository cardRepository;
	
	public List<Card> getAllCard() {
		return (List<Card>) cardRepository.findAll();
	}

}
