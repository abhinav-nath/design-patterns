package com.designpatterns.behavioral.strategy.simuduck3;

public class RubberDuck extends Duck {

    RubberDuck() {
        quackBehavior = new Squeak();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("I'm a Rubber Duck");

    }

}