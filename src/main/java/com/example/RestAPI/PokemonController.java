package com.example.RestAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
public class PokemonController {
    private final PokemonService pokemonService = new PokemonService();

    @GetMapping("/pokemon")
    public List<Pokemon> getAllPokemon() throws IOException {
        return pokemonService.getAllPokemon();
    }
}
