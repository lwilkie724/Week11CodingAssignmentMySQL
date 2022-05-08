package services;

import java.util.List;
import dao.PokemonDao;
import entity.Pokemon;

public class SortingPokemon {

  public static void sortWithLambda(List<Pokemon> pokemon) {
    pokemon.sort((Pokemon a, Pokemon b) -> PokemonDao.compare(a, b));
    pokemon.forEach(System.out::println);
  }
}
