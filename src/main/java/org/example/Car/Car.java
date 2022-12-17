package org.example.Car;

import org.example.Car.carParts.body.Body;
import org.example.Car.carParts.engine.Engine;
import org.example.Car.carParts.tires.Tires;

public class Car {

  private String name;

  private Body body;
  private Engine engine;
  private Tires tires;

  Car(Body body, Engine engine, Tires tires) {
    this.body = body;
    this.engine = engine;
    this.tires = tires;
  }

  @Override
  public String toString() {
    return "Car{" +
        "name='" + name + '\'' +
        ", body=" + body +
        ", engine=" + engine +
        ", tires=" + tires +
        '}';
  }
}
