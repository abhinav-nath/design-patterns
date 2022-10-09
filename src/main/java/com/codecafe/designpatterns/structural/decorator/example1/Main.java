package com.codecafe.designpatterns.structural.decorator.example1;

public class Main {

  public static void main(String[] args) {
    Car basicCar = new BasicCar();
    basicCar.assemble();

    System.out.println();

    Car sportsCar = new SportsCar(new BasicCar());
    sportsCar.assemble();

    System.out.println();

    Car luxurySportsCar = new SportsCar(new LuxuryCar(new BasicCar()));
    luxurySportsCar.assemble();

    System.out.println();
  }

}