package com.designpatterns.behavioral.strategy.simuduck3;

public class MuteQuack implements QuackBehavior {

    public void quack() {
        System.out.println("<< Silence >>");
    }

}