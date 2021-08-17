package com.codecafe.designpatterns.creational.abstractfactory.example1;

public class RoundedRectangle implements IShape {

    @Override
    public void draw() {
        System.out.println("Inside RoundedRectangle::draw() method.");
    }

}