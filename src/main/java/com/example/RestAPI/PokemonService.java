package com.example.RestAPI;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import com.example.RestAPI.Pokemon;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PokemonService {
    private static final String BASE_URL = "https://pokeapi.co/api/v2/pokemon?limit=100";

    private final OkHttpClient httpClient = new OkHttpClient();
    private final ObjectMapper objectMapper = new ObjectMapper();

    public List<com.example.RestAPI.Pokemon> getAllPokemon() throws IOException {
        List<Pokemon> pokemonList = new ArrayList<>();

        Request request = new Request.Builder()
                .url(BASE_URL)
                .build();

        try (Response response = httpClient.newCall(request).execute()) {
            if (!response.isSuccessful()) throw new IOException("Unexpected code " + response);

            objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            PokemonList pokemonListResponse = objectMapper.readValue(response.body().string(), PokemonList.class);
            pokemonList.addAll(pokemonListResponse.getResults());
        }

        return pokemonList;
    }
}
