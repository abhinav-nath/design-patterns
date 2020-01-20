package com.designpatterns.creational.abstractfactory.example1;

public class RoundedShapeFactory implements IShapeFactory {

	@Override
	public IShape getShape(String shapeType) {

		if("RECTANGLE".equalsIgnoreCase(shapeType)) {
			return new RoundedRectangle();
		} else if("SQUARE".equalsIgnoreCase(shapeType)) {
			return new RoundedSquare();
		}
		return null;
	}

}