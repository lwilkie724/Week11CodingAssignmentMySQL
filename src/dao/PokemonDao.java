package dao;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import entity.Pokemon;

public class PokemonDao {

  public static List<Pokemon> pokemon =
      new ArrayList<Pokemon>(List.of(new Pokemon("Jigglypuff", "Normal/Fairy", "Poison/Steel"),
          new Pokemon("Alakazam", "Psychic", "Bug/Ghost/Dark"),
          new Pokemon("Gyarados", "Water/Flying", "Rock/Electric"),
          new Pokemon("Haunter", "Ghost/Poison", "Ghost/Psychic/Dark"),
          new Pokemon("Ponyta", "Fire", "Bug/Ghost/Dark")));

  public static int compare(Pokemon a, Pokemon b) {
    return a.getName().compareTo(b.getName());
  }

  public static Pokemon pokemonExists(Optional<Pokemon> optionalPokemon) {
    if (optionalPokemon.isPresent()) {
      return optionalPokemon.get();
    } else {
      throw new NoSuchElementException("There is no object in the optionalPokemon Optional");
    }

  }


}
