package com.codecafe.designpatterns.behavioral.strategy.simuduck4;

public abstract class Duck {

  QuackBehavior quackBehavior;
  FlyBehavior flyBehavior;

  public void performQuack() {
    quackBehavior.quack();
  }

  public void performFly() {
    flyBehavior.fly();
  }

  public void setFlyBehavior(FlyBehavior flyBehavior) {
    this.flyBehavior = flyBehavior;
  }

  public void swim() {
    System.out.println("I'm swimming");
  }

  // The display() method is abstract since all duck subtypes look different
  public abstract void display(); //

}
