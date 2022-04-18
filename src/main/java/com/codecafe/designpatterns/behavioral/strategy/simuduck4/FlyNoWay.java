package com.codecafe.designpatterns.behavioral.strategy.simuduck4;

public class FlyNoWay implements FlyBehavior {

  public void fly() {
    System.out.println("I cannot fly");
  }
}