package com.codecafe.designpatterns.behavioral.strategy.simuduck3;

public class MallardDuck extends Duck {

  MallardDuck() {
    quackBehavior = new Quack();
    flyBehavior = new FlyWithWings();
  }

  @Override
  public void display() {
    System.out.println("I'm a Mallard Duck");
  }

}