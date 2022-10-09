package com.codecafe.designpatterns.structural.adapter.example1;

public class Main {

  public static void main(String[] args) {
    Duck duck = new MallardDuck();

    Turkey turkey = new WildTurkey();

    Duck turkeyAdapter = new TurkeyAdapter(turkey);

    System.out.println("Duck says: ");
    testDuck(duck);

    System.out.println("\nTurkey says: ");
    turkey.gobble();
    turkey.fly();

    System.out.println("\nTurkeyAdapter says: ");
    testDuck(turkeyAdapter);
  }

  public static void testDuck(Duck duck) {
    duck.quack();
    duck.fly();
  }

}