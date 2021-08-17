package com.codecafe.designpatterns.behavioral.strategy.simuduck3;

public class RedHeadDuck extends Duck {

    RedHeadDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a RedHead Duck");
    }

}