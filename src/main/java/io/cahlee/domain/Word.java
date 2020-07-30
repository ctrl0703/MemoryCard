package io.cahlee.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
public class Word {
	@Id
	@GeneratedValue
	Long id;
	
	String word;
	String meaning;
	boolean isMemorized;
}
