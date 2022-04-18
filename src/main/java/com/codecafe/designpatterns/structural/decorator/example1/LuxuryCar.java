package com.codecafe.designpatterns.structural.decorator.example1;

public class LuxuryCar extends CarDecorator {

  public LuxuryCar(Car car) {
    super(car);
  }

  @Override
  public void assemble() {
    super.assemble();
    System.out.print(" Adding features of a Luxury Car.");
  }

}