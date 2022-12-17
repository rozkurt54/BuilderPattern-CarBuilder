package org.example;

import org.example.carParts.body.Body;
import org.example.carParts.engine.Engine;
import org.example.carParts.tires.Tires;

public class Car {

  private Body body;
  private Engine engine;
  private Tires tires;

  Car(Body body, Engine engine, Tires tires) {
    this.body = body;
    this.engine = engine;
    this.tires = tires;
  }
  
}
