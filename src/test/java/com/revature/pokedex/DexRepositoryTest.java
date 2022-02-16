package com.revature.pokedex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DexRepositoryTest {
    @Test
    public void getPokemonTest() {
        CSVDexRepository testRepo = new CSVDexRepository("pokedextest.csv");
        Pokemon actual = testRepo.getPokemon("Bulbasaur");
        Pokemon expected = new Pokemon("Bulbasaur");
        Assertions.assertEquals(expected.getName(), actual.getName());
    }
}