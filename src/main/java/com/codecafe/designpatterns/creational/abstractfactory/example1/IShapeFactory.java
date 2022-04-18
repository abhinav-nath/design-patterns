package com.codecafe.designpatterns.creational.abstractfactory.example1;

public interface IShapeFactory {

  public IShape getShape(String shapeType);

}