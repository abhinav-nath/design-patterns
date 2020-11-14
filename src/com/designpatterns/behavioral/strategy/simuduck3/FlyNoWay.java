package com.designpatterns.behavioral.strategy.simuduck3;

public class FlyNoWay implements FlyBehavior {

    public void fly() {
        System.out.println("I cannot fly");
    }
}