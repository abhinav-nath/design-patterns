package com.codecafe.designpatterns.creational.abstractfactory.example1;

public class Square implements IShape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }

}