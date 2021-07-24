package com.designpatterns.structural.decorator.example2;

public class BasicChristmasTree implements ChristmasTree {

    @Override
    public void decorate() {
        System.out.print("Basic Christmas Tree.");
    }

}