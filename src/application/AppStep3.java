package application;

import java.util.NoSuchElementException;
import java.util.Optional;
import dao.PokemonDao;
import entity.Pokemon;

public class AppStep3 {

  public static void main(String[] args) {

    Pokemon testPokemon = new Pokemon("Electabuzz", "Electric", "Ground");
    Optional<Pokemon> nullTest = Optional.ofNullable(null);
    Optional<Pokemon> pokemonTest = Optional.ofNullable(testPokemon);
    run(nullTest);
    run(pokemonTest);

  }

  public static void run(Optional<Pokemon> optionalPokemon) {
    try {
      optionalPokemon.orElseThrow(
          () -> new NoSuchElementException("The object " + optionalPokemon + " is missing"));
      System.out.println(PokemonDao.pokemonExists(optionalPokemon));
    } catch (NoSuchElementException e) {
      System.out.println(e.getMessage());
    }
  }
}
