package com.designpatterns.behavioral.strategy.simuduck4;

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