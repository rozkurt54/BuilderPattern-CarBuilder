package org.example.Car.carParts.engine;

public class CarEngineBuilder {

  private String name;
  private int power;
  private String brand;

  // Package private. For new instance, use static create method
  CarEngineBuilder() {
  }

  public static CarEngineBuilder createCarEngine() {
    return new CarEngineBuilder();
  }

  public CarEngineBuilder setName(String name) {
    this.name = name;
    return this;
  }
  public CarEngineBuilder setPower(int power) {
    this.power = power;
    return this;
  }

  public CarEngineBuilder setBrand(String brand) {
    this.brand = brand;
    return this;
  }

  public Engine build(){
    System.out.println("Car engine created");
    return new Engine(name, power, brand);
  }



}
