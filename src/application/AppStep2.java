package application;

import java.util.stream.Collectors;
import dao.PokemonDao;
import entity.Pokemon;

public class AppStep2 {

  public static void main(String[] args) {
    
    String sortedPokemon = PokemonDao.pokemon.stream()
        .map(Pokemon::toString)
        .sorted()
        .collect(Collectors.joining(", "));
    
    System.out.println(sortedPokemon);

  }

}
