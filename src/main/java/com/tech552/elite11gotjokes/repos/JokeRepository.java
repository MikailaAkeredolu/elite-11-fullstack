package com.tech552.elite11gotjokes.repos;

import com.tech552.elite11gotjokes.models.Joke;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JokeRepository extends CrudRepository<Joke, Long> {
    // write custom query here
    List<Joke> findJokesByCategory(String category);
}
