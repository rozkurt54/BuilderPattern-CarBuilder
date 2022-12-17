package org.example.Car.carParts.engine;

public class Engine {

  private String name;
  private int power;

  private String brand;

  Engine(String name, int power, String brand) {
    this.name = name;
    this.power = power;
    this.brand = brand;
  }

  @Override
  public String toString() {
    return "Engine{" +
        "name='" + name + '\'' +
        '}';
  }
}
