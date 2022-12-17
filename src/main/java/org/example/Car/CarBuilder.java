package org.example.Car;

import org.example.Car.carParts.body.Body;
import org.example.Car.carParts.engine.Engine;
import org.example.Car.carParts.tires.Tires;

public class CarBuilder {

  private String name;
  private Body body;
  private Engine engine;
  private Tires tires;

  CarBuilder() {
  }

  public static CarBuilder createCar(){
    return new CarBuilder();
  }

  public CarBuilder setName(String name){
    this.name = name;
    System.out.println("Car name set: " + name);
    return this;

  }
  public CarBuilder setBody(Body body){
    this.body = body;
    System.out.println("Car body set: "+ body);
    return this;
  }

  public CarBuilder setEngine(Engine engine){
    this.engine = engine;
    System.out.println("Car engine set: " + engine);
    return this;
  }

  public CarBuilder setTires(Tires tires) {
    this.tires = tires;
    System.out.println("Car tires set: " + tires);
    return this;
  }

  public Car build(){
    System.out.println("Car built");
    return new Car(body, engine, tires);
  }

}
