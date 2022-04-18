package com.codecafe.designprinciples.ocp.example2;

public class AreaCalculatorDemo {

  public static void main(String[] args) {

    AreaCalculator ac = new AreaCalculator();

    Shape square = new Square(10);
    Shape rectangle = new Rectangle(10, 20);
    Shape circle = new Circle(30);

    System.out.println("Area of Square = " + ac.calculateShapeArea(square));
    System.out.println("Area of Rectangle = " + ac.calculateShapeArea(rectangle));
    System.out.println("Area of Circle = " + ac.calculateShapeArea(circle));
  }

}