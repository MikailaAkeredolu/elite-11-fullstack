package com.tech552.elite11gotjokes.controllers;

import com.tech552.elite11gotjokes.models.Joke;
import com.tech552.elite11gotjokes.repos.JokeRepository;
import com.tech552.elite11gotjokes.services.JokesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("http://localhost:4200")
public class JokesController {

    //Dependency Injection
    @Autowired
    private JokesService jokesService;

    @Autowired
    private JokeRepository jokeRepository;

    @PostMapping("/jokes")
    public void addJoke(@RequestBody Joke joke){
       jokesService.saveJoke(joke);
    }

    @GetMapping("/jokes")
    public List<Joke> getAllJokes( @RequestParam(required = false) String category){
        if(category != null){
            return jokeRepository.findJokesByCategory(category);
        }
        return jokesService.getAllJokes();
    }


    @GetMapping("/jokes/{id}")
    public Optional<Joke> getJokeById(@PathVariable Long id){
        return jokesService.getJokeById(id);
    }

    @PutMapping("/jokes/{id}")
    public Joke updateJoke(@PathVariable Long id, @RequestBody Joke joke ){
        return jokesService.updateJoke(id, joke);
    }


    @DeleteMapping("/jokes/{id}")
    public void deleteJokeById(@PathVariable Long id){
        jokesService.deleteJokeById(id);
    }

}
