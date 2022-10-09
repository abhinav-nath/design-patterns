package com.codecafe.designpatterns.behavioral.strategy.simuduck4;

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