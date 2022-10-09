package com.codecafe.designpatterns.creational.abstractfactory.example1;

public interface IShapeFactory {

  IShape getShape(String shapeType);

}