package com.codecafe.designpatterns.behavioral.strategy.simuduck2;

public class RedHeadDuck extends Duck implements Flyable, Quackable {

    @Override
    public void display() {
        System.out.println("I'm a RedHead Duck");
    }

    public void fly() {
        System.out.println("I'm flying");
    }

    public void quack() {
        System.out.println("I'm quacking");
    }
}