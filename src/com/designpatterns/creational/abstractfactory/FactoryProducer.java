package com.designpatterns.creational.abstractfactory;

public class FactoryProducer {

	public static IShapeFactory getFactory(boolean rounded) {

		if(rounded) {
			return new RoundedShapeFactory();
		} else {
			return new RegularShapeFactory();
		}

	}
}