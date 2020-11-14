package com.designpatterns.creational.abstractfactory.example1;

public class FactoryProducer {

    public static IShapeFactory getFactory(boolean rounded) {

        if (rounded) {
            return new RoundedShapeFactory();
        } else {
            return new RegularShapeFactory();
        }

    }
}