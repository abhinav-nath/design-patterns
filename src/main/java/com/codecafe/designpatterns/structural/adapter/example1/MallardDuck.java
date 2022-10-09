package com.codecafe.designpatterns.structural.adapter.example1;

public class MallardDuck implements Duck {

  @Override
  public void quack() {
    System.out.println("Quack");
  }

  @Override
  public void fly() {
    System.out.println("I'm flying");
  }

}