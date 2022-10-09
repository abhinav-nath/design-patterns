package com.codecafe.designprinciples.ocp.example1;

public class ColorSpecification implements Specification<Product> {

  private final Color color;

  public ColorSpecification(Color color) {
    this.color = color;
  }

  @Override
  public boolean isSatisfied(Product p) {
    return p.color == color;
  }

}