package com.codecafe.designpatterns.creational.abstractfactory.example1;

public class RegularShapeFactory implements IShapeFactory {

  @Override
  public IShape getShape(String shapeType) {
    if ("RECTANGLE".equalsIgnoreCase(shapeType)) {
      return new Rectangle();
    } else if ("SQUARE".equalsIgnoreCase(shapeType)) {
      return new Square();
    }
    return null;
  }

}