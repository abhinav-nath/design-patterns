package com.designpatterns.behavioral.strategy.simuduck2;

public abstract class Duck {

    public void swim() {
        System.out.println("I'm swimming");
    }

    // The display() method is abstract since all duck subtypes look different
    public abstract void display(); //

}