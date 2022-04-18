package com.codecafe.designprinciples.ocp.example2;

public class Square implements Shape {

  private double length;

  public Square(double length) {
    this.length = length;
  }

  @Override
  public double calculateArea() {
    return length * length;
  }

}