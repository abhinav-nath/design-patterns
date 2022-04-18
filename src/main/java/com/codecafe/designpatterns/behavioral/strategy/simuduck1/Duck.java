package com.codecafe.designpatterns.behavioral.strategy.simuduck1;

public abstract class Duck {

  // All ducks quack and swim, the superclass takes care of the implementation code
  public void quack() {
    System.out.println("I am quacking");
  }

  public void fly() {
    System.out.println("I'm flying");
  }

  public void swim() {
    System.out.println("I'm swimming");
  }

  // The display() method is abstract since all duck subtypes look different
  public abstract void display(); //

}