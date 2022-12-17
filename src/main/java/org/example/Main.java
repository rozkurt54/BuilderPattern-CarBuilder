package org.example;

import org.example.Car.Car;
import org.example.Car.CarBuilder;
import org.example.Car.carParts.body.Body;
import org.example.Car.carParts.body.CarBodyBuilder;
import org.example.Car.carParts.engine.CarEngineBuilder;
import org.example.Car.carParts.engine.Engine;
import org.example.Car.carParts.tires.CarTiresBuilder;
import org.example.Car.carParts.tires.Tires;

public class Main {
  public static void main(String[] args) {
    Body carBody = CarBodyBuilder.createCarBody()
        .setName("BMW Body")
        .setSerialNumber("65465456465465")
        .build();

    //Car body created.

    Engine carEngine = CarEngineBuilder.createCarEngine()
        .setName("BMW Engine")
        .setPower(220)
        .setBrand("GM")
        .build();

    //Car engine created

    Tires carTires = CarTiresBuilder.createCarTires()
        .setName("BMW Tires")
        .setSize("220/65/55")
        .setBrand("Bridgestone")
        .build();

    //Car tires createsd

    Car bmwCar = CarBuilder.createCar()
        .setName("BMW M5")
        .setBody(carBody)
        .setTires(carTires)
        .setEngine(carEngine)
        .build();
    //Car built;

    System.out.println("Car spec: " + bmwCar);

  }
}