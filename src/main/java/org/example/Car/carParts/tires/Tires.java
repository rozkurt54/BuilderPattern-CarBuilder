package org.example.Car.carParts.tires;

public class Tires {

  private String name;
  private String Brand;
  private String size;

  Tires(String name, String brand, String size) {
    this.name = name;
    Brand = brand;
    this.size = size;
  }

  @Override
  public String toString() {
    return "Tires{" +
        "name='" + name + '\'' +
        '}';
  }

}
