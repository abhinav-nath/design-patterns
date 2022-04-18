package com.codecafe.designpatterns.behavioral.strategy.simuduck2;

public class RubberDuck extends Duck implements Quackable {

  @Override
  public void display() {
    System.out.println("I'm a Rubber Duck");

  }

  public void quack() {
    System.out.println("I'm Squeeking");
  }

}