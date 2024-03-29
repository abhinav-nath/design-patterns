package com.codecafe.designprinciples.ocp.example2;

public class Circle implements Shape {

  private final double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  @Override
  public double calculateArea() {
    return (22 / 7) * radius * radius;
  }

}