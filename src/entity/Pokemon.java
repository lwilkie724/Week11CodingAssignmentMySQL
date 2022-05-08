package entity;

public class Pokemon {

  private String name;
  private String type;
  private String weakness;

  public Pokemon(String name, String type, String weakness) {
    this.setName(name);
    this.setType(type);
    this.setWeakness(weakness);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getWeakness() {
    return weakness;
  }

  public void setWeakness(String weakness) {
    this.weakness = weakness;
  }

  @Override
  public String toString() {
    return "This Pokemon is " + name;
  }
}
