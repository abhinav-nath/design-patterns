package com.codecafe.designprinciples.ocp.example1;

public class SizeSpecification implements Specification<Product> {

  private final Size size;

  public SizeSpecification(Size size) {
    this.size = size;
  }

  @Override
  public boolean isSatisfied(Product p) {
    return p.size == size;
  }

}