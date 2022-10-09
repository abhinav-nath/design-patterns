package com.codecafe.designprinciples.lsp.example2;

public class LSPDemo1 {

  public static void main(String[] args) {
    Vehicle vehicle = new Car(); // LSP
    vehicle.setSpeed(200);
    vehicle.setCubicCapacity(3000);
    System.out.println(vehicle);

    vehicle = new Bus(); // LSP
    vehicle.setSpeed(100);
    vehicle.setCubicCapacity(5000);
    System.out.println(vehicle);

    Car car = new Car();
    car.setColor("blue");
    car.setCubicCapacity(3500);
    car.setHatchBack(true);
    car.setSpeed(210);
    System.out.println(car);
  }

}