package com.codecafe.designpatterns.creational.factorymethod.example1;

public class CarFactory {

  public static Car buildCar(CarType model) {

    Car car = null;

    switch (model) {
      case SMALL -> car = new SmallCar();
      case SEDAN -> car = new SedanCar();
      case LUXURY -> car = new LuxuryCar();
      default -> {
        // throw some exception
      }
    }
    return car;
  }
}