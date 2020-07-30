package io.cahlee.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import io.cahlee.domain.Card;

@Repository
public interface CardRepository extends CrudRepository<Card, Long> {

}
