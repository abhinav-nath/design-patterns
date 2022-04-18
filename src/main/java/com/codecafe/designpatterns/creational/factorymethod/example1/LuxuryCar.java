package com.codecafe.designpatterns.creational.factorymethod.example1;

public class LuxuryCar extends Car {

  LuxuryCar() {
    super(CarType.LUXURY);
    construct();
  }

  @Override
  protected void construct() {
    System.out.println("Building luxury car");
    // add accessories
  }
}