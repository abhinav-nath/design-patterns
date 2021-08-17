package com.codecafe.designpatterns.creational.abstractfactory.example1;

/*
 * This pattern creates a family of related objects that have different parent class or interface.
 *
 * In Abstract Factory pattern, the object creation happens in the same way as Factory Method.
 * The only difference is the creation of related objects.
 * 
 * Factory Method is just a method while Abstract Factory is an object.
 * The purpose of a Class having factory method is not just create objects, 
 * it does other work also, only a method is responsible for creating object.
 * 
 * In Abstract Factory, the whole purpose of the class is to create family of objects.
 * 
 * Abstract Factory is one level higher in abstraction than Factory Method.
 * Factory Method abstracts the way objects are created, 
 * while Abstract Factory also abstracts the way factories are created which in turn abstracts the way objects are created.
 * 
 */
public class AbstractFactoryDemo {

    public static void main(String[] args) {

        IShapeFactory shapeFactory = FactoryProducer.getFactory(false);

        IShape shape1 = shapeFactory.getShape("RECTANGLE");
        shape1.draw();

        IShape shape2 = shapeFactory.getShape("SQUARE");
        shape2.draw();

        shapeFactory = FactoryProducer.getFactory(true);

        IShape shape3 = shapeFactory.getShape("RECTANGLE");
        shape3.draw();

        IShape shape4 = shapeFactory.getShape("SQUARE");
        shape4.draw();

    }

}