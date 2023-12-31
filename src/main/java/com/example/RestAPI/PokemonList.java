package com.example.RestAPI;

import com.example.RestAPI.Pokemon;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Collection;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PokemonList {
    private List<Pokemon> results;

    public Collection<? extends com.example.RestAPI.Pokemon> getResults() {
        return results;
    }

    public void setResults(List<Pokemon> results) {
        this.results = results;
    }
}
