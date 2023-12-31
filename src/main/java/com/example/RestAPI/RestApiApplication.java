package com.example.RestAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import skaro.pokeapi.client.PokeApiClient;
import skaro.pokeapi.resource.pokemonform.PokemonForm;

import java.io.IOException;

@SpringBootApplication
@RestController
public class RestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApiApplication.class, args);
	}

}


