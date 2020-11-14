package com.designpatterns.behavioral.strategy.simuduck2;

/* Problem in this design : Duplicate code !! */

public class MiniDuckSimulator {

    public static void main(String[] args) {

        MallardDuck mallard = new MallardDuck();
        mallard.display();
        mallard.fly();
        mallard.quack();
        mallard.swim();

        System.out.println();

        RedHeadDuck redhead = new RedHeadDuck();
        redhead.display();
        redhead.fly();
        redhead.quack();
        redhead.swim();

        System.out.println();

        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.display();
        // rubberDuck.fly(); // A Rubber Duck is not supposed to fly !!
        rubberDuck.quack(); // A Rubber Duck doesn't quack, it squeeks !!
        rubberDuck.swim();

    }

}