package com.codecafe.designpatterns.behavioral.strategy.simuduck3;

public class MiniDuckSimulator {

  public static void main(String[] args) {
    Duck mallard = new MallardDuck();
    mallard.display();
    mallard.performQuack();
    mallard.performFly();
    mallard.swim();

    System.out.println();

    Duck redhead = new RedHeadDuck();
    redhead.display();
    redhead.performQuack();
    redhead.performFly();
    redhead.swim();

    System.out.println();

    Duck rubberDuck = new RubberDuck();
    rubberDuck.display();
    rubberDuck.performQuack(); // A Rubber Duck is not supposed to fly !!
    rubberDuck.performFly(); // A Rubber Duck doesn't quack, it squeeks !!
    rubberDuck.swim();
  }

}