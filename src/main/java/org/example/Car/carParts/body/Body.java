package org.example.Car.carParts.body;

public class Body {

  private String name;

  private String SerialNumber;


  Body(String name, String serialNumber) {
    this.name = name;
    SerialNumber = serialNumber;
  }

  @Override
  public String toString() {
    return "Body{" +
        "name='" + name + '\'' +
        '}';
  }
}
