package application;

import dao.PokemonDao;
import services.SortingPokemon;

public class AppStep1 {

  public static void main(String[] args) {
    
    SortingPokemon.sortWithLambda(PokemonDao.pokemon);

  }

}
