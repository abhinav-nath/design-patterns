package com.codecafe.designprinciples.ocp.example1;

enum Color {
  RED, GREEN, BLUE
}

enum Size {
  SMALL, MEDIUM, LARGE, HUGE
}

public class Product {

  public String name;
  public Color color;
  public Size size;

  public Product(String name, Color color, Size size) {
    super();
    this.name = name;
    this.color = color;
    this.size = size;
  }

}