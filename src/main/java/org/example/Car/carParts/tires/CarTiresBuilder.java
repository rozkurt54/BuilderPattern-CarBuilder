package org.example.Car.carParts.tires;

public class CarTiresBuilder {

  private String name;
  private String brand;
  private String size;

  // Package private. For new instance, use static create method
  CarTiresBuilder() {
  }

  public static CarTiresBuilder createCarTires() {
    return new CarTiresBuilder();
  }

  public CarTiresBuilder setName(String name) {
    this.name = name;
    return this;
  }

  public CarTiresBuilder setBrand(String brand) {
    this.brand = brand;
    return this;
  }

  public CarTiresBuilder setSize(String size) {
    this.size = size;
    return this;
  }

  public Tires build() {
    System.out.println("Car tires created");
    return new Tires(name, brand, size);
  }

}
