package com.designpatterns.creational.abstractfactory;

public interface IShapeFactory {
	
	IShape getShape(String shapeType);
	
}