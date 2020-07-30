package io.cahlee.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
public class Card {
	@Id
	@GeneratedValue
	Long id;
	
	String name;
	
	@OneToMany(fetch = FetchType.EAGER)
	List<Word> words;
}
