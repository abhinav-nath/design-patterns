package com.codecafe.designpatterns.structural.composite;

public class Product extends CatalogComponent {

  private final String name;
  private final double price;

  public Product(String name, double price) {
    this.name = name;
    this.price = price;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public double getPrice() {
    return price;
  }

  @Override
  public void print() {
    // Do nothing
  }

  @Override
  public void print(String categoryName) {
    System.out.println("Product name : " + name + " Price : " + price + " Category-" + categoryName);
  }

}