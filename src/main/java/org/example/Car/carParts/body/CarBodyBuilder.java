package org.example.Car.carParts.body;

public class CarBodyBuilder {

  private String name;

  private String serialNumber;


  // Package private. For new instance, use static create method
  CarBodyBuilder() {
  }

  public static CarBodyBuilder createCarBody(){
    return new CarBodyBuilder();
  }

  public CarBodyBuilder setName(String name) {
    this.name = name;
    return this;
  }

  public CarBodyBuilder setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
    return this;
  }

  public Body build() {
    System.out.println("Car body created");
    return new Body(name, serialNumber);
  }



}
